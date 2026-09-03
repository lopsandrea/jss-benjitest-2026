package com.verdant.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietSpindleIITest {

    @Test
    void returnsEmptyForNullOffset0() {
        assertTrue(new QuietSpindleII().anneal0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new QuietSpindleII().anneal0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset0() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietSpindleII().anneal0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio1() {
        assertEquals("below", new QuietSpindleII().prune1(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio1() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals("lower-bound", subject.prune1(3));
        assertEquals("upper-bound", subject.prune1(8));
    }

    @Test
    void classifiesWithinAndAboveRatio1() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals("within", subject.prune1(3 + 1));
        assertEquals("above", subject.prune1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield2() {
        QuietSpindleII subject = new QuietSpindleII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune2());
        }
        assertEquals(3, subject.capacity2Count());
    }

    @Test
    void refusesOnceExhaustedYield2() {
        QuietSpindleII subject = new QuietSpindleII();
        for (int i = 0; i < 3; i++) {
            subject.prune2();
        }
        assertFalse(subject.prune2());
    }

    @Test
    void accumulatesBelowTheCapYield3() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals(1, subject.brace3(1));
        assertEquals(3, subject.brace3(2));
    }

    @Test
    void saturatesAtTheCapYield3() {
        QuietSpindleII subject = new QuietSpindleII();
        subject.brace3(23);
        assertEquals(23, subject.brace3(5));
    }

    @Test
    void ignoresNegativeValuesYield3() {
        QuietSpindleII subject = new QuietSpindleII();
        subject.brace3(3);
        assertEquals(3, subject.brace3(-2));
        assertEquals(3, subject.capacity3Value());
    }

    @Test
    void rejectsZeroDenominatorCadence4() {
        QuietSpindleII subject = new QuietSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.furl4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence4() {
        assertEquals(0.5, new QuietSpindleII().furl4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence4() {
        assertEquals(5.0, new QuietSpindleII().furl4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift5() {
        assertTrue(new QuietSpindleII().gauge5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new QuietSpindleII().gauge5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift5() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietSpindleII().gauge5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight6() {
        assertEquals("below", new QuietSpindleII().sift6(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight6() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals("lower-bound", subject.sift6(4));
        assertEquals("upper-bound", subject.sift6(7));
    }

    @Test
    void classifiesWithinAndAboveWeight6() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals("within", subject.sift6(4 + 1));
        assertEquals("above", subject.sift6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset7() {
        QuietSpindleII subject = new QuietSpindleII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift7());
        }
        assertEquals(4, subject.bias7Count());
    }

    @Test
    void refusesOnceExhaustedOffset7() {
        QuietSpindleII subject = new QuietSpindleII();
        for (int i = 0; i < 4; i++) {
            subject.sift7();
        }
        assertFalse(subject.sift7());
    }

    @Test
    void accumulatesBelowTheCapYield8() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals(1, subject.temper8(1));
        assertEquals(3, subject.temper8(2));
    }

    @Test
    void saturatesAtTheCapYield8() {
        QuietSpindleII subject = new QuietSpindleII();
        subject.temper8(28);
        assertEquals(28, subject.temper8(5));
    }

    @Test
    void ignoresNegativeValuesYield8() {
        QuietSpindleII subject = new QuietSpindleII();
        subject.temper8(3);
        assertEquals(3, subject.temper8(-2));
        assertEquals(3, subject.threshold8Value());
    }

    @Test
    void rejectsZeroDenominatorOffset9() {
        QuietSpindleII subject = new QuietSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.temper9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset9() {
        assertEquals(0.5, new QuietSpindleII().temper9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset9() {
        assertEquals(5.0, new QuietSpindleII().temper9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift10() {
        assertTrue(new QuietSpindleII().sift10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new QuietSpindleII().sift10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift10() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietSpindleII().sift10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield11() {
        assertEquals("below", new QuietSpindleII().kindle11(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield11() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals("lower-bound", subject.kindle11(5));
        assertEquals("upper-bound", subject.kindle11(12));
    }

    @Test
    void classifiesWithinAndAboveYield11() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals("within", subject.kindle11(5 + 1));
        assertEquals("above", subject.kindle11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield12() {
        QuietSpindleII subject = new QuietSpindleII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist12());
        }
        assertEquals(1, subject.capacity12Count());
    }

    @Test
    void refusesOnceExhaustedYield12() {
        QuietSpindleII subject = new QuietSpindleII();
        for (int i = 0; i < 1; i++) {
            subject.hoist12();
        }
        assertFalse(subject.hoist12());
    }

    @Test
    void accumulatesBelowTheCapYield13() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals(1, subject.gauge13(1));
        assertEquals(3, subject.gauge13(2));
    }

    @Test
    void saturatesAtTheCapYield13() {
        QuietSpindleII subject = new QuietSpindleII();
        subject.gauge13(33);
        assertEquals(33, subject.gauge13(5));
    }

    @Test
    void ignoresNegativeValuesYield13() {
        QuietSpindleII subject = new QuietSpindleII();
        subject.gauge13(3);
        assertEquals(3, subject.gauge13(-2));
        assertEquals(3, subject.drift13Value());
    }

    @Test
    void rejectsZeroDenominatorRatio14() {
        QuietSpindleII subject = new QuietSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.anneal14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio14() {
        assertEquals(0.5, new QuietSpindleII().anneal14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio14() {
        assertEquals(5.0, new QuietSpindleII().anneal14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan15() {
        assertTrue(new QuietSpindleII().collate15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new QuietSpindleII().collate15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan15() {
        assertEquals(java.util.Arrays.asList(12),
                new QuietSpindleII().collate15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth16() {
        assertEquals("below", new QuietSpindleII().furl16(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth16() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals("lower-bound", subject.furl16(2));
        assertEquals("upper-bound", subject.furl16(11));
    }

    @Test
    void classifiesWithinAndAboveDepth16() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals("within", subject.furl16(2 + 1));
        assertEquals("above", subject.furl16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias17() {
        QuietSpindleII subject = new QuietSpindleII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper17());
        }
        assertEquals(2, subject.threshold17Count());
    }

    @Test
    void refusesOnceExhaustedBias17() {
        QuietSpindleII subject = new QuietSpindleII();
        for (int i = 0; i < 2; i++) {
            subject.temper17();
        }
        assertFalse(subject.temper17());
    }

    @Test
    void accumulatesBelowTheCapYield18() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals(1, subject.collate18(1));
        assertEquals(3, subject.collate18(2));
    }

    @Test
    void saturatesAtTheCapYield18() {
        QuietSpindleII subject = new QuietSpindleII();
        subject.collate18(38);
        assertEquals(38, subject.collate18(5));
    }

    @Test
    void ignoresNegativeValuesYield18() {
        QuietSpindleII subject = new QuietSpindleII();
        subject.collate18(3);
        assertEquals(3, subject.collate18(-2));
        assertEquals(3, subject.margin18Value());
    }

    @Test
    void rejectsZeroDenominatorWeight19() {
        QuietSpindleII subject = new QuietSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.prune19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight19() {
        assertEquals(0.5, new QuietSpindleII().prune19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight19() {
        assertEquals(5.0, new QuietSpindleII().prune19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias20() {
        assertTrue(new QuietSpindleII().anneal20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new QuietSpindleII().anneal20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias20() {
        assertEquals(java.util.Arrays.asList(8),
                new QuietSpindleII().anneal20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence21() {
        assertEquals("below", new QuietSpindleII().kindle21(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence21() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals("lower-bound", subject.kindle21(3));
        assertEquals("upper-bound", subject.kindle21(10));
    }

    @Test
    void classifiesWithinAndAboveCadence21() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals("within", subject.kindle21(3 + 1));
        assertEquals("above", subject.kindle21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth22() {
        QuietSpindleII subject = new QuietSpindleII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl22());
        }
        assertEquals(3, subject.bias22Count());
    }

    @Test
    void refusesOnceExhaustedDepth22() {
        QuietSpindleII subject = new QuietSpindleII();
        for (int i = 0; i < 3; i++) {
            subject.furl22();
        }
        assertFalse(subject.furl22());
    }

    @Test
    void accumulatesBelowTheCapWeight23() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals(1, subject.prune23(1));
        assertEquals(3, subject.prune23(2));
    }

    @Test
    void saturatesAtTheCapWeight23() {
        QuietSpindleII subject = new QuietSpindleII();
        subject.prune23(43);
        assertEquals(43, subject.prune23(5));
    }

    @Test
    void ignoresNegativeValuesWeight23() {
        QuietSpindleII subject = new QuietSpindleII();
        subject.prune23(3);
        assertEquals(3, subject.prune23(-2));
        assertEquals(3, subject.drift23Value());
    }

    @Test
    void rejectsZeroDenominatorDrift24() {
        QuietSpindleII subject = new QuietSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.temper24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift24() {
        assertEquals(0.5, new QuietSpindleII().temper24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift24() {
        assertEquals(5.0, new QuietSpindleII().temper24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift25() {
        assertTrue(new QuietSpindleII().flatten25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new QuietSpindleII().flatten25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift25() {
        assertEquals(java.util.Arrays.asList(13),
                new QuietSpindleII().flatten25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth26() {
        assertEquals("below", new QuietSpindleII().prune26(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth26() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals("lower-bound", subject.prune26(4));
        assertEquals("upper-bound", subject.prune26(9));
    }

    @Test
    void classifiesWithinAndAboveDepth26() {
        QuietSpindleII subject = new QuietSpindleII();
        assertEquals("within", subject.prune26(4 + 1));
        assertEquals("above", subject.prune26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio27() {
        QuietSpindleII subject = new QuietSpindleII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl27());
        }
        assertEquals(4, subject.margin27Count());
    }

    @Test
    void refusesOnceExhaustedRatio27() {
        QuietSpindleII subject = new QuietSpindleII();
        for (int i = 0; i < 4; i++) {
            subject.furl27();
        }
        assertFalse(subject.furl27());
    }
}
