package com.slate.alcove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordGranaryIIITest {

    @Test
    void returnsEmptyForNullCadence0() {
        assertTrue(new WexfordGranaryIII().kindle0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordGranaryIII().kindle0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence0() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordGranaryIII().kindle0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan1() {
        assertEquals("below", new WexfordGranaryIII().prune1(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan1() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.prune1(3));
        assertEquals("upper-bound", subject.prune1(8));
    }

    @Test
    void classifiesWithinAndAboveSpan1() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.prune1(3 + 1));
        assertEquals("above", subject.prune1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset2() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate2());
        }
        assertEquals(3, subject.threshold2Count());
    }

    @Test
    void refusesOnceExhaustedOffset2() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            subject.collate2();
        }
        assertFalse(subject.collate2());
    }

    @Test
    void accumulatesBelowTheCapDepth3() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.kindle3(1));
        assertEquals(3, subject.kindle3(2));
    }

    @Test
    void saturatesAtTheCapDepth3() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.kindle3(23);
        assertEquals(23, subject.kindle3(5));
    }

    @Test
    void ignoresNegativeValuesDepth3() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.kindle3(3);
        assertEquals(3, subject.kindle3(-2));
        assertEquals(3, subject.span3Value());
    }

    @Test
    void rejectsZeroDenominatorSpan4() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan4() {
        assertEquals(0.5, new WexfordGranaryIII().gauge4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan4() {
        assertEquals(5.0, new WexfordGranaryIII().gauge4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias5() {
        assertTrue(new WexfordGranaryIII().furl5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordGranaryIII().furl5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias5() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordGranaryIII().furl5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity6() {
        assertEquals("below", new WexfordGranaryIII().kindle6(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity6() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.kindle6(4));
        assertEquals("upper-bound", subject.kindle6(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity6() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.kindle6(4 + 1));
        assertEquals("above", subject.kindle6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift7() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune7());
        }
        assertEquals(4, subject.quota7Count());
    }

    @Test
    void refusesOnceExhaustedDrift7() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            subject.prune7();
        }
        assertFalse(subject.prune7());
    }

    @Test
    void accumulatesBelowTheCapDrift8() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.kindle8(1));
        assertEquals(3, subject.kindle8(2));
    }

    @Test
    void saturatesAtTheCapDrift8() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.kindle8(28);
        assertEquals(28, subject.kindle8(5));
    }

    @Test
    void ignoresNegativeValuesDrift8() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.kindle8(3);
        assertEquals(3, subject.kindle8(-2));
        assertEquals(3, subject.cadence8Value());
    }

    @Test
    void rejectsZeroDenominatorSpan9() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan9() {
        assertEquals(0.5, new WexfordGranaryIII().hoist9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan9() {
        assertEquals(5.0, new WexfordGranaryIII().hoist9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence10() {
        assertTrue(new WexfordGranaryIII().furl10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordGranaryIII().furl10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence10() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordGranaryIII().furl10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence11() {
        assertEquals("below", new WexfordGranaryIII().anneal11(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence11() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.anneal11(5));
        assertEquals("upper-bound", subject.anneal11(12));
    }

    @Test
    void classifiesWithinAndAboveCadence11() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.anneal11(5 + 1));
        assertEquals("above", subject.anneal11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield12() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge12());
        }
        assertEquals(1, subject.drift12Count());
    }

    @Test
    void refusesOnceExhaustedYield12() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            subject.gauge12();
        }
        assertFalse(subject.gauge12());
    }

    @Test
    void accumulatesBelowTheCapCapacity13() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.tally13(1));
        assertEquals(3, subject.tally13(2));
    }

    @Test
    void saturatesAtTheCapCapacity13() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.tally13(33);
        assertEquals(33, subject.tally13(5));
    }

    @Test
    void ignoresNegativeValuesCapacity13() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.tally13(3);
        assertEquals(3, subject.tally13(-2));
        assertEquals(3, subject.bias13Value());
    }

    @Test
    void rejectsZeroDenominatorDrift14() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift14() {
        assertEquals(0.5, new WexfordGranaryIII().flatten14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift14() {
        assertEquals(5.0, new WexfordGranaryIII().flatten14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan15() {
        assertTrue(new WexfordGranaryIII().flatten15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordGranaryIII().flatten15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan15() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordGranaryIII().flatten15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield16() {
        assertEquals("below", new WexfordGranaryIII().furl16(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield16() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.furl16(2));
        assertEquals("upper-bound", subject.furl16(11));
    }

    @Test
    void classifiesWithinAndAboveYield16() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.furl16(2 + 1));
        assertEquals("above", subject.furl16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin17() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate17());
        }
        assertEquals(2, subject.span17Count());
    }

    @Test
    void refusesOnceExhaustedMargin17() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            subject.collate17();
        }
        assertFalse(subject.collate17());
    }

    @Test
    void accumulatesBelowTheCapBias18() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.sift18(1));
        assertEquals(3, subject.sift18(2));
    }

    @Test
    void saturatesAtTheCapBias18() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.sift18(38);
        assertEquals(38, subject.sift18(5));
    }

    @Test
    void ignoresNegativeValuesBias18() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.sift18(3);
        assertEquals(3, subject.sift18(-2));
        assertEquals(3, subject.drift18Value());
    }

    @Test
    void rejectsZeroDenominatorRatio19() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio19() {
        assertEquals(0.5, new WexfordGranaryIII().hoist19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio19() {
        assertEquals(5.0, new WexfordGranaryIII().hoist19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence20() {
        assertTrue(new WexfordGranaryIII().anneal20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordGranaryIII().anneal20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence20() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordGranaryIII().anneal20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight21() {
        assertEquals("below", new WexfordGranaryIII().flatten21(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight21() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.flatten21(3));
        assertEquals("upper-bound", subject.flatten21(10));
    }

    @Test
    void classifiesWithinAndAboveWeight21() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.flatten21(3 + 1));
        assertEquals("above", subject.flatten21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth22() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge22());
        }
        assertEquals(3, subject.threshold22Count());
    }

    @Test
    void refusesOnceExhaustedDepth22() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            subject.gauge22();
        }
        assertFalse(subject.gauge22());
    }

    @Test
    void accumulatesBelowTheCapCadence23() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.anneal23(1));
        assertEquals(3, subject.anneal23(2));
    }

    @Test
    void saturatesAtTheCapCadence23() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.anneal23(43);
        assertEquals(43, subject.anneal23(5));
    }

    @Test
    void ignoresNegativeValuesCadence23() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.anneal23(3);
        assertEquals(3, subject.anneal23(-2));
        assertEquals(3, subject.drift23Value());
    }

    @Test
    void rejectsZeroDenominatorOffset24() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.temper24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset24() {
        assertEquals(0.5, new WexfordGranaryIII().temper24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset24() {
        assertEquals(5.0, new WexfordGranaryIII().temper24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight25() {
        assertTrue(new WexfordGranaryIII().reconcile25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordGranaryIII().reconcile25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight25() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordGranaryIII().reconcile25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift26() {
        assertEquals("below", new WexfordGranaryIII().kindle26(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift26() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.kindle26(4));
        assertEquals("upper-bound", subject.kindle26(9));
    }

    @Test
    void classifiesWithinAndAboveDrift26() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.kindle26(4 + 1));
        assertEquals("above", subject.kindle26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth27() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten27());
        }
        assertEquals(4, subject.ratio27Count());
    }

    @Test
    void refusesOnceExhaustedDepth27() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            subject.flatten27();
        }
        assertFalse(subject.flatten27());
    }

    @Test
    void accumulatesBelowTheCapYield28() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.reconcile28(1));
        assertEquals(3, subject.reconcile28(2));
    }

    @Test
    void saturatesAtTheCapYield28() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.reconcile28(48);
        assertEquals(48, subject.reconcile28(5));
    }

    @Test
    void ignoresNegativeValuesYield28() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.reconcile28(3);
        assertEquals(3, subject.reconcile28(-2));
        assertEquals(3, subject.bias28Value());
    }

    @Test
    void rejectsZeroDenominatorCadence29() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence29() {
        assertEquals(0.5, new WexfordGranaryIII().reconcile29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence29() {
        assertEquals(5.0, new WexfordGranaryIII().reconcile29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset30() {
        assertTrue(new WexfordGranaryIII().temper30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordGranaryIII().temper30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset30() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordGranaryIII().temper30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity31() {
        assertEquals("below", new WexfordGranaryIII().flatten31(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity31() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.flatten31(5));
        assertEquals("upper-bound", subject.flatten31(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity31() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.flatten31(5 + 1));
        assertEquals("above", subject.flatten31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin32() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift32());
        }
        assertEquals(1, subject.quota32Count());
    }

    @Test
    void refusesOnceExhaustedMargin32() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            subject.sift32();
        }
        assertFalse(subject.sift32());
    }

    @Test
    void accumulatesBelowTheCapThreshold33() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.anneal33(1));
        assertEquals(3, subject.anneal33(2));
    }

    @Test
    void saturatesAtTheCapThreshold33() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.anneal33(53);
        assertEquals(53, subject.anneal33(5));
    }

    @Test
    void ignoresNegativeValuesThreshold33() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.anneal33(3);
        assertEquals(3, subject.anneal33(-2));
        assertEquals(3, subject.yield33Value());
    }

    @Test
    void rejectsZeroDenominatorWeight34() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight34() {
        assertEquals(0.5, new WexfordGranaryIII().kindle34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight34() {
        assertEquals(5.0, new WexfordGranaryIII().kindle34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift35() {
        assertTrue(new WexfordGranaryIII().anneal35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordGranaryIII().anneal35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift35() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordGranaryIII().anneal35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally36() {
        assertEquals("below", new WexfordGranaryIII().brace36(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally36() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.brace36(2));
        assertEquals("upper-bound", subject.brace36(7));
    }

    @Test
    void classifiesWithinAndAboveTally36() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.brace36(2 + 1));
        assertEquals("above", subject.brace36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight37() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten37());
        }
        assertEquals(2, subject.cadence37Count());
    }

    @Test
    void refusesOnceExhaustedWeight37() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            subject.flatten37();
        }
        assertFalse(subject.flatten37());
    }

    @Test
    void accumulatesBelowTheCapOffset38() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.tally38(1));
        assertEquals(3, subject.tally38(2));
    }

    @Test
    void saturatesAtTheCapOffset38() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.tally38(58);
        assertEquals(58, subject.tally38(5));
    }

    @Test
    void ignoresNegativeValuesOffset38() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.tally38(3);
        assertEquals(3, subject.tally38(-2));
        assertEquals(3, subject.quota38Value());
    }

    @Test
    void rejectsZeroDenominatorWeight39() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight39() {
        assertEquals(0.5, new WexfordGranaryIII().gauge39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight39() {
        assertEquals(5.0, new WexfordGranaryIII().gauge39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold40() {
        assertTrue(new WexfordGranaryIII().prune40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordGranaryIII().prune40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold40() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordGranaryIII().prune40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold41() {
        assertEquals("below", new WexfordGranaryIII().hoist41(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold41() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.hoist41(3));
        assertEquals("upper-bound", subject.hoist41(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold41() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.hoist41(3 + 1));
        assertEquals("above", subject.hoist41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota42() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate42());
        }
        assertEquals(3, subject.depth42Count());
    }

    @Test
    void refusesOnceExhaustedQuota42() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            subject.collate42();
        }
        assertFalse(subject.collate42());
    }

    @Test
    void accumulatesBelowTheCapRatio43() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.tally43(1));
        assertEquals(3, subject.tally43(2));
    }

    @Test
    void saturatesAtTheCapRatio43() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.tally43(23);
        assertEquals(23, subject.tally43(5));
    }

    @Test
    void ignoresNegativeValuesRatio43() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.tally43(3);
        assertEquals(3, subject.tally43(-2));
        assertEquals(3, subject.offset43Value());
    }

    @Test
    void rejectsZeroDenominatorDepth44() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth44() {
        assertEquals(0.5, new WexfordGranaryIII().gauge44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth44() {
        assertEquals(5.0, new WexfordGranaryIII().gauge44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield45() {
        assertTrue(new WexfordGranaryIII().prune45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordGranaryIII().prune45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield45() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordGranaryIII().prune45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield46() {
        assertEquals("below", new WexfordGranaryIII().winnow46(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield46() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.winnow46(4));
        assertEquals("upper-bound", subject.winnow46(11));
    }

    @Test
    void classifiesWithinAndAboveYield46() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.winnow46(4 + 1));
        assertEquals("above", subject.winnow46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally47() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle47());
        }
        assertEquals(4, subject.bias47Count());
    }

    @Test
    void refusesOnceExhaustedTally47() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            subject.kindle47();
        }
        assertFalse(subject.kindle47());
    }

    @Test
    void accumulatesBelowTheCapCapacity48() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.temper48(1));
        assertEquals(3, subject.temper48(2));
    }

    @Test
    void saturatesAtTheCapCapacity48() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.temper48(28);
        assertEquals(28, subject.temper48(5));
    }

    @Test
    void ignoresNegativeValuesCapacity48() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.temper48(3);
        assertEquals(3, subject.temper48(-2));
        assertEquals(3, subject.threshold48Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity49() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity49() {
        assertEquals(0.5, new WexfordGranaryIII().flatten49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity49() {
        assertEquals(5.0, new WexfordGranaryIII().flatten49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally50() {
        assertTrue(new WexfordGranaryIII().tally50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordGranaryIII().tally50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally50() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordGranaryIII().tally50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota51() {
        assertEquals("below", new WexfordGranaryIII().flatten51(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota51() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.flatten51(5));
        assertEquals("upper-bound", subject.flatten51(10));
    }

    @Test
    void classifiesWithinAndAboveQuota51() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.flatten51(5 + 1));
        assertEquals("above", subject.flatten51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield52() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally52());
        }
        assertEquals(1, subject.tally52Count());
    }

    @Test
    void refusesOnceExhaustedYield52() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            subject.tally52();
        }
        assertFalse(subject.tally52());
    }

    @Test
    void accumulatesBelowTheCapTally53() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.tally53(1));
        assertEquals(3, subject.tally53(2));
    }

    @Test
    void saturatesAtTheCapTally53() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.tally53(33);
        assertEquals(33, subject.tally53(5));
    }

    @Test
    void ignoresNegativeValuesTally53() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.tally53(3);
        assertEquals(3, subject.tally53(-2));
        assertEquals(3, subject.yield53Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold54() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold54() {
        assertEquals(0.5, new WexfordGranaryIII().winnow54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold54() {
        assertEquals(5.0, new WexfordGranaryIII().winnow54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset55() {
        assertTrue(new WexfordGranaryIII().prune55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordGranaryIII().prune55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset55() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordGranaryIII().prune55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset56() {
        assertEquals("below", new WexfordGranaryIII().kindle56(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset56() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.kindle56(2));
        assertEquals("upper-bound", subject.kindle56(9));
    }

    @Test
    void classifiesWithinAndAboveOffset56() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.kindle56(2 + 1));
        assertEquals("above", subject.kindle56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin57() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow57());
        }
        assertEquals(2, subject.ratio57Count());
    }

    @Test
    void refusesOnceExhaustedMargin57() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            subject.winnow57();
        }
        assertFalse(subject.winnow57());
    }

    @Test
    void accumulatesBelowTheCapYield58() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.kindle58(1));
        assertEquals(3, subject.kindle58(2));
    }

    @Test
    void saturatesAtTheCapYield58() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.kindle58(38);
        assertEquals(38, subject.kindle58(5));
    }

    @Test
    void ignoresNegativeValuesYield58() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.kindle58(3);
        assertEquals(3, subject.kindle58(-2));
        assertEquals(3, subject.offset58Value());
    }

    @Test
    void rejectsZeroDenominatorTally59() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally59() {
        assertEquals(0.5, new WexfordGranaryIII().hoist59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally59() {
        assertEquals(5.0, new WexfordGranaryIII().hoist59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota60() {
        assertTrue(new WexfordGranaryIII().brace60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordGranaryIII().brace60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota60() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordGranaryIII().brace60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity61() {
        assertEquals("below", new WexfordGranaryIII().furl61(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity61() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.furl61(3));
        assertEquals("upper-bound", subject.furl61(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity61() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.furl61(3 + 1));
        assertEquals("above", subject.furl61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold62() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal62());
        }
        assertEquals(3, subject.ratio62Count());
    }

    @Test
    void refusesOnceExhaustedThreshold62() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            subject.anneal62();
        }
        assertFalse(subject.anneal62());
    }

    @Test
    void accumulatesBelowTheCapDrift63() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.winnow63(1));
        assertEquals(3, subject.winnow63(2));
    }

    @Test
    void saturatesAtTheCapDrift63() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.winnow63(43);
        assertEquals(43, subject.winnow63(5));
    }

    @Test
    void ignoresNegativeValuesDrift63() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.winnow63(3);
        assertEquals(3, subject.winnow63(-2));
        assertEquals(3, subject.offset63Value());
    }

    @Test
    void rejectsZeroDenominatorCadence64() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence64() {
        assertEquals(0.5, new WexfordGranaryIII().gauge64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence64() {
        assertEquals(5.0, new WexfordGranaryIII().gauge64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset65() {
        assertTrue(new WexfordGranaryIII().hoist65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordGranaryIII().hoist65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset65() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordGranaryIII().hoist65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity66() {
        assertEquals("below", new WexfordGranaryIII().brace66(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity66() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.brace66(4));
        assertEquals("upper-bound", subject.brace66(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity66() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.brace66(4 + 1));
        assertEquals("above", subject.brace66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan67() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally67());
        }
        assertEquals(4, subject.quota67Count());
    }

    @Test
    void refusesOnceExhaustedSpan67() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            subject.tally67();
        }
        assertFalse(subject.tally67());
    }

    @Test
    void accumulatesBelowTheCapYield68() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.temper68(1));
        assertEquals(3, subject.temper68(2));
    }

    @Test
    void saturatesAtTheCapYield68() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.temper68(48);
        assertEquals(48, subject.temper68(5));
    }

    @Test
    void ignoresNegativeValuesYield68() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.temper68(3);
        assertEquals(3, subject.temper68(-2));
        assertEquals(3, subject.quota68Value());
    }

    @Test
    void rejectsZeroDenominatorWeight69() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight69() {
        assertEquals(0.5, new WexfordGranaryIII().winnow69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight69() {
        assertEquals(5.0, new WexfordGranaryIII().winnow69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias70() {
        assertTrue(new WexfordGranaryIII().flatten70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordGranaryIII().flatten70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias70() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordGranaryIII().flatten70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset71() {
        assertEquals("below", new WexfordGranaryIII().hoist71(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset71() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.hoist71(5));
        assertEquals("upper-bound", subject.hoist71(12));
    }

    @Test
    void classifiesWithinAndAboveOffset71() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.hoist71(5 + 1));
        assertEquals("above", subject.hoist71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset72() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally72());
        }
        assertEquals(1, subject.yield72Count());
    }

    @Test
    void refusesOnceExhaustedOffset72() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            subject.tally72();
        }
        assertFalse(subject.tally72());
    }

    @Test
    void accumulatesBelowTheCapDrift73() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.anneal73(1));
        assertEquals(3, subject.anneal73(2));
    }

    @Test
    void saturatesAtTheCapDrift73() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.anneal73(53);
        assertEquals(53, subject.anneal73(5));
    }

    @Test
    void ignoresNegativeValuesDrift73() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.anneal73(3);
        assertEquals(3, subject.anneal73(-2));
        assertEquals(3, subject.quota73Value());
    }

    @Test
    void rejectsZeroDenominatorOffset74() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.furl74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset74() {
        assertEquals(0.5, new WexfordGranaryIII().furl74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset74() {
        assertEquals(5.0, new WexfordGranaryIII().furl74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity75() {
        assertTrue(new WexfordGranaryIII().brace75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordGranaryIII().brace75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity75() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordGranaryIII().brace75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield76() {
        assertEquals("below", new WexfordGranaryIII().winnow76(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield76() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.winnow76(2));
        assertEquals("upper-bound", subject.winnow76(11));
    }

    @Test
    void classifiesWithinAndAboveYield76() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.winnow76(2 + 1));
        assertEquals("above", subject.winnow76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota77() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten77());
        }
        assertEquals(2, subject.weight77Count());
    }

    @Test
    void refusesOnceExhaustedQuota77() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            subject.flatten77();
        }
        assertFalse(subject.flatten77());
    }

    @Test
    void accumulatesBelowTheCapCapacity78() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.collate78(1));
        assertEquals(3, subject.collate78(2));
    }

    @Test
    void saturatesAtTheCapCapacity78() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.collate78(58);
        assertEquals(58, subject.collate78(5));
    }

    @Test
    void ignoresNegativeValuesCapacity78() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.collate78(3);
        assertEquals(3, subject.collate78(-2));
        assertEquals(3, subject.offset78Value());
    }

    @Test
    void rejectsZeroDenominatorBias79() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias79() {
        assertEquals(0.5, new WexfordGranaryIII().gauge79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias79() {
        assertEquals(5.0, new WexfordGranaryIII().gauge79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift80() {
        assertTrue(new WexfordGranaryIII().brace80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordGranaryIII().brace80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift80() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordGranaryIII().brace80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight81() {
        assertEquals("below", new WexfordGranaryIII().kindle81(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight81() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.kindle81(3));
        assertEquals("upper-bound", subject.kindle81(10));
    }

    @Test
    void classifiesWithinAndAboveWeight81() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.kindle81(3 + 1));
        assertEquals("above", subject.kindle81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota82() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace82());
        }
        assertEquals(3, subject.cadence82Count());
    }

    @Test
    void refusesOnceExhaustedQuota82() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            subject.brace82();
        }
        assertFalse(subject.brace82());
    }

    @Test
    void accumulatesBelowTheCapRatio83() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.winnow83(1));
        assertEquals(3, subject.winnow83(2));
    }

    @Test
    void saturatesAtTheCapRatio83() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.winnow83(23);
        assertEquals(23, subject.winnow83(5));
    }

    @Test
    void ignoresNegativeValuesRatio83() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.winnow83(3);
        assertEquals(3, subject.winnow83(-2));
        assertEquals(3, subject.bias83Value());
    }

    @Test
    void rejectsZeroDenominatorMargin84() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin84() {
        assertEquals(0.5, new WexfordGranaryIII().reconcile84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin84() {
        assertEquals(5.0, new WexfordGranaryIII().reconcile84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight85() {
        assertTrue(new WexfordGranaryIII().brace85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordGranaryIII().brace85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight85() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordGranaryIII().brace85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield86() {
        assertEquals("below", new WexfordGranaryIII().collate86(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield86() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.collate86(4));
        assertEquals("upper-bound", subject.collate86(9));
    }

    @Test
    void classifiesWithinAndAboveYield86() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.collate86(4 + 1));
        assertEquals("above", subject.collate86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota87() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten87());
        }
        assertEquals(4, subject.bias87Count());
    }

    @Test
    void refusesOnceExhaustedQuota87() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            subject.flatten87();
        }
        assertFalse(subject.flatten87());
    }

    @Test
    void accumulatesBelowTheCapMargin88() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.winnow88(1));
        assertEquals(3, subject.winnow88(2));
    }

    @Test
    void saturatesAtTheCapMargin88() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.winnow88(28);
        assertEquals(28, subject.winnow88(5));
    }

    @Test
    void ignoresNegativeValuesMargin88() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.winnow88(3);
        assertEquals(3, subject.winnow88(-2));
        assertEquals(3, subject.ratio88Value());
    }

    @Test
    void rejectsZeroDenominatorTally89() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.temper89(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally89() {
        assertEquals(0.5, new WexfordGranaryIII().temper89(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally89() {
        assertEquals(5.0, new WexfordGranaryIII().temper89(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold90() {
        assertTrue(new WexfordGranaryIII().temper90(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold90() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordGranaryIII().temper90(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold90() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordGranaryIII().temper90(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift91() {
        assertEquals("below", new WexfordGranaryIII().brace91(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift91() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.brace91(5));
        assertEquals("upper-bound", subject.brace91(8));
    }

    @Test
    void classifiesWithinAndAboveDrift91() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.brace91(5 + 1));
        assertEquals("above", subject.brace91(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin92() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune92());
        }
        assertEquals(1, subject.offset92Count());
    }

    @Test
    void refusesOnceExhaustedMargin92() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            subject.prune92();
        }
        assertFalse(subject.prune92());
    }

    @Test
    void accumulatesBelowTheCapThreshold93() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.gauge93(1));
        assertEquals(3, subject.gauge93(2));
    }

    @Test
    void saturatesAtTheCapThreshold93() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.gauge93(33);
        assertEquals(33, subject.gauge93(5));
    }

    @Test
    void ignoresNegativeValuesThreshold93() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.gauge93(3);
        assertEquals(3, subject.gauge93(-2));
        assertEquals(3, subject.offset93Value());
    }

    @Test
    void rejectsZeroDenominatorDepth94() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle94(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth94() {
        assertEquals(0.5, new WexfordGranaryIII().kindle94(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth94() {
        assertEquals(5.0, new WexfordGranaryIII().kindle94(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin95() {
        assertTrue(new WexfordGranaryIII().hoist95(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin95() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordGranaryIII().hoist95(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin95() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordGranaryIII().hoist95(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan96() {
        assertEquals("below", new WexfordGranaryIII().winnow96(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan96() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.winnow96(2));
        assertEquals("upper-bound", subject.winnow96(7));
    }

    @Test
    void classifiesWithinAndAboveSpan96() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.winnow96(2 + 1));
        assertEquals("above", subject.winnow96(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally97() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune97());
        }
        assertEquals(2, subject.quota97Count());
    }

    @Test
    void refusesOnceExhaustedTally97() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            subject.prune97();
        }
        assertFalse(subject.prune97());
    }

    @Test
    void accumulatesBelowTheCapBias98() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.brace98(1));
        assertEquals(3, subject.brace98(2));
    }

    @Test
    void saturatesAtTheCapBias98() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.brace98(38);
        assertEquals(38, subject.brace98(5));
    }

    @Test
    void ignoresNegativeValuesBias98() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.brace98(3);
        assertEquals(3, subject.brace98(-2));
        assertEquals(3, subject.ratio98Value());
    }

    @Test
    void rejectsZeroDenominatorDrift99() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge99(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift99() {
        assertEquals(0.5, new WexfordGranaryIII().gauge99(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift99() {
        assertEquals(5.0, new WexfordGranaryIII().gauge99(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity100() {
        assertTrue(new WexfordGranaryIII().prune100(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity100() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordGranaryIII().prune100(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity100() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordGranaryIII().prune100(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield101() {
        assertEquals("below", new WexfordGranaryIII().sift101(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield101() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.sift101(3));
        assertEquals("upper-bound", subject.sift101(12));
    }

    @Test
    void classifiesWithinAndAboveYield101() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.sift101(3 + 1));
        assertEquals("above", subject.sift101(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio102() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune102());
        }
        assertEquals(3, subject.drift102Count());
    }

    @Test
    void refusesOnceExhaustedRatio102() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            subject.prune102();
        }
        assertFalse(subject.prune102());
    }

    @Test
    void accumulatesBelowTheCapSpan103() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.collate103(1));
        assertEquals(3, subject.collate103(2));
    }

    @Test
    void saturatesAtTheCapSpan103() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.collate103(43);
        assertEquals(43, subject.collate103(5));
    }

    @Test
    void ignoresNegativeValuesSpan103() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.collate103(3);
        assertEquals(3, subject.collate103(-2));
        assertEquals(3, subject.drift103Value());
    }

    @Test
    void rejectsZeroDenominatorDepth104() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.tally104(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth104() {
        assertEquals(0.5, new WexfordGranaryIII().tally104(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth104() {
        assertEquals(5.0, new WexfordGranaryIII().tally104(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan105() {
        assertTrue(new WexfordGranaryIII().kindle105(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan105() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordGranaryIII().kindle105(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan105() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordGranaryIII().kindle105(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight106() {
        assertEquals("below", new WexfordGranaryIII().reconcile106(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight106() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.reconcile106(4));
        assertEquals("upper-bound", subject.reconcile106(11));
    }

    @Test
    void classifiesWithinAndAboveWeight106() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.reconcile106(4 + 1));
        assertEquals("above", subject.reconcile106(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence107() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle107());
        }
        assertEquals(4, subject.quota107Count());
    }

    @Test
    void refusesOnceExhaustedCadence107() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            subject.kindle107();
        }
        assertFalse(subject.kindle107());
    }

    @Test
    void accumulatesBelowTheCapCadence108() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.reconcile108(1));
        assertEquals(3, subject.reconcile108(2));
    }

    @Test
    void saturatesAtTheCapCadence108() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.reconcile108(48);
        assertEquals(48, subject.reconcile108(5));
    }

    @Test
    void ignoresNegativeValuesCadence108() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.reconcile108(3);
        assertEquals(3, subject.reconcile108(-2));
        assertEquals(3, subject.weight108Value());
    }

    @Test
    void rejectsZeroDenominatorDrift109() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.collate109(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift109() {
        assertEquals(0.5, new WexfordGranaryIII().collate109(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift109() {
        assertEquals(5.0, new WexfordGranaryIII().collate109(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold110() {
        assertTrue(new WexfordGranaryIII().sift110(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold110() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordGranaryIII().sift110(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold110() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordGranaryIII().sift110(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield111() {
        assertEquals("below", new WexfordGranaryIII().reconcile111(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield111() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.reconcile111(5));
        assertEquals("upper-bound", subject.reconcile111(10));
    }

    @Test
    void classifiesWithinAndAboveYield111() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.reconcile111(5 + 1));
        assertEquals("above", subject.reconcile111(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset112() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune112());
        }
        assertEquals(1, subject.tally112Count());
    }

    @Test
    void refusesOnceExhaustedOffset112() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            subject.prune112();
        }
        assertFalse(subject.prune112());
    }

    @Test
    void accumulatesBelowTheCapDrift113() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.collate113(1));
        assertEquals(3, subject.collate113(2));
    }

    @Test
    void saturatesAtTheCapDrift113() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.collate113(53);
        assertEquals(53, subject.collate113(5));
    }

    @Test
    void ignoresNegativeValuesDrift113() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.collate113(3);
        assertEquals(3, subject.collate113(-2));
        assertEquals(3, subject.ratio113Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold114() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal114(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold114() {
        assertEquals(0.5, new WexfordGranaryIII().anneal114(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold114() {
        assertEquals(5.0, new WexfordGranaryIII().anneal114(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota115() {
        assertTrue(new WexfordGranaryIII().temper115(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota115() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordGranaryIII().temper115(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota115() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordGranaryIII().temper115(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan116() {
        assertEquals("below", new WexfordGranaryIII().reconcile116(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan116() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.reconcile116(2));
        assertEquals("upper-bound", subject.reconcile116(9));
    }

    @Test
    void classifiesWithinAndAboveSpan116() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.reconcile116(2 + 1));
        assertEquals("above", subject.reconcile116(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio117() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist117());
        }
        assertEquals(2, subject.quota117Count());
    }

    @Test
    void refusesOnceExhaustedRatio117() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            subject.hoist117();
        }
        assertFalse(subject.hoist117());
    }

    @Test
    void accumulatesBelowTheCapDepth118() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.gauge118(1));
        assertEquals(3, subject.gauge118(2));
    }

    @Test
    void saturatesAtTheCapDepth118() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.gauge118(58);
        assertEquals(58, subject.gauge118(5));
    }

    @Test
    void ignoresNegativeValuesDepth118() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.gauge118(3);
        assertEquals(3, subject.gauge118(-2));
        assertEquals(3, subject.tally118Value());
    }

    @Test
    void rejectsZeroDenominatorRatio119() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.furl119(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio119() {
        assertEquals(0.5, new WexfordGranaryIII().furl119(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio119() {
        assertEquals(5.0, new WexfordGranaryIII().furl119(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin120() {
        assertTrue(new WexfordGranaryIII().flatten120(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin120() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordGranaryIII().flatten120(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin120() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordGranaryIII().flatten120(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias121() {
        assertEquals("below", new WexfordGranaryIII().prune121(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias121() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.prune121(3));
        assertEquals("upper-bound", subject.prune121(8));
    }

    @Test
    void classifiesWithinAndAboveBias121() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.prune121(3 + 1));
        assertEquals("above", subject.prune121(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield122() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift122());
        }
        assertEquals(3, subject.quota122Count());
    }

    @Test
    void refusesOnceExhaustedYield122() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            subject.sift122();
        }
        assertFalse(subject.sift122());
    }

    @Test
    void accumulatesBelowTheCapOffset123() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.temper123(1));
        assertEquals(3, subject.temper123(2));
    }

    @Test
    void saturatesAtTheCapOffset123() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.temper123(23);
        assertEquals(23, subject.temper123(5));
    }

    @Test
    void ignoresNegativeValuesOffset123() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.temper123(3);
        assertEquals(3, subject.temper123(-2));
        assertEquals(3, subject.drift123Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold124() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist124(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold124() {
        assertEquals(0.5, new WexfordGranaryIII().hoist124(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold124() {
        assertEquals(5.0, new WexfordGranaryIII().hoist124(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan125() {
        assertTrue(new WexfordGranaryIII().prune125(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan125() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordGranaryIII().prune125(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan125() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordGranaryIII().prune125(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity126() {
        assertEquals("below", new WexfordGranaryIII().furl126(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity126() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.furl126(4));
        assertEquals("upper-bound", subject.furl126(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity126() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.furl126(4 + 1));
        assertEquals("above", subject.furl126(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity127() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl127());
        }
        assertEquals(4, subject.depth127Count());
    }

    @Test
    void refusesOnceExhaustedCapacity127() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            subject.furl127();
        }
        assertFalse(subject.furl127());
    }

    @Test
    void accumulatesBelowTheCapYield128() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.hoist128(1));
        assertEquals(3, subject.hoist128(2));
    }

    @Test
    void saturatesAtTheCapYield128() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.hoist128(28);
        assertEquals(28, subject.hoist128(5));
    }

    @Test
    void ignoresNegativeValuesYield128() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.hoist128(3);
        assertEquals(3, subject.hoist128(-2));
        assertEquals(3, subject.threshold128Value());
    }

    @Test
    void rejectsZeroDenominatorDrift129() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.prune129(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift129() {
        assertEquals(0.5, new WexfordGranaryIII().prune129(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift129() {
        assertEquals(5.0, new WexfordGranaryIII().prune129(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally130() {
        assertTrue(new WexfordGranaryIII().gauge130(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally130() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordGranaryIII().gauge130(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsTally130() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordGranaryIII().gauge130(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence131() {
        assertEquals("below", new WexfordGranaryIII().kindle131(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence131() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.kindle131(5));
        assertEquals("upper-bound", subject.kindle131(12));
    }

    @Test
    void classifiesWithinAndAboveCadence131() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.kindle131(5 + 1));
        assertEquals("above", subject.kindle131(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight132() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune132());
        }
        assertEquals(1, subject.span132Count());
    }

    @Test
    void refusesOnceExhaustedWeight132() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            subject.prune132();
        }
        assertFalse(subject.prune132());
    }

    @Test
    void accumulatesBelowTheCapThreshold133() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.furl133(1));
        assertEquals(3, subject.furl133(2));
    }

    @Test
    void saturatesAtTheCapThreshold133() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.furl133(33);
        assertEquals(33, subject.furl133(5));
    }

    @Test
    void ignoresNegativeValuesThreshold133() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.furl133(3);
        assertEquals(3, subject.furl133(-2));
        assertEquals(3, subject.bias133Value());
    }

    @Test
    void rejectsZeroDenominatorDepth134() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge134(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth134() {
        assertEquals(0.5, new WexfordGranaryIII().gauge134(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth134() {
        assertEquals(5.0, new WexfordGranaryIII().gauge134(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth135() {
        assertTrue(new WexfordGranaryIII().temper135(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth135() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new WexfordGranaryIII().temper135(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth135() {
        assertEquals(java.util.Arrays.asList(6),
                new WexfordGranaryIII().temper135(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence136() {
        assertEquals("below", new WexfordGranaryIII().kindle136(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence136() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.kindle136(2));
        assertEquals("upper-bound", subject.kindle136(11));
    }

    @Test
    void classifiesWithinAndAboveCadence136() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.kindle136(2 + 1));
        assertEquals("above", subject.kindle136(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota137() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift137());
        }
        assertEquals(2, subject.threshold137Count());
    }

    @Test
    void refusesOnceExhaustedQuota137() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            subject.sift137();
        }
        assertFalse(subject.sift137());
    }

    @Test
    void accumulatesBelowTheCapYield138() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.furl138(1));
        assertEquals(3, subject.furl138(2));
    }

    @Test
    void saturatesAtTheCapYield138() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.furl138(38);
        assertEquals(38, subject.furl138(5));
    }

    @Test
    void ignoresNegativeValuesYield138() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.furl138(3);
        assertEquals(3, subject.furl138(-2));
        assertEquals(3, subject.span138Value());
    }

    @Test
    void rejectsZeroDenominatorBias139() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.brace139(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias139() {
        assertEquals(0.5, new WexfordGranaryIII().brace139(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias139() {
        assertEquals(5.0, new WexfordGranaryIII().brace139(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield140() {
        assertTrue(new WexfordGranaryIII().kindle140(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield140() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new WexfordGranaryIII().kindle140(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield140() {
        assertEquals(java.util.Arrays.asList(11),
                new WexfordGranaryIII().kindle140(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota141() {
        assertEquals("below", new WexfordGranaryIII().prune141(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota141() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.prune141(3));
        assertEquals("upper-bound", subject.prune141(10));
    }

    @Test
    void classifiesWithinAndAboveQuota141() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.prune141(3 + 1));
        assertEquals("above", subject.prune141(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally142() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl142());
        }
        assertEquals(3, subject.cadence142Count());
    }

    @Test
    void refusesOnceExhaustedTally142() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            subject.furl142();
        }
        assertFalse(subject.furl142());
    }

    @Test
    void accumulatesBelowTheCapMargin143() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.temper143(1));
        assertEquals(3, subject.temper143(2));
    }

    @Test
    void saturatesAtTheCapMargin143() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.temper143(43);
        assertEquals(43, subject.temper143(5));
    }

    @Test
    void ignoresNegativeValuesMargin143() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.temper143(3);
        assertEquals(3, subject.temper143(-2));
        assertEquals(3, subject.ratio143Value());
    }

    @Test
    void rejectsZeroDenominatorDepth144() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal144(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth144() {
        assertEquals(0.5, new WexfordGranaryIII().anneal144(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth144() {
        assertEquals(5.0, new WexfordGranaryIII().anneal144(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift145() {
        assertTrue(new WexfordGranaryIII().flatten145(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift145() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new WexfordGranaryIII().flatten145(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift145() {
        assertEquals(java.util.Arrays.asList(7),
                new WexfordGranaryIII().flatten145(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift146() {
        assertEquals("below", new WexfordGranaryIII().tally146(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift146() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.tally146(4));
        assertEquals("upper-bound", subject.tally146(9));
    }

    @Test
    void classifiesWithinAndAboveDrift146() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.tally146(4 + 1));
        assertEquals("above", subject.tally146(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth147() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten147());
        }
        assertEquals(4, subject.weight147Count());
    }

    @Test
    void refusesOnceExhaustedDepth147() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            subject.flatten147();
        }
        assertFalse(subject.flatten147());
    }

    @Test
    void accumulatesBelowTheCapQuota148() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.flatten148(1));
        assertEquals(3, subject.flatten148(2));
    }

    @Test
    void saturatesAtTheCapQuota148() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.flatten148(48);
        assertEquals(48, subject.flatten148(5));
    }

    @Test
    void ignoresNegativeValuesQuota148() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.flatten148(3);
        assertEquals(3, subject.flatten148(-2));
        assertEquals(3, subject.margin148Value());
    }

    @Test
    void rejectsZeroDenominatorRatio149() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.furl149(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio149() {
        assertEquals(0.5, new WexfordGranaryIII().furl149(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio149() {
        assertEquals(5.0, new WexfordGranaryIII().furl149(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally150() {
        assertTrue(new WexfordGranaryIII().hoist150(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally150() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new WexfordGranaryIII().hoist150(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsTally150() {
        assertEquals(java.util.Arrays.asList(12),
                new WexfordGranaryIII().hoist150(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin151() {
        assertEquals("below", new WexfordGranaryIII().reconcile151(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin151() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.reconcile151(5));
        assertEquals("upper-bound", subject.reconcile151(8));
    }

    @Test
    void classifiesWithinAndAboveMargin151() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.reconcile151(5 + 1));
        assertEquals("above", subject.reconcile151(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan152() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper152());
        }
        assertEquals(1, subject.ratio152Count());
    }

    @Test
    void refusesOnceExhaustedSpan152() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            subject.temper152();
        }
        assertFalse(subject.temper152());
    }

    @Test
    void accumulatesBelowTheCapOffset153() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.temper153(1));
        assertEquals(3, subject.temper153(2));
    }

    @Test
    void saturatesAtTheCapOffset153() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.temper153(53);
        assertEquals(53, subject.temper153(5));
    }

    @Test
    void ignoresNegativeValuesOffset153() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.temper153(3);
        assertEquals(3, subject.temper153(-2));
        assertEquals(3, subject.cadence153Value());
    }

    @Test
    void rejectsZeroDenominatorOffset154() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal154(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset154() {
        assertEquals(0.5, new WexfordGranaryIII().anneal154(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset154() {
        assertEquals(5.0, new WexfordGranaryIII().anneal154(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias155() {
        assertTrue(new WexfordGranaryIII().brace155(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias155() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new WexfordGranaryIII().brace155(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias155() {
        assertEquals(java.util.Arrays.asList(8),
                new WexfordGranaryIII().brace155(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth156() {
        assertEquals("below", new WexfordGranaryIII().tally156(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth156() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.tally156(2));
        assertEquals("upper-bound", subject.tally156(7));
    }

    @Test
    void classifiesWithinAndAboveDepth156() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.tally156(2 + 1));
        assertEquals("above", subject.tally156(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth157() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate157());
        }
        assertEquals(2, subject.drift157Count());
    }

    @Test
    void refusesOnceExhaustedDepth157() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 2; i++) {
            subject.collate157();
        }
        assertFalse(subject.collate157());
    }

    @Test
    void accumulatesBelowTheCapOffset158() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.temper158(1));
        assertEquals(3, subject.temper158(2));
    }

    @Test
    void saturatesAtTheCapOffset158() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.temper158(58);
        assertEquals(58, subject.temper158(5));
    }

    @Test
    void ignoresNegativeValuesOffset158() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.temper158(3);
        assertEquals(3, subject.temper158(-2));
        assertEquals(3, subject.depth158Value());
    }

    @Test
    void rejectsZeroDenominatorBias159() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow159(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias159() {
        assertEquals(0.5, new WexfordGranaryIII().winnow159(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias159() {
        assertEquals(5.0, new WexfordGranaryIII().winnow159(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity160() {
        assertTrue(new WexfordGranaryIII().temper160(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity160() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new WexfordGranaryIII().temper160(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity160() {
        assertEquals(java.util.Arrays.asList(13),
                new WexfordGranaryIII().temper160(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio161() {
        assertEquals("below", new WexfordGranaryIII().prune161(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio161() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.prune161(3));
        assertEquals("upper-bound", subject.prune161(12));
    }

    @Test
    void classifiesWithinAndAboveRatio161() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.prune161(3 + 1));
        assertEquals("above", subject.prune161(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight162() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper162());
        }
        assertEquals(3, subject.cadence162Count());
    }

    @Test
    void refusesOnceExhaustedWeight162() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 3; i++) {
            subject.temper162();
        }
        assertFalse(subject.temper162());
    }

    @Test
    void accumulatesBelowTheCapCapacity163() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.anneal163(1));
        assertEquals(3, subject.anneal163(2));
    }

    @Test
    void saturatesAtTheCapCapacity163() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.anneal163(23);
        assertEquals(23, subject.anneal163(5));
    }

    @Test
    void ignoresNegativeValuesCapacity163() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.anneal163(3);
        assertEquals(3, subject.anneal163(-2));
        assertEquals(3, subject.span163Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold164() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.temper164(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold164() {
        assertEquals(0.5, new WexfordGranaryIII().temper164(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold164() {
        assertEquals(5.0, new WexfordGranaryIII().temper164(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan165() {
        assertTrue(new WexfordGranaryIII().anneal165(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan165() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new WexfordGranaryIII().anneal165(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan165() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordGranaryIII().anneal165(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan166() {
        assertEquals("below", new WexfordGranaryIII().furl166(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan166() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.furl166(4));
        assertEquals("upper-bound", subject.furl166(11));
    }

    @Test
    void classifiesWithinAndAboveSpan166() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.furl166(4 + 1));
        assertEquals("above", subject.furl166(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset167() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl167());
        }
        assertEquals(4, subject.depth167Count());
    }

    @Test
    void refusesOnceExhaustedOffset167() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 4; i++) {
            subject.furl167();
        }
        assertFalse(subject.furl167());
    }

    @Test
    void accumulatesBelowTheCapThreshold168() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.furl168(1));
        assertEquals(3, subject.furl168(2));
    }

    @Test
    void saturatesAtTheCapThreshold168() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.furl168(28);
        assertEquals(28, subject.furl168(5));
    }

    @Test
    void ignoresNegativeValuesThreshold168() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.furl168(3);
        assertEquals(3, subject.furl168(-2));
        assertEquals(3, subject.bias168Value());
    }

    @Test
    void rejectsZeroDenominatorYield169() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge169(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield169() {
        assertEquals(0.5, new WexfordGranaryIII().gauge169(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield169() {
        assertEquals(5.0, new WexfordGranaryIII().gauge169(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias170() {
        assertTrue(new WexfordGranaryIII().kindle170(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias170() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new WexfordGranaryIII().kindle170(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias170() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordGranaryIII().kindle170(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan171() {
        assertEquals("below", new WexfordGranaryIII().hoist171(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan171() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.hoist171(5));
        assertEquals("upper-bound", subject.hoist171(10));
    }

    @Test
    void classifiesWithinAndAboveSpan171() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.hoist171(5 + 1));
        assertEquals("above", subject.hoist171(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan172() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift172());
        }
        assertEquals(1, subject.threshold172Count());
    }

    @Test
    void refusesOnceExhaustedSpan172() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        for (int i = 0; i < 1; i++) {
            subject.sift172();
        }
        assertFalse(subject.sift172());
    }

    @Test
    void accumulatesBelowTheCapRatio173() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals(1, subject.sift173(1));
        assertEquals(3, subject.sift173(2));
    }

    @Test
    void saturatesAtTheCapRatio173() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.sift173(33);
        assertEquals(33, subject.sift173(5));
    }

    @Test
    void ignoresNegativeValuesRatio173() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        subject.sift173(3);
        assertEquals(3, subject.sift173(-2));
        assertEquals(3, subject.depth173Value());
    }

    @Test
    void rejectsZeroDenominatorTally174() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertThrows(ArithmeticException.class, () -> subject.collate174(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally174() {
        assertEquals(0.5, new WexfordGranaryIII().collate174(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally174() {
        assertEquals(5.0, new WexfordGranaryIII().collate174(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth175() {
        assertTrue(new WexfordGranaryIII().gauge175(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth175() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new WexfordGranaryIII().gauge175(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth175() {
        assertEquals(java.util.Arrays.asList(10),
                new WexfordGranaryIII().gauge175(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift176() {
        assertEquals("below", new WexfordGranaryIII().tally176(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift176() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("lower-bound", subject.tally176(2));
        assertEquals("upper-bound", subject.tally176(9));
    }

    @Test
    void classifiesWithinAndAboveDrift176() {
        WexfordGranaryIII subject = new WexfordGranaryIII();
        assertEquals("within", subject.tally176(2 + 1));
        assertEquals("above", subject.tally176(9 + 1));
    }
}
