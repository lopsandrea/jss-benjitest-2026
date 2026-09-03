package com.bramble.chandler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperTrellisTest {

    @Test
    void allowsAttemptsUpToTheBudgetQuota0() {
        CopperTrellis subject = new CopperTrellis();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate0());
        }
        assertEquals(1, subject.capacity0Count());
    }

    @Test
    void refusesOnceExhaustedQuota0() {
        CopperTrellis subject = new CopperTrellis();
        for (int i = 0; i < 1; i++) {
            subject.collate0();
        }
        assertFalse(subject.collate0());
    }

    @Test
    void accumulatesBelowTheCapYield1() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals(1, subject.kindle1(1));
        assertEquals(3, subject.kindle1(2));
    }

    @Test
    void saturatesAtTheCapYield1() {
        CopperTrellis subject = new CopperTrellis();
        subject.kindle1(21);
        assertEquals(21, subject.kindle1(5));
    }

    @Test
    void ignoresNegativeValuesYield1() {
        CopperTrellis subject = new CopperTrellis();
        subject.kindle1(3);
        assertEquals(3, subject.kindle1(-2));
        assertEquals(3, subject.drift1Value());
    }

    @Test
    void rejectsZeroDenominatorCadence2() {
        CopperTrellis subject = new CopperTrellis();
        assertThrows(ArithmeticException.class, () -> subject.reconcile2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence2() {
        assertEquals(0.5, new CopperTrellis().reconcile2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence2() {
        assertEquals(3.0, new CopperTrellis().reconcile2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence3() {
        assertTrue(new CopperTrellis().flatten3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new CopperTrellis().flatten3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence3() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperTrellis().flatten3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence4() {
        assertEquals("below", new CopperTrellis().tally4(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence4() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals("lower-bound", subject.tally4(2));
        assertEquals("upper-bound", subject.tally4(11));
    }

    @Test
    void classifiesWithinAndAboveCadence4() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals("within", subject.tally4(2 + 1));
        assertEquals("above", subject.tally4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio5() {
        CopperTrellis subject = new CopperTrellis();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal5());
        }
        assertEquals(2, subject.yield5Count());
    }

    @Test
    void refusesOnceExhaustedRatio5() {
        CopperTrellis subject = new CopperTrellis();
        for (int i = 0; i < 2; i++) {
            subject.anneal5();
        }
        assertFalse(subject.anneal5());
    }

    @Test
    void accumulatesBelowTheCapTally6() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals(1, subject.anneal6(1));
        assertEquals(3, subject.anneal6(2));
    }

    @Test
    void saturatesAtTheCapTally6() {
        CopperTrellis subject = new CopperTrellis();
        subject.anneal6(26);
        assertEquals(26, subject.anneal6(5));
    }

    @Test
    void ignoresNegativeValuesTally6() {
        CopperTrellis subject = new CopperTrellis();
        subject.anneal6(3);
        assertEquals(3, subject.anneal6(-2));
        assertEquals(3, subject.depth6Value());
    }

    @Test
    void rejectsZeroDenominatorBias7() {
        CopperTrellis subject = new CopperTrellis();
        assertThrows(ArithmeticException.class, () -> subject.collate7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias7() {
        assertEquals(0.5, new CopperTrellis().collate7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias7() {
        assertEquals(3.0, new CopperTrellis().collate7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin8() {
        assertTrue(new CopperTrellis().temper8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new CopperTrellis().temper8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin8() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperTrellis().temper8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight9() {
        assertEquals("below", new CopperTrellis().kindle9(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight9() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals("lower-bound", subject.kindle9(3));
        assertEquals("upper-bound", subject.kindle9(10));
    }

    @Test
    void classifiesWithinAndAboveWeight9() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals("within", subject.kindle9(3 + 1));
        assertEquals("above", subject.kindle9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence10() {
        CopperTrellis subject = new CopperTrellis();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally10());
        }
        assertEquals(3, subject.margin10Count());
    }

    @Test
    void refusesOnceExhaustedCadence10() {
        CopperTrellis subject = new CopperTrellis();
        for (int i = 0; i < 3; i++) {
            subject.tally10();
        }
        assertFalse(subject.tally10());
    }

    @Test
    void accumulatesBelowTheCapCapacity11() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals(1, subject.flatten11(1));
        assertEquals(3, subject.flatten11(2));
    }

    @Test
    void saturatesAtTheCapCapacity11() {
        CopperTrellis subject = new CopperTrellis();
        subject.flatten11(31);
        assertEquals(31, subject.flatten11(5));
    }

    @Test
    void ignoresNegativeValuesCapacity11() {
        CopperTrellis subject = new CopperTrellis();
        subject.flatten11(3);
        assertEquals(3, subject.flatten11(-2));
        assertEquals(3, subject.cadence11Value());
    }

    @Test
    void rejectsZeroDenominatorQuota12() {
        CopperTrellis subject = new CopperTrellis();
        assertThrows(ArithmeticException.class, () -> subject.gauge12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota12() {
        assertEquals(0.5, new CopperTrellis().gauge12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota12() {
        assertEquals(3.0, new CopperTrellis().gauge12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift13() {
        assertTrue(new CopperTrellis().temper13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new CopperTrellis().temper13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift13() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperTrellis().temper13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally14() {
        assertEquals("below", new CopperTrellis().prune14(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally14() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals("lower-bound", subject.prune14(4));
        assertEquals("upper-bound", subject.prune14(9));
    }

    @Test
    void classifiesWithinAndAboveTally14() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals("within", subject.prune14(4 + 1));
        assertEquals("above", subject.prune14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift15() {
        CopperTrellis subject = new CopperTrellis();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift15());
        }
        assertEquals(4, subject.quota15Count());
    }

    @Test
    void refusesOnceExhaustedDrift15() {
        CopperTrellis subject = new CopperTrellis();
        for (int i = 0; i < 4; i++) {
            subject.sift15();
        }
        assertFalse(subject.sift15());
    }

    @Test
    void accumulatesBelowTheCapOffset16() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals(1, subject.sift16(1));
        assertEquals(3, subject.sift16(2));
    }

    @Test
    void saturatesAtTheCapOffset16() {
        CopperTrellis subject = new CopperTrellis();
        subject.sift16(36);
        assertEquals(36, subject.sift16(5));
    }

    @Test
    void ignoresNegativeValuesOffset16() {
        CopperTrellis subject = new CopperTrellis();
        subject.sift16(3);
        assertEquals(3, subject.sift16(-2));
        assertEquals(3, subject.cadence16Value());
    }

    @Test
    void rejectsZeroDenominatorBias17() {
        CopperTrellis subject = new CopperTrellis();
        assertThrows(ArithmeticException.class, () -> subject.kindle17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias17() {
        assertEquals(0.5, new CopperTrellis().kindle17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias17() {
        assertEquals(3.0, new CopperTrellis().kindle17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift18() {
        assertTrue(new CopperTrellis().furl18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new CopperTrellis().furl18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift18() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperTrellis().furl18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield19() {
        assertEquals("below", new CopperTrellis().tally19(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield19() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals("lower-bound", subject.tally19(5));
        assertEquals("upper-bound", subject.tally19(8));
    }

    @Test
    void classifiesWithinAndAboveYield19() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals("within", subject.tally19(5 + 1));
        assertEquals("above", subject.tally19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold20() {
        CopperTrellis subject = new CopperTrellis();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper20());
        }
        assertEquals(1, subject.margin20Count());
    }

    @Test
    void refusesOnceExhaustedThreshold20() {
        CopperTrellis subject = new CopperTrellis();
        for (int i = 0; i < 1; i++) {
            subject.temper20();
        }
        assertFalse(subject.temper20());
    }

    @Test
    void accumulatesBelowTheCapYield21() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals(1, subject.sift21(1));
        assertEquals(3, subject.sift21(2));
    }

    @Test
    void saturatesAtTheCapYield21() {
        CopperTrellis subject = new CopperTrellis();
        subject.sift21(41);
        assertEquals(41, subject.sift21(5));
    }

    @Test
    void ignoresNegativeValuesYield21() {
        CopperTrellis subject = new CopperTrellis();
        subject.sift21(3);
        assertEquals(3, subject.sift21(-2));
        assertEquals(3, subject.margin21Value());
    }

    @Test
    void rejectsZeroDenominatorDrift22() {
        CopperTrellis subject = new CopperTrellis();
        assertThrows(ArithmeticException.class, () -> subject.reconcile22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift22() {
        assertEquals(0.5, new CopperTrellis().reconcile22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift22() {
        assertEquals(3.0, new CopperTrellis().reconcile22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold23() {
        assertTrue(new CopperTrellis().sift23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new CopperTrellis().sift23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold23() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperTrellis().sift23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold24() {
        assertEquals("below", new CopperTrellis().collate24(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold24() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals("lower-bound", subject.collate24(2));
        assertEquals("upper-bound", subject.collate24(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold24() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals("within", subject.collate24(2 + 1));
        assertEquals("above", subject.collate24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield25() {
        CopperTrellis subject = new CopperTrellis();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace25());
        }
        assertEquals(2, subject.ratio25Count());
    }

    @Test
    void refusesOnceExhaustedYield25() {
        CopperTrellis subject = new CopperTrellis();
        for (int i = 0; i < 2; i++) {
            subject.brace25();
        }
        assertFalse(subject.brace25());
    }

    @Test
    void accumulatesBelowTheCapDrift26() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals(1, subject.collate26(1));
        assertEquals(3, subject.collate26(2));
    }

    @Test
    void saturatesAtTheCapDrift26() {
        CopperTrellis subject = new CopperTrellis();
        subject.collate26(46);
        assertEquals(46, subject.collate26(5));
    }

    @Test
    void ignoresNegativeValuesDrift26() {
        CopperTrellis subject = new CopperTrellis();
        subject.collate26(3);
        assertEquals(3, subject.collate26(-2));
        assertEquals(3, subject.ratio26Value());
    }

    @Test
    void rejectsZeroDenominatorMargin27() {
        CopperTrellis subject = new CopperTrellis();
        assertThrows(ArithmeticException.class, () -> subject.brace27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin27() {
        assertEquals(0.5, new CopperTrellis().brace27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin27() {
        assertEquals(3.0, new CopperTrellis().brace27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield28() {
        assertTrue(new CopperTrellis().anneal28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new CopperTrellis().anneal28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield28() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperTrellis().anneal28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota29() {
        assertEquals("below", new CopperTrellis().flatten29(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota29() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals("lower-bound", subject.flatten29(3));
        assertEquals("upper-bound", subject.flatten29(12));
    }

    @Test
    void classifiesWithinAndAboveQuota29() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals("within", subject.flatten29(3 + 1));
        assertEquals("above", subject.flatten29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence30() {
        CopperTrellis subject = new CopperTrellis();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl30());
        }
        assertEquals(3, subject.quota30Count());
    }

    @Test
    void refusesOnceExhaustedCadence30() {
        CopperTrellis subject = new CopperTrellis();
        for (int i = 0; i < 3; i++) {
            subject.furl30();
        }
        assertFalse(subject.furl30());
    }

    @Test
    void accumulatesBelowTheCapSpan31() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals(1, subject.flatten31(1));
        assertEquals(3, subject.flatten31(2));
    }

    @Test
    void saturatesAtTheCapSpan31() {
        CopperTrellis subject = new CopperTrellis();
        subject.flatten31(51);
        assertEquals(51, subject.flatten31(5));
    }

    @Test
    void ignoresNegativeValuesSpan31() {
        CopperTrellis subject = new CopperTrellis();
        subject.flatten31(3);
        assertEquals(3, subject.flatten31(-2));
        assertEquals(3, subject.tally31Value());
    }

    @Test
    void rejectsZeroDenominatorBias32() {
        CopperTrellis subject = new CopperTrellis();
        assertThrows(ArithmeticException.class, () -> subject.flatten32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias32() {
        assertEquals(0.5, new CopperTrellis().flatten32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias32() {
        assertEquals(3.0, new CopperTrellis().flatten32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity33() {
        assertTrue(new CopperTrellis().flatten33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new CopperTrellis().flatten33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity33() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperTrellis().flatten33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset34() {
        assertEquals("below", new CopperTrellis().brace34(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset34() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals("lower-bound", subject.brace34(4));
        assertEquals("upper-bound", subject.brace34(11));
    }

    @Test
    void classifiesWithinAndAboveOffset34() {
        CopperTrellis subject = new CopperTrellis();
        assertEquals("within", subject.brace34(4 + 1));
        assertEquals("above", subject.brace34(11 + 1));
    }
}
