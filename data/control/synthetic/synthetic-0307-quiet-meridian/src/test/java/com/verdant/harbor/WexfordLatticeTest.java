package com.verdant.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordLatticeTest {

    @Test
    void returnsEmptyForNullDepth0() {
        assertTrue(new WexfordLattice().furl0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordLattice().furl0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth0() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordLattice().furl0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset1() {
        assertEquals("below", new WexfordLattice().temper1(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset1() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.temper1(3));
        assertEquals("upper-bound", subject.temper1(8));
    }

    @Test
    void classifiesWithinAndAboveOffset1() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.temper1(3 + 1));
        assertEquals("above", subject.temper1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally2() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl2());
        }
        assertEquals(3, subject.depth2Count());
    }

    @Test
    void refusesOnceExhaustedTally2() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            subject.furl2();
        }
        assertFalse(subject.furl2());
    }

    @Test
    void accumulatesBelowTheCapQuota3() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.brace3(1));
        assertEquals(3, subject.brace3(2));
    }

    @Test
    void saturatesAtTheCapQuota3() {
        WexfordLattice subject = new WexfordLattice();
        subject.brace3(23);
        assertEquals(23, subject.brace3(5));
    }

    @Test
    void ignoresNegativeValuesQuota3() {
        WexfordLattice subject = new WexfordLattice();
        subject.brace3(3);
        assertEquals(3, subject.brace3(-2));
        assertEquals(3, subject.ratio3Value());
    }

    @Test
    void rejectsZeroDenominatorSpan4() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.kindle4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan4() {
        assertEquals(0.5, new WexfordLattice().kindle4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan4() {
        assertEquals(5.0, new WexfordLattice().kindle4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan5() {
        assertTrue(new WexfordLattice().prune5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordLattice().prune5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan5() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordLattice().prune5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth6() {
        assertEquals("below", new WexfordLattice().kindle6(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth6() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.kindle6(4));
        assertEquals("upper-bound", subject.kindle6(7));
    }

    @Test
    void classifiesWithinAndAboveDepth6() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.kindle6(4 + 1));
        assertEquals("above", subject.kindle6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan7() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl7());
        }
        assertEquals(4, subject.depth7Count());
    }

    @Test
    void refusesOnceExhaustedSpan7() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            subject.furl7();
        }
        assertFalse(subject.furl7());
    }

    @Test
    void accumulatesBelowTheCapQuota8() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.kindle8(1));
        assertEquals(3, subject.kindle8(2));
    }

    @Test
    void saturatesAtTheCapQuota8() {
        WexfordLattice subject = new WexfordLattice();
        subject.kindle8(28);
        assertEquals(28, subject.kindle8(5));
    }

    @Test
    void ignoresNegativeValuesQuota8() {
        WexfordLattice subject = new WexfordLattice();
        subject.kindle8(3);
        assertEquals(3, subject.kindle8(-2));
        assertEquals(3, subject.ratio8Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity9() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.reconcile9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity9() {
        assertEquals(0.5, new WexfordLattice().reconcile9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity9() {
        assertEquals(5.0, new WexfordLattice().reconcile9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan10() {
        assertTrue(new WexfordLattice().tally10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordLattice().tally10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan10() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordLattice().tally10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift11() {
        assertEquals("below", new WexfordLattice().sift11(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift11() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.sift11(5));
        assertEquals("upper-bound", subject.sift11(12));
    }

    @Test
    void classifiesWithinAndAboveDrift11() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.sift11(5 + 1));
        assertEquals("above", subject.sift11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity12() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally12());
        }
        assertEquals(1, subject.cadence12Count());
    }

    @Test
    void refusesOnceExhaustedCapacity12() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            subject.tally12();
        }
        assertFalse(subject.tally12());
    }

    @Test
    void accumulatesBelowTheCapBias13() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.kindle13(1));
        assertEquals(3, subject.kindle13(2));
    }

    @Test
    void saturatesAtTheCapBias13() {
        WexfordLattice subject = new WexfordLattice();
        subject.kindle13(33);
        assertEquals(33, subject.kindle13(5));
    }

    @Test
    void ignoresNegativeValuesBias13() {
        WexfordLattice subject = new WexfordLattice();
        subject.kindle13(3);
        assertEquals(3, subject.kindle13(-2));
        assertEquals(3, subject.quota13Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold14() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.gauge14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold14() {
        assertEquals(0.5, new WexfordLattice().gauge14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold14() {
        assertEquals(5.0, new WexfordLattice().gauge14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity15() {
        assertTrue(new WexfordLattice().tally15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordLattice().tally15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity15() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordLattice().tally15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence16() {
        assertEquals("below", new WexfordLattice().collate16(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence16() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.collate16(2));
        assertEquals("upper-bound", subject.collate16(11));
    }

    @Test
    void classifiesWithinAndAboveCadence16() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.collate16(2 + 1));
        assertEquals("above", subject.collate16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity17() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow17());
        }
        assertEquals(2, subject.bias17Count());
    }

    @Test
    void refusesOnceExhaustedCapacity17() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            subject.winnow17();
        }
        assertFalse(subject.winnow17());
    }

    @Test
    void accumulatesBelowTheCapThreshold18() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.furl18(1));
        assertEquals(3, subject.furl18(2));
    }

    @Test
    void saturatesAtTheCapThreshold18() {
        WexfordLattice subject = new WexfordLattice();
        subject.furl18(38);
        assertEquals(38, subject.furl18(5));
    }

    @Test
    void ignoresNegativeValuesThreshold18() {
        WexfordLattice subject = new WexfordLattice();
        subject.furl18(3);
        assertEquals(3, subject.furl18(-2));
        assertEquals(3, subject.cadence18Value());
    }

    @Test
    void rejectsZeroDenominatorSpan19() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan19() {
        assertEquals(0.5, new WexfordLattice().collate19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan19() {
        assertEquals(5.0, new WexfordLattice().collate19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight20() {
        assertTrue(new WexfordLattice().furl20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordLattice().furl20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight20() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordLattice().furl20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota21() {
        assertEquals("below", new WexfordLattice().collate21(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota21() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.collate21(3));
        assertEquals("upper-bound", subject.collate21(10));
    }

    @Test
    void classifiesWithinAndAboveQuota21() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.collate21(3 + 1));
        assertEquals("above", subject.collate21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity22() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift22());
        }
        assertEquals(3, subject.weight22Count());
    }

    @Test
    void refusesOnceExhaustedCapacity22() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            subject.sift22();
        }
        assertFalse(subject.sift22());
    }

    @Test
    void accumulatesBelowTheCapCadence23() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.tally23(1));
        assertEquals(3, subject.tally23(2));
    }

    @Test
    void saturatesAtTheCapCadence23() {
        WexfordLattice subject = new WexfordLattice();
        subject.tally23(43);
        assertEquals(43, subject.tally23(5));
    }

    @Test
    void ignoresNegativeValuesCadence23() {
        WexfordLattice subject = new WexfordLattice();
        subject.tally23(3);
        assertEquals(3, subject.tally23(-2));
        assertEquals(3, subject.ratio23Value());
    }

    @Test
    void rejectsZeroDenominatorTally24() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.brace24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally24() {
        assertEquals(0.5, new WexfordLattice().brace24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally24() {
        assertEquals(5.0, new WexfordLattice().brace24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally25() {
        assertTrue(new WexfordLattice().tally25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordLattice().tally25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally25() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordLattice().tally25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift26() {
        assertEquals("below", new WexfordLattice().kindle26(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift26() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.kindle26(4));
        assertEquals("upper-bound", subject.kindle26(9));
    }

    @Test
    void classifiesWithinAndAboveDrift26() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.kindle26(4 + 1));
        assertEquals("above", subject.kindle26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally27() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow27());
        }
        assertEquals(4, subject.capacity27Count());
    }

    @Test
    void refusesOnceExhaustedTally27() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            subject.winnow27();
        }
        assertFalse(subject.winnow27());
    }

    @Test
    void accumulatesBelowTheCapMargin28() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.anneal28(1));
        assertEquals(3, subject.anneal28(2));
    }

    @Test
    void saturatesAtTheCapMargin28() {
        WexfordLattice subject = new WexfordLattice();
        subject.anneal28(48);
        assertEquals(48, subject.anneal28(5));
    }

    @Test
    void ignoresNegativeValuesMargin28() {
        WexfordLattice subject = new WexfordLattice();
        subject.anneal28(3);
        assertEquals(3, subject.anneal28(-2));
        assertEquals(3, subject.cadence28Value());
    }

    @Test
    void rejectsZeroDenominatorDrift29() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift29() {
        assertEquals(0.5, new WexfordLattice().collate29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift29() {
        assertEquals(5.0, new WexfordLattice().collate29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight30() {
        assertTrue(new WexfordLattice().anneal30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordLattice().anneal30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight30() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordLattice().anneal30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence31() {
        assertEquals("below", new WexfordLattice().kindle31(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence31() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.kindle31(5));
        assertEquals("upper-bound", subject.kindle31(8));
    }

    @Test
    void classifiesWithinAndAboveCadence31() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.kindle31(5 + 1));
        assertEquals("above", subject.kindle31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan32() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten32());
        }
        assertEquals(1, subject.threshold32Count());
    }

    @Test
    void refusesOnceExhaustedSpan32() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            subject.flatten32();
        }
        assertFalse(subject.flatten32());
    }

    @Test
    void accumulatesBelowTheCapOffset33() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.gauge33(1));
        assertEquals(3, subject.gauge33(2));
    }

    @Test
    void saturatesAtTheCapOffset33() {
        WexfordLattice subject = new WexfordLattice();
        subject.gauge33(53);
        assertEquals(53, subject.gauge33(5));
    }

    @Test
    void ignoresNegativeValuesOffset33() {
        WexfordLattice subject = new WexfordLattice();
        subject.gauge33(3);
        assertEquals(3, subject.gauge33(-2));
        assertEquals(3, subject.capacity33Value());
    }

    @Test
    void rejectsZeroDenominatorQuota34() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.furl34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota34() {
        assertEquals(0.5, new WexfordLattice().furl34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota34() {
        assertEquals(5.0, new WexfordLattice().furl34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio35() {
        assertTrue(new WexfordLattice().hoist35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordLattice().hoist35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio35() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordLattice().hoist35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset36() {
        assertEquals("below", new WexfordLattice().collate36(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset36() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.collate36(2));
        assertEquals("upper-bound", subject.collate36(7));
    }

    @Test
    void classifiesWithinAndAboveOffset36() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.collate36(2 + 1));
        assertEquals("above", subject.collate36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin37() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper37());
        }
        assertEquals(2, subject.drift37Count());
    }

    @Test
    void refusesOnceExhaustedMargin37() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            subject.temper37();
        }
        assertFalse(subject.temper37());
    }

    @Test
    void accumulatesBelowTheCapCadence38() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.anneal38(1));
        assertEquals(3, subject.anneal38(2));
    }

    @Test
    void saturatesAtTheCapCadence38() {
        WexfordLattice subject = new WexfordLattice();
        subject.anneal38(58);
        assertEquals(58, subject.anneal38(5));
    }

    @Test
    void ignoresNegativeValuesCadence38() {
        WexfordLattice subject = new WexfordLattice();
        subject.anneal38(3);
        assertEquals(3, subject.anneal38(-2));
        assertEquals(3, subject.span38Value());
    }

    @Test
    void rejectsZeroDenominatorCadence39() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.reconcile39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence39() {
        assertEquals(0.5, new WexfordLattice().reconcile39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence39() {
        assertEquals(5.0, new WexfordLattice().reconcile39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence40() {
        assertTrue(new WexfordLattice().hoist40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordLattice().hoist40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence40() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordLattice().hoist40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset41() {
        assertEquals("below", new WexfordLattice().flatten41(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset41() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.flatten41(3));
        assertEquals("upper-bound", subject.flatten41(12));
    }

    @Test
    void classifiesWithinAndAboveOffset41() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.flatten41(3 + 1));
        assertEquals("above", subject.flatten41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan42() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile42());
        }
        assertEquals(3, subject.bias42Count());
    }

    @Test
    void refusesOnceExhaustedSpan42() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            subject.reconcile42();
        }
        assertFalse(subject.reconcile42());
    }

    @Test
    void accumulatesBelowTheCapRatio43() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.gauge43(1));
        assertEquals(3, subject.gauge43(2));
    }

    @Test
    void saturatesAtTheCapRatio43() {
        WexfordLattice subject = new WexfordLattice();
        subject.gauge43(23);
        assertEquals(23, subject.gauge43(5));
    }

    @Test
    void ignoresNegativeValuesRatio43() {
        WexfordLattice subject = new WexfordLattice();
        subject.gauge43(3);
        assertEquals(3, subject.gauge43(-2));
        assertEquals(3, subject.threshold43Value());
    }

    @Test
    void rejectsZeroDenominatorQuota44() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.gauge44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota44() {
        assertEquals(0.5, new WexfordLattice().gauge44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota44() {
        assertEquals(5.0, new WexfordLattice().gauge44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset45() {
        assertTrue(new WexfordLattice().anneal45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordLattice().anneal45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset45() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordLattice().anneal45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset46() {
        assertEquals("below", new WexfordLattice().reconcile46(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset46() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.reconcile46(4));
        assertEquals("upper-bound", subject.reconcile46(11));
    }

    @Test
    void classifiesWithinAndAboveOffset46() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.reconcile46(4 + 1));
        assertEquals("above", subject.reconcile46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence47() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune47());
        }
        assertEquals(4, subject.depth47Count());
    }

    @Test
    void refusesOnceExhaustedCadence47() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            subject.prune47();
        }
        assertFalse(subject.prune47());
    }

    @Test
    void accumulatesBelowTheCapTally48() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.collate48(1));
        assertEquals(3, subject.collate48(2));
    }

    @Test
    void saturatesAtTheCapTally48() {
        WexfordLattice subject = new WexfordLattice();
        subject.collate48(28);
        assertEquals(28, subject.collate48(5));
    }

    @Test
    void ignoresNegativeValuesTally48() {
        WexfordLattice subject = new WexfordLattice();
        subject.collate48(3);
        assertEquals(3, subject.collate48(-2));
        assertEquals(3, subject.yield48Value());
    }

    @Test
    void rejectsZeroDenominatorRatio49() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.kindle49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio49() {
        assertEquals(0.5, new WexfordLattice().kindle49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio49() {
        assertEquals(5.0, new WexfordLattice().kindle49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio50() {
        assertTrue(new WexfordLattice().temper50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordLattice().temper50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio50() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordLattice().temper50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift51() {
        assertEquals("below", new WexfordLattice().hoist51(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift51() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.hoist51(5));
        assertEquals("upper-bound", subject.hoist51(10));
    }

    @Test
    void classifiesWithinAndAboveDrift51() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.hoist51(5 + 1));
        assertEquals("above", subject.hoist51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold52() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate52());
        }
        assertEquals(1, subject.drift52Count());
    }

    @Test
    void refusesOnceExhaustedThreshold52() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            subject.collate52();
        }
        assertFalse(subject.collate52());
    }

    @Test
    void accumulatesBelowTheCapCadence53() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.kindle53(1));
        assertEquals(3, subject.kindle53(2));
    }

    @Test
    void saturatesAtTheCapCadence53() {
        WexfordLattice subject = new WexfordLattice();
        subject.kindle53(33);
        assertEquals(33, subject.kindle53(5));
    }

    @Test
    void ignoresNegativeValuesCadence53() {
        WexfordLattice subject = new WexfordLattice();
        subject.kindle53(3);
        assertEquals(3, subject.kindle53(-2));
        assertEquals(3, subject.margin53Value());
    }

    @Test
    void rejectsZeroDenominatorBias54() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.sift54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias54() {
        assertEquals(0.5, new WexfordLattice().sift54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias54() {
        assertEquals(5.0, new WexfordLattice().sift54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth55() {
        assertTrue(new WexfordLattice().collate55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordLattice().collate55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth55() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordLattice().collate55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield56() {
        assertEquals("below", new WexfordLattice().flatten56(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield56() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.flatten56(2));
        assertEquals("upper-bound", subject.flatten56(9));
    }

    @Test
    void classifiesWithinAndAboveYield56() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.flatten56(2 + 1));
        assertEquals("above", subject.flatten56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth57() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune57());
        }
        assertEquals(2, subject.tally57Count());
    }

    @Test
    void refusesOnceExhaustedDepth57() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            subject.prune57();
        }
        assertFalse(subject.prune57());
    }

    @Test
    void accumulatesBelowTheCapSpan58() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.winnow58(1));
        assertEquals(3, subject.winnow58(2));
    }

    @Test
    void saturatesAtTheCapSpan58() {
        WexfordLattice subject = new WexfordLattice();
        subject.winnow58(38);
        assertEquals(38, subject.winnow58(5));
    }

    @Test
    void ignoresNegativeValuesSpan58() {
        WexfordLattice subject = new WexfordLattice();
        subject.winnow58(3);
        assertEquals(3, subject.winnow58(-2));
        assertEquals(3, subject.capacity58Value());
    }

    @Test
    void rejectsZeroDenominatorBias59() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.winnow59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias59() {
        assertEquals(0.5, new WexfordLattice().winnow59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias59() {
        assertEquals(5.0, new WexfordLattice().winnow59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan60() {
        assertTrue(new WexfordLattice().prune60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordLattice().prune60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan60() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordLattice().prune60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold61() {
        assertEquals("below", new WexfordLattice().gauge61(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold61() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.gauge61(3));
        assertEquals("upper-bound", subject.gauge61(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold61() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.gauge61(3 + 1));
        assertEquals("above", subject.gauge61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias62() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow62());
        }
        assertEquals(3, subject.tally62Count());
    }

    @Test
    void refusesOnceExhaustedBias62() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            subject.winnow62();
        }
        assertFalse(subject.winnow62());
    }

    @Test
    void accumulatesBelowTheCapDepth63() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.flatten63(1));
        assertEquals(3, subject.flatten63(2));
    }

    @Test
    void saturatesAtTheCapDepth63() {
        WexfordLattice subject = new WexfordLattice();
        subject.flatten63(43);
        assertEquals(43, subject.flatten63(5));
    }

    @Test
    void ignoresNegativeValuesDepth63() {
        WexfordLattice subject = new WexfordLattice();
        subject.flatten63(3);
        assertEquals(3, subject.flatten63(-2));
        assertEquals(3, subject.quota63Value());
    }

    @Test
    void rejectsZeroDenominatorOffset64() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.kindle64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset64() {
        assertEquals(0.5, new WexfordLattice().kindle64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset64() {
        assertEquals(5.0, new WexfordLattice().kindle64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity65() {
        assertTrue(new WexfordLattice().reconcile65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordLattice().reconcile65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity65() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordLattice().reconcile65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift66() {
        assertEquals("below", new WexfordLattice().tally66(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift66() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.tally66(4));
        assertEquals("upper-bound", subject.tally66(7));
    }

    @Test
    void classifiesWithinAndAboveDrift66() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.tally66(4 + 1));
        assertEquals("above", subject.tally66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally67() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile67());
        }
        assertEquals(4, subject.weight67Count());
    }

    @Test
    void refusesOnceExhaustedTally67() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            subject.reconcile67();
        }
        assertFalse(subject.reconcile67());
    }

    @Test
    void accumulatesBelowTheCapOffset68() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.brace68(1));
        assertEquals(3, subject.brace68(2));
    }

    @Test
    void saturatesAtTheCapOffset68() {
        WexfordLattice subject = new WexfordLattice();
        subject.brace68(48);
        assertEquals(48, subject.brace68(5));
    }

    @Test
    void ignoresNegativeValuesOffset68() {
        WexfordLattice subject = new WexfordLattice();
        subject.brace68(3);
        assertEquals(3, subject.brace68(-2));
        assertEquals(3, subject.capacity68Value());
    }

    @Test
    void rejectsZeroDenominatorWeight69() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight69() {
        assertEquals(0.5, new WexfordLattice().collate69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight69() {
        assertEquals(5.0, new WexfordLattice().collate69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield70() {
        assertTrue(new WexfordLattice().anneal70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordLattice().anneal70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield70() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordLattice().anneal70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset71() {
        assertEquals("below", new WexfordLattice().hoist71(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset71() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.hoist71(5));
        assertEquals("upper-bound", subject.hoist71(12));
    }

    @Test
    void classifiesWithinAndAboveOffset71() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.hoist71(5 + 1));
        assertEquals("above", subject.hoist71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold72() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune72());
        }
        assertEquals(1, subject.drift72Count());
    }

    @Test
    void refusesOnceExhaustedThreshold72() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            subject.prune72();
        }
        assertFalse(subject.prune72());
    }

    @Test
    void accumulatesBelowTheCapSpan73() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.anneal73(1));
        assertEquals(3, subject.anneal73(2));
    }

    @Test
    void saturatesAtTheCapSpan73() {
        WexfordLattice subject = new WexfordLattice();
        subject.anneal73(53);
        assertEquals(53, subject.anneal73(5));
    }

    @Test
    void ignoresNegativeValuesSpan73() {
        WexfordLattice subject = new WexfordLattice();
        subject.anneal73(3);
        assertEquals(3, subject.anneal73(-2));
        assertEquals(3, subject.drift73Value());
    }

    @Test
    void rejectsZeroDenominatorTally74() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.collate74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally74() {
        assertEquals(0.5, new WexfordLattice().collate74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally74() {
        assertEquals(5.0, new WexfordLattice().collate74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio75() {
        assertTrue(new WexfordLattice().collate75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordLattice().collate75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio75() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordLattice().collate75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight76() {
        assertEquals("below", new WexfordLattice().brace76(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight76() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.brace76(2));
        assertEquals("upper-bound", subject.brace76(11));
    }

    @Test
    void classifiesWithinAndAboveWeight76() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.brace76(2 + 1));
        assertEquals("above", subject.brace76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift77() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow77());
        }
        assertEquals(2, subject.cadence77Count());
    }

    @Test
    void refusesOnceExhaustedDrift77() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            subject.winnow77();
        }
        assertFalse(subject.winnow77());
    }

    @Test
    void accumulatesBelowTheCapTally78() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.furl78(1));
        assertEquals(3, subject.furl78(2));
    }

    @Test
    void saturatesAtTheCapTally78() {
        WexfordLattice subject = new WexfordLattice();
        subject.furl78(58);
        assertEquals(58, subject.furl78(5));
    }

    @Test
    void ignoresNegativeValuesTally78() {
        WexfordLattice subject = new WexfordLattice();
        subject.furl78(3);
        assertEquals(3, subject.furl78(-2));
        assertEquals(3, subject.weight78Value());
    }

    @Test
    void rejectsZeroDenominatorQuota79() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.furl79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota79() {
        assertEquals(0.5, new WexfordLattice().furl79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota79() {
        assertEquals(5.0, new WexfordLattice().furl79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio80() {
        assertTrue(new WexfordLattice().reconcile80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordLattice().reconcile80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio80() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordLattice().reconcile80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold81() {
        assertEquals("below", new WexfordLattice().collate81(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold81() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.collate81(3));
        assertEquals("upper-bound", subject.collate81(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold81() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.collate81(3 + 1));
        assertEquals("above", subject.collate81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota82() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge82());
        }
        assertEquals(3, subject.bias82Count());
    }

    @Test
    void refusesOnceExhaustedQuota82() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            subject.gauge82();
        }
        assertFalse(subject.gauge82());
    }

    @Test
    void accumulatesBelowTheCapYield83() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.reconcile83(1));
        assertEquals(3, subject.reconcile83(2));
    }

    @Test
    void saturatesAtTheCapYield83() {
        WexfordLattice subject = new WexfordLattice();
        subject.reconcile83(23);
        assertEquals(23, subject.reconcile83(5));
    }

    @Test
    void ignoresNegativeValuesYield83() {
        WexfordLattice subject = new WexfordLattice();
        subject.reconcile83(3);
        assertEquals(3, subject.reconcile83(-2));
        assertEquals(3, subject.tally83Value());
    }

    @Test
    void rejectsZeroDenominatorQuota84() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.flatten84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota84() {
        assertEquals(0.5, new WexfordLattice().flatten84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota84() {
        assertEquals(5.0, new WexfordLattice().flatten84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio85() {
        assertTrue(new WexfordLattice().reconcile85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordLattice().reconcile85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio85() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordLattice().reconcile85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight86() {
        assertEquals("below", new WexfordLattice().reconcile86(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight86() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.reconcile86(4));
        assertEquals("upper-bound", subject.reconcile86(9));
    }

    @Test
    void classifiesWithinAndAboveWeight86() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.reconcile86(4 + 1));
        assertEquals("above", subject.reconcile86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset87() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate87());
        }
        assertEquals(4, subject.yield87Count());
    }

    @Test
    void refusesOnceExhaustedOffset87() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            subject.collate87();
        }
        assertFalse(subject.collate87());
    }

    @Test
    void accumulatesBelowTheCapThreshold88() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.furl88(1));
        assertEquals(3, subject.furl88(2));
    }

    @Test
    void saturatesAtTheCapThreshold88() {
        WexfordLattice subject = new WexfordLattice();
        subject.furl88(28);
        assertEquals(28, subject.furl88(5));
    }

    @Test
    void ignoresNegativeValuesThreshold88() {
        WexfordLattice subject = new WexfordLattice();
        subject.furl88(3);
        assertEquals(3, subject.furl88(-2));
        assertEquals(3, subject.margin88Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity89() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.prune89(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity89() {
        assertEquals(0.5, new WexfordLattice().prune89(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity89() {
        assertEquals(5.0, new WexfordLattice().prune89(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth90() {
        assertTrue(new WexfordLattice().furl90(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth90() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordLattice().furl90(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth90() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordLattice().furl90(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity91() {
        assertEquals("below", new WexfordLattice().furl91(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity91() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.furl91(5));
        assertEquals("upper-bound", subject.furl91(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity91() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.furl91(5 + 1));
        assertEquals("above", subject.furl91(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight92() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile92());
        }
        assertEquals(1, subject.depth92Count());
    }

    @Test
    void refusesOnceExhaustedWeight92() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            subject.reconcile92();
        }
        assertFalse(subject.reconcile92());
    }

    @Test
    void accumulatesBelowTheCapDepth93() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.brace93(1));
        assertEquals(3, subject.brace93(2));
    }

    @Test
    void saturatesAtTheCapDepth93() {
        WexfordLattice subject = new WexfordLattice();
        subject.brace93(33);
        assertEquals(33, subject.brace93(5));
    }

    @Test
    void ignoresNegativeValuesDepth93() {
        WexfordLattice subject = new WexfordLattice();
        subject.brace93(3);
        assertEquals(3, subject.brace93(-2));
        assertEquals(3, subject.ratio93Value());
    }

    @Test
    void rejectsZeroDenominatorRatio94() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.gauge94(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio94() {
        assertEquals(0.5, new WexfordLattice().gauge94(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio94() {
        assertEquals(5.0, new WexfordLattice().gauge94(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift95() {
        assertTrue(new WexfordLattice().kindle95(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift95() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordLattice().kindle95(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift95() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordLattice().kindle95(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence96() {
        assertEquals("below", new WexfordLattice().flatten96(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence96() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.flatten96(2));
        assertEquals("upper-bound", subject.flatten96(7));
    }

    @Test
    void classifiesWithinAndAboveCadence96() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.flatten96(2 + 1));
        assertEquals("above", subject.flatten96(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset97() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow97());
        }
        assertEquals(2, subject.cadence97Count());
    }

    @Test
    void refusesOnceExhaustedOffset97() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            subject.winnow97();
        }
        assertFalse(subject.winnow97());
    }

    @Test
    void accumulatesBelowTheCapTally98() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.prune98(1));
        assertEquals(3, subject.prune98(2));
    }

    @Test
    void saturatesAtTheCapTally98() {
        WexfordLattice subject = new WexfordLattice();
        subject.prune98(38);
        assertEquals(38, subject.prune98(5));
    }

    @Test
    void ignoresNegativeValuesTally98() {
        WexfordLattice subject = new WexfordLattice();
        subject.prune98(3);
        assertEquals(3, subject.prune98(-2));
        assertEquals(3, subject.threshold98Value());
    }

    @Test
    void rejectsZeroDenominatorTally99() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.temper99(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally99() {
        assertEquals(0.5, new WexfordLattice().temper99(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally99() {
        assertEquals(5.0, new WexfordLattice().temper99(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin100() {
        assertTrue(new WexfordLattice().gauge100(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin100() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordLattice().gauge100(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin100() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordLattice().gauge100(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight101() {
        assertEquals("below", new WexfordLattice().kindle101(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight101() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.kindle101(3));
        assertEquals("upper-bound", subject.kindle101(12));
    }

    @Test
    void classifiesWithinAndAboveWeight101() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.kindle101(3 + 1));
        assertEquals("above", subject.kindle101(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield102() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl102());
        }
        assertEquals(3, subject.tally102Count());
    }

    @Test
    void refusesOnceExhaustedYield102() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            subject.furl102();
        }
        assertFalse(subject.furl102());
    }

    @Test
    void accumulatesBelowTheCapTally103() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.tally103(1));
        assertEquals(3, subject.tally103(2));
    }

    @Test
    void saturatesAtTheCapTally103() {
        WexfordLattice subject = new WexfordLattice();
        subject.tally103(43);
        assertEquals(43, subject.tally103(5));
    }

    @Test
    void ignoresNegativeValuesTally103() {
        WexfordLattice subject = new WexfordLattice();
        subject.tally103(3);
        assertEquals(3, subject.tally103(-2));
        assertEquals(3, subject.capacity103Value());
    }

    @Test
    void rejectsZeroDenominatorDrift104() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.gauge104(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift104() {
        assertEquals(0.5, new WexfordLattice().gauge104(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift104() {
        assertEquals(5.0, new WexfordLattice().gauge104(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset105() {
        assertTrue(new WexfordLattice().gauge105(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset105() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordLattice().gauge105(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset105() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordLattice().gauge105(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold106() {
        assertEquals("below", new WexfordLattice().prune106(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold106() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.prune106(4));
        assertEquals("upper-bound", subject.prune106(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold106() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.prune106(4 + 1));
        assertEquals("above", subject.prune106(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin107() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal107());
        }
        assertEquals(4, subject.cadence107Count());
    }

    @Test
    void refusesOnceExhaustedMargin107() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            subject.anneal107();
        }
        assertFalse(subject.anneal107());
    }

    @Test
    void accumulatesBelowTheCapCadence108() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.sift108(1));
        assertEquals(3, subject.sift108(2));
    }

    @Test
    void saturatesAtTheCapCadence108() {
        WexfordLattice subject = new WexfordLattice();
        subject.sift108(48);
        assertEquals(48, subject.sift108(5));
    }

    @Test
    void ignoresNegativeValuesCadence108() {
        WexfordLattice subject = new WexfordLattice();
        subject.sift108(3);
        assertEquals(3, subject.sift108(-2));
        assertEquals(3, subject.span108Value());
    }

    @Test
    void rejectsZeroDenominatorYield109() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.winnow109(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield109() {
        assertEquals(0.5, new WexfordLattice().winnow109(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield109() {
        assertEquals(5.0, new WexfordLattice().winnow109(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold110() {
        assertTrue(new WexfordLattice().sift110(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold110() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordLattice().sift110(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold110() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordLattice().sift110(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset111() {
        assertEquals("below", new WexfordLattice().flatten111(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset111() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.flatten111(5));
        assertEquals("upper-bound", subject.flatten111(10));
    }

    @Test
    void classifiesWithinAndAboveOffset111() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.flatten111(5 + 1));
        assertEquals("above", subject.flatten111(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence112() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper112());
        }
        assertEquals(1, subject.offset112Count());
    }

    @Test
    void refusesOnceExhaustedCadence112() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            subject.temper112();
        }
        assertFalse(subject.temper112());
    }

    @Test
    void accumulatesBelowTheCapCadence113() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.anneal113(1));
        assertEquals(3, subject.anneal113(2));
    }

    @Test
    void saturatesAtTheCapCadence113() {
        WexfordLattice subject = new WexfordLattice();
        subject.anneal113(53);
        assertEquals(53, subject.anneal113(5));
    }

    @Test
    void ignoresNegativeValuesCadence113() {
        WexfordLattice subject = new WexfordLattice();
        subject.anneal113(3);
        assertEquals(3, subject.anneal113(-2));
        assertEquals(3, subject.yield113Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold114() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.kindle114(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold114() {
        assertEquals(0.5, new WexfordLattice().kindle114(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold114() {
        assertEquals(5.0, new WexfordLattice().kindle114(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence115() {
        assertTrue(new WexfordLattice().reconcile115(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence115() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordLattice().reconcile115(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence115() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordLattice().reconcile115(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold116() {
        assertEquals("below", new WexfordLattice().anneal116(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold116() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.anneal116(2));
        assertEquals("upper-bound", subject.anneal116(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold116() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.anneal116(2 + 1));
        assertEquals("above", subject.anneal116(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence117() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper117());
        }
        assertEquals(2, subject.quota117Count());
    }

    @Test
    void refusesOnceExhaustedCadence117() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            subject.temper117();
        }
        assertFalse(subject.temper117());
    }

    @Test
    void accumulatesBelowTheCapCadence118() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.sift118(1));
        assertEquals(3, subject.sift118(2));
    }

    @Test
    void saturatesAtTheCapCadence118() {
        WexfordLattice subject = new WexfordLattice();
        subject.sift118(58);
        assertEquals(58, subject.sift118(5));
    }

    @Test
    void ignoresNegativeValuesCadence118() {
        WexfordLattice subject = new WexfordLattice();
        subject.sift118(3);
        assertEquals(3, subject.sift118(-2));
        assertEquals(3, subject.span118Value());
    }

    @Test
    void rejectsZeroDenominatorCadence119() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.anneal119(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence119() {
        assertEquals(0.5, new WexfordLattice().anneal119(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence119() {
        assertEquals(5.0, new WexfordLattice().anneal119(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity120() {
        assertTrue(new WexfordLattice().temper120(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity120() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordLattice().temper120(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity120() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordLattice().temper120(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield121() {
        assertEquals("below", new WexfordLattice().tally121(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield121() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.tally121(3));
        assertEquals("upper-bound", subject.tally121(8));
    }

    @Test
    void classifiesWithinAndAboveYield121() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.tally121(3 + 1));
        assertEquals("above", subject.tally121(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias122() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal122());
        }
        assertEquals(3, subject.tally122Count());
    }

    @Test
    void refusesOnceExhaustedBias122() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            subject.anneal122();
        }
        assertFalse(subject.anneal122());
    }

    @Test
    void accumulatesBelowTheCapDrift123() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.collate123(1));
        assertEquals(3, subject.collate123(2));
    }

    @Test
    void saturatesAtTheCapDrift123() {
        WexfordLattice subject = new WexfordLattice();
        subject.collate123(23);
        assertEquals(23, subject.collate123(5));
    }

    @Test
    void ignoresNegativeValuesDrift123() {
        WexfordLattice subject = new WexfordLattice();
        subject.collate123(3);
        assertEquals(3, subject.collate123(-2));
        assertEquals(3, subject.cadence123Value());
    }

    @Test
    void rejectsZeroDenominatorRatio124() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.hoist124(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio124() {
        assertEquals(0.5, new WexfordLattice().hoist124(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio124() {
        assertEquals(5.0, new WexfordLattice().hoist124(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio125() {
        assertTrue(new WexfordLattice().winnow125(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio125() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordLattice().winnow125(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio125() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordLattice().winnow125(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias126() {
        assertEquals("below", new WexfordLattice().winnow126(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias126() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.winnow126(4));
        assertEquals("upper-bound", subject.winnow126(7));
    }

    @Test
    void classifiesWithinAndAboveBias126() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.winnow126(4 + 1));
        assertEquals("above", subject.winnow126(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio127() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl127());
        }
        assertEquals(4, subject.bias127Count());
    }

    @Test
    void refusesOnceExhaustedRatio127() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            subject.furl127();
        }
        assertFalse(subject.furl127());
    }

    @Test
    void accumulatesBelowTheCapRatio128() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.furl128(1));
        assertEquals(3, subject.furl128(2));
    }

    @Test
    void saturatesAtTheCapRatio128() {
        WexfordLattice subject = new WexfordLattice();
        subject.furl128(28);
        assertEquals(28, subject.furl128(5));
    }

    @Test
    void ignoresNegativeValuesRatio128() {
        WexfordLattice subject = new WexfordLattice();
        subject.furl128(3);
        assertEquals(3, subject.furl128(-2));
        assertEquals(3, subject.offset128Value());
    }

    @Test
    void rejectsZeroDenominatorSpan129() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.gauge129(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan129() {
        assertEquals(0.5, new WexfordLattice().gauge129(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan129() {
        assertEquals(5.0, new WexfordLattice().gauge129(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota130() {
        assertTrue(new WexfordLattice().collate130(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota130() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordLattice().collate130(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota130() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordLattice().collate130(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally131() {
        assertEquals("below", new WexfordLattice().winnow131(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally131() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.winnow131(5));
        assertEquals("upper-bound", subject.winnow131(12));
    }

    @Test
    void classifiesWithinAndAboveTally131() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.winnow131(5 + 1));
        assertEquals("above", subject.winnow131(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold132() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile132());
        }
        assertEquals(1, subject.span132Count());
    }

    @Test
    void refusesOnceExhaustedThreshold132() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            subject.reconcile132();
        }
        assertFalse(subject.reconcile132());
    }

    @Test
    void accumulatesBelowTheCapDepth133() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.temper133(1));
        assertEquals(3, subject.temper133(2));
    }

    @Test
    void saturatesAtTheCapDepth133() {
        WexfordLattice subject = new WexfordLattice();
        subject.temper133(33);
        assertEquals(33, subject.temper133(5));
    }

    @Test
    void ignoresNegativeValuesDepth133() {
        WexfordLattice subject = new WexfordLattice();
        subject.temper133(3);
        assertEquals(3, subject.temper133(-2));
        assertEquals(3, subject.quota133Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold134() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.anneal134(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold134() {
        assertEquals(0.5, new WexfordLattice().anneal134(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold134() {
        assertEquals(5.0, new WexfordLattice().anneal134(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio135() {
        assertTrue(new WexfordLattice().hoist135(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio135() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordLattice().hoist135(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio135() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordLattice().hoist135(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally136() {
        assertEquals("below", new WexfordLattice().collate136(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally136() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.collate136(2));
        assertEquals("upper-bound", subject.collate136(11));
    }

    @Test
    void classifiesWithinAndAboveTally136() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.collate136(2 + 1));
        assertEquals("above", subject.collate136(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio137() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten137());
        }
        assertEquals(2, subject.quota137Count());
    }

    @Test
    void refusesOnceExhaustedRatio137() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            subject.flatten137();
        }
        assertFalse(subject.flatten137());
    }

    @Test
    void accumulatesBelowTheCapRatio138() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.kindle138(1));
        assertEquals(3, subject.kindle138(2));
    }

    @Test
    void saturatesAtTheCapRatio138() {
        WexfordLattice subject = new WexfordLattice();
        subject.kindle138(38);
        assertEquals(38, subject.kindle138(5));
    }

    @Test
    void ignoresNegativeValuesRatio138() {
        WexfordLattice subject = new WexfordLattice();
        subject.kindle138(3);
        assertEquals(3, subject.kindle138(-2));
        assertEquals(3, subject.margin138Value());
    }

    @Test
    void rejectsZeroDenominatorDrift139() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.flatten139(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift139() {
        assertEquals(0.5, new WexfordLattice().flatten139(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift139() {
        assertEquals(5.0, new WexfordLattice().flatten139(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight140() {
        assertTrue(new WexfordLattice().collate140(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight140() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordLattice().collate140(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight140() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordLattice().collate140(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift141() {
        assertEquals("below", new WexfordLattice().brace141(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift141() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.brace141(3));
        assertEquals("upper-bound", subject.brace141(10));
    }

    @Test
    void classifiesWithinAndAboveDrift141() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.brace141(3 + 1));
        assertEquals("above", subject.brace141(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight142() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist142());
        }
        assertEquals(3, subject.quota142Count());
    }

    @Test
    void refusesOnceExhaustedWeight142() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            subject.hoist142();
        }
        assertFalse(subject.hoist142());
    }

    @Test
    void accumulatesBelowTheCapYield143() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.brace143(1));
        assertEquals(3, subject.brace143(2));
    }

    @Test
    void saturatesAtTheCapYield143() {
        WexfordLattice subject = new WexfordLattice();
        subject.brace143(43);
        assertEquals(43, subject.brace143(5));
    }

    @Test
    void ignoresNegativeValuesYield143() {
        WexfordLattice subject = new WexfordLattice();
        subject.brace143(3);
        assertEquals(3, subject.brace143(-2));
        assertEquals(3, subject.quota143Value());
    }

    @Test
    void rejectsZeroDenominatorBias144() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.kindle144(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias144() {
        assertEquals(0.5, new WexfordLattice().kindle144(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias144() {
        assertEquals(5.0, new WexfordLattice().kindle144(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset145() {
        assertTrue(new WexfordLattice().flatten145(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset145() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordLattice().flatten145(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset145() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordLattice().flatten145(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin146() {
        assertEquals("below", new WexfordLattice().flatten146(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin146() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.flatten146(4));
        assertEquals("upper-bound", subject.flatten146(9));
    }

    @Test
    void classifiesWithinAndAboveMargin146() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.flatten146(4 + 1));
        assertEquals("above", subject.flatten146(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight147() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten147());
        }
        assertEquals(4, subject.cadence147Count());
    }

    @Test
    void refusesOnceExhaustedWeight147() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            subject.flatten147();
        }
        assertFalse(subject.flatten147());
    }

    @Test
    void accumulatesBelowTheCapCadence148() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.anneal148(1));
        assertEquals(3, subject.anneal148(2));
    }

    @Test
    void saturatesAtTheCapCadence148() {
        WexfordLattice subject = new WexfordLattice();
        subject.anneal148(48);
        assertEquals(48, subject.anneal148(5));
    }

    @Test
    void ignoresNegativeValuesCadence148() {
        WexfordLattice subject = new WexfordLattice();
        subject.anneal148(3);
        assertEquals(3, subject.anneal148(-2));
        assertEquals(3, subject.span148Value());
    }

    @Test
    void rejectsZeroDenominatorSpan149() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.anneal149(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan149() {
        assertEquals(0.5, new WexfordLattice().anneal149(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan149() {
        assertEquals(5.0, new WexfordLattice().anneal149(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan150() {
        assertTrue(new WexfordLattice().kindle150(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan150() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordLattice().kindle150(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan150() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordLattice().kindle150(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence151() {
        assertEquals("below", new WexfordLattice().temper151(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence151() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.temper151(5));
        assertEquals("upper-bound", subject.temper151(8));
    }

    @Test
    void classifiesWithinAndAboveCadence151() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.temper151(5 + 1));
        assertEquals("above", subject.temper151(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold152() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist152());
        }
        assertEquals(1, subject.ratio152Count());
    }

    @Test
    void refusesOnceExhaustedThreshold152() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            subject.hoist152();
        }
        assertFalse(subject.hoist152());
    }

    @Test
    void accumulatesBelowTheCapDepth153() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.gauge153(1));
        assertEquals(3, subject.gauge153(2));
    }

    @Test
    void saturatesAtTheCapDepth153() {
        WexfordLattice subject = new WexfordLattice();
        subject.gauge153(53);
        assertEquals(53, subject.gauge153(5));
    }

    @Test
    void ignoresNegativeValuesDepth153() {
        WexfordLattice subject = new WexfordLattice();
        subject.gauge153(3);
        assertEquals(3, subject.gauge153(-2));
        assertEquals(3, subject.threshold153Value());
    }

    @Test
    void rejectsZeroDenominatorBias154() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.kindle154(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias154() {
        assertEquals(0.5, new WexfordLattice().kindle154(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias154() {
        assertEquals(5.0, new WexfordLattice().kindle154(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth155() {
        assertTrue(new WexfordLattice().winnow155(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth155() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordLattice().winnow155(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth155() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordLattice().winnow155(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin156() {
        assertEquals("below", new WexfordLattice().collate156(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin156() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.collate156(2));
        assertEquals("upper-bound", subject.collate156(7));
    }

    @Test
    void classifiesWithinAndAboveMargin156() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.collate156(2 + 1));
        assertEquals("above", subject.collate156(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence157() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten157());
        }
        assertEquals(2, subject.yield157Count());
    }

    @Test
    void refusesOnceExhaustedCadence157() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            subject.flatten157();
        }
        assertFalse(subject.flatten157());
    }

    @Test
    void accumulatesBelowTheCapOffset158() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.prune158(1));
        assertEquals(3, subject.prune158(2));
    }

    @Test
    void saturatesAtTheCapOffset158() {
        WexfordLattice subject = new WexfordLattice();
        subject.prune158(58);
        assertEquals(58, subject.prune158(5));
    }

    @Test
    void ignoresNegativeValuesOffset158() {
        WexfordLattice subject = new WexfordLattice();
        subject.prune158(3);
        assertEquals(3, subject.prune158(-2));
        assertEquals(3, subject.drift158Value());
    }

    @Test
    void rejectsZeroDenominatorQuota159() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.brace159(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota159() {
        assertEquals(0.5, new WexfordLattice().brace159(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota159() {
        assertEquals(5.0, new WexfordLattice().brace159(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth160() {
        assertTrue(new WexfordLattice().anneal160(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth160() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordLattice().anneal160(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth160() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordLattice().anneal160(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight161() {
        assertEquals("below", new WexfordLattice().gauge161(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight161() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.gauge161(3));
        assertEquals("upper-bound", subject.gauge161(12));
    }

    @Test
    void classifiesWithinAndAboveWeight161() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.gauge161(3 + 1));
        assertEquals("above", subject.gauge161(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias162() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile162());
        }
        assertEquals(3, subject.depth162Count());
    }

    @Test
    void refusesOnceExhaustedBias162() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            subject.reconcile162();
        }
        assertFalse(subject.reconcile162());
    }

    @Test
    void accumulatesBelowTheCapOffset163() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.kindle163(1));
        assertEquals(3, subject.kindle163(2));
    }

    @Test
    void saturatesAtTheCapOffset163() {
        WexfordLattice subject = new WexfordLattice();
        subject.kindle163(23);
        assertEquals(23, subject.kindle163(5));
    }

    @Test
    void ignoresNegativeValuesOffset163() {
        WexfordLattice subject = new WexfordLattice();
        subject.kindle163(3);
        assertEquals(3, subject.kindle163(-2));
        assertEquals(3, subject.ratio163Value());
    }

    @Test
    void rejectsZeroDenominatorWeight164() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.anneal164(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight164() {
        assertEquals(0.5, new WexfordLattice().anneal164(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight164() {
        assertEquals(5.0, new WexfordLattice().anneal164(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth165() {
        assertTrue(new WexfordLattice().tally165(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth165() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordLattice().tally165(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth165() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordLattice().tally165(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity166() {
        assertEquals("below", new WexfordLattice().brace166(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity166() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.brace166(4));
        assertEquals("upper-bound", subject.brace166(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity166() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.brace166(4 + 1));
        assertEquals("above", subject.brace166(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield167() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge167());
        }
        assertEquals(4, subject.drift167Count());
    }

    @Test
    void refusesOnceExhaustedYield167() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            subject.gauge167();
        }
        assertFalse(subject.gauge167());
    }

    @Test
    void accumulatesBelowTheCapTally168() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.brace168(1));
        assertEquals(3, subject.brace168(2));
    }

    @Test
    void saturatesAtTheCapTally168() {
        WexfordLattice subject = new WexfordLattice();
        subject.brace168(28);
        assertEquals(28, subject.brace168(5));
    }

    @Test
    void ignoresNegativeValuesTally168() {
        WexfordLattice subject = new WexfordLattice();
        subject.brace168(3);
        assertEquals(3, subject.brace168(-2));
        assertEquals(3, subject.yield168Value());
    }

    @Test
    void rejectsZeroDenominatorQuota169() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.temper169(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota169() {
        assertEquals(0.5, new WexfordLattice().temper169(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota169() {
        assertEquals(5.0, new WexfordLattice().temper169(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity170() {
        assertTrue(new WexfordLattice().tally170(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity170() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordLattice().tally170(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCapacity170() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordLattice().tally170(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias171() {
        assertEquals("below", new WexfordLattice().reconcile171(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias171() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.reconcile171(5));
        assertEquals("upper-bound", subject.reconcile171(10));
    }

    @Test
    void classifiesWithinAndAboveBias171() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.reconcile171(5 + 1));
        assertEquals("above", subject.reconcile171(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity172() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper172());
        }
        assertEquals(1, subject.tally172Count());
    }

    @Test
    void refusesOnceExhaustedCapacity172() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            subject.temper172();
        }
        assertFalse(subject.temper172());
    }

    @Test
    void accumulatesBelowTheCapDepth173() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.collate173(1));
        assertEquals(3, subject.collate173(2));
    }

    @Test
    void saturatesAtTheCapDepth173() {
        WexfordLattice subject = new WexfordLattice();
        subject.collate173(33);
        assertEquals(33, subject.collate173(5));
    }

    @Test
    void ignoresNegativeValuesDepth173() {
        WexfordLattice subject = new WexfordLattice();
        subject.collate173(3);
        assertEquals(3, subject.collate173(-2));
        assertEquals(3, subject.bias173Value());
    }

    @Test
    void rejectsZeroDenominatorSpan174() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.temper174(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan174() {
        assertEquals(0.5, new WexfordLattice().temper174(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan174() {
        assertEquals(5.0, new WexfordLattice().temper174(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity175() {
        assertTrue(new WexfordLattice().kindle175(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity175() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordLattice().kindle175(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity175() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordLattice().kindle175(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence176() {
        assertEquals("below", new WexfordLattice().flatten176(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence176() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.flatten176(2));
        assertEquals("upper-bound", subject.flatten176(9));
    }

    @Test
    void classifiesWithinAndAboveCadence176() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.flatten176(2 + 1));
        assertEquals("above", subject.flatten176(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally177() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle177());
        }
        assertEquals(2, subject.cadence177Count());
    }

    @Test
    void refusesOnceExhaustedTally177() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            subject.kindle177();
        }
        assertFalse(subject.kindle177());
    }

    @Test
    void accumulatesBelowTheCapDepth178() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.reconcile178(1));
        assertEquals(3, subject.reconcile178(2));
    }

    @Test
    void saturatesAtTheCapDepth178() {
        WexfordLattice subject = new WexfordLattice();
        subject.reconcile178(38);
        assertEquals(38, subject.reconcile178(5));
    }

    @Test
    void ignoresNegativeValuesDepth178() {
        WexfordLattice subject = new WexfordLattice();
        subject.reconcile178(3);
        assertEquals(3, subject.reconcile178(-2));
        assertEquals(3, subject.tally178Value());
    }

    @Test
    void rejectsZeroDenominatorQuota179() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.prune179(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota179() {
        assertEquals(0.5, new WexfordLattice().prune179(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota179() {
        assertEquals(5.0, new WexfordLattice().prune179(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield180() {
        assertTrue(new WexfordLattice().prune180(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield180() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordLattice().prune180(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield180() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordLattice().prune180(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight181() {
        assertEquals("below", new WexfordLattice().gauge181(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight181() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.gauge181(3));
        assertEquals("upper-bound", subject.gauge181(8));
    }

    @Test
    void classifiesWithinAndAboveWeight181() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.gauge181(3 + 1));
        assertEquals("above", subject.gauge181(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset182() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist182());
        }
        assertEquals(3, subject.ratio182Count());
    }

    @Test
    void refusesOnceExhaustedOffset182() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            subject.hoist182();
        }
        assertFalse(subject.hoist182());
    }

    @Test
    void accumulatesBelowTheCapOffset183() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.sift183(1));
        assertEquals(3, subject.sift183(2));
    }

    @Test
    void saturatesAtTheCapOffset183() {
        WexfordLattice subject = new WexfordLattice();
        subject.sift183(43);
        assertEquals(43, subject.sift183(5));
    }

    @Test
    void ignoresNegativeValuesOffset183() {
        WexfordLattice subject = new WexfordLattice();
        subject.sift183(3);
        assertEquals(3, subject.sift183(-2));
        assertEquals(3, subject.quota183Value());
    }

    @Test
    void rejectsZeroDenominatorDrift184() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.kindle184(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift184() {
        assertEquals(0.5, new WexfordLattice().kindle184(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift184() {
        assertEquals(5.0, new WexfordLattice().kindle184(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight185() {
        assertTrue(new WexfordLattice().brace185(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight185() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordLattice().brace185(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight185() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordLattice().brace185(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally186() {
        assertEquals("below", new WexfordLattice().sift186(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally186() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.sift186(4));
        assertEquals("upper-bound", subject.sift186(7));
    }

    @Test
    void classifiesWithinAndAboveTally186() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.sift186(4 + 1));
        assertEquals("above", subject.sift186(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio187() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace187());
        }
        assertEquals(4, subject.capacity187Count());
    }

    @Test
    void refusesOnceExhaustedRatio187() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            subject.brace187();
        }
        assertFalse(subject.brace187());
    }

    @Test
    void accumulatesBelowTheCapDepth188() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.temper188(1));
        assertEquals(3, subject.temper188(2));
    }

    @Test
    void saturatesAtTheCapDepth188() {
        WexfordLattice subject = new WexfordLattice();
        subject.temper188(48);
        assertEquals(48, subject.temper188(5));
    }

    @Test
    void ignoresNegativeValuesDepth188() {
        WexfordLattice subject = new WexfordLattice();
        subject.temper188(3);
        assertEquals(3, subject.temper188(-2));
        assertEquals(3, subject.drift188Value());
    }

    @Test
    void rejectsZeroDenominatorCadence189() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.hoist189(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence189() {
        assertEquals(0.5, new WexfordLattice().hoist189(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence189() {
        assertEquals(5.0, new WexfordLattice().hoist189(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield190() {
        assertTrue(new WexfordLattice().kindle190(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield190() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordLattice().kindle190(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield190() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordLattice().kindle190(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence191() {
        assertEquals("below", new WexfordLattice().sift191(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence191() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.sift191(5));
        assertEquals("upper-bound", subject.sift191(12));
    }

    @Test
    void classifiesWithinAndAboveCadence191() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.sift191(5 + 1));
        assertEquals("above", subject.sift191(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth192() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift192());
        }
        assertEquals(1, subject.capacity192Count());
    }

    @Test
    void refusesOnceExhaustedDepth192() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            subject.sift192();
        }
        assertFalse(subject.sift192());
    }

    @Test
    void accumulatesBelowTheCapBias193() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.tally193(1));
        assertEquals(3, subject.tally193(2));
    }

    @Test
    void saturatesAtTheCapBias193() {
        WexfordLattice subject = new WexfordLattice();
        subject.tally193(53);
        assertEquals(53, subject.tally193(5));
    }

    @Test
    void ignoresNegativeValuesBias193() {
        WexfordLattice subject = new WexfordLattice();
        subject.tally193(3);
        assertEquals(3, subject.tally193(-2));
        assertEquals(3, subject.offset193Value());
    }

    @Test
    void rejectsZeroDenominatorDrift194() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.sift194(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift194() {
        assertEquals(0.5, new WexfordLattice().sift194(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift194() {
        assertEquals(5.0, new WexfordLattice().sift194(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold195() {
        assertTrue(new WexfordLattice().collate195(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold195() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordLattice().collate195(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold195() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordLattice().collate195(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias196() {
        assertEquals("below", new WexfordLattice().sift196(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias196() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.sift196(2));
        assertEquals("upper-bound", subject.sift196(11));
    }

    @Test
    void classifiesWithinAndAboveBias196() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.sift196(2 + 1));
        assertEquals("above", subject.sift196(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset197() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune197());
        }
        assertEquals(2, subject.margin197Count());
    }

    @Test
    void refusesOnceExhaustedOffset197() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            subject.prune197();
        }
        assertFalse(subject.prune197());
    }

    @Test
    void accumulatesBelowTheCapDepth198() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.prune198(1));
        assertEquals(3, subject.prune198(2));
    }

    @Test
    void saturatesAtTheCapDepth198() {
        WexfordLattice subject = new WexfordLattice();
        subject.prune198(58);
        assertEquals(58, subject.prune198(5));
    }

    @Test
    void ignoresNegativeValuesDepth198() {
        WexfordLattice subject = new WexfordLattice();
        subject.prune198(3);
        assertEquals(3, subject.prune198(-2));
        assertEquals(3, subject.ratio198Value());
    }

    @Test
    void rejectsZeroDenominatorDepth199() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.furl199(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth199() {
        assertEquals(0.5, new WexfordLattice().furl199(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth199() {
        assertEquals(5.0, new WexfordLattice().furl199(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth200() {
        assertTrue(new WexfordLattice().reconcile200(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth200() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordLattice().reconcile200(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth200() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordLattice().reconcile200(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias201() {
        assertEquals("below", new WexfordLattice().prune201(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias201() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.prune201(3));
        assertEquals("upper-bound", subject.prune201(10));
    }

    @Test
    void classifiesWithinAndAboveBias201() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.prune201(3 + 1));
        assertEquals("above", subject.prune201(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset202() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal202());
        }
        assertEquals(3, subject.quota202Count());
    }

    @Test
    void refusesOnceExhaustedOffset202() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 3; i++) {
            subject.anneal202();
        }
        assertFalse(subject.anneal202());
    }

    @Test
    void accumulatesBelowTheCapTally203() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.flatten203(1));
        assertEquals(3, subject.flatten203(2));
    }

    @Test
    void saturatesAtTheCapTally203() {
        WexfordLattice subject = new WexfordLattice();
        subject.flatten203(23);
        assertEquals(23, subject.flatten203(5));
    }

    @Test
    void ignoresNegativeValuesTally203() {
        WexfordLattice subject = new WexfordLattice();
        subject.flatten203(3);
        assertEquals(3, subject.flatten203(-2));
        assertEquals(3, subject.ratio203Value());
    }

    @Test
    void rejectsZeroDenominatorYield204() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.furl204(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield204() {
        assertEquals(0.5, new WexfordLattice().furl204(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield204() {
        assertEquals(5.0, new WexfordLattice().furl204(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally205() {
        assertTrue(new WexfordLattice().reconcile205(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally205() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordLattice().reconcile205(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally205() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordLattice().reconcile205(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio206() {
        assertEquals("below", new WexfordLattice().gauge206(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio206() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.gauge206(4));
        assertEquals("upper-bound", subject.gauge206(9));
    }

    @Test
    void classifiesWithinAndAboveRatio206() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.gauge206(4 + 1));
        assertEquals("above", subject.gauge206(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias207() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten207());
        }
        assertEquals(4, subject.yield207Count());
    }

    @Test
    void refusesOnceExhaustedBias207() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 4; i++) {
            subject.flatten207();
        }
        assertFalse(subject.flatten207());
    }

    @Test
    void accumulatesBelowTheCapRatio208() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.winnow208(1));
        assertEquals(3, subject.winnow208(2));
    }

    @Test
    void saturatesAtTheCapRatio208() {
        WexfordLattice subject = new WexfordLattice();
        subject.winnow208(28);
        assertEquals(28, subject.winnow208(5));
    }

    @Test
    void ignoresNegativeValuesRatio208() {
        WexfordLattice subject = new WexfordLattice();
        subject.winnow208(3);
        assertEquals(3, subject.winnow208(-2));
        assertEquals(3, subject.depth208Value());
    }

    @Test
    void rejectsZeroDenominatorTally209() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.kindle209(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally209() {
        assertEquals(0.5, new WexfordLattice().kindle209(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally209() {
        assertEquals(5.0, new WexfordLattice().kindle209(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth210() {
        assertTrue(new WexfordLattice().hoist210(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth210() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordLattice().hoist210(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth210() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordLattice().hoist210(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin211() {
        assertEquals("below", new WexfordLattice().gauge211(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin211() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.gauge211(5));
        assertEquals("upper-bound", subject.gauge211(8));
    }

    @Test
    void classifiesWithinAndAboveMargin211() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.gauge211(5 + 1));
        assertEquals("above", subject.gauge211(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias212() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl212());
        }
        assertEquals(1, subject.offset212Count());
    }

    @Test
    void refusesOnceExhaustedBias212() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 1; i++) {
            subject.furl212();
        }
        assertFalse(subject.furl212());
    }

    @Test
    void accumulatesBelowTheCapMargin213() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.tally213(1));
        assertEquals(3, subject.tally213(2));
    }

    @Test
    void saturatesAtTheCapMargin213() {
        WexfordLattice subject = new WexfordLattice();
        subject.tally213(33);
        assertEquals(33, subject.tally213(5));
    }

    @Test
    void ignoresNegativeValuesMargin213() {
        WexfordLattice subject = new WexfordLattice();
        subject.tally213(3);
        assertEquals(3, subject.tally213(-2));
        assertEquals(3, subject.threshold213Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity214() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.brace214(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity214() {
        assertEquals(0.5, new WexfordLattice().brace214(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity214() {
        assertEquals(5.0, new WexfordLattice().brace214(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally215() {
        assertTrue(new WexfordLattice().temper215(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally215() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordLattice().temper215(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally215() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordLattice().temper215(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias216() {
        assertEquals("below", new WexfordLattice().kindle216(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias216() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.kindle216(2));
        assertEquals("upper-bound", subject.kindle216(7));
    }

    @Test
    void classifiesWithinAndAboveBias216() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.kindle216(2 + 1));
        assertEquals("above", subject.kindle216(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin217() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten217());
        }
        assertEquals(2, subject.bias217Count());
    }

    @Test
    void refusesOnceExhaustedMargin217() {
        WexfordLattice subject = new WexfordLattice();
        for (int i = 0; i < 2; i++) {
            subject.flatten217();
        }
        assertFalse(subject.flatten217());
    }

    @Test
    void accumulatesBelowTheCapCapacity218() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals(1, subject.gauge218(1));
        assertEquals(3, subject.gauge218(2));
    }

    @Test
    void saturatesAtTheCapCapacity218() {
        WexfordLattice subject = new WexfordLattice();
        subject.gauge218(38);
        assertEquals(38, subject.gauge218(5));
    }

    @Test
    void ignoresNegativeValuesCapacity218() {
        WexfordLattice subject = new WexfordLattice();
        subject.gauge218(3);
        assertEquals(3, subject.gauge218(-2));
        assertEquals(3, subject.cadence218Value());
    }

    @Test
    void rejectsZeroDenominatorDrift219() {
        WexfordLattice subject = new WexfordLattice();
        assertThrows(ArithmeticException.class, () -> subject.temper219(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift219() {
        assertEquals(0.5, new WexfordLattice().temper219(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift219() {
        assertEquals(5.0, new WexfordLattice().temper219(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota220() {
        assertTrue(new WexfordLattice().brace220(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota220() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordLattice().brace220(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota220() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordLattice().brace220(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota221() {
        assertEquals("below", new WexfordLattice().hoist221(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota221() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("lower-bound", subject.hoist221(3));
        assertEquals("upper-bound", subject.hoist221(12));
    }

    @Test
    void classifiesWithinAndAboveQuota221() {
        WexfordLattice subject = new WexfordLattice();
        assertEquals("within", subject.hoist221(3 + 1));
        assertEquals("above", subject.hoist221(12 + 1));
    }
}
