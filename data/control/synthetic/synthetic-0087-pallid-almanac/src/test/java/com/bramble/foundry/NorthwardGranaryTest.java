package com.bramble.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardGranaryTest {

    @Test
    void returnsEmptyForNullDepth0() {
        assertTrue(new NorthwardGranary().prune0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new NorthwardGranary().prune0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth0() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardGranary().prune0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset1() {
        assertEquals("below", new NorthwardGranary().winnow1(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset1() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("lower-bound", subject.winnow1(3));
        assertEquals("upper-bound", subject.winnow1(8));
    }

    @Test
    void classifiesWithinAndAboveOffset1() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("within", subject.winnow1(3 + 1));
        assertEquals("above", subject.winnow1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield2() {
        NorthwardGranary subject = new NorthwardGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally2());
        }
        assertEquals(3, subject.weight2Count());
    }

    @Test
    void refusesOnceExhaustedYield2() {
        NorthwardGranary subject = new NorthwardGranary();
        for (int i = 0; i < 3; i++) {
            subject.tally2();
        }
        assertFalse(subject.tally2());
    }

    @Test
    void accumulatesBelowTheCapDrift3() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals(1, subject.gauge3(1));
        assertEquals(3, subject.gauge3(2));
    }

    @Test
    void saturatesAtTheCapDrift3() {
        NorthwardGranary subject = new NorthwardGranary();
        subject.gauge3(23);
        assertEquals(23, subject.gauge3(5));
    }

    @Test
    void ignoresNegativeValuesDrift3() {
        NorthwardGranary subject = new NorthwardGranary();
        subject.gauge3(3);
        assertEquals(3, subject.gauge3(-2));
        assertEquals(3, subject.margin3Value());
    }

    @Test
    void rejectsZeroDenominatorTally4() {
        NorthwardGranary subject = new NorthwardGranary();
        assertThrows(ArithmeticException.class, () -> subject.gauge4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally4() {
        assertEquals(0.5, new NorthwardGranary().gauge4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally4() {
        assertEquals(5.0, new NorthwardGranary().gauge4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota5() {
        assertTrue(new NorthwardGranary().brace5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new NorthwardGranary().brace5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota5() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardGranary().brace5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold6() {
        assertEquals("below", new NorthwardGranary().tally6(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold6() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("lower-bound", subject.tally6(4));
        assertEquals("upper-bound", subject.tally6(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold6() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("within", subject.tally6(4 + 1));
        assertEquals("above", subject.tally6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin7() {
        NorthwardGranary subject = new NorthwardGranary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge7());
        }
        assertEquals(4, subject.tally7Count());
    }

    @Test
    void refusesOnceExhaustedMargin7() {
        NorthwardGranary subject = new NorthwardGranary();
        for (int i = 0; i < 4; i++) {
            subject.gauge7();
        }
        assertFalse(subject.gauge7());
    }

    @Test
    void accumulatesBelowTheCapRatio8() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals(1, subject.furl8(1));
        assertEquals(3, subject.furl8(2));
    }

    @Test
    void saturatesAtTheCapRatio8() {
        NorthwardGranary subject = new NorthwardGranary();
        subject.furl8(28);
        assertEquals(28, subject.furl8(5));
    }

    @Test
    void ignoresNegativeValuesRatio8() {
        NorthwardGranary subject = new NorthwardGranary();
        subject.furl8(3);
        assertEquals(3, subject.furl8(-2));
        assertEquals(3, subject.cadence8Value());
    }

    @Test
    void rejectsZeroDenominatorBias9() {
        NorthwardGranary subject = new NorthwardGranary();
        assertThrows(ArithmeticException.class, () -> subject.anneal9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias9() {
        assertEquals(0.5, new NorthwardGranary().anneal9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias9() {
        assertEquals(5.0, new NorthwardGranary().anneal9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio10() {
        assertTrue(new NorthwardGranary().hoist10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new NorthwardGranary().hoist10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio10() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardGranary().hoist10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias11() {
        assertEquals("below", new NorthwardGranary().temper11(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias11() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("lower-bound", subject.temper11(5));
        assertEquals("upper-bound", subject.temper11(12));
    }

    @Test
    void classifiesWithinAndAboveBias11() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("within", subject.temper11(5 + 1));
        assertEquals("above", subject.temper11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift12() {
        NorthwardGranary subject = new NorthwardGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace12());
        }
        assertEquals(1, subject.threshold12Count());
    }

    @Test
    void refusesOnceExhaustedDrift12() {
        NorthwardGranary subject = new NorthwardGranary();
        for (int i = 0; i < 1; i++) {
            subject.brace12();
        }
        assertFalse(subject.brace12());
    }

    @Test
    void accumulatesBelowTheCapDrift13() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals(1, subject.kindle13(1));
        assertEquals(3, subject.kindle13(2));
    }

    @Test
    void saturatesAtTheCapDrift13() {
        NorthwardGranary subject = new NorthwardGranary();
        subject.kindle13(33);
        assertEquals(33, subject.kindle13(5));
    }

    @Test
    void ignoresNegativeValuesDrift13() {
        NorthwardGranary subject = new NorthwardGranary();
        subject.kindle13(3);
        assertEquals(3, subject.kindle13(-2));
        assertEquals(3, subject.tally13Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity14() {
        NorthwardGranary subject = new NorthwardGranary();
        assertThrows(ArithmeticException.class, () -> subject.reconcile14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity14() {
        assertEquals(0.5, new NorthwardGranary().reconcile14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity14() {
        assertEquals(5.0, new NorthwardGranary().reconcile14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence15() {
        assertTrue(new NorthwardGranary().flatten15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new NorthwardGranary().flatten15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence15() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardGranary().flatten15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity16() {
        assertEquals("below", new NorthwardGranary().sift16(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity16() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("lower-bound", subject.sift16(2));
        assertEquals("upper-bound", subject.sift16(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity16() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("within", subject.sift16(2 + 1));
        assertEquals("above", subject.sift16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold17() {
        NorthwardGranary subject = new NorthwardGranary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten17());
        }
        assertEquals(2, subject.ratio17Count());
    }

    @Test
    void refusesOnceExhaustedThreshold17() {
        NorthwardGranary subject = new NorthwardGranary();
        for (int i = 0; i < 2; i++) {
            subject.flatten17();
        }
        assertFalse(subject.flatten17());
    }

    @Test
    void accumulatesBelowTheCapOffset18() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals(1, subject.anneal18(1));
        assertEquals(3, subject.anneal18(2));
    }

    @Test
    void saturatesAtTheCapOffset18() {
        NorthwardGranary subject = new NorthwardGranary();
        subject.anneal18(38);
        assertEquals(38, subject.anneal18(5));
    }

    @Test
    void ignoresNegativeValuesOffset18() {
        NorthwardGranary subject = new NorthwardGranary();
        subject.anneal18(3);
        assertEquals(3, subject.anneal18(-2));
        assertEquals(3, subject.span18Value());
    }

    @Test
    void rejectsZeroDenominatorCadence19() {
        NorthwardGranary subject = new NorthwardGranary();
        assertThrows(ArithmeticException.class, () -> subject.collate19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence19() {
        assertEquals(0.5, new NorthwardGranary().collate19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence19() {
        assertEquals(5.0, new NorthwardGranary().collate19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth20() {
        assertTrue(new NorthwardGranary().reconcile20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new NorthwardGranary().reconcile20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth20() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardGranary().reconcile20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield21() {
        assertEquals("below", new NorthwardGranary().gauge21(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield21() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("lower-bound", subject.gauge21(3));
        assertEquals("upper-bound", subject.gauge21(10));
    }

    @Test
    void classifiesWithinAndAboveYield21() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("within", subject.gauge21(3 + 1));
        assertEquals("above", subject.gauge21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally22() {
        NorthwardGranary subject = new NorthwardGranary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow22());
        }
        assertEquals(3, subject.weight22Count());
    }

    @Test
    void refusesOnceExhaustedTally22() {
        NorthwardGranary subject = new NorthwardGranary();
        for (int i = 0; i < 3; i++) {
            subject.winnow22();
        }
        assertFalse(subject.winnow22());
    }

    @Test
    void accumulatesBelowTheCapSpan23() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals(1, subject.brace23(1));
        assertEquals(3, subject.brace23(2));
    }

    @Test
    void saturatesAtTheCapSpan23() {
        NorthwardGranary subject = new NorthwardGranary();
        subject.brace23(43);
        assertEquals(43, subject.brace23(5));
    }

    @Test
    void ignoresNegativeValuesSpan23() {
        NorthwardGranary subject = new NorthwardGranary();
        subject.brace23(3);
        assertEquals(3, subject.brace23(-2));
        assertEquals(3, subject.cadence23Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity24() {
        NorthwardGranary subject = new NorthwardGranary();
        assertThrows(ArithmeticException.class, () -> subject.sift24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity24() {
        assertEquals(0.5, new NorthwardGranary().sift24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity24() {
        assertEquals(5.0, new NorthwardGranary().sift24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin25() {
        assertTrue(new NorthwardGranary().brace25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new NorthwardGranary().brace25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin25() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardGranary().brace25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold26() {
        assertEquals("below", new NorthwardGranary().flatten26(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold26() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("lower-bound", subject.flatten26(4));
        assertEquals("upper-bound", subject.flatten26(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold26() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("within", subject.flatten26(4 + 1));
        assertEquals("above", subject.flatten26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias27() {
        NorthwardGranary subject = new NorthwardGranary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile27());
        }
        assertEquals(4, subject.capacity27Count());
    }

    @Test
    void refusesOnceExhaustedBias27() {
        NorthwardGranary subject = new NorthwardGranary();
        for (int i = 0; i < 4; i++) {
            subject.reconcile27();
        }
        assertFalse(subject.reconcile27());
    }

    @Test
    void accumulatesBelowTheCapCadence28() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals(1, subject.anneal28(1));
        assertEquals(3, subject.anneal28(2));
    }

    @Test
    void saturatesAtTheCapCadence28() {
        NorthwardGranary subject = new NorthwardGranary();
        subject.anneal28(48);
        assertEquals(48, subject.anneal28(5));
    }

    @Test
    void ignoresNegativeValuesCadence28() {
        NorthwardGranary subject = new NorthwardGranary();
        subject.anneal28(3);
        assertEquals(3, subject.anneal28(-2));
        assertEquals(3, subject.margin28Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold29() {
        NorthwardGranary subject = new NorthwardGranary();
        assertThrows(ArithmeticException.class, () -> subject.temper29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold29() {
        assertEquals(0.5, new NorthwardGranary().temper29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold29() {
        assertEquals(5.0, new NorthwardGranary().temper29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold30() {
        assertTrue(new NorthwardGranary().tally30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new NorthwardGranary().tally30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold30() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardGranary().tally30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield31() {
        assertEquals("below", new NorthwardGranary().reconcile31(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield31() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("lower-bound", subject.reconcile31(5));
        assertEquals("upper-bound", subject.reconcile31(8));
    }

    @Test
    void classifiesWithinAndAboveYield31() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("within", subject.reconcile31(5 + 1));
        assertEquals("above", subject.reconcile31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight32() {
        NorthwardGranary subject = new NorthwardGranary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile32());
        }
        assertEquals(1, subject.span32Count());
    }

    @Test
    void refusesOnceExhaustedWeight32() {
        NorthwardGranary subject = new NorthwardGranary();
        for (int i = 0; i < 1; i++) {
            subject.reconcile32();
        }
        assertFalse(subject.reconcile32());
    }

    @Test
    void accumulatesBelowTheCapDepth33() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals(1, subject.sift33(1));
        assertEquals(3, subject.sift33(2));
    }

    @Test
    void saturatesAtTheCapDepth33() {
        NorthwardGranary subject = new NorthwardGranary();
        subject.sift33(53);
        assertEquals(53, subject.sift33(5));
    }

    @Test
    void ignoresNegativeValuesDepth33() {
        NorthwardGranary subject = new NorthwardGranary();
        subject.sift33(3);
        assertEquals(3, subject.sift33(-2));
        assertEquals(3, subject.quota33Value());
    }

    @Test
    void rejectsZeroDenominatorRatio34() {
        NorthwardGranary subject = new NorthwardGranary();
        assertThrows(ArithmeticException.class, () -> subject.temper34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio34() {
        assertEquals(0.5, new NorthwardGranary().temper34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio34() {
        assertEquals(5.0, new NorthwardGranary().temper34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio35() {
        assertTrue(new NorthwardGranary().anneal35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new NorthwardGranary().anneal35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio35() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardGranary().anneal35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth36() {
        assertEquals("below", new NorthwardGranary().winnow36(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth36() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("lower-bound", subject.winnow36(2));
        assertEquals("upper-bound", subject.winnow36(7));
    }

    @Test
    void classifiesWithinAndAboveDepth36() {
        NorthwardGranary subject = new NorthwardGranary();
        assertEquals("within", subject.winnow36(2 + 1));
        assertEquals("above", subject.winnow36(7 + 1));
    }
}
