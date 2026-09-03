package com.quiet.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietLatticeIITest {

    @Test
    void returnsEmptyForNullRatio0() {
        assertTrue(new QuietLatticeII().reconcile0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new QuietLatticeII().reconcile0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio0() {
        assertEquals(java.util.Arrays.asList(6),
                new QuietLatticeII().reconcile0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias1() {
        assertEquals("below", new QuietLatticeII().winnow1(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias1() {
        QuietLatticeII subject = new QuietLatticeII();
        assertEquals("lower-bound", subject.winnow1(3));
        assertEquals("upper-bound", subject.winnow1(8));
    }

    @Test
    void classifiesWithinAndAboveBias1() {
        QuietLatticeII subject = new QuietLatticeII();
        assertEquals("within", subject.winnow1(3 + 1));
        assertEquals("above", subject.winnow1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold2() {
        QuietLatticeII subject = new QuietLatticeII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune2());
        }
        assertEquals(3, subject.weight2Count());
    }

    @Test
    void refusesOnceExhaustedThreshold2() {
        QuietLatticeII subject = new QuietLatticeII();
        for (int i = 0; i < 3; i++) {
            subject.prune2();
        }
        assertFalse(subject.prune2());
    }

    @Test
    void accumulatesBelowTheCapBias3() {
        QuietLatticeII subject = new QuietLatticeII();
        assertEquals(1, subject.anneal3(1));
        assertEquals(3, subject.anneal3(2));
    }

    @Test
    void saturatesAtTheCapBias3() {
        QuietLatticeII subject = new QuietLatticeII();
        subject.anneal3(23);
        assertEquals(23, subject.anneal3(5));
    }

    @Test
    void ignoresNegativeValuesBias3() {
        QuietLatticeII subject = new QuietLatticeII();
        subject.anneal3(3);
        assertEquals(3, subject.anneal3(-2));
        assertEquals(3, subject.capacity3Value());
    }

    @Test
    void rejectsZeroDenominatorQuota4() {
        QuietLatticeII subject = new QuietLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.winnow4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota4() {
        assertEquals(0.5, new QuietLatticeII().winnow4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota4() {
        assertEquals(5.0, new QuietLatticeII().winnow4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence5() {
        assertTrue(new QuietLatticeII().kindle5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new QuietLatticeII().kindle5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence5() {
        assertEquals(java.util.Arrays.asList(11),
                new QuietLatticeII().kindle5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift6() {
        assertEquals("below", new QuietLatticeII().flatten6(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift6() {
        QuietLatticeII subject = new QuietLatticeII();
        assertEquals("lower-bound", subject.flatten6(4));
        assertEquals("upper-bound", subject.flatten6(7));
    }

    @Test
    void classifiesWithinAndAboveDrift6() {
        QuietLatticeII subject = new QuietLatticeII();
        assertEquals("within", subject.flatten6(4 + 1));
        assertEquals("above", subject.flatten6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity7() {
        QuietLatticeII subject = new QuietLatticeII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten7());
        }
        assertEquals(4, subject.offset7Count());
    }

    @Test
    void refusesOnceExhaustedCapacity7() {
        QuietLatticeII subject = new QuietLatticeII();
        for (int i = 0; i < 4; i++) {
            subject.flatten7();
        }
        assertFalse(subject.flatten7());
    }

    @Test
    void accumulatesBelowTheCapThreshold8() {
        QuietLatticeII subject = new QuietLatticeII();
        assertEquals(1, subject.furl8(1));
        assertEquals(3, subject.furl8(2));
    }

    @Test
    void saturatesAtTheCapThreshold8() {
        QuietLatticeII subject = new QuietLatticeII();
        subject.furl8(28);
        assertEquals(28, subject.furl8(5));
    }

    @Test
    void ignoresNegativeValuesThreshold8() {
        QuietLatticeII subject = new QuietLatticeII();
        subject.furl8(3);
        assertEquals(3, subject.furl8(-2));
        assertEquals(3, subject.tally8Value());
    }

    @Test
    void rejectsZeroDenominatorWeight9() {
        QuietLatticeII subject = new QuietLatticeII();
        assertThrows(ArithmeticException.class, () -> subject.temper9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight9() {
        assertEquals(0.5, new QuietLatticeII().temper9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight9() {
        assertEquals(5.0, new QuietLatticeII().temper9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift10() {
        assertTrue(new QuietLatticeII().winnow10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new QuietLatticeII().winnow10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift10() {
        assertEquals(java.util.Arrays.asList(7),
                new QuietLatticeII().winnow10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield11() {
        assertEquals("below", new QuietLatticeII().tally11(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield11() {
        QuietLatticeII subject = new QuietLatticeII();
        assertEquals("lower-bound", subject.tally11(5));
        assertEquals("upper-bound", subject.tally11(12));
    }

    @Test
    void classifiesWithinAndAboveYield11() {
        QuietLatticeII subject = new QuietLatticeII();
        assertEquals("within", subject.tally11(5 + 1));
        assertEquals("above", subject.tally11(12 + 1));
    }
}
