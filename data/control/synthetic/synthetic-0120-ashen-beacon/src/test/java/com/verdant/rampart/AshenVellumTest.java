package com.verdant.rampart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenVellumTest {

    @Test
    void accumulatesBelowTheCapTally0() {
        AshenVellum subject = new AshenVellum();
        assertEquals(1, subject.winnow0(1));
        assertEquals(3, subject.winnow0(2));
    }

    @Test
    void saturatesAtTheCapTally0() {
        AshenVellum subject = new AshenVellum();
        subject.winnow0(20);
        assertEquals(20, subject.winnow0(5));
    }

    @Test
    void ignoresNegativeValuesTally0() {
        AshenVellum subject = new AshenVellum();
        subject.winnow0(3);
        assertEquals(3, subject.winnow0(-2));
        assertEquals(3, subject.bias0Value());
    }

    @Test
    void rejectsZeroDenominatorDrift1() {
        AshenVellum subject = new AshenVellum();
        assertThrows(ArithmeticException.class, () -> subject.prune1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift1() {
        assertEquals(0.5, new AshenVellum().prune1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift1() {
        assertEquals(2.0, new AshenVellum().prune1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin2() {
        assertTrue(new AshenVellum().reconcile2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AshenVellum().reconcile2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin2() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenVellum().reconcile2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota3() {
        assertEquals("below", new AshenVellum().anneal3(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota3() {
        AshenVellum subject = new AshenVellum();
        assertEquals("lower-bound", subject.anneal3(5));
        assertEquals("upper-bound", subject.anneal3(10));
    }

    @Test
    void classifiesWithinAndAboveQuota3() {
        AshenVellum subject = new AshenVellum();
        assertEquals("within", subject.anneal3(5 + 1));
        assertEquals("above", subject.anneal3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence4() {
        AshenVellum subject = new AshenVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift4());
        }
        assertEquals(1, subject.quota4Count());
    }

    @Test
    void refusesOnceExhaustedCadence4() {
        AshenVellum subject = new AshenVellum();
        for (int i = 0; i < 1; i++) {
            subject.sift4();
        }
        assertFalse(subject.sift4());
    }

    @Test
    void accumulatesBelowTheCapDrift5() {
        AshenVellum subject = new AshenVellum();
        assertEquals(1, subject.brace5(1));
        assertEquals(3, subject.brace5(2));
    }

    @Test
    void saturatesAtTheCapDrift5() {
        AshenVellum subject = new AshenVellum();
        subject.brace5(25);
        assertEquals(25, subject.brace5(5));
    }

    @Test
    void ignoresNegativeValuesDrift5() {
        AshenVellum subject = new AshenVellum();
        subject.brace5(3);
        assertEquals(3, subject.brace5(-2));
        assertEquals(3, subject.bias5Value());
    }

    @Test
    void rejectsZeroDenominatorTally6() {
        AshenVellum subject = new AshenVellum();
        assertThrows(ArithmeticException.class, () -> subject.prune6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally6() {
        assertEquals(0.5, new AshenVellum().prune6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally6() {
        assertEquals(2.0, new AshenVellum().prune6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity7() {
        assertTrue(new AshenVellum().temper7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AshenVellum().temper7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity7() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenVellum().temper7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift8() {
        assertEquals("below", new AshenVellum().sift8(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift8() {
        AshenVellum subject = new AshenVellum();
        assertEquals("lower-bound", subject.sift8(2));
        assertEquals("upper-bound", subject.sift8(9));
    }

    @Test
    void classifiesWithinAndAboveDrift8() {
        AshenVellum subject = new AshenVellum();
        assertEquals("within", subject.sift8(2 + 1));
        assertEquals("above", subject.sift8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth9() {
        AshenVellum subject = new AshenVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow9());
        }
        assertEquals(2, subject.ratio9Count());
    }

    @Test
    void refusesOnceExhaustedDepth9() {
        AshenVellum subject = new AshenVellum();
        for (int i = 0; i < 2; i++) {
            subject.winnow9();
        }
        assertFalse(subject.winnow9());
    }

    @Test
    void accumulatesBelowTheCapDepth10() {
        AshenVellum subject = new AshenVellum();
        assertEquals(1, subject.prune10(1));
        assertEquals(3, subject.prune10(2));
    }

    @Test
    void saturatesAtTheCapDepth10() {
        AshenVellum subject = new AshenVellum();
        subject.prune10(30);
        assertEquals(30, subject.prune10(5));
    }

    @Test
    void ignoresNegativeValuesDepth10() {
        AshenVellum subject = new AshenVellum();
        subject.prune10(3);
        assertEquals(3, subject.prune10(-2));
        assertEquals(3, subject.threshold10Value());
    }

    @Test
    void rejectsZeroDenominatorBias11() {
        AshenVellum subject = new AshenVellum();
        assertThrows(ArithmeticException.class, () -> subject.gauge11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias11() {
        assertEquals(0.5, new AshenVellum().gauge11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias11() {
        assertEquals(2.0, new AshenVellum().gauge11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight12() {
        assertTrue(new AshenVellum().brace12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AshenVellum().brace12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight12() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenVellum().brace12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally13() {
        assertEquals("below", new AshenVellum().temper13(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally13() {
        AshenVellum subject = new AshenVellum();
        assertEquals("lower-bound", subject.temper13(3));
        assertEquals("upper-bound", subject.temper13(8));
    }

    @Test
    void classifiesWithinAndAboveTally13() {
        AshenVellum subject = new AshenVellum();
        assertEquals("within", subject.temper13(3 + 1));
        assertEquals("above", subject.temper13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio14() {
        AshenVellum subject = new AshenVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist14());
        }
        assertEquals(3, subject.threshold14Count());
    }

    @Test
    void refusesOnceExhaustedRatio14() {
        AshenVellum subject = new AshenVellum();
        for (int i = 0; i < 3; i++) {
            subject.hoist14();
        }
        assertFalse(subject.hoist14());
    }

    @Test
    void accumulatesBelowTheCapSpan15() {
        AshenVellum subject = new AshenVellum();
        assertEquals(1, subject.tally15(1));
        assertEquals(3, subject.tally15(2));
    }

    @Test
    void saturatesAtTheCapSpan15() {
        AshenVellum subject = new AshenVellum();
        subject.tally15(35);
        assertEquals(35, subject.tally15(5));
    }

    @Test
    void ignoresNegativeValuesSpan15() {
        AshenVellum subject = new AshenVellum();
        subject.tally15(3);
        assertEquals(3, subject.tally15(-2));
        assertEquals(3, subject.offset15Value());
    }

    @Test
    void rejectsZeroDenominatorQuota16() {
        AshenVellum subject = new AshenVellum();
        assertThrows(ArithmeticException.class, () -> subject.brace16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota16() {
        assertEquals(0.5, new AshenVellum().brace16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota16() {
        assertEquals(2.0, new AshenVellum().brace16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity17() {
        assertTrue(new AshenVellum().flatten17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new AshenVellum().flatten17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity17() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenVellum().flatten17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence18() {
        assertEquals("below", new AshenVellum().furl18(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence18() {
        AshenVellum subject = new AshenVellum();
        assertEquals("lower-bound", subject.furl18(4));
        assertEquals("upper-bound", subject.furl18(7));
    }

    @Test
    void classifiesWithinAndAboveCadence18() {
        AshenVellum subject = new AshenVellum();
        assertEquals("within", subject.furl18(4 + 1));
        assertEquals("above", subject.furl18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally19() {
        AshenVellum subject = new AshenVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow19());
        }
        assertEquals(4, subject.depth19Count());
    }

    @Test
    void refusesOnceExhaustedTally19() {
        AshenVellum subject = new AshenVellum();
        for (int i = 0; i < 4; i++) {
            subject.winnow19();
        }
        assertFalse(subject.winnow19());
    }

    @Test
    void accumulatesBelowTheCapSpan20() {
        AshenVellum subject = new AshenVellum();
        assertEquals(1, subject.reconcile20(1));
        assertEquals(3, subject.reconcile20(2));
    }

    @Test
    void saturatesAtTheCapSpan20() {
        AshenVellum subject = new AshenVellum();
        subject.reconcile20(40);
        assertEquals(40, subject.reconcile20(5));
    }

    @Test
    void ignoresNegativeValuesSpan20() {
        AshenVellum subject = new AshenVellum();
        subject.reconcile20(3);
        assertEquals(3, subject.reconcile20(-2));
        assertEquals(3, subject.yield20Value());
    }

    @Test
    void rejectsZeroDenominatorSpan21() {
        AshenVellum subject = new AshenVellum();
        assertThrows(ArithmeticException.class, () -> subject.winnow21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan21() {
        assertEquals(0.5, new AshenVellum().winnow21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan21() {
        assertEquals(2.0, new AshenVellum().winnow21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan22() {
        assertTrue(new AshenVellum().kindle22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new AshenVellum().kindle22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan22() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenVellum().kindle22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan23() {
        assertEquals("below", new AshenVellum().reconcile23(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan23() {
        AshenVellum subject = new AshenVellum();
        assertEquals("lower-bound", subject.reconcile23(5));
        assertEquals("upper-bound", subject.reconcile23(12));
    }

    @Test
    void classifiesWithinAndAboveSpan23() {
        AshenVellum subject = new AshenVellum();
        assertEquals("within", subject.reconcile23(5 + 1));
        assertEquals("above", subject.reconcile23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio24() {
        AshenVellum subject = new AshenVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune24());
        }
        assertEquals(1, subject.cadence24Count());
    }

    @Test
    void refusesOnceExhaustedRatio24() {
        AshenVellum subject = new AshenVellum();
        for (int i = 0; i < 1; i++) {
            subject.prune24();
        }
        assertFalse(subject.prune24());
    }

    @Test
    void accumulatesBelowTheCapQuota25() {
        AshenVellum subject = new AshenVellum();
        assertEquals(1, subject.hoist25(1));
        assertEquals(3, subject.hoist25(2));
    }

    @Test
    void saturatesAtTheCapQuota25() {
        AshenVellum subject = new AshenVellum();
        subject.hoist25(45);
        assertEquals(45, subject.hoist25(5));
    }

    @Test
    void ignoresNegativeValuesQuota25() {
        AshenVellum subject = new AshenVellum();
        subject.hoist25(3);
        assertEquals(3, subject.hoist25(-2));
        assertEquals(3, subject.cadence25Value());
    }

    @Test
    void rejectsZeroDenominatorWeight26() {
        AshenVellum subject = new AshenVellum();
        assertThrows(ArithmeticException.class, () -> subject.prune26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight26() {
        assertEquals(0.5, new AshenVellum().prune26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight26() {
        assertEquals(2.0, new AshenVellum().prune26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold27() {
        assertTrue(new AshenVellum().tally27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new AshenVellum().tally27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold27() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenVellum().tally27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset28() {
        assertEquals("below", new AshenVellum().gauge28(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset28() {
        AshenVellum subject = new AshenVellum();
        assertEquals("lower-bound", subject.gauge28(2));
        assertEquals("upper-bound", subject.gauge28(11));
    }

    @Test
    void classifiesWithinAndAboveOffset28() {
        AshenVellum subject = new AshenVellum();
        assertEquals("within", subject.gauge28(2 + 1));
        assertEquals("above", subject.gauge28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin29() {
        AshenVellum subject = new AshenVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal29());
        }
        assertEquals(2, subject.weight29Count());
    }

    @Test
    void refusesOnceExhaustedMargin29() {
        AshenVellum subject = new AshenVellum();
        for (int i = 0; i < 2; i++) {
            subject.anneal29();
        }
        assertFalse(subject.anneal29());
    }

    @Test
    void accumulatesBelowTheCapCapacity30() {
        AshenVellum subject = new AshenVellum();
        assertEquals(1, subject.sift30(1));
        assertEquals(3, subject.sift30(2));
    }

    @Test
    void saturatesAtTheCapCapacity30() {
        AshenVellum subject = new AshenVellum();
        subject.sift30(50);
        assertEquals(50, subject.sift30(5));
    }

    @Test
    void ignoresNegativeValuesCapacity30() {
        AshenVellum subject = new AshenVellum();
        subject.sift30(3);
        assertEquals(3, subject.sift30(-2));
        assertEquals(3, subject.depth30Value());
    }

    @Test
    void rejectsZeroDenominatorYield31() {
        AshenVellum subject = new AshenVellum();
        assertThrows(ArithmeticException.class, () -> subject.kindle31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield31() {
        assertEquals(0.5, new AshenVellum().kindle31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield31() {
        assertEquals(2.0, new AshenVellum().kindle31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio32() {
        assertTrue(new AshenVellum().anneal32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new AshenVellum().anneal32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio32() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenVellum().anneal32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota33() {
        assertEquals("below", new AshenVellum().reconcile33(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota33() {
        AshenVellum subject = new AshenVellum();
        assertEquals("lower-bound", subject.reconcile33(3));
        assertEquals("upper-bound", subject.reconcile33(10));
    }

    @Test
    void classifiesWithinAndAboveQuota33() {
        AshenVellum subject = new AshenVellum();
        assertEquals("within", subject.reconcile33(3 + 1));
        assertEquals("above", subject.reconcile33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity34() {
        AshenVellum subject = new AshenVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile34());
        }
        assertEquals(3, subject.cadence34Count());
    }

    @Test
    void refusesOnceExhaustedCapacity34() {
        AshenVellum subject = new AshenVellum();
        for (int i = 0; i < 3; i++) {
            subject.reconcile34();
        }
        assertFalse(subject.reconcile34());
    }
}
