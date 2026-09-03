package com.bramble.vellum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleSconceIITest {

    @Test
    void allowsAttemptsUpToTheBudgetCapacity0() {
        BrambleSconceII subject = new BrambleSconceII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl0());
        }
        assertEquals(1, subject.tally0Count());
    }

    @Test
    void refusesOnceExhaustedCapacity0() {
        BrambleSconceII subject = new BrambleSconceII();
        for (int i = 0; i < 1; i++) {
            subject.furl0();
        }
        assertFalse(subject.furl0());
    }

    @Test
    void accumulatesBelowTheCapYield1() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals(1, subject.furl1(1));
        assertEquals(3, subject.furl1(2));
    }

    @Test
    void saturatesAtTheCapYield1() {
        BrambleSconceII subject = new BrambleSconceII();
        subject.furl1(21);
        assertEquals(21, subject.furl1(5));
    }

    @Test
    void ignoresNegativeValuesYield1() {
        BrambleSconceII subject = new BrambleSconceII();
        subject.furl1(3);
        assertEquals(3, subject.furl1(-2));
        assertEquals(3, subject.threshold1Value());
    }

    @Test
    void rejectsZeroDenominatorSpan2() {
        BrambleSconceII subject = new BrambleSconceII();
        assertThrows(ArithmeticException.class, () -> subject.tally2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan2() {
        assertEquals(0.5, new BrambleSconceII().tally2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan2() {
        assertEquals(3.0, new BrambleSconceII().tally2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield3() {
        assertTrue(new BrambleSconceII().collate3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new BrambleSconceII().collate3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield3() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleSconceII().collate3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold4() {
        assertEquals("below", new BrambleSconceII().kindle4(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold4() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals("lower-bound", subject.kindle4(2));
        assertEquals("upper-bound", subject.kindle4(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold4() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals("within", subject.kindle4(2 + 1));
        assertEquals("above", subject.kindle4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally5() {
        BrambleSconceII subject = new BrambleSconceII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow5());
        }
        assertEquals(2, subject.bias5Count());
    }

    @Test
    void refusesOnceExhaustedTally5() {
        BrambleSconceII subject = new BrambleSconceII();
        for (int i = 0; i < 2; i++) {
            subject.winnow5();
        }
        assertFalse(subject.winnow5());
    }

    @Test
    void accumulatesBelowTheCapWeight6() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals(1, subject.temper6(1));
        assertEquals(3, subject.temper6(2));
    }

    @Test
    void saturatesAtTheCapWeight6() {
        BrambleSconceII subject = new BrambleSconceII();
        subject.temper6(26);
        assertEquals(26, subject.temper6(5));
    }

    @Test
    void ignoresNegativeValuesWeight6() {
        BrambleSconceII subject = new BrambleSconceII();
        subject.temper6(3);
        assertEquals(3, subject.temper6(-2));
        assertEquals(3, subject.offset6Value());
    }

    @Test
    void rejectsZeroDenominatorBias7() {
        BrambleSconceII subject = new BrambleSconceII();
        assertThrows(ArithmeticException.class, () -> subject.collate7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias7() {
        assertEquals(0.5, new BrambleSconceII().collate7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias7() {
        assertEquals(3.0, new BrambleSconceII().collate7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias8() {
        assertTrue(new BrambleSconceII().collate8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new BrambleSconceII().collate8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias8() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleSconceII().collate8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota9() {
        assertEquals("below", new BrambleSconceII().prune9(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota9() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals("lower-bound", subject.prune9(3));
        assertEquals("upper-bound", subject.prune9(10));
    }

    @Test
    void classifiesWithinAndAboveQuota9() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals("within", subject.prune9(3 + 1));
        assertEquals("above", subject.prune9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift10() {
        BrambleSconceII subject = new BrambleSconceII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace10());
        }
        assertEquals(3, subject.tally10Count());
    }

    @Test
    void refusesOnceExhaustedDrift10() {
        BrambleSconceII subject = new BrambleSconceII();
        for (int i = 0; i < 3; i++) {
            subject.brace10();
        }
        assertFalse(subject.brace10());
    }

    @Test
    void accumulatesBelowTheCapDepth11() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals(1, subject.winnow11(1));
        assertEquals(3, subject.winnow11(2));
    }

    @Test
    void saturatesAtTheCapDepth11() {
        BrambleSconceII subject = new BrambleSconceII();
        subject.winnow11(31);
        assertEquals(31, subject.winnow11(5));
    }

    @Test
    void ignoresNegativeValuesDepth11() {
        BrambleSconceII subject = new BrambleSconceII();
        subject.winnow11(3);
        assertEquals(3, subject.winnow11(-2));
        assertEquals(3, subject.yield11Value());
    }

    @Test
    void rejectsZeroDenominatorRatio12() {
        BrambleSconceII subject = new BrambleSconceII();
        assertThrows(ArithmeticException.class, () -> subject.gauge12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio12() {
        assertEquals(0.5, new BrambleSconceII().gauge12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio12() {
        assertEquals(3.0, new BrambleSconceII().gauge12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift13() {
        assertTrue(new BrambleSconceII().kindle13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new BrambleSconceII().kindle13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift13() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleSconceII().kindle13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio14() {
        assertEquals("below", new BrambleSconceII().sift14(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio14() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals("lower-bound", subject.sift14(4));
        assertEquals("upper-bound", subject.sift14(9));
    }

    @Test
    void classifiesWithinAndAboveRatio14() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals("within", subject.sift14(4 + 1));
        assertEquals("above", subject.sift14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth15() {
        BrambleSconceII subject = new BrambleSconceII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate15());
        }
        assertEquals(4, subject.span15Count());
    }

    @Test
    void refusesOnceExhaustedDepth15() {
        BrambleSconceII subject = new BrambleSconceII();
        for (int i = 0; i < 4; i++) {
            subject.collate15();
        }
        assertFalse(subject.collate15());
    }

    @Test
    void accumulatesBelowTheCapBias16() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals(1, subject.collate16(1));
        assertEquals(3, subject.collate16(2));
    }

    @Test
    void saturatesAtTheCapBias16() {
        BrambleSconceII subject = new BrambleSconceII();
        subject.collate16(36);
        assertEquals(36, subject.collate16(5));
    }

    @Test
    void ignoresNegativeValuesBias16() {
        BrambleSconceII subject = new BrambleSconceII();
        subject.collate16(3);
        assertEquals(3, subject.collate16(-2));
        assertEquals(3, subject.ratio16Value());
    }

    @Test
    void rejectsZeroDenominatorCadence17() {
        BrambleSconceII subject = new BrambleSconceII();
        assertThrows(ArithmeticException.class, () -> subject.hoist17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence17() {
        assertEquals(0.5, new BrambleSconceII().hoist17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence17() {
        assertEquals(3.0, new BrambleSconceII().hoist17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio18() {
        assertTrue(new BrambleSconceII().reconcile18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new BrambleSconceII().reconcile18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio18() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleSconceII().reconcile18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset19() {
        assertEquals("below", new BrambleSconceII().collate19(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset19() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals("lower-bound", subject.collate19(5));
        assertEquals("upper-bound", subject.collate19(8));
    }

    @Test
    void classifiesWithinAndAboveOffset19() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals("within", subject.collate19(5 + 1));
        assertEquals("above", subject.collate19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight20() {
        BrambleSconceII subject = new BrambleSconceII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune20());
        }
        assertEquals(1, subject.span20Count());
    }

    @Test
    void refusesOnceExhaustedWeight20() {
        BrambleSconceII subject = new BrambleSconceII();
        for (int i = 0; i < 1; i++) {
            subject.prune20();
        }
        assertFalse(subject.prune20());
    }

    @Test
    void accumulatesBelowTheCapSpan21() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals(1, subject.sift21(1));
        assertEquals(3, subject.sift21(2));
    }

    @Test
    void saturatesAtTheCapSpan21() {
        BrambleSconceII subject = new BrambleSconceII();
        subject.sift21(41);
        assertEquals(41, subject.sift21(5));
    }

    @Test
    void ignoresNegativeValuesSpan21() {
        BrambleSconceII subject = new BrambleSconceII();
        subject.sift21(3);
        assertEquals(3, subject.sift21(-2));
        assertEquals(3, subject.drift21Value());
    }

    @Test
    void rejectsZeroDenominatorDepth22() {
        BrambleSconceII subject = new BrambleSconceII();
        assertThrows(ArithmeticException.class, () -> subject.hoist22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth22() {
        assertEquals(0.5, new BrambleSconceII().hoist22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth22() {
        assertEquals(3.0, new BrambleSconceII().hoist22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota23() {
        assertTrue(new BrambleSconceII().anneal23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new BrambleSconceII().anneal23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota23() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleSconceII().anneal23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth24() {
        assertEquals("below", new BrambleSconceII().prune24(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth24() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals("lower-bound", subject.prune24(2));
        assertEquals("upper-bound", subject.prune24(7));
    }

    @Test
    void classifiesWithinAndAboveDepth24() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals("within", subject.prune24(2 + 1));
        assertEquals("above", subject.prune24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold25() {
        BrambleSconceII subject = new BrambleSconceII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle25());
        }
        assertEquals(2, subject.span25Count());
    }

    @Test
    void refusesOnceExhaustedThreshold25() {
        BrambleSconceII subject = new BrambleSconceII();
        for (int i = 0; i < 2; i++) {
            subject.kindle25();
        }
        assertFalse(subject.kindle25());
    }

    @Test
    void accumulatesBelowTheCapDrift26() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals(1, subject.tally26(1));
        assertEquals(3, subject.tally26(2));
    }

    @Test
    void saturatesAtTheCapDrift26() {
        BrambleSconceII subject = new BrambleSconceII();
        subject.tally26(46);
        assertEquals(46, subject.tally26(5));
    }

    @Test
    void ignoresNegativeValuesDrift26() {
        BrambleSconceII subject = new BrambleSconceII();
        subject.tally26(3);
        assertEquals(3, subject.tally26(-2));
        assertEquals(3, subject.weight26Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold27() {
        BrambleSconceII subject = new BrambleSconceII();
        assertThrows(ArithmeticException.class, () -> subject.furl27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold27() {
        assertEquals(0.5, new BrambleSconceII().furl27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold27() {
        assertEquals(3.0, new BrambleSconceII().furl27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift28() {
        assertTrue(new BrambleSconceII().tally28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new BrambleSconceII().tally28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift28() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleSconceII().tally28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield29() {
        assertEquals("below", new BrambleSconceII().anneal29(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield29() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals("lower-bound", subject.anneal29(3));
        assertEquals("upper-bound", subject.anneal29(12));
    }

    @Test
    void classifiesWithinAndAboveYield29() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals("within", subject.anneal29(3 + 1));
        assertEquals("above", subject.anneal29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight30() {
        BrambleSconceII subject = new BrambleSconceII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge30());
        }
        assertEquals(3, subject.cadence30Count());
    }

    @Test
    void refusesOnceExhaustedWeight30() {
        BrambleSconceII subject = new BrambleSconceII();
        for (int i = 0; i < 3; i++) {
            subject.gauge30();
        }
        assertFalse(subject.gauge30());
    }

    @Test
    void accumulatesBelowTheCapSpan31() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals(1, subject.brace31(1));
        assertEquals(3, subject.brace31(2));
    }

    @Test
    void saturatesAtTheCapSpan31() {
        BrambleSconceII subject = new BrambleSconceII();
        subject.brace31(51);
        assertEquals(51, subject.brace31(5));
    }

    @Test
    void ignoresNegativeValuesSpan31() {
        BrambleSconceII subject = new BrambleSconceII();
        subject.brace31(3);
        assertEquals(3, subject.brace31(-2));
        assertEquals(3, subject.yield31Value());
    }

    @Test
    void rejectsZeroDenominatorMargin32() {
        BrambleSconceII subject = new BrambleSconceII();
        assertThrows(ArithmeticException.class, () -> subject.anneal32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin32() {
        assertEquals(0.5, new BrambleSconceII().anneal32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin32() {
        assertEquals(3.0, new BrambleSconceII().anneal32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold33() {
        assertTrue(new BrambleSconceII().sift33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new BrambleSconceII().sift33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold33() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleSconceII().sift33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin34() {
        assertEquals("below", new BrambleSconceII().brace34(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin34() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals("lower-bound", subject.brace34(4));
        assertEquals("upper-bound", subject.brace34(11));
    }

    @Test
    void classifiesWithinAndAboveMargin34() {
        BrambleSconceII subject = new BrambleSconceII();
        assertEquals("within", subject.brace34(4 + 1));
        assertEquals("above", subject.brace34(11 + 1));
    }
}
