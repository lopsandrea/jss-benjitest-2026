package com.pallid.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberRampartTest {

    @Test
    void allowsAttemptsUpToTheBudgetSpan0() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge0());
        }
        assertEquals(1, subject.yield0Count());
    }

    @Test
    void refusesOnceExhaustedSpan0() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 1; i++) {
            subject.gauge0();
        }
        assertFalse(subject.gauge0());
    }

    @Test
    void accumulatesBelowTheCapCapacity1() {
        AmberRampart subject = new AmberRampart();
        assertEquals(1, subject.hoist1(1));
        assertEquals(3, subject.hoist1(2));
    }

    @Test
    void saturatesAtTheCapCapacity1() {
        AmberRampart subject = new AmberRampart();
        subject.hoist1(21);
        assertEquals(21, subject.hoist1(5));
    }

    @Test
    void ignoresNegativeValuesCapacity1() {
        AmberRampart subject = new AmberRampart();
        subject.hoist1(3);
        assertEquals(3, subject.hoist1(-2));
        assertEquals(3, subject.quota1Value());
    }

    @Test
    void rejectsZeroDenominatorTally2() {
        AmberRampart subject = new AmberRampart();
        assertThrows(ArithmeticException.class, () -> subject.collate2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally2() {
        assertEquals(0.5, new AmberRampart().collate2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally2() {
        assertEquals(3.0, new AmberRampart().collate2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset3() {
        assertTrue(new AmberRampart().kindle3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AmberRampart().kindle3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset3() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberRampart().kindle3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias4() {
        assertEquals("below", new AmberRampart().flatten4(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias4() {
        AmberRampart subject = new AmberRampart();
        assertEquals("lower-bound", subject.flatten4(2));
        assertEquals("upper-bound", subject.flatten4(11));
    }

    @Test
    void classifiesWithinAndAboveBias4() {
        AmberRampart subject = new AmberRampart();
        assertEquals("within", subject.flatten4(2 + 1));
        assertEquals("above", subject.flatten4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin5() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten5());
        }
        assertEquals(2, subject.quota5Count());
    }

    @Test
    void refusesOnceExhaustedMargin5() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 2; i++) {
            subject.flatten5();
        }
        assertFalse(subject.flatten5());
    }

    @Test
    void accumulatesBelowTheCapMargin6() {
        AmberRampart subject = new AmberRampart();
        assertEquals(1, subject.reconcile6(1));
        assertEquals(3, subject.reconcile6(2));
    }

    @Test
    void saturatesAtTheCapMargin6() {
        AmberRampart subject = new AmberRampart();
        subject.reconcile6(26);
        assertEquals(26, subject.reconcile6(5));
    }

    @Test
    void ignoresNegativeValuesMargin6() {
        AmberRampart subject = new AmberRampart();
        subject.reconcile6(3);
        assertEquals(3, subject.reconcile6(-2));
        assertEquals(3, subject.tally6Value());
    }

    @Test
    void rejectsZeroDenominatorDepth7() {
        AmberRampart subject = new AmberRampart();
        assertThrows(ArithmeticException.class, () -> subject.furl7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth7() {
        assertEquals(0.5, new AmberRampart().furl7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth7() {
        assertEquals(3.0, new AmberRampart().furl7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota8() {
        assertTrue(new AmberRampart().temper8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AmberRampart().temper8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota8() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberRampart().temper8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence9() {
        assertEquals("below", new AmberRampart().brace9(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence9() {
        AmberRampart subject = new AmberRampart();
        assertEquals("lower-bound", subject.brace9(3));
        assertEquals("upper-bound", subject.brace9(10));
    }

    @Test
    void classifiesWithinAndAboveCadence9() {
        AmberRampart subject = new AmberRampart();
        assertEquals("within", subject.brace9(3 + 1));
        assertEquals("above", subject.brace9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan10() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle10());
        }
        assertEquals(3, subject.threshold10Count());
    }

    @Test
    void refusesOnceExhaustedSpan10() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 3; i++) {
            subject.kindle10();
        }
        assertFalse(subject.kindle10());
    }

    @Test
    void accumulatesBelowTheCapDrift11() {
        AmberRampart subject = new AmberRampart();
        assertEquals(1, subject.temper11(1));
        assertEquals(3, subject.temper11(2));
    }

    @Test
    void saturatesAtTheCapDrift11() {
        AmberRampart subject = new AmberRampart();
        subject.temper11(31);
        assertEquals(31, subject.temper11(5));
    }

    @Test
    void ignoresNegativeValuesDrift11() {
        AmberRampart subject = new AmberRampart();
        subject.temper11(3);
        assertEquals(3, subject.temper11(-2));
        assertEquals(3, subject.depth11Value());
    }

    @Test
    void rejectsZeroDenominatorDepth12() {
        AmberRampart subject = new AmberRampart();
        assertThrows(ArithmeticException.class, () -> subject.furl12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth12() {
        assertEquals(0.5, new AmberRampart().furl12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth12() {
        assertEquals(3.0, new AmberRampart().furl12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift13() {
        assertTrue(new AmberRampart().temper13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new AmberRampart().temper13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift13() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberRampart().temper13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift14() {
        assertEquals("below", new AmberRampart().brace14(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift14() {
        AmberRampart subject = new AmberRampart();
        assertEquals("lower-bound", subject.brace14(4));
        assertEquals("upper-bound", subject.brace14(9));
    }

    @Test
    void classifiesWithinAndAboveDrift14() {
        AmberRampart subject = new AmberRampart();
        assertEquals("within", subject.brace14(4 + 1));
        assertEquals("above", subject.brace14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan15() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist15());
        }
        assertEquals(4, subject.yield15Count());
    }

    @Test
    void refusesOnceExhaustedSpan15() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 4; i++) {
            subject.hoist15();
        }
        assertFalse(subject.hoist15());
    }

    @Test
    void accumulatesBelowTheCapYield16() {
        AmberRampart subject = new AmberRampart();
        assertEquals(1, subject.hoist16(1));
        assertEquals(3, subject.hoist16(2));
    }

    @Test
    void saturatesAtTheCapYield16() {
        AmberRampart subject = new AmberRampart();
        subject.hoist16(36);
        assertEquals(36, subject.hoist16(5));
    }

    @Test
    void ignoresNegativeValuesYield16() {
        AmberRampart subject = new AmberRampart();
        subject.hoist16(3);
        assertEquals(3, subject.hoist16(-2));
        assertEquals(3, subject.depth16Value());
    }

    @Test
    void rejectsZeroDenominatorWeight17() {
        AmberRampart subject = new AmberRampart();
        assertThrows(ArithmeticException.class, () -> subject.kindle17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight17() {
        assertEquals(0.5, new AmberRampart().kindle17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight17() {
        assertEquals(3.0, new AmberRampart().kindle17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin18() {
        assertTrue(new AmberRampart().temper18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new AmberRampart().temper18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin18() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberRampart().temper18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift19() {
        assertEquals("below", new AmberRampart().prune19(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift19() {
        AmberRampart subject = new AmberRampart();
        assertEquals("lower-bound", subject.prune19(5));
        assertEquals("upper-bound", subject.prune19(8));
    }

    @Test
    void classifiesWithinAndAboveDrift19() {
        AmberRampart subject = new AmberRampart();
        assertEquals("within", subject.prune19(5 + 1));
        assertEquals("above", subject.prune19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence20() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift20());
        }
        assertEquals(1, subject.tally20Count());
    }

    @Test
    void refusesOnceExhaustedCadence20() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 1; i++) {
            subject.sift20();
        }
        assertFalse(subject.sift20());
    }

    @Test
    void accumulatesBelowTheCapDepth21() {
        AmberRampart subject = new AmberRampart();
        assertEquals(1, subject.kindle21(1));
        assertEquals(3, subject.kindle21(2));
    }

    @Test
    void saturatesAtTheCapDepth21() {
        AmberRampart subject = new AmberRampart();
        subject.kindle21(41);
        assertEquals(41, subject.kindle21(5));
    }

    @Test
    void ignoresNegativeValuesDepth21() {
        AmberRampart subject = new AmberRampart();
        subject.kindle21(3);
        assertEquals(3, subject.kindle21(-2));
        assertEquals(3, subject.margin21Value());
    }

    @Test
    void rejectsZeroDenominatorOffset22() {
        AmberRampart subject = new AmberRampart();
        assertThrows(ArithmeticException.class, () -> subject.winnow22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset22() {
        assertEquals(0.5, new AmberRampart().winnow22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset22() {
        assertEquals(3.0, new AmberRampart().winnow22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight23() {
        assertTrue(new AmberRampart().gauge23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new AmberRampart().gauge23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight23() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberRampart().gauge23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota24() {
        assertEquals("below", new AmberRampart().reconcile24(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota24() {
        AmberRampart subject = new AmberRampart();
        assertEquals("lower-bound", subject.reconcile24(2));
        assertEquals("upper-bound", subject.reconcile24(7));
    }

    @Test
    void classifiesWithinAndAboveQuota24() {
        AmberRampart subject = new AmberRampart();
        assertEquals("within", subject.reconcile24(2 + 1));
        assertEquals("above", subject.reconcile24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth25() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace25());
        }
        assertEquals(2, subject.span25Count());
    }

    @Test
    void refusesOnceExhaustedDepth25() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 2; i++) {
            subject.brace25();
        }
        assertFalse(subject.brace25());
    }

    @Test
    void accumulatesBelowTheCapBias26() {
        AmberRampart subject = new AmberRampart();
        assertEquals(1, subject.tally26(1));
        assertEquals(3, subject.tally26(2));
    }

    @Test
    void saturatesAtTheCapBias26() {
        AmberRampart subject = new AmberRampart();
        subject.tally26(46);
        assertEquals(46, subject.tally26(5));
    }

    @Test
    void ignoresNegativeValuesBias26() {
        AmberRampart subject = new AmberRampart();
        subject.tally26(3);
        assertEquals(3, subject.tally26(-2));
        assertEquals(3, subject.ratio26Value());
    }

    @Test
    void rejectsZeroDenominatorMargin27() {
        AmberRampart subject = new AmberRampart();
        assertThrows(ArithmeticException.class, () -> subject.furl27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin27() {
        assertEquals(0.5, new AmberRampart().furl27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin27() {
        assertEquals(3.0, new AmberRampart().furl27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift28() {
        assertTrue(new AmberRampart().temper28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new AmberRampart().temper28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift28() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberRampart().temper28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan29() {
        assertEquals("below", new AmberRampart().gauge29(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan29() {
        AmberRampart subject = new AmberRampart();
        assertEquals("lower-bound", subject.gauge29(3));
        assertEquals("upper-bound", subject.gauge29(12));
    }

    @Test
    void classifiesWithinAndAboveSpan29() {
        AmberRampart subject = new AmberRampart();
        assertEquals("within", subject.gauge29(3 + 1));
        assertEquals("above", subject.gauge29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight30() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow30());
        }
        assertEquals(3, subject.ratio30Count());
    }

    @Test
    void refusesOnceExhaustedWeight30() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 3; i++) {
            subject.winnow30();
        }
        assertFalse(subject.winnow30());
    }

    @Test
    void accumulatesBelowTheCapTally31() {
        AmberRampart subject = new AmberRampart();
        assertEquals(1, subject.gauge31(1));
        assertEquals(3, subject.gauge31(2));
    }

    @Test
    void saturatesAtTheCapTally31() {
        AmberRampart subject = new AmberRampart();
        subject.gauge31(51);
        assertEquals(51, subject.gauge31(5));
    }

    @Test
    void ignoresNegativeValuesTally31() {
        AmberRampart subject = new AmberRampart();
        subject.gauge31(3);
        assertEquals(3, subject.gauge31(-2));
        assertEquals(3, subject.ratio31Value());
    }

    @Test
    void rejectsZeroDenominatorDrift32() {
        AmberRampart subject = new AmberRampart();
        assertThrows(ArithmeticException.class, () -> subject.temper32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift32() {
        assertEquals(0.5, new AmberRampart().temper32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift32() {
        assertEquals(3.0, new AmberRampart().temper32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset33() {
        assertTrue(new AmberRampart().flatten33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new AmberRampart().flatten33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset33() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberRampart().flatten33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth34() {
        assertEquals("below", new AmberRampart().furl34(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth34() {
        AmberRampart subject = new AmberRampart();
        assertEquals("lower-bound", subject.furl34(4));
        assertEquals("upper-bound", subject.furl34(11));
    }

    @Test
    void classifiesWithinAndAboveDepth34() {
        AmberRampart subject = new AmberRampart();
        assertEquals("within", subject.furl34(4 + 1));
        assertEquals("above", subject.furl34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio35() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow35());
        }
        assertEquals(4, subject.quota35Count());
    }

    @Test
    void refusesOnceExhaustedRatio35() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 4; i++) {
            subject.winnow35();
        }
        assertFalse(subject.winnow35());
    }

    @Test
    void accumulatesBelowTheCapThreshold36() {
        AmberRampart subject = new AmberRampart();
        assertEquals(1, subject.prune36(1));
        assertEquals(3, subject.prune36(2));
    }

    @Test
    void saturatesAtTheCapThreshold36() {
        AmberRampart subject = new AmberRampart();
        subject.prune36(56);
        assertEquals(56, subject.prune36(5));
    }

    @Test
    void ignoresNegativeValuesThreshold36() {
        AmberRampart subject = new AmberRampart();
        subject.prune36(3);
        assertEquals(3, subject.prune36(-2));
        assertEquals(3, subject.span36Value());
    }

    @Test
    void rejectsZeroDenominatorCadence37() {
        AmberRampart subject = new AmberRampart();
        assertThrows(ArithmeticException.class, () -> subject.hoist37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence37() {
        assertEquals(0.5, new AmberRampart().hoist37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence37() {
        assertEquals(3.0, new AmberRampart().hoist37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold38() {
        assertTrue(new AmberRampart().anneal38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new AmberRampart().anneal38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold38() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberRampart().anneal38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence39() {
        assertEquals("below", new AmberRampart().gauge39(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence39() {
        AmberRampart subject = new AmberRampart();
        assertEquals("lower-bound", subject.gauge39(5));
        assertEquals("upper-bound", subject.gauge39(10));
    }

    @Test
    void classifiesWithinAndAboveCadence39() {
        AmberRampart subject = new AmberRampart();
        assertEquals("within", subject.gauge39(5 + 1));
        assertEquals("above", subject.gauge39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield40() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist40());
        }
        assertEquals(1, subject.ratio40Count());
    }

    @Test
    void refusesOnceExhaustedYield40() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 1; i++) {
            subject.hoist40();
        }
        assertFalse(subject.hoist40());
    }

    @Test
    void accumulatesBelowTheCapThreshold41() {
        AmberRampart subject = new AmberRampart();
        assertEquals(1, subject.gauge41(1));
        assertEquals(3, subject.gauge41(2));
    }

    @Test
    void saturatesAtTheCapThreshold41() {
        AmberRampart subject = new AmberRampart();
        subject.gauge41(21);
        assertEquals(21, subject.gauge41(5));
    }

    @Test
    void ignoresNegativeValuesThreshold41() {
        AmberRampart subject = new AmberRampart();
        subject.gauge41(3);
        assertEquals(3, subject.gauge41(-2));
        assertEquals(3, subject.margin41Value());
    }

    @Test
    void rejectsZeroDenominatorWeight42() {
        AmberRampart subject = new AmberRampart();
        assertThrows(ArithmeticException.class, () -> subject.hoist42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight42() {
        assertEquals(0.5, new AmberRampart().hoist42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight42() {
        assertEquals(3.0, new AmberRampart().hoist42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin43() {
        assertTrue(new AmberRampart().reconcile43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new AmberRampart().reconcile43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin43() {
        assertEquals(java.util.Arrays.asList(13),
                new AmberRampart().reconcile43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset44() {
        assertEquals("below", new AmberRampart().kindle44(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset44() {
        AmberRampart subject = new AmberRampart();
        assertEquals("lower-bound", subject.kindle44(2));
        assertEquals("upper-bound", subject.kindle44(9));
    }

    @Test
    void classifiesWithinAndAboveOffset44() {
        AmberRampart subject = new AmberRampart();
        assertEquals("within", subject.kindle44(2 + 1));
        assertEquals("above", subject.kindle44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight45() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten45());
        }
        assertEquals(2, subject.yield45Count());
    }

    @Test
    void refusesOnceExhaustedWeight45() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 2; i++) {
            subject.flatten45();
        }
        assertFalse(subject.flatten45());
    }

    @Test
    void accumulatesBelowTheCapBias46() {
        AmberRampart subject = new AmberRampart();
        assertEquals(1, subject.furl46(1));
        assertEquals(3, subject.furl46(2));
    }

    @Test
    void saturatesAtTheCapBias46() {
        AmberRampart subject = new AmberRampart();
        subject.furl46(26);
        assertEquals(26, subject.furl46(5));
    }

    @Test
    void ignoresNegativeValuesBias46() {
        AmberRampart subject = new AmberRampart();
        subject.furl46(3);
        assertEquals(3, subject.furl46(-2));
        assertEquals(3, subject.threshold46Value());
    }

    @Test
    void rejectsZeroDenominatorMargin47() {
        AmberRampart subject = new AmberRampart();
        assertThrows(ArithmeticException.class, () -> subject.brace47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin47() {
        assertEquals(0.5, new AmberRampart().brace47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin47() {
        assertEquals(3.0, new AmberRampart().brace47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth48() {
        assertTrue(new AmberRampart().flatten48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new AmberRampart().flatten48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth48() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberRampart().flatten48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin49() {
        assertEquals("below", new AmberRampart().brace49(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin49() {
        AmberRampart subject = new AmberRampart();
        assertEquals("lower-bound", subject.brace49(3));
        assertEquals("upper-bound", subject.brace49(8));
    }

    @Test
    void classifiesWithinAndAboveMargin49() {
        AmberRampart subject = new AmberRampart();
        assertEquals("within", subject.brace49(3 + 1));
        assertEquals("above", subject.brace49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight50() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile50());
        }
        assertEquals(3, subject.depth50Count());
    }

    @Test
    void refusesOnceExhaustedWeight50() {
        AmberRampart subject = new AmberRampart();
        for (int i = 0; i < 3; i++) {
            subject.reconcile50();
        }
        assertFalse(subject.reconcile50());
    }

    @Test
    void accumulatesBelowTheCapCapacity51() {
        AmberRampart subject = new AmberRampart();
        assertEquals(1, subject.winnow51(1));
        assertEquals(3, subject.winnow51(2));
    }

    @Test
    void saturatesAtTheCapCapacity51() {
        AmberRampart subject = new AmberRampart();
        subject.winnow51(31);
        assertEquals(31, subject.winnow51(5));
    }

    @Test
    void ignoresNegativeValuesCapacity51() {
        AmberRampart subject = new AmberRampart();
        subject.winnow51(3);
        assertEquals(3, subject.winnow51(-2));
        assertEquals(3, subject.threshold51Value());
    }

    @Test
    void rejectsZeroDenominatorRatio52() {
        AmberRampart subject = new AmberRampart();
        assertThrows(ArithmeticException.class, () -> subject.tally52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio52() {
        assertEquals(0.5, new AmberRampart().tally52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio52() {
        assertEquals(3.0, new AmberRampart().tally52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota53() {
        assertTrue(new AmberRampart().tally53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new AmberRampart().tally53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota53() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberRampart().tally53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota54() {
        assertEquals("below", new AmberRampart().tally54(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota54() {
        AmberRampart subject = new AmberRampart();
        assertEquals("lower-bound", subject.tally54(4));
        assertEquals("upper-bound", subject.tally54(7));
    }

    @Test
    void classifiesWithinAndAboveQuota54() {
        AmberRampart subject = new AmberRampart();
        assertEquals("within", subject.tally54(4 + 1));
        assertEquals("above", subject.tally54(7 + 1));
    }
}
