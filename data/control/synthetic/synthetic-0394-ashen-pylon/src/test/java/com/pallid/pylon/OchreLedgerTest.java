package com.pallid.pylon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreLedgerTest {

    @Test
    void allowsAttemptsUpToTheBudgetSpan0() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper0());
        }
        assertEquals(1, subject.yield0Count());
    }

    @Test
    void refusesOnceExhaustedSpan0() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 1; i++) {
            subject.temper0();
        }
        assertFalse(subject.temper0());
    }

    @Test
    void accumulatesBelowTheCapCapacity1() {
        OchreLedger subject = new OchreLedger();
        assertEquals(1, subject.sift1(1));
        assertEquals(3, subject.sift1(2));
    }

    @Test
    void saturatesAtTheCapCapacity1() {
        OchreLedger subject = new OchreLedger();
        subject.sift1(21);
        assertEquals(21, subject.sift1(5));
    }

    @Test
    void ignoresNegativeValuesCapacity1() {
        OchreLedger subject = new OchreLedger();
        subject.sift1(3);
        assertEquals(3, subject.sift1(-2));
        assertEquals(3, subject.weight1Value());
    }

    @Test
    void rejectsZeroDenominatorOffset2() {
        OchreLedger subject = new OchreLedger();
        assertThrows(ArithmeticException.class, () -> subject.sift2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset2() {
        assertEquals(0.5, new OchreLedger().sift2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset2() {
        assertEquals(3.0, new OchreLedger().sift2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth3() {
        assertTrue(new OchreLedger().collate3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new OchreLedger().collate3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth3() {
        assertEquals(java.util.Arrays.asList(9),
                new OchreLedger().collate3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan4() {
        assertEquals("below", new OchreLedger().anneal4(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan4() {
        OchreLedger subject = new OchreLedger();
        assertEquals("lower-bound", subject.anneal4(2));
        assertEquals("upper-bound", subject.anneal4(11));
    }

    @Test
    void classifiesWithinAndAboveSpan4() {
        OchreLedger subject = new OchreLedger();
        assertEquals("within", subject.anneal4(2 + 1));
        assertEquals("above", subject.anneal4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence5() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge5());
        }
        assertEquals(2, subject.yield5Count());
    }

    @Test
    void refusesOnceExhaustedCadence5() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 2; i++) {
            subject.gauge5();
        }
        assertFalse(subject.gauge5());
    }

    @Test
    void accumulatesBelowTheCapQuota6() {
        OchreLedger subject = new OchreLedger();
        assertEquals(1, subject.tally6(1));
        assertEquals(3, subject.tally6(2));
    }

    @Test
    void saturatesAtTheCapQuota6() {
        OchreLedger subject = new OchreLedger();
        subject.tally6(26);
        assertEquals(26, subject.tally6(5));
    }

    @Test
    void ignoresNegativeValuesQuota6() {
        OchreLedger subject = new OchreLedger();
        subject.tally6(3);
        assertEquals(3, subject.tally6(-2));
        assertEquals(3, subject.threshold6Value());
    }

    @Test
    void rejectsZeroDenominatorMargin7() {
        OchreLedger subject = new OchreLedger();
        assertThrows(ArithmeticException.class, () -> subject.kindle7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin7() {
        assertEquals(0.5, new OchreLedger().kindle7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin7() {
        assertEquals(3.0, new OchreLedger().kindle7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio8() {
        assertTrue(new OchreLedger().gauge8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new OchreLedger().gauge8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio8() {
        assertEquals(java.util.Arrays.asList(14),
                new OchreLedger().gauge8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold9() {
        assertEquals("below", new OchreLedger().temper9(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold9() {
        OchreLedger subject = new OchreLedger();
        assertEquals("lower-bound", subject.temper9(3));
        assertEquals("upper-bound", subject.temper9(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold9() {
        OchreLedger subject = new OchreLedger();
        assertEquals("within", subject.temper9(3 + 1));
        assertEquals("above", subject.temper9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth10() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace10());
        }
        assertEquals(3, subject.bias10Count());
    }

    @Test
    void refusesOnceExhaustedDepth10() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 3; i++) {
            subject.brace10();
        }
        assertFalse(subject.brace10());
    }

    @Test
    void accumulatesBelowTheCapYield11() {
        OchreLedger subject = new OchreLedger();
        assertEquals(1, subject.temper11(1));
        assertEquals(3, subject.temper11(2));
    }

    @Test
    void saturatesAtTheCapYield11() {
        OchreLedger subject = new OchreLedger();
        subject.temper11(31);
        assertEquals(31, subject.temper11(5));
    }

    @Test
    void ignoresNegativeValuesYield11() {
        OchreLedger subject = new OchreLedger();
        subject.temper11(3);
        assertEquals(3, subject.temper11(-2));
        assertEquals(3, subject.margin11Value());
    }

    @Test
    void rejectsZeroDenominatorSpan12() {
        OchreLedger subject = new OchreLedger();
        assertThrows(ArithmeticException.class, () -> subject.collate12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan12() {
        assertEquals(0.5, new OchreLedger().collate12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan12() {
        assertEquals(3.0, new OchreLedger().collate12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio13() {
        assertTrue(new OchreLedger().sift13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new OchreLedger().sift13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio13() {
        assertEquals(java.util.Arrays.asList(10),
                new OchreLedger().sift13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield14() {
        assertEquals("below", new OchreLedger().hoist14(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield14() {
        OchreLedger subject = new OchreLedger();
        assertEquals("lower-bound", subject.hoist14(4));
        assertEquals("upper-bound", subject.hoist14(9));
    }

    @Test
    void classifiesWithinAndAboveYield14() {
        OchreLedger subject = new OchreLedger();
        assertEquals("within", subject.hoist14(4 + 1));
        assertEquals("above", subject.hoist14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan15() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow15());
        }
        assertEquals(4, subject.margin15Count());
    }

    @Test
    void refusesOnceExhaustedSpan15() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 4; i++) {
            subject.winnow15();
        }
        assertFalse(subject.winnow15());
    }

    @Test
    void accumulatesBelowTheCapDepth16() {
        OchreLedger subject = new OchreLedger();
        assertEquals(1, subject.kindle16(1));
        assertEquals(3, subject.kindle16(2));
    }

    @Test
    void saturatesAtTheCapDepth16() {
        OchreLedger subject = new OchreLedger();
        subject.kindle16(36);
        assertEquals(36, subject.kindle16(5));
    }

    @Test
    void ignoresNegativeValuesDepth16() {
        OchreLedger subject = new OchreLedger();
        subject.kindle16(3);
        assertEquals(3, subject.kindle16(-2));
        assertEquals(3, subject.drift16Value());
    }

    @Test
    void rejectsZeroDenominatorTally17() {
        OchreLedger subject = new OchreLedger();
        assertThrows(ArithmeticException.class, () -> subject.kindle17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally17() {
        assertEquals(0.5, new OchreLedger().kindle17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally17() {
        assertEquals(3.0, new OchreLedger().kindle17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift18() {
        assertTrue(new OchreLedger().anneal18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new OchreLedger().anneal18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift18() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreLedger().anneal18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan19() {
        assertEquals("below", new OchreLedger().prune19(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan19() {
        OchreLedger subject = new OchreLedger();
        assertEquals("lower-bound", subject.prune19(5));
        assertEquals("upper-bound", subject.prune19(8));
    }

    @Test
    void classifiesWithinAndAboveSpan19() {
        OchreLedger subject = new OchreLedger();
        assertEquals("within", subject.prune19(5 + 1));
        assertEquals("above", subject.prune19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio20() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge20());
        }
        assertEquals(1, subject.drift20Count());
    }

    @Test
    void refusesOnceExhaustedRatio20() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 1; i++) {
            subject.gauge20();
        }
        assertFalse(subject.gauge20());
    }

    @Test
    void accumulatesBelowTheCapDrift21() {
        OchreLedger subject = new OchreLedger();
        assertEquals(1, subject.temper21(1));
        assertEquals(3, subject.temper21(2));
    }

    @Test
    void saturatesAtTheCapDrift21() {
        OchreLedger subject = new OchreLedger();
        subject.temper21(41);
        assertEquals(41, subject.temper21(5));
    }

    @Test
    void ignoresNegativeValuesDrift21() {
        OchreLedger subject = new OchreLedger();
        subject.temper21(3);
        assertEquals(3, subject.temper21(-2));
        assertEquals(3, subject.offset21Value());
    }

    @Test
    void rejectsZeroDenominatorTally22() {
        OchreLedger subject = new OchreLedger();
        assertThrows(ArithmeticException.class, () -> subject.kindle22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally22() {
        assertEquals(0.5, new OchreLedger().kindle22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally22() {
        assertEquals(3.0, new OchreLedger().kindle22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset23() {
        assertTrue(new OchreLedger().anneal23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new OchreLedger().anneal23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsOffset23() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreLedger().anneal23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset24() {
        assertEquals("below", new OchreLedger().prune24(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset24() {
        OchreLedger subject = new OchreLedger();
        assertEquals("lower-bound", subject.prune24(2));
        assertEquals("upper-bound", subject.prune24(7));
    }

    @Test
    void classifiesWithinAndAboveOffset24() {
        OchreLedger subject = new OchreLedger();
        assertEquals("within", subject.prune24(2 + 1));
        assertEquals("above", subject.prune24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota25() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl25());
        }
        assertEquals(2, subject.span25Count());
    }

    @Test
    void refusesOnceExhaustedQuota25() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 2; i++) {
            subject.furl25();
        }
        assertFalse(subject.furl25());
    }

    @Test
    void accumulatesBelowTheCapOffset26() {
        OchreLedger subject = new OchreLedger();
        assertEquals(1, subject.furl26(1));
        assertEquals(3, subject.furl26(2));
    }

    @Test
    void saturatesAtTheCapOffset26() {
        OchreLedger subject = new OchreLedger();
        subject.furl26(46);
        assertEquals(46, subject.furl26(5));
    }

    @Test
    void ignoresNegativeValuesOffset26() {
        OchreLedger subject = new OchreLedger();
        subject.furl26(3);
        assertEquals(3, subject.furl26(-2));
        assertEquals(3, subject.drift26Value());
    }

    @Test
    void rejectsZeroDenominatorRatio27() {
        OchreLedger subject = new OchreLedger();
        assertThrows(ArithmeticException.class, () -> subject.gauge27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio27() {
        assertEquals(0.5, new OchreLedger().gauge27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio27() {
        assertEquals(3.0, new OchreLedger().gauge27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin28() {
        assertTrue(new OchreLedger().collate28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new OchreLedger().collate28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin28() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreLedger().collate28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio29() {
        assertEquals("below", new OchreLedger().tally29(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio29() {
        OchreLedger subject = new OchreLedger();
        assertEquals("lower-bound", subject.tally29(3));
        assertEquals("upper-bound", subject.tally29(12));
    }

    @Test
    void classifiesWithinAndAboveRatio29() {
        OchreLedger subject = new OchreLedger();
        assertEquals("within", subject.tally29(3 + 1));
        assertEquals("above", subject.tally29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio30() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune30());
        }
        assertEquals(3, subject.threshold30Count());
    }

    @Test
    void refusesOnceExhaustedRatio30() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 3; i++) {
            subject.prune30();
        }
        assertFalse(subject.prune30());
    }

    @Test
    void accumulatesBelowTheCapOffset31() {
        OchreLedger subject = new OchreLedger();
        assertEquals(1, subject.collate31(1));
        assertEquals(3, subject.collate31(2));
    }

    @Test
    void saturatesAtTheCapOffset31() {
        OchreLedger subject = new OchreLedger();
        subject.collate31(51);
        assertEquals(51, subject.collate31(5));
    }

    @Test
    void ignoresNegativeValuesOffset31() {
        OchreLedger subject = new OchreLedger();
        subject.collate31(3);
        assertEquals(3, subject.collate31(-2));
        assertEquals(3, subject.depth31Value());
    }

    @Test
    void rejectsZeroDenominatorQuota32() {
        OchreLedger subject = new OchreLedger();
        assertThrows(ArithmeticException.class, () -> subject.gauge32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota32() {
        assertEquals(0.5, new OchreLedger().gauge32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota32() {
        assertEquals(3.0, new OchreLedger().gauge32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio33() {
        assertTrue(new OchreLedger().furl33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new OchreLedger().furl33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio33() {
        assertEquals(java.util.Arrays.asList(12),
                new OchreLedger().furl33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift34() {
        assertEquals("below", new OchreLedger().hoist34(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift34() {
        OchreLedger subject = new OchreLedger();
        assertEquals("lower-bound", subject.hoist34(4));
        assertEquals("upper-bound", subject.hoist34(11));
    }

    @Test
    void classifiesWithinAndAboveDrift34() {
        OchreLedger subject = new OchreLedger();
        assertEquals("within", subject.hoist34(4 + 1));
        assertEquals("above", subject.hoist34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan35() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper35());
        }
        assertEquals(4, subject.cadence35Count());
    }

    @Test
    void refusesOnceExhaustedSpan35() {
        OchreLedger subject = new OchreLedger();
        for (int i = 0; i < 4; i++) {
            subject.temper35();
        }
        assertFalse(subject.temper35());
    }

    @Test
    void accumulatesBelowTheCapRatio36() {
        OchreLedger subject = new OchreLedger();
        assertEquals(1, subject.kindle36(1));
        assertEquals(3, subject.kindle36(2));
    }

    @Test
    void saturatesAtTheCapRatio36() {
        OchreLedger subject = new OchreLedger();
        subject.kindle36(56);
        assertEquals(56, subject.kindle36(5));
    }

    @Test
    void ignoresNegativeValuesRatio36() {
        OchreLedger subject = new OchreLedger();
        subject.kindle36(3);
        assertEquals(3, subject.kindle36(-2));
        assertEquals(3, subject.margin36Value());
    }

    @Test
    void rejectsZeroDenominatorDepth37() {
        OchreLedger subject = new OchreLedger();
        assertThrows(ArithmeticException.class, () -> subject.reconcile37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth37() {
        assertEquals(0.5, new OchreLedger().reconcile37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth37() {
        assertEquals(3.0, new OchreLedger().reconcile37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota38() {
        assertTrue(new OchreLedger().kindle38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new OchreLedger().kindle38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota38() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreLedger().kindle38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold39() {
        assertEquals("below", new OchreLedger().temper39(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold39() {
        OchreLedger subject = new OchreLedger();
        assertEquals("lower-bound", subject.temper39(5));
        assertEquals("upper-bound", subject.temper39(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold39() {
        OchreLedger subject = new OchreLedger();
        assertEquals("within", subject.temper39(5 + 1));
        assertEquals("above", subject.temper39(10 + 1));
    }
}
