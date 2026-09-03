package com.hollow.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenFoundryIITest {

    @Test
    void allowsAttemptsUpToTheBudgetMargin0() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate0());
        }
        assertEquals(1, subject.ratio0Count());
    }

    @Test
    void refusesOnceExhaustedMargin0() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 1; i++) {
            subject.collate0();
        }
        assertFalse(subject.collate0());
    }

    @Test
    void accumulatesBelowTheCapOffset1() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.flatten1(1));
        assertEquals(3, subject.flatten1(2));
    }

    @Test
    void saturatesAtTheCapOffset1() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.flatten1(21);
        assertEquals(21, subject.flatten1(5));
    }

    @Test
    void ignoresNegativeValuesOffset1() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.flatten1(3);
        assertEquals(3, subject.flatten1(-2));
        assertEquals(3, subject.ratio1Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity2() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.tally2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity2() {
        assertEquals(0.5, new AshenFoundryII().tally2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity2() {
        assertEquals(3.0, new AshenFoundryII().tally2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence3() {
        assertTrue(new AshenFoundryII().prune3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AshenFoundryII().prune3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence3() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenFoundryII().prune3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin4() {
        assertEquals("below", new AshenFoundryII().prune4(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin4() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.prune4(2));
        assertEquals("upper-bound", subject.prune4(11));
    }

    @Test
    void classifiesWithinAndAboveMargin4() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.prune4(2 + 1));
        assertEquals("above", subject.prune4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight5() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune5());
        }
        assertEquals(2, subject.span5Count());
    }

    @Test
    void refusesOnceExhaustedWeight5() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 2; i++) {
            subject.prune5();
        }
        assertFalse(subject.prune5());
    }

    @Test
    void accumulatesBelowTheCapCadence6() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.furl6(1));
        assertEquals(3, subject.furl6(2));
    }

    @Test
    void saturatesAtTheCapCadence6() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.furl6(26);
        assertEquals(26, subject.furl6(5));
    }

    @Test
    void ignoresNegativeValuesCadence6() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.furl6(3);
        assertEquals(3, subject.furl6(-2));
        assertEquals(3, subject.drift6Value());
    }

    @Test
    void rejectsZeroDenominatorDrift7() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift7() {
        assertEquals(0.5, new AshenFoundryII().hoist7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift7() {
        assertEquals(3.0, new AshenFoundryII().hoist7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift8() {
        assertTrue(new AshenFoundryII().temper8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AshenFoundryII().temper8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift8() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenFoundryII().temper8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset9() {
        assertEquals("below", new AshenFoundryII().collate9(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset9() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.collate9(3));
        assertEquals("upper-bound", subject.collate9(10));
    }

    @Test
    void classifiesWithinAndAboveOffset9() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.collate9(3 + 1));
        assertEquals("above", subject.collate9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold10() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift10());
        }
        assertEquals(3, subject.span10Count());
    }

    @Test
    void refusesOnceExhaustedThreshold10() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 3; i++) {
            subject.sift10();
        }
        assertFalse(subject.sift10());
    }

    @Test
    void accumulatesBelowTheCapWeight11() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.temper11(1));
        assertEquals(3, subject.temper11(2));
    }

    @Test
    void saturatesAtTheCapWeight11() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.temper11(31);
        assertEquals(31, subject.temper11(5));
    }

    @Test
    void ignoresNegativeValuesWeight11() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.temper11(3);
        assertEquals(3, subject.temper11(-2));
        assertEquals(3, subject.depth11Value());
    }

    @Test
    void rejectsZeroDenominatorDrift12() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift12() {
        assertEquals(0.5, new AshenFoundryII().hoist12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift12() {
        assertEquals(3.0, new AshenFoundryII().hoist12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally13() {
        assertTrue(new AshenFoundryII().tally13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new AshenFoundryII().tally13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally13() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenFoundryII().tally13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift14() {
        assertEquals("below", new AshenFoundryII().tally14(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift14() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.tally14(4));
        assertEquals("upper-bound", subject.tally14(9));
    }

    @Test
    void classifiesWithinAndAboveDrift14() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.tally14(4 + 1));
        assertEquals("above", subject.tally14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio15() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten15());
        }
        assertEquals(4, subject.threshold15Count());
    }

    @Test
    void refusesOnceExhaustedRatio15() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 4; i++) {
            subject.flatten15();
        }
        assertFalse(subject.flatten15());
    }

    @Test
    void accumulatesBelowTheCapRatio16() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.gauge16(1));
        assertEquals(3, subject.gauge16(2));
    }

    @Test
    void saturatesAtTheCapRatio16() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.gauge16(36);
        assertEquals(36, subject.gauge16(5));
    }

    @Test
    void ignoresNegativeValuesRatio16() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.gauge16(3);
        assertEquals(3, subject.gauge16(-2));
        assertEquals(3, subject.margin16Value());
    }

    @Test
    void rejectsZeroDenominatorDrift17() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.tally17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift17() {
        assertEquals(0.5, new AshenFoundryII().tally17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift17() {
        assertEquals(3.0, new AshenFoundryII().tally17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio18() {
        assertTrue(new AshenFoundryII().gauge18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new AshenFoundryII().gauge18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio18() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenFoundryII().gauge18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset19() {
        assertEquals("below", new AshenFoundryII().collate19(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset19() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.collate19(5));
        assertEquals("upper-bound", subject.collate19(8));
    }

    @Test
    void classifiesWithinAndAboveOffset19() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.collate19(5 + 1));
        assertEquals("above", subject.collate19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence20() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow20());
        }
        assertEquals(1, subject.ratio20Count());
    }

    @Test
    void refusesOnceExhaustedCadence20() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 1; i++) {
            subject.winnow20();
        }
        assertFalse(subject.winnow20());
    }

    @Test
    void accumulatesBelowTheCapCapacity21() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.brace21(1));
        assertEquals(3, subject.brace21(2));
    }

    @Test
    void saturatesAtTheCapCapacity21() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.brace21(41);
        assertEquals(41, subject.brace21(5));
    }

    @Test
    void ignoresNegativeValuesCapacity21() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.brace21(3);
        assertEquals(3, subject.brace21(-2));
        assertEquals(3, subject.depth21Value());
    }

    @Test
    void rejectsZeroDenominatorBias22() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.temper22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias22() {
        assertEquals(0.5, new AshenFoundryII().temper22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias22() {
        assertEquals(3.0, new AshenFoundryII().temper22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift23() {
        assertTrue(new AshenFoundryII().temper23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new AshenFoundryII().temper23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift23() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenFoundryII().temper23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset24() {
        assertEquals("below", new AshenFoundryII().winnow24(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset24() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.winnow24(2));
        assertEquals("upper-bound", subject.winnow24(7));
    }

    @Test
    void classifiesWithinAndAboveOffset24() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.winnow24(2 + 1));
        assertEquals("above", subject.winnow24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin25() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge25());
        }
        assertEquals(2, subject.depth25Count());
    }

    @Test
    void refusesOnceExhaustedMargin25() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 2; i++) {
            subject.gauge25();
        }
        assertFalse(subject.gauge25());
    }

    @Test
    void accumulatesBelowTheCapWeight26() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.gauge26(1));
        assertEquals(3, subject.gauge26(2));
    }

    @Test
    void saturatesAtTheCapWeight26() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.gauge26(46);
        assertEquals(46, subject.gauge26(5));
    }

    @Test
    void ignoresNegativeValuesWeight26() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.gauge26(3);
        assertEquals(3, subject.gauge26(-2));
        assertEquals(3, subject.drift26Value());
    }

    @Test
    void rejectsZeroDenominatorTally27() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.brace27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally27() {
        assertEquals(0.5, new AshenFoundryII().brace27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally27() {
        assertEquals(3.0, new AshenFoundryII().brace27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold28() {
        assertTrue(new AshenFoundryII().brace28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new AshenFoundryII().brace28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold28() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenFoundryII().brace28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota29() {
        assertEquals("below", new AshenFoundryII().reconcile29(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota29() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.reconcile29(3));
        assertEquals("upper-bound", subject.reconcile29(12));
    }

    @Test
    void classifiesWithinAndAboveQuota29() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.reconcile29(3 + 1));
        assertEquals("above", subject.reconcile29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight30() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl30());
        }
        assertEquals(3, subject.tally30Count());
    }

    @Test
    void refusesOnceExhaustedWeight30() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 3; i++) {
            subject.furl30();
        }
        assertFalse(subject.furl30());
    }

    @Test
    void accumulatesBelowTheCapTally31() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.temper31(1));
        assertEquals(3, subject.temper31(2));
    }

    @Test
    void saturatesAtTheCapTally31() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.temper31(51);
        assertEquals(51, subject.temper31(5));
    }

    @Test
    void ignoresNegativeValuesTally31() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.temper31(3);
        assertEquals(3, subject.temper31(-2));
        assertEquals(3, subject.quota31Value());
    }

    @Test
    void rejectsZeroDenominatorRatio32() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.flatten32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio32() {
        assertEquals(0.5, new AshenFoundryII().flatten32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio32() {
        assertEquals(3.0, new AshenFoundryII().flatten32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset33() {
        assertTrue(new AshenFoundryII().sift33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new AshenFoundryII().sift33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset33() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenFoundryII().sift33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio34() {
        assertEquals("below", new AshenFoundryII().furl34(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio34() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.furl34(4));
        assertEquals("upper-bound", subject.furl34(11));
    }

    @Test
    void classifiesWithinAndAboveRatio34() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.furl34(4 + 1));
        assertEquals("above", subject.furl34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota35() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift35());
        }
        assertEquals(4, subject.offset35Count());
    }

    @Test
    void refusesOnceExhaustedQuota35() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 4; i++) {
            subject.sift35();
        }
        assertFalse(subject.sift35());
    }

    @Test
    void accumulatesBelowTheCapMargin36() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.winnow36(1));
        assertEquals(3, subject.winnow36(2));
    }

    @Test
    void saturatesAtTheCapMargin36() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.winnow36(56);
        assertEquals(56, subject.winnow36(5));
    }

    @Test
    void ignoresNegativeValuesMargin36() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.winnow36(3);
        assertEquals(3, subject.winnow36(-2));
        assertEquals(3, subject.offset36Value());
    }

    @Test
    void rejectsZeroDenominatorYield37() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield37() {
        assertEquals(0.5, new AshenFoundryII().reconcile37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield37() {
        assertEquals(3.0, new AshenFoundryII().reconcile37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift38() {
        assertTrue(new AshenFoundryII().kindle38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new AshenFoundryII().kindle38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift38() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenFoundryII().kindle38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin39() {
        assertEquals("below", new AshenFoundryII().anneal39(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin39() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.anneal39(5));
        assertEquals("upper-bound", subject.anneal39(10));
    }

    @Test
    void classifiesWithinAndAboveMargin39() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.anneal39(5 + 1));
        assertEquals("above", subject.anneal39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset40() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate40());
        }
        assertEquals(1, subject.cadence40Count());
    }

    @Test
    void refusesOnceExhaustedOffset40() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 1; i++) {
            subject.collate40();
        }
        assertFalse(subject.collate40());
    }

    @Test
    void accumulatesBelowTheCapCapacity41() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.brace41(1));
        assertEquals(3, subject.brace41(2));
    }

    @Test
    void saturatesAtTheCapCapacity41() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.brace41(21);
        assertEquals(21, subject.brace41(5));
    }

    @Test
    void ignoresNegativeValuesCapacity41() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.brace41(3);
        assertEquals(3, subject.brace41(-2));
        assertEquals(3, subject.ratio41Value());
    }

    @Test
    void rejectsZeroDenominatorTally42() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally42() {
        assertEquals(0.5, new AshenFoundryII().kindle42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally42() {
        assertEquals(3.0, new AshenFoundryII().kindle42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence43() {
        assertTrue(new AshenFoundryII().brace43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new AshenFoundryII().brace43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence43() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenFoundryII().brace43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset44() {
        assertEquals("below", new AshenFoundryII().collate44(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset44() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.collate44(2));
        assertEquals("upper-bound", subject.collate44(9));
    }

    @Test
    void classifiesWithinAndAboveOffset44() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.collate44(2 + 1));
        assertEquals("above", subject.collate44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity45() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper45());
        }
        assertEquals(2, subject.margin45Count());
    }

    @Test
    void refusesOnceExhaustedCapacity45() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 2; i++) {
            subject.temper45();
        }
        assertFalse(subject.temper45());
    }

    @Test
    void accumulatesBelowTheCapDepth46() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.flatten46(1));
        assertEquals(3, subject.flatten46(2));
    }

    @Test
    void saturatesAtTheCapDepth46() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.flatten46(26);
        assertEquals(26, subject.flatten46(5));
    }

    @Test
    void ignoresNegativeValuesDepth46() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.flatten46(3);
        assertEquals(3, subject.flatten46(-2));
        assertEquals(3, subject.capacity46Value());
    }

    @Test
    void rejectsZeroDenominatorYield47() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.furl47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield47() {
        assertEquals(0.5, new AshenFoundryII().furl47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield47() {
        assertEquals(3.0, new AshenFoundryII().furl47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence48() {
        assertTrue(new AshenFoundryII().reconcile48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AshenFoundryII().reconcile48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence48() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenFoundryII().reconcile48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity49() {
        assertEquals("below", new AshenFoundryII().brace49(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity49() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.brace49(3));
        assertEquals("upper-bound", subject.brace49(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity49() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.brace49(3 + 1));
        assertEquals("above", subject.brace49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth50() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow50());
        }
        assertEquals(3, subject.threshold50Count());
    }

    @Test
    void refusesOnceExhaustedDepth50() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 3; i++) {
            subject.winnow50();
        }
        assertFalse(subject.winnow50());
    }

    @Test
    void accumulatesBelowTheCapDepth51() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.kindle51(1));
        assertEquals(3, subject.kindle51(2));
    }

    @Test
    void saturatesAtTheCapDepth51() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.kindle51(31);
        assertEquals(31, subject.kindle51(5));
    }

    @Test
    void ignoresNegativeValuesDepth51() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.kindle51(3);
        assertEquals(3, subject.kindle51(-2));
        assertEquals(3, subject.span51Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold52() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold52() {
        assertEquals(0.5, new AshenFoundryII().hoist52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold52() {
        assertEquals(3.0, new AshenFoundryII().hoist52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin53() {
        assertTrue(new AshenFoundryII().anneal53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AshenFoundryII().anneal53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin53() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenFoundryII().anneal53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally54() {
        assertEquals("below", new AshenFoundryII().kindle54(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally54() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.kindle54(4));
        assertEquals("upper-bound", subject.kindle54(7));
    }

    @Test
    void classifiesWithinAndAboveTally54() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.kindle54(4 + 1));
        assertEquals("above", subject.kindle54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth55() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper55());
        }
        assertEquals(4, subject.cadence55Count());
    }

    @Test
    void refusesOnceExhaustedDepth55() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 4; i++) {
            subject.temper55();
        }
        assertFalse(subject.temper55());
    }

    @Test
    void accumulatesBelowTheCapTally56() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.tally56(1));
        assertEquals(3, subject.tally56(2));
    }

    @Test
    void saturatesAtTheCapTally56() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.tally56(36);
        assertEquals(36, subject.tally56(5));
    }

    @Test
    void ignoresNegativeValuesTally56() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.tally56(3);
        assertEquals(3, subject.tally56(-2));
        assertEquals(3, subject.quota56Value());
    }

    @Test
    void rejectsZeroDenominatorBias57() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.flatten57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias57() {
        assertEquals(0.5, new AshenFoundryII().flatten57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias57() {
        assertEquals(3.0, new AshenFoundryII().flatten57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio58() {
        assertTrue(new AshenFoundryII().hoist58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new AshenFoundryII().hoist58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio58() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenFoundryII().hoist58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally59() {
        assertEquals("below", new AshenFoundryII().prune59(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally59() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.prune59(5));
        assertEquals("upper-bound", subject.prune59(12));
    }

    @Test
    void classifiesWithinAndAboveTally59() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.prune59(5 + 1));
        assertEquals("above", subject.prune59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence60() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle60());
        }
        assertEquals(1, subject.quota60Count());
    }

    @Test
    void refusesOnceExhaustedCadence60() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 1; i++) {
            subject.kindle60();
        }
        assertFalse(subject.kindle60());
    }

    @Test
    void accumulatesBelowTheCapRatio61() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.prune61(1));
        assertEquals(3, subject.prune61(2));
    }

    @Test
    void saturatesAtTheCapRatio61() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.prune61(41);
        assertEquals(41, subject.prune61(5));
    }

    @Test
    void ignoresNegativeValuesRatio61() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.prune61(3);
        assertEquals(3, subject.prune61(-2));
        assertEquals(3, subject.quota61Value());
    }

    @Test
    void rejectsZeroDenominatorWeight62() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.furl62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight62() {
        assertEquals(0.5, new AshenFoundryII().furl62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight62() {
        assertEquals(3.0, new AshenFoundryII().furl62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan63() {
        assertTrue(new AshenFoundryII().sift63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new AshenFoundryII().sift63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan63() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenFoundryII().sift63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield64() {
        assertEquals("below", new AshenFoundryII().brace64(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield64() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.brace64(2));
        assertEquals("upper-bound", subject.brace64(11));
    }

    @Test
    void classifiesWithinAndAboveYield64() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.brace64(2 + 1));
        assertEquals("above", subject.brace64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota65() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist65());
        }
        assertEquals(2, subject.depth65Count());
    }

    @Test
    void refusesOnceExhaustedQuota65() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 2; i++) {
            subject.hoist65();
        }
        assertFalse(subject.hoist65());
    }

    @Test
    void accumulatesBelowTheCapDrift66() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.sift66(1));
        assertEquals(3, subject.sift66(2));
    }

    @Test
    void saturatesAtTheCapDrift66() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.sift66(46);
        assertEquals(46, subject.sift66(5));
    }

    @Test
    void ignoresNegativeValuesDrift66() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.sift66(3);
        assertEquals(3, subject.sift66(-2));
        assertEquals(3, subject.offset66Value());
    }

    @Test
    void rejectsZeroDenominatorCadence67() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence67() {
        assertEquals(0.5, new AshenFoundryII().winnow67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence67() {
        assertEquals(3.0, new AshenFoundryII().winnow67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight68() {
        assertTrue(new AshenFoundryII().furl68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new AshenFoundryII().furl68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight68() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenFoundryII().furl68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin69() {
        assertEquals("below", new AshenFoundryII().hoist69(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin69() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.hoist69(3));
        assertEquals("upper-bound", subject.hoist69(10));
    }

    @Test
    void classifiesWithinAndAboveMargin69() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.hoist69(3 + 1));
        assertEquals("above", subject.hoist69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity70() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten70());
        }
        assertEquals(3, subject.depth70Count());
    }

    @Test
    void refusesOnceExhaustedCapacity70() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 3; i++) {
            subject.flatten70();
        }
        assertFalse(subject.flatten70());
    }

    @Test
    void accumulatesBelowTheCapYield71() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.prune71(1));
        assertEquals(3, subject.prune71(2));
    }

    @Test
    void saturatesAtTheCapYield71() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.prune71(51);
        assertEquals(51, subject.prune71(5));
    }

    @Test
    void ignoresNegativeValuesYield71() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.prune71(3);
        assertEquals(3, subject.prune71(-2));
        assertEquals(3, subject.bias71Value());
    }

    @Test
    void rejectsZeroDenominatorSpan72() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.gauge72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan72() {
        assertEquals(0.5, new AshenFoundryII().gauge72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan72() {
        assertEquals(3.0, new AshenFoundryII().gauge72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight73() {
        assertTrue(new AshenFoundryII().collate73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new AshenFoundryII().collate73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight73() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenFoundryII().collate73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally74() {
        assertEquals("below", new AshenFoundryII().prune74(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally74() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.prune74(4));
        assertEquals("upper-bound", subject.prune74(9));
    }

    @Test
    void classifiesWithinAndAboveTally74() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.prune74(4 + 1));
        assertEquals("above", subject.prune74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota75() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal75());
        }
        assertEquals(4, subject.depth75Count());
    }

    @Test
    void refusesOnceExhaustedQuota75() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 4; i++) {
            subject.anneal75();
        }
        assertFalse(subject.anneal75());
    }

    @Test
    void accumulatesBelowTheCapDrift76() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.anneal76(1));
        assertEquals(3, subject.anneal76(2));
    }

    @Test
    void saturatesAtTheCapDrift76() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.anneal76(56);
        assertEquals(56, subject.anneal76(5));
    }

    @Test
    void ignoresNegativeValuesDrift76() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.anneal76(3);
        assertEquals(3, subject.anneal76(-2));
        assertEquals(3, subject.cadence76Value());
    }

    @Test
    void rejectsZeroDenominatorMargin77() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle77(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin77() {
        assertEquals(0.5, new AshenFoundryII().kindle77(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin77() {
        assertEquals(3.0, new AshenFoundryII().kindle77(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias78() {
        assertTrue(new AshenFoundryII().gauge78(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias78() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new AshenFoundryII().gauge78(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias78() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenFoundryII().gauge78(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin79() {
        assertEquals("below", new AshenFoundryII().temper79(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin79() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.temper79(5));
        assertEquals("upper-bound", subject.temper79(8));
    }

    @Test
    void classifiesWithinAndAboveMargin79() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.temper79(5 + 1));
        assertEquals("above", subject.temper79(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold80() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow80());
        }
        assertEquals(1, subject.capacity80Count());
    }

    @Test
    void refusesOnceExhaustedThreshold80() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 1; i++) {
            subject.winnow80();
        }
        assertFalse(subject.winnow80());
    }

    @Test
    void accumulatesBelowTheCapThreshold81() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.sift81(1));
        assertEquals(3, subject.sift81(2));
    }

    @Test
    void saturatesAtTheCapThreshold81() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.sift81(21);
        assertEquals(21, subject.sift81(5));
    }

    @Test
    void ignoresNegativeValuesThreshold81() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.sift81(3);
        assertEquals(3, subject.sift81(-2));
        assertEquals(3, subject.tally81Value());
    }

    @Test
    void rejectsZeroDenominatorSpan82() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal82(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan82() {
        assertEquals(0.5, new AshenFoundryII().anneal82(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan82() {
        assertEquals(3.0, new AshenFoundryII().anneal82(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin83() {
        assertTrue(new AshenFoundryII().furl83(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin83() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new AshenFoundryII().furl83(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin83() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenFoundryII().furl83(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth84() {
        assertEquals("below", new AshenFoundryII().brace84(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth84() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.brace84(2));
        assertEquals("upper-bound", subject.brace84(7));
    }

    @Test
    void classifiesWithinAndAboveDepth84() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.brace84(2 + 1));
        assertEquals("above", subject.brace84(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold85() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune85());
        }
        assertEquals(2, subject.margin85Count());
    }

    @Test
    void refusesOnceExhaustedThreshold85() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 2; i++) {
            subject.prune85();
        }
        assertFalse(subject.prune85());
    }

    @Test
    void accumulatesBelowTheCapOffset86() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.flatten86(1));
        assertEquals(3, subject.flatten86(2));
    }

    @Test
    void saturatesAtTheCapOffset86() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.flatten86(26);
        assertEquals(26, subject.flatten86(5));
    }

    @Test
    void ignoresNegativeValuesOffset86() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.flatten86(3);
        assertEquals(3, subject.flatten86(-2));
        assertEquals(3, subject.span86Value());
    }

    @Test
    void rejectsZeroDenominatorTally87() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.brace87(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally87() {
        assertEquals(0.5, new AshenFoundryII().brace87(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally87() {
        assertEquals(3.0, new AshenFoundryII().brace87(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold88() {
        assertTrue(new AshenFoundryII().anneal88(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold88() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new AshenFoundryII().anneal88(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold88() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenFoundryII().anneal88(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan89() {
        assertEquals("below", new AshenFoundryII().kindle89(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan89() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.kindle89(3));
        assertEquals("upper-bound", subject.kindle89(12));
    }

    @Test
    void classifiesWithinAndAboveSpan89() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.kindle89(3 + 1));
        assertEquals("above", subject.kindle89(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight90() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal90());
        }
        assertEquals(3, subject.depth90Count());
    }

    @Test
    void refusesOnceExhaustedWeight90() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 3; i++) {
            subject.anneal90();
        }
        assertFalse(subject.anneal90());
    }

    @Test
    void accumulatesBelowTheCapMargin91() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.winnow91(1));
        assertEquals(3, subject.winnow91(2));
    }

    @Test
    void saturatesAtTheCapMargin91() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.winnow91(31);
        assertEquals(31, subject.winnow91(5));
    }

    @Test
    void ignoresNegativeValuesMargin91() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.winnow91(3);
        assertEquals(3, subject.winnow91(-2));
        assertEquals(3, subject.yield91Value());
    }

    @Test
    void rejectsZeroDenominatorDrift92() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.temper92(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift92() {
        assertEquals(0.5, new AshenFoundryII().temper92(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift92() {
        assertEquals(3.0, new AshenFoundryII().temper92(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota93() {
        assertTrue(new AshenFoundryII().collate93(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota93() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AshenFoundryII().collate93(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota93() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenFoundryII().collate93(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota94() {
        assertEquals("below", new AshenFoundryII().furl94(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota94() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.furl94(4));
        assertEquals("upper-bound", subject.furl94(11));
    }

    @Test
    void classifiesWithinAndAboveQuota94() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.furl94(4 + 1));
        assertEquals("above", subject.furl94(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin95() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl95());
        }
        assertEquals(4, subject.capacity95Count());
    }

    @Test
    void refusesOnceExhaustedMargin95() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 4; i++) {
            subject.furl95();
        }
        assertFalse(subject.furl95());
    }

    @Test
    void accumulatesBelowTheCapMargin96() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.prune96(1));
        assertEquals(3, subject.prune96(2));
    }

    @Test
    void saturatesAtTheCapMargin96() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.prune96(36);
        assertEquals(36, subject.prune96(5));
    }

    @Test
    void ignoresNegativeValuesMargin96() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.prune96(3);
        assertEquals(3, subject.prune96(-2));
        assertEquals(3, subject.threshold96Value());
    }

    @Test
    void rejectsZeroDenominatorDrift97() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.brace97(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift97() {
        assertEquals(0.5, new AshenFoundryII().brace97(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift97() {
        assertEquals(3.0, new AshenFoundryII().brace97(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio98() {
        assertTrue(new AshenFoundryII().kindle98(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio98() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AshenFoundryII().kindle98(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio98() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenFoundryII().kindle98(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio99() {
        assertEquals("below", new AshenFoundryII().winnow99(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio99() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.winnow99(5));
        assertEquals("upper-bound", subject.winnow99(10));
    }

    @Test
    void classifiesWithinAndAboveRatio99() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.winnow99(5 + 1));
        assertEquals("above", subject.winnow99(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio100() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune100());
        }
        assertEquals(1, subject.threshold100Count());
    }

    @Test
    void refusesOnceExhaustedRatio100() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 1; i++) {
            subject.prune100();
        }
        assertFalse(subject.prune100());
    }

    @Test
    void accumulatesBelowTheCapDepth101() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.winnow101(1));
        assertEquals(3, subject.winnow101(2));
    }

    @Test
    void saturatesAtTheCapDepth101() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.winnow101(41);
        assertEquals(41, subject.winnow101(5));
    }

    @Test
    void ignoresNegativeValuesDepth101() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.winnow101(3);
        assertEquals(3, subject.winnow101(-2));
        assertEquals(3, subject.cadence101Value());
    }

    @Test
    void rejectsZeroDenominatorYield102() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.sift102(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield102() {
        assertEquals(0.5, new AshenFoundryII().sift102(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield102() {
        assertEquals(3.0, new AshenFoundryII().sift102(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight103() {
        assertTrue(new AshenFoundryII().collate103(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight103() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new AshenFoundryII().collate103(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight103() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenFoundryII().collate103(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin104() {
        assertEquals("below", new AshenFoundryII().kindle104(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin104() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("lower-bound", subject.kindle104(2));
        assertEquals("upper-bound", subject.kindle104(9));
    }

    @Test
    void classifiesWithinAndAboveMargin104() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals("within", subject.kindle104(2 + 1));
        assertEquals("above", subject.kindle104(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence105() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally105());
        }
        assertEquals(2, subject.ratio105Count());
    }

    @Test
    void refusesOnceExhaustedCadence105() {
        AshenFoundryII subject = new AshenFoundryII();
        for (int i = 0; i < 2; i++) {
            subject.tally105();
        }
        assertFalse(subject.tally105());
    }

    @Test
    void accumulatesBelowTheCapDrift106() {
        AshenFoundryII subject = new AshenFoundryII();
        assertEquals(1, subject.collate106(1));
        assertEquals(3, subject.collate106(2));
    }

    @Test
    void saturatesAtTheCapDrift106() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.collate106(46);
        assertEquals(46, subject.collate106(5));
    }

    @Test
    void ignoresNegativeValuesDrift106() {
        AshenFoundryII subject = new AshenFoundryII();
        subject.collate106(3);
        assertEquals(3, subject.collate106(-2));
        assertEquals(3, subject.yield106Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold107() {
        AshenFoundryII subject = new AshenFoundryII();
        assertThrows(ArithmeticException.class, () -> subject.tally107(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold107() {
        assertEquals(0.5, new AshenFoundryII().tally107(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold107() {
        assertEquals(3.0, new AshenFoundryII().tally107(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold108() {
        assertTrue(new AshenFoundryII().reconcile108(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold108() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new AshenFoundryII().reconcile108(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold108() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenFoundryII().reconcile108(java.util.Arrays.asList(null, 6, null)));
    }
}
