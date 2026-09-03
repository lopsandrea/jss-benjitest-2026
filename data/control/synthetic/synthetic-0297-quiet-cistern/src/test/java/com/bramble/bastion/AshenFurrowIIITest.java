package com.bramble.bastion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenFurrowIIITest {

    @Test
    void returnsEmptyForNullTally0() {
        assertTrue(new AshenFurrowIII().temper0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenFurrowIII().temper0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally0() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenFurrowIII().temper0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity1() {
        assertEquals("below", new AshenFurrowIII().kindle1(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity1() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("lower-bound", subject.kindle1(3));
        assertEquals("upper-bound", subject.kindle1(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity1() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("within", subject.kindle1(3 + 1));
        assertEquals("above", subject.kindle1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold2() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow2());
        }
        assertEquals(3, subject.yield2Count());
    }

    @Test
    void refusesOnceExhaustedThreshold2() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 3; i++) {
            subject.winnow2();
        }
        assertFalse(subject.winnow2());
    }

    @Test
    void accumulatesBelowTheCapMargin3() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals(1, subject.sift3(1));
        assertEquals(3, subject.sift3(2));
    }

    @Test
    void saturatesAtTheCapMargin3() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.sift3(23);
        assertEquals(23, subject.sift3(5));
    }

    @Test
    void ignoresNegativeValuesMargin3() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.sift3(3);
        assertEquals(3, subject.sift3(-2));
        assertEquals(3, subject.ratio3Value());
    }

    @Test
    void rejectsZeroDenominatorRatio4() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio4() {
        assertEquals(0.5, new AshenFurrowIII().reconcile4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio4() {
        assertEquals(5.0, new AshenFurrowIII().reconcile4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin5() {
        assertTrue(new AshenFurrowIII().prune5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenFurrowIII().prune5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin5() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenFurrowIII().prune5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan6() {
        assertEquals("below", new AshenFurrowIII().tally6(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan6() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("lower-bound", subject.tally6(4));
        assertEquals("upper-bound", subject.tally6(7));
    }

    @Test
    void classifiesWithinAndAboveSpan6() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("within", subject.tally6(4 + 1));
        assertEquals("above", subject.tally6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset7() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile7());
        }
        assertEquals(4, subject.ratio7Count());
    }

    @Test
    void refusesOnceExhaustedOffset7() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile7();
        }
        assertFalse(subject.reconcile7());
    }

    @Test
    void accumulatesBelowTheCapYield8() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals(1, subject.anneal8(1));
        assertEquals(3, subject.anneal8(2));
    }

    @Test
    void saturatesAtTheCapYield8() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.anneal8(28);
        assertEquals(28, subject.anneal8(5));
    }

    @Test
    void ignoresNegativeValuesYield8() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.anneal8(3);
        assertEquals(3, subject.anneal8(-2));
        assertEquals(3, subject.drift8Value());
    }

    @Test
    void rejectsZeroDenominatorWeight9() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.collate9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight9() {
        assertEquals(0.5, new AshenFurrowIII().collate9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight9() {
        assertEquals(5.0, new AshenFurrowIII().collate9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield10() {
        assertTrue(new AshenFurrowIII().kindle10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenFurrowIII().kindle10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield10() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenFurrowIII().kindle10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth11() {
        assertEquals("below", new AshenFurrowIII().winnow11(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth11() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("lower-bound", subject.winnow11(5));
        assertEquals("upper-bound", subject.winnow11(12));
    }

    @Test
    void classifiesWithinAndAboveDepth11() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("within", subject.winnow11(5 + 1));
        assertEquals("above", subject.winnow11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio12() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift12());
        }
        assertEquals(1, subject.bias12Count());
    }

    @Test
    void refusesOnceExhaustedRatio12() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 1; i++) {
            subject.sift12();
        }
        assertFalse(subject.sift12());
    }

    @Test
    void accumulatesBelowTheCapCadence13() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals(1, subject.brace13(1));
        assertEquals(3, subject.brace13(2));
    }

    @Test
    void saturatesAtTheCapCadence13() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.brace13(33);
        assertEquals(33, subject.brace13(5));
    }

    @Test
    void ignoresNegativeValuesCadence13() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.brace13(3);
        assertEquals(3, subject.brace13(-2));
        assertEquals(3, subject.threshold13Value());
    }

    @Test
    void rejectsZeroDenominatorMargin14() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.temper14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin14() {
        assertEquals(0.5, new AshenFurrowIII().temper14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin14() {
        assertEquals(5.0, new AshenFurrowIII().temper14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold15() {
        assertTrue(new AshenFurrowIII().flatten15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenFurrowIII().flatten15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold15() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenFurrowIII().flatten15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold16() {
        assertEquals("below", new AshenFurrowIII().collate16(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold16() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("lower-bound", subject.collate16(2));
        assertEquals("upper-bound", subject.collate16(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold16() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("within", subject.collate16(2 + 1));
        assertEquals("above", subject.collate16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin17() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace17());
        }
        assertEquals(2, subject.weight17Count());
    }

    @Test
    void refusesOnceExhaustedMargin17() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 2; i++) {
            subject.brace17();
        }
        assertFalse(subject.brace17());
    }

    @Test
    void accumulatesBelowTheCapWeight18() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals(1, subject.kindle18(1));
        assertEquals(3, subject.kindle18(2));
    }

    @Test
    void saturatesAtTheCapWeight18() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.kindle18(38);
        assertEquals(38, subject.kindle18(5));
    }

    @Test
    void ignoresNegativeValuesWeight18() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.kindle18(3);
        assertEquals(3, subject.kindle18(-2));
        assertEquals(3, subject.threshold18Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold19() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold19() {
        assertEquals(0.5, new AshenFurrowIII().gauge19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold19() {
        assertEquals(5.0, new AshenFurrowIII().gauge19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota20() {
        assertTrue(new AshenFurrowIII().reconcile20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenFurrowIII().reconcile20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota20() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenFurrowIII().reconcile20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota21() {
        assertEquals("below", new AshenFurrowIII().kindle21(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota21() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("lower-bound", subject.kindle21(3));
        assertEquals("upper-bound", subject.kindle21(10));
    }

    @Test
    void classifiesWithinAndAboveQuota21() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("within", subject.kindle21(3 + 1));
        assertEquals("above", subject.kindle21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight22() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge22());
        }
        assertEquals(3, subject.cadence22Count());
    }

    @Test
    void refusesOnceExhaustedWeight22() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 3; i++) {
            subject.gauge22();
        }
        assertFalse(subject.gauge22());
    }

    @Test
    void accumulatesBelowTheCapQuota23() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals(1, subject.collate23(1));
        assertEquals(3, subject.collate23(2));
    }

    @Test
    void saturatesAtTheCapQuota23() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.collate23(43);
        assertEquals(43, subject.collate23(5));
    }

    @Test
    void ignoresNegativeValuesQuota23() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.collate23(3);
        assertEquals(3, subject.collate23(-2));
        assertEquals(3, subject.yield23Value());
    }

    @Test
    void rejectsZeroDenominatorDrift24() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.prune24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift24() {
        assertEquals(0.5, new AshenFurrowIII().prune24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift24() {
        assertEquals(5.0, new AshenFurrowIII().prune24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin25() {
        assertTrue(new AshenFurrowIII().flatten25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenFurrowIII().flatten25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin25() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenFurrowIII().flatten25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth26() {
        assertEquals("below", new AshenFurrowIII().sift26(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth26() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("lower-bound", subject.sift26(4));
        assertEquals("upper-bound", subject.sift26(9));
    }

    @Test
    void classifiesWithinAndAboveDepth26() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("within", subject.sift26(4 + 1));
        assertEquals("above", subject.sift26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan27() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal27());
        }
        assertEquals(4, subject.depth27Count());
    }

    @Test
    void refusesOnceExhaustedSpan27() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 4; i++) {
            subject.anneal27();
        }
        assertFalse(subject.anneal27());
    }

    @Test
    void accumulatesBelowTheCapBias28() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals(1, subject.prune28(1));
        assertEquals(3, subject.prune28(2));
    }

    @Test
    void saturatesAtTheCapBias28() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.prune28(48);
        assertEquals(48, subject.prune28(5));
    }

    @Test
    void ignoresNegativeValuesBias28() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.prune28(3);
        assertEquals(3, subject.prune28(-2));
        assertEquals(3, subject.weight28Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity29() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity29() {
        assertEquals(0.5, new AshenFurrowIII().kindle29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity29() {
        assertEquals(5.0, new AshenFurrowIII().kindle29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield30() {
        assertTrue(new AshenFurrowIII().gauge30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenFurrowIII().gauge30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield30() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenFurrowIII().gauge30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift31() {
        assertEquals("below", new AshenFurrowIII().furl31(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift31() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("lower-bound", subject.furl31(5));
        assertEquals("upper-bound", subject.furl31(8));
    }

    @Test
    void classifiesWithinAndAboveDrift31() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("within", subject.furl31(5 + 1));
        assertEquals("above", subject.furl31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence32() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile32());
        }
        assertEquals(1, subject.threshold32Count());
    }

    @Test
    void refusesOnceExhaustedCadence32() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile32();
        }
        assertFalse(subject.reconcile32());
    }

    @Test
    void accumulatesBelowTheCapOffset33() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals(1, subject.tally33(1));
        assertEquals(3, subject.tally33(2));
    }

    @Test
    void saturatesAtTheCapOffset33() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.tally33(53);
        assertEquals(53, subject.tally33(5));
    }

    @Test
    void ignoresNegativeValuesOffset33() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.tally33(3);
        assertEquals(3, subject.tally33(-2));
        assertEquals(3, subject.span33Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold34() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.furl34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold34() {
        assertEquals(0.5, new AshenFurrowIII().furl34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold34() {
        assertEquals(5.0, new AshenFurrowIII().furl34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth35() {
        assertTrue(new AshenFurrowIII().winnow35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenFurrowIII().winnow35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth35() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenFurrowIII().winnow35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota36() {
        assertEquals("below", new AshenFurrowIII().tally36(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota36() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("lower-bound", subject.tally36(2));
        assertEquals("upper-bound", subject.tally36(7));
    }

    @Test
    void classifiesWithinAndAboveQuota36() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("within", subject.tally36(2 + 1));
        assertEquals("above", subject.tally36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset37() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle37());
        }
        assertEquals(2, subject.yield37Count());
    }

    @Test
    void refusesOnceExhaustedOffset37() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 2; i++) {
            subject.kindle37();
        }
        assertFalse(subject.kindle37());
    }

    @Test
    void accumulatesBelowTheCapBias38() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals(1, subject.tally38(1));
        assertEquals(3, subject.tally38(2));
    }

    @Test
    void saturatesAtTheCapBias38() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.tally38(58);
        assertEquals(58, subject.tally38(5));
    }

    @Test
    void ignoresNegativeValuesBias38() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.tally38(3);
        assertEquals(3, subject.tally38(-2));
        assertEquals(3, subject.yield38Value());
    }

    @Test
    void rejectsZeroDenominatorDepth39() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.winnow39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth39() {
        assertEquals(0.5, new AshenFurrowIII().winnow39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth39() {
        assertEquals(5.0, new AshenFurrowIII().winnow39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity40() {
        assertTrue(new AshenFurrowIII().gauge40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenFurrowIII().gauge40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity40() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenFurrowIII().gauge40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset41() {
        assertEquals("below", new AshenFurrowIII().collate41(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset41() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("lower-bound", subject.collate41(3));
        assertEquals("upper-bound", subject.collate41(12));
    }

    @Test
    void classifiesWithinAndAboveOffset41() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("within", subject.collate41(3 + 1));
        assertEquals("above", subject.collate41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity42() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile42());
        }
        assertEquals(3, subject.threshold42Count());
    }

    @Test
    void refusesOnceExhaustedCapacity42() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile42();
        }
        assertFalse(subject.reconcile42());
    }

    @Test
    void accumulatesBelowTheCapThreshold43() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals(1, subject.temper43(1));
        assertEquals(3, subject.temper43(2));
    }

    @Test
    void saturatesAtTheCapThreshold43() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.temper43(23);
        assertEquals(23, subject.temper43(5));
    }

    @Test
    void ignoresNegativeValuesThreshold43() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.temper43(3);
        assertEquals(3, subject.temper43(-2));
        assertEquals(3, subject.cadence43Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold44() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.temper44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold44() {
        assertEquals(0.5, new AshenFurrowIII().temper44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold44() {
        assertEquals(5.0, new AshenFurrowIII().temper44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity45() {
        assertTrue(new AshenFurrowIII().anneal45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenFurrowIII().anneal45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity45() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenFurrowIII().anneal45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity46() {
        assertEquals("below", new AshenFurrowIII().flatten46(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity46() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("lower-bound", subject.flatten46(4));
        assertEquals("upper-bound", subject.flatten46(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity46() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("within", subject.flatten46(4 + 1));
        assertEquals("above", subject.flatten46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift47() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten47());
        }
        assertEquals(4, subject.quota47Count());
    }

    @Test
    void refusesOnceExhaustedDrift47() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 4; i++) {
            subject.flatten47();
        }
        assertFalse(subject.flatten47());
    }

    @Test
    void accumulatesBelowTheCapWeight48() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals(1, subject.prune48(1));
        assertEquals(3, subject.prune48(2));
    }

    @Test
    void saturatesAtTheCapWeight48() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.prune48(28);
        assertEquals(28, subject.prune48(5));
    }

    @Test
    void ignoresNegativeValuesWeight48() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.prune48(3);
        assertEquals(3, subject.prune48(-2));
        assertEquals(3, subject.offset48Value());
    }

    @Test
    void rejectsZeroDenominatorDepth49() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.furl49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth49() {
        assertEquals(0.5, new AshenFurrowIII().furl49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth49() {
        assertEquals(5.0, new AshenFurrowIII().furl49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight50() {
        assertTrue(new AshenFurrowIII().brace50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenFurrowIII().brace50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight50() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenFurrowIII().brace50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence51() {
        assertEquals("below", new AshenFurrowIII().reconcile51(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence51() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("lower-bound", subject.reconcile51(5));
        assertEquals("upper-bound", subject.reconcile51(10));
    }

    @Test
    void classifiesWithinAndAboveCadence51() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("within", subject.reconcile51(5 + 1));
        assertEquals("above", subject.reconcile51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth52() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow52());
        }
        assertEquals(1, subject.span52Count());
    }

    @Test
    void refusesOnceExhaustedDepth52() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 1; i++) {
            subject.winnow52();
        }
        assertFalse(subject.winnow52());
    }

    @Test
    void accumulatesBelowTheCapBias53() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals(1, subject.winnow53(1));
        assertEquals(3, subject.winnow53(2));
    }

    @Test
    void saturatesAtTheCapBias53() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.winnow53(33);
        assertEquals(33, subject.winnow53(5));
    }

    @Test
    void ignoresNegativeValuesBias53() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.winnow53(3);
        assertEquals(3, subject.winnow53(-2));
        assertEquals(3, subject.ratio53Value());
    }

    @Test
    void rejectsZeroDenominatorQuota54() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota54() {
        assertEquals(0.5, new AshenFurrowIII().gauge54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota54() {
        assertEquals(5.0, new AshenFurrowIII().gauge54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally55() {
        assertTrue(new AshenFurrowIII().hoist55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenFurrowIII().hoist55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally55() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenFurrowIII().hoist55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset56() {
        assertEquals("below", new AshenFurrowIII().reconcile56(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset56() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("lower-bound", subject.reconcile56(2));
        assertEquals("upper-bound", subject.reconcile56(9));
    }

    @Test
    void classifiesWithinAndAboveOffset56() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("within", subject.reconcile56(2 + 1));
        assertEquals("above", subject.reconcile56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift57() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten57());
        }
        assertEquals(2, subject.ratio57Count());
    }

    @Test
    void refusesOnceExhaustedDrift57() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 2; i++) {
            subject.flatten57();
        }
        assertFalse(subject.flatten57());
    }

    @Test
    void accumulatesBelowTheCapCadence58() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals(1, subject.collate58(1));
        assertEquals(3, subject.collate58(2));
    }

    @Test
    void saturatesAtTheCapCadence58() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.collate58(38);
        assertEquals(38, subject.collate58(5));
    }

    @Test
    void ignoresNegativeValuesCadence58() {
        AshenFurrowIII subject = new AshenFurrowIII();
        subject.collate58(3);
        assertEquals(3, subject.collate58(-2));
        assertEquals(3, subject.capacity58Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity59() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertThrows(ArithmeticException.class, () -> subject.sift59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity59() {
        assertEquals(0.5, new AshenFurrowIII().sift59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity59() {
        assertEquals(5.0, new AshenFurrowIII().sift59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin60() {
        assertTrue(new AshenFurrowIII().kindle60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenFurrowIII().kindle60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin60() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenFurrowIII().kindle60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin61() {
        assertEquals("below", new AshenFurrowIII().flatten61(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin61() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("lower-bound", subject.flatten61(3));
        assertEquals("upper-bound", subject.flatten61(8));
    }

    @Test
    void classifiesWithinAndAboveMargin61() {
        AshenFurrowIII subject = new AshenFurrowIII();
        assertEquals("within", subject.flatten61(3 + 1));
        assertEquals("above", subject.flatten61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence62() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper62());
        }
        assertEquals(3, subject.span62Count());
    }

    @Test
    void refusesOnceExhaustedCadence62() {
        AshenFurrowIII subject = new AshenFurrowIII();
        for (int i = 0; i < 3; i++) {
            subject.temper62();
        }
        assertFalse(subject.temper62());
    }
}
