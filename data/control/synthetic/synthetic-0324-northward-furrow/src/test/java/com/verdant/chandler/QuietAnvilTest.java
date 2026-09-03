package com.verdant.chandler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietAnvilTest {

    @Test
    void allowsAttemptsUpToTheBudgetWeight0() {
        QuietAnvil subject = new QuietAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten0());
        }
        assertEquals(1, subject.bias0Count());
    }

    @Test
    void refusesOnceExhaustedWeight0() {
        QuietAnvil subject = new QuietAnvil();
        for (int i = 0; i < 1; i++) {
            subject.flatten0();
        }
        assertFalse(subject.flatten0());
    }

    @Test
    void accumulatesBelowTheCapOffset1() {
        QuietAnvil subject = new QuietAnvil();
        assertEquals(1, subject.sift1(1));
        assertEquals(3, subject.sift1(2));
    }

    @Test
    void saturatesAtTheCapOffset1() {
        QuietAnvil subject = new QuietAnvil();
        subject.sift1(21);
        assertEquals(21, subject.sift1(5));
    }

    @Test
    void ignoresNegativeValuesOffset1() {
        QuietAnvil subject = new QuietAnvil();
        subject.sift1(3);
        assertEquals(3, subject.sift1(-2));
        assertEquals(3, subject.drift1Value());
    }

    @Test
    void rejectsZeroDenominatorCadence2() {
        QuietAnvil subject = new QuietAnvil();
        assertThrows(ArithmeticException.class, () -> subject.kindle2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence2() {
        assertEquals(0.5, new QuietAnvil().kindle2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence2() {
        assertEquals(3.0, new QuietAnvil().kindle2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset3() {
        assertTrue(new QuietAnvil().reconcile3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new QuietAnvil().reconcile3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset3() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietAnvil().reconcile3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally4() {
        assertEquals("below", new QuietAnvil().sift4(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally4() {
        QuietAnvil subject = new QuietAnvil();
        assertEquals("lower-bound", subject.sift4(2));
        assertEquals("upper-bound", subject.sift4(11));
    }

    @Test
    void classifiesWithinAndAboveTally4() {
        QuietAnvil subject = new QuietAnvil();
        assertEquals("within", subject.sift4(2 + 1));
        assertEquals("above", subject.sift4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity5() {
        QuietAnvil subject = new QuietAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow5());
        }
        assertEquals(2, subject.weight5Count());
    }

    @Test
    void refusesOnceExhaustedCapacity5() {
        QuietAnvil subject = new QuietAnvil();
        for (int i = 0; i < 2; i++) {
            subject.winnow5();
        }
        assertFalse(subject.winnow5());
    }

    @Test
    void accumulatesBelowTheCapCapacity6() {
        QuietAnvil subject = new QuietAnvil();
        assertEquals(1, subject.reconcile6(1));
        assertEquals(3, subject.reconcile6(2));
    }

    @Test
    void saturatesAtTheCapCapacity6() {
        QuietAnvil subject = new QuietAnvil();
        subject.reconcile6(26);
        assertEquals(26, subject.reconcile6(5));
    }

    @Test
    void ignoresNegativeValuesCapacity6() {
        QuietAnvil subject = new QuietAnvil();
        subject.reconcile6(3);
        assertEquals(3, subject.reconcile6(-2));
        assertEquals(3, subject.threshold6Value());
    }

    @Test
    void rejectsZeroDenominatorWeight7() {
        QuietAnvil subject = new QuietAnvil();
        assertThrows(ArithmeticException.class, () -> subject.sift7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight7() {
        assertEquals(0.5, new QuietAnvil().sift7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight7() {
        assertEquals(3.0, new QuietAnvil().sift7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally8() {
        assertTrue(new QuietAnvil().collate8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new QuietAnvil().collate8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally8() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietAnvil().collate8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift9() {
        assertEquals("below", new QuietAnvil().brace9(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift9() {
        QuietAnvil subject = new QuietAnvil();
        assertEquals("lower-bound", subject.brace9(3));
        assertEquals("upper-bound", subject.brace9(10));
    }

    @Test
    void classifiesWithinAndAboveDrift9() {
        QuietAnvil subject = new QuietAnvil();
        assertEquals("within", subject.brace9(3 + 1));
        assertEquals("above", subject.brace9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio10() {
        QuietAnvil subject = new QuietAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper10());
        }
        assertEquals(3, subject.weight10Count());
    }

    @Test
    void refusesOnceExhaustedRatio10() {
        QuietAnvil subject = new QuietAnvil();
        for (int i = 0; i < 3; i++) {
            subject.temper10();
        }
        assertFalse(subject.temper10());
    }

    @Test
    void accumulatesBelowTheCapCapacity11() {
        QuietAnvil subject = new QuietAnvil();
        assertEquals(1, subject.sift11(1));
        assertEquals(3, subject.sift11(2));
    }

    @Test
    void saturatesAtTheCapCapacity11() {
        QuietAnvil subject = new QuietAnvil();
        subject.sift11(31);
        assertEquals(31, subject.sift11(5));
    }

    @Test
    void ignoresNegativeValuesCapacity11() {
        QuietAnvil subject = new QuietAnvil();
        subject.sift11(3);
        assertEquals(3, subject.sift11(-2));
        assertEquals(3, subject.tally11Value());
    }

    @Test
    void rejectsZeroDenominatorDrift12() {
        QuietAnvil subject = new QuietAnvil();
        assertThrows(ArithmeticException.class, () -> subject.prune12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift12() {
        assertEquals(0.5, new QuietAnvil().prune12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift12() {
        assertEquals(3.0, new QuietAnvil().prune12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield13() {
        assertTrue(new QuietAnvil().anneal13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new QuietAnvil().anneal13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield13() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietAnvil().anneal13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally14() {
        assertEquals("below", new QuietAnvil().flatten14(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally14() {
        QuietAnvil subject = new QuietAnvil();
        assertEquals("lower-bound", subject.flatten14(4));
        assertEquals("upper-bound", subject.flatten14(9));
    }

    @Test
    void classifiesWithinAndAboveTally14() {
        QuietAnvil subject = new QuietAnvil();
        assertEquals("within", subject.flatten14(4 + 1));
        assertEquals("above", subject.flatten14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota15() {
        QuietAnvil subject = new QuietAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge15());
        }
        assertEquals(4, subject.ratio15Count());
    }

    @Test
    void refusesOnceExhaustedQuota15() {
        QuietAnvil subject = new QuietAnvil();
        for (int i = 0; i < 4; i++) {
            subject.gauge15();
        }
        assertFalse(subject.gauge15());
    }
}
