package com.ashen.granary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantAnvilTest {

    @Test
    void returnsEmptyForNullDrift0() {
        assertTrue(new VerdantAnvil().sift0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new VerdantAnvil().sift0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift0() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantAnvil().sift0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift1() {
        assertEquals("below", new VerdantAnvil().furl1(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift1() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals("lower-bound", subject.furl1(3));
        assertEquals("upper-bound", subject.furl1(8));
    }

    @Test
    void classifiesWithinAndAboveDrift1() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals("within", subject.furl1(3 + 1));
        assertEquals("above", subject.furl1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity2() {
        VerdantAnvil subject = new VerdantAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper2());
        }
        assertEquals(3, subject.depth2Count());
    }

    @Test
    void refusesOnceExhaustedCapacity2() {
        VerdantAnvil subject = new VerdantAnvil();
        for (int i = 0; i < 3; i++) {
            subject.temper2();
        }
        assertFalse(subject.temper2());
    }

    @Test
    void accumulatesBelowTheCapDrift3() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals(1, subject.brace3(1));
        assertEquals(3, subject.brace3(2));
    }

    @Test
    void saturatesAtTheCapDrift3() {
        VerdantAnvil subject = new VerdantAnvil();
        subject.brace3(23);
        assertEquals(23, subject.brace3(5));
    }

    @Test
    void ignoresNegativeValuesDrift3() {
        VerdantAnvil subject = new VerdantAnvil();
        subject.brace3(3);
        assertEquals(3, subject.brace3(-2));
        assertEquals(3, subject.threshold3Value());
    }

    @Test
    void rejectsZeroDenominatorOffset4() {
        VerdantAnvil subject = new VerdantAnvil();
        assertThrows(ArithmeticException.class, () -> subject.sift4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset4() {
        assertEquals(0.5, new VerdantAnvil().sift4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset4() {
        assertEquals(5.0, new VerdantAnvil().sift4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset5() {
        assertTrue(new VerdantAnvil().gauge5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new VerdantAnvil().gauge5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset5() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantAnvil().gauge5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan6() {
        assertEquals("below", new VerdantAnvil().reconcile6(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan6() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals("lower-bound", subject.reconcile6(4));
        assertEquals("upper-bound", subject.reconcile6(7));
    }

    @Test
    void classifiesWithinAndAboveSpan6() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals("within", subject.reconcile6(4 + 1));
        assertEquals("above", subject.reconcile6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth7() {
        VerdantAnvil subject = new VerdantAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal7());
        }
        assertEquals(4, subject.margin7Count());
    }

    @Test
    void refusesOnceExhaustedDepth7() {
        VerdantAnvil subject = new VerdantAnvil();
        for (int i = 0; i < 4; i++) {
            subject.anneal7();
        }
        assertFalse(subject.anneal7());
    }

    @Test
    void accumulatesBelowTheCapQuota8() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals(1, subject.collate8(1));
        assertEquals(3, subject.collate8(2));
    }

    @Test
    void saturatesAtTheCapQuota8() {
        VerdantAnvil subject = new VerdantAnvil();
        subject.collate8(28);
        assertEquals(28, subject.collate8(5));
    }

    @Test
    void ignoresNegativeValuesQuota8() {
        VerdantAnvil subject = new VerdantAnvil();
        subject.collate8(3);
        assertEquals(3, subject.collate8(-2));
        assertEquals(3, subject.capacity8Value());
    }

    @Test
    void rejectsZeroDenominatorSpan9() {
        VerdantAnvil subject = new VerdantAnvil();
        assertThrows(ArithmeticException.class, () -> subject.tally9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan9() {
        assertEquals(0.5, new VerdantAnvil().tally9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan9() {
        assertEquals(5.0, new VerdantAnvil().tally9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold10() {
        assertTrue(new VerdantAnvil().brace10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new VerdantAnvil().brace10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold10() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantAnvil().brace10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan11() {
        assertEquals("below", new VerdantAnvil().brace11(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan11() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals("lower-bound", subject.brace11(5));
        assertEquals("upper-bound", subject.brace11(12));
    }

    @Test
    void classifiesWithinAndAboveSpan11() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals("within", subject.brace11(5 + 1));
        assertEquals("above", subject.brace11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias12() {
        VerdantAnvil subject = new VerdantAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten12());
        }
        assertEquals(1, subject.threshold12Count());
    }

    @Test
    void refusesOnceExhaustedBias12() {
        VerdantAnvil subject = new VerdantAnvil();
        for (int i = 0; i < 1; i++) {
            subject.flatten12();
        }
        assertFalse(subject.flatten12());
    }

    @Test
    void accumulatesBelowTheCapDrift13() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals(1, subject.furl13(1));
        assertEquals(3, subject.furl13(2));
    }

    @Test
    void saturatesAtTheCapDrift13() {
        VerdantAnvil subject = new VerdantAnvil();
        subject.furl13(33);
        assertEquals(33, subject.furl13(5));
    }

    @Test
    void ignoresNegativeValuesDrift13() {
        VerdantAnvil subject = new VerdantAnvil();
        subject.furl13(3);
        assertEquals(3, subject.furl13(-2));
        assertEquals(3, subject.quota13Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold14() {
        VerdantAnvil subject = new VerdantAnvil();
        assertThrows(ArithmeticException.class, () -> subject.hoist14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold14() {
        assertEquals(0.5, new VerdantAnvil().hoist14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold14() {
        assertEquals(5.0, new VerdantAnvil().hoist14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin15() {
        assertTrue(new VerdantAnvil().prune15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new VerdantAnvil().prune15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin15() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantAnvil().prune15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold16() {
        assertEquals("below", new VerdantAnvil().brace16(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold16() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals("lower-bound", subject.brace16(2));
        assertEquals("upper-bound", subject.brace16(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold16() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals("within", subject.brace16(2 + 1));
        assertEquals("above", subject.brace16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin17() {
        VerdantAnvil subject = new VerdantAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist17());
        }
        assertEquals(2, subject.drift17Count());
    }

    @Test
    void refusesOnceExhaustedMargin17() {
        VerdantAnvil subject = new VerdantAnvil();
        for (int i = 0; i < 2; i++) {
            subject.hoist17();
        }
        assertFalse(subject.hoist17());
    }

    @Test
    void accumulatesBelowTheCapYield18() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals(1, subject.anneal18(1));
        assertEquals(3, subject.anneal18(2));
    }

    @Test
    void saturatesAtTheCapYield18() {
        VerdantAnvil subject = new VerdantAnvil();
        subject.anneal18(38);
        assertEquals(38, subject.anneal18(5));
    }

    @Test
    void ignoresNegativeValuesYield18() {
        VerdantAnvil subject = new VerdantAnvil();
        subject.anneal18(3);
        assertEquals(3, subject.anneal18(-2));
        assertEquals(3, subject.cadence18Value());
    }

    @Test
    void rejectsZeroDenominatorDepth19() {
        VerdantAnvil subject = new VerdantAnvil();
        assertThrows(ArithmeticException.class, () -> subject.sift19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth19() {
        assertEquals(0.5, new VerdantAnvil().sift19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth19() {
        assertEquals(5.0, new VerdantAnvil().sift19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio20() {
        assertTrue(new VerdantAnvil().hoist20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new VerdantAnvil().hoist20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio20() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantAnvil().hoist20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift21() {
        assertEquals("below", new VerdantAnvil().anneal21(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift21() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals("lower-bound", subject.anneal21(3));
        assertEquals("upper-bound", subject.anneal21(10));
    }

    @Test
    void classifiesWithinAndAboveDrift21() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals("within", subject.anneal21(3 + 1));
        assertEquals("above", subject.anneal21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota22() {
        VerdantAnvil subject = new VerdantAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile22());
        }
        assertEquals(3, subject.capacity22Count());
    }

    @Test
    void refusesOnceExhaustedQuota22() {
        VerdantAnvil subject = new VerdantAnvil();
        for (int i = 0; i < 3; i++) {
            subject.reconcile22();
        }
        assertFalse(subject.reconcile22());
    }

    @Test
    void accumulatesBelowTheCapQuota23() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals(1, subject.gauge23(1));
        assertEquals(3, subject.gauge23(2));
    }

    @Test
    void saturatesAtTheCapQuota23() {
        VerdantAnvil subject = new VerdantAnvil();
        subject.gauge23(43);
        assertEquals(43, subject.gauge23(5));
    }

    @Test
    void ignoresNegativeValuesQuota23() {
        VerdantAnvil subject = new VerdantAnvil();
        subject.gauge23(3);
        assertEquals(3, subject.gauge23(-2));
        assertEquals(3, subject.ratio23Value());
    }

    @Test
    void rejectsZeroDenominatorMargin24() {
        VerdantAnvil subject = new VerdantAnvil();
        assertThrows(ArithmeticException.class, () -> subject.furl24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin24() {
        assertEquals(0.5, new VerdantAnvil().furl24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin24() {
        assertEquals(5.0, new VerdantAnvil().furl24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset25() {
        assertTrue(new VerdantAnvil().sift25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new VerdantAnvil().sift25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset25() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantAnvil().sift25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias26() {
        assertEquals("below", new VerdantAnvil().collate26(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias26() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals("lower-bound", subject.collate26(4));
        assertEquals("upper-bound", subject.collate26(9));
    }

    @Test
    void classifiesWithinAndAboveBias26() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals("within", subject.collate26(4 + 1));
        assertEquals("above", subject.collate26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift27() {
        VerdantAnvil subject = new VerdantAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge27());
        }
        assertEquals(4, subject.capacity27Count());
    }

    @Test
    void refusesOnceExhaustedDrift27() {
        VerdantAnvil subject = new VerdantAnvil();
        for (int i = 0; i < 4; i++) {
            subject.gauge27();
        }
        assertFalse(subject.gauge27());
    }

    @Test
    void accumulatesBelowTheCapSpan28() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals(1, subject.flatten28(1));
        assertEquals(3, subject.flatten28(2));
    }

    @Test
    void saturatesAtTheCapSpan28() {
        VerdantAnvil subject = new VerdantAnvil();
        subject.flatten28(48);
        assertEquals(48, subject.flatten28(5));
    }

    @Test
    void ignoresNegativeValuesSpan28() {
        VerdantAnvil subject = new VerdantAnvil();
        subject.flatten28(3);
        assertEquals(3, subject.flatten28(-2));
        assertEquals(3, subject.threshold28Value());
    }

    @Test
    void rejectsZeroDenominatorDepth29() {
        VerdantAnvil subject = new VerdantAnvil();
        assertThrows(ArithmeticException.class, () -> subject.gauge29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth29() {
        assertEquals(0.5, new VerdantAnvil().gauge29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth29() {
        assertEquals(5.0, new VerdantAnvil().gauge29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset30() {
        assertTrue(new VerdantAnvil().anneal30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new VerdantAnvil().anneal30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset30() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantAnvil().anneal30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio31() {
        assertEquals("below", new VerdantAnvil().gauge31(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio31() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals("lower-bound", subject.gauge31(5));
        assertEquals("upper-bound", subject.gauge31(8));
    }

    @Test
    void classifiesWithinAndAboveRatio31() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals("within", subject.gauge31(5 + 1));
        assertEquals("above", subject.gauge31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin32() {
        VerdantAnvil subject = new VerdantAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile32());
        }
        assertEquals(1, subject.ratio32Count());
    }

    @Test
    void refusesOnceExhaustedMargin32() {
        VerdantAnvil subject = new VerdantAnvil();
        for (int i = 0; i < 1; i++) {
            subject.reconcile32();
        }
        assertFalse(subject.reconcile32());
    }

    @Test
    void accumulatesBelowTheCapDrift33() {
        VerdantAnvil subject = new VerdantAnvil();
        assertEquals(1, subject.sift33(1));
        assertEquals(3, subject.sift33(2));
    }

    @Test
    void saturatesAtTheCapDrift33() {
        VerdantAnvil subject = new VerdantAnvil();
        subject.sift33(53);
        assertEquals(53, subject.sift33(5));
    }

    @Test
    void ignoresNegativeValuesDrift33() {
        VerdantAnvil subject = new VerdantAnvil();
        subject.sift33(3);
        assertEquals(3, subject.sift33(-2));
        assertEquals(3, subject.ratio33Value());
    }

    @Test
    void rejectsZeroDenominatorDrift34() {
        VerdantAnvil subject = new VerdantAnvil();
        assertThrows(ArithmeticException.class, () -> subject.collate34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift34() {
        assertEquals(0.5, new VerdantAnvil().collate34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift34() {
        assertEquals(5.0, new VerdantAnvil().collate34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield35() {
        assertTrue(new VerdantAnvil().prune35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new VerdantAnvil().prune35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield35() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantAnvil().prune35(java.util.Arrays.asList(null, 14, null)));
    }
}
