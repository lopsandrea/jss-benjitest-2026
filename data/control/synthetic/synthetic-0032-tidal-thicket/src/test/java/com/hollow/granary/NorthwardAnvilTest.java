package com.hollow.granary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardAnvilTest {

    @Test
    void returnsEmptyForNullDrift0() {
        assertTrue(new NorthwardAnvil().prune0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new NorthwardAnvil().prune0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift0() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardAnvil().prune0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield1() {
        assertEquals("below", new NorthwardAnvil().brace1(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield1() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.brace1(3));
        assertEquals("upper-bound", subject.brace1(8));
    }

    @Test
    void classifiesWithinAndAboveYield1() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.brace1(3 + 1));
        assertEquals("above", subject.brace1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield2() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl2());
        }
        assertEquals(3, subject.bias2Count());
    }

    @Test
    void refusesOnceExhaustedYield2() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 3; i++) {
            subject.furl2();
        }
        assertFalse(subject.furl2());
    }

    @Test
    void accumulatesBelowTheCapRatio3() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.kindle3(1));
        assertEquals(3, subject.kindle3(2));
    }

    @Test
    void saturatesAtTheCapRatio3() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.kindle3(23);
        assertEquals(23, subject.kindle3(5));
    }

    @Test
    void ignoresNegativeValuesRatio3() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.kindle3(3);
        assertEquals(3, subject.kindle3(-2));
        assertEquals(3, subject.depth3Value());
    }

    @Test
    void rejectsZeroDenominatorDepth4() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.hoist4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth4() {
        assertEquals(0.5, new NorthwardAnvil().hoist4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth4() {
        assertEquals(5.0, new NorthwardAnvil().hoist4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias5() {
        assertTrue(new NorthwardAnvil().tally5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new NorthwardAnvil().tally5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias5() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardAnvil().tally5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin6() {
        assertEquals("below", new NorthwardAnvil().furl6(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin6() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.furl6(4));
        assertEquals("upper-bound", subject.furl6(7));
    }

    @Test
    void classifiesWithinAndAboveMargin6() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.furl6(4 + 1));
        assertEquals("above", subject.furl6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset7() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper7());
        }
        assertEquals(4, subject.span7Count());
    }

    @Test
    void refusesOnceExhaustedOffset7() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 4; i++) {
            subject.temper7();
        }
        assertFalse(subject.temper7());
    }

    @Test
    void accumulatesBelowTheCapYield8() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.prune8(1));
        assertEquals(3, subject.prune8(2));
    }

    @Test
    void saturatesAtTheCapYield8() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.prune8(28);
        assertEquals(28, subject.prune8(5));
    }

    @Test
    void ignoresNegativeValuesYield8() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.prune8(3);
        assertEquals(3, subject.prune8(-2));
        assertEquals(3, subject.tally8Value());
    }

    @Test
    void rejectsZeroDenominatorRatio9() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.prune9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio9() {
        assertEquals(0.5, new NorthwardAnvil().prune9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio9() {
        assertEquals(5.0, new NorthwardAnvil().prune9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio10() {
        assertTrue(new NorthwardAnvil().prune10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new NorthwardAnvil().prune10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio10() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardAnvil().prune10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth11() {
        assertEquals("below", new NorthwardAnvil().reconcile11(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth11() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.reconcile11(5));
        assertEquals("upper-bound", subject.reconcile11(12));
    }

    @Test
    void classifiesWithinAndAboveDepth11() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.reconcile11(5 + 1));
        assertEquals("above", subject.reconcile11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth12() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally12());
        }
        assertEquals(1, subject.bias12Count());
    }

    @Test
    void refusesOnceExhaustedDepth12() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 1; i++) {
            subject.tally12();
        }
        assertFalse(subject.tally12());
    }

    @Test
    void accumulatesBelowTheCapDrift13() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.reconcile13(1));
        assertEquals(3, subject.reconcile13(2));
    }

    @Test
    void saturatesAtTheCapDrift13() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.reconcile13(33);
        assertEquals(33, subject.reconcile13(5));
    }

    @Test
    void ignoresNegativeValuesDrift13() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.reconcile13(3);
        assertEquals(3, subject.reconcile13(-2));
        assertEquals(3, subject.bias13Value());
    }

    @Test
    void rejectsZeroDenominatorBias14() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.brace14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias14() {
        assertEquals(0.5, new NorthwardAnvil().brace14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias14() {
        assertEquals(5.0, new NorthwardAnvil().brace14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin15() {
        assertTrue(new NorthwardAnvil().winnow15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new NorthwardAnvil().winnow15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin15() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardAnvil().winnow15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight16() {
        assertEquals("below", new NorthwardAnvil().furl16(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight16() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.furl16(2));
        assertEquals("upper-bound", subject.furl16(11));
    }

    @Test
    void classifiesWithinAndAboveWeight16() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.furl16(2 + 1));
        assertEquals("above", subject.furl16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota17() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge17());
        }
        assertEquals(2, subject.ratio17Count());
    }

    @Test
    void refusesOnceExhaustedQuota17() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 2; i++) {
            subject.gauge17();
        }
        assertFalse(subject.gauge17());
    }

    @Test
    void accumulatesBelowTheCapDepth18() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.flatten18(1));
        assertEquals(3, subject.flatten18(2));
    }

    @Test
    void saturatesAtTheCapDepth18() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.flatten18(38);
        assertEquals(38, subject.flatten18(5));
    }

    @Test
    void ignoresNegativeValuesDepth18() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.flatten18(3);
        assertEquals(3, subject.flatten18(-2));
        assertEquals(3, subject.threshold18Value());
    }

    @Test
    void rejectsZeroDenominatorSpan19() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.kindle19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan19() {
        assertEquals(0.5, new NorthwardAnvil().kindle19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan19() {
        assertEquals(5.0, new NorthwardAnvil().kindle19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio20() {
        assertTrue(new NorthwardAnvil().winnow20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new NorthwardAnvil().winnow20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio20() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardAnvil().winnow20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth21() {
        assertEquals("below", new NorthwardAnvil().sift21(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth21() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.sift21(3));
        assertEquals("upper-bound", subject.sift21(10));
    }

    @Test
    void classifiesWithinAndAboveDepth21() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.sift21(3 + 1));
        assertEquals("above", subject.sift21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift22() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate22());
        }
        assertEquals(3, subject.bias22Count());
    }

    @Test
    void refusesOnceExhaustedDrift22() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 3; i++) {
            subject.collate22();
        }
        assertFalse(subject.collate22());
    }

    @Test
    void accumulatesBelowTheCapThreshold23() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.flatten23(1));
        assertEquals(3, subject.flatten23(2));
    }

    @Test
    void saturatesAtTheCapThreshold23() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.flatten23(43);
        assertEquals(43, subject.flatten23(5));
    }

    @Test
    void ignoresNegativeValuesThreshold23() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.flatten23(3);
        assertEquals(3, subject.flatten23(-2));
        assertEquals(3, subject.span23Value());
    }

    @Test
    void rejectsZeroDenominatorMargin24() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.temper24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin24() {
        assertEquals(0.5, new NorthwardAnvil().temper24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin24() {
        assertEquals(5.0, new NorthwardAnvil().temper24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight25() {
        assertTrue(new NorthwardAnvil().brace25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new NorthwardAnvil().brace25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight25() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardAnvil().brace25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin26() {
        assertEquals("below", new NorthwardAnvil().kindle26(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin26() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.kindle26(4));
        assertEquals("upper-bound", subject.kindle26(9));
    }

    @Test
    void classifiesWithinAndAboveMargin26() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.kindle26(4 + 1));
        assertEquals("above", subject.kindle26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias27() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal27());
        }
        assertEquals(4, subject.yield27Count());
    }

    @Test
    void refusesOnceExhaustedBias27() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 4; i++) {
            subject.anneal27();
        }
        assertFalse(subject.anneal27());
    }

    @Test
    void accumulatesBelowTheCapRatio28() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.flatten28(1));
        assertEquals(3, subject.flatten28(2));
    }

    @Test
    void saturatesAtTheCapRatio28() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.flatten28(48);
        assertEquals(48, subject.flatten28(5));
    }

    @Test
    void ignoresNegativeValuesRatio28() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.flatten28(3);
        assertEquals(3, subject.flatten28(-2));
        assertEquals(3, subject.depth28Value());
    }

    @Test
    void rejectsZeroDenominatorCadence29() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.temper29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence29() {
        assertEquals(0.5, new NorthwardAnvil().temper29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence29() {
        assertEquals(5.0, new NorthwardAnvil().temper29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield30() {
        assertTrue(new NorthwardAnvil().tally30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new NorthwardAnvil().tally30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield30() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardAnvil().tally30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence31() {
        assertEquals("below", new NorthwardAnvil().gauge31(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence31() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.gauge31(5));
        assertEquals("upper-bound", subject.gauge31(8));
    }

    @Test
    void classifiesWithinAndAboveCadence31() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.gauge31(5 + 1));
        assertEquals("above", subject.gauge31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold32() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist32());
        }
        assertEquals(1, subject.drift32Count());
    }

    @Test
    void refusesOnceExhaustedThreshold32() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 1; i++) {
            subject.hoist32();
        }
        assertFalse(subject.hoist32());
    }

    @Test
    void accumulatesBelowTheCapDepth33() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.winnow33(1));
        assertEquals(3, subject.winnow33(2));
    }

    @Test
    void saturatesAtTheCapDepth33() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.winnow33(53);
        assertEquals(53, subject.winnow33(5));
    }

    @Test
    void ignoresNegativeValuesDepth33() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.winnow33(3);
        assertEquals(3, subject.winnow33(-2));
        assertEquals(3, subject.span33Value());
    }

    @Test
    void rejectsZeroDenominatorDepth34() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.tally34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth34() {
        assertEquals(0.5, new NorthwardAnvil().tally34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth34() {
        assertEquals(5.0, new NorthwardAnvil().tally34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally35() {
        assertTrue(new NorthwardAnvil().hoist35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new NorthwardAnvil().hoist35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally35() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardAnvil().hoist35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity36() {
        assertEquals("below", new NorthwardAnvil().sift36(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity36() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.sift36(2));
        assertEquals("upper-bound", subject.sift36(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity36() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.sift36(2 + 1));
        assertEquals("above", subject.sift36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth37() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow37());
        }
        assertEquals(2, subject.tally37Count());
    }

    @Test
    void refusesOnceExhaustedDepth37() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 2; i++) {
            subject.winnow37();
        }
        assertFalse(subject.winnow37());
    }

    @Test
    void accumulatesBelowTheCapWeight38() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.collate38(1));
        assertEquals(3, subject.collate38(2));
    }

    @Test
    void saturatesAtTheCapWeight38() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.collate38(58);
        assertEquals(58, subject.collate38(5));
    }

    @Test
    void ignoresNegativeValuesWeight38() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.collate38(3);
        assertEquals(3, subject.collate38(-2));
        assertEquals(3, subject.margin38Value());
    }

    @Test
    void rejectsZeroDenominatorQuota39() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.temper39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota39() {
        assertEquals(0.5, new NorthwardAnvil().temper39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota39() {
        assertEquals(5.0, new NorthwardAnvil().temper39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth40() {
        assertTrue(new NorthwardAnvil().temper40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new NorthwardAnvil().temper40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth40() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardAnvil().temper40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence41() {
        assertEquals("below", new NorthwardAnvil().collate41(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence41() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.collate41(3));
        assertEquals("upper-bound", subject.collate41(12));
    }

    @Test
    void classifiesWithinAndAboveCadence41() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.collate41(3 + 1));
        assertEquals("above", subject.collate41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift42() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten42());
        }
        assertEquals(3, subject.capacity42Count());
    }

    @Test
    void refusesOnceExhaustedDrift42() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 3; i++) {
            subject.flatten42();
        }
        assertFalse(subject.flatten42());
    }

    @Test
    void accumulatesBelowTheCapThreshold43() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.furl43(1));
        assertEquals(3, subject.furl43(2));
    }

    @Test
    void saturatesAtTheCapThreshold43() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.furl43(23);
        assertEquals(23, subject.furl43(5));
    }

    @Test
    void ignoresNegativeValuesThreshold43() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.furl43(3);
        assertEquals(3, subject.furl43(-2));
        assertEquals(3, subject.capacity43Value());
    }

    @Test
    void rejectsZeroDenominatorTally44() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.sift44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally44() {
        assertEquals(0.5, new NorthwardAnvil().sift44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally44() {
        assertEquals(5.0, new NorthwardAnvil().sift44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio45() {
        assertTrue(new NorthwardAnvil().flatten45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new NorthwardAnvil().flatten45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio45() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardAnvil().flatten45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth46() {
        assertEquals("below", new NorthwardAnvil().hoist46(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth46() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.hoist46(4));
        assertEquals("upper-bound", subject.hoist46(11));
    }

    @Test
    void classifiesWithinAndAboveDepth46() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.hoist46(4 + 1));
        assertEquals("above", subject.hoist46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota47() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl47());
        }
        assertEquals(4, subject.yield47Count());
    }

    @Test
    void refusesOnceExhaustedQuota47() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 4; i++) {
            subject.furl47();
        }
        assertFalse(subject.furl47());
    }

    @Test
    void accumulatesBelowTheCapOffset48() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.tally48(1));
        assertEquals(3, subject.tally48(2));
    }

    @Test
    void saturatesAtTheCapOffset48() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.tally48(28);
        assertEquals(28, subject.tally48(5));
    }

    @Test
    void ignoresNegativeValuesOffset48() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.tally48(3);
        assertEquals(3, subject.tally48(-2));
        assertEquals(3, subject.quota48Value());
    }

    @Test
    void rejectsZeroDenominatorCadence49() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.tally49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence49() {
        assertEquals(0.5, new NorthwardAnvil().tally49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence49() {
        assertEquals(5.0, new NorthwardAnvil().tally49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield50() {
        assertTrue(new NorthwardAnvil().brace50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new NorthwardAnvil().brace50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield50() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardAnvil().brace50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally51() {
        assertEquals("below", new NorthwardAnvil().sift51(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally51() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.sift51(5));
        assertEquals("upper-bound", subject.sift51(10));
    }

    @Test
    void classifiesWithinAndAboveTally51() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.sift51(5 + 1));
        assertEquals("above", subject.sift51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin52() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile52());
        }
        assertEquals(1, subject.bias52Count());
    }

    @Test
    void refusesOnceExhaustedMargin52() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 1; i++) {
            subject.reconcile52();
        }
        assertFalse(subject.reconcile52());
    }

    @Test
    void accumulatesBelowTheCapYield53() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.reconcile53(1));
        assertEquals(3, subject.reconcile53(2));
    }

    @Test
    void saturatesAtTheCapYield53() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.reconcile53(33);
        assertEquals(33, subject.reconcile53(5));
    }

    @Test
    void ignoresNegativeValuesYield53() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.reconcile53(3);
        assertEquals(3, subject.reconcile53(-2));
        assertEquals(3, subject.span53Value());
    }

    @Test
    void rejectsZeroDenominatorYield54() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.prune54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield54() {
        assertEquals(0.5, new NorthwardAnvil().prune54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield54() {
        assertEquals(5.0, new NorthwardAnvil().prune54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift55() {
        assertTrue(new NorthwardAnvil().reconcile55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new NorthwardAnvil().reconcile55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift55() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardAnvil().reconcile55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan56() {
        assertEquals("below", new NorthwardAnvil().brace56(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan56() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.brace56(2));
        assertEquals("upper-bound", subject.brace56(9));
    }

    @Test
    void classifiesWithinAndAboveSpan56() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.brace56(2 + 1));
        assertEquals("above", subject.brace56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota57() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate57());
        }
        assertEquals(2, subject.depth57Count());
    }

    @Test
    void refusesOnceExhaustedQuota57() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 2; i++) {
            subject.collate57();
        }
        assertFalse(subject.collate57());
    }

    @Test
    void accumulatesBelowTheCapRatio58() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.kindle58(1));
        assertEquals(3, subject.kindle58(2));
    }

    @Test
    void saturatesAtTheCapRatio58() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.kindle58(38);
        assertEquals(38, subject.kindle58(5));
    }

    @Test
    void ignoresNegativeValuesRatio58() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.kindle58(3);
        assertEquals(3, subject.kindle58(-2));
        assertEquals(3, subject.tally58Value());
    }

    @Test
    void rejectsZeroDenominatorYield59() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.hoist59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield59() {
        assertEquals(0.5, new NorthwardAnvil().hoist59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield59() {
        assertEquals(5.0, new NorthwardAnvil().hoist59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan60() {
        assertTrue(new NorthwardAnvil().prune60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new NorthwardAnvil().prune60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan60() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardAnvil().prune60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity61() {
        assertEquals("below", new NorthwardAnvil().sift61(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity61() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.sift61(3));
        assertEquals("upper-bound", subject.sift61(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity61() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.sift61(3 + 1));
        assertEquals("above", subject.sift61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally62() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift62());
        }
        assertEquals(3, subject.drift62Count());
    }

    @Test
    void refusesOnceExhaustedTally62() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 3; i++) {
            subject.sift62();
        }
        assertFalse(subject.sift62());
    }

    @Test
    void accumulatesBelowTheCapCadence63() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.flatten63(1));
        assertEquals(3, subject.flatten63(2));
    }

    @Test
    void saturatesAtTheCapCadence63() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.flatten63(43);
        assertEquals(43, subject.flatten63(5));
    }

    @Test
    void ignoresNegativeValuesCadence63() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.flatten63(3);
        assertEquals(3, subject.flatten63(-2));
        assertEquals(3, subject.drift63Value());
    }

    @Test
    void rejectsZeroDenominatorQuota64() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.temper64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota64() {
        assertEquals(0.5, new NorthwardAnvil().temper64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota64() {
        assertEquals(5.0, new NorthwardAnvil().temper64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight65() {
        assertTrue(new NorthwardAnvil().kindle65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new NorthwardAnvil().kindle65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight65() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardAnvil().kindle65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias66() {
        assertEquals("below", new NorthwardAnvil().reconcile66(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias66() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.reconcile66(4));
        assertEquals("upper-bound", subject.reconcile66(7));
    }

    @Test
    void classifiesWithinAndAboveBias66() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.reconcile66(4 + 1));
        assertEquals("above", subject.reconcile66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally67() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal67());
        }
        assertEquals(4, subject.drift67Count());
    }

    @Test
    void refusesOnceExhaustedTally67() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 4; i++) {
            subject.anneal67();
        }
        assertFalse(subject.anneal67());
    }

    @Test
    void accumulatesBelowTheCapMargin68() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.anneal68(1));
        assertEquals(3, subject.anneal68(2));
    }

    @Test
    void saturatesAtTheCapMargin68() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.anneal68(48);
        assertEquals(48, subject.anneal68(5));
    }

    @Test
    void ignoresNegativeValuesMargin68() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.anneal68(3);
        assertEquals(3, subject.anneal68(-2));
        assertEquals(3, subject.offset68Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold69() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.brace69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold69() {
        assertEquals(0.5, new NorthwardAnvil().brace69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold69() {
        assertEquals(5.0, new NorthwardAnvil().brace69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift70() {
        assertTrue(new NorthwardAnvil().hoist70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new NorthwardAnvil().hoist70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift70() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardAnvil().hoist70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota71() {
        assertEquals("below", new NorthwardAnvil().sift71(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota71() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.sift71(5));
        assertEquals("upper-bound", subject.sift71(12));
    }

    @Test
    void classifiesWithinAndAboveQuota71() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.sift71(5 + 1));
        assertEquals("above", subject.sift71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity72() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace72());
        }
        assertEquals(1, subject.margin72Count());
    }

    @Test
    void refusesOnceExhaustedCapacity72() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 1; i++) {
            subject.brace72();
        }
        assertFalse(subject.brace72());
    }

    @Test
    void accumulatesBelowTheCapDepth73() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.winnow73(1));
        assertEquals(3, subject.winnow73(2));
    }

    @Test
    void saturatesAtTheCapDepth73() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.winnow73(53);
        assertEquals(53, subject.winnow73(5));
    }

    @Test
    void ignoresNegativeValuesDepth73() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.winnow73(3);
        assertEquals(3, subject.winnow73(-2));
        assertEquals(3, subject.offset73Value());
    }

    @Test
    void rejectsZeroDenominatorWeight74() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.flatten74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight74() {
        assertEquals(0.5, new NorthwardAnvil().flatten74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight74() {
        assertEquals(5.0, new NorthwardAnvil().flatten74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio75() {
        assertTrue(new NorthwardAnvil().collate75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new NorthwardAnvil().collate75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio75() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardAnvil().collate75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight76() {
        assertEquals("below", new NorthwardAnvil().brace76(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight76() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.brace76(2));
        assertEquals("upper-bound", subject.brace76(11));
    }

    @Test
    void classifiesWithinAndAboveWeight76() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.brace76(2 + 1));
        assertEquals("above", subject.brace76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset77() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace77());
        }
        assertEquals(2, subject.ratio77Count());
    }

    @Test
    void refusesOnceExhaustedOffset77() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 2; i++) {
            subject.brace77();
        }
        assertFalse(subject.brace77());
    }

    @Test
    void accumulatesBelowTheCapRatio78() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.hoist78(1));
        assertEquals(3, subject.hoist78(2));
    }

    @Test
    void saturatesAtTheCapRatio78() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.hoist78(58);
        assertEquals(58, subject.hoist78(5));
    }

    @Test
    void ignoresNegativeValuesRatio78() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.hoist78(3);
        assertEquals(3, subject.hoist78(-2));
        assertEquals(3, subject.capacity78Value());
    }

    @Test
    void rejectsZeroDenominatorDrift79() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.reconcile79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift79() {
        assertEquals(0.5, new NorthwardAnvil().reconcile79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift79() {
        assertEquals(5.0, new NorthwardAnvil().reconcile79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan80() {
        assertTrue(new NorthwardAnvil().flatten80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new NorthwardAnvil().flatten80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan80() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardAnvil().flatten80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally81() {
        assertEquals("below", new NorthwardAnvil().sift81(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally81() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.sift81(3));
        assertEquals("upper-bound", subject.sift81(10));
    }

    @Test
    void classifiesWithinAndAboveTally81() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.sift81(3 + 1));
        assertEquals("above", subject.sift81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset82() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten82());
        }
        assertEquals(3, subject.tally82Count());
    }

    @Test
    void refusesOnceExhaustedOffset82() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 3; i++) {
            subject.flatten82();
        }
        assertFalse(subject.flatten82());
    }

    @Test
    void accumulatesBelowTheCapCadence83() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.kindle83(1));
        assertEquals(3, subject.kindle83(2));
    }

    @Test
    void saturatesAtTheCapCadence83() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.kindle83(23);
        assertEquals(23, subject.kindle83(5));
    }

    @Test
    void ignoresNegativeValuesCadence83() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.kindle83(3);
        assertEquals(3, subject.kindle83(-2));
        assertEquals(3, subject.capacity83Value());
    }

    @Test
    void rejectsZeroDenominatorYield84() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.anneal84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield84() {
        assertEquals(0.5, new NorthwardAnvil().anneal84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield84() {
        assertEquals(5.0, new NorthwardAnvil().anneal84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio85() {
        assertTrue(new NorthwardAnvil().kindle85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new NorthwardAnvil().kindle85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio85() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardAnvil().kindle85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin86() {
        assertEquals("below", new NorthwardAnvil().hoist86(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin86() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.hoist86(4));
        assertEquals("upper-bound", subject.hoist86(9));
    }

    @Test
    void classifiesWithinAndAboveMargin86() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.hoist86(4 + 1));
        assertEquals("above", subject.hoist86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota87() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten87());
        }
        assertEquals(4, subject.tally87Count());
    }

    @Test
    void refusesOnceExhaustedQuota87() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 4; i++) {
            subject.flatten87();
        }
        assertFalse(subject.flatten87());
    }

    @Test
    void accumulatesBelowTheCapDepth88() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.anneal88(1));
        assertEquals(3, subject.anneal88(2));
    }

    @Test
    void saturatesAtTheCapDepth88() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.anneal88(28);
        assertEquals(28, subject.anneal88(5));
    }

    @Test
    void ignoresNegativeValuesDepth88() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.anneal88(3);
        assertEquals(3, subject.anneal88(-2));
        assertEquals(3, subject.ratio88Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold89() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.temper89(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold89() {
        assertEquals(0.5, new NorthwardAnvil().temper89(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold89() {
        assertEquals(5.0, new NorthwardAnvil().temper89(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence90() {
        assertTrue(new NorthwardAnvil().brace90(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence90() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new NorthwardAnvil().brace90(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence90() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardAnvil().brace90(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold91() {
        assertEquals("below", new NorthwardAnvil().reconcile91(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold91() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.reconcile91(5));
        assertEquals("upper-bound", subject.reconcile91(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold91() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.reconcile91(5 + 1));
        assertEquals("above", subject.reconcile91(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence92() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace92());
        }
        assertEquals(1, subject.offset92Count());
    }

    @Test
    void refusesOnceExhaustedCadence92() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 1; i++) {
            subject.brace92();
        }
        assertFalse(subject.brace92());
    }

    @Test
    void accumulatesBelowTheCapRatio93() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.sift93(1));
        assertEquals(3, subject.sift93(2));
    }

    @Test
    void saturatesAtTheCapRatio93() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.sift93(33);
        assertEquals(33, subject.sift93(5));
    }

    @Test
    void ignoresNegativeValuesRatio93() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.sift93(3);
        assertEquals(3, subject.sift93(-2));
        assertEquals(3, subject.weight93Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold94() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.sift94(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold94() {
        assertEquals(0.5, new NorthwardAnvil().sift94(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold94() {
        assertEquals(5.0, new NorthwardAnvil().sift94(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield95() {
        assertTrue(new NorthwardAnvil().anneal95(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield95() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new NorthwardAnvil().anneal95(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield95() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardAnvil().anneal95(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota96() {
        assertEquals("below", new NorthwardAnvil().gauge96(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota96() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.gauge96(2));
        assertEquals("upper-bound", subject.gauge96(7));
    }

    @Test
    void classifiesWithinAndAboveQuota96() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.gauge96(2 + 1));
        assertEquals("above", subject.gauge96(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota97() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge97());
        }
        assertEquals(2, subject.cadence97Count());
    }

    @Test
    void refusesOnceExhaustedQuota97() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 2; i++) {
            subject.gauge97();
        }
        assertFalse(subject.gauge97());
    }

    @Test
    void accumulatesBelowTheCapRatio98() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.furl98(1));
        assertEquals(3, subject.furl98(2));
    }

    @Test
    void saturatesAtTheCapRatio98() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.furl98(38);
        assertEquals(38, subject.furl98(5));
    }

    @Test
    void ignoresNegativeValuesRatio98() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.furl98(3);
        assertEquals(3, subject.furl98(-2));
        assertEquals(3, subject.weight98Value());
    }

    @Test
    void rejectsZeroDenominatorWeight99() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.temper99(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight99() {
        assertEquals(0.5, new NorthwardAnvil().temper99(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight99() {
        assertEquals(5.0, new NorthwardAnvil().temper99(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth100() {
        assertTrue(new NorthwardAnvil().flatten100(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth100() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new NorthwardAnvil().flatten100(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth100() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardAnvil().flatten100(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias101() {
        assertEquals("below", new NorthwardAnvil().hoist101(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias101() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.hoist101(3));
        assertEquals("upper-bound", subject.hoist101(12));
    }

    @Test
    void classifiesWithinAndAboveBias101() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.hoist101(3 + 1));
        assertEquals("above", subject.hoist101(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight102() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal102());
        }
        assertEquals(3, subject.yield102Count());
    }

    @Test
    void refusesOnceExhaustedWeight102() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 3; i++) {
            subject.anneal102();
        }
        assertFalse(subject.anneal102());
    }

    @Test
    void accumulatesBelowTheCapRatio103() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.tally103(1));
        assertEquals(3, subject.tally103(2));
    }

    @Test
    void saturatesAtTheCapRatio103() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.tally103(43);
        assertEquals(43, subject.tally103(5));
    }

    @Test
    void ignoresNegativeValuesRatio103() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.tally103(3);
        assertEquals(3, subject.tally103(-2));
        assertEquals(3, subject.yield103Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold104() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.gauge104(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold104() {
        assertEquals(0.5, new NorthwardAnvil().gauge104(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold104() {
        assertEquals(5.0, new NorthwardAnvil().gauge104(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan105() {
        assertTrue(new NorthwardAnvil().gauge105(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan105() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new NorthwardAnvil().gauge105(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan105() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardAnvil().gauge105(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence106() {
        assertEquals("below", new NorthwardAnvil().flatten106(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence106() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.flatten106(4));
        assertEquals("upper-bound", subject.flatten106(11));
    }

    @Test
    void classifiesWithinAndAboveCadence106() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.flatten106(4 + 1));
        assertEquals("above", subject.flatten106(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota107() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile107());
        }
        assertEquals(4, subject.weight107Count());
    }

    @Test
    void refusesOnceExhaustedQuota107() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 4; i++) {
            subject.reconcile107();
        }
        assertFalse(subject.reconcile107());
    }

    @Test
    void accumulatesBelowTheCapDrift108() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.furl108(1));
        assertEquals(3, subject.furl108(2));
    }

    @Test
    void saturatesAtTheCapDrift108() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.furl108(48);
        assertEquals(48, subject.furl108(5));
    }

    @Test
    void ignoresNegativeValuesDrift108() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.furl108(3);
        assertEquals(3, subject.furl108(-2));
        assertEquals(3, subject.span108Value());
    }

    @Test
    void rejectsZeroDenominatorMargin109() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.sift109(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin109() {
        assertEquals(0.5, new NorthwardAnvil().sift109(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin109() {
        assertEquals(5.0, new NorthwardAnvil().sift109(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence110() {
        assertTrue(new NorthwardAnvil().gauge110(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence110() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new NorthwardAnvil().gauge110(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence110() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardAnvil().gauge110(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold111() {
        assertEquals("below", new NorthwardAnvil().sift111(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold111() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.sift111(5));
        assertEquals("upper-bound", subject.sift111(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold111() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.sift111(5 + 1));
        assertEquals("above", subject.sift111(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio112() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate112());
        }
        assertEquals(1, subject.span112Count());
    }

    @Test
    void refusesOnceExhaustedRatio112() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 1; i++) {
            subject.collate112();
        }
        assertFalse(subject.collate112());
    }

    @Test
    void accumulatesBelowTheCapYield113() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.brace113(1));
        assertEquals(3, subject.brace113(2));
    }

    @Test
    void saturatesAtTheCapYield113() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.brace113(53);
        assertEquals(53, subject.brace113(5));
    }

    @Test
    void ignoresNegativeValuesYield113() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.brace113(3);
        assertEquals(3, subject.brace113(-2));
        assertEquals(3, subject.threshold113Value());
    }

    @Test
    void rejectsZeroDenominatorRatio114() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.furl114(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio114() {
        assertEquals(0.5, new NorthwardAnvil().furl114(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio114() {
        assertEquals(5.0, new NorthwardAnvil().furl114(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift115() {
        assertTrue(new NorthwardAnvil().temper115(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift115() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new NorthwardAnvil().temper115(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift115() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardAnvil().temper115(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift116() {
        assertEquals("below", new NorthwardAnvil().temper116(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift116() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.temper116(2));
        assertEquals("upper-bound", subject.temper116(9));
    }

    @Test
    void classifiesWithinAndAboveDrift116() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.temper116(2 + 1));
        assertEquals("above", subject.temper116(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin117() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow117());
        }
        assertEquals(2, subject.ratio117Count());
    }

    @Test
    void refusesOnceExhaustedMargin117() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 2; i++) {
            subject.winnow117();
        }
        assertFalse(subject.winnow117());
    }

    @Test
    void accumulatesBelowTheCapQuota118() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.gauge118(1));
        assertEquals(3, subject.gauge118(2));
    }

    @Test
    void saturatesAtTheCapQuota118() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.gauge118(58);
        assertEquals(58, subject.gauge118(5));
    }

    @Test
    void ignoresNegativeValuesQuota118() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.gauge118(3);
        assertEquals(3, subject.gauge118(-2));
        assertEquals(3, subject.drift118Value());
    }

    @Test
    void rejectsZeroDenominatorMargin119() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.brace119(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin119() {
        assertEquals(0.5, new NorthwardAnvil().brace119(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin119() {
        assertEquals(5.0, new NorthwardAnvil().brace119(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio120() {
        assertTrue(new NorthwardAnvil().reconcile120(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio120() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new NorthwardAnvil().reconcile120(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio120() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardAnvil().reconcile120(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias121() {
        assertEquals("below", new NorthwardAnvil().temper121(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias121() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.temper121(3));
        assertEquals("upper-bound", subject.temper121(8));
    }

    @Test
    void classifiesWithinAndAboveBias121() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.temper121(3 + 1));
        assertEquals("above", subject.temper121(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan122() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile122());
        }
        assertEquals(3, subject.margin122Count());
    }

    @Test
    void refusesOnceExhaustedSpan122() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 3; i++) {
            subject.reconcile122();
        }
        assertFalse(subject.reconcile122());
    }

    @Test
    void accumulatesBelowTheCapRatio123() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.kindle123(1));
        assertEquals(3, subject.kindle123(2));
    }

    @Test
    void saturatesAtTheCapRatio123() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.kindle123(23);
        assertEquals(23, subject.kindle123(5));
    }

    @Test
    void ignoresNegativeValuesRatio123() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.kindle123(3);
        assertEquals(3, subject.kindle123(-2));
        assertEquals(3, subject.depth123Value());
    }

    @Test
    void rejectsZeroDenominatorDrift124() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.collate124(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift124() {
        assertEquals(0.5, new NorthwardAnvil().collate124(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift124() {
        assertEquals(5.0, new NorthwardAnvil().collate124(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin125() {
        assertTrue(new NorthwardAnvil().sift125(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin125() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new NorthwardAnvil().sift125(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin125() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardAnvil().sift125(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight126() {
        assertEquals("below", new NorthwardAnvil().gauge126(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight126() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.gauge126(4));
        assertEquals("upper-bound", subject.gauge126(7));
    }

    @Test
    void classifiesWithinAndAboveWeight126() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.gauge126(4 + 1));
        assertEquals("above", subject.gauge126(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan127() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate127());
        }
        assertEquals(4, subject.ratio127Count());
    }

    @Test
    void refusesOnceExhaustedSpan127() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 4; i++) {
            subject.collate127();
        }
        assertFalse(subject.collate127());
    }

    @Test
    void accumulatesBelowTheCapWeight128() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.prune128(1));
        assertEquals(3, subject.prune128(2));
    }

    @Test
    void saturatesAtTheCapWeight128() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.prune128(28);
        assertEquals(28, subject.prune128(5));
    }

    @Test
    void ignoresNegativeValuesWeight128() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.prune128(3);
        assertEquals(3, subject.prune128(-2));
        assertEquals(3, subject.offset128Value());
    }

    @Test
    void rejectsZeroDenominatorDrift129() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.brace129(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift129() {
        assertEquals(0.5, new NorthwardAnvil().brace129(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift129() {
        assertEquals(5.0, new NorthwardAnvil().brace129(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift130() {
        assertTrue(new NorthwardAnvil().flatten130(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift130() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new NorthwardAnvil().flatten130(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift130() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardAnvil().flatten130(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity131() {
        assertEquals("below", new NorthwardAnvil().hoist131(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity131() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("lower-bound", subject.hoist131(5));
        assertEquals("upper-bound", subject.hoist131(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity131() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals("within", subject.hoist131(5 + 1));
        assertEquals("above", subject.hoist131(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset132() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate132());
        }
        assertEquals(1, subject.yield132Count());
    }

    @Test
    void refusesOnceExhaustedOffset132() {
        NorthwardAnvil subject = new NorthwardAnvil();
        for (int i = 0; i < 1; i++) {
            subject.collate132();
        }
        assertFalse(subject.collate132());
    }

    @Test
    void accumulatesBelowTheCapDrift133() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertEquals(1, subject.kindle133(1));
        assertEquals(3, subject.kindle133(2));
    }

    @Test
    void saturatesAtTheCapDrift133() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.kindle133(33);
        assertEquals(33, subject.kindle133(5));
    }

    @Test
    void ignoresNegativeValuesDrift133() {
        NorthwardAnvil subject = new NorthwardAnvil();
        subject.kindle133(3);
        assertEquals(3, subject.kindle133(-2));
        assertEquals(3, subject.bias133Value());
    }

    @Test
    void rejectsZeroDenominatorCadence134() {
        NorthwardAnvil subject = new NorthwardAnvil();
        assertThrows(ArithmeticException.class, () -> subject.kindle134(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence134() {
        assertEquals(0.5, new NorthwardAnvil().kindle134(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence134() {
        assertEquals(5.0, new NorthwardAnvil().kindle134(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally135() {
        assertTrue(new NorthwardAnvil().flatten135(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally135() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new NorthwardAnvil().flatten135(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally135() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardAnvil().flatten135(java.util.Arrays.asList(null, 6, null)));
    }
}
