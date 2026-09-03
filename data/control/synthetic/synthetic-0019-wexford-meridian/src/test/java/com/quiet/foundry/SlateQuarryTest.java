package com.quiet.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateQuarryTest {

    @Test
    void allowsAttemptsUpToTheBudgetWeight0() {
        SlateQuarry subject = new SlateQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace0());
        }
        assertEquals(1, subject.ratio0Count());
    }

    @Test
    void refusesOnceExhaustedWeight0() {
        SlateQuarry subject = new SlateQuarry();
        for (int i = 0; i < 1; i++) {
            subject.brace0();
        }
        assertFalse(subject.brace0());
    }

    @Test
    void accumulatesBelowTheCapCapacity1() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals(1, subject.flatten1(1));
        assertEquals(3, subject.flatten1(2));
    }

    @Test
    void saturatesAtTheCapCapacity1() {
        SlateQuarry subject = new SlateQuarry();
        subject.flatten1(21);
        assertEquals(21, subject.flatten1(5));
    }

    @Test
    void ignoresNegativeValuesCapacity1() {
        SlateQuarry subject = new SlateQuarry();
        subject.flatten1(3);
        assertEquals(3, subject.flatten1(-2));
        assertEquals(3, subject.ratio1Value());
    }

    @Test
    void rejectsZeroDenominatorDrift2() {
        SlateQuarry subject = new SlateQuarry();
        assertThrows(ArithmeticException.class, () -> subject.tally2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift2() {
        assertEquals(0.5, new SlateQuarry().tally2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift2() {
        assertEquals(3.0, new SlateQuarry().tally2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan3() {
        assertTrue(new SlateQuarry().reconcile3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SlateQuarry().reconcile3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan3() {
        assertEquals(java.util.Arrays.asList(9),
                new SlateQuarry().reconcile3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin4() {
        assertEquals("below", new SlateQuarry().gauge4(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin4() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals("lower-bound", subject.gauge4(2));
        assertEquals("upper-bound", subject.gauge4(11));
    }

    @Test
    void classifiesWithinAndAboveMargin4() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals("within", subject.gauge4(2 + 1));
        assertEquals("above", subject.gauge4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin5() {
        SlateQuarry subject = new SlateQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl5());
        }
        assertEquals(2, subject.capacity5Count());
    }

    @Test
    void refusesOnceExhaustedMargin5() {
        SlateQuarry subject = new SlateQuarry();
        for (int i = 0; i < 2; i++) {
            subject.furl5();
        }
        assertFalse(subject.furl5());
    }

    @Test
    void accumulatesBelowTheCapWeight6() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals(1, subject.furl6(1));
        assertEquals(3, subject.furl6(2));
    }

    @Test
    void saturatesAtTheCapWeight6() {
        SlateQuarry subject = new SlateQuarry();
        subject.furl6(26);
        assertEquals(26, subject.furl6(5));
    }

    @Test
    void ignoresNegativeValuesWeight6() {
        SlateQuarry subject = new SlateQuarry();
        subject.furl6(3);
        assertEquals(3, subject.furl6(-2));
        assertEquals(3, subject.yield6Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity7() {
        SlateQuarry subject = new SlateQuarry();
        assertThrows(ArithmeticException.class, () -> subject.winnow7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity7() {
        assertEquals(0.5, new SlateQuarry().winnow7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity7() {
        assertEquals(3.0, new SlateQuarry().winnow7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift8() {
        assertTrue(new SlateQuarry().anneal8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SlateQuarry().anneal8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift8() {
        assertEquals(java.util.Arrays.asList(14),
                new SlateQuarry().anneal8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity9() {
        assertEquals("below", new SlateQuarry().prune9(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity9() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals("lower-bound", subject.prune9(3));
        assertEquals("upper-bound", subject.prune9(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity9() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals("within", subject.prune9(3 + 1));
        assertEquals("above", subject.prune9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence10() {
        SlateQuarry subject = new SlateQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift10());
        }
        assertEquals(3, subject.depth10Count());
    }

    @Test
    void refusesOnceExhaustedCadence10() {
        SlateQuarry subject = new SlateQuarry();
        for (int i = 0; i < 3; i++) {
            subject.sift10();
        }
        assertFalse(subject.sift10());
    }

    @Test
    void accumulatesBelowTheCapRatio11() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals(1, subject.winnow11(1));
        assertEquals(3, subject.winnow11(2));
    }

    @Test
    void saturatesAtTheCapRatio11() {
        SlateQuarry subject = new SlateQuarry();
        subject.winnow11(31);
        assertEquals(31, subject.winnow11(5));
    }

    @Test
    void ignoresNegativeValuesRatio11() {
        SlateQuarry subject = new SlateQuarry();
        subject.winnow11(3);
        assertEquals(3, subject.winnow11(-2));
        assertEquals(3, subject.margin11Value());
    }

    @Test
    void rejectsZeroDenominatorDrift12() {
        SlateQuarry subject = new SlateQuarry();
        assertThrows(ArithmeticException.class, () -> subject.tally12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift12() {
        assertEquals(0.5, new SlateQuarry().tally12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift12() {
        assertEquals(3.0, new SlateQuarry().tally12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin13() {
        assertTrue(new SlateQuarry().prune13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SlateQuarry().prune13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin13() {
        assertEquals(java.util.Arrays.asList(10),
                new SlateQuarry().prune13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias14() {
        assertEquals("below", new SlateQuarry().flatten14(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias14() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals("lower-bound", subject.flatten14(4));
        assertEquals("upper-bound", subject.flatten14(9));
    }

    @Test
    void classifiesWithinAndAboveBias14() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals("within", subject.flatten14(4 + 1));
        assertEquals("above", subject.flatten14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias15() {
        SlateQuarry subject = new SlateQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate15());
        }
        assertEquals(4, subject.ratio15Count());
    }

    @Test
    void refusesOnceExhaustedBias15() {
        SlateQuarry subject = new SlateQuarry();
        for (int i = 0; i < 4; i++) {
            subject.collate15();
        }
        assertFalse(subject.collate15());
    }

    @Test
    void accumulatesBelowTheCapMargin16() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals(1, subject.winnow16(1));
        assertEquals(3, subject.winnow16(2));
    }

    @Test
    void saturatesAtTheCapMargin16() {
        SlateQuarry subject = new SlateQuarry();
        subject.winnow16(36);
        assertEquals(36, subject.winnow16(5));
    }

    @Test
    void ignoresNegativeValuesMargin16() {
        SlateQuarry subject = new SlateQuarry();
        subject.winnow16(3);
        assertEquals(3, subject.winnow16(-2));
        assertEquals(3, subject.yield16Value());
    }

    @Test
    void rejectsZeroDenominatorQuota17() {
        SlateQuarry subject = new SlateQuarry();
        assertThrows(ArithmeticException.class, () -> subject.tally17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota17() {
        assertEquals(0.5, new SlateQuarry().tally17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota17() {
        assertEquals(3.0, new SlateQuarry().tally17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence18() {
        assertTrue(new SlateQuarry().prune18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new SlateQuarry().prune18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence18() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateQuarry().prune18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota19() {
        assertEquals("below", new SlateQuarry().brace19(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota19() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals("lower-bound", subject.brace19(5));
        assertEquals("upper-bound", subject.brace19(8));
    }

    @Test
    void classifiesWithinAndAboveQuota19() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals("within", subject.brace19(5 + 1));
        assertEquals("above", subject.brace19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio20() {
        SlateQuarry subject = new SlateQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally20());
        }
        assertEquals(1, subject.margin20Count());
    }

    @Test
    void refusesOnceExhaustedRatio20() {
        SlateQuarry subject = new SlateQuarry();
        for (int i = 0; i < 1; i++) {
            subject.tally20();
        }
        assertFalse(subject.tally20());
    }

    @Test
    void accumulatesBelowTheCapCapacity21() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals(1, subject.temper21(1));
        assertEquals(3, subject.temper21(2));
    }

    @Test
    void saturatesAtTheCapCapacity21() {
        SlateQuarry subject = new SlateQuarry();
        subject.temper21(41);
        assertEquals(41, subject.temper21(5));
    }

    @Test
    void ignoresNegativeValuesCapacity21() {
        SlateQuarry subject = new SlateQuarry();
        subject.temper21(3);
        assertEquals(3, subject.temper21(-2));
        assertEquals(3, subject.span21Value());
    }

    @Test
    void rejectsZeroDenominatorWeight22() {
        SlateQuarry subject = new SlateQuarry();
        assertThrows(ArithmeticException.class, () -> subject.gauge22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight22() {
        assertEquals(0.5, new SlateQuarry().gauge22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight22() {
        assertEquals(3.0, new SlateQuarry().gauge22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio23() {
        assertTrue(new SlateQuarry().prune23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new SlateQuarry().prune23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio23() {
        assertEquals(java.util.Arrays.asList(11),
                new SlateQuarry().prune23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio24() {
        assertEquals("below", new SlateQuarry().kindle24(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio24() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals("lower-bound", subject.kindle24(2));
        assertEquals("upper-bound", subject.kindle24(7));
    }

    @Test
    void classifiesWithinAndAboveRatio24() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals("within", subject.kindle24(2 + 1));
        assertEquals("above", subject.kindle24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan25() {
        SlateQuarry subject = new SlateQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace25());
        }
        assertEquals(2, subject.tally25Count());
    }

    @Test
    void refusesOnceExhaustedSpan25() {
        SlateQuarry subject = new SlateQuarry();
        for (int i = 0; i < 2; i++) {
            subject.brace25();
        }
        assertFalse(subject.brace25());
    }

    @Test
    void accumulatesBelowTheCapCadence26() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals(1, subject.flatten26(1));
        assertEquals(3, subject.flatten26(2));
    }

    @Test
    void saturatesAtTheCapCadence26() {
        SlateQuarry subject = new SlateQuarry();
        subject.flatten26(46);
        assertEquals(46, subject.flatten26(5));
    }

    @Test
    void ignoresNegativeValuesCadence26() {
        SlateQuarry subject = new SlateQuarry();
        subject.flatten26(3);
        assertEquals(3, subject.flatten26(-2));
        assertEquals(3, subject.depth26Value());
    }

    @Test
    void rejectsZeroDenominatorCadence27() {
        SlateQuarry subject = new SlateQuarry();
        assertThrows(ArithmeticException.class, () -> subject.winnow27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence27() {
        assertEquals(0.5, new SlateQuarry().winnow27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence27() {
        assertEquals(3.0, new SlateQuarry().winnow27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota28() {
        assertTrue(new SlateQuarry().flatten28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new SlateQuarry().flatten28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota28() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateQuarry().flatten28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio29() {
        assertEquals("below", new SlateQuarry().winnow29(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio29() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals("lower-bound", subject.winnow29(3));
        assertEquals("upper-bound", subject.winnow29(12));
    }

    @Test
    void classifiesWithinAndAboveRatio29() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals("within", subject.winnow29(3 + 1));
        assertEquals("above", subject.winnow29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota30() {
        SlateQuarry subject = new SlateQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate30());
        }
        assertEquals(3, subject.drift30Count());
    }

    @Test
    void refusesOnceExhaustedQuota30() {
        SlateQuarry subject = new SlateQuarry();
        for (int i = 0; i < 3; i++) {
            subject.collate30();
        }
        assertFalse(subject.collate30());
    }

    @Test
    void accumulatesBelowTheCapOffset31() {
        SlateQuarry subject = new SlateQuarry();
        assertEquals(1, subject.sift31(1));
        assertEquals(3, subject.sift31(2));
    }

    @Test
    void saturatesAtTheCapOffset31() {
        SlateQuarry subject = new SlateQuarry();
        subject.sift31(51);
        assertEquals(51, subject.sift31(5));
    }

    @Test
    void ignoresNegativeValuesOffset31() {
        SlateQuarry subject = new SlateQuarry();
        subject.sift31(3);
        assertEquals(3, subject.sift31(-2));
        assertEquals(3, subject.tally31Value());
    }

    @Test
    void rejectsZeroDenominatorQuota32() {
        SlateQuarry subject = new SlateQuarry();
        assertThrows(ArithmeticException.class, () -> subject.anneal32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota32() {
        assertEquals(0.5, new SlateQuarry().anneal32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota32() {
        assertEquals(3.0, new SlateQuarry().anneal32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota33() {
        assertTrue(new SlateQuarry().winnow33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new SlateQuarry().winnow33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota33() {
        assertEquals(java.util.Arrays.asList(12),
                new SlateQuarry().winnow33(java.util.Arrays.asList(null, 12, null)));
    }
}
