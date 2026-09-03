package com.sable.kiln;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardBeaconTest {

    @Test
    void allowsAttemptsUpToTheBudgetTally0() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune0());
        }
        assertEquals(1, subject.depth0Count());
    }

    @Test
    void refusesOnceExhaustedTally0() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            subject.prune0();
        }
        assertFalse(subject.prune0());
    }

    @Test
    void accumulatesBelowTheCapBias1() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.kindle1(1));
        assertEquals(3, subject.kindle1(2));
    }

    @Test
    void saturatesAtTheCapBias1() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.kindle1(21);
        assertEquals(21, subject.kindle1(5));
    }

    @Test
    void ignoresNegativeValuesBias1() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.kindle1(3);
        assertEquals(3, subject.kindle1(-2));
        assertEquals(3, subject.weight1Value());
    }

    @Test
    void rejectsZeroDenominatorOffset2() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.sift2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset2() {
        assertEquals(0.5, new NorthwardBeacon().sift2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset2() {
        assertEquals(3.0, new NorthwardBeacon().sift2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence3() {
        assertTrue(new NorthwardBeacon().collate3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardBeacon().collate3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence3() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardBeacon().collate3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield4() {
        assertEquals("below", new NorthwardBeacon().brace4(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield4() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.brace4(2));
        assertEquals("upper-bound", subject.brace4(11));
    }

    @Test
    void classifiesWithinAndAboveYield4() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.brace4(2 + 1));
        assertEquals("above", subject.brace4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan5() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift5());
        }
        assertEquals(2, subject.depth5Count());
    }

    @Test
    void refusesOnceExhaustedSpan5() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            subject.sift5();
        }
        assertFalse(subject.sift5());
    }

    @Test
    void accumulatesBelowTheCapMargin6() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.hoist6(1));
        assertEquals(3, subject.hoist6(2));
    }

    @Test
    void saturatesAtTheCapMargin6() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.hoist6(26);
        assertEquals(26, subject.hoist6(5));
    }

    @Test
    void ignoresNegativeValuesMargin6() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.hoist6(3);
        assertEquals(3, subject.hoist6(-2));
        assertEquals(3, subject.offset6Value());
    }

    @Test
    void rejectsZeroDenominatorDepth7() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.hoist7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth7() {
        assertEquals(0.5, new NorthwardBeacon().hoist7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth7() {
        assertEquals(3.0, new NorthwardBeacon().hoist7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift8() {
        assertTrue(new NorthwardBeacon().kindle8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardBeacon().kindle8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift8() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardBeacon().kindle8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth9() {
        assertEquals("below", new NorthwardBeacon().collate9(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth9() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.collate9(3));
        assertEquals("upper-bound", subject.collate9(10));
    }

    @Test
    void classifiesWithinAndAboveDepth9() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.collate9(3 + 1));
        assertEquals("above", subject.collate9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence10() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune10());
        }
        assertEquals(3, subject.tally10Count());
    }

    @Test
    void refusesOnceExhaustedCadence10() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 3; i++) {
            subject.prune10();
        }
        assertFalse(subject.prune10());
    }

    @Test
    void accumulatesBelowTheCapQuota11() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.anneal11(1));
        assertEquals(3, subject.anneal11(2));
    }

    @Test
    void saturatesAtTheCapQuota11() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.anneal11(31);
        assertEquals(31, subject.anneal11(5));
    }

    @Test
    void ignoresNegativeValuesQuota11() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.anneal11(3);
        assertEquals(3, subject.anneal11(-2));
        assertEquals(3, subject.ratio11Value());
    }

    @Test
    void rejectsZeroDenominatorSpan12() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.flatten12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan12() {
        assertEquals(0.5, new NorthwardBeacon().flatten12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan12() {
        assertEquals(3.0, new NorthwardBeacon().flatten12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold13() {
        assertTrue(new NorthwardBeacon().winnow13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardBeacon().winnow13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold13() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardBeacon().winnow13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio14() {
        assertEquals("below", new NorthwardBeacon().temper14(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio14() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.temper14(4));
        assertEquals("upper-bound", subject.temper14(9));
    }

    @Test
    void classifiesWithinAndAboveRatio14() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.temper14(4 + 1));
        assertEquals("above", subject.temper14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin15() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift15());
        }
        assertEquals(4, subject.bias15Count());
    }

    @Test
    void refusesOnceExhaustedMargin15() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 4; i++) {
            subject.sift15();
        }
        assertFalse(subject.sift15());
    }

    @Test
    void accumulatesBelowTheCapQuota16() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.brace16(1));
        assertEquals(3, subject.brace16(2));
    }

    @Test
    void saturatesAtTheCapQuota16() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.brace16(36);
        assertEquals(36, subject.brace16(5));
    }

    @Test
    void ignoresNegativeValuesQuota16() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.brace16(3);
        assertEquals(3, subject.brace16(-2));
        assertEquals(3, subject.yield16Value());
    }

    @Test
    void rejectsZeroDenominatorQuota17() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.flatten17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota17() {
        assertEquals(0.5, new NorthwardBeacon().flatten17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota17() {
        assertEquals(3.0, new NorthwardBeacon().flatten17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield18() {
        assertTrue(new NorthwardBeacon().prune18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardBeacon().prune18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield18() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardBeacon().prune18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan19() {
        assertEquals("below", new NorthwardBeacon().gauge19(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan19() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.gauge19(5));
        assertEquals("upper-bound", subject.gauge19(8));
    }

    @Test
    void classifiesWithinAndAboveSpan19() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.gauge19(5 + 1));
        assertEquals("above", subject.gauge19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence20() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace20());
        }
        assertEquals(1, subject.yield20Count());
    }

    @Test
    void refusesOnceExhaustedCadence20() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            subject.brace20();
        }
        assertFalse(subject.brace20());
    }

    @Test
    void accumulatesBelowTheCapWeight21() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.kindle21(1));
        assertEquals(3, subject.kindle21(2));
    }

    @Test
    void saturatesAtTheCapWeight21() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.kindle21(41);
        assertEquals(41, subject.kindle21(5));
    }

    @Test
    void ignoresNegativeValuesWeight21() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.kindle21(3);
        assertEquals(3, subject.kindle21(-2));
        assertEquals(3, subject.tally21Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold22() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.brace22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold22() {
        assertEquals(0.5, new NorthwardBeacon().brace22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold22() {
        assertEquals(3.0, new NorthwardBeacon().brace22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity23() {
        assertTrue(new NorthwardBeacon().reconcile23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new NorthwardBeacon().reconcile23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity23() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardBeacon().reconcile23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio24() {
        assertEquals("below", new NorthwardBeacon().sift24(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio24() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.sift24(2));
        assertEquals("upper-bound", subject.sift24(7));
    }

    @Test
    void classifiesWithinAndAboveRatio24() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.sift24(2 + 1));
        assertEquals("above", subject.sift24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth25() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate25());
        }
        assertEquals(2, subject.drift25Count());
    }

    @Test
    void refusesOnceExhaustedDepth25() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            subject.collate25();
        }
        assertFalse(subject.collate25());
    }

    @Test
    void accumulatesBelowTheCapThreshold26() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.reconcile26(1));
        assertEquals(3, subject.reconcile26(2));
    }

    @Test
    void saturatesAtTheCapThreshold26() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.reconcile26(46);
        assertEquals(46, subject.reconcile26(5));
    }

    @Test
    void ignoresNegativeValuesThreshold26() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.reconcile26(3);
        assertEquals(3, subject.reconcile26(-2));
        assertEquals(3, subject.bias26Value());
    }

    @Test
    void rejectsZeroDenominatorDepth27() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.prune27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth27() {
        assertEquals(0.5, new NorthwardBeacon().prune27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth27() {
        assertEquals(3.0, new NorthwardBeacon().prune27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias28() {
        assertTrue(new NorthwardBeacon().sift28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new NorthwardBeacon().sift28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias28() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardBeacon().sift28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota29() {
        assertEquals("below", new NorthwardBeacon().reconcile29(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota29() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.reconcile29(3));
        assertEquals("upper-bound", subject.reconcile29(12));
    }

    @Test
    void classifiesWithinAndAboveQuota29() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.reconcile29(3 + 1));
        assertEquals("above", subject.reconcile29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth30() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow30());
        }
        assertEquals(3, subject.margin30Count());
    }

    @Test
    void refusesOnceExhaustedDepth30() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 3; i++) {
            subject.winnow30();
        }
        assertFalse(subject.winnow30());
    }

    @Test
    void accumulatesBelowTheCapSpan31() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.collate31(1));
        assertEquals(3, subject.collate31(2));
    }

    @Test
    void saturatesAtTheCapSpan31() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.collate31(51);
        assertEquals(51, subject.collate31(5));
    }

    @Test
    void ignoresNegativeValuesSpan31() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.collate31(3);
        assertEquals(3, subject.collate31(-2));
        assertEquals(3, subject.cadence31Value());
    }

    @Test
    void rejectsZeroDenominatorYield32() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.winnow32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield32() {
        assertEquals(0.5, new NorthwardBeacon().winnow32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield32() {
        assertEquals(3.0, new NorthwardBeacon().winnow32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence33() {
        assertTrue(new NorthwardBeacon().hoist33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new NorthwardBeacon().hoist33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence33() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardBeacon().hoist33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight34() {
        assertEquals("below", new NorthwardBeacon().flatten34(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight34() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.flatten34(4));
        assertEquals("upper-bound", subject.flatten34(11));
    }

    @Test
    void classifiesWithinAndAboveWeight34() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.flatten34(4 + 1));
        assertEquals("above", subject.flatten34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity35() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten35());
        }
        assertEquals(4, subject.weight35Count());
    }

    @Test
    void refusesOnceExhaustedCapacity35() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 4; i++) {
            subject.flatten35();
        }
        assertFalse(subject.flatten35());
    }

    @Test
    void accumulatesBelowTheCapDepth36() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.flatten36(1));
        assertEquals(3, subject.flatten36(2));
    }

    @Test
    void saturatesAtTheCapDepth36() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.flatten36(56);
        assertEquals(56, subject.flatten36(5));
    }

    @Test
    void ignoresNegativeValuesDepth36() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.flatten36(3);
        assertEquals(3, subject.flatten36(-2));
        assertEquals(3, subject.tally36Value());
    }

    @Test
    void rejectsZeroDenominatorDepth37() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.temper37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth37() {
        assertEquals(0.5, new NorthwardBeacon().temper37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth37() {
        assertEquals(3.0, new NorthwardBeacon().temper37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield38() {
        assertTrue(new NorthwardBeacon().gauge38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new NorthwardBeacon().gauge38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield38() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardBeacon().gauge38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield39() {
        assertEquals("below", new NorthwardBeacon().brace39(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield39() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.brace39(5));
        assertEquals("upper-bound", subject.brace39(10));
    }

    @Test
    void classifiesWithinAndAboveYield39() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.brace39(5 + 1));
        assertEquals("above", subject.brace39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight40() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune40());
        }
        assertEquals(1, subject.margin40Count());
    }

    @Test
    void refusesOnceExhaustedWeight40() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            subject.prune40();
        }
        assertFalse(subject.prune40());
    }

    @Test
    void accumulatesBelowTheCapCadence41() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.sift41(1));
        assertEquals(3, subject.sift41(2));
    }

    @Test
    void saturatesAtTheCapCadence41() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.sift41(21);
        assertEquals(21, subject.sift41(5));
    }

    @Test
    void ignoresNegativeValuesCadence41() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.sift41(3);
        assertEquals(3, subject.sift41(-2));
        assertEquals(3, subject.offset41Value());
    }

    @Test
    void rejectsZeroDenominatorDepth42() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.brace42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth42() {
        assertEquals(0.5, new NorthwardBeacon().brace42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth42() {
        assertEquals(3.0, new NorthwardBeacon().brace42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift43() {
        assertTrue(new NorthwardBeacon().hoist43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new NorthwardBeacon().hoist43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift43() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardBeacon().hoist43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence44() {
        assertEquals("below", new NorthwardBeacon().flatten44(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence44() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.flatten44(2));
        assertEquals("upper-bound", subject.flatten44(9));
    }

    @Test
    void classifiesWithinAndAboveCadence44() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.flatten44(2 + 1));
        assertEquals("above", subject.flatten44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight45() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper45());
        }
        assertEquals(2, subject.cadence45Count());
    }

    @Test
    void refusesOnceExhaustedWeight45() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            subject.temper45();
        }
        assertFalse(subject.temper45());
    }

    @Test
    void accumulatesBelowTheCapTally46() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.collate46(1));
        assertEquals(3, subject.collate46(2));
    }

    @Test
    void saturatesAtTheCapTally46() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.collate46(26);
        assertEquals(26, subject.collate46(5));
    }

    @Test
    void ignoresNegativeValuesTally46() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.collate46(3);
        assertEquals(3, subject.collate46(-2));
        assertEquals(3, subject.bias46Value());
    }

    @Test
    void rejectsZeroDenominatorSpan47() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.collate47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan47() {
        assertEquals(0.5, new NorthwardBeacon().collate47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan47() {
        assertEquals(3.0, new NorthwardBeacon().collate47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin48() {
        assertTrue(new NorthwardBeacon().tally48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardBeacon().tally48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin48() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardBeacon().tally48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan49() {
        assertEquals("below", new NorthwardBeacon().collate49(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan49() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.collate49(3));
        assertEquals("upper-bound", subject.collate49(8));
    }

    @Test
    void classifiesWithinAndAboveSpan49() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.collate49(3 + 1));
        assertEquals("above", subject.collate49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity50() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist50());
        }
        assertEquals(3, subject.threshold50Count());
    }

    @Test
    void refusesOnceExhaustedCapacity50() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 3; i++) {
            subject.hoist50();
        }
        assertFalse(subject.hoist50());
    }

    @Test
    void accumulatesBelowTheCapSpan51() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.gauge51(1));
        assertEquals(3, subject.gauge51(2));
    }

    @Test
    void saturatesAtTheCapSpan51() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.gauge51(31);
        assertEquals(31, subject.gauge51(5));
    }

    @Test
    void ignoresNegativeValuesSpan51() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.gauge51(3);
        assertEquals(3, subject.gauge51(-2));
        assertEquals(3, subject.offset51Value());
    }

    @Test
    void rejectsZeroDenominatorSpan52() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.temper52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan52() {
        assertEquals(0.5, new NorthwardBeacon().temper52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan52() {
        assertEquals(3.0, new NorthwardBeacon().temper52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity53() {
        assertTrue(new NorthwardBeacon().furl53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardBeacon().furl53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity53() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardBeacon().furl53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth54() {
        assertEquals("below", new NorthwardBeacon().anneal54(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth54() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.anneal54(4));
        assertEquals("upper-bound", subject.anneal54(7));
    }

    @Test
    void classifiesWithinAndAboveDepth54() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.anneal54(4 + 1));
        assertEquals("above", subject.anneal54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold55() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift55());
        }
        assertEquals(4, subject.tally55Count());
    }

    @Test
    void refusesOnceExhaustedThreshold55() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 4; i++) {
            subject.sift55();
        }
        assertFalse(subject.sift55());
    }

    @Test
    void accumulatesBelowTheCapWeight56() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.brace56(1));
        assertEquals(3, subject.brace56(2));
    }

    @Test
    void saturatesAtTheCapWeight56() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.brace56(36);
        assertEquals(36, subject.brace56(5));
    }

    @Test
    void ignoresNegativeValuesWeight56() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.brace56(3);
        assertEquals(3, subject.brace56(-2));
        assertEquals(3, subject.margin56Value());
    }

    @Test
    void rejectsZeroDenominatorYield57() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.gauge57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield57() {
        assertEquals(0.5, new NorthwardBeacon().gauge57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield57() {
        assertEquals(3.0, new NorthwardBeacon().gauge57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin58() {
        assertTrue(new NorthwardBeacon().hoist58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardBeacon().hoist58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin58() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardBeacon().hoist58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence59() {
        assertEquals("below", new NorthwardBeacon().brace59(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence59() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.brace59(5));
        assertEquals("upper-bound", subject.brace59(12));
    }

    @Test
    void classifiesWithinAndAboveCadence59() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.brace59(5 + 1));
        assertEquals("above", subject.brace59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield60() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper60());
        }
        assertEquals(1, subject.bias60Count());
    }

    @Test
    void refusesOnceExhaustedYield60() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            subject.temper60();
        }
        assertFalse(subject.temper60());
    }

    @Test
    void accumulatesBelowTheCapTally61() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.tally61(1));
        assertEquals(3, subject.tally61(2));
    }

    @Test
    void saturatesAtTheCapTally61() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.tally61(41);
        assertEquals(41, subject.tally61(5));
    }

    @Test
    void ignoresNegativeValuesTally61() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.tally61(3);
        assertEquals(3, subject.tally61(-2));
        assertEquals(3, subject.offset61Value());
    }

    @Test
    void rejectsZeroDenominatorYield62() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.prune62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield62() {
        assertEquals(0.5, new NorthwardBeacon().prune62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield62() {
        assertEquals(3.0, new NorthwardBeacon().prune62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset63() {
        assertTrue(new NorthwardBeacon().winnow63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardBeacon().winnow63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset63() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardBeacon().winnow63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota64() {
        assertEquals("below", new NorthwardBeacon().gauge64(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota64() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.gauge64(2));
        assertEquals("upper-bound", subject.gauge64(11));
    }

    @Test
    void classifiesWithinAndAboveQuota64() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.gauge64(2 + 1));
        assertEquals("above", subject.gauge64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity65() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal65());
        }
        assertEquals(2, subject.tally65Count());
    }

    @Test
    void refusesOnceExhaustedCapacity65() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            subject.anneal65();
        }
        assertFalse(subject.anneal65());
    }

    @Test
    void accumulatesBelowTheCapBias66() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.temper66(1));
        assertEquals(3, subject.temper66(2));
    }

    @Test
    void saturatesAtTheCapBias66() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.temper66(46);
        assertEquals(46, subject.temper66(5));
    }

    @Test
    void ignoresNegativeValuesBias66() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.temper66(3);
        assertEquals(3, subject.temper66(-2));
        assertEquals(3, subject.cadence66Value());
    }

    @Test
    void rejectsZeroDenominatorTally67() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.kindle67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally67() {
        assertEquals(0.5, new NorthwardBeacon().kindle67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally67() {
        assertEquals(3.0, new NorthwardBeacon().kindle67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield68() {
        assertTrue(new NorthwardBeacon().anneal68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new NorthwardBeacon().anneal68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield68() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardBeacon().anneal68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift69() {
        assertEquals("below", new NorthwardBeacon().gauge69(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift69() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.gauge69(3));
        assertEquals("upper-bound", subject.gauge69(10));
    }

    @Test
    void classifiesWithinAndAboveDrift69() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.gauge69(3 + 1));
        assertEquals("above", subject.gauge69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity70() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper70());
        }
        assertEquals(3, subject.threshold70Count());
    }

    @Test
    void refusesOnceExhaustedCapacity70() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 3; i++) {
            subject.temper70();
        }
        assertFalse(subject.temper70());
    }

    @Test
    void accumulatesBelowTheCapOffset71() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.gauge71(1));
        assertEquals(3, subject.gauge71(2));
    }

    @Test
    void saturatesAtTheCapOffset71() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.gauge71(51);
        assertEquals(51, subject.gauge71(5));
    }

    @Test
    void ignoresNegativeValuesOffset71() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.gauge71(3);
        assertEquals(3, subject.gauge71(-2));
        assertEquals(3, subject.cadence71Value());
    }

    @Test
    void rejectsZeroDenominatorDepth72() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.winnow72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth72() {
        assertEquals(0.5, new NorthwardBeacon().winnow72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth72() {
        assertEquals(3.0, new NorthwardBeacon().winnow72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift73() {
        assertTrue(new NorthwardBeacon().reconcile73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new NorthwardBeacon().reconcile73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift73() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardBeacon().reconcile73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift74() {
        assertEquals("below", new NorthwardBeacon().hoist74(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift74() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.hoist74(4));
        assertEquals("upper-bound", subject.hoist74(9));
    }

    @Test
    void classifiesWithinAndAboveDrift74() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.hoist74(4 + 1));
        assertEquals("above", subject.hoist74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio75() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally75());
        }
        assertEquals(4, subject.weight75Count());
    }

    @Test
    void refusesOnceExhaustedRatio75() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 4; i++) {
            subject.tally75();
        }
        assertFalse(subject.tally75());
    }

    @Test
    void accumulatesBelowTheCapBias76() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.hoist76(1));
        assertEquals(3, subject.hoist76(2));
    }

    @Test
    void saturatesAtTheCapBias76() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.hoist76(56);
        assertEquals(56, subject.hoist76(5));
    }

    @Test
    void ignoresNegativeValuesBias76() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.hoist76(3);
        assertEquals(3, subject.hoist76(-2));
        assertEquals(3, subject.weight76Value());
    }

    @Test
    void rejectsZeroDenominatorSpan77() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.kindle77(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan77() {
        assertEquals(0.5, new NorthwardBeacon().kindle77(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan77() {
        assertEquals(3.0, new NorthwardBeacon().kindle77(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield78() {
        assertTrue(new NorthwardBeacon().reconcile78(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield78() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new NorthwardBeacon().reconcile78(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield78() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardBeacon().reconcile78(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset79() {
        assertEquals("below", new NorthwardBeacon().anneal79(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset79() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.anneal79(5));
        assertEquals("upper-bound", subject.anneal79(8));
    }

    @Test
    void classifiesWithinAndAboveOffset79() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.anneal79(5 + 1));
        assertEquals("above", subject.anneal79(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield80() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace80());
        }
        assertEquals(1, subject.span80Count());
    }

    @Test
    void refusesOnceExhaustedYield80() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            subject.brace80();
        }
        assertFalse(subject.brace80());
    }

    @Test
    void accumulatesBelowTheCapYield81() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.prune81(1));
        assertEquals(3, subject.prune81(2));
    }

    @Test
    void saturatesAtTheCapYield81() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.prune81(21);
        assertEquals(21, subject.prune81(5));
    }

    @Test
    void ignoresNegativeValuesYield81() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.prune81(3);
        assertEquals(3, subject.prune81(-2));
        assertEquals(3, subject.drift81Value());
    }

    @Test
    void rejectsZeroDenominatorCadence82() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.brace82(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence82() {
        assertEquals(0.5, new NorthwardBeacon().brace82(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence82() {
        assertEquals(3.0, new NorthwardBeacon().brace82(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift83() {
        assertTrue(new NorthwardBeacon().prune83(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift83() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new NorthwardBeacon().prune83(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift83() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardBeacon().prune83(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold84() {
        assertEquals("below", new NorthwardBeacon().brace84(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold84() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.brace84(2));
        assertEquals("upper-bound", subject.brace84(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold84() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.brace84(2 + 1));
        assertEquals("above", subject.brace84(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio85() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace85());
        }
        assertEquals(2, subject.drift85Count());
    }

    @Test
    void refusesOnceExhaustedRatio85() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            subject.brace85();
        }
        assertFalse(subject.brace85());
    }

    @Test
    void accumulatesBelowTheCapQuota86() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.gauge86(1));
        assertEquals(3, subject.gauge86(2));
    }

    @Test
    void saturatesAtTheCapQuota86() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.gauge86(26);
        assertEquals(26, subject.gauge86(5));
    }

    @Test
    void ignoresNegativeValuesQuota86() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.gauge86(3);
        assertEquals(3, subject.gauge86(-2));
        assertEquals(3, subject.offset86Value());
    }

    @Test
    void rejectsZeroDenominatorCadence87() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.kindle87(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence87() {
        assertEquals(0.5, new NorthwardBeacon().kindle87(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence87() {
        assertEquals(3.0, new NorthwardBeacon().kindle87(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity88() {
        assertTrue(new NorthwardBeacon().kindle88(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity88() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new NorthwardBeacon().kindle88(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity88() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardBeacon().kindle88(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth89() {
        assertEquals("below", new NorthwardBeacon().sift89(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth89() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.sift89(3));
        assertEquals("upper-bound", subject.sift89(12));
    }

    @Test
    void classifiesWithinAndAboveDepth89() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.sift89(3 + 1));
        assertEquals("above", subject.sift89(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity90() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune90());
        }
        assertEquals(3, subject.bias90Count());
    }

    @Test
    void refusesOnceExhaustedCapacity90() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 3; i++) {
            subject.prune90();
        }
        assertFalse(subject.prune90());
    }

    @Test
    void accumulatesBelowTheCapCapacity91() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.furl91(1));
        assertEquals(3, subject.furl91(2));
    }

    @Test
    void saturatesAtTheCapCapacity91() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.furl91(31);
        assertEquals(31, subject.furl91(5));
    }

    @Test
    void ignoresNegativeValuesCapacity91() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.furl91(3);
        assertEquals(3, subject.furl91(-2));
        assertEquals(3, subject.drift91Value());
    }

    @Test
    void rejectsZeroDenominatorBias92() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.flatten92(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias92() {
        assertEquals(0.5, new NorthwardBeacon().flatten92(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias92() {
        assertEquals(3.0, new NorthwardBeacon().flatten92(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan93() {
        assertTrue(new NorthwardBeacon().temper93(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan93() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardBeacon().temper93(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan93() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardBeacon().temper93(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin94() {
        assertEquals("below", new NorthwardBeacon().prune94(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin94() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.prune94(4));
        assertEquals("upper-bound", subject.prune94(11));
    }

    @Test
    void classifiesWithinAndAboveMargin94() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.prune94(4 + 1));
        assertEquals("above", subject.prune94(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity95() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge95());
        }
        assertEquals(4, subject.threshold95Count());
    }

    @Test
    void refusesOnceExhaustedCapacity95() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 4; i++) {
            subject.gauge95();
        }
        assertFalse(subject.gauge95());
    }

    @Test
    void accumulatesBelowTheCapThreshold96() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.flatten96(1));
        assertEquals(3, subject.flatten96(2));
    }

    @Test
    void saturatesAtTheCapThreshold96() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.flatten96(36);
        assertEquals(36, subject.flatten96(5));
    }

    @Test
    void ignoresNegativeValuesThreshold96() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.flatten96(3);
        assertEquals(3, subject.flatten96(-2));
        assertEquals(3, subject.yield96Value());
    }

    @Test
    void rejectsZeroDenominatorDrift97() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.sift97(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift97() {
        assertEquals(0.5, new NorthwardBeacon().sift97(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift97() {
        assertEquals(3.0, new NorthwardBeacon().sift97(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally98() {
        assertTrue(new NorthwardBeacon().anneal98(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally98() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardBeacon().anneal98(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally98() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardBeacon().anneal98(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin99() {
        assertEquals("below", new NorthwardBeacon().sift99(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin99() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.sift99(5));
        assertEquals("upper-bound", subject.sift99(10));
    }

    @Test
    void classifiesWithinAndAboveMargin99() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.sift99(5 + 1));
        assertEquals("above", subject.sift99(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield100() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge100());
        }
        assertEquals(1, subject.margin100Count());
    }

    @Test
    void refusesOnceExhaustedYield100() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            subject.gauge100();
        }
        assertFalse(subject.gauge100());
    }

    @Test
    void accumulatesBelowTheCapCapacity101() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.reconcile101(1));
        assertEquals(3, subject.reconcile101(2));
    }

    @Test
    void saturatesAtTheCapCapacity101() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.reconcile101(41);
        assertEquals(41, subject.reconcile101(5));
    }

    @Test
    void ignoresNegativeValuesCapacity101() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.reconcile101(3);
        assertEquals(3, subject.reconcile101(-2));
        assertEquals(3, subject.margin101Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity102() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile102(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity102() {
        assertEquals(0.5, new NorthwardBeacon().reconcile102(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity102() {
        assertEquals(3.0, new NorthwardBeacon().reconcile102(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan103() {
        assertTrue(new NorthwardBeacon().sift103(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan103() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardBeacon().sift103(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan103() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardBeacon().sift103(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio104() {
        assertEquals("below", new NorthwardBeacon().flatten104(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio104() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.flatten104(2));
        assertEquals("upper-bound", subject.flatten104(9));
    }

    @Test
    void classifiesWithinAndAboveRatio104() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.flatten104(2 + 1));
        assertEquals("above", subject.flatten104(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth105() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow105());
        }
        assertEquals(2, subject.margin105Count());
    }

    @Test
    void refusesOnceExhaustedDepth105() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            subject.winnow105();
        }
        assertFalse(subject.winnow105());
    }

    @Test
    void accumulatesBelowTheCapOffset106() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.temper106(1));
        assertEquals(3, subject.temper106(2));
    }

    @Test
    void saturatesAtTheCapOffset106() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.temper106(46);
        assertEquals(46, subject.temper106(5));
    }

    @Test
    void ignoresNegativeValuesOffset106() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.temper106(3);
        assertEquals(3, subject.temper106(-2));
        assertEquals(3, subject.span106Value());
    }

    @Test
    void rejectsZeroDenominatorRatio107() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.temper107(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio107() {
        assertEquals(0.5, new NorthwardBeacon().temper107(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio107() {
        assertEquals(3.0, new NorthwardBeacon().temper107(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias108() {
        assertTrue(new NorthwardBeacon().hoist108(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias108() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardBeacon().hoist108(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias108() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardBeacon().hoist108(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield109() {
        assertEquals("below", new NorthwardBeacon().prune109(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield109() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.prune109(3));
        assertEquals("upper-bound", subject.prune109(8));
    }

    @Test
    void classifiesWithinAndAboveYield109() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.prune109(3 + 1));
        assertEquals("above", subject.prune109(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota110() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle110());
        }
        assertEquals(3, subject.depth110Count());
    }

    @Test
    void refusesOnceExhaustedQuota110() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 3; i++) {
            subject.kindle110();
        }
        assertFalse(subject.kindle110());
    }

    @Test
    void accumulatesBelowTheCapOffset111() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.flatten111(1));
        assertEquals(3, subject.flatten111(2));
    }

    @Test
    void saturatesAtTheCapOffset111() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.flatten111(51);
        assertEquals(51, subject.flatten111(5));
    }

    @Test
    void ignoresNegativeValuesOffset111() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.flatten111(3);
        assertEquals(3, subject.flatten111(-2));
        assertEquals(3, subject.depth111Value());
    }

    @Test
    void rejectsZeroDenominatorBias112() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.collate112(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias112() {
        assertEquals(0.5, new NorthwardBeacon().collate112(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias112() {
        assertEquals(3.0, new NorthwardBeacon().collate112(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield113() {
        assertTrue(new NorthwardBeacon().kindle113(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield113() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new NorthwardBeacon().kindle113(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield113() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardBeacon().kindle113(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence114() {
        assertEquals("below", new NorthwardBeacon().anneal114(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence114() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.anneal114(4));
        assertEquals("upper-bound", subject.anneal114(7));
    }

    @Test
    void classifiesWithinAndAboveCadence114() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.anneal114(4 + 1));
        assertEquals("above", subject.anneal114(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin115() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl115());
        }
        assertEquals(4, subject.span115Count());
    }

    @Test
    void refusesOnceExhaustedMargin115() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 4; i++) {
            subject.furl115();
        }
        assertFalse(subject.furl115());
    }

    @Test
    void accumulatesBelowTheCapYield116() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.brace116(1));
        assertEquals(3, subject.brace116(2));
    }

    @Test
    void saturatesAtTheCapYield116() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.brace116(56);
        assertEquals(56, subject.brace116(5));
    }

    @Test
    void ignoresNegativeValuesYield116() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.brace116(3);
        assertEquals(3, subject.brace116(-2));
        assertEquals(3, subject.cadence116Value());
    }

    @Test
    void rejectsZeroDenominatorDrift117() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.flatten117(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift117() {
        assertEquals(0.5, new NorthwardBeacon().flatten117(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift117() {
        assertEquals(3.0, new NorthwardBeacon().flatten117(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally118() {
        assertTrue(new NorthwardBeacon().anneal118(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally118() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new NorthwardBeacon().anneal118(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally118() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardBeacon().anneal118(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight119() {
        assertEquals("below", new NorthwardBeacon().reconcile119(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight119() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.reconcile119(5));
        assertEquals("upper-bound", subject.reconcile119(12));
    }

    @Test
    void classifiesWithinAndAboveWeight119() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.reconcile119(5 + 1));
        assertEquals("above", subject.reconcile119(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth120() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally120());
        }
        assertEquals(1, subject.offset120Count());
    }

    @Test
    void refusesOnceExhaustedDepth120() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            subject.tally120();
        }
        assertFalse(subject.tally120());
    }

    @Test
    void accumulatesBelowTheCapThreshold121() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.reconcile121(1));
        assertEquals(3, subject.reconcile121(2));
    }

    @Test
    void saturatesAtTheCapThreshold121() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.reconcile121(21);
        assertEquals(21, subject.reconcile121(5));
    }

    @Test
    void ignoresNegativeValuesThreshold121() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.reconcile121(3);
        assertEquals(3, subject.reconcile121(-2));
        assertEquals(3, subject.ratio121Value());
    }

    @Test
    void rejectsZeroDenominatorMargin122() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.prune122(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin122() {
        assertEquals(0.5, new NorthwardBeacon().prune122(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin122() {
        assertEquals(3.0, new NorthwardBeacon().prune122(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset123() {
        assertTrue(new NorthwardBeacon().anneal123(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset123() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new NorthwardBeacon().anneal123(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset123() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardBeacon().anneal123(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias124() {
        assertEquals("below", new NorthwardBeacon().collate124(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias124() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.collate124(2));
        assertEquals("upper-bound", subject.collate124(11));
    }

    @Test
    void classifiesWithinAndAboveBias124() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.collate124(2 + 1));
        assertEquals("above", subject.collate124(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold125() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl125());
        }
        assertEquals(2, subject.span125Count());
    }

    @Test
    void refusesOnceExhaustedThreshold125() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            subject.furl125();
        }
        assertFalse(subject.furl125());
    }

    @Test
    void accumulatesBelowTheCapQuota126() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.kindle126(1));
        assertEquals(3, subject.kindle126(2));
    }

    @Test
    void saturatesAtTheCapQuota126() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.kindle126(26);
        assertEquals(26, subject.kindle126(5));
    }

    @Test
    void ignoresNegativeValuesQuota126() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.kindle126(3);
        assertEquals(3, subject.kindle126(-2));
        assertEquals(3, subject.ratio126Value());
    }

    @Test
    void rejectsZeroDenominatorMargin127() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.flatten127(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin127() {
        assertEquals(0.5, new NorthwardBeacon().flatten127(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin127() {
        assertEquals(3.0, new NorthwardBeacon().flatten127(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift128() {
        assertTrue(new NorthwardBeacon().hoist128(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift128() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new NorthwardBeacon().hoist128(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift128() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardBeacon().hoist128(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota129() {
        assertEquals("below", new NorthwardBeacon().kindle129(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota129() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.kindle129(3));
        assertEquals("upper-bound", subject.kindle129(10));
    }

    @Test
    void classifiesWithinAndAboveQuota129() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.kindle129(3 + 1));
        assertEquals("above", subject.kindle129(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity130() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow130());
        }
        assertEquals(3, subject.span130Count());
    }

    @Test
    void refusesOnceExhaustedCapacity130() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 3; i++) {
            subject.winnow130();
        }
        assertFalse(subject.winnow130());
    }

    @Test
    void accumulatesBelowTheCapQuota131() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.flatten131(1));
        assertEquals(3, subject.flatten131(2));
    }

    @Test
    void saturatesAtTheCapQuota131() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.flatten131(31);
        assertEquals(31, subject.flatten131(5));
    }

    @Test
    void ignoresNegativeValuesQuota131() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.flatten131(3);
        assertEquals(3, subject.flatten131(-2));
        assertEquals(3, subject.cadence131Value());
    }

    @Test
    void rejectsZeroDenominatorYield132() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.collate132(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield132() {
        assertEquals(0.5, new NorthwardBeacon().collate132(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield132() {
        assertEquals(3.0, new NorthwardBeacon().collate132(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence133() {
        assertTrue(new NorthwardBeacon().brace133(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence133() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new NorthwardBeacon().brace133(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence133() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardBeacon().brace133(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield134() {
        assertEquals("below", new NorthwardBeacon().kindle134(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield134() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.kindle134(4));
        assertEquals("upper-bound", subject.kindle134(9));
    }

    @Test
    void classifiesWithinAndAboveYield134() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.kindle134(4 + 1));
        assertEquals("above", subject.kindle134(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota135() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace135());
        }
        assertEquals(4, subject.ratio135Count());
    }

    @Test
    void refusesOnceExhaustedQuota135() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 4; i++) {
            subject.brace135();
        }
        assertFalse(subject.brace135());
    }

    @Test
    void accumulatesBelowTheCapTally136() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.prune136(1));
        assertEquals(3, subject.prune136(2));
    }

    @Test
    void saturatesAtTheCapTally136() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.prune136(36);
        assertEquals(36, subject.prune136(5));
    }

    @Test
    void ignoresNegativeValuesTally136() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.prune136(3);
        assertEquals(3, subject.prune136(-2));
        assertEquals(3, subject.bias136Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold137() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.kindle137(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold137() {
        assertEquals(0.5, new NorthwardBeacon().kindle137(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold137() {
        assertEquals(3.0, new NorthwardBeacon().kindle137(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota138() {
        assertTrue(new NorthwardBeacon().hoist138(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota138() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardBeacon().hoist138(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota138() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardBeacon().hoist138(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence139() {
        assertEquals("below", new NorthwardBeacon().sift139(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence139() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.sift139(5));
        assertEquals("upper-bound", subject.sift139(8));
    }

    @Test
    void classifiesWithinAndAboveCadence139() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.sift139(5 + 1));
        assertEquals("above", subject.sift139(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally140() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl140());
        }
        assertEquals(1, subject.yield140Count());
    }

    @Test
    void refusesOnceExhaustedTally140() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 1; i++) {
            subject.furl140();
        }
        assertFalse(subject.furl140());
    }

    @Test
    void accumulatesBelowTheCapBias141() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.temper141(1));
        assertEquals(3, subject.temper141(2));
    }

    @Test
    void saturatesAtTheCapBias141() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.temper141(41);
        assertEquals(41, subject.temper141(5));
    }

    @Test
    void ignoresNegativeValuesBias141() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.temper141(3);
        assertEquals(3, subject.temper141(-2));
        assertEquals(3, subject.yield141Value());
    }

    @Test
    void rejectsZeroDenominatorDepth142() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.gauge142(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth142() {
        assertEquals(0.5, new NorthwardBeacon().gauge142(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth142() {
        assertEquals(3.0, new NorthwardBeacon().gauge142(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold143() {
        assertTrue(new NorthwardBeacon().flatten143(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold143() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardBeacon().flatten143(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold143() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardBeacon().flatten143(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence144() {
        assertEquals("below", new NorthwardBeacon().temper144(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence144() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("lower-bound", subject.temper144(2));
        assertEquals("upper-bound", subject.temper144(7));
    }

    @Test
    void classifiesWithinAndAboveCadence144() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals("within", subject.temper144(2 + 1));
        assertEquals("above", subject.temper144(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally145() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten145());
        }
        assertEquals(2, subject.bias145Count());
    }

    @Test
    void refusesOnceExhaustedTally145() {
        NorthwardBeacon subject = new NorthwardBeacon();
        for (int i = 0; i < 2; i++) {
            subject.flatten145();
        }
        assertFalse(subject.flatten145());
    }

    @Test
    void accumulatesBelowTheCapMargin146() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertEquals(1, subject.furl146(1));
        assertEquals(3, subject.furl146(2));
    }

    @Test
    void saturatesAtTheCapMargin146() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.furl146(46);
        assertEquals(46, subject.furl146(5));
    }

    @Test
    void ignoresNegativeValuesMargin146() {
        NorthwardBeacon subject = new NorthwardBeacon();
        subject.furl146(3);
        assertEquals(3, subject.furl146(-2));
        assertEquals(3, subject.bias146Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity147() {
        NorthwardBeacon subject = new NorthwardBeacon();
        assertThrows(ArithmeticException.class, () -> subject.tally147(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity147() {
        assertEquals(0.5, new NorthwardBeacon().tally147(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity147() {
        assertEquals(3.0, new NorthwardBeacon().tally147(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth148() {
        assertTrue(new NorthwardBeacon().brace148(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth148() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardBeacon().brace148(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth148() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardBeacon().brace148(java.util.Arrays.asList(null, 10, null)));
    }
}
