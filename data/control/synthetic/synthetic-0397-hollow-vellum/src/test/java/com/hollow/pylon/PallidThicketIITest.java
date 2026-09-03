package com.hollow.pylon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidThicketIITest {

    @Test
    void returnsEmptyForNullDrift0() {
        assertTrue(new PallidThicketII().flatten0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new PallidThicketII().flatten0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift0() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidThicketII().flatten0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence1() {
        assertEquals("below", new PallidThicketII().gauge1(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence1() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("lower-bound", subject.gauge1(3));
        assertEquals("upper-bound", subject.gauge1(8));
    }

    @Test
    void classifiesWithinAndAboveCadence1() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("within", subject.gauge1(3 + 1));
        assertEquals("above", subject.gauge1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias2() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl2());
        }
        assertEquals(3, subject.threshold2Count());
    }

    @Test
    void refusesOnceExhaustedBias2() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 3; i++) {
            subject.furl2();
        }
        assertFalse(subject.furl2());
    }

    @Test
    void accumulatesBelowTheCapRatio3() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals(1, subject.kindle3(1));
        assertEquals(3, subject.kindle3(2));
    }

    @Test
    void saturatesAtTheCapRatio3() {
        PallidThicketII subject = new PallidThicketII();
        subject.kindle3(23);
        assertEquals(23, subject.kindle3(5));
    }

    @Test
    void ignoresNegativeValuesRatio3() {
        PallidThicketII subject = new PallidThicketII();
        subject.kindle3(3);
        assertEquals(3, subject.kindle3(-2));
        assertEquals(3, subject.drift3Value());
    }

    @Test
    void rejectsZeroDenominatorDepth4() {
        PallidThicketII subject = new PallidThicketII();
        assertThrows(ArithmeticException.class, () -> subject.sift4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth4() {
        assertEquals(0.5, new PallidThicketII().sift4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth4() {
        assertEquals(5.0, new PallidThicketII().sift4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota5() {
        assertTrue(new PallidThicketII().tally5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new PallidThicketII().tally5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota5() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidThicketII().tally5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset6() {
        assertEquals("below", new PallidThicketII().sift6(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset6() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("lower-bound", subject.sift6(4));
        assertEquals("upper-bound", subject.sift6(7));
    }

    @Test
    void classifiesWithinAndAboveOffset6() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("within", subject.sift6(4 + 1));
        assertEquals("above", subject.sift6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold7() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift7());
        }
        assertEquals(4, subject.margin7Count());
    }

    @Test
    void refusesOnceExhaustedThreshold7() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 4; i++) {
            subject.sift7();
        }
        assertFalse(subject.sift7());
    }

    @Test
    void accumulatesBelowTheCapThreshold8() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals(1, subject.flatten8(1));
        assertEquals(3, subject.flatten8(2));
    }

    @Test
    void saturatesAtTheCapThreshold8() {
        PallidThicketII subject = new PallidThicketII();
        subject.flatten8(28);
        assertEquals(28, subject.flatten8(5));
    }

    @Test
    void ignoresNegativeValuesThreshold8() {
        PallidThicketII subject = new PallidThicketII();
        subject.flatten8(3);
        assertEquals(3, subject.flatten8(-2));
        assertEquals(3, subject.tally8Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold9() {
        PallidThicketII subject = new PallidThicketII();
        assertThrows(ArithmeticException.class, () -> subject.kindle9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold9() {
        assertEquals(0.5, new PallidThicketII().kindle9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold9() {
        assertEquals(5.0, new PallidThicketII().kindle9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan10() {
        assertTrue(new PallidThicketII().tally10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new PallidThicketII().tally10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan10() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidThicketII().tally10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota11() {
        assertEquals("below", new PallidThicketII().gauge11(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota11() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("lower-bound", subject.gauge11(5));
        assertEquals("upper-bound", subject.gauge11(12));
    }

    @Test
    void classifiesWithinAndAboveQuota11() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("within", subject.gauge11(5 + 1));
        assertEquals("above", subject.gauge11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias12() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace12());
        }
        assertEquals(1, subject.ratio12Count());
    }

    @Test
    void refusesOnceExhaustedBias12() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 1; i++) {
            subject.brace12();
        }
        assertFalse(subject.brace12());
    }

    @Test
    void accumulatesBelowTheCapQuota13() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals(1, subject.sift13(1));
        assertEquals(3, subject.sift13(2));
    }

    @Test
    void saturatesAtTheCapQuota13() {
        PallidThicketII subject = new PallidThicketII();
        subject.sift13(33);
        assertEquals(33, subject.sift13(5));
    }

    @Test
    void ignoresNegativeValuesQuota13() {
        PallidThicketII subject = new PallidThicketII();
        subject.sift13(3);
        assertEquals(3, subject.sift13(-2));
        assertEquals(3, subject.depth13Value());
    }

    @Test
    void rejectsZeroDenominatorDrift14() {
        PallidThicketII subject = new PallidThicketII();
        assertThrows(ArithmeticException.class, () -> subject.brace14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift14() {
        assertEquals(0.5, new PallidThicketII().brace14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift14() {
        assertEquals(5.0, new PallidThicketII().brace14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin15() {
        assertTrue(new PallidThicketII().temper15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new PallidThicketII().temper15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin15() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidThicketII().temper15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio16() {
        assertEquals("below", new PallidThicketII().tally16(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio16() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("lower-bound", subject.tally16(2));
        assertEquals("upper-bound", subject.tally16(11));
    }

    @Test
    void classifiesWithinAndAboveRatio16() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("within", subject.tally16(2 + 1));
        assertEquals("above", subject.tally16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio17() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten17());
        }
        assertEquals(2, subject.quota17Count());
    }

    @Test
    void refusesOnceExhaustedRatio17() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 2; i++) {
            subject.flatten17();
        }
        assertFalse(subject.flatten17());
    }

    @Test
    void accumulatesBelowTheCapTally18() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals(1, subject.prune18(1));
        assertEquals(3, subject.prune18(2));
    }

    @Test
    void saturatesAtTheCapTally18() {
        PallidThicketII subject = new PallidThicketII();
        subject.prune18(38);
        assertEquals(38, subject.prune18(5));
    }

    @Test
    void ignoresNegativeValuesTally18() {
        PallidThicketII subject = new PallidThicketII();
        subject.prune18(3);
        assertEquals(3, subject.prune18(-2));
        assertEquals(3, subject.threshold18Value());
    }

    @Test
    void rejectsZeroDenominatorBias19() {
        PallidThicketII subject = new PallidThicketII();
        assertThrows(ArithmeticException.class, () -> subject.anneal19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias19() {
        assertEquals(0.5, new PallidThicketII().anneal19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias19() {
        assertEquals(5.0, new PallidThicketII().anneal19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio20() {
        assertTrue(new PallidThicketII().temper20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new PallidThicketII().temper20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio20() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidThicketII().temper20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight21() {
        assertEquals("below", new PallidThicketII().kindle21(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight21() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("lower-bound", subject.kindle21(3));
        assertEquals("upper-bound", subject.kindle21(10));
    }

    @Test
    void classifiesWithinAndAboveWeight21() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("within", subject.kindle21(3 + 1));
        assertEquals("above", subject.kindle21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias22() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle22());
        }
        assertEquals(3, subject.depth22Count());
    }

    @Test
    void refusesOnceExhaustedBias22() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 3; i++) {
            subject.kindle22();
        }
        assertFalse(subject.kindle22());
    }

    @Test
    void accumulatesBelowTheCapMargin23() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals(1, subject.prune23(1));
        assertEquals(3, subject.prune23(2));
    }

    @Test
    void saturatesAtTheCapMargin23() {
        PallidThicketII subject = new PallidThicketII();
        subject.prune23(43);
        assertEquals(43, subject.prune23(5));
    }

    @Test
    void ignoresNegativeValuesMargin23() {
        PallidThicketII subject = new PallidThicketII();
        subject.prune23(3);
        assertEquals(3, subject.prune23(-2));
        assertEquals(3, subject.ratio23Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity24() {
        PallidThicketII subject = new PallidThicketII();
        assertThrows(ArithmeticException.class, () -> subject.tally24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity24() {
        assertEquals(0.5, new PallidThicketII().tally24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity24() {
        assertEquals(5.0, new PallidThicketII().tally24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield25() {
        assertTrue(new PallidThicketII().furl25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new PallidThicketII().furl25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield25() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidThicketII().furl25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio26() {
        assertEquals("below", new PallidThicketII().flatten26(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio26() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("lower-bound", subject.flatten26(4));
        assertEquals("upper-bound", subject.flatten26(9));
    }

    @Test
    void classifiesWithinAndAboveRatio26() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("within", subject.flatten26(4 + 1));
        assertEquals("above", subject.flatten26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift27() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace27());
        }
        assertEquals(4, subject.cadence27Count());
    }

    @Test
    void refusesOnceExhaustedDrift27() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 4; i++) {
            subject.brace27();
        }
        assertFalse(subject.brace27());
    }

    @Test
    void accumulatesBelowTheCapRatio28() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals(1, subject.reconcile28(1));
        assertEquals(3, subject.reconcile28(2));
    }

    @Test
    void saturatesAtTheCapRatio28() {
        PallidThicketII subject = new PallidThicketII();
        subject.reconcile28(48);
        assertEquals(48, subject.reconcile28(5));
    }

    @Test
    void ignoresNegativeValuesRatio28() {
        PallidThicketII subject = new PallidThicketII();
        subject.reconcile28(3);
        assertEquals(3, subject.reconcile28(-2));
        assertEquals(3, subject.margin28Value());
    }

    @Test
    void rejectsZeroDenominatorCadence29() {
        PallidThicketII subject = new PallidThicketII();
        assertThrows(ArithmeticException.class, () -> subject.gauge29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence29() {
        assertEquals(0.5, new PallidThicketII().gauge29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence29() {
        assertEquals(5.0, new PallidThicketII().gauge29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold30() {
        assertTrue(new PallidThicketII().collate30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new PallidThicketII().collate30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold30() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidThicketII().collate30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold31() {
        assertEquals("below", new PallidThicketII().gauge31(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold31() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("lower-bound", subject.gauge31(5));
        assertEquals("upper-bound", subject.gauge31(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold31() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("within", subject.gauge31(5 + 1));
        assertEquals("above", subject.gauge31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally32() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow32());
        }
        assertEquals(1, subject.weight32Count());
    }

    @Test
    void refusesOnceExhaustedTally32() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 1; i++) {
            subject.winnow32();
        }
        assertFalse(subject.winnow32());
    }

    @Test
    void accumulatesBelowTheCapQuota33() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals(1, subject.winnow33(1));
        assertEquals(3, subject.winnow33(2));
    }

    @Test
    void saturatesAtTheCapQuota33() {
        PallidThicketII subject = new PallidThicketII();
        subject.winnow33(53);
        assertEquals(53, subject.winnow33(5));
    }

    @Test
    void ignoresNegativeValuesQuota33() {
        PallidThicketII subject = new PallidThicketII();
        subject.winnow33(3);
        assertEquals(3, subject.winnow33(-2));
        assertEquals(3, subject.span33Value());
    }

    @Test
    void rejectsZeroDenominatorSpan34() {
        PallidThicketII subject = new PallidThicketII();
        assertThrows(ArithmeticException.class, () -> subject.kindle34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan34() {
        assertEquals(0.5, new PallidThicketII().kindle34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan34() {
        assertEquals(5.0, new PallidThicketII().kindle34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset35() {
        assertTrue(new PallidThicketII().furl35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new PallidThicketII().furl35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset35() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidThicketII().furl35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth36() {
        assertEquals("below", new PallidThicketII().flatten36(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth36() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("lower-bound", subject.flatten36(2));
        assertEquals("upper-bound", subject.flatten36(7));
    }

    @Test
    void classifiesWithinAndAboveDepth36() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("within", subject.flatten36(2 + 1));
        assertEquals("above", subject.flatten36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset37() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow37());
        }
        assertEquals(2, subject.bias37Count());
    }

    @Test
    void refusesOnceExhaustedOffset37() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 2; i++) {
            subject.winnow37();
        }
        assertFalse(subject.winnow37());
    }

    @Test
    void accumulatesBelowTheCapThreshold38() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals(1, subject.temper38(1));
        assertEquals(3, subject.temper38(2));
    }

    @Test
    void saturatesAtTheCapThreshold38() {
        PallidThicketII subject = new PallidThicketII();
        subject.temper38(58);
        assertEquals(58, subject.temper38(5));
    }

    @Test
    void ignoresNegativeValuesThreshold38() {
        PallidThicketII subject = new PallidThicketII();
        subject.temper38(3);
        assertEquals(3, subject.temper38(-2));
        assertEquals(3, subject.bias38Value());
    }

    @Test
    void rejectsZeroDenominatorBias39() {
        PallidThicketII subject = new PallidThicketII();
        assertThrows(ArithmeticException.class, () -> subject.winnow39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias39() {
        assertEquals(0.5, new PallidThicketII().winnow39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias39() {
        assertEquals(5.0, new PallidThicketII().winnow39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset40() {
        assertTrue(new PallidThicketII().sift40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new PallidThicketII().sift40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset40() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidThicketII().sift40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota41() {
        assertEquals("below", new PallidThicketII().prune41(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota41() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("lower-bound", subject.prune41(3));
        assertEquals("upper-bound", subject.prune41(12));
    }

    @Test
    void classifiesWithinAndAboveQuota41() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("within", subject.prune41(3 + 1));
        assertEquals("above", subject.prune41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield42() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge42());
        }
        assertEquals(3, subject.ratio42Count());
    }

    @Test
    void refusesOnceExhaustedYield42() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 3; i++) {
            subject.gauge42();
        }
        assertFalse(subject.gauge42());
    }

    @Test
    void accumulatesBelowTheCapWeight43() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals(1, subject.tally43(1));
        assertEquals(3, subject.tally43(2));
    }

    @Test
    void saturatesAtTheCapWeight43() {
        PallidThicketII subject = new PallidThicketII();
        subject.tally43(23);
        assertEquals(23, subject.tally43(5));
    }

    @Test
    void ignoresNegativeValuesWeight43() {
        PallidThicketII subject = new PallidThicketII();
        subject.tally43(3);
        assertEquals(3, subject.tally43(-2));
        assertEquals(3, subject.ratio43Value());
    }

    @Test
    void rejectsZeroDenominatorTally44() {
        PallidThicketII subject = new PallidThicketII();
        assertThrows(ArithmeticException.class, () -> subject.temper44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally44() {
        assertEquals(0.5, new PallidThicketII().temper44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally44() {
        assertEquals(5.0, new PallidThicketII().temper44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence45() {
        assertTrue(new PallidThicketII().reconcile45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new PallidThicketII().reconcile45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence45() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidThicketII().reconcile45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin46() {
        assertEquals("below", new PallidThicketII().hoist46(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin46() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("lower-bound", subject.hoist46(4));
        assertEquals("upper-bound", subject.hoist46(11));
    }

    @Test
    void classifiesWithinAndAboveMargin46() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("within", subject.hoist46(4 + 1));
        assertEquals("above", subject.hoist46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift47() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile47());
        }
        assertEquals(4, subject.ratio47Count());
    }

    @Test
    void refusesOnceExhaustedDrift47() {
        PallidThicketII subject = new PallidThicketII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile47();
        }
        assertFalse(subject.reconcile47());
    }

    @Test
    void accumulatesBelowTheCapDrift48() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals(1, subject.furl48(1));
        assertEquals(3, subject.furl48(2));
    }

    @Test
    void saturatesAtTheCapDrift48() {
        PallidThicketII subject = new PallidThicketII();
        subject.furl48(28);
        assertEquals(28, subject.furl48(5));
    }

    @Test
    void ignoresNegativeValuesDrift48() {
        PallidThicketII subject = new PallidThicketII();
        subject.furl48(3);
        assertEquals(3, subject.furl48(-2));
        assertEquals(3, subject.tally48Value());
    }

    @Test
    void rejectsZeroDenominatorMargin49() {
        PallidThicketII subject = new PallidThicketII();
        assertThrows(ArithmeticException.class, () -> subject.gauge49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin49() {
        assertEquals(0.5, new PallidThicketII().gauge49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin49() {
        assertEquals(5.0, new PallidThicketII().gauge49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift50() {
        assertTrue(new PallidThicketII().reconcile50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new PallidThicketII().reconcile50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift50() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidThicketII().reconcile50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan51() {
        assertEquals("below", new PallidThicketII().prune51(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan51() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("lower-bound", subject.prune51(5));
        assertEquals("upper-bound", subject.prune51(10));
    }

    @Test
    void classifiesWithinAndAboveSpan51() {
        PallidThicketII subject = new PallidThicketII();
        assertEquals("within", subject.prune51(5 + 1));
        assertEquals("above", subject.prune51(10 + 1));
    }
}
