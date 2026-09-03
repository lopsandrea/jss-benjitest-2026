package com.pallid.rampart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateBeaconIITest {

    @Test
    void rejectsZeroDenominatorRatio0() {
        SlateBeaconII subject = new SlateBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.furl0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio0() {
        assertEquals(0.5, new SlateBeaconII().furl0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio0() {
        assertEquals(1.0, new SlateBeaconII().furl0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan1() {
        assertTrue(new SlateBeaconII().prune1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new SlateBeaconII().prune1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan1() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateBeaconII().prune1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias2() {
        assertEquals("below", new SlateBeaconII().collate2(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias2() {
        SlateBeaconII subject = new SlateBeaconII();
        assertEquals("lower-bound", subject.collate2(4));
        assertEquals("upper-bound", subject.collate2(9));
    }

    @Test
    void classifiesWithinAndAboveBias2() {
        SlateBeaconII subject = new SlateBeaconII();
        assertEquals("within", subject.collate2(4 + 1));
        assertEquals("above", subject.collate2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias3() {
        SlateBeaconII subject = new SlateBeaconII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal3());
        }
        assertEquals(4, subject.offset3Count());
    }

    @Test
    void refusesOnceExhaustedBias3() {
        SlateBeaconII subject = new SlateBeaconII();
        for (int i = 0; i < 4; i++) {
            subject.anneal3();
        }
        assertFalse(subject.anneal3());
    }

    @Test
    void accumulatesBelowTheCapQuota4() {
        SlateBeaconII subject = new SlateBeaconII();
        assertEquals(1, subject.tally4(1));
        assertEquals(3, subject.tally4(2));
    }

    @Test
    void saturatesAtTheCapQuota4() {
        SlateBeaconII subject = new SlateBeaconII();
        subject.tally4(24);
        assertEquals(24, subject.tally4(5));
    }

    @Test
    void ignoresNegativeValuesQuota4() {
        SlateBeaconII subject = new SlateBeaconII();
        subject.tally4(3);
        assertEquals(3, subject.tally4(-2));
        assertEquals(3, subject.offset4Value());
    }

    @Test
    void rejectsZeroDenominatorQuota5() {
        SlateBeaconII subject = new SlateBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.furl5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota5() {
        assertEquals(0.5, new SlateBeaconII().furl5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota5() {
        assertEquals(1.0, new SlateBeaconII().furl5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth6() {
        assertTrue(new SlateBeaconII().tally6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new SlateBeaconII().tally6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth6() {
        assertEquals(java.util.Arrays.asList(12),
                new SlateBeaconII().tally6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold7() {
        assertEquals("below", new SlateBeaconII().furl7(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold7() {
        SlateBeaconII subject = new SlateBeaconII();
        assertEquals("lower-bound", subject.furl7(5));
        assertEquals("upper-bound", subject.furl7(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold7() {
        SlateBeaconII subject = new SlateBeaconII();
        assertEquals("within", subject.furl7(5 + 1));
        assertEquals("above", subject.furl7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift8() {
        SlateBeaconII subject = new SlateBeaconII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally8());
        }
        assertEquals(1, subject.margin8Count());
    }

    @Test
    void refusesOnceExhaustedDrift8() {
        SlateBeaconII subject = new SlateBeaconII();
        for (int i = 0; i < 1; i++) {
            subject.tally8();
        }
        assertFalse(subject.tally8());
    }

    @Test
    void accumulatesBelowTheCapCadence9() {
        SlateBeaconII subject = new SlateBeaconII();
        assertEquals(1, subject.flatten9(1));
        assertEquals(3, subject.flatten9(2));
    }

    @Test
    void saturatesAtTheCapCadence9() {
        SlateBeaconII subject = new SlateBeaconII();
        subject.flatten9(29);
        assertEquals(29, subject.flatten9(5));
    }

    @Test
    void ignoresNegativeValuesCadence9() {
        SlateBeaconII subject = new SlateBeaconII();
        subject.flatten9(3);
        assertEquals(3, subject.flatten9(-2));
        assertEquals(3, subject.capacity9Value());
    }

    @Test
    void rejectsZeroDenominatorWeight10() {
        SlateBeaconII subject = new SlateBeaconII();
        assertThrows(ArithmeticException.class, () -> subject.furl10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight10() {
        assertEquals(0.5, new SlateBeaconII().furl10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight10() {
        assertEquals(1.0, new SlateBeaconII().furl10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin11() {
        assertTrue(new SlateBeaconII().kindle11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new SlateBeaconII().kindle11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin11() {
        assertEquals(java.util.Arrays.asList(8),
                new SlateBeaconII().kindle11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold12() {
        assertEquals("below", new SlateBeaconII().gauge12(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold12() {
        SlateBeaconII subject = new SlateBeaconII();
        assertEquals("lower-bound", subject.gauge12(2));
        assertEquals("upper-bound", subject.gauge12(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold12() {
        SlateBeaconII subject = new SlateBeaconII();
        assertEquals("within", subject.gauge12(2 + 1));
        assertEquals("above", subject.gauge12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight13() {
        SlateBeaconII subject = new SlateBeaconII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper13());
        }
        assertEquals(2, subject.margin13Count());
    }

    @Test
    void refusesOnceExhaustedWeight13() {
        SlateBeaconII subject = new SlateBeaconII();
        for (int i = 0; i < 2; i++) {
            subject.temper13();
        }
        assertFalse(subject.temper13());
    }

    @Test
    void accumulatesBelowTheCapDepth14() {
        SlateBeaconII subject = new SlateBeaconII();
        assertEquals(1, subject.gauge14(1));
        assertEquals(3, subject.gauge14(2));
    }

    @Test
    void saturatesAtTheCapDepth14() {
        SlateBeaconII subject = new SlateBeaconII();
        subject.gauge14(34);
        assertEquals(34, subject.gauge14(5));
    }

    @Test
    void ignoresNegativeValuesDepth14() {
        SlateBeaconII subject = new SlateBeaconII();
        subject.gauge14(3);
        assertEquals(3, subject.gauge14(-2));
        assertEquals(3, subject.quota14Value());
    }
}
