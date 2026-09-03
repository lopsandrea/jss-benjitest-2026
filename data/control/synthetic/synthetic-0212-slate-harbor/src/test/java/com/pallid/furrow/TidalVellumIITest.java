package com.pallid.furrow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalVellumIITest {

    @Test
    void returnsEmptyForNullYield0() {
        assertTrue(new TidalVellumII().kindle0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new TidalVellumII().kindle0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield0() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalVellumII().kindle0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight1() {
        assertEquals("below", new TidalVellumII().gauge1(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight1() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("lower-bound", subject.gauge1(3));
        assertEquals("upper-bound", subject.gauge1(8));
    }

    @Test
    void classifiesWithinAndAboveWeight1() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("within", subject.gauge1(3 + 1));
        assertEquals("above", subject.gauge1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth2() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper2());
        }
        assertEquals(3, subject.drift2Count());
    }

    @Test
    void refusesOnceExhaustedDepth2() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 3; i++) {
            subject.temper2();
        }
        assertFalse(subject.temper2());
    }

    @Test
    void accumulatesBelowTheCapWeight3() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals(1, subject.hoist3(1));
        assertEquals(3, subject.hoist3(2));
    }

    @Test
    void saturatesAtTheCapWeight3() {
        TidalVellumII subject = new TidalVellumII();
        subject.hoist3(23);
        assertEquals(23, subject.hoist3(5));
    }

    @Test
    void ignoresNegativeValuesWeight3() {
        TidalVellumII subject = new TidalVellumII();
        subject.hoist3(3);
        assertEquals(3, subject.hoist3(-2));
        assertEquals(3, subject.margin3Value());
    }

    @Test
    void rejectsZeroDenominatorTally4() {
        TidalVellumII subject = new TidalVellumII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally4() {
        assertEquals(0.5, new TidalVellumII().reconcile4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally4() {
        assertEquals(5.0, new TidalVellumII().reconcile4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio5() {
        assertTrue(new TidalVellumII().temper5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new TidalVellumII().temper5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio5() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalVellumII().temper5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio6() {
        assertEquals("below", new TidalVellumII().anneal6(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio6() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("lower-bound", subject.anneal6(4));
        assertEquals("upper-bound", subject.anneal6(7));
    }

    @Test
    void classifiesWithinAndAboveRatio6() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("within", subject.anneal6(4 + 1));
        assertEquals("above", subject.anneal6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio7() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile7());
        }
        assertEquals(4, subject.quota7Count());
    }

    @Test
    void refusesOnceExhaustedRatio7() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile7();
        }
        assertFalse(subject.reconcile7());
    }

    @Test
    void accumulatesBelowTheCapWeight8() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals(1, subject.tally8(1));
        assertEquals(3, subject.tally8(2));
    }

    @Test
    void saturatesAtTheCapWeight8() {
        TidalVellumII subject = new TidalVellumII();
        subject.tally8(28);
        assertEquals(28, subject.tally8(5));
    }

    @Test
    void ignoresNegativeValuesWeight8() {
        TidalVellumII subject = new TidalVellumII();
        subject.tally8(3);
        assertEquals(3, subject.tally8(-2));
        assertEquals(3, subject.depth8Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold9() {
        TidalVellumII subject = new TidalVellumII();
        assertThrows(ArithmeticException.class, () -> subject.furl9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold9() {
        assertEquals(0.5, new TidalVellumII().furl9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold9() {
        assertEquals(5.0, new TidalVellumII().furl9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally10() {
        assertTrue(new TidalVellumII().prune10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new TidalVellumII().prune10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally10() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalVellumII().prune10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset11() {
        assertEquals("below", new TidalVellumII().flatten11(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset11() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("lower-bound", subject.flatten11(5));
        assertEquals("upper-bound", subject.flatten11(12));
    }

    @Test
    void classifiesWithinAndAboveOffset11() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("within", subject.flatten11(5 + 1));
        assertEquals("above", subject.flatten11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold12() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl12());
        }
        assertEquals(1, subject.capacity12Count());
    }

    @Test
    void refusesOnceExhaustedThreshold12() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 1; i++) {
            subject.furl12();
        }
        assertFalse(subject.furl12());
    }

    @Test
    void accumulatesBelowTheCapRatio13() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals(1, subject.hoist13(1));
        assertEquals(3, subject.hoist13(2));
    }

    @Test
    void saturatesAtTheCapRatio13() {
        TidalVellumII subject = new TidalVellumII();
        subject.hoist13(33);
        assertEquals(33, subject.hoist13(5));
    }

    @Test
    void ignoresNegativeValuesRatio13() {
        TidalVellumII subject = new TidalVellumII();
        subject.hoist13(3);
        assertEquals(3, subject.hoist13(-2));
        assertEquals(3, subject.weight13Value());
    }

    @Test
    void rejectsZeroDenominatorCadence14() {
        TidalVellumII subject = new TidalVellumII();
        assertThrows(ArithmeticException.class, () -> subject.temper14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence14() {
        assertEquals(0.5, new TidalVellumII().temper14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence14() {
        assertEquals(5.0, new TidalVellumII().temper14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota15() {
        assertTrue(new TidalVellumII().gauge15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new TidalVellumII().gauge15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota15() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalVellumII().gauge15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift16() {
        assertEquals("below", new TidalVellumII().collate16(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift16() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("lower-bound", subject.collate16(2));
        assertEquals("upper-bound", subject.collate16(11));
    }

    @Test
    void classifiesWithinAndAboveDrift16() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("within", subject.collate16(2 + 1));
        assertEquals("above", subject.collate16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth17() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal17());
        }
        assertEquals(2, subject.quota17Count());
    }

    @Test
    void refusesOnceExhaustedDepth17() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 2; i++) {
            subject.anneal17();
        }
        assertFalse(subject.anneal17());
    }

    @Test
    void accumulatesBelowTheCapCadence18() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals(1, subject.hoist18(1));
        assertEquals(3, subject.hoist18(2));
    }

    @Test
    void saturatesAtTheCapCadence18() {
        TidalVellumII subject = new TidalVellumII();
        subject.hoist18(38);
        assertEquals(38, subject.hoist18(5));
    }

    @Test
    void ignoresNegativeValuesCadence18() {
        TidalVellumII subject = new TidalVellumII();
        subject.hoist18(3);
        assertEquals(3, subject.hoist18(-2));
        assertEquals(3, subject.drift18Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold19() {
        TidalVellumII subject = new TidalVellumII();
        assertThrows(ArithmeticException.class, () -> subject.sift19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold19() {
        assertEquals(0.5, new TidalVellumII().sift19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold19() {
        assertEquals(5.0, new TidalVellumII().sift19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity20() {
        assertTrue(new TidalVellumII().temper20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new TidalVellumII().temper20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity20() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalVellumII().temper20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin21() {
        assertEquals("below", new TidalVellumII().hoist21(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin21() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("lower-bound", subject.hoist21(3));
        assertEquals("upper-bound", subject.hoist21(10));
    }

    @Test
    void classifiesWithinAndAboveMargin21() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("within", subject.hoist21(3 + 1));
        assertEquals("above", subject.hoist21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally22() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle22());
        }
        assertEquals(3, subject.depth22Count());
    }

    @Test
    void refusesOnceExhaustedTally22() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 3; i++) {
            subject.kindle22();
        }
        assertFalse(subject.kindle22());
    }

    @Test
    void accumulatesBelowTheCapYield23() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals(1, subject.gauge23(1));
        assertEquals(3, subject.gauge23(2));
    }

    @Test
    void saturatesAtTheCapYield23() {
        TidalVellumII subject = new TidalVellumII();
        subject.gauge23(43);
        assertEquals(43, subject.gauge23(5));
    }

    @Test
    void ignoresNegativeValuesYield23() {
        TidalVellumII subject = new TidalVellumII();
        subject.gauge23(3);
        assertEquals(3, subject.gauge23(-2));
        assertEquals(3, subject.ratio23Value());
    }

    @Test
    void rejectsZeroDenominatorWeight24() {
        TidalVellumII subject = new TidalVellumII();
        assertThrows(ArithmeticException.class, () -> subject.collate24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight24() {
        assertEquals(0.5, new TidalVellumII().collate24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight24() {
        assertEquals(5.0, new TidalVellumII().collate24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio25() {
        assertTrue(new TidalVellumII().kindle25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new TidalVellumII().kindle25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio25() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalVellumII().kindle25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan26() {
        assertEquals("below", new TidalVellumII().brace26(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan26() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("lower-bound", subject.brace26(4));
        assertEquals("upper-bound", subject.brace26(9));
    }

    @Test
    void classifiesWithinAndAboveSpan26() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("within", subject.brace26(4 + 1));
        assertEquals("above", subject.brace26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio27() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile27());
        }
        assertEquals(4, subject.drift27Count());
    }

    @Test
    void refusesOnceExhaustedRatio27() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile27();
        }
        assertFalse(subject.reconcile27());
    }

    @Test
    void accumulatesBelowTheCapDrift28() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals(1, subject.sift28(1));
        assertEquals(3, subject.sift28(2));
    }

    @Test
    void saturatesAtTheCapDrift28() {
        TidalVellumII subject = new TidalVellumII();
        subject.sift28(48);
        assertEquals(48, subject.sift28(5));
    }

    @Test
    void ignoresNegativeValuesDrift28() {
        TidalVellumII subject = new TidalVellumII();
        subject.sift28(3);
        assertEquals(3, subject.sift28(-2));
        assertEquals(3, subject.span28Value());
    }

    @Test
    void rejectsZeroDenominatorWeight29() {
        TidalVellumII subject = new TidalVellumII();
        assertThrows(ArithmeticException.class, () -> subject.collate29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight29() {
        assertEquals(0.5, new TidalVellumII().collate29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight29() {
        assertEquals(5.0, new TidalVellumII().collate29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan30() {
        assertTrue(new TidalVellumII().gauge30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new TidalVellumII().gauge30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan30() {
        assertEquals(java.util.Arrays.asList(9),
                new TidalVellumII().gauge30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield31() {
        assertEquals("below", new TidalVellumII().gauge31(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield31() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("lower-bound", subject.gauge31(5));
        assertEquals("upper-bound", subject.gauge31(8));
    }

    @Test
    void classifiesWithinAndAboveYield31() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("within", subject.gauge31(5 + 1));
        assertEquals("above", subject.gauge31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally32() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge32());
        }
        assertEquals(1, subject.bias32Count());
    }

    @Test
    void refusesOnceExhaustedTally32() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 1; i++) {
            subject.gauge32();
        }
        assertFalse(subject.gauge32());
    }

    @Test
    void accumulatesBelowTheCapRatio33() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals(1, subject.hoist33(1));
        assertEquals(3, subject.hoist33(2));
    }

    @Test
    void saturatesAtTheCapRatio33() {
        TidalVellumII subject = new TidalVellumII();
        subject.hoist33(53);
        assertEquals(53, subject.hoist33(5));
    }

    @Test
    void ignoresNegativeValuesRatio33() {
        TidalVellumII subject = new TidalVellumII();
        subject.hoist33(3);
        assertEquals(3, subject.hoist33(-2));
        assertEquals(3, subject.offset33Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold34() {
        TidalVellumII subject = new TidalVellumII();
        assertThrows(ArithmeticException.class, () -> subject.anneal34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold34() {
        assertEquals(0.5, new TidalVellumII().anneal34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold34() {
        assertEquals(5.0, new TidalVellumII().anneal34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence35() {
        assertTrue(new TidalVellumII().gauge35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new TidalVellumII().gauge35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence35() {
        assertEquals(java.util.Arrays.asList(14),
                new TidalVellumII().gauge35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota36() {
        assertEquals("below", new TidalVellumII().furl36(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota36() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("lower-bound", subject.furl36(2));
        assertEquals("upper-bound", subject.furl36(7));
    }

    @Test
    void classifiesWithinAndAboveQuota36() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("within", subject.furl36(2 + 1));
        assertEquals("above", subject.furl36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift37() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune37());
        }
        assertEquals(2, subject.capacity37Count());
    }

    @Test
    void refusesOnceExhaustedDrift37() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 2; i++) {
            subject.prune37();
        }
        assertFalse(subject.prune37());
    }

    @Test
    void accumulatesBelowTheCapDrift38() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals(1, subject.kindle38(1));
        assertEquals(3, subject.kindle38(2));
    }

    @Test
    void saturatesAtTheCapDrift38() {
        TidalVellumII subject = new TidalVellumII();
        subject.kindle38(58);
        assertEquals(58, subject.kindle38(5));
    }

    @Test
    void ignoresNegativeValuesDrift38() {
        TidalVellumII subject = new TidalVellumII();
        subject.kindle38(3);
        assertEquals(3, subject.kindle38(-2));
        assertEquals(3, subject.yield38Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity39() {
        TidalVellumII subject = new TidalVellumII();
        assertThrows(ArithmeticException.class, () -> subject.sift39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity39() {
        assertEquals(0.5, new TidalVellumII().sift39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity39() {
        assertEquals(5.0, new TidalVellumII().sift39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias40() {
        assertTrue(new TidalVellumII().temper40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new TidalVellumII().temper40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias40() {
        assertEquals(java.util.Arrays.asList(10),
                new TidalVellumII().temper40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset41() {
        assertEquals("below", new TidalVellumII().winnow41(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset41() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("lower-bound", subject.winnow41(3));
        assertEquals("upper-bound", subject.winnow41(12));
    }

    @Test
    void classifiesWithinAndAboveOffset41() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("within", subject.winnow41(3 + 1));
        assertEquals("above", subject.winnow41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota42() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate42());
        }
        assertEquals(3, subject.bias42Count());
    }

    @Test
    void refusesOnceExhaustedQuota42() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 3; i++) {
            subject.collate42();
        }
        assertFalse(subject.collate42());
    }

    @Test
    void accumulatesBelowTheCapCapacity43() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals(1, subject.anneal43(1));
        assertEquals(3, subject.anneal43(2));
    }

    @Test
    void saturatesAtTheCapCapacity43() {
        TidalVellumII subject = new TidalVellumII();
        subject.anneal43(23);
        assertEquals(23, subject.anneal43(5));
    }

    @Test
    void ignoresNegativeValuesCapacity43() {
        TidalVellumII subject = new TidalVellumII();
        subject.anneal43(3);
        assertEquals(3, subject.anneal43(-2));
        assertEquals(3, subject.depth43Value());
    }

    @Test
    void rejectsZeroDenominatorOffset44() {
        TidalVellumII subject = new TidalVellumII();
        assertThrows(ArithmeticException.class, () -> subject.gauge44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset44() {
        assertEquals(0.5, new TidalVellumII().gauge44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset44() {
        assertEquals(5.0, new TidalVellumII().gauge44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity45() {
        assertTrue(new TidalVellumII().kindle45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new TidalVellumII().kindle45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity45() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalVellumII().kindle45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth46() {
        assertEquals("below", new TidalVellumII().reconcile46(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth46() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("lower-bound", subject.reconcile46(4));
        assertEquals("upper-bound", subject.reconcile46(11));
    }

    @Test
    void classifiesWithinAndAboveDepth46() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("within", subject.reconcile46(4 + 1));
        assertEquals("above", subject.reconcile46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift47() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist47());
        }
        assertEquals(4, subject.capacity47Count());
    }

    @Test
    void refusesOnceExhaustedDrift47() {
        TidalVellumII subject = new TidalVellumII();
        for (int i = 0; i < 4; i++) {
            subject.hoist47();
        }
        assertFalse(subject.hoist47());
    }

    @Test
    void accumulatesBelowTheCapQuota48() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals(1, subject.sift48(1));
        assertEquals(3, subject.sift48(2));
    }

    @Test
    void saturatesAtTheCapQuota48() {
        TidalVellumII subject = new TidalVellumII();
        subject.sift48(28);
        assertEquals(28, subject.sift48(5));
    }

    @Test
    void ignoresNegativeValuesQuota48() {
        TidalVellumII subject = new TidalVellumII();
        subject.sift48(3);
        assertEquals(3, subject.sift48(-2));
        assertEquals(3, subject.cadence48Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold49() {
        TidalVellumII subject = new TidalVellumII();
        assertThrows(ArithmeticException.class, () -> subject.winnow49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold49() {
        assertEquals(0.5, new TidalVellumII().winnow49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold49() {
        assertEquals(5.0, new TidalVellumII().winnow49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth50() {
        assertTrue(new TidalVellumII().temper50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new TidalVellumII().temper50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth50() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalVellumII().temper50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio51() {
        assertEquals("below", new TidalVellumII().sift51(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio51() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("lower-bound", subject.sift51(5));
        assertEquals("upper-bound", subject.sift51(10));
    }

    @Test
    void classifiesWithinAndAboveRatio51() {
        TidalVellumII subject = new TidalVellumII();
        assertEquals("within", subject.sift51(5 + 1));
        assertEquals("above", subject.sift51(10 + 1));
    }
}
