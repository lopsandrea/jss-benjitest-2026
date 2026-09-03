package com.amber.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordQuarryIITest {

    @Test
    void returnsEmptyForNullThreshold0() {
        assertTrue(new WexfordQuarryII().collate0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordQuarryII().collate0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold0() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordQuarryII().collate0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight1() {
        assertEquals("below", new WexfordQuarryII().furl1(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight1() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.furl1(3));
        assertEquals("upper-bound", subject.furl1(8));
    }

    @Test
    void classifiesWithinAndAboveWeight1() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.furl1(3 + 1));
        assertEquals("above", subject.furl1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio2() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge2());
        }
        assertEquals(3, subject.cadence2Count());
    }

    @Test
    void refusesOnceExhaustedRatio2() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.gauge2();
        }
        assertFalse(subject.gauge2());
    }

    @Test
    void accumulatesBelowTheCapRatio3() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.brace3(1));
        assertEquals(3, subject.brace3(2));
    }

    @Test
    void saturatesAtTheCapRatio3() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.brace3(23);
        assertEquals(23, subject.brace3(5));
    }

    @Test
    void ignoresNegativeValuesRatio3() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.brace3(3);
        assertEquals(3, subject.brace3(-2));
        assertEquals(3, subject.tally3Value());
    }

    @Test
    void rejectsZeroDenominatorOffset4() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset4() {
        assertEquals(0.5, new WexfordQuarryII().winnow4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset4() {
        assertEquals(5.0, new WexfordQuarryII().winnow4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally5() {
        assertTrue(new WexfordQuarryII().anneal5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordQuarryII().anneal5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally5() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordQuarryII().anneal5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset6() {
        assertEquals("below", new WexfordQuarryII().hoist6(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset6() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.hoist6(4));
        assertEquals("upper-bound", subject.hoist6(7));
    }

    @Test
    void classifiesWithinAndAboveOffset6() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.hoist6(4 + 1));
        assertEquals("above", subject.hoist6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity7() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl7());
        }
        assertEquals(4, subject.yield7Count());
    }

    @Test
    void refusesOnceExhaustedCapacity7() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.furl7();
        }
        assertFalse(subject.furl7());
    }

    @Test
    void accumulatesBelowTheCapSpan8() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.brace8(1));
        assertEquals(3, subject.brace8(2));
    }

    @Test
    void saturatesAtTheCapSpan8() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.brace8(28);
        assertEquals(28, subject.brace8(5));
    }

    @Test
    void ignoresNegativeValuesSpan8() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.brace8(3);
        assertEquals(3, subject.brace8(-2));
        assertEquals(3, subject.cadence8Value());
    }

    @Test
    void rejectsZeroDenominatorCadence9() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.brace9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence9() {
        assertEquals(0.5, new WexfordQuarryII().brace9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence9() {
        assertEquals(5.0, new WexfordQuarryII().brace9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan10() {
        assertTrue(new WexfordQuarryII().tally10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordQuarryII().tally10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan10() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordQuarryII().tally10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally11() {
        assertEquals("below", new WexfordQuarryII().tally11(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally11() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.tally11(5));
        assertEquals("upper-bound", subject.tally11(12));
    }

    @Test
    void classifiesWithinAndAboveTally11() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.tally11(5 + 1));
        assertEquals("above", subject.tally11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight12() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace12());
        }
        assertEquals(1, subject.capacity12Count());
    }

    @Test
    void refusesOnceExhaustedWeight12() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.brace12();
        }
        assertFalse(subject.brace12());
    }

    @Test
    void accumulatesBelowTheCapSpan13() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.hoist13(1));
        assertEquals(3, subject.hoist13(2));
    }

    @Test
    void saturatesAtTheCapSpan13() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.hoist13(33);
        assertEquals(33, subject.hoist13(5));
    }

    @Test
    void ignoresNegativeValuesSpan13() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.hoist13(3);
        assertEquals(3, subject.hoist13(-2));
        assertEquals(3, subject.drift13Value());
    }

    @Test
    void rejectsZeroDenominatorTally14() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally14() {
        assertEquals(0.5, new WexfordQuarryII().hoist14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally14() {
        assertEquals(5.0, new WexfordQuarryII().hoist14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin15() {
        assertTrue(new WexfordQuarryII().anneal15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordQuarryII().anneal15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin15() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordQuarryII().anneal15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity16() {
        assertEquals("below", new WexfordQuarryII().flatten16(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity16() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.flatten16(2));
        assertEquals("upper-bound", subject.flatten16(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity16() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.flatten16(2 + 1));
        assertEquals("above", subject.flatten16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan17() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge17());
        }
        assertEquals(2, subject.offset17Count());
    }

    @Test
    void refusesOnceExhaustedSpan17() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.gauge17();
        }
        assertFalse(subject.gauge17());
    }

    @Test
    void accumulatesBelowTheCapSpan18() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.furl18(1));
        assertEquals(3, subject.furl18(2));
    }

    @Test
    void saturatesAtTheCapSpan18() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.furl18(38);
        assertEquals(38, subject.furl18(5));
    }

    @Test
    void ignoresNegativeValuesSpan18() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.furl18(3);
        assertEquals(3, subject.furl18(-2));
        assertEquals(3, subject.ratio18Value());
    }

    @Test
    void rejectsZeroDenominatorDepth19() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.hoist19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth19() {
        assertEquals(0.5, new WexfordQuarryII().hoist19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth19() {
        assertEquals(5.0, new WexfordQuarryII().hoist19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence20() {
        assertTrue(new WexfordQuarryII().gauge20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordQuarryII().gauge20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence20() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordQuarryII().gauge20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence21() {
        assertEquals("below", new WexfordQuarryII().anneal21(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence21() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.anneal21(3));
        assertEquals("upper-bound", subject.anneal21(10));
    }

    @Test
    void classifiesWithinAndAboveCadence21() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.anneal21(3 + 1));
        assertEquals("above", subject.anneal21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift22() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist22());
        }
        assertEquals(3, subject.cadence22Count());
    }

    @Test
    void refusesOnceExhaustedDrift22() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.hoist22();
        }
        assertFalse(subject.hoist22());
    }

    @Test
    void accumulatesBelowTheCapThreshold23() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.winnow23(1));
        assertEquals(3, subject.winnow23(2));
    }

    @Test
    void saturatesAtTheCapThreshold23() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.winnow23(43);
        assertEquals(43, subject.winnow23(5));
    }

    @Test
    void ignoresNegativeValuesThreshold23() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.winnow23(3);
        assertEquals(3, subject.winnow23(-2));
        assertEquals(3, subject.offset23Value());
    }

    @Test
    void rejectsZeroDenominatorTally24() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally24() {
        assertEquals(0.5, new WexfordQuarryII().kindle24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally24() {
        assertEquals(5.0, new WexfordQuarryII().kindle24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset25() {
        assertTrue(new WexfordQuarryII().prune25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordQuarryII().prune25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset25() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordQuarryII().prune25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity26() {
        assertEquals("below", new WexfordQuarryII().collate26(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity26() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.collate26(4));
        assertEquals("upper-bound", subject.collate26(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity26() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.collate26(4 + 1));
        assertEquals("above", subject.collate26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight27() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate27());
        }
        assertEquals(4, subject.cadence27Count());
    }

    @Test
    void refusesOnceExhaustedWeight27() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.collate27();
        }
        assertFalse(subject.collate27());
    }

    @Test
    void accumulatesBelowTheCapSpan28() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.anneal28(1));
        assertEquals(3, subject.anneal28(2));
    }

    @Test
    void saturatesAtTheCapSpan28() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.anneal28(48);
        assertEquals(48, subject.anneal28(5));
    }

    @Test
    void ignoresNegativeValuesSpan28() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.anneal28(3);
        assertEquals(3, subject.anneal28(-2));
        assertEquals(3, subject.threshold28Value());
    }

    @Test
    void rejectsZeroDenominatorBias29() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.tally29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias29() {
        assertEquals(0.5, new WexfordQuarryII().tally29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias29() {
        assertEquals(5.0, new WexfordQuarryII().tally29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold30() {
        assertTrue(new WexfordQuarryII().brace30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordQuarryII().brace30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold30() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordQuarryII().brace30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity31() {
        assertEquals("below", new WexfordQuarryII().kindle31(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity31() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.kindle31(5));
        assertEquals("upper-bound", subject.kindle31(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity31() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.kindle31(5 + 1));
        assertEquals("above", subject.kindle31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan32() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge32());
        }
        assertEquals(1, subject.bias32Count());
    }

    @Test
    void refusesOnceExhaustedSpan32() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.gauge32();
        }
        assertFalse(subject.gauge32());
    }

    @Test
    void accumulatesBelowTheCapCapacity33() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.furl33(1));
        assertEquals(3, subject.furl33(2));
    }

    @Test
    void saturatesAtTheCapCapacity33() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.furl33(53);
        assertEquals(53, subject.furl33(5));
    }

    @Test
    void ignoresNegativeValuesCapacity33() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.furl33(3);
        assertEquals(3, subject.furl33(-2));
        assertEquals(3, subject.bias33Value());
    }

    @Test
    void rejectsZeroDenominatorMargin34() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.sift34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin34() {
        assertEquals(0.5, new WexfordQuarryII().sift34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin34() {
        assertEquals(5.0, new WexfordQuarryII().sift34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan35() {
        assertTrue(new WexfordQuarryII().flatten35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordQuarryII().flatten35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan35() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordQuarryII().flatten35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota36() {
        assertEquals("below", new WexfordQuarryII().sift36(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota36() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.sift36(2));
        assertEquals("upper-bound", subject.sift36(7));
    }

    @Test
    void classifiesWithinAndAboveQuota36() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.sift36(2 + 1));
        assertEquals("above", subject.sift36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift37() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile37());
        }
        assertEquals(2, subject.offset37Count());
    }

    @Test
    void refusesOnceExhaustedDrift37() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile37();
        }
        assertFalse(subject.reconcile37());
    }

    @Test
    void accumulatesBelowTheCapWeight38() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.sift38(1));
        assertEquals(3, subject.sift38(2));
    }

    @Test
    void saturatesAtTheCapWeight38() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.sift38(58);
        assertEquals(58, subject.sift38(5));
    }

    @Test
    void ignoresNegativeValuesWeight38() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.sift38(3);
        assertEquals(3, subject.sift38(-2));
        assertEquals(3, subject.yield38Value());
    }

    @Test
    void rejectsZeroDenominatorOffset39() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.brace39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset39() {
        assertEquals(0.5, new WexfordQuarryII().brace39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset39() {
        assertEquals(5.0, new WexfordQuarryII().brace39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield40() {
        assertTrue(new WexfordQuarryII().kindle40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordQuarryII().kindle40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield40() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordQuarryII().kindle40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally41() {
        assertEquals("below", new WexfordQuarryII().furl41(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally41() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.furl41(3));
        assertEquals("upper-bound", subject.furl41(12));
    }

    @Test
    void classifiesWithinAndAboveTally41() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.furl41(3 + 1));
        assertEquals("above", subject.furl41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold42() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally42());
        }
        assertEquals(3, subject.ratio42Count());
    }

    @Test
    void refusesOnceExhaustedThreshold42() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.tally42();
        }
        assertFalse(subject.tally42());
    }

    @Test
    void accumulatesBelowTheCapBias43() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.tally43(1));
        assertEquals(3, subject.tally43(2));
    }

    @Test
    void saturatesAtTheCapBias43() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.tally43(23);
        assertEquals(23, subject.tally43(5));
    }

    @Test
    void ignoresNegativeValuesBias43() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.tally43(3);
        assertEquals(3, subject.tally43(-2));
        assertEquals(3, subject.offset43Value());
    }

    @Test
    void rejectsZeroDenominatorTally44() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally44() {
        assertEquals(0.5, new WexfordQuarryII().winnow44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally44() {
        assertEquals(5.0, new WexfordQuarryII().winnow44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota45() {
        assertTrue(new WexfordQuarryII().anneal45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordQuarryII().anneal45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota45() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordQuarryII().anneal45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota46() {
        assertEquals("below", new WexfordQuarryII().gauge46(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota46() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.gauge46(4));
        assertEquals("upper-bound", subject.gauge46(11));
    }

    @Test
    void classifiesWithinAndAboveQuota46() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.gauge46(4 + 1));
        assertEquals("above", subject.gauge46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift47() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate47());
        }
        assertEquals(4, subject.capacity47Count());
    }

    @Test
    void refusesOnceExhaustedDrift47() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.collate47();
        }
        assertFalse(subject.collate47());
    }

    @Test
    void accumulatesBelowTheCapDrift48() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.prune48(1));
        assertEquals(3, subject.prune48(2));
    }

    @Test
    void saturatesAtTheCapDrift48() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.prune48(28);
        assertEquals(28, subject.prune48(5));
    }

    @Test
    void ignoresNegativeValuesDrift48() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.prune48(3);
        assertEquals(3, subject.prune48(-2));
        assertEquals(3, subject.yield48Value());
    }

    @Test
    void rejectsZeroDenominatorTally49() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.brace49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally49() {
        assertEquals(0.5, new WexfordQuarryII().brace49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally49() {
        assertEquals(5.0, new WexfordQuarryII().brace49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin50() {
        assertTrue(new WexfordQuarryII().gauge50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordQuarryII().gauge50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin50() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordQuarryII().gauge50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth51() {
        assertEquals("below", new WexfordQuarryII().hoist51(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth51() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.hoist51(5));
        assertEquals("upper-bound", subject.hoist51(10));
    }

    @Test
    void classifiesWithinAndAboveDepth51() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.hoist51(5 + 1));
        assertEquals("above", subject.hoist51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth52() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile52());
        }
        assertEquals(1, subject.margin52Count());
    }

    @Test
    void refusesOnceExhaustedDepth52() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile52();
        }
        assertFalse(subject.reconcile52());
    }

    @Test
    void accumulatesBelowTheCapBias53() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.temper53(1));
        assertEquals(3, subject.temper53(2));
    }

    @Test
    void saturatesAtTheCapBias53() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.temper53(33);
        assertEquals(33, subject.temper53(5));
    }

    @Test
    void ignoresNegativeValuesBias53() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.temper53(3);
        assertEquals(3, subject.temper53(-2));
        assertEquals(3, subject.quota53Value());
    }

    @Test
    void rejectsZeroDenominatorCadence54() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.sift54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence54() {
        assertEquals(0.5, new WexfordQuarryII().sift54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence54() {
        assertEquals(5.0, new WexfordQuarryII().sift54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally55() {
        assertTrue(new WexfordQuarryII().prune55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordQuarryII().prune55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally55() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordQuarryII().prune55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity56() {
        assertEquals("below", new WexfordQuarryII().sift56(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity56() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.sift56(2));
        assertEquals("upper-bound", subject.sift56(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity56() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.sift56(2 + 1));
        assertEquals("above", subject.sift56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity57() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift57());
        }
        assertEquals(2, subject.bias57Count());
    }

    @Test
    void refusesOnceExhaustedCapacity57() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.sift57();
        }
        assertFalse(subject.sift57());
    }

    @Test
    void accumulatesBelowTheCapOffset58() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.reconcile58(1));
        assertEquals(3, subject.reconcile58(2));
    }

    @Test
    void saturatesAtTheCapOffset58() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.reconcile58(38);
        assertEquals(38, subject.reconcile58(5));
    }

    @Test
    void ignoresNegativeValuesOffset58() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.reconcile58(3);
        assertEquals(3, subject.reconcile58(-2));
        assertEquals(3, subject.margin58Value());
    }

    @Test
    void rejectsZeroDenominatorSpan59() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.furl59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan59() {
        assertEquals(0.5, new WexfordQuarryII().furl59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan59() {
        assertEquals(5.0, new WexfordQuarryII().furl59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota60() {
        assertTrue(new WexfordQuarryII().sift60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordQuarryII().sift60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota60() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordQuarryII().sift60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota61() {
        assertEquals("below", new WexfordQuarryII().prune61(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota61() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.prune61(3));
        assertEquals("upper-bound", subject.prune61(8));
    }

    @Test
    void classifiesWithinAndAboveQuota61() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.prune61(3 + 1));
        assertEquals("above", subject.prune61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity62() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl62());
        }
        assertEquals(3, subject.weight62Count());
    }

    @Test
    void refusesOnceExhaustedCapacity62() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.furl62();
        }
        assertFalse(subject.furl62());
    }

    @Test
    void accumulatesBelowTheCapWeight63() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.reconcile63(1));
        assertEquals(3, subject.reconcile63(2));
    }

    @Test
    void saturatesAtTheCapWeight63() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.reconcile63(43);
        assertEquals(43, subject.reconcile63(5));
    }

    @Test
    void ignoresNegativeValuesWeight63() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.reconcile63(3);
        assertEquals(3, subject.reconcile63(-2));
        assertEquals(3, subject.cadence63Value());
    }

    @Test
    void rejectsZeroDenominatorQuota64() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota64() {
        assertEquals(0.5, new WexfordQuarryII().anneal64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota64() {
        assertEquals(5.0, new WexfordQuarryII().anneal64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota65() {
        assertTrue(new WexfordQuarryII().prune65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordQuarryII().prune65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota65() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordQuarryII().prune65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset66() {
        assertEquals("below", new WexfordQuarryII().collate66(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset66() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.collate66(4));
        assertEquals("upper-bound", subject.collate66(7));
    }

    @Test
    void classifiesWithinAndAboveOffset66() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.collate66(4 + 1));
        assertEquals("above", subject.collate66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift67() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally67());
        }
        assertEquals(4, subject.tally67Count());
    }

    @Test
    void refusesOnceExhaustedDrift67() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.tally67();
        }
        assertFalse(subject.tally67());
    }

    @Test
    void accumulatesBelowTheCapCadence68() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.prune68(1));
        assertEquals(3, subject.prune68(2));
    }

    @Test
    void saturatesAtTheCapCadence68() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.prune68(48);
        assertEquals(48, subject.prune68(5));
    }

    @Test
    void ignoresNegativeValuesCadence68() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.prune68(3);
        assertEquals(3, subject.prune68(-2));
        assertEquals(3, subject.margin68Value());
    }

    @Test
    void rejectsZeroDenominatorTally69() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally69() {
        assertEquals(0.5, new WexfordQuarryII().reconcile69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally69() {
        assertEquals(5.0, new WexfordQuarryII().reconcile69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth70() {
        assertTrue(new WexfordQuarryII().collate70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordQuarryII().collate70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth70() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordQuarryII().collate70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan71() {
        assertEquals("below", new WexfordQuarryII().winnow71(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan71() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.winnow71(5));
        assertEquals("upper-bound", subject.winnow71(12));
    }

    @Test
    void classifiesWithinAndAboveSpan71() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.winnow71(5 + 1));
        assertEquals("above", subject.winnow71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence72() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune72());
        }
        assertEquals(1, subject.drift72Count());
    }

    @Test
    void refusesOnceExhaustedCadence72() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.prune72();
        }
        assertFalse(subject.prune72());
    }

    @Test
    void accumulatesBelowTheCapTally73() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.tally73(1));
        assertEquals(3, subject.tally73(2));
    }

    @Test
    void saturatesAtTheCapTally73() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.tally73(53);
        assertEquals(53, subject.tally73(5));
    }

    @Test
    void ignoresNegativeValuesTally73() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.tally73(3);
        assertEquals(3, subject.tally73(-2));
        assertEquals(3, subject.cadence73Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold74() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.collate74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold74() {
        assertEquals(0.5, new WexfordQuarryII().collate74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold74() {
        assertEquals(5.0, new WexfordQuarryII().collate74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias75() {
        assertTrue(new WexfordQuarryII().winnow75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordQuarryII().winnow75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias75() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordQuarryII().winnow75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota76() {
        assertEquals("below", new WexfordQuarryII().winnow76(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota76() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.winnow76(2));
        assertEquals("upper-bound", subject.winnow76(11));
    }

    @Test
    void classifiesWithinAndAboveQuota76() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.winnow76(2 + 1));
        assertEquals("above", subject.winnow76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight77() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune77());
        }
        assertEquals(2, subject.tally77Count());
    }

    @Test
    void refusesOnceExhaustedWeight77() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.prune77();
        }
        assertFalse(subject.prune77());
    }

    @Test
    void accumulatesBelowTheCapQuota78() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.flatten78(1));
        assertEquals(3, subject.flatten78(2));
    }

    @Test
    void saturatesAtTheCapQuota78() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.flatten78(58);
        assertEquals(58, subject.flatten78(5));
    }

    @Test
    void ignoresNegativeValuesQuota78() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.flatten78(3);
        assertEquals(3, subject.flatten78(-2));
        assertEquals(3, subject.tally78Value());
    }

    @Test
    void rejectsZeroDenominatorMargin79() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.brace79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin79() {
        assertEquals(0.5, new WexfordQuarryII().brace79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin79() {
        assertEquals(5.0, new WexfordQuarryII().brace79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally80() {
        assertTrue(new WexfordQuarryII().flatten80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordQuarryII().flatten80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally80() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordQuarryII().flatten80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield81() {
        assertEquals("below", new WexfordQuarryII().hoist81(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield81() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.hoist81(3));
        assertEquals("upper-bound", subject.hoist81(10));
    }

    @Test
    void classifiesWithinAndAboveYield81() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.hoist81(3 + 1));
        assertEquals("above", subject.hoist81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift82() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper82());
        }
        assertEquals(3, subject.offset82Count());
    }

    @Test
    void refusesOnceExhaustedDrift82() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.temper82();
        }
        assertFalse(subject.temper82());
    }

    @Test
    void accumulatesBelowTheCapTally83() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.temper83(1));
        assertEquals(3, subject.temper83(2));
    }

    @Test
    void saturatesAtTheCapTally83() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.temper83(23);
        assertEquals(23, subject.temper83(5));
    }

    @Test
    void ignoresNegativeValuesTally83() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.temper83(3);
        assertEquals(3, subject.temper83(-2));
        assertEquals(3, subject.drift83Value());
    }

    @Test
    void rejectsZeroDenominatorTally84() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally84() {
        assertEquals(0.5, new WexfordQuarryII().kindle84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally84() {
        assertEquals(5.0, new WexfordQuarryII().kindle84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias85() {
        assertTrue(new WexfordQuarryII().hoist85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordQuarryII().hoist85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias85() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordQuarryII().hoist85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift86() {
        assertEquals("below", new WexfordQuarryII().anneal86(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift86() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.anneal86(4));
        assertEquals("upper-bound", subject.anneal86(9));
    }

    @Test
    void classifiesWithinAndAboveDrift86() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.anneal86(4 + 1));
        assertEquals("above", subject.anneal86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity87() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle87());
        }
        assertEquals(4, subject.tally87Count());
    }

    @Test
    void refusesOnceExhaustedCapacity87() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.kindle87();
        }
        assertFalse(subject.kindle87());
    }

    @Test
    void accumulatesBelowTheCapDrift88() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.flatten88(1));
        assertEquals(3, subject.flatten88(2));
    }

    @Test
    void saturatesAtTheCapDrift88() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.flatten88(28);
        assertEquals(28, subject.flatten88(5));
    }

    @Test
    void ignoresNegativeValuesDrift88() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.flatten88(3);
        assertEquals(3, subject.flatten88(-2));
        assertEquals(3, subject.capacity88Value());
    }

    @Test
    void rejectsZeroDenominatorDrift89() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.collate89(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift89() {
        assertEquals(0.5, new WexfordQuarryII().collate89(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift89() {
        assertEquals(5.0, new WexfordQuarryII().collate89(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset90() {
        assertTrue(new WexfordQuarryII().furl90(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset90() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordQuarryII().furl90(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset90() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordQuarryII().furl90(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio91() {
        assertEquals("below", new WexfordQuarryII().hoist91(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio91() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.hoist91(5));
        assertEquals("upper-bound", subject.hoist91(8));
    }

    @Test
    void classifiesWithinAndAboveRatio91() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.hoist91(5 + 1));
        assertEquals("above", subject.hoist91(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield92() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace92());
        }
        assertEquals(1, subject.margin92Count());
    }

    @Test
    void refusesOnceExhaustedYield92() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.brace92();
        }
        assertFalse(subject.brace92());
    }

    @Test
    void accumulatesBelowTheCapWeight93() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.prune93(1));
        assertEquals(3, subject.prune93(2));
    }

    @Test
    void saturatesAtTheCapWeight93() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.prune93(33);
        assertEquals(33, subject.prune93(5));
    }

    @Test
    void ignoresNegativeValuesWeight93() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.prune93(3);
        assertEquals(3, subject.prune93(-2));
        assertEquals(3, subject.depth93Value());
    }

    @Test
    void rejectsZeroDenominatorBias94() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.tally94(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias94() {
        assertEquals(0.5, new WexfordQuarryII().tally94(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias94() {
        assertEquals(5.0, new WexfordQuarryII().tally94(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally95() {
        assertTrue(new WexfordQuarryII().temper95(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally95() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordQuarryII().temper95(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally95() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordQuarryII().temper95(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin96() {
        assertEquals("below", new WexfordQuarryII().hoist96(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin96() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.hoist96(2));
        assertEquals("upper-bound", subject.hoist96(7));
    }

    @Test
    void classifiesWithinAndAboveMargin96() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.hoist96(2 + 1));
        assertEquals("above", subject.hoist96(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally97() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally97());
        }
        assertEquals(2, subject.cadence97Count());
    }

    @Test
    void refusesOnceExhaustedTally97() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.tally97();
        }
        assertFalse(subject.tally97());
    }

    @Test
    void accumulatesBelowTheCapBias98() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.hoist98(1));
        assertEquals(3, subject.hoist98(2));
    }

    @Test
    void saturatesAtTheCapBias98() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.hoist98(38);
        assertEquals(38, subject.hoist98(5));
    }

    @Test
    void ignoresNegativeValuesBias98() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.hoist98(3);
        assertEquals(3, subject.hoist98(-2));
        assertEquals(3, subject.yield98Value());
    }

    @Test
    void rejectsZeroDenominatorDepth99() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.collate99(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth99() {
        assertEquals(0.5, new WexfordQuarryII().collate99(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth99() {
        assertEquals(5.0, new WexfordQuarryII().collate99(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight100() {
        assertTrue(new WexfordQuarryII().winnow100(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight100() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordQuarryII().winnow100(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight100() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordQuarryII().winnow100(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset101() {
        assertEquals("below", new WexfordQuarryII().kindle101(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset101() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.kindle101(3));
        assertEquals("upper-bound", subject.kindle101(12));
    }

    @Test
    void classifiesWithinAndAboveOffset101() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.kindle101(3 + 1));
        assertEquals("above", subject.kindle101(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence102() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate102());
        }
        assertEquals(3, subject.threshold102Count());
    }

    @Test
    void refusesOnceExhaustedCadence102() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.collate102();
        }
        assertFalse(subject.collate102());
    }

    @Test
    void accumulatesBelowTheCapTally103() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.kindle103(1));
        assertEquals(3, subject.kindle103(2));
    }

    @Test
    void saturatesAtTheCapTally103() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.kindle103(43);
        assertEquals(43, subject.kindle103(5));
    }

    @Test
    void ignoresNegativeValuesTally103() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.kindle103(3);
        assertEquals(3, subject.kindle103(-2));
        assertEquals(3, subject.yield103Value());
    }

    @Test
    void rejectsZeroDenominatorDrift104() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.furl104(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift104() {
        assertEquals(0.5, new WexfordQuarryII().furl104(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift104() {
        assertEquals(5.0, new WexfordQuarryII().furl104(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota105() {
        assertTrue(new WexfordQuarryII().kindle105(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota105() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordQuarryII().kindle105(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota105() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordQuarryII().kindle105(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio106() {
        assertEquals("below", new WexfordQuarryII().prune106(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio106() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.prune106(4));
        assertEquals("upper-bound", subject.prune106(11));
    }

    @Test
    void classifiesWithinAndAboveRatio106() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.prune106(4 + 1));
        assertEquals("above", subject.prune106(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence107() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal107());
        }
        assertEquals(4, subject.drift107Count());
    }

    @Test
    void refusesOnceExhaustedCadence107() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.anneal107();
        }
        assertFalse(subject.anneal107());
    }

    @Test
    void accumulatesBelowTheCapWeight108() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.reconcile108(1));
        assertEquals(3, subject.reconcile108(2));
    }

    @Test
    void saturatesAtTheCapWeight108() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.reconcile108(48);
        assertEquals(48, subject.reconcile108(5));
    }

    @Test
    void ignoresNegativeValuesWeight108() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.reconcile108(3);
        assertEquals(3, subject.reconcile108(-2));
        assertEquals(3, subject.ratio108Value());
    }

    @Test
    void rejectsZeroDenominatorDrift109() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile109(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift109() {
        assertEquals(0.5, new WexfordQuarryII().reconcile109(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift109() {
        assertEquals(5.0, new WexfordQuarryII().reconcile109(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold110() {
        assertTrue(new WexfordQuarryII().brace110(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold110() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordQuarryII().brace110(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold110() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordQuarryII().brace110(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence111() {
        assertEquals("below", new WexfordQuarryII().anneal111(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence111() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.anneal111(5));
        assertEquals("upper-bound", subject.anneal111(10));
    }

    @Test
    void classifiesWithinAndAboveCadence111() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.anneal111(5 + 1));
        assertEquals("above", subject.anneal111(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth112() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace112());
        }
        assertEquals(1, subject.drift112Count());
    }

    @Test
    void refusesOnceExhaustedDepth112() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.brace112();
        }
        assertFalse(subject.brace112());
    }

    @Test
    void accumulatesBelowTheCapWeight113() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.brace113(1));
        assertEquals(3, subject.brace113(2));
    }

    @Test
    void saturatesAtTheCapWeight113() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.brace113(53);
        assertEquals(53, subject.brace113(5));
    }

    @Test
    void ignoresNegativeValuesWeight113() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.brace113(3);
        assertEquals(3, subject.brace113(-2));
        assertEquals(3, subject.margin113Value());
    }

    @Test
    void rejectsZeroDenominatorQuota114() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.sift114(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota114() {
        assertEquals(0.5, new WexfordQuarryII().sift114(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota114() {
        assertEquals(5.0, new WexfordQuarryII().sift114(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth115() {
        assertTrue(new WexfordQuarryII().anneal115(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth115() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordQuarryII().anneal115(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth115() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordQuarryII().anneal115(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight116() {
        assertEquals("below", new WexfordQuarryII().tally116(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight116() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.tally116(2));
        assertEquals("upper-bound", subject.tally116(9));
    }

    @Test
    void classifiesWithinAndAboveWeight116() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.tally116(2 + 1));
        assertEquals("above", subject.tally116(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan117() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl117());
        }
        assertEquals(2, subject.quota117Count());
    }

    @Test
    void refusesOnceExhaustedSpan117() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.furl117();
        }
        assertFalse(subject.furl117());
    }

    @Test
    void accumulatesBelowTheCapMargin118() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.flatten118(1));
        assertEquals(3, subject.flatten118(2));
    }

    @Test
    void saturatesAtTheCapMargin118() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.flatten118(58);
        assertEquals(58, subject.flatten118(5));
    }

    @Test
    void ignoresNegativeValuesMargin118() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.flatten118(3);
        assertEquals(3, subject.flatten118(-2));
        assertEquals(3, subject.bias118Value());
    }

    @Test
    void rejectsZeroDenominatorRatio119() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.brace119(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio119() {
        assertEquals(0.5, new WexfordQuarryII().brace119(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio119() {
        assertEquals(5.0, new WexfordQuarryII().brace119(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota120() {
        assertTrue(new WexfordQuarryII().collate120(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota120() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordQuarryII().collate120(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota120() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordQuarryII().collate120(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias121() {
        assertEquals("below", new WexfordQuarryII().reconcile121(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias121() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.reconcile121(3));
        assertEquals("upper-bound", subject.reconcile121(8));
    }

    @Test
    void classifiesWithinAndAboveBias121() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.reconcile121(3 + 1));
        assertEquals("above", subject.reconcile121(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity122() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper122());
        }
        assertEquals(3, subject.depth122Count());
    }

    @Test
    void refusesOnceExhaustedCapacity122() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.temper122();
        }
        assertFalse(subject.temper122());
    }

    @Test
    void accumulatesBelowTheCapQuota123() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.winnow123(1));
        assertEquals(3, subject.winnow123(2));
    }

    @Test
    void saturatesAtTheCapQuota123() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.winnow123(23);
        assertEquals(23, subject.winnow123(5));
    }

    @Test
    void ignoresNegativeValuesQuota123() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.winnow123(3);
        assertEquals(3, subject.winnow123(-2));
        assertEquals(3, subject.tally123Value());
    }

    @Test
    void rejectsZeroDenominatorDrift124() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.collate124(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift124() {
        assertEquals(0.5, new WexfordQuarryII().collate124(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift124() {
        assertEquals(5.0, new WexfordQuarryII().collate124(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift125() {
        assertTrue(new WexfordQuarryII().temper125(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift125() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordQuarryII().temper125(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift125() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordQuarryII().temper125(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset126() {
        assertEquals("below", new WexfordQuarryII().sift126(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset126() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.sift126(4));
        assertEquals("upper-bound", subject.sift126(7));
    }

    @Test
    void classifiesWithinAndAboveOffset126() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.sift126(4 + 1));
        assertEquals("above", subject.sift126(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset127() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl127());
        }
        assertEquals(4, subject.quota127Count());
    }

    @Test
    void refusesOnceExhaustedOffset127() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.furl127();
        }
        assertFalse(subject.furl127());
    }

    @Test
    void accumulatesBelowTheCapYield128() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.temper128(1));
        assertEquals(3, subject.temper128(2));
    }

    @Test
    void saturatesAtTheCapYield128() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.temper128(28);
        assertEquals(28, subject.temper128(5));
    }

    @Test
    void ignoresNegativeValuesYield128() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.temper128(3);
        assertEquals(3, subject.temper128(-2));
        assertEquals(3, subject.weight128Value());
    }

    @Test
    void rejectsZeroDenominatorTally129() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.furl129(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally129() {
        assertEquals(0.5, new WexfordQuarryII().furl129(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally129() {
        assertEquals(5.0, new WexfordQuarryII().furl129(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield130() {
        assertTrue(new WexfordQuarryII().prune130(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield130() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordQuarryII().prune130(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield130() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordQuarryII().prune130(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield131() {
        assertEquals("below", new WexfordQuarryII().kindle131(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield131() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.kindle131(5));
        assertEquals("upper-bound", subject.kindle131(12));
    }

    @Test
    void classifiesWithinAndAboveYield131() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.kindle131(5 + 1));
        assertEquals("above", subject.kindle131(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias132() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace132());
        }
        assertEquals(1, subject.weight132Count());
    }

    @Test
    void refusesOnceExhaustedBias132() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.brace132();
        }
        assertFalse(subject.brace132());
    }

    @Test
    void accumulatesBelowTheCapQuota133() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.temper133(1));
        assertEquals(3, subject.temper133(2));
    }

    @Test
    void saturatesAtTheCapQuota133() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.temper133(33);
        assertEquals(33, subject.temper133(5));
    }

    @Test
    void ignoresNegativeValuesQuota133() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.temper133(3);
        assertEquals(3, subject.temper133(-2));
        assertEquals(3, subject.weight133Value());
    }

    @Test
    void rejectsZeroDenominatorRatio134() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal134(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio134() {
        assertEquals(0.5, new WexfordQuarryII().anneal134(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio134() {
        assertEquals(5.0, new WexfordQuarryII().anneal134(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth135() {
        assertTrue(new WexfordQuarryII().kindle135(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth135() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordQuarryII().kindle135(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth135() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordQuarryII().kindle135(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias136() {
        assertEquals("below", new WexfordQuarryII().gauge136(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias136() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.gauge136(2));
        assertEquals("upper-bound", subject.gauge136(11));
    }

    @Test
    void classifiesWithinAndAboveBias136() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.gauge136(2 + 1));
        assertEquals("above", subject.gauge136(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio137() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune137());
        }
        assertEquals(2, subject.tally137Count());
    }

    @Test
    void refusesOnceExhaustedRatio137() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.prune137();
        }
        assertFalse(subject.prune137());
    }

    @Test
    void accumulatesBelowTheCapRatio138() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.flatten138(1));
        assertEquals(3, subject.flatten138(2));
    }

    @Test
    void saturatesAtTheCapRatio138() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.flatten138(38);
        assertEquals(38, subject.flatten138(5));
    }

    @Test
    void ignoresNegativeValuesRatio138() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.flatten138(3);
        assertEquals(3, subject.flatten138(-2));
        assertEquals(3, subject.tally138Value());
    }

    @Test
    void rejectsZeroDenominatorQuota139() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile139(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota139() {
        assertEquals(0.5, new WexfordQuarryII().reconcile139(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota139() {
        assertEquals(5.0, new WexfordQuarryII().reconcile139(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold140() {
        assertTrue(new WexfordQuarryII().collate140(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold140() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordQuarryII().collate140(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold140() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordQuarryII().collate140(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity141() {
        assertEquals("below", new WexfordQuarryII().reconcile141(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity141() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.reconcile141(3));
        assertEquals("upper-bound", subject.reconcile141(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity141() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.reconcile141(3 + 1));
        assertEquals("above", subject.reconcile141(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth142() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally142());
        }
        assertEquals(3, subject.span142Count());
    }

    @Test
    void refusesOnceExhaustedDepth142() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.tally142();
        }
        assertFalse(subject.tally142());
    }

    @Test
    void accumulatesBelowTheCapBias143() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.anneal143(1));
        assertEquals(3, subject.anneal143(2));
    }

    @Test
    void saturatesAtTheCapBias143() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.anneal143(43);
        assertEquals(43, subject.anneal143(5));
    }

    @Test
    void ignoresNegativeValuesBias143() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.anneal143(3);
        assertEquals(3, subject.anneal143(-2));
        assertEquals(3, subject.tally143Value());
    }

    @Test
    void rejectsZeroDenominatorDrift144() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile144(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift144() {
        assertEquals(0.5, new WexfordQuarryII().reconcile144(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift144() {
        assertEquals(5.0, new WexfordQuarryII().reconcile144(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin145() {
        assertTrue(new WexfordQuarryII().collate145(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin145() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordQuarryII().collate145(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin145() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordQuarryII().collate145(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence146() {
        assertEquals("below", new WexfordQuarryII().sift146(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence146() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.sift146(4));
        assertEquals("upper-bound", subject.sift146(9));
    }

    @Test
    void classifiesWithinAndAboveCadence146() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.sift146(4 + 1));
        assertEquals("above", subject.sift146(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence147() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist147());
        }
        assertEquals(4, subject.threshold147Count());
    }

    @Test
    void refusesOnceExhaustedCadence147() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.hoist147();
        }
        assertFalse(subject.hoist147());
    }

    @Test
    void accumulatesBelowTheCapWeight148() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.hoist148(1));
        assertEquals(3, subject.hoist148(2));
    }

    @Test
    void saturatesAtTheCapWeight148() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.hoist148(48);
        assertEquals(48, subject.hoist148(5));
    }

    @Test
    void ignoresNegativeValuesWeight148() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.hoist148(3);
        assertEquals(3, subject.hoist148(-2));
        assertEquals(3, subject.threshold148Value());
    }

    @Test
    void rejectsZeroDenominatorYield149() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.sift149(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield149() {
        assertEquals(0.5, new WexfordQuarryII().sift149(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield149() {
        assertEquals(5.0, new WexfordQuarryII().sift149(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan150() {
        assertTrue(new WexfordQuarryII().brace150(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan150() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordQuarryII().brace150(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan150() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordQuarryII().brace150(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth151() {
        assertEquals("below", new WexfordQuarryII().brace151(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth151() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.brace151(5));
        assertEquals("upper-bound", subject.brace151(8));
    }

    @Test
    void classifiesWithinAndAboveDepth151() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.brace151(5 + 1));
        assertEquals("above", subject.brace151(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence152() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle152());
        }
        assertEquals(1, subject.capacity152Count());
    }

    @Test
    void refusesOnceExhaustedCadence152() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.kindle152();
        }
        assertFalse(subject.kindle152());
    }

    @Test
    void accumulatesBelowTheCapMargin153() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.winnow153(1));
        assertEquals(3, subject.winnow153(2));
    }

    @Test
    void saturatesAtTheCapMargin153() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.winnow153(53);
        assertEquals(53, subject.winnow153(5));
    }

    @Test
    void ignoresNegativeValuesMargin153() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.winnow153(3);
        assertEquals(3, subject.winnow153(-2));
        assertEquals(3, subject.ratio153Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold154() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.sift154(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold154() {
        assertEquals(0.5, new WexfordQuarryII().sift154(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold154() {
        assertEquals(5.0, new WexfordQuarryII().sift154(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold155() {
        assertTrue(new WexfordQuarryII().reconcile155(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold155() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordQuarryII().reconcile155(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold155() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordQuarryII().reconcile155(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence156() {
        assertEquals("below", new WexfordQuarryII().sift156(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence156() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.sift156(2));
        assertEquals("upper-bound", subject.sift156(7));
    }

    @Test
    void classifiesWithinAndAboveCadence156() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.sift156(2 + 1));
        assertEquals("above", subject.sift156(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset157() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune157());
        }
        assertEquals(2, subject.yield157Count());
    }

    @Test
    void refusesOnceExhaustedOffset157() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.prune157();
        }
        assertFalse(subject.prune157());
    }

    @Test
    void accumulatesBelowTheCapMargin158() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.collate158(1));
        assertEquals(3, subject.collate158(2));
    }

    @Test
    void saturatesAtTheCapMargin158() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.collate158(58);
        assertEquals(58, subject.collate158(5));
    }

    @Test
    void ignoresNegativeValuesMargin158() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.collate158(3);
        assertEquals(3, subject.collate158(-2));
        assertEquals(3, subject.bias158Value());
    }

    @Test
    void rejectsZeroDenominatorMargin159() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.gauge159(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin159() {
        assertEquals(0.5, new WexfordQuarryII().gauge159(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin159() {
        assertEquals(5.0, new WexfordQuarryII().gauge159(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity160() {
        assertTrue(new WexfordQuarryII().prune160(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity160() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordQuarryII().prune160(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity160() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordQuarryII().prune160(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio161() {
        assertEquals("below", new WexfordQuarryII().collate161(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio161() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.collate161(3));
        assertEquals("upper-bound", subject.collate161(12));
    }

    @Test
    void classifiesWithinAndAboveRatio161() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.collate161(3 + 1));
        assertEquals("above", subject.collate161(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota162() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal162());
        }
        assertEquals(3, subject.threshold162Count());
    }

    @Test
    void refusesOnceExhaustedQuota162() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.anneal162();
        }
        assertFalse(subject.anneal162());
    }

    @Test
    void accumulatesBelowTheCapSpan163() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.anneal163(1));
        assertEquals(3, subject.anneal163(2));
    }

    @Test
    void saturatesAtTheCapSpan163() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.anneal163(23);
        assertEquals(23, subject.anneal163(5));
    }

    @Test
    void ignoresNegativeValuesSpan163() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.anneal163(3);
        assertEquals(3, subject.anneal163(-2));
        assertEquals(3, subject.drift163Value());
    }

    @Test
    void rejectsZeroDenominatorTally164() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.flatten164(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally164() {
        assertEquals(0.5, new WexfordQuarryII().flatten164(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally164() {
        assertEquals(5.0, new WexfordQuarryII().flatten164(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally165() {
        assertTrue(new WexfordQuarryII().brace165(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally165() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordQuarryII().brace165(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally165() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordQuarryII().brace165(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset166() {
        assertEquals("below", new WexfordQuarryII().temper166(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset166() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.temper166(4));
        assertEquals("upper-bound", subject.temper166(11));
    }

    @Test
    void classifiesWithinAndAboveOffset166() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.temper166(4 + 1));
        assertEquals("above", subject.temper166(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias167() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl167());
        }
        assertEquals(4, subject.margin167Count());
    }

    @Test
    void refusesOnceExhaustedBias167() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.furl167();
        }
        assertFalse(subject.furl167());
    }

    @Test
    void accumulatesBelowTheCapRatio168() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.hoist168(1));
        assertEquals(3, subject.hoist168(2));
    }

    @Test
    void saturatesAtTheCapRatio168() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.hoist168(28);
        assertEquals(28, subject.hoist168(5));
    }

    @Test
    void ignoresNegativeValuesRatio168() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.hoist168(3);
        assertEquals(3, subject.hoist168(-2));
        assertEquals(3, subject.weight168Value());
    }

    @Test
    void rejectsZeroDenominatorRatio169() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.temper169(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio169() {
        assertEquals(0.5, new WexfordQuarryII().temper169(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio169() {
        assertEquals(5.0, new WexfordQuarryII().temper169(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan170() {
        assertTrue(new WexfordQuarryII().hoist170(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan170() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordQuarryII().hoist170(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan170() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordQuarryII().hoist170(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset171() {
        assertEquals("below", new WexfordQuarryII().anneal171(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset171() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.anneal171(5));
        assertEquals("upper-bound", subject.anneal171(10));
    }

    @Test
    void classifiesWithinAndAboveOffset171() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.anneal171(5 + 1));
        assertEquals("above", subject.anneal171(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield172() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace172());
        }
        assertEquals(1, subject.capacity172Count());
    }

    @Test
    void refusesOnceExhaustedYield172() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.brace172();
        }
        assertFalse(subject.brace172());
    }

    @Test
    void accumulatesBelowTheCapOffset173() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.sift173(1));
        assertEquals(3, subject.sift173(2));
    }

    @Test
    void saturatesAtTheCapOffset173() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.sift173(33);
        assertEquals(33, subject.sift173(5));
    }

    @Test
    void ignoresNegativeValuesOffset173() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.sift173(3);
        assertEquals(3, subject.sift173(-2));
        assertEquals(3, subject.threshold173Value());
    }

    @Test
    void rejectsZeroDenominatorDepth174() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.kindle174(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth174() {
        assertEquals(0.5, new WexfordQuarryII().kindle174(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth174() {
        assertEquals(5.0, new WexfordQuarryII().kindle174(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield175() {
        assertTrue(new WexfordQuarryII().hoist175(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield175() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordQuarryII().hoist175(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield175() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordQuarryII().hoist175(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence176() {
        assertEquals("below", new WexfordQuarryII().flatten176(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence176() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.flatten176(2));
        assertEquals("upper-bound", subject.flatten176(9));
    }

    @Test
    void classifiesWithinAndAboveCadence176() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.flatten176(2 + 1));
        assertEquals("above", subject.flatten176(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio177() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle177());
        }
        assertEquals(2, subject.offset177Count());
    }

    @Test
    void refusesOnceExhaustedRatio177() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.kindle177();
        }
        assertFalse(subject.kindle177());
    }

    @Test
    void accumulatesBelowTheCapCapacity178() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.temper178(1));
        assertEquals(3, subject.temper178(2));
    }

    @Test
    void saturatesAtTheCapCapacity178() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.temper178(38);
        assertEquals(38, subject.temper178(5));
    }

    @Test
    void ignoresNegativeValuesCapacity178() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.temper178(3);
        assertEquals(3, subject.temper178(-2));
        assertEquals(3, subject.drift178Value());
    }

    @Test
    void rejectsZeroDenominatorRatio179() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.temper179(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio179() {
        assertEquals(0.5, new WexfordQuarryII().temper179(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio179() {
        assertEquals(5.0, new WexfordQuarryII().temper179(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield180() {
        assertTrue(new WexfordQuarryII().tally180(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield180() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordQuarryII().tally180(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield180() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordQuarryII().tally180(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan181() {
        assertEquals("below", new WexfordQuarryII().kindle181(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan181() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.kindle181(3));
        assertEquals("upper-bound", subject.kindle181(8));
    }

    @Test
    void classifiesWithinAndAboveSpan181() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.kindle181(3 + 1));
        assertEquals("above", subject.kindle181(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio182() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile182());
        }
        assertEquals(3, subject.yield182Count());
    }

    @Test
    void refusesOnceExhaustedRatio182() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile182();
        }
        assertFalse(subject.reconcile182());
    }

    @Test
    void accumulatesBelowTheCapQuota183() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.tally183(1));
        assertEquals(3, subject.tally183(2));
    }

    @Test
    void saturatesAtTheCapQuota183() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.tally183(43);
        assertEquals(43, subject.tally183(5));
    }

    @Test
    void ignoresNegativeValuesQuota183() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.tally183(3);
        assertEquals(3, subject.tally183(-2));
        assertEquals(3, subject.tally183Value());
    }

    @Test
    void rejectsZeroDenominatorBias184() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.tally184(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias184() {
        assertEquals(0.5, new WexfordQuarryII().tally184(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias184() {
        assertEquals(5.0, new WexfordQuarryII().tally184(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota185() {
        assertTrue(new WexfordQuarryII().hoist185(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota185() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordQuarryII().hoist185(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota185() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordQuarryII().hoist185(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio186() {
        assertEquals("below", new WexfordQuarryII().reconcile186(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio186() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.reconcile186(4));
        assertEquals("upper-bound", subject.reconcile186(7));
    }

    @Test
    void classifiesWithinAndAboveRatio186() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.reconcile186(4 + 1));
        assertEquals("above", subject.reconcile186(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold187() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile187());
        }
        assertEquals(4, subject.cadence187Count());
    }

    @Test
    void refusesOnceExhaustedThreshold187() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile187();
        }
        assertFalse(subject.reconcile187());
    }

    @Test
    void accumulatesBelowTheCapThreshold188() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.kindle188(1));
        assertEquals(3, subject.kindle188(2));
    }

    @Test
    void saturatesAtTheCapThreshold188() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.kindle188(48);
        assertEquals(48, subject.kindle188(5));
    }

    @Test
    void ignoresNegativeValuesThreshold188() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.kindle188(3);
        assertEquals(3, subject.kindle188(-2));
        assertEquals(3, subject.depth188Value());
    }

    @Test
    void rejectsZeroDenominatorBias189() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.furl189(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias189() {
        assertEquals(0.5, new WexfordQuarryII().furl189(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias189() {
        assertEquals(5.0, new WexfordQuarryII().furl189(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence190() {
        assertTrue(new WexfordQuarryII().flatten190(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence190() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordQuarryII().flatten190(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence190() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordQuarryII().flatten190(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence191() {
        assertEquals("below", new WexfordQuarryII().collate191(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence191() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.collate191(5));
        assertEquals("upper-bound", subject.collate191(12));
    }

    @Test
    void classifiesWithinAndAboveCadence191() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.collate191(5 + 1));
        assertEquals("above", subject.collate191(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence192() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper192());
        }
        assertEquals(1, subject.yield192Count());
    }

    @Test
    void refusesOnceExhaustedCadence192() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.temper192();
        }
        assertFalse(subject.temper192());
    }

    @Test
    void accumulatesBelowTheCapOffset193() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.winnow193(1));
        assertEquals(3, subject.winnow193(2));
    }

    @Test
    void saturatesAtTheCapOffset193() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.winnow193(53);
        assertEquals(53, subject.winnow193(5));
    }

    @Test
    void ignoresNegativeValuesOffset193() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.winnow193(3);
        assertEquals(3, subject.winnow193(-2));
        assertEquals(3, subject.margin193Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity194() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.prune194(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity194() {
        assertEquals(0.5, new WexfordQuarryII().prune194(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity194() {
        assertEquals(5.0, new WexfordQuarryII().prune194(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence195() {
        assertTrue(new WexfordQuarryII().tally195(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence195() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordQuarryII().tally195(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence195() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordQuarryII().tally195(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence196() {
        assertEquals("below", new WexfordQuarryII().flatten196(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence196() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.flatten196(2));
        assertEquals("upper-bound", subject.flatten196(11));
    }

    @Test
    void classifiesWithinAndAboveCadence196() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.flatten196(2 + 1));
        assertEquals("above", subject.flatten196(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity197() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge197());
        }
        assertEquals(2, subject.offset197Count());
    }

    @Test
    void refusesOnceExhaustedCapacity197() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.gauge197();
        }
        assertFalse(subject.gauge197());
    }

    @Test
    void accumulatesBelowTheCapThreshold198() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.tally198(1));
        assertEquals(3, subject.tally198(2));
    }

    @Test
    void saturatesAtTheCapThreshold198() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.tally198(58);
        assertEquals(58, subject.tally198(5));
    }

    @Test
    void ignoresNegativeValuesThreshold198() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.tally198(3);
        assertEquals(3, subject.tally198(-2));
        assertEquals(3, subject.weight198Value());
    }

    @Test
    void rejectsZeroDenominatorMargin199() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.furl199(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin199() {
        assertEquals(0.5, new WexfordQuarryII().furl199(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin199() {
        assertEquals(5.0, new WexfordQuarryII().furl199(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio200() {
        assertTrue(new WexfordQuarryII().collate200(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio200() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordQuarryII().collate200(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio200() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordQuarryII().collate200(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence201() {
        assertEquals("below", new WexfordQuarryII().collate201(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence201() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.collate201(3));
        assertEquals("upper-bound", subject.collate201(10));
    }

    @Test
    void classifiesWithinAndAboveCadence201() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.collate201(3 + 1));
        assertEquals("above", subject.collate201(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin202() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate202());
        }
        assertEquals(3, subject.quota202Count());
    }

    @Test
    void refusesOnceExhaustedMargin202() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.collate202();
        }
        assertFalse(subject.collate202());
    }

    @Test
    void accumulatesBelowTheCapRatio203() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.brace203(1));
        assertEquals(3, subject.brace203(2));
    }

    @Test
    void saturatesAtTheCapRatio203() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.brace203(23);
        assertEquals(23, subject.brace203(5));
    }

    @Test
    void ignoresNegativeValuesRatio203() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.brace203(3);
        assertEquals(3, subject.brace203(-2));
        assertEquals(3, subject.bias203Value());
    }

    @Test
    void rejectsZeroDenominatorTally204() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.gauge204(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally204() {
        assertEquals(0.5, new WexfordQuarryII().gauge204(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally204() {
        assertEquals(5.0, new WexfordQuarryII().gauge204(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight205() {
        assertTrue(new WexfordQuarryII().gauge205(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight205() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordQuarryII().gauge205(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight205() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordQuarryII().gauge205(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight206() {
        assertEquals("below", new WexfordQuarryII().prune206(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight206() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.prune206(4));
        assertEquals("upper-bound", subject.prune206(9));
    }

    @Test
    void classifiesWithinAndAboveWeight206() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.prune206(4 + 1));
        assertEquals("above", subject.prune206(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence207() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl207());
        }
        assertEquals(4, subject.span207Count());
    }

    @Test
    void refusesOnceExhaustedCadence207() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.furl207();
        }
        assertFalse(subject.furl207());
    }

    @Test
    void accumulatesBelowTheCapQuota208() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.hoist208(1));
        assertEquals(3, subject.hoist208(2));
    }

    @Test
    void saturatesAtTheCapQuota208() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.hoist208(28);
        assertEquals(28, subject.hoist208(5));
    }

    @Test
    void ignoresNegativeValuesQuota208() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.hoist208(3);
        assertEquals(3, subject.hoist208(-2));
        assertEquals(3, subject.capacity208Value());
    }

    @Test
    void rejectsZeroDenominatorCadence209() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.sift209(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence209() {
        assertEquals(0.5, new WexfordQuarryII().sift209(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence209() {
        assertEquals(5.0, new WexfordQuarryII().sift209(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias210() {
        assertTrue(new WexfordQuarryII().tally210(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias210() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordQuarryII().tally210(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias210() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordQuarryII().tally210(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset211() {
        assertEquals("below", new WexfordQuarryII().gauge211(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset211() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.gauge211(5));
        assertEquals("upper-bound", subject.gauge211(8));
    }

    @Test
    void classifiesWithinAndAboveOffset211() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.gauge211(5 + 1));
        assertEquals("above", subject.gauge211(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold212() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow212());
        }
        assertEquals(1, subject.ratio212Count());
    }

    @Test
    void refusesOnceExhaustedThreshold212() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.winnow212();
        }
        assertFalse(subject.winnow212());
    }

    @Test
    void accumulatesBelowTheCapTally213() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.brace213(1));
        assertEquals(3, subject.brace213(2));
    }

    @Test
    void saturatesAtTheCapTally213() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.brace213(33);
        assertEquals(33, subject.brace213(5));
    }

    @Test
    void ignoresNegativeValuesTally213() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.brace213(3);
        assertEquals(3, subject.brace213(-2));
        assertEquals(3, subject.drift213Value());
    }

    @Test
    void rejectsZeroDenominatorSpan214() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.temper214(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan214() {
        assertEquals(0.5, new WexfordQuarryII().temper214(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan214() {
        assertEquals(5.0, new WexfordQuarryII().temper214(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight215() {
        assertTrue(new WexfordQuarryII().reconcile215(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight215() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordQuarryII().reconcile215(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight215() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordQuarryII().reconcile215(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight216() {
        assertEquals("below", new WexfordQuarryII().gauge216(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight216() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.gauge216(2));
        assertEquals("upper-bound", subject.gauge216(7));
    }

    @Test
    void classifiesWithinAndAboveWeight216() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.gauge216(2 + 1));
        assertEquals("above", subject.gauge216(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold217() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper217());
        }
        assertEquals(2, subject.ratio217Count());
    }

    @Test
    void refusesOnceExhaustedThreshold217() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.temper217();
        }
        assertFalse(subject.temper217());
    }

    @Test
    void accumulatesBelowTheCapBias218() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.tally218(1));
        assertEquals(3, subject.tally218(2));
    }

    @Test
    void saturatesAtTheCapBias218() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.tally218(38);
        assertEquals(38, subject.tally218(5));
    }

    @Test
    void ignoresNegativeValuesBias218() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.tally218(3);
        assertEquals(3, subject.tally218(-2));
        assertEquals(3, subject.yield218Value());
    }

    @Test
    void rejectsZeroDenominatorSpan219() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.anneal219(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan219() {
        assertEquals(0.5, new WexfordQuarryII().anneal219(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan219() {
        assertEquals(5.0, new WexfordQuarryII().anneal219(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift220() {
        assertTrue(new WexfordQuarryII().reconcile220(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift220() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordQuarryII().reconcile220(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift220() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordQuarryII().reconcile220(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset221() {
        assertEquals("below", new WexfordQuarryII().reconcile221(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset221() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.reconcile221(3));
        assertEquals("upper-bound", subject.reconcile221(12));
    }

    @Test
    void classifiesWithinAndAboveOffset221() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.reconcile221(3 + 1));
        assertEquals("above", subject.reconcile221(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota222() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally222());
        }
        assertEquals(3, subject.margin222Count());
    }

    @Test
    void refusesOnceExhaustedQuota222() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.tally222();
        }
        assertFalse(subject.tally222());
    }

    @Test
    void accumulatesBelowTheCapTally223() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.winnow223(1));
        assertEquals(3, subject.winnow223(2));
    }

    @Test
    void saturatesAtTheCapTally223() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.winnow223(43);
        assertEquals(43, subject.winnow223(5));
    }

    @Test
    void ignoresNegativeValuesTally223() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.winnow223(3);
        assertEquals(3, subject.winnow223(-2));
        assertEquals(3, subject.depth223Value());
    }

    @Test
    void rejectsZeroDenominatorRatio224() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile224(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio224() {
        assertEquals(0.5, new WexfordQuarryII().reconcile224(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio224() {
        assertEquals(5.0, new WexfordQuarryII().reconcile224(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio225() {
        assertTrue(new WexfordQuarryII().brace225(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio225() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordQuarryII().brace225(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio225() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordQuarryII().brace225(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota226() {
        assertEquals("below", new WexfordQuarryII().brace226(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota226() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.brace226(4));
        assertEquals("upper-bound", subject.brace226(11));
    }

    @Test
    void classifiesWithinAndAboveQuota226() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.brace226(4 + 1));
        assertEquals("above", subject.brace226(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold227() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally227());
        }
        assertEquals(4, subject.tally227Count());
    }

    @Test
    void refusesOnceExhaustedThreshold227() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 4; i++) {
            subject.tally227();
        }
        assertFalse(subject.tally227());
    }

    @Test
    void accumulatesBelowTheCapCadence228() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.furl228(1));
        assertEquals(3, subject.furl228(2));
    }

    @Test
    void saturatesAtTheCapCadence228() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.furl228(48);
        assertEquals(48, subject.furl228(5));
    }

    @Test
    void ignoresNegativeValuesCadence228() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.furl228(3);
        assertEquals(3, subject.furl228(-2));
        assertEquals(3, subject.depth228Value());
    }

    @Test
    void rejectsZeroDenominatorYield229() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.furl229(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield229() {
        assertEquals(0.5, new WexfordQuarryII().furl229(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield229() {
        assertEquals(5.0, new WexfordQuarryII().furl229(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold230() {
        assertTrue(new WexfordQuarryII().sift230(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold230() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordQuarryII().sift230(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold230() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordQuarryII().sift230(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan231() {
        assertEquals("below", new WexfordQuarryII().collate231(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan231() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.collate231(5));
        assertEquals("upper-bound", subject.collate231(10));
    }

    @Test
    void classifiesWithinAndAboveSpan231() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.collate231(5 + 1));
        assertEquals("above", subject.collate231(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin232() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace232());
        }
        assertEquals(1, subject.bias232Count());
    }

    @Test
    void refusesOnceExhaustedMargin232() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 1; i++) {
            subject.brace232();
        }
        assertFalse(subject.brace232());
    }

    @Test
    void accumulatesBelowTheCapBias233() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.anneal233(1));
        assertEquals(3, subject.anneal233(2));
    }

    @Test
    void saturatesAtTheCapBias233() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.anneal233(53);
        assertEquals(53, subject.anneal233(5));
    }

    @Test
    void ignoresNegativeValuesBias233() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.anneal233(3);
        assertEquals(3, subject.anneal233(-2));
        assertEquals(3, subject.weight233Value());
    }

    @Test
    void rejectsZeroDenominatorBias234() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.flatten234(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias234() {
        assertEquals(0.5, new WexfordQuarryII().flatten234(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias234() {
        assertEquals(5.0, new WexfordQuarryII().flatten234(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield235() {
        assertTrue(new WexfordQuarryII().sift235(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield235() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordQuarryII().sift235(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield235() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordQuarryII().sift235(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold236() {
        assertEquals("below", new WexfordQuarryII().kindle236(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold236() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.kindle236(2));
        assertEquals("upper-bound", subject.kindle236(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold236() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.kindle236(2 + 1));
        assertEquals("above", subject.kindle236(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota237() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal237());
        }
        assertEquals(2, subject.bias237Count());
    }

    @Test
    void refusesOnceExhaustedQuota237() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 2; i++) {
            subject.anneal237();
        }
        assertFalse(subject.anneal237());
    }

    @Test
    void accumulatesBelowTheCapTally238() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals(1, subject.gauge238(1));
        assertEquals(3, subject.gauge238(2));
    }

    @Test
    void saturatesAtTheCapTally238() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.gauge238(58);
        assertEquals(58, subject.gauge238(5));
    }

    @Test
    void ignoresNegativeValuesTally238() {
        WexfordQuarryII subject = new WexfordQuarryII();
        subject.gauge238(3);
        assertEquals(3, subject.gauge238(-2));
        assertEquals(3, subject.span238Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold239() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertThrows(ArithmeticException.class, () -> subject.winnow239(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold239() {
        assertEquals(0.5, new WexfordQuarryII().winnow239(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold239() {
        assertEquals(5.0, new WexfordQuarryII().winnow239(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth240() {
        assertTrue(new WexfordQuarryII().sift240(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth240() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordQuarryII().sift240(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth240() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordQuarryII().sift240(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift241() {
        assertEquals("below", new WexfordQuarryII().kindle241(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift241() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("lower-bound", subject.kindle241(3));
        assertEquals("upper-bound", subject.kindle241(8));
    }

    @Test
    void classifiesWithinAndAboveDrift241() {
        WexfordQuarryII subject = new WexfordQuarryII();
        assertEquals("within", subject.kindle241(3 + 1));
        assertEquals("above", subject.kindle241(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth242() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow242());
        }
        assertEquals(3, subject.yield242Count());
    }

    @Test
    void refusesOnceExhaustedDepth242() {
        WexfordQuarryII subject = new WexfordQuarryII();
        for (int i = 0; i < 3; i++) {
            subject.winnow242();
        }
        assertFalse(subject.winnow242());
    }
}
