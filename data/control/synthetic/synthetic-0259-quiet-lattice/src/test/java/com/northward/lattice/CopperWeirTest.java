package com.northward.lattice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperWeirTest {

    @Test
    void allowsAttemptsUpToTheBudgetCapacity0() {
        CopperWeir subject = new CopperWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist0());
        }
        assertEquals(1, subject.drift0Count());
    }

    @Test
    void refusesOnceExhaustedCapacity0() {
        CopperWeir subject = new CopperWeir();
        for (int i = 0; i < 1; i++) {
            subject.hoist0();
        }
        assertFalse(subject.hoist0());
    }

    @Test
    void accumulatesBelowTheCapQuota1() {
        CopperWeir subject = new CopperWeir();
        assertEquals(1, subject.hoist1(1));
        assertEquals(3, subject.hoist1(2));
    }

    @Test
    void saturatesAtTheCapQuota1() {
        CopperWeir subject = new CopperWeir();
        subject.hoist1(21);
        assertEquals(21, subject.hoist1(5));
    }

    @Test
    void ignoresNegativeValuesQuota1() {
        CopperWeir subject = new CopperWeir();
        subject.hoist1(3);
        assertEquals(3, subject.hoist1(-2));
        assertEquals(3, subject.drift1Value());
    }

    @Test
    void rejectsZeroDenominatorQuota2() {
        CopperWeir subject = new CopperWeir();
        assertThrows(ArithmeticException.class, () -> subject.hoist2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota2() {
        assertEquals(0.5, new CopperWeir().hoist2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota2() {
        assertEquals(3.0, new CopperWeir().hoist2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth3() {
        assertTrue(new CopperWeir().flatten3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new CopperWeir().flatten3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth3() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperWeir().flatten3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin4() {
        assertEquals("below", new CopperWeir().brace4(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin4() {
        CopperWeir subject = new CopperWeir();
        assertEquals("lower-bound", subject.brace4(2));
        assertEquals("upper-bound", subject.brace4(11));
    }

    @Test
    void classifiesWithinAndAboveMargin4() {
        CopperWeir subject = new CopperWeir();
        assertEquals("within", subject.brace4(2 + 1));
        assertEquals("above", subject.brace4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity5() {
        CopperWeir subject = new CopperWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally5());
        }
        assertEquals(2, subject.cadence5Count());
    }

    @Test
    void refusesOnceExhaustedCapacity5() {
        CopperWeir subject = new CopperWeir();
        for (int i = 0; i < 2; i++) {
            subject.tally5();
        }
        assertFalse(subject.tally5());
    }

    @Test
    void accumulatesBelowTheCapOffset6() {
        CopperWeir subject = new CopperWeir();
        assertEquals(1, subject.prune6(1));
        assertEquals(3, subject.prune6(2));
    }

    @Test
    void saturatesAtTheCapOffset6() {
        CopperWeir subject = new CopperWeir();
        subject.prune6(26);
        assertEquals(26, subject.prune6(5));
    }

    @Test
    void ignoresNegativeValuesOffset6() {
        CopperWeir subject = new CopperWeir();
        subject.prune6(3);
        assertEquals(3, subject.prune6(-2));
        assertEquals(3, subject.span6Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold7() {
        CopperWeir subject = new CopperWeir();
        assertThrows(ArithmeticException.class, () -> subject.prune7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold7() {
        assertEquals(0.5, new CopperWeir().prune7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold7() {
        assertEquals(3.0, new CopperWeir().prune7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally8() {
        assertTrue(new CopperWeir().temper8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new CopperWeir().temper8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally8() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperWeir().temper8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield9() {
        assertEquals("below", new CopperWeir().furl9(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield9() {
        CopperWeir subject = new CopperWeir();
        assertEquals("lower-bound", subject.furl9(3));
        assertEquals("upper-bound", subject.furl9(10));
    }

    @Test
    void classifiesWithinAndAboveYield9() {
        CopperWeir subject = new CopperWeir();
        assertEquals("within", subject.furl9(3 + 1));
        assertEquals("above", subject.furl9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan10() {
        CopperWeir subject = new CopperWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge10());
        }
        assertEquals(3, subject.quota10Count());
    }

    @Test
    void refusesOnceExhaustedSpan10() {
        CopperWeir subject = new CopperWeir();
        for (int i = 0; i < 3; i++) {
            subject.gauge10();
        }
        assertFalse(subject.gauge10());
    }

    @Test
    void accumulatesBelowTheCapSpan11() {
        CopperWeir subject = new CopperWeir();
        assertEquals(1, subject.furl11(1));
        assertEquals(3, subject.furl11(2));
    }

    @Test
    void saturatesAtTheCapSpan11() {
        CopperWeir subject = new CopperWeir();
        subject.furl11(31);
        assertEquals(31, subject.furl11(5));
    }

    @Test
    void ignoresNegativeValuesSpan11() {
        CopperWeir subject = new CopperWeir();
        subject.furl11(3);
        assertEquals(3, subject.furl11(-2));
        assertEquals(3, subject.offset11Value());
    }

    @Test
    void rejectsZeroDenominatorDrift12() {
        CopperWeir subject = new CopperWeir();
        assertThrows(ArithmeticException.class, () -> subject.furl12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift12() {
        assertEquals(0.5, new CopperWeir().furl12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift12() {
        assertEquals(3.0, new CopperWeir().furl12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth13() {
        assertTrue(new CopperWeir().collate13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new CopperWeir().collate13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth13() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperWeir().collate13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias14() {
        assertEquals("below", new CopperWeir().temper14(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias14() {
        CopperWeir subject = new CopperWeir();
        assertEquals("lower-bound", subject.temper14(4));
        assertEquals("upper-bound", subject.temper14(9));
    }

    @Test
    void classifiesWithinAndAboveBias14() {
        CopperWeir subject = new CopperWeir();
        assertEquals("within", subject.temper14(4 + 1));
        assertEquals("above", subject.temper14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift15() {
        CopperWeir subject = new CopperWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate15());
        }
        assertEquals(4, subject.span15Count());
    }

    @Test
    void refusesOnceExhaustedDrift15() {
        CopperWeir subject = new CopperWeir();
        for (int i = 0; i < 4; i++) {
            subject.collate15();
        }
        assertFalse(subject.collate15());
    }
}
