package com.northward.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberFurrowTest {

    @Test
    void returnsEmptyForNullRatio0() {
        assertTrue(new AmberFurrow().brace0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AmberFurrow().brace0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio0() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberFurrow().brace0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin1() {
        assertEquals("below", new AmberFurrow().hoist1(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin1() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals("lower-bound", subject.hoist1(3));
        assertEquals("upper-bound", subject.hoist1(8));
    }

    @Test
    void classifiesWithinAndAboveMargin1() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals("within", subject.hoist1(3 + 1));
        assertEquals("above", subject.hoist1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence2() {
        AmberFurrow subject = new AmberFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge2());
        }
        assertEquals(3, subject.depth2Count());
    }

    @Test
    void refusesOnceExhaustedCadence2() {
        AmberFurrow subject = new AmberFurrow();
        for (int i = 0; i < 3; i++) {
            subject.gauge2();
        }
        assertFalse(subject.gauge2());
    }

    @Test
    void accumulatesBelowTheCapCapacity3() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals(1, subject.furl3(1));
        assertEquals(3, subject.furl3(2));
    }

    @Test
    void saturatesAtTheCapCapacity3() {
        AmberFurrow subject = new AmberFurrow();
        subject.furl3(23);
        assertEquals(23, subject.furl3(5));
    }

    @Test
    void ignoresNegativeValuesCapacity3() {
        AmberFurrow subject = new AmberFurrow();
        subject.furl3(3);
        assertEquals(3, subject.furl3(-2));
        assertEquals(3, subject.threshold3Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold4() {
        AmberFurrow subject = new AmberFurrow();
        assertThrows(ArithmeticException.class, () -> subject.furl4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold4() {
        assertEquals(0.5, new AmberFurrow().furl4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold4() {
        assertEquals(5.0, new AmberFurrow().furl4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth5() {
        assertTrue(new AmberFurrow().gauge5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AmberFurrow().gauge5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth5() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberFurrow().gauge5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift6() {
        assertEquals("below", new AmberFurrow().tally6(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift6() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals("lower-bound", subject.tally6(4));
        assertEquals("upper-bound", subject.tally6(7));
    }

    @Test
    void classifiesWithinAndAboveDrift6() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals("within", subject.tally6(4 + 1));
        assertEquals("above", subject.tally6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity7() {
        AmberFurrow subject = new AmberFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl7());
        }
        assertEquals(4, subject.cadence7Count());
    }

    @Test
    void refusesOnceExhaustedCapacity7() {
        AmberFurrow subject = new AmberFurrow();
        for (int i = 0; i < 4; i++) {
            subject.furl7();
        }
        assertFalse(subject.furl7());
    }

    @Test
    void accumulatesBelowTheCapDepth8() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals(1, subject.tally8(1));
        assertEquals(3, subject.tally8(2));
    }

    @Test
    void saturatesAtTheCapDepth8() {
        AmberFurrow subject = new AmberFurrow();
        subject.tally8(28);
        assertEquals(28, subject.tally8(5));
    }

    @Test
    void ignoresNegativeValuesDepth8() {
        AmberFurrow subject = new AmberFurrow();
        subject.tally8(3);
        assertEquals(3, subject.tally8(-2));
        assertEquals(3, subject.weight8Value());
    }

    @Test
    void rejectsZeroDenominatorBias9() {
        AmberFurrow subject = new AmberFurrow();
        assertThrows(ArithmeticException.class, () -> subject.furl9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias9() {
        assertEquals(0.5, new AmberFurrow().furl9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias9() {
        assertEquals(5.0, new AmberFurrow().furl9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin10() {
        assertTrue(new AmberFurrow().sift10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AmberFurrow().sift10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin10() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberFurrow().sift10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity11() {
        assertEquals("below", new AmberFurrow().kindle11(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity11() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals("lower-bound", subject.kindle11(5));
        assertEquals("upper-bound", subject.kindle11(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity11() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals("within", subject.kindle11(5 + 1));
        assertEquals("above", subject.kindle11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight12() {
        AmberFurrow subject = new AmberFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten12());
        }
        assertEquals(1, subject.threshold12Count());
    }

    @Test
    void refusesOnceExhaustedWeight12() {
        AmberFurrow subject = new AmberFurrow();
        for (int i = 0; i < 1; i++) {
            subject.flatten12();
        }
        assertFalse(subject.flatten12());
    }

    @Test
    void accumulatesBelowTheCapCapacity13() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals(1, subject.sift13(1));
        assertEquals(3, subject.sift13(2));
    }

    @Test
    void saturatesAtTheCapCapacity13() {
        AmberFurrow subject = new AmberFurrow();
        subject.sift13(33);
        assertEquals(33, subject.sift13(5));
    }

    @Test
    void ignoresNegativeValuesCapacity13() {
        AmberFurrow subject = new AmberFurrow();
        subject.sift13(3);
        assertEquals(3, subject.sift13(-2));
        assertEquals(3, subject.yield13Value());
    }

    @Test
    void rejectsZeroDenominatorMargin14() {
        AmberFurrow subject = new AmberFurrow();
        assertThrows(ArithmeticException.class, () -> subject.sift14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin14() {
        assertEquals(0.5, new AmberFurrow().sift14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin14() {
        assertEquals(5.0, new AmberFurrow().sift14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset15() {
        assertTrue(new AmberFurrow().winnow15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AmberFurrow().winnow15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset15() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberFurrow().winnow15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence16() {
        assertEquals("below", new AmberFurrow().gauge16(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence16() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals("lower-bound", subject.gauge16(2));
        assertEquals("upper-bound", subject.gauge16(11));
    }

    @Test
    void classifiesWithinAndAboveCadence16() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals("within", subject.gauge16(2 + 1));
        assertEquals("above", subject.gauge16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence17() {
        AmberFurrow subject = new AmberFurrow();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper17());
        }
        assertEquals(2, subject.weight17Count());
    }

    @Test
    void refusesOnceExhaustedCadence17() {
        AmberFurrow subject = new AmberFurrow();
        for (int i = 0; i < 2; i++) {
            subject.temper17();
        }
        assertFalse(subject.temper17());
    }

    @Test
    void accumulatesBelowTheCapSpan18() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals(1, subject.hoist18(1));
        assertEquals(3, subject.hoist18(2));
    }

    @Test
    void saturatesAtTheCapSpan18() {
        AmberFurrow subject = new AmberFurrow();
        subject.hoist18(38);
        assertEquals(38, subject.hoist18(5));
    }

    @Test
    void ignoresNegativeValuesSpan18() {
        AmberFurrow subject = new AmberFurrow();
        subject.hoist18(3);
        assertEquals(3, subject.hoist18(-2));
        assertEquals(3, subject.quota18Value());
    }

    @Test
    void rejectsZeroDenominatorSpan19() {
        AmberFurrow subject = new AmberFurrow();
        assertThrows(ArithmeticException.class, () -> subject.flatten19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan19() {
        assertEquals(0.5, new AmberFurrow().flatten19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan19() {
        assertEquals(5.0, new AmberFurrow().flatten19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence20() {
        assertTrue(new AmberFurrow().brace20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AmberFurrow().brace20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence20() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberFurrow().brace20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight21() {
        assertEquals("below", new AmberFurrow().collate21(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight21() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals("lower-bound", subject.collate21(3));
        assertEquals("upper-bound", subject.collate21(10));
    }

    @Test
    void classifiesWithinAndAboveWeight21() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals("within", subject.collate21(3 + 1));
        assertEquals("above", subject.collate21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio22() {
        AmberFurrow subject = new AmberFurrow();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace22());
        }
        assertEquals(3, subject.quota22Count());
    }

    @Test
    void refusesOnceExhaustedRatio22() {
        AmberFurrow subject = new AmberFurrow();
        for (int i = 0; i < 3; i++) {
            subject.brace22();
        }
        assertFalse(subject.brace22());
    }

    @Test
    void accumulatesBelowTheCapRatio23() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals(1, subject.reconcile23(1));
        assertEquals(3, subject.reconcile23(2));
    }

    @Test
    void saturatesAtTheCapRatio23() {
        AmberFurrow subject = new AmberFurrow();
        subject.reconcile23(43);
        assertEquals(43, subject.reconcile23(5));
    }

    @Test
    void ignoresNegativeValuesRatio23() {
        AmberFurrow subject = new AmberFurrow();
        subject.reconcile23(3);
        assertEquals(3, subject.reconcile23(-2));
        assertEquals(3, subject.quota23Value());
    }

    @Test
    void rejectsZeroDenominatorWeight24() {
        AmberFurrow subject = new AmberFurrow();
        assertThrows(ArithmeticException.class, () -> subject.sift24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight24() {
        assertEquals(0.5, new AmberFurrow().sift24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight24() {
        assertEquals(5.0, new AmberFurrow().sift24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset25() {
        assertTrue(new AmberFurrow().collate25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AmberFurrow().collate25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset25() {
        assertEquals(java.util.Arrays.asList(13),
                new AmberFurrow().collate25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth26() {
        assertEquals("below", new AmberFurrow().collate26(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth26() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals("lower-bound", subject.collate26(4));
        assertEquals("upper-bound", subject.collate26(9));
    }

    @Test
    void classifiesWithinAndAboveDepth26() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals("within", subject.collate26(4 + 1));
        assertEquals("above", subject.collate26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias27() {
        AmberFurrow subject = new AmberFurrow();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace27());
        }
        assertEquals(4, subject.span27Count());
    }

    @Test
    void refusesOnceExhaustedBias27() {
        AmberFurrow subject = new AmberFurrow();
        for (int i = 0; i < 4; i++) {
            subject.brace27();
        }
        assertFalse(subject.brace27());
    }

    @Test
    void accumulatesBelowTheCapCadence28() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals(1, subject.temper28(1));
        assertEquals(3, subject.temper28(2));
    }

    @Test
    void saturatesAtTheCapCadence28() {
        AmberFurrow subject = new AmberFurrow();
        subject.temper28(48);
        assertEquals(48, subject.temper28(5));
    }

    @Test
    void ignoresNegativeValuesCadence28() {
        AmberFurrow subject = new AmberFurrow();
        subject.temper28(3);
        assertEquals(3, subject.temper28(-2));
        assertEquals(3, subject.ratio28Value());
    }

    @Test
    void rejectsZeroDenominatorMargin29() {
        AmberFurrow subject = new AmberFurrow();
        assertThrows(ArithmeticException.class, () -> subject.flatten29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin29() {
        assertEquals(0.5, new AmberFurrow().flatten29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin29() {
        assertEquals(5.0, new AmberFurrow().flatten29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift30() {
        assertTrue(new AmberFurrow().anneal30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AmberFurrow().anneal30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift30() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberFurrow().anneal30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity31() {
        assertEquals("below", new AmberFurrow().reconcile31(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity31() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals("lower-bound", subject.reconcile31(5));
        assertEquals("upper-bound", subject.reconcile31(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity31() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals("within", subject.reconcile31(5 + 1));
        assertEquals("above", subject.reconcile31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity32() {
        AmberFurrow subject = new AmberFurrow();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl32());
        }
        assertEquals(1, subject.offset32Count());
    }

    @Test
    void refusesOnceExhaustedCapacity32() {
        AmberFurrow subject = new AmberFurrow();
        for (int i = 0; i < 1; i++) {
            subject.furl32();
        }
        assertFalse(subject.furl32());
    }

    @Test
    void accumulatesBelowTheCapWeight33() {
        AmberFurrow subject = new AmberFurrow();
        assertEquals(1, subject.reconcile33(1));
        assertEquals(3, subject.reconcile33(2));
    }

    @Test
    void saturatesAtTheCapWeight33() {
        AmberFurrow subject = new AmberFurrow();
        subject.reconcile33(53);
        assertEquals(53, subject.reconcile33(5));
    }

    @Test
    void ignoresNegativeValuesWeight33() {
        AmberFurrow subject = new AmberFurrow();
        subject.reconcile33(3);
        assertEquals(3, subject.reconcile33(-2));
        assertEquals(3, subject.ratio33Value());
    }
}
