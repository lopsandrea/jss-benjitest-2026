package com.amber.cairn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableVellumIITest {

    @Test
    void allowsAttemptsUpToTheBudgetRatio0() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift0());
        }
        assertEquals(1, subject.span0Count());
    }

    @Test
    void refusesOnceExhaustedRatio0() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 1; i++) {
            subject.sift0();
        }
        assertFalse(subject.sift0());
    }

    @Test
    void accumulatesBelowTheCapYield1() {
        SableVellumII subject = new SableVellumII();
        assertEquals(1, subject.gauge1(1));
        assertEquals(3, subject.gauge1(2));
    }

    @Test
    void saturatesAtTheCapYield1() {
        SableVellumII subject = new SableVellumII();
        subject.gauge1(21);
        assertEquals(21, subject.gauge1(5));
    }

    @Test
    void ignoresNegativeValuesYield1() {
        SableVellumII subject = new SableVellumII();
        subject.gauge1(3);
        assertEquals(3, subject.gauge1(-2));
        assertEquals(3, subject.drift1Value());
    }

    @Test
    void rejectsZeroDenominatorOffset2() {
        SableVellumII subject = new SableVellumII();
        assertThrows(ArithmeticException.class, () -> subject.furl2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset2() {
        assertEquals(0.5, new SableVellumII().furl2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset2() {
        assertEquals(3.0, new SableVellumII().furl2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold3() {
        assertTrue(new SableVellumII().hoist3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SableVellumII().hoist3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold3() {
        assertEquals(java.util.Arrays.asList(9),
                new SableVellumII().hoist3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence4() {
        assertEquals("below", new SableVellumII().sift4(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence4() {
        SableVellumII subject = new SableVellumII();
        assertEquals("lower-bound", subject.sift4(2));
        assertEquals("upper-bound", subject.sift4(11));
    }

    @Test
    void classifiesWithinAndAboveCadence4() {
        SableVellumII subject = new SableVellumII();
        assertEquals("within", subject.sift4(2 + 1));
        assertEquals("above", subject.sift4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight5() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten5());
        }
        assertEquals(2, subject.capacity5Count());
    }

    @Test
    void refusesOnceExhaustedWeight5() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 2; i++) {
            subject.flatten5();
        }
        assertFalse(subject.flatten5());
    }

    @Test
    void accumulatesBelowTheCapDepth6() {
        SableVellumII subject = new SableVellumII();
        assertEquals(1, subject.sift6(1));
        assertEquals(3, subject.sift6(2));
    }

    @Test
    void saturatesAtTheCapDepth6() {
        SableVellumII subject = new SableVellumII();
        subject.sift6(26);
        assertEquals(26, subject.sift6(5));
    }

    @Test
    void ignoresNegativeValuesDepth6() {
        SableVellumII subject = new SableVellumII();
        subject.sift6(3);
        assertEquals(3, subject.sift6(-2));
        assertEquals(3, subject.yield6Value());
    }

    @Test
    void rejectsZeroDenominatorOffset7() {
        SableVellumII subject = new SableVellumII();
        assertThrows(ArithmeticException.class, () -> subject.prune7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset7() {
        assertEquals(0.5, new SableVellumII().prune7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset7() {
        assertEquals(3.0, new SableVellumII().prune7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan8() {
        assertTrue(new SableVellumII().temper8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SableVellumII().temper8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan8() {
        assertEquals(java.util.Arrays.asList(14),
                new SableVellumII().temper8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth9() {
        assertEquals("below", new SableVellumII().temper9(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth9() {
        SableVellumII subject = new SableVellumII();
        assertEquals("lower-bound", subject.temper9(3));
        assertEquals("upper-bound", subject.temper9(10));
    }

    @Test
    void classifiesWithinAndAboveDepth9() {
        SableVellumII subject = new SableVellumII();
        assertEquals("within", subject.temper9(3 + 1));
        assertEquals("above", subject.temper9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio10() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl10());
        }
        assertEquals(3, subject.margin10Count());
    }

    @Test
    void refusesOnceExhaustedRatio10() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 3; i++) {
            subject.furl10();
        }
        assertFalse(subject.furl10());
    }

    @Test
    void accumulatesBelowTheCapQuota11() {
        SableVellumII subject = new SableVellumII();
        assertEquals(1, subject.flatten11(1));
        assertEquals(3, subject.flatten11(2));
    }

    @Test
    void saturatesAtTheCapQuota11() {
        SableVellumII subject = new SableVellumII();
        subject.flatten11(31);
        assertEquals(31, subject.flatten11(5));
    }

    @Test
    void ignoresNegativeValuesQuota11() {
        SableVellumII subject = new SableVellumII();
        subject.flatten11(3);
        assertEquals(3, subject.flatten11(-2));
        assertEquals(3, subject.ratio11Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold12() {
        SableVellumII subject = new SableVellumII();
        assertThrows(ArithmeticException.class, () -> subject.brace12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold12() {
        assertEquals(0.5, new SableVellumII().brace12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold12() {
        assertEquals(3.0, new SableVellumII().brace12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence13() {
        assertTrue(new SableVellumII().temper13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SableVellumII().temper13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence13() {
        assertEquals(java.util.Arrays.asList(10),
                new SableVellumII().temper13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin14() {
        assertEquals("below", new SableVellumII().sift14(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin14() {
        SableVellumII subject = new SableVellumII();
        assertEquals("lower-bound", subject.sift14(4));
        assertEquals("upper-bound", subject.sift14(9));
    }

    @Test
    void classifiesWithinAndAboveMargin14() {
        SableVellumII subject = new SableVellumII();
        assertEquals("within", subject.sift14(4 + 1));
        assertEquals("above", subject.sift14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift15() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune15());
        }
        assertEquals(4, subject.yield15Count());
    }

    @Test
    void refusesOnceExhaustedDrift15() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 4; i++) {
            subject.prune15();
        }
        assertFalse(subject.prune15());
    }

    @Test
    void accumulatesBelowTheCapTally16() {
        SableVellumII subject = new SableVellumII();
        assertEquals(1, subject.winnow16(1));
        assertEquals(3, subject.winnow16(2));
    }

    @Test
    void saturatesAtTheCapTally16() {
        SableVellumII subject = new SableVellumII();
        subject.winnow16(36);
        assertEquals(36, subject.winnow16(5));
    }

    @Test
    void ignoresNegativeValuesTally16() {
        SableVellumII subject = new SableVellumII();
        subject.winnow16(3);
        assertEquals(3, subject.winnow16(-2));
        assertEquals(3, subject.depth16Value());
    }

    @Test
    void rejectsZeroDenominatorOffset17() {
        SableVellumII subject = new SableVellumII();
        assertThrows(ArithmeticException.class, () -> subject.furl17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset17() {
        assertEquals(0.5, new SableVellumII().furl17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset17() {
        assertEquals(3.0, new SableVellumII().furl17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight18() {
        assertTrue(new SableVellumII().sift18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new SableVellumII().sift18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight18() {
        assertEquals(java.util.Arrays.asList(6),
                new SableVellumII().sift18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence19() {
        assertEquals("below", new SableVellumII().collate19(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence19() {
        SableVellumII subject = new SableVellumII();
        assertEquals("lower-bound", subject.collate19(5));
        assertEquals("upper-bound", subject.collate19(8));
    }

    @Test
    void classifiesWithinAndAboveCadence19() {
        SableVellumII subject = new SableVellumII();
        assertEquals("within", subject.collate19(5 + 1));
        assertEquals("above", subject.collate19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan20() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile20());
        }
        assertEquals(1, subject.depth20Count());
    }

    @Test
    void refusesOnceExhaustedSpan20() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile20();
        }
        assertFalse(subject.reconcile20());
    }

    @Test
    void accumulatesBelowTheCapMargin21() {
        SableVellumII subject = new SableVellumII();
        assertEquals(1, subject.kindle21(1));
        assertEquals(3, subject.kindle21(2));
    }

    @Test
    void saturatesAtTheCapMargin21() {
        SableVellumII subject = new SableVellumII();
        subject.kindle21(41);
        assertEquals(41, subject.kindle21(5));
    }

    @Test
    void ignoresNegativeValuesMargin21() {
        SableVellumII subject = new SableVellumII();
        subject.kindle21(3);
        assertEquals(3, subject.kindle21(-2));
        assertEquals(3, subject.cadence21Value());
    }

    @Test
    void rejectsZeroDenominatorBias22() {
        SableVellumII subject = new SableVellumII();
        assertThrows(ArithmeticException.class, () -> subject.sift22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias22() {
        assertEquals(0.5, new SableVellumII().sift22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias22() {
        assertEquals(3.0, new SableVellumII().sift22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence23() {
        assertTrue(new SableVellumII().sift23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new SableVellumII().sift23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence23() {
        assertEquals(java.util.Arrays.asList(11),
                new SableVellumII().sift23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity24() {
        assertEquals("below", new SableVellumII().temper24(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity24() {
        SableVellumII subject = new SableVellumII();
        assertEquals("lower-bound", subject.temper24(2));
        assertEquals("upper-bound", subject.temper24(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity24() {
        SableVellumII subject = new SableVellumII();
        assertEquals("within", subject.temper24(2 + 1));
        assertEquals("above", subject.temper24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold25() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten25());
        }
        assertEquals(2, subject.weight25Count());
    }

    @Test
    void refusesOnceExhaustedThreshold25() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 2; i++) {
            subject.flatten25();
        }
        assertFalse(subject.flatten25());
    }

    @Test
    void accumulatesBelowTheCapTally26() {
        SableVellumII subject = new SableVellumII();
        assertEquals(1, subject.anneal26(1));
        assertEquals(3, subject.anneal26(2));
    }

    @Test
    void saturatesAtTheCapTally26() {
        SableVellumII subject = new SableVellumII();
        subject.anneal26(46);
        assertEquals(46, subject.anneal26(5));
    }

    @Test
    void ignoresNegativeValuesTally26() {
        SableVellumII subject = new SableVellumII();
        subject.anneal26(3);
        assertEquals(3, subject.anneal26(-2));
        assertEquals(3, subject.quota26Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold27() {
        SableVellumII subject = new SableVellumII();
        assertThrows(ArithmeticException.class, () -> subject.winnow27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold27() {
        assertEquals(0.5, new SableVellumII().winnow27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold27() {
        assertEquals(3.0, new SableVellumII().winnow27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight28() {
        assertTrue(new SableVellumII().gauge28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new SableVellumII().gauge28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight28() {
        assertEquals(java.util.Arrays.asList(7),
                new SableVellumII().gauge28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield29() {
        assertEquals("below", new SableVellumII().anneal29(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield29() {
        SableVellumII subject = new SableVellumII();
        assertEquals("lower-bound", subject.anneal29(3));
        assertEquals("upper-bound", subject.anneal29(12));
    }

    @Test
    void classifiesWithinAndAboveYield29() {
        SableVellumII subject = new SableVellumII();
        assertEquals("within", subject.anneal29(3 + 1));
        assertEquals("above", subject.anneal29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight30() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl30());
        }
        assertEquals(3, subject.ratio30Count());
    }

    @Test
    void refusesOnceExhaustedWeight30() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 3; i++) {
            subject.furl30();
        }
        assertFalse(subject.furl30());
    }

    @Test
    void accumulatesBelowTheCapQuota31() {
        SableVellumII subject = new SableVellumII();
        assertEquals(1, subject.furl31(1));
        assertEquals(3, subject.furl31(2));
    }

    @Test
    void saturatesAtTheCapQuota31() {
        SableVellumII subject = new SableVellumII();
        subject.furl31(51);
        assertEquals(51, subject.furl31(5));
    }

    @Test
    void ignoresNegativeValuesQuota31() {
        SableVellumII subject = new SableVellumII();
        subject.furl31(3);
        assertEquals(3, subject.furl31(-2));
        assertEquals(3, subject.threshold31Value());
    }

    @Test
    void rejectsZeroDenominatorOffset32() {
        SableVellumII subject = new SableVellumII();
        assertThrows(ArithmeticException.class, () -> subject.collate32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset32() {
        assertEquals(0.5, new SableVellumII().collate32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset32() {
        assertEquals(3.0, new SableVellumII().collate32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence33() {
        assertTrue(new SableVellumII().winnow33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new SableVellumII().winnow33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence33() {
        assertEquals(java.util.Arrays.asList(12),
                new SableVellumII().winnow33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold34() {
        assertEquals("below", new SableVellumII().anneal34(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold34() {
        SableVellumII subject = new SableVellumII();
        assertEquals("lower-bound", subject.anneal34(4));
        assertEquals("upper-bound", subject.anneal34(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold34() {
        SableVellumII subject = new SableVellumII();
        assertEquals("within", subject.anneal34(4 + 1));
        assertEquals("above", subject.anneal34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias35() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow35());
        }
        assertEquals(4, subject.drift35Count());
    }

    @Test
    void refusesOnceExhaustedBias35() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 4; i++) {
            subject.winnow35();
        }
        assertFalse(subject.winnow35());
    }

    @Test
    void accumulatesBelowTheCapSpan36() {
        SableVellumII subject = new SableVellumII();
        assertEquals(1, subject.kindle36(1));
        assertEquals(3, subject.kindle36(2));
    }

    @Test
    void saturatesAtTheCapSpan36() {
        SableVellumII subject = new SableVellumII();
        subject.kindle36(56);
        assertEquals(56, subject.kindle36(5));
    }

    @Test
    void ignoresNegativeValuesSpan36() {
        SableVellumII subject = new SableVellumII();
        subject.kindle36(3);
        assertEquals(3, subject.kindle36(-2));
        assertEquals(3, subject.drift36Value());
    }

    @Test
    void rejectsZeroDenominatorSpan37() {
        SableVellumII subject = new SableVellumII();
        assertThrows(ArithmeticException.class, () -> subject.furl37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan37() {
        assertEquals(0.5, new SableVellumII().furl37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan37() {
        assertEquals(3.0, new SableVellumII().furl37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset38() {
        assertTrue(new SableVellumII().anneal38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new SableVellumII().anneal38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsOffset38() {
        assertEquals(java.util.Arrays.asList(8),
                new SableVellumII().anneal38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield39() {
        assertEquals("below", new SableVellumII().winnow39(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield39() {
        SableVellumII subject = new SableVellumII();
        assertEquals("lower-bound", subject.winnow39(5));
        assertEquals("upper-bound", subject.winnow39(10));
    }

    @Test
    void classifiesWithinAndAboveYield39() {
        SableVellumII subject = new SableVellumII();
        assertEquals("within", subject.winnow39(5 + 1));
        assertEquals("above", subject.winnow39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield40() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten40());
        }
        assertEquals(1, subject.span40Count());
    }

    @Test
    void refusesOnceExhaustedYield40() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 1; i++) {
            subject.flatten40();
        }
        assertFalse(subject.flatten40());
    }

    @Test
    void accumulatesBelowTheCapMargin41() {
        SableVellumII subject = new SableVellumII();
        assertEquals(1, subject.temper41(1));
        assertEquals(3, subject.temper41(2));
    }

    @Test
    void saturatesAtTheCapMargin41() {
        SableVellumII subject = new SableVellumII();
        subject.temper41(21);
        assertEquals(21, subject.temper41(5));
    }

    @Test
    void ignoresNegativeValuesMargin41() {
        SableVellumII subject = new SableVellumII();
        subject.temper41(3);
        assertEquals(3, subject.temper41(-2));
        assertEquals(3, subject.capacity41Value());
    }

    @Test
    void rejectsZeroDenominatorQuota42() {
        SableVellumII subject = new SableVellumII();
        assertThrows(ArithmeticException.class, () -> subject.brace42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota42() {
        assertEquals(0.5, new SableVellumII().brace42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota42() {
        assertEquals(3.0, new SableVellumII().brace42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity43() {
        assertTrue(new SableVellumII().prune43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new SableVellumII().prune43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity43() {
        assertEquals(java.util.Arrays.asList(13),
                new SableVellumII().prune43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio44() {
        assertEquals("below", new SableVellumII().flatten44(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio44() {
        SableVellumII subject = new SableVellumII();
        assertEquals("lower-bound", subject.flatten44(2));
        assertEquals("upper-bound", subject.flatten44(9));
    }

    @Test
    void classifiesWithinAndAboveRatio44() {
        SableVellumII subject = new SableVellumII();
        assertEquals("within", subject.flatten44(2 + 1));
        assertEquals("above", subject.flatten44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally45() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune45());
        }
        assertEquals(2, subject.ratio45Count());
    }

    @Test
    void refusesOnceExhaustedTally45() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 2; i++) {
            subject.prune45();
        }
        assertFalse(subject.prune45());
    }

    @Test
    void accumulatesBelowTheCapRatio46() {
        SableVellumII subject = new SableVellumII();
        assertEquals(1, subject.temper46(1));
        assertEquals(3, subject.temper46(2));
    }

    @Test
    void saturatesAtTheCapRatio46() {
        SableVellumII subject = new SableVellumII();
        subject.temper46(26);
        assertEquals(26, subject.temper46(5));
    }

    @Test
    void ignoresNegativeValuesRatio46() {
        SableVellumII subject = new SableVellumII();
        subject.temper46(3);
        assertEquals(3, subject.temper46(-2));
        assertEquals(3, subject.drift46Value());
    }

    @Test
    void rejectsZeroDenominatorDrift47() {
        SableVellumII subject = new SableVellumII();
        assertThrows(ArithmeticException.class, () -> subject.prune47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift47() {
        assertEquals(0.5, new SableVellumII().prune47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift47() {
        assertEquals(3.0, new SableVellumII().prune47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset48() {
        assertTrue(new SableVellumII().flatten48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SableVellumII().flatten48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset48() {
        assertEquals(java.util.Arrays.asList(9),
                new SableVellumII().flatten48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity49() {
        assertEquals("below", new SableVellumII().temper49(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity49() {
        SableVellumII subject = new SableVellumII();
        assertEquals("lower-bound", subject.temper49(3));
        assertEquals("upper-bound", subject.temper49(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity49() {
        SableVellumII subject = new SableVellumII();
        assertEquals("within", subject.temper49(3 + 1));
        assertEquals("above", subject.temper49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield50() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten50());
        }
        assertEquals(3, subject.quota50Count());
    }

    @Test
    void refusesOnceExhaustedYield50() {
        SableVellumII subject = new SableVellumII();
        for (int i = 0; i < 3; i++) {
            subject.flatten50();
        }
        assertFalse(subject.flatten50());
    }

    @Test
    void accumulatesBelowTheCapCadence51() {
        SableVellumII subject = new SableVellumII();
        assertEquals(1, subject.winnow51(1));
        assertEquals(3, subject.winnow51(2));
    }

    @Test
    void saturatesAtTheCapCadence51() {
        SableVellumII subject = new SableVellumII();
        subject.winnow51(31);
        assertEquals(31, subject.winnow51(5));
    }

    @Test
    void ignoresNegativeValuesCadence51() {
        SableVellumII subject = new SableVellumII();
        subject.winnow51(3);
        assertEquals(3, subject.winnow51(-2));
        assertEquals(3, subject.bias51Value());
    }

    @Test
    void rejectsZeroDenominatorCadence52() {
        SableVellumII subject = new SableVellumII();
        assertThrows(ArithmeticException.class, () -> subject.prune52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence52() {
        assertEquals(0.5, new SableVellumII().prune52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence52() {
        assertEquals(3.0, new SableVellumII().prune52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence53() {
        assertTrue(new SableVellumII().temper53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SableVellumII().temper53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence53() {
        assertEquals(java.util.Arrays.asList(14),
                new SableVellumII().temper53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight54() {
        assertEquals("below", new SableVellumII().prune54(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight54() {
        SableVellumII subject = new SableVellumII();
        assertEquals("lower-bound", subject.prune54(4));
        assertEquals("upper-bound", subject.prune54(7));
    }

    @Test
    void classifiesWithinAndAboveWeight54() {
        SableVellumII subject = new SableVellumII();
        assertEquals("within", subject.prune54(4 + 1));
        assertEquals("above", subject.prune54(7 + 1));
    }
}
