package com.copper.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidPylonTest {

    @Test
    void classifiesBelowTheLowerBoundDepth0() {
        assertEquals("below", new PallidPylon().winnow0(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth0() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.winnow0(2));
        assertEquals("upper-bound", subject.winnow0(7));
    }

    @Test
    void classifiesWithinAndAboveDepth0() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.winnow0(2 + 1));
        assertEquals("above", subject.winnow0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity1() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper1());
        }
        assertEquals(2, subject.quota1Count());
    }

    @Test
    void refusesOnceExhaustedCapacity1() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 2; i++) {
            subject.temper1();
        }
        assertFalse(subject.temper1());
    }

    @Test
    void accumulatesBelowTheCapTally2() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.temper2(1));
        assertEquals(3, subject.temper2(2));
    }

    @Test
    void saturatesAtTheCapTally2() {
        PallidPylon subject = new PallidPylon();
        subject.temper2(22);
        assertEquals(22, subject.temper2(5));
    }

    @Test
    void ignoresNegativeValuesTally2() {
        PallidPylon subject = new PallidPylon();
        subject.temper2(3);
        assertEquals(3, subject.temper2(-2));
        assertEquals(3, subject.bias2Value());
    }

    @Test
    void rejectsZeroDenominatorQuota3() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.collate3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota3() {
        assertEquals(0.5, new PallidPylon().collate3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota3() {
        assertEquals(4.0, new PallidPylon().collate3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity4() {
        assertTrue(new PallidPylon().temper4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new PallidPylon().temper4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity4() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidPylon().temper4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias5() {
        assertEquals("below", new PallidPylon().prune5(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias5() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.prune5(3));
        assertEquals("upper-bound", subject.prune5(12));
    }

    @Test
    void classifiesWithinAndAboveBias5() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.prune5(3 + 1));
        assertEquals("above", subject.prune5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan6() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate6());
        }
        assertEquals(3, subject.bias6Count());
    }

    @Test
    void refusesOnceExhaustedSpan6() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 3; i++) {
            subject.collate6();
        }
        assertFalse(subject.collate6());
    }

    @Test
    void accumulatesBelowTheCapDepth7() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.prune7(1));
        assertEquals(3, subject.prune7(2));
    }

    @Test
    void saturatesAtTheCapDepth7() {
        PallidPylon subject = new PallidPylon();
        subject.prune7(27);
        assertEquals(27, subject.prune7(5));
    }

    @Test
    void ignoresNegativeValuesDepth7() {
        PallidPylon subject = new PallidPylon();
        subject.prune7(3);
        assertEquals(3, subject.prune7(-2));
        assertEquals(3, subject.bias7Value());
    }

    @Test
    void rejectsZeroDenominatorRatio8() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.kindle8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio8() {
        assertEquals(0.5, new PallidPylon().kindle8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio8() {
        assertEquals(4.0, new PallidPylon().kindle8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset9() {
        assertTrue(new PallidPylon().kindle9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new PallidPylon().kindle9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset9() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidPylon().kindle9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin10() {
        assertEquals("below", new PallidPylon().furl10(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin10() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.furl10(4));
        assertEquals("upper-bound", subject.furl10(11));
    }

    @Test
    void classifiesWithinAndAboveMargin10() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.furl10(4 + 1));
        assertEquals("above", subject.furl10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally11() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow11());
        }
        assertEquals(4, subject.weight11Count());
    }

    @Test
    void refusesOnceExhaustedTally11() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 4; i++) {
            subject.winnow11();
        }
        assertFalse(subject.winnow11());
    }

    @Test
    void accumulatesBelowTheCapWeight12() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.gauge12(1));
        assertEquals(3, subject.gauge12(2));
    }

    @Test
    void saturatesAtTheCapWeight12() {
        PallidPylon subject = new PallidPylon();
        subject.gauge12(32);
        assertEquals(32, subject.gauge12(5));
    }

    @Test
    void ignoresNegativeValuesWeight12() {
        PallidPylon subject = new PallidPylon();
        subject.gauge12(3);
        assertEquals(3, subject.gauge12(-2));
        assertEquals(3, subject.span12Value());
    }

    @Test
    void rejectsZeroDenominatorDrift13() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.furl13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift13() {
        assertEquals(0.5, new PallidPylon().furl13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift13() {
        assertEquals(4.0, new PallidPylon().furl13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold14() {
        assertTrue(new PallidPylon().hoist14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new PallidPylon().hoist14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold14() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidPylon().hoist14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally15() {
        assertEquals("below", new PallidPylon().winnow15(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally15() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.winnow15(5));
        assertEquals("upper-bound", subject.winnow15(10));
    }

    @Test
    void classifiesWithinAndAboveTally15() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.winnow15(5 + 1));
        assertEquals("above", subject.winnow15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias16() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow16());
        }
        assertEquals(1, subject.yield16Count());
    }

    @Test
    void refusesOnceExhaustedBias16() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 1; i++) {
            subject.winnow16();
        }
        assertFalse(subject.winnow16());
    }

    @Test
    void accumulatesBelowTheCapSpan17() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.temper17(1));
        assertEquals(3, subject.temper17(2));
    }

    @Test
    void saturatesAtTheCapSpan17() {
        PallidPylon subject = new PallidPylon();
        subject.temper17(37);
        assertEquals(37, subject.temper17(5));
    }

    @Test
    void ignoresNegativeValuesSpan17() {
        PallidPylon subject = new PallidPylon();
        subject.temper17(3);
        assertEquals(3, subject.temper17(-2));
        assertEquals(3, subject.depth17Value());
    }

    @Test
    void rejectsZeroDenominatorRatio18() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.winnow18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio18() {
        assertEquals(0.5, new PallidPylon().winnow18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio18() {
        assertEquals(4.0, new PallidPylon().winnow18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset19() {
        assertTrue(new PallidPylon().anneal19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new PallidPylon().anneal19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset19() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidPylon().anneal19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold20() {
        assertEquals("below", new PallidPylon().sift20(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold20() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.sift20(2));
        assertEquals("upper-bound", subject.sift20(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold20() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.sift20(2 + 1));
        assertEquals("above", subject.sift20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence21() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist21());
        }
        assertEquals(2, subject.offset21Count());
    }

    @Test
    void refusesOnceExhaustedCadence21() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 2; i++) {
            subject.hoist21();
        }
        assertFalse(subject.hoist21());
    }

    @Test
    void accumulatesBelowTheCapWeight22() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.collate22(1));
        assertEquals(3, subject.collate22(2));
    }

    @Test
    void saturatesAtTheCapWeight22() {
        PallidPylon subject = new PallidPylon();
        subject.collate22(42);
        assertEquals(42, subject.collate22(5));
    }

    @Test
    void ignoresNegativeValuesWeight22() {
        PallidPylon subject = new PallidPylon();
        subject.collate22(3);
        assertEquals(3, subject.collate22(-2));
        assertEquals(3, subject.drift22Value());
    }

    @Test
    void rejectsZeroDenominatorMargin23() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin23() {
        assertEquals(0.5, new PallidPylon().reconcile23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin23() {
        assertEquals(4.0, new PallidPylon().reconcile23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias24() {
        assertTrue(new PallidPylon().tally24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new PallidPylon().tally24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias24() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidPylon().tally24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight25() {
        assertEquals("below", new PallidPylon().kindle25(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight25() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.kindle25(3));
        assertEquals("upper-bound", subject.kindle25(8));
    }

    @Test
    void classifiesWithinAndAboveWeight25() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.kindle25(3 + 1));
        assertEquals("above", subject.kindle25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight26() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune26());
        }
        assertEquals(3, subject.quota26Count());
    }

    @Test
    void refusesOnceExhaustedWeight26() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 3; i++) {
            subject.prune26();
        }
        assertFalse(subject.prune26());
    }

    @Test
    void accumulatesBelowTheCapDepth27() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.brace27(1));
        assertEquals(3, subject.brace27(2));
    }

    @Test
    void saturatesAtTheCapDepth27() {
        PallidPylon subject = new PallidPylon();
        subject.brace27(47);
        assertEquals(47, subject.brace27(5));
    }

    @Test
    void ignoresNegativeValuesDepth27() {
        PallidPylon subject = new PallidPylon();
        subject.brace27(3);
        assertEquals(3, subject.brace27(-2));
        assertEquals(3, subject.weight27Value());
    }

    @Test
    void rejectsZeroDenominatorRatio28() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio28() {
        assertEquals(0.5, new PallidPylon().reconcile28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio28() {
        assertEquals(4.0, new PallidPylon().reconcile28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity29() {
        assertTrue(new PallidPylon().collate29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new PallidPylon().collate29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity29() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidPylon().collate29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield30() {
        assertEquals("below", new PallidPylon().hoist30(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield30() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.hoist30(4));
        assertEquals("upper-bound", subject.hoist30(7));
    }

    @Test
    void classifiesWithinAndAboveYield30() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.hoist30(4 + 1));
        assertEquals("above", subject.hoist30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield31() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal31());
        }
        assertEquals(4, subject.bias31Count());
    }

    @Test
    void refusesOnceExhaustedYield31() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 4; i++) {
            subject.anneal31();
        }
        assertFalse(subject.anneal31());
    }

    @Test
    void accumulatesBelowTheCapSpan32() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.sift32(1));
        assertEquals(3, subject.sift32(2));
    }

    @Test
    void saturatesAtTheCapSpan32() {
        PallidPylon subject = new PallidPylon();
        subject.sift32(52);
        assertEquals(52, subject.sift32(5));
    }

    @Test
    void ignoresNegativeValuesSpan32() {
        PallidPylon subject = new PallidPylon();
        subject.sift32(3);
        assertEquals(3, subject.sift32(-2));
        assertEquals(3, subject.bias32Value());
    }

    @Test
    void rejectsZeroDenominatorRatio33() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.reconcile33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio33() {
        assertEquals(0.5, new PallidPylon().reconcile33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio33() {
        assertEquals(4.0, new PallidPylon().reconcile33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth34() {
        assertTrue(new PallidPylon().sift34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new PallidPylon().sift34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth34() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidPylon().sift34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota35() {
        assertEquals("below", new PallidPylon().tally35(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota35() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.tally35(5));
        assertEquals("upper-bound", subject.tally35(12));
    }

    @Test
    void classifiesWithinAndAboveQuota35() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.tally35(5 + 1));
        assertEquals("above", subject.tally35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally36() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate36());
        }
        assertEquals(1, subject.bias36Count());
    }

    @Test
    void refusesOnceExhaustedTally36() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 1; i++) {
            subject.collate36();
        }
        assertFalse(subject.collate36());
    }

    @Test
    void accumulatesBelowTheCapOffset37() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.hoist37(1));
        assertEquals(3, subject.hoist37(2));
    }

    @Test
    void saturatesAtTheCapOffset37() {
        PallidPylon subject = new PallidPylon();
        subject.hoist37(57);
        assertEquals(57, subject.hoist37(5));
    }

    @Test
    void ignoresNegativeValuesOffset37() {
        PallidPylon subject = new PallidPylon();
        subject.hoist37(3);
        assertEquals(3, subject.hoist37(-2));
        assertEquals(3, subject.yield37Value());
    }

    @Test
    void rejectsZeroDenominatorDepth38() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.flatten38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth38() {
        assertEquals(0.5, new PallidPylon().flatten38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth38() {
        assertEquals(4.0, new PallidPylon().flatten38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight39() {
        assertTrue(new PallidPylon().temper39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new PallidPylon().temper39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight39() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidPylon().temper39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity40() {
        assertEquals("below", new PallidPylon().prune40(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity40() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.prune40(2));
        assertEquals("upper-bound", subject.prune40(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity40() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.prune40(2 + 1));
        assertEquals("above", subject.prune40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift41() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace41());
        }
        assertEquals(2, subject.threshold41Count());
    }

    @Test
    void refusesOnceExhaustedDrift41() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 2; i++) {
            subject.brace41();
        }
        assertFalse(subject.brace41());
    }

    @Test
    void accumulatesBelowTheCapBias42() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.prune42(1));
        assertEquals(3, subject.prune42(2));
    }

    @Test
    void saturatesAtTheCapBias42() {
        PallidPylon subject = new PallidPylon();
        subject.prune42(22);
        assertEquals(22, subject.prune42(5));
    }

    @Test
    void ignoresNegativeValuesBias42() {
        PallidPylon subject = new PallidPylon();
        subject.prune42(3);
        assertEquals(3, subject.prune42(-2));
        assertEquals(3, subject.quota42Value());
    }

    @Test
    void rejectsZeroDenominatorSpan43() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan43() {
        assertEquals(0.5, new PallidPylon().temper43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan43() {
        assertEquals(4.0, new PallidPylon().temper43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield44() {
        assertTrue(new PallidPylon().prune44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new PallidPylon().prune44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield44() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidPylon().prune44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally45() {
        assertEquals("below", new PallidPylon().temper45(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally45() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.temper45(3));
        assertEquals("upper-bound", subject.temper45(10));
    }

    @Test
    void classifiesWithinAndAboveTally45() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.temper45(3 + 1));
        assertEquals("above", subject.temper45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset46() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl46());
        }
        assertEquals(3, subject.cadence46Count());
    }

    @Test
    void refusesOnceExhaustedOffset46() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 3; i++) {
            subject.furl46();
        }
        assertFalse(subject.furl46());
    }

    @Test
    void accumulatesBelowTheCapDrift47() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.brace47(1));
        assertEquals(3, subject.brace47(2));
    }

    @Test
    void saturatesAtTheCapDrift47() {
        PallidPylon subject = new PallidPylon();
        subject.brace47(27);
        assertEquals(27, subject.brace47(5));
    }

    @Test
    void ignoresNegativeValuesDrift47() {
        PallidPylon subject = new PallidPylon();
        subject.brace47(3);
        assertEquals(3, subject.brace47(-2));
        assertEquals(3, subject.bias47Value());
    }

    @Test
    void rejectsZeroDenominatorRatio48() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.prune48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio48() {
        assertEquals(0.5, new PallidPylon().prune48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio48() {
        assertEquals(4.0, new PallidPylon().prune48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight49() {
        assertTrue(new PallidPylon().furl49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new PallidPylon().furl49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight49() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidPylon().furl49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity50() {
        assertEquals("below", new PallidPylon().sift50(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity50() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.sift50(4));
        assertEquals("upper-bound", subject.sift50(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity50() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.sift50(4 + 1));
        assertEquals("above", subject.sift50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth51() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate51());
        }
        assertEquals(4, subject.yield51Count());
    }

    @Test
    void refusesOnceExhaustedDepth51() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 4; i++) {
            subject.collate51();
        }
        assertFalse(subject.collate51());
    }

    @Test
    void accumulatesBelowTheCapSpan52() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.prune52(1));
        assertEquals(3, subject.prune52(2));
    }

    @Test
    void saturatesAtTheCapSpan52() {
        PallidPylon subject = new PallidPylon();
        subject.prune52(32);
        assertEquals(32, subject.prune52(5));
    }

    @Test
    void ignoresNegativeValuesSpan52() {
        PallidPylon subject = new PallidPylon();
        subject.prune52(3);
        assertEquals(3, subject.prune52(-2));
        assertEquals(3, subject.yield52Value());
    }

    @Test
    void rejectsZeroDenominatorTally53() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.furl53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally53() {
        assertEquals(0.5, new PallidPylon().furl53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally53() {
        assertEquals(4.0, new PallidPylon().furl53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota54() {
        assertTrue(new PallidPylon().flatten54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new PallidPylon().flatten54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota54() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidPylon().flatten54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield55() {
        assertEquals("below", new PallidPylon().winnow55(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield55() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.winnow55(5));
        assertEquals("upper-bound", subject.winnow55(8));
    }

    @Test
    void classifiesWithinAndAboveYield55() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.winnow55(5 + 1));
        assertEquals("above", subject.winnow55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold56() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl56());
        }
        assertEquals(1, subject.span56Count());
    }

    @Test
    void refusesOnceExhaustedThreshold56() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 1; i++) {
            subject.furl56();
        }
        assertFalse(subject.furl56());
    }

    @Test
    void accumulatesBelowTheCapQuota57() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.sift57(1));
        assertEquals(3, subject.sift57(2));
    }

    @Test
    void saturatesAtTheCapQuota57() {
        PallidPylon subject = new PallidPylon();
        subject.sift57(37);
        assertEquals(37, subject.sift57(5));
    }

    @Test
    void ignoresNegativeValuesQuota57() {
        PallidPylon subject = new PallidPylon();
        subject.sift57(3);
        assertEquals(3, subject.sift57(-2));
        assertEquals(3, subject.depth57Value());
    }

    @Test
    void rejectsZeroDenominatorMargin58() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.sift58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin58() {
        assertEquals(0.5, new PallidPylon().sift58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin58() {
        assertEquals(4.0, new PallidPylon().sift58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio59() {
        assertTrue(new PallidPylon().anneal59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new PallidPylon().anneal59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio59() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidPylon().anneal59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth60() {
        assertEquals("below", new PallidPylon().anneal60(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth60() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.anneal60(2));
        assertEquals("upper-bound", subject.anneal60(7));
    }

    @Test
    void classifiesWithinAndAboveDepth60() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.anneal60(2 + 1));
        assertEquals("above", subject.anneal60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence61() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace61());
        }
        assertEquals(2, subject.weight61Count());
    }

    @Test
    void refusesOnceExhaustedCadence61() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 2; i++) {
            subject.brace61();
        }
        assertFalse(subject.brace61());
    }

    @Test
    void accumulatesBelowTheCapMargin62() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.kindle62(1));
        assertEquals(3, subject.kindle62(2));
    }

    @Test
    void saturatesAtTheCapMargin62() {
        PallidPylon subject = new PallidPylon();
        subject.kindle62(42);
        assertEquals(42, subject.kindle62(5));
    }

    @Test
    void ignoresNegativeValuesMargin62() {
        PallidPylon subject = new PallidPylon();
        subject.kindle62(3);
        assertEquals(3, subject.kindle62(-2));
        assertEquals(3, subject.weight62Value());
    }

    @Test
    void rejectsZeroDenominatorRatio63() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio63() {
        assertEquals(0.5, new PallidPylon().temper63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio63() {
        assertEquals(4.0, new PallidPylon().temper63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally64() {
        assertTrue(new PallidPylon().sift64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new PallidPylon().sift64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally64() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidPylon().sift64(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota65() {
        assertEquals("below", new PallidPylon().collate65(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota65() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.collate65(3));
        assertEquals("upper-bound", subject.collate65(12));
    }

    @Test
    void classifiesWithinAndAboveQuota65() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.collate65(3 + 1));
        assertEquals("above", subject.collate65(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold66() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl66());
        }
        assertEquals(3, subject.bias66Count());
    }

    @Test
    void refusesOnceExhaustedThreshold66() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 3; i++) {
            subject.furl66();
        }
        assertFalse(subject.furl66());
    }

    @Test
    void accumulatesBelowTheCapDepth67() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.brace67(1));
        assertEquals(3, subject.brace67(2));
    }

    @Test
    void saturatesAtTheCapDepth67() {
        PallidPylon subject = new PallidPylon();
        subject.brace67(47);
        assertEquals(47, subject.brace67(5));
    }

    @Test
    void ignoresNegativeValuesDepth67() {
        PallidPylon subject = new PallidPylon();
        subject.brace67(3);
        assertEquals(3, subject.brace67(-2));
        assertEquals(3, subject.ratio67Value());
    }

    @Test
    void rejectsZeroDenominatorYield68() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist68(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield68() {
        assertEquals(0.5, new PallidPylon().hoist68(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield68() {
        assertEquals(4.0, new PallidPylon().hoist68(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity69() {
        assertTrue(new PallidPylon().flatten69(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity69() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new PallidPylon().flatten69(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity69() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidPylon().flatten69(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota70() {
        assertEquals("below", new PallidPylon().collate70(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota70() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.collate70(4));
        assertEquals("upper-bound", subject.collate70(11));
    }

    @Test
    void classifiesWithinAndAboveQuota70() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.collate70(4 + 1));
        assertEquals("above", subject.collate70(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence71() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile71());
        }
        assertEquals(4, subject.offset71Count());
    }

    @Test
    void refusesOnceExhaustedCadence71() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 4; i++) {
            subject.reconcile71();
        }
        assertFalse(subject.reconcile71());
    }

    @Test
    void accumulatesBelowTheCapTally72() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.hoist72(1));
        assertEquals(3, subject.hoist72(2));
    }

    @Test
    void saturatesAtTheCapTally72() {
        PallidPylon subject = new PallidPylon();
        subject.hoist72(52);
        assertEquals(52, subject.hoist72(5));
    }

    @Test
    void ignoresNegativeValuesTally72() {
        PallidPylon subject = new PallidPylon();
        subject.hoist72(3);
        assertEquals(3, subject.hoist72(-2));
        assertEquals(3, subject.weight72Value());
    }

    @Test
    void rejectsZeroDenominatorTally73() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist73(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally73() {
        assertEquals(0.5, new PallidPylon().hoist73(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally73() {
        assertEquals(4.0, new PallidPylon().hoist73(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally74() {
        assertTrue(new PallidPylon().hoist74(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally74() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new PallidPylon().hoist74(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally74() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidPylon().hoist74(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan75() {
        assertEquals("below", new PallidPylon().furl75(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan75() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.furl75(5));
        assertEquals("upper-bound", subject.furl75(10));
    }

    @Test
    void classifiesWithinAndAboveSpan75() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.furl75(5 + 1));
        assertEquals("above", subject.furl75(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight76() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal76());
        }
        assertEquals(1, subject.capacity76Count());
    }

    @Test
    void refusesOnceExhaustedWeight76() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 1; i++) {
            subject.anneal76();
        }
        assertFalse(subject.anneal76());
    }

    @Test
    void accumulatesBelowTheCapQuota77() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.reconcile77(1));
        assertEquals(3, subject.reconcile77(2));
    }

    @Test
    void saturatesAtTheCapQuota77() {
        PallidPylon subject = new PallidPylon();
        subject.reconcile77(57);
        assertEquals(57, subject.reconcile77(5));
    }

    @Test
    void ignoresNegativeValuesQuota77() {
        PallidPylon subject = new PallidPylon();
        subject.reconcile77(3);
        assertEquals(3, subject.reconcile77(-2));
        assertEquals(3, subject.bias77Value());
    }

    @Test
    void rejectsZeroDenominatorBias78() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.sift78(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias78() {
        assertEquals(0.5, new PallidPylon().sift78(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias78() {
        assertEquals(4.0, new PallidPylon().sift78(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio79() {
        assertTrue(new PallidPylon().gauge79(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio79() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new PallidPylon().gauge79(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio79() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidPylon().gauge79(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio80() {
        assertEquals("below", new PallidPylon().winnow80(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio80() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.winnow80(2));
        assertEquals("upper-bound", subject.winnow80(9));
    }

    @Test
    void classifiesWithinAndAboveRatio80() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.winnow80(2 + 1));
        assertEquals("above", subject.winnow80(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias81() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle81());
        }
        assertEquals(2, subject.span81Count());
    }

    @Test
    void refusesOnceExhaustedBias81() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 2; i++) {
            subject.kindle81();
        }
        assertFalse(subject.kindle81());
    }

    @Test
    void accumulatesBelowTheCapDrift82() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.brace82(1));
        assertEquals(3, subject.brace82(2));
    }

    @Test
    void saturatesAtTheCapDrift82() {
        PallidPylon subject = new PallidPylon();
        subject.brace82(22);
        assertEquals(22, subject.brace82(5));
    }

    @Test
    void ignoresNegativeValuesDrift82() {
        PallidPylon subject = new PallidPylon();
        subject.brace82(3);
        assertEquals(3, subject.brace82(-2));
        assertEquals(3, subject.weight82Value());
    }

    @Test
    void rejectsZeroDenominatorBias83() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist83(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias83() {
        assertEquals(0.5, new PallidPylon().hoist83(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias83() {
        assertEquals(4.0, new PallidPylon().hoist83(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield84() {
        assertTrue(new PallidPylon().winnow84(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield84() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new PallidPylon().winnow84(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield84() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidPylon().winnow84(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift85() {
        assertEquals("below", new PallidPylon().furl85(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift85() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.furl85(3));
        assertEquals("upper-bound", subject.furl85(8));
    }

    @Test
    void classifiesWithinAndAboveDrift85() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.furl85(3 + 1));
        assertEquals("above", subject.furl85(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold86() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle86());
        }
        assertEquals(3, subject.capacity86Count());
    }

    @Test
    void refusesOnceExhaustedThreshold86() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 3; i++) {
            subject.kindle86();
        }
        assertFalse(subject.kindle86());
    }

    @Test
    void accumulatesBelowTheCapSpan87() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.hoist87(1));
        assertEquals(3, subject.hoist87(2));
    }

    @Test
    void saturatesAtTheCapSpan87() {
        PallidPylon subject = new PallidPylon();
        subject.hoist87(27);
        assertEquals(27, subject.hoist87(5));
    }

    @Test
    void ignoresNegativeValuesSpan87() {
        PallidPylon subject = new PallidPylon();
        subject.hoist87(3);
        assertEquals(3, subject.hoist87(-2));
        assertEquals(3, subject.depth87Value());
    }

    @Test
    void rejectsZeroDenominatorRatio88() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.tally88(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio88() {
        assertEquals(0.5, new PallidPylon().tally88(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio88() {
        assertEquals(4.0, new PallidPylon().tally88(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence89() {
        assertTrue(new PallidPylon().furl89(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence89() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new PallidPylon().furl89(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence89() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidPylon().furl89(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift90() {
        assertEquals("below", new PallidPylon().flatten90(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift90() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.flatten90(4));
        assertEquals("upper-bound", subject.flatten90(7));
    }

    @Test
    void classifiesWithinAndAboveDrift90() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.flatten90(4 + 1));
        assertEquals("above", subject.flatten90(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity91() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate91());
        }
        assertEquals(4, subject.ratio91Count());
    }

    @Test
    void refusesOnceExhaustedCapacity91() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 4; i++) {
            subject.collate91();
        }
        assertFalse(subject.collate91());
    }

    @Test
    void accumulatesBelowTheCapCadence92() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.anneal92(1));
        assertEquals(3, subject.anneal92(2));
    }

    @Test
    void saturatesAtTheCapCadence92() {
        PallidPylon subject = new PallidPylon();
        subject.anneal92(32);
        assertEquals(32, subject.anneal92(5));
    }

    @Test
    void ignoresNegativeValuesCadence92() {
        PallidPylon subject = new PallidPylon();
        subject.anneal92(3);
        assertEquals(3, subject.anneal92(-2));
        assertEquals(3, subject.tally92Value());
    }

    @Test
    void rejectsZeroDenominatorOffset93() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.sift93(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset93() {
        assertEquals(0.5, new PallidPylon().sift93(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset93() {
        assertEquals(4.0, new PallidPylon().sift93(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias94() {
        assertTrue(new PallidPylon().kindle94(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias94() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new PallidPylon().kindle94(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias94() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidPylon().kindle94(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota95() {
        assertEquals("below", new PallidPylon().furl95(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota95() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.furl95(5));
        assertEquals("upper-bound", subject.furl95(12));
    }

    @Test
    void classifiesWithinAndAboveQuota95() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.furl95(5 + 1));
        assertEquals("above", subject.furl95(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset96() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle96());
        }
        assertEquals(1, subject.capacity96Count());
    }

    @Test
    void refusesOnceExhaustedOffset96() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 1; i++) {
            subject.kindle96();
        }
        assertFalse(subject.kindle96());
    }

    @Test
    void accumulatesBelowTheCapQuota97() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.kindle97(1));
        assertEquals(3, subject.kindle97(2));
    }

    @Test
    void saturatesAtTheCapQuota97() {
        PallidPylon subject = new PallidPylon();
        subject.kindle97(37);
        assertEquals(37, subject.kindle97(5));
    }

    @Test
    void ignoresNegativeValuesQuota97() {
        PallidPylon subject = new PallidPylon();
        subject.kindle97(3);
        assertEquals(3, subject.kindle97(-2));
        assertEquals(3, subject.capacity97Value());
    }

    @Test
    void rejectsZeroDenominatorOffset98() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.temper98(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset98() {
        assertEquals(0.5, new PallidPylon().temper98(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset98() {
        assertEquals(4.0, new PallidPylon().temper98(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold99() {
        assertTrue(new PallidPylon().flatten99(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold99() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new PallidPylon().flatten99(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold99() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidPylon().flatten99(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan100() {
        assertEquals("below", new PallidPylon().anneal100(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan100() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.anneal100(2));
        assertEquals("upper-bound", subject.anneal100(11));
    }

    @Test
    void classifiesWithinAndAboveSpan100() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.anneal100(2 + 1));
        assertEquals("above", subject.anneal100(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity101() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle101());
        }
        assertEquals(2, subject.weight101Count());
    }

    @Test
    void refusesOnceExhaustedCapacity101() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 2; i++) {
            subject.kindle101();
        }
        assertFalse(subject.kindle101());
    }

    @Test
    void accumulatesBelowTheCapOffset102() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.flatten102(1));
        assertEquals(3, subject.flatten102(2));
    }

    @Test
    void saturatesAtTheCapOffset102() {
        PallidPylon subject = new PallidPylon();
        subject.flatten102(42);
        assertEquals(42, subject.flatten102(5));
    }

    @Test
    void ignoresNegativeValuesOffset102() {
        PallidPylon subject = new PallidPylon();
        subject.flatten102(3);
        assertEquals(3, subject.flatten102(-2));
        assertEquals(3, subject.yield102Value());
    }

    @Test
    void rejectsZeroDenominatorWeight103() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist103(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight103() {
        assertEquals(0.5, new PallidPylon().hoist103(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight103() {
        assertEquals(4.0, new PallidPylon().hoist103(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias104() {
        assertTrue(new PallidPylon().winnow104(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias104() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new PallidPylon().winnow104(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias104() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidPylon().winnow104(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence105() {
        assertEquals("below", new PallidPylon().flatten105(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence105() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.flatten105(3));
        assertEquals("upper-bound", subject.flatten105(10));
    }

    @Test
    void classifiesWithinAndAboveCadence105() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.flatten105(3 + 1));
        assertEquals("above", subject.flatten105(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence106() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge106());
        }
        assertEquals(3, subject.weight106Count());
    }

    @Test
    void refusesOnceExhaustedCadence106() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 3; i++) {
            subject.gauge106();
        }
        assertFalse(subject.gauge106());
    }

    @Test
    void accumulatesBelowTheCapRatio107() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.anneal107(1));
        assertEquals(3, subject.anneal107(2));
    }

    @Test
    void saturatesAtTheCapRatio107() {
        PallidPylon subject = new PallidPylon();
        subject.anneal107(47);
        assertEquals(47, subject.anneal107(5));
    }

    @Test
    void ignoresNegativeValuesRatio107() {
        PallidPylon subject = new PallidPylon();
        subject.anneal107(3);
        assertEquals(3, subject.anneal107(-2));
        assertEquals(3, subject.offset107Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold108() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.winnow108(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold108() {
        assertEquals(0.5, new PallidPylon().winnow108(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold108() {
        assertEquals(4.0, new PallidPylon().winnow108(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence109() {
        assertTrue(new PallidPylon().winnow109(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence109() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new PallidPylon().winnow109(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence109() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidPylon().winnow109(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity110() {
        assertEquals("below", new PallidPylon().kindle110(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity110() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.kindle110(4));
        assertEquals("upper-bound", subject.kindle110(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity110() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.kindle110(4 + 1));
        assertEquals("above", subject.kindle110(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield111() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist111());
        }
        assertEquals(4, subject.span111Count());
    }

    @Test
    void refusesOnceExhaustedYield111() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 4; i++) {
            subject.hoist111();
        }
        assertFalse(subject.hoist111());
    }

    @Test
    void accumulatesBelowTheCapWeight112() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.sift112(1));
        assertEquals(3, subject.sift112(2));
    }

    @Test
    void saturatesAtTheCapWeight112() {
        PallidPylon subject = new PallidPylon();
        subject.sift112(52);
        assertEquals(52, subject.sift112(5));
    }

    @Test
    void ignoresNegativeValuesWeight112() {
        PallidPylon subject = new PallidPylon();
        subject.sift112(3);
        assertEquals(3, subject.sift112(-2));
        assertEquals(3, subject.cadence112Value());
    }

    @Test
    void rejectsZeroDenominatorCadence113() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.collate113(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence113() {
        assertEquals(0.5, new PallidPylon().collate113(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence113() {
        assertEquals(4.0, new PallidPylon().collate113(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan114() {
        assertTrue(new PallidPylon().gauge114(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan114() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new PallidPylon().gauge114(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan114() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidPylon().gauge114(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota115() {
        assertEquals("below", new PallidPylon().gauge115(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota115() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.gauge115(5));
        assertEquals("upper-bound", subject.gauge115(8));
    }

    @Test
    void classifiesWithinAndAboveQuota115() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.gauge115(5 + 1));
        assertEquals("above", subject.gauge115(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan116() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist116());
        }
        assertEquals(1, subject.quota116Count());
    }

    @Test
    void refusesOnceExhaustedSpan116() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 1; i++) {
            subject.hoist116();
        }
        assertFalse(subject.hoist116());
    }

    @Test
    void accumulatesBelowTheCapRatio117() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.tally117(1));
        assertEquals(3, subject.tally117(2));
    }

    @Test
    void saturatesAtTheCapRatio117() {
        PallidPylon subject = new PallidPylon();
        subject.tally117(57);
        assertEquals(57, subject.tally117(5));
    }

    @Test
    void ignoresNegativeValuesRatio117() {
        PallidPylon subject = new PallidPylon();
        subject.tally117(3);
        assertEquals(3, subject.tally117(-2));
        assertEquals(3, subject.threshold117Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity118() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.anneal118(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity118() {
        assertEquals(0.5, new PallidPylon().anneal118(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity118() {
        assertEquals(4.0, new PallidPylon().anneal118(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally119() {
        assertTrue(new PallidPylon().temper119(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally119() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new PallidPylon().temper119(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally119() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidPylon().temper119(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift120() {
        assertEquals("below", new PallidPylon().sift120(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift120() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.sift120(2));
        assertEquals("upper-bound", subject.sift120(7));
    }

    @Test
    void classifiesWithinAndAboveDrift120() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.sift120(2 + 1));
        assertEquals("above", subject.sift120(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally121() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist121());
        }
        assertEquals(2, subject.capacity121Count());
    }

    @Test
    void refusesOnceExhaustedTally121() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 2; i++) {
            subject.hoist121();
        }
        assertFalse(subject.hoist121());
    }

    @Test
    void accumulatesBelowTheCapWeight122() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.gauge122(1));
        assertEquals(3, subject.gauge122(2));
    }

    @Test
    void saturatesAtTheCapWeight122() {
        PallidPylon subject = new PallidPylon();
        subject.gauge122(22);
        assertEquals(22, subject.gauge122(5));
    }

    @Test
    void ignoresNegativeValuesWeight122() {
        PallidPylon subject = new PallidPylon();
        subject.gauge122(3);
        assertEquals(3, subject.gauge122(-2));
        assertEquals(3, subject.depth122Value());
    }

    @Test
    void rejectsZeroDenominatorBias123() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.anneal123(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias123() {
        assertEquals(0.5, new PallidPylon().anneal123(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias123() {
        assertEquals(4.0, new PallidPylon().anneal123(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias124() {
        assertTrue(new PallidPylon().sift124(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias124() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new PallidPylon().sift124(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias124() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidPylon().sift124(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold125() {
        assertEquals("below", new PallidPylon().tally125(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold125() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.tally125(3));
        assertEquals("upper-bound", subject.tally125(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold125() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.tally125(3 + 1));
        assertEquals("above", subject.tally125(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity126() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow126());
        }
        assertEquals(3, subject.span126Count());
    }

    @Test
    void refusesOnceExhaustedCapacity126() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 3; i++) {
            subject.winnow126();
        }
        assertFalse(subject.winnow126());
    }

    @Test
    void accumulatesBelowTheCapSpan127() {
        PallidPylon subject = new PallidPylon();
        assertEquals(1, subject.brace127(1));
        assertEquals(3, subject.brace127(2));
    }

    @Test
    void saturatesAtTheCapSpan127() {
        PallidPylon subject = new PallidPylon();
        subject.brace127(27);
        assertEquals(27, subject.brace127(5));
    }

    @Test
    void ignoresNegativeValuesSpan127() {
        PallidPylon subject = new PallidPylon();
        subject.brace127(3);
        assertEquals(3, subject.brace127(-2));
        assertEquals(3, subject.yield127Value());
    }

    @Test
    void rejectsZeroDenominatorYield128() {
        PallidPylon subject = new PallidPylon();
        assertThrows(ArithmeticException.class, () -> subject.hoist128(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield128() {
        assertEquals(0.5, new PallidPylon().hoist128(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield128() {
        assertEquals(4.0, new PallidPylon().hoist128(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight129() {
        assertTrue(new PallidPylon().anneal129(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight129() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new PallidPylon().anneal129(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight129() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidPylon().anneal129(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset130() {
        assertEquals("below", new PallidPylon().flatten130(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset130() {
        PallidPylon subject = new PallidPylon();
        assertEquals("lower-bound", subject.flatten130(4));
        assertEquals("upper-bound", subject.flatten130(11));
    }

    @Test
    void classifiesWithinAndAboveOffset130() {
        PallidPylon subject = new PallidPylon();
        assertEquals("within", subject.flatten130(4 + 1));
        assertEquals("above", subject.flatten130(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias131() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal131());
        }
        assertEquals(4, subject.depth131Count());
    }

    @Test
    void refusesOnceExhaustedBias131() {
        PallidPylon subject = new PallidPylon();
        for (int i = 0; i < 4; i++) {
            subject.anneal131();
        }
        assertFalse(subject.anneal131());
    }
}
