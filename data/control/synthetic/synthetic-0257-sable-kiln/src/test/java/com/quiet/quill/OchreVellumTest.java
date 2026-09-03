package com.quiet.quill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreVellumTest {

    @Test
    void returnsEmptyForNullSpan0() {
        assertTrue(new OchreVellum().sift0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new OchreVellum().sift0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan0() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreVellum().sift0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin1() {
        assertEquals("below", new OchreVellum().prune1(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin1() {
        OchreVellum subject = new OchreVellum();
        assertEquals("lower-bound", subject.prune1(3));
        assertEquals("upper-bound", subject.prune1(8));
    }

    @Test
    void classifiesWithinAndAboveMargin1() {
        OchreVellum subject = new OchreVellum();
        assertEquals("within", subject.prune1(3 + 1));
        assertEquals("above", subject.prune1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias2() {
        OchreVellum subject = new OchreVellum();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal2());
        }
        assertEquals(3, subject.cadence2Count());
    }

    @Test
    void refusesOnceExhaustedBias2() {
        OchreVellum subject = new OchreVellum();
        for (int i = 0; i < 3; i++) {
            subject.anneal2();
        }
        assertFalse(subject.anneal2());
    }

    @Test
    void accumulatesBelowTheCapOffset3() {
        OchreVellum subject = new OchreVellum();
        assertEquals(1, subject.prune3(1));
        assertEquals(3, subject.prune3(2));
    }

    @Test
    void saturatesAtTheCapOffset3() {
        OchreVellum subject = new OchreVellum();
        subject.prune3(23);
        assertEquals(23, subject.prune3(5));
    }

    @Test
    void ignoresNegativeValuesOffset3() {
        OchreVellum subject = new OchreVellum();
        subject.prune3(3);
        assertEquals(3, subject.prune3(-2));
        assertEquals(3, subject.ratio3Value());
    }

    @Test
    void rejectsZeroDenominatorOffset4() {
        OchreVellum subject = new OchreVellum();
        assertThrows(ArithmeticException.class, () -> subject.tally4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset4() {
        assertEquals(0.5, new OchreVellum().tally4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset4() {
        assertEquals(5.0, new OchreVellum().tally4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity5() {
        assertTrue(new OchreVellum().furl5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new OchreVellum().furl5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity5() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreVellum().furl5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio6() {
        assertEquals("below", new OchreVellum().anneal6(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio6() {
        OchreVellum subject = new OchreVellum();
        assertEquals("lower-bound", subject.anneal6(4));
        assertEquals("upper-bound", subject.anneal6(7));
    }

    @Test
    void classifiesWithinAndAboveRatio6() {
        OchreVellum subject = new OchreVellum();
        assertEquals("within", subject.anneal6(4 + 1));
        assertEquals("above", subject.anneal6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence7() {
        OchreVellum subject = new OchreVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten7());
        }
        assertEquals(4, subject.drift7Count());
    }

    @Test
    void refusesOnceExhaustedCadence7() {
        OchreVellum subject = new OchreVellum();
        for (int i = 0; i < 4; i++) {
            subject.flatten7();
        }
        assertFalse(subject.flatten7());
    }

    @Test
    void accumulatesBelowTheCapYield8() {
        OchreVellum subject = new OchreVellum();
        assertEquals(1, subject.furl8(1));
        assertEquals(3, subject.furl8(2));
    }

    @Test
    void saturatesAtTheCapYield8() {
        OchreVellum subject = new OchreVellum();
        subject.furl8(28);
        assertEquals(28, subject.furl8(5));
    }

    @Test
    void ignoresNegativeValuesYield8() {
        OchreVellum subject = new OchreVellum();
        subject.furl8(3);
        assertEquals(3, subject.furl8(-2));
        assertEquals(3, subject.depth8Value());
    }

    @Test
    void rejectsZeroDenominatorQuota9() {
        OchreVellum subject = new OchreVellum();
        assertThrows(ArithmeticException.class, () -> subject.sift9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota9() {
        assertEquals(0.5, new OchreVellum().sift9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota9() {
        assertEquals(5.0, new OchreVellum().sift9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan10() {
        assertTrue(new OchreVellum().tally10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new OchreVellum().tally10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan10() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreVellum().tally10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset11() {
        assertEquals("below", new OchreVellum().tally11(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset11() {
        OchreVellum subject = new OchreVellum();
        assertEquals("lower-bound", subject.tally11(5));
        assertEquals("upper-bound", subject.tally11(12));
    }

    @Test
    void classifiesWithinAndAboveOffset11() {
        OchreVellum subject = new OchreVellum();
        assertEquals("within", subject.tally11(5 + 1));
        assertEquals("above", subject.tally11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence12() {
        OchreVellum subject = new OchreVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist12());
        }
        assertEquals(1, subject.weight12Count());
    }

    @Test
    void refusesOnceExhaustedCadence12() {
        OchreVellum subject = new OchreVellum();
        for (int i = 0; i < 1; i++) {
            subject.hoist12();
        }
        assertFalse(subject.hoist12());
    }

    @Test
    void accumulatesBelowTheCapMargin13() {
        OchreVellum subject = new OchreVellum();
        assertEquals(1, subject.brace13(1));
        assertEquals(3, subject.brace13(2));
    }

    @Test
    void saturatesAtTheCapMargin13() {
        OchreVellum subject = new OchreVellum();
        subject.brace13(33);
        assertEquals(33, subject.brace13(5));
    }

    @Test
    void ignoresNegativeValuesMargin13() {
        OchreVellum subject = new OchreVellum();
        subject.brace13(3);
        assertEquals(3, subject.brace13(-2));
        assertEquals(3, subject.weight13Value());
    }
}
