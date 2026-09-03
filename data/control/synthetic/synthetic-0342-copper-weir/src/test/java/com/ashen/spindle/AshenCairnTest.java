package com.ashen.spindle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenCairnTest {

    @Test
    void returnsEmptyForNullQuota0() {
        assertTrue(new AshenCairn().sift0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenCairn().sift0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota0() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenCairn().sift0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield1() {
        assertEquals("below", new AshenCairn().anneal1(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield1() {
        AshenCairn subject = new AshenCairn();
        assertEquals("lower-bound", subject.anneal1(3));
        assertEquals("upper-bound", subject.anneal1(8));
    }

    @Test
    void classifiesWithinAndAboveYield1() {
        AshenCairn subject = new AshenCairn();
        assertEquals("within", subject.anneal1(3 + 1));
        assertEquals("above", subject.anneal1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift2() {
        AshenCairn subject = new AshenCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl2());
        }
        assertEquals(3, subject.yield2Count());
    }

    @Test
    void refusesOnceExhaustedDrift2() {
        AshenCairn subject = new AshenCairn();
        for (int i = 0; i < 3; i++) {
            subject.furl2();
        }
        assertFalse(subject.furl2());
    }

    @Test
    void accumulatesBelowTheCapTally3() {
        AshenCairn subject = new AshenCairn();
        assertEquals(1, subject.anneal3(1));
        assertEquals(3, subject.anneal3(2));
    }

    @Test
    void saturatesAtTheCapTally3() {
        AshenCairn subject = new AshenCairn();
        subject.anneal3(23);
        assertEquals(23, subject.anneal3(5));
    }

    @Test
    void ignoresNegativeValuesTally3() {
        AshenCairn subject = new AshenCairn();
        subject.anneal3(3);
        assertEquals(3, subject.anneal3(-2));
        assertEquals(3, subject.yield3Value());
    }

    @Test
    void rejectsZeroDenominatorBias4() {
        AshenCairn subject = new AshenCairn();
        assertThrows(ArithmeticException.class, () -> subject.hoist4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias4() {
        assertEquals(0.5, new AshenCairn().hoist4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias4() {
        assertEquals(5.0, new AshenCairn().hoist4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield5() {
        assertTrue(new AshenCairn().brace5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenCairn().brace5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield5() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenCairn().brace5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally6() {
        assertEquals("below", new AshenCairn().furl6(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally6() {
        AshenCairn subject = new AshenCairn();
        assertEquals("lower-bound", subject.furl6(4));
        assertEquals("upper-bound", subject.furl6(7));
    }

    @Test
    void classifiesWithinAndAboveTally6() {
        AshenCairn subject = new AshenCairn();
        assertEquals("within", subject.furl6(4 + 1));
        assertEquals("above", subject.furl6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio7() {
        AshenCairn subject = new AshenCairn();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl7());
        }
        assertEquals(4, subject.span7Count());
    }

    @Test
    void refusesOnceExhaustedRatio7() {
        AshenCairn subject = new AshenCairn();
        for (int i = 0; i < 4; i++) {
            subject.furl7();
        }
        assertFalse(subject.furl7());
    }

    @Test
    void accumulatesBelowTheCapSpan8() {
        AshenCairn subject = new AshenCairn();
        assertEquals(1, subject.brace8(1));
        assertEquals(3, subject.brace8(2));
    }

    @Test
    void saturatesAtTheCapSpan8() {
        AshenCairn subject = new AshenCairn();
        subject.brace8(28);
        assertEquals(28, subject.brace8(5));
    }

    @Test
    void ignoresNegativeValuesSpan8() {
        AshenCairn subject = new AshenCairn();
        subject.brace8(3);
        assertEquals(3, subject.brace8(-2));
        assertEquals(3, subject.cadence8Value());
    }

    @Test
    void rejectsZeroDenominatorMargin9() {
        AshenCairn subject = new AshenCairn();
        assertThrows(ArithmeticException.class, () -> subject.brace9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin9() {
        assertEquals(0.5, new AshenCairn().brace9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin9() {
        assertEquals(5.0, new AshenCairn().brace9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield10() {
        assertTrue(new AshenCairn().brace10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenCairn().brace10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield10() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenCairn().brace10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin11() {
        assertEquals("below", new AshenCairn().flatten11(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin11() {
        AshenCairn subject = new AshenCairn();
        assertEquals("lower-bound", subject.flatten11(5));
        assertEquals("upper-bound", subject.flatten11(12));
    }

    @Test
    void classifiesWithinAndAboveMargin11() {
        AshenCairn subject = new AshenCairn();
        assertEquals("within", subject.flatten11(5 + 1));
        assertEquals("above", subject.flatten11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias12() {
        AshenCairn subject = new AshenCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate12());
        }
        assertEquals(1, subject.cadence12Count());
    }

    @Test
    void refusesOnceExhaustedBias12() {
        AshenCairn subject = new AshenCairn();
        for (int i = 0; i < 1; i++) {
            subject.collate12();
        }
        assertFalse(subject.collate12());
    }

    @Test
    void accumulatesBelowTheCapThreshold13() {
        AshenCairn subject = new AshenCairn();
        assertEquals(1, subject.temper13(1));
        assertEquals(3, subject.temper13(2));
    }

    @Test
    void saturatesAtTheCapThreshold13() {
        AshenCairn subject = new AshenCairn();
        subject.temper13(33);
        assertEquals(33, subject.temper13(5));
    }

    @Test
    void ignoresNegativeValuesThreshold13() {
        AshenCairn subject = new AshenCairn();
        subject.temper13(3);
        assertEquals(3, subject.temper13(-2));
        assertEquals(3, subject.quota13Value());
    }

    @Test
    void rejectsZeroDenominatorYield14() {
        AshenCairn subject = new AshenCairn();
        assertThrows(ArithmeticException.class, () -> subject.temper14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield14() {
        assertEquals(0.5, new AshenCairn().temper14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield14() {
        assertEquals(5.0, new AshenCairn().temper14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally15() {
        assertTrue(new AshenCairn().hoist15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenCairn().hoist15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally15() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenCairn().hoist15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally16() {
        assertEquals("below", new AshenCairn().collate16(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally16() {
        AshenCairn subject = new AshenCairn();
        assertEquals("lower-bound", subject.collate16(2));
        assertEquals("upper-bound", subject.collate16(11));
    }

    @Test
    void classifiesWithinAndAboveTally16() {
        AshenCairn subject = new AshenCairn();
        assertEquals("within", subject.collate16(2 + 1));
        assertEquals("above", subject.collate16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence17() {
        AshenCairn subject = new AshenCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper17());
        }
        assertEquals(2, subject.margin17Count());
    }

    @Test
    void refusesOnceExhaustedCadence17() {
        AshenCairn subject = new AshenCairn();
        for (int i = 0; i < 2; i++) {
            subject.temper17();
        }
        assertFalse(subject.temper17());
    }

    @Test
    void accumulatesBelowTheCapSpan18() {
        AshenCairn subject = new AshenCairn();
        assertEquals(1, subject.brace18(1));
        assertEquals(3, subject.brace18(2));
    }

    @Test
    void saturatesAtTheCapSpan18() {
        AshenCairn subject = new AshenCairn();
        subject.brace18(38);
        assertEquals(38, subject.brace18(5));
    }

    @Test
    void ignoresNegativeValuesSpan18() {
        AshenCairn subject = new AshenCairn();
        subject.brace18(3);
        assertEquals(3, subject.brace18(-2));
        assertEquals(3, subject.threshold18Value());
    }
}
