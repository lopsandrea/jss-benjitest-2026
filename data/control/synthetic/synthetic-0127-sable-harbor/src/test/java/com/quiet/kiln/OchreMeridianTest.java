package com.quiet.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreMeridianTest {

    @Test
    void returnsEmptyForNullMargin0() {
        assertTrue(new OchreMeridian().furl0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new OchreMeridian().furl0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin0() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreMeridian().furl0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold1() {
        assertEquals("below", new OchreMeridian().sift1(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold1() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals("lower-bound", subject.sift1(3));
        assertEquals("upper-bound", subject.sift1(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold1() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals("within", subject.sift1(3 + 1));
        assertEquals("above", subject.sift1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio2() {
        OchreMeridian subject = new OchreMeridian();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate2());
        }
        assertEquals(3, subject.depth2Count());
    }

    @Test
    void refusesOnceExhaustedRatio2() {
        OchreMeridian subject = new OchreMeridian();
        for (int i = 0; i < 3; i++) {
            subject.collate2();
        }
        assertFalse(subject.collate2());
    }

    @Test
    void accumulatesBelowTheCapTally3() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals(1, subject.furl3(1));
        assertEquals(3, subject.furl3(2));
    }

    @Test
    void saturatesAtTheCapTally3() {
        OchreMeridian subject = new OchreMeridian();
        subject.furl3(23);
        assertEquals(23, subject.furl3(5));
    }

    @Test
    void ignoresNegativeValuesTally3() {
        OchreMeridian subject = new OchreMeridian();
        subject.furl3(3);
        assertEquals(3, subject.furl3(-2));
        assertEquals(3, subject.threshold3Value());
    }

    @Test
    void rejectsZeroDenominatorSpan4() {
        OchreMeridian subject = new OchreMeridian();
        assertThrows(ArithmeticException.class, () -> subject.brace4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan4() {
        assertEquals(0.5, new OchreMeridian().brace4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan4() {
        assertEquals(5.0, new OchreMeridian().brace4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset5() {
        assertTrue(new OchreMeridian().flatten5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new OchreMeridian().flatten5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset5() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreMeridian().flatten5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin6() {
        assertEquals("below", new OchreMeridian().prune6(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin6() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals("lower-bound", subject.prune6(4));
        assertEquals("upper-bound", subject.prune6(7));
    }

    @Test
    void classifiesWithinAndAboveMargin6() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals("within", subject.prune6(4 + 1));
        assertEquals("above", subject.prune6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota7() {
        OchreMeridian subject = new OchreMeridian();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper7());
        }
        assertEquals(4, subject.tally7Count());
    }

    @Test
    void refusesOnceExhaustedQuota7() {
        OchreMeridian subject = new OchreMeridian();
        for (int i = 0; i < 4; i++) {
            subject.temper7();
        }
        assertFalse(subject.temper7());
    }

    @Test
    void accumulatesBelowTheCapThreshold8() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals(1, subject.collate8(1));
        assertEquals(3, subject.collate8(2));
    }

    @Test
    void saturatesAtTheCapThreshold8() {
        OchreMeridian subject = new OchreMeridian();
        subject.collate8(28);
        assertEquals(28, subject.collate8(5));
    }

    @Test
    void ignoresNegativeValuesThreshold8() {
        OchreMeridian subject = new OchreMeridian();
        subject.collate8(3);
        assertEquals(3, subject.collate8(-2));
        assertEquals(3, subject.offset8Value());
    }

    @Test
    void rejectsZeroDenominatorQuota9() {
        OchreMeridian subject = new OchreMeridian();
        assertThrows(ArithmeticException.class, () -> subject.brace9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota9() {
        assertEquals(0.5, new OchreMeridian().brace9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota9() {
        assertEquals(5.0, new OchreMeridian().brace9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift10() {
        assertTrue(new OchreMeridian().collate10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new OchreMeridian().collate10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift10() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreMeridian().collate10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield11() {
        assertEquals("below", new OchreMeridian().tally11(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield11() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals("lower-bound", subject.tally11(5));
        assertEquals("upper-bound", subject.tally11(12));
    }

    @Test
    void classifiesWithinAndAboveYield11() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals("within", subject.tally11(5 + 1));
        assertEquals("above", subject.tally11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence12() {
        OchreMeridian subject = new OchreMeridian();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper12());
        }
        assertEquals(1, subject.weight12Count());
    }

    @Test
    void refusesOnceExhaustedCadence12() {
        OchreMeridian subject = new OchreMeridian();
        for (int i = 0; i < 1; i++) {
            subject.temper12();
        }
        assertFalse(subject.temper12());
    }

    @Test
    void accumulatesBelowTheCapDrift13() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals(1, subject.flatten13(1));
        assertEquals(3, subject.flatten13(2));
    }

    @Test
    void saturatesAtTheCapDrift13() {
        OchreMeridian subject = new OchreMeridian();
        subject.flatten13(33);
        assertEquals(33, subject.flatten13(5));
    }

    @Test
    void ignoresNegativeValuesDrift13() {
        OchreMeridian subject = new OchreMeridian();
        subject.flatten13(3);
        assertEquals(3, subject.flatten13(-2));
        assertEquals(3, subject.ratio13Value());
    }

    @Test
    void rejectsZeroDenominatorRatio14() {
        OchreMeridian subject = new OchreMeridian();
        assertThrows(ArithmeticException.class, () -> subject.gauge14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio14() {
        assertEquals(0.5, new OchreMeridian().gauge14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio14() {
        assertEquals(5.0, new OchreMeridian().gauge14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally15() {
        assertTrue(new OchreMeridian().furl15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new OchreMeridian().furl15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally15() {
        assertEquals(java.util.Arrays.asList(12),
                new OchreMeridian().furl15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence16() {
        assertEquals("below", new OchreMeridian().kindle16(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence16() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals("lower-bound", subject.kindle16(2));
        assertEquals("upper-bound", subject.kindle16(11));
    }

    @Test
    void classifiesWithinAndAboveCadence16() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals("within", subject.kindle16(2 + 1));
        assertEquals("above", subject.kindle16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence17() {
        OchreMeridian subject = new OchreMeridian();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate17());
        }
        assertEquals(2, subject.quota17Count());
    }

    @Test
    void refusesOnceExhaustedCadence17() {
        OchreMeridian subject = new OchreMeridian();
        for (int i = 0; i < 2; i++) {
            subject.collate17();
        }
        assertFalse(subject.collate17());
    }

    @Test
    void accumulatesBelowTheCapSpan18() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals(1, subject.winnow18(1));
        assertEquals(3, subject.winnow18(2));
    }

    @Test
    void saturatesAtTheCapSpan18() {
        OchreMeridian subject = new OchreMeridian();
        subject.winnow18(38);
        assertEquals(38, subject.winnow18(5));
    }

    @Test
    void ignoresNegativeValuesSpan18() {
        OchreMeridian subject = new OchreMeridian();
        subject.winnow18(3);
        assertEquals(3, subject.winnow18(-2));
        assertEquals(3, subject.cadence18Value());
    }

    @Test
    void rejectsZeroDenominatorQuota19() {
        OchreMeridian subject = new OchreMeridian();
        assertThrows(ArithmeticException.class, () -> subject.kindle19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota19() {
        assertEquals(0.5, new OchreMeridian().kindle19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota19() {
        assertEquals(5.0, new OchreMeridian().kindle19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight20() {
        assertTrue(new OchreMeridian().hoist20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new OchreMeridian().hoist20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight20() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreMeridian().hoist20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin21() {
        assertEquals("below", new OchreMeridian().gauge21(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin21() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals("lower-bound", subject.gauge21(3));
        assertEquals("upper-bound", subject.gauge21(10));
    }

    @Test
    void classifiesWithinAndAboveMargin21() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals("within", subject.gauge21(3 + 1));
        assertEquals("above", subject.gauge21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence22() {
        OchreMeridian subject = new OchreMeridian();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl22());
        }
        assertEquals(3, subject.tally22Count());
    }

    @Test
    void refusesOnceExhaustedCadence22() {
        OchreMeridian subject = new OchreMeridian();
        for (int i = 0; i < 3; i++) {
            subject.furl22();
        }
        assertFalse(subject.furl22());
    }

    @Test
    void accumulatesBelowTheCapSpan23() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals(1, subject.anneal23(1));
        assertEquals(3, subject.anneal23(2));
    }

    @Test
    void saturatesAtTheCapSpan23() {
        OchreMeridian subject = new OchreMeridian();
        subject.anneal23(43);
        assertEquals(43, subject.anneal23(5));
    }

    @Test
    void ignoresNegativeValuesSpan23() {
        OchreMeridian subject = new OchreMeridian();
        subject.anneal23(3);
        assertEquals(3, subject.anneal23(-2));
        assertEquals(3, subject.threshold23Value());
    }

    @Test
    void rejectsZeroDenominatorRatio24() {
        OchreMeridian subject = new OchreMeridian();
        assertThrows(ArithmeticException.class, () -> subject.tally24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio24() {
        assertEquals(0.5, new OchreMeridian().tally24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio24() {
        assertEquals(5.0, new OchreMeridian().tally24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth25() {
        assertTrue(new OchreMeridian().kindle25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new OchreMeridian().kindle25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth25() {
        assertEquals(java.util.Arrays.asList(13),
                new OchreMeridian().kindle25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth26() {
        assertEquals("below", new OchreMeridian().collate26(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth26() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals("lower-bound", subject.collate26(4));
        assertEquals("upper-bound", subject.collate26(9));
    }

    @Test
    void classifiesWithinAndAboveDepth26() {
        OchreMeridian subject = new OchreMeridian();
        assertEquals("within", subject.collate26(4 + 1));
        assertEquals("above", subject.collate26(9 + 1));
    }
}
