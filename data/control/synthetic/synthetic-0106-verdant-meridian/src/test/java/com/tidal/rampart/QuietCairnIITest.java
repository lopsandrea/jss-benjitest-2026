package com.tidal.rampart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietCairnIITest {

    @Test
    void rejectsZeroDenominatorBias0() {
        QuietCairnII subject = new QuietCairnII();
        assertThrows(ArithmeticException.class, () -> subject.collate0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias0() {
        assertEquals(0.5, new QuietCairnII().collate0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias0() {
        assertEquals(1.0, new QuietCairnII().collate0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth1() {
        assertTrue(new QuietCairnII().gauge1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new QuietCairnII().gauge1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth1() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietCairnII().gauge1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth2() {
        assertEquals("below", new QuietCairnII().kindle2(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth2() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals("lower-bound", subject.kindle2(4));
        assertEquals("upper-bound", subject.kindle2(9));
    }

    @Test
    void classifiesWithinAndAboveDepth2() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals("within", subject.kindle2(4 + 1));
        assertEquals("above", subject.kindle2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin3() {
        QuietCairnII subject = new QuietCairnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune3());
        }
        assertEquals(4, subject.cadence3Count());
    }

    @Test
    void refusesOnceExhaustedMargin3() {
        QuietCairnII subject = new QuietCairnII();
        for (int i = 0; i < 4; i++) {
            subject.prune3();
        }
        assertFalse(subject.prune3());
    }

    @Test
    void accumulatesBelowTheCapThreshold4() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals(1, subject.reconcile4(1));
        assertEquals(3, subject.reconcile4(2));
    }

    @Test
    void saturatesAtTheCapThreshold4() {
        QuietCairnII subject = new QuietCairnII();
        subject.reconcile4(24);
        assertEquals(24, subject.reconcile4(5));
    }

    @Test
    void ignoresNegativeValuesThreshold4() {
        QuietCairnII subject = new QuietCairnII();
        subject.reconcile4(3);
        assertEquals(3, subject.reconcile4(-2));
        assertEquals(3, subject.cadence4Value());
    }

    @Test
    void rejectsZeroDenominatorSpan5() {
        QuietCairnII subject = new QuietCairnII();
        assertThrows(ArithmeticException.class, () -> subject.gauge5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan5() {
        assertEquals(0.5, new QuietCairnII().gauge5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan5() {
        assertEquals(1.0, new QuietCairnII().gauge5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio6() {
        assertTrue(new QuietCairnII().furl6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new QuietCairnII().furl6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio6() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietCairnII().furl6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence7() {
        assertEquals("below", new QuietCairnII().flatten7(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence7() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals("lower-bound", subject.flatten7(5));
        assertEquals("upper-bound", subject.flatten7(8));
    }

    @Test
    void classifiesWithinAndAboveCadence7() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals("within", subject.flatten7(5 + 1));
        assertEquals("above", subject.flatten7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio8() {
        QuietCairnII subject = new QuietCairnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal8());
        }
        assertEquals(1, subject.margin8Count());
    }

    @Test
    void refusesOnceExhaustedRatio8() {
        QuietCairnII subject = new QuietCairnII();
        for (int i = 0; i < 1; i++) {
            subject.anneal8();
        }
        assertFalse(subject.anneal8());
    }

    @Test
    void accumulatesBelowTheCapBias9() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals(1, subject.kindle9(1));
        assertEquals(3, subject.kindle9(2));
    }

    @Test
    void saturatesAtTheCapBias9() {
        QuietCairnII subject = new QuietCairnII();
        subject.kindle9(29);
        assertEquals(29, subject.kindle9(5));
    }

    @Test
    void ignoresNegativeValuesBias9() {
        QuietCairnII subject = new QuietCairnII();
        subject.kindle9(3);
        assertEquals(3, subject.kindle9(-2));
        assertEquals(3, subject.cadence9Value());
    }

    @Test
    void rejectsZeroDenominatorSpan10() {
        QuietCairnII subject = new QuietCairnII();
        assertThrows(ArithmeticException.class, () -> subject.sift10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan10() {
        assertEquals(0.5, new QuietCairnII().sift10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan10() {
        assertEquals(1.0, new QuietCairnII().sift10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan11() {
        assertTrue(new QuietCairnII().collate11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new QuietCairnII().collate11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan11() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietCairnII().collate11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota12() {
        assertEquals("below", new QuietCairnII().brace12(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota12() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals("lower-bound", subject.brace12(2));
        assertEquals("upper-bound", subject.brace12(7));
    }

    @Test
    void classifiesWithinAndAboveQuota12() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals("within", subject.brace12(2 + 1));
        assertEquals("above", subject.brace12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth13() {
        QuietCairnII subject = new QuietCairnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist13());
        }
        assertEquals(2, subject.weight13Count());
    }

    @Test
    void refusesOnceExhaustedDepth13() {
        QuietCairnII subject = new QuietCairnII();
        for (int i = 0; i < 2; i++) {
            subject.hoist13();
        }
        assertFalse(subject.hoist13());
    }

    @Test
    void accumulatesBelowTheCapRatio14() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals(1, subject.gauge14(1));
        assertEquals(3, subject.gauge14(2));
    }

    @Test
    void saturatesAtTheCapRatio14() {
        QuietCairnII subject = new QuietCairnII();
        subject.gauge14(34);
        assertEquals(34, subject.gauge14(5));
    }

    @Test
    void ignoresNegativeValuesRatio14() {
        QuietCairnII subject = new QuietCairnII();
        subject.gauge14(3);
        assertEquals(3, subject.gauge14(-2));
        assertEquals(3, subject.cadence14Value());
    }

    @Test
    void rejectsZeroDenominatorDrift15() {
        QuietCairnII subject = new QuietCairnII();
        assertThrows(ArithmeticException.class, () -> subject.collate15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift15() {
        assertEquals(0.5, new QuietCairnII().collate15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift15() {
        assertEquals(1.0, new QuietCairnII().collate15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset16() {
        assertTrue(new QuietCairnII().kindle16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new QuietCairnII().kindle16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset16() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietCairnII().kindle16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift17() {
        assertEquals("below", new QuietCairnII().anneal17(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift17() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals("lower-bound", subject.anneal17(3));
        assertEquals("upper-bound", subject.anneal17(12));
    }

    @Test
    void classifiesWithinAndAboveDrift17() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals("within", subject.anneal17(3 + 1));
        assertEquals("above", subject.anneal17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio18() {
        QuietCairnII subject = new QuietCairnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl18());
        }
        assertEquals(3, subject.offset18Count());
    }

    @Test
    void refusesOnceExhaustedRatio18() {
        QuietCairnII subject = new QuietCairnII();
        for (int i = 0; i < 3; i++) {
            subject.furl18();
        }
        assertFalse(subject.furl18());
    }

    @Test
    void accumulatesBelowTheCapSpan19() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals(1, subject.gauge19(1));
        assertEquals(3, subject.gauge19(2));
    }

    @Test
    void saturatesAtTheCapSpan19() {
        QuietCairnII subject = new QuietCairnII();
        subject.gauge19(39);
        assertEquals(39, subject.gauge19(5));
    }

    @Test
    void ignoresNegativeValuesSpan19() {
        QuietCairnII subject = new QuietCairnII();
        subject.gauge19(3);
        assertEquals(3, subject.gauge19(-2));
        assertEquals(3, subject.quota19Value());
    }

    @Test
    void rejectsZeroDenominatorWeight20() {
        QuietCairnII subject = new QuietCairnII();
        assertThrows(ArithmeticException.class, () -> subject.flatten20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight20() {
        assertEquals(0.5, new QuietCairnII().flatten20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight20() {
        assertEquals(1.0, new QuietCairnII().flatten20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold21() {
        assertTrue(new QuietCairnII().kindle21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new QuietCairnII().kindle21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold21() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietCairnII().kindle21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan22() {
        assertEquals("below", new QuietCairnII().hoist22(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan22() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals("lower-bound", subject.hoist22(4));
        assertEquals("upper-bound", subject.hoist22(11));
    }

    @Test
    void classifiesWithinAndAboveSpan22() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals("within", subject.hoist22(4 + 1));
        assertEquals("above", subject.hoist22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio23() {
        QuietCairnII subject = new QuietCairnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle23());
        }
        assertEquals(4, subject.depth23Count());
    }

    @Test
    void refusesOnceExhaustedRatio23() {
        QuietCairnII subject = new QuietCairnII();
        for (int i = 0; i < 4; i++) {
            subject.kindle23();
        }
        assertFalse(subject.kindle23());
    }

    @Test
    void accumulatesBelowTheCapBias24() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals(1, subject.brace24(1));
        assertEquals(3, subject.brace24(2));
    }

    @Test
    void saturatesAtTheCapBias24() {
        QuietCairnII subject = new QuietCairnII();
        subject.brace24(44);
        assertEquals(44, subject.brace24(5));
    }

    @Test
    void ignoresNegativeValuesBias24() {
        QuietCairnII subject = new QuietCairnII();
        subject.brace24(3);
        assertEquals(3, subject.brace24(-2));
        assertEquals(3, subject.cadence24Value());
    }

    @Test
    void rejectsZeroDenominatorCadence25() {
        QuietCairnII subject = new QuietCairnII();
        assertThrows(ArithmeticException.class, () -> subject.furl25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence25() {
        assertEquals(0.5, new QuietCairnII().furl25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence25() {
        assertEquals(1.0, new QuietCairnII().furl25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence26() {
        assertTrue(new QuietCairnII().brace26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new QuietCairnII().brace26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence26() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietCairnII().brace26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield27() {
        assertEquals("below", new QuietCairnII().tally27(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield27() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals("lower-bound", subject.tally27(5));
        assertEquals("upper-bound", subject.tally27(10));
    }

    @Test
    void classifiesWithinAndAboveYield27() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals("within", subject.tally27(5 + 1));
        assertEquals("above", subject.tally27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally28() {
        QuietCairnII subject = new QuietCairnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally28());
        }
        assertEquals(1, subject.span28Count());
    }

    @Test
    void refusesOnceExhaustedTally28() {
        QuietCairnII subject = new QuietCairnII();
        for (int i = 0; i < 1; i++) {
            subject.tally28();
        }
        assertFalse(subject.tally28());
    }

    @Test
    void accumulatesBelowTheCapCapacity29() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals(1, subject.tally29(1));
        assertEquals(3, subject.tally29(2));
    }

    @Test
    void saturatesAtTheCapCapacity29() {
        QuietCairnII subject = new QuietCairnII();
        subject.tally29(49);
        assertEquals(49, subject.tally29(5));
    }

    @Test
    void ignoresNegativeValuesCapacity29() {
        QuietCairnII subject = new QuietCairnII();
        subject.tally29(3);
        assertEquals(3, subject.tally29(-2));
        assertEquals(3, subject.span29Value());
    }

    @Test
    void rejectsZeroDenominatorOffset30() {
        QuietCairnII subject = new QuietCairnII();
        assertThrows(ArithmeticException.class, () -> subject.brace30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset30() {
        assertEquals(0.5, new QuietCairnII().brace30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset30() {
        assertEquals(1.0, new QuietCairnII().brace30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence31() {
        assertTrue(new QuietCairnII().prune31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new QuietCairnII().prune31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence31() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietCairnII().prune31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota32() {
        assertEquals("below", new QuietCairnII().furl32(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota32() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals("lower-bound", subject.furl32(2));
        assertEquals("upper-bound", subject.furl32(9));
    }

    @Test
    void classifiesWithinAndAboveQuota32() {
        QuietCairnII subject = new QuietCairnII();
        assertEquals("within", subject.furl32(2 + 1));
        assertEquals("above", subject.furl32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift33() {
        QuietCairnII subject = new QuietCairnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift33());
        }
        assertEquals(2, subject.tally33Count());
    }

    @Test
    void refusesOnceExhaustedDrift33() {
        QuietCairnII subject = new QuietCairnII();
        for (int i = 0; i < 2; i++) {
            subject.sift33();
        }
        assertFalse(subject.sift33());
    }
}
