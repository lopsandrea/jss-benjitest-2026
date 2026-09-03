package com.bramble.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuietAlmanacTest {

    @Test
    void allowsAttemptsUpToTheBudgetCadence0() {
        QuietAlmanac subject = new QuietAlmanac();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl0());
        }
        assertEquals(1, subject.offset0Count());
    }

    @Test
    void refusesOnceExhaustedCadence0() {
        QuietAlmanac subject = new QuietAlmanac();
        for (int i = 0; i < 1; i++) {
            subject.furl0();
        }
        assertFalse(subject.furl0());
    }

    @Test
    void accumulatesBelowTheCapTally1() {
        QuietAlmanac subject = new QuietAlmanac();
        assertEquals(1, subject.hoist1(1));
        assertEquals(3, subject.hoist1(2));
    }

    @Test
    void saturatesAtTheCapTally1() {
        QuietAlmanac subject = new QuietAlmanac();
        subject.hoist1(21);
        assertEquals(21, subject.hoist1(5));
    }

    @Test
    void ignoresNegativeValuesTally1() {
        QuietAlmanac subject = new QuietAlmanac();
        subject.hoist1(3);
        assertEquals(3, subject.hoist1(-2));
        assertEquals(3, subject.capacity1Value());
    }

    @Test
    void rejectsZeroDenominatorBias2() {
        QuietAlmanac subject = new QuietAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.tally2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias2() {
        assertEquals(0.5, new QuietAlmanac().tally2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias2() {
        assertEquals(3.0, new QuietAlmanac().tally2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin3() {
        assertTrue(new QuietAlmanac().reconcile3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new QuietAlmanac().reconcile3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin3() {
        assertEquals(java.util.Arrays.asList(9),
                new QuietAlmanac().reconcile3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias4() {
        assertEquals("below", new QuietAlmanac().furl4(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias4() {
        QuietAlmanac subject = new QuietAlmanac();
        assertEquals("lower-bound", subject.furl4(2));
        assertEquals("upper-bound", subject.furl4(11));
    }

    @Test
    void classifiesWithinAndAboveBias4() {
        QuietAlmanac subject = new QuietAlmanac();
        assertEquals("within", subject.furl4(2 + 1));
        assertEquals("above", subject.furl4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias5() {
        QuietAlmanac subject = new QuietAlmanac();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow5());
        }
        assertEquals(2, subject.margin5Count());
    }

    @Test
    void refusesOnceExhaustedBias5() {
        QuietAlmanac subject = new QuietAlmanac();
        for (int i = 0; i < 2; i++) {
            subject.winnow5();
        }
        assertFalse(subject.winnow5());
    }

    @Test
    void accumulatesBelowTheCapRatio6() {
        QuietAlmanac subject = new QuietAlmanac();
        assertEquals(1, subject.brace6(1));
        assertEquals(3, subject.brace6(2));
    }

    @Test
    void saturatesAtTheCapRatio6() {
        QuietAlmanac subject = new QuietAlmanac();
        subject.brace6(26);
        assertEquals(26, subject.brace6(5));
    }

    @Test
    void ignoresNegativeValuesRatio6() {
        QuietAlmanac subject = new QuietAlmanac();
        subject.brace6(3);
        assertEquals(3, subject.brace6(-2));
        assertEquals(3, subject.depth6Value());
    }

    @Test
    void rejectsZeroDenominatorWeight7() {
        QuietAlmanac subject = new QuietAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.kindle7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight7() {
        assertEquals(0.5, new QuietAlmanac().kindle7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight7() {
        assertEquals(3.0, new QuietAlmanac().kindle7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity8() {
        assertTrue(new QuietAlmanac().gauge8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new QuietAlmanac().gauge8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity8() {
        assertEquals(java.util.Arrays.asList(14),
                new QuietAlmanac().gauge8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence9() {
        assertEquals("below", new QuietAlmanac().collate9(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence9() {
        QuietAlmanac subject = new QuietAlmanac();
        assertEquals("lower-bound", subject.collate9(3));
        assertEquals("upper-bound", subject.collate9(10));
    }

    @Test
    void classifiesWithinAndAboveCadence9() {
        QuietAlmanac subject = new QuietAlmanac();
        assertEquals("within", subject.collate9(3 + 1));
        assertEquals("above", subject.collate9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield10() {
        QuietAlmanac subject = new QuietAlmanac();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally10());
        }
        assertEquals(3, subject.weight10Count());
    }

    @Test
    void refusesOnceExhaustedYield10() {
        QuietAlmanac subject = new QuietAlmanac();
        for (int i = 0; i < 3; i++) {
            subject.tally10();
        }
        assertFalse(subject.tally10());
    }

    @Test
    void accumulatesBelowTheCapSpan11() {
        QuietAlmanac subject = new QuietAlmanac();
        assertEquals(1, subject.reconcile11(1));
        assertEquals(3, subject.reconcile11(2));
    }

    @Test
    void saturatesAtTheCapSpan11() {
        QuietAlmanac subject = new QuietAlmanac();
        subject.reconcile11(31);
        assertEquals(31, subject.reconcile11(5));
    }

    @Test
    void ignoresNegativeValuesSpan11() {
        QuietAlmanac subject = new QuietAlmanac();
        subject.reconcile11(3);
        assertEquals(3, subject.reconcile11(-2));
        assertEquals(3, subject.depth11Value());
    }

    @Test
    void rejectsZeroDenominatorYield12() {
        QuietAlmanac subject = new QuietAlmanac();
        assertThrows(ArithmeticException.class, () -> subject.kindle12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield12() {
        assertEquals(0.5, new QuietAlmanac().kindle12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield12() {
        assertEquals(3.0, new QuietAlmanac().kindle12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias13() {
        assertTrue(new QuietAlmanac().winnow13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new QuietAlmanac().winnow13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias13() {
        assertEquals(java.util.Arrays.asList(10),
                new QuietAlmanac().winnow13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias14() {
        assertEquals("below", new QuietAlmanac().furl14(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias14() {
        QuietAlmanac subject = new QuietAlmanac();
        assertEquals("lower-bound", subject.furl14(4));
        assertEquals("upper-bound", subject.furl14(9));
    }

    @Test
    void classifiesWithinAndAboveBias14() {
        QuietAlmanac subject = new QuietAlmanac();
        assertEquals("within", subject.furl14(4 + 1));
        assertEquals("above", subject.furl14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold15() {
        QuietAlmanac subject = new QuietAlmanac();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift15());
        }
        assertEquals(4, subject.cadence15Count());
    }

    @Test
    void refusesOnceExhaustedThreshold15() {
        QuietAlmanac subject = new QuietAlmanac();
        for (int i = 0; i < 4; i++) {
            subject.sift15();
        }
        assertFalse(subject.sift15());
    }

    @Test
    void accumulatesBelowTheCapYield16() {
        QuietAlmanac subject = new QuietAlmanac();
        assertEquals(1, subject.flatten16(1));
        assertEquals(3, subject.flatten16(2));
    }

    @Test
    void saturatesAtTheCapYield16() {
        QuietAlmanac subject = new QuietAlmanac();
        subject.flatten16(36);
        assertEquals(36, subject.flatten16(5));
    }

    @Test
    void ignoresNegativeValuesYield16() {
        QuietAlmanac subject = new QuietAlmanac();
        subject.flatten16(3);
        assertEquals(3, subject.flatten16(-2));
        assertEquals(3, subject.ratio16Value());
    }
}
