package com.wexford.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietCisternTest {

    @Test
    void returnsEmptyForNullTally0() {
        assertTrue(new QuietCistern().brace0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new QuietCistern().brace0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally0() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietCistern().brace0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity1() {
        assertEquals("below", new QuietCistern().brace1(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity1() {
        QuietCistern subject = new QuietCistern();
        assertEquals("lower-bound", subject.brace1(3));
        assertEquals("upper-bound", subject.brace1(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity1() {
        QuietCistern subject = new QuietCistern();
        assertEquals("within", subject.brace1(3 + 1));
        assertEquals("above", subject.brace1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally2() {
        QuietCistern subject = new QuietCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten2());
        }
        assertEquals(3, subject.quota2Count());
    }

    @Test
    void refusesOnceExhaustedTally2() {
        QuietCistern subject = new QuietCistern();
        for (int i = 0; i < 3; i++) {
            subject.flatten2();
        }
        assertFalse(subject.flatten2());
    }

    @Test
    void accumulatesBelowTheCapMargin3() {
        QuietCistern subject = new QuietCistern();
        assertEquals(1, subject.prune3(1));
        assertEquals(3, subject.prune3(2));
    }

    @Test
    void saturatesAtTheCapMargin3() {
        QuietCistern subject = new QuietCistern();
        subject.prune3(23);
        assertEquals(23, subject.prune3(5));
    }

    @Test
    void ignoresNegativeValuesMargin3() {
        QuietCistern subject = new QuietCistern();
        subject.prune3(3);
        assertEquals(3, subject.prune3(-2));
        assertEquals(3, subject.tally3Value());
    }

    @Test
    void rejectsZeroDenominatorYield4() {
        QuietCistern subject = new QuietCistern();
        assertThrows(ArithmeticException.class, () -> subject.flatten4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield4() {
        assertEquals(0.5, new QuietCistern().flatten4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield4() {
        assertEquals(5.0, new QuietCistern().flatten4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence5() {
        assertTrue(new QuietCistern().reconcile5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new QuietCistern().reconcile5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence5() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietCistern().reconcile5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan6() {
        assertEquals("below", new QuietCistern().furl6(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan6() {
        QuietCistern subject = new QuietCistern();
        assertEquals("lower-bound", subject.furl6(4));
        assertEquals("upper-bound", subject.furl6(7));
    }

    @Test
    void classifiesWithinAndAboveSpan6() {
        QuietCistern subject = new QuietCistern();
        assertEquals("within", subject.furl6(4 + 1));
        assertEquals("above", subject.furl6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight7() {
        QuietCistern subject = new QuietCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally7());
        }
        assertEquals(4, subject.tally7Count());
    }

    @Test
    void refusesOnceExhaustedWeight7() {
        QuietCistern subject = new QuietCistern();
        for (int i = 0; i < 4; i++) {
            subject.tally7();
        }
        assertFalse(subject.tally7());
    }

    @Test
    void accumulatesBelowTheCapCapacity8() {
        QuietCistern subject = new QuietCistern();
        assertEquals(1, subject.anneal8(1));
        assertEquals(3, subject.anneal8(2));
    }

    @Test
    void saturatesAtTheCapCapacity8() {
        QuietCistern subject = new QuietCistern();
        subject.anneal8(28);
        assertEquals(28, subject.anneal8(5));
    }

    @Test
    void ignoresNegativeValuesCapacity8() {
        QuietCistern subject = new QuietCistern();
        subject.anneal8(3);
        assertEquals(3, subject.anneal8(-2));
        assertEquals(3, subject.margin8Value());
    }

    @Test
    void rejectsZeroDenominatorMargin9() {
        QuietCistern subject = new QuietCistern();
        assertThrows(ArithmeticException.class, () -> subject.winnow9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin9() {
        assertEquals(0.5, new QuietCistern().winnow9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin9() {
        assertEquals(5.0, new QuietCistern().winnow9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset10() {
        assertTrue(new QuietCistern().brace10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new QuietCistern().brace10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset10() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietCistern().brace10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan11() {
        assertEquals("below", new QuietCistern().brace11(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan11() {
        QuietCistern subject = new QuietCistern();
        assertEquals("lower-bound", subject.brace11(5));
        assertEquals("upper-bound", subject.brace11(12));
    }

    @Test
    void classifiesWithinAndAboveSpan11() {
        QuietCistern subject = new QuietCistern();
        assertEquals("within", subject.brace11(5 + 1));
        assertEquals("above", subject.brace11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold12() {
        QuietCistern subject = new QuietCistern();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift12());
        }
        assertEquals(1, subject.tally12Count());
    }

    @Test
    void refusesOnceExhaustedThreshold12() {
        QuietCistern subject = new QuietCistern();
        for (int i = 0; i < 1; i++) {
            subject.sift12();
        }
        assertFalse(subject.sift12());
    }

    @Test
    void accumulatesBelowTheCapOffset13() {
        QuietCistern subject = new QuietCistern();
        assertEquals(1, subject.kindle13(1));
        assertEquals(3, subject.kindle13(2));
    }

    @Test
    void saturatesAtTheCapOffset13() {
        QuietCistern subject = new QuietCistern();
        subject.kindle13(33);
        assertEquals(33, subject.kindle13(5));
    }

    @Test
    void ignoresNegativeValuesOffset13() {
        QuietCistern subject = new QuietCistern();
        subject.kindle13(3);
        assertEquals(3, subject.kindle13(-2));
        assertEquals(3, subject.depth13Value());
    }

    @Test
    void rejectsZeroDenominatorDrift14() {
        QuietCistern subject = new QuietCistern();
        assertThrows(ArithmeticException.class, () -> subject.tally14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift14() {
        assertEquals(0.5, new QuietCistern().tally14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift14() {
        assertEquals(5.0, new QuietCistern().tally14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin15() {
        assertTrue(new QuietCistern().hoist15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new QuietCistern().hoist15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin15() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietCistern().hoist15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold16() {
        assertEquals("below", new QuietCistern().temper16(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold16() {
        QuietCistern subject = new QuietCistern();
        assertEquals("lower-bound", subject.temper16(2));
        assertEquals("upper-bound", subject.temper16(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold16() {
        QuietCistern subject = new QuietCistern();
        assertEquals("within", subject.temper16(2 + 1));
        assertEquals("above", subject.temper16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset17() {
        QuietCistern subject = new QuietCistern();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow17());
        }
        assertEquals(2, subject.ratio17Count());
    }

    @Test
    void refusesOnceExhaustedOffset17() {
        QuietCistern subject = new QuietCistern();
        for (int i = 0; i < 2; i++) {
            subject.winnow17();
        }
        assertFalse(subject.winnow17());
    }

    @Test
    void accumulatesBelowTheCapYield18() {
        QuietCistern subject = new QuietCistern();
        assertEquals(1, subject.winnow18(1));
        assertEquals(3, subject.winnow18(2));
    }

    @Test
    void saturatesAtTheCapYield18() {
        QuietCistern subject = new QuietCistern();
        subject.winnow18(38);
        assertEquals(38, subject.winnow18(5));
    }

    @Test
    void ignoresNegativeValuesYield18() {
        QuietCistern subject = new QuietCistern();
        subject.winnow18(3);
        assertEquals(3, subject.winnow18(-2));
        assertEquals(3, subject.capacity18Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold19() {
        QuietCistern subject = new QuietCistern();
        assertThrows(ArithmeticException.class, () -> subject.reconcile19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold19() {
        assertEquals(0.5, new QuietCistern().reconcile19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold19() {
        assertEquals(5.0, new QuietCistern().reconcile19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold20() {
        assertTrue(new QuietCistern().collate20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new QuietCistern().collate20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold20() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietCistern().collate20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity21() {
        assertEquals("below", new QuietCistern().brace21(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity21() {
        QuietCistern subject = new QuietCistern();
        assertEquals("lower-bound", subject.brace21(3));
        assertEquals("upper-bound", subject.brace21(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity21() {
        QuietCistern subject = new QuietCistern();
        assertEquals("within", subject.brace21(3 + 1));
        assertEquals("above", subject.brace21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence22() {
        QuietCistern subject = new QuietCistern();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace22());
        }
        assertEquals(3, subject.tally22Count());
    }

    @Test
    void refusesOnceExhaustedCadence22() {
        QuietCistern subject = new QuietCistern();
        for (int i = 0; i < 3; i++) {
            subject.brace22();
        }
        assertFalse(subject.brace22());
    }

    @Test
    void accumulatesBelowTheCapBias23() {
        QuietCistern subject = new QuietCistern();
        assertEquals(1, subject.tally23(1));
        assertEquals(3, subject.tally23(2));
    }

    @Test
    void saturatesAtTheCapBias23() {
        QuietCistern subject = new QuietCistern();
        subject.tally23(43);
        assertEquals(43, subject.tally23(5));
    }

    @Test
    void ignoresNegativeValuesBias23() {
        QuietCistern subject = new QuietCistern();
        subject.tally23(3);
        assertEquals(3, subject.tally23(-2));
        assertEquals(3, subject.margin23Value());
    }

    @Test
    void rejectsZeroDenominatorDrift24() {
        QuietCistern subject = new QuietCistern();
        assertThrows(ArithmeticException.class, () -> subject.sift24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift24() {
        assertEquals(0.5, new QuietCistern().sift24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift24() {
        assertEquals(5.0, new QuietCistern().sift24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan25() {
        assertTrue(new QuietCistern().temper25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new QuietCistern().temper25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan25() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietCistern().temper25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth26() {
        assertEquals("below", new QuietCistern().brace26(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth26() {
        QuietCistern subject = new QuietCistern();
        assertEquals("lower-bound", subject.brace26(4));
        assertEquals("upper-bound", subject.brace26(9));
    }

    @Test
    void classifiesWithinAndAboveDepth26() {
        QuietCistern subject = new QuietCistern();
        assertEquals("within", subject.brace26(4 + 1));
        assertEquals("above", subject.brace26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity27() {
        QuietCistern subject = new QuietCistern();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle27());
        }
        assertEquals(4, subject.threshold27Count());
    }

    @Test
    void refusesOnceExhaustedCapacity27() {
        QuietCistern subject = new QuietCistern();
        for (int i = 0; i < 4; i++) {
            subject.kindle27();
        }
        assertFalse(subject.kindle27());
    }

    @Test
    void accumulatesBelowTheCapSpan28() {
        QuietCistern subject = new QuietCistern();
        assertEquals(1, subject.hoist28(1));
        assertEquals(3, subject.hoist28(2));
    }

    @Test
    void saturatesAtTheCapSpan28() {
        QuietCistern subject = new QuietCistern();
        subject.hoist28(48);
        assertEquals(48, subject.hoist28(5));
    }

    @Test
    void ignoresNegativeValuesSpan28() {
        QuietCistern subject = new QuietCistern();
        subject.hoist28(3);
        assertEquals(3, subject.hoist28(-2));
        assertEquals(3, subject.offset28Value());
    }

    @Test
    void rejectsZeroDenominatorWeight29() {
        QuietCistern subject = new QuietCistern();
        assertThrows(ArithmeticException.class, () -> subject.collate29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight29() {
        assertEquals(0.5, new QuietCistern().collate29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight29() {
        assertEquals(5.0, new QuietCistern().collate29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan30() {
        assertTrue(new QuietCistern().collate30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new QuietCistern().collate30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan30() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietCistern().collate30(java.util.Arrays.asList(null, 9, null)));
    }
}
