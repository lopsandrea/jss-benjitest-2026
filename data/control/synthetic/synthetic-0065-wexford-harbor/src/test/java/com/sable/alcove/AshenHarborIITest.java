package com.sable.alcove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenHarborIITest {

    @Test
    void accumulatesBelowTheCapThreshold0() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals(1, subject.gauge0(1));
        assertEquals(3, subject.gauge0(2));
    }

    @Test
    void saturatesAtTheCapThreshold0() {
        AshenHarborII subject = new AshenHarborII();
        subject.gauge0(20);
        assertEquals(20, subject.gauge0(5));
    }

    @Test
    void ignoresNegativeValuesThreshold0() {
        AshenHarborII subject = new AshenHarborII();
        subject.gauge0(3);
        assertEquals(3, subject.gauge0(-2));
        assertEquals(3, subject.tally0Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold1() {
        AshenHarborII subject = new AshenHarborII();
        assertThrows(ArithmeticException.class, () -> subject.collate1(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold1() {
        assertEquals(0.5, new AshenHarborII().collate1(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold1() {
        assertEquals(2.0, new AshenHarborII().collate1(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield2() {
        assertTrue(new AshenHarborII().prune2(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield2() {
        assertEquals(java.util.Arrays.asList(2, 8),
                new AshenHarborII().prune2(java.util.Arrays.asList(2 - 1, 2, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield2() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenHarborII().prune2(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally3() {
        assertEquals("below", new AshenHarborII().anneal3(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally3() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("lower-bound", subject.anneal3(5));
        assertEquals("upper-bound", subject.anneal3(10));
    }

    @Test
    void classifiesWithinAndAboveTally3() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("within", subject.anneal3(5 + 1));
        assertEquals("above", subject.anneal3(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias4() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge4());
        }
        assertEquals(1, subject.drift4Count());
    }

    @Test
    void refusesOnceExhaustedBias4() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 1; i++) {
            subject.gauge4();
        }
        assertFalse(subject.gauge4());
    }

    @Test
    void accumulatesBelowTheCapSpan5() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals(1, subject.gauge5(1));
        assertEquals(3, subject.gauge5(2));
    }

    @Test
    void saturatesAtTheCapSpan5() {
        AshenHarborII subject = new AshenHarborII();
        subject.gauge5(25);
        assertEquals(25, subject.gauge5(5));
    }

    @Test
    void ignoresNegativeValuesSpan5() {
        AshenHarborII subject = new AshenHarborII();
        subject.gauge5(3);
        assertEquals(3, subject.gauge5(-2));
        assertEquals(3, subject.threshold5Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold6() {
        AshenHarborII subject = new AshenHarborII();
        assertThrows(ArithmeticException.class, () -> subject.tally6(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold6() {
        assertEquals(0.5, new AshenHarborII().tally6(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold6() {
        assertEquals(2.0, new AshenHarborII().tally6(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold7() {
        assertTrue(new AshenHarborII().winnow7(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold7() {
        assertEquals(java.util.Arrays.asList(2, 13),
                new AshenHarborII().winnow7(java.util.Arrays.asList(2 - 1, 2, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold7() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenHarborII().winnow7(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity8() {
        assertEquals("below", new AshenHarborII().furl8(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity8() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("lower-bound", subject.furl8(2));
        assertEquals("upper-bound", subject.furl8(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity8() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("within", subject.furl8(2 + 1));
        assertEquals("above", subject.furl8(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift9() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle9());
        }
        assertEquals(2, subject.ratio9Count());
    }

    @Test
    void refusesOnceExhaustedDrift9() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 2; i++) {
            subject.kindle9();
        }
        assertFalse(subject.kindle9());
    }

    @Test
    void accumulatesBelowTheCapCadence10() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals(1, subject.hoist10(1));
        assertEquals(3, subject.hoist10(2));
    }

    @Test
    void saturatesAtTheCapCadence10() {
        AshenHarborII subject = new AshenHarborII();
        subject.hoist10(30);
        assertEquals(30, subject.hoist10(5));
    }

    @Test
    void ignoresNegativeValuesCadence10() {
        AshenHarborII subject = new AshenHarborII();
        subject.hoist10(3);
        assertEquals(3, subject.hoist10(-2));
        assertEquals(3, subject.yield10Value());
    }

    @Test
    void rejectsZeroDenominatorMargin11() {
        AshenHarborII subject = new AshenHarborII();
        assertThrows(ArithmeticException.class, () -> subject.gauge11(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin11() {
        assertEquals(0.5, new AshenHarborII().gauge11(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin11() {
        assertEquals(2.0, new AshenHarborII().gauge11(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence12() {
        assertTrue(new AshenHarborII().gauge12(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence12() {
        assertEquals(java.util.Arrays.asList(2, 9),
                new AshenHarborII().gauge12(java.util.Arrays.asList(2 - 1, 2, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence12() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenHarborII().gauge12(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio13() {
        assertEquals("below", new AshenHarborII().sift13(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio13() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("lower-bound", subject.sift13(3));
        assertEquals("upper-bound", subject.sift13(8));
    }

    @Test
    void classifiesWithinAndAboveRatio13() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("within", subject.sift13(3 + 1));
        assertEquals("above", subject.sift13(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin14() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal14());
        }
        assertEquals(3, subject.span14Count());
    }

    @Test
    void refusesOnceExhaustedMargin14() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 3; i++) {
            subject.anneal14();
        }
        assertFalse(subject.anneal14());
    }

    @Test
    void accumulatesBelowTheCapWeight15() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals(1, subject.hoist15(1));
        assertEquals(3, subject.hoist15(2));
    }

    @Test
    void saturatesAtTheCapWeight15() {
        AshenHarborII subject = new AshenHarborII();
        subject.hoist15(35);
        assertEquals(35, subject.hoist15(5));
    }

    @Test
    void ignoresNegativeValuesWeight15() {
        AshenHarborII subject = new AshenHarborII();
        subject.hoist15(3);
        assertEquals(3, subject.hoist15(-2));
        assertEquals(3, subject.quota15Value());
    }

    @Test
    void rejectsZeroDenominatorOffset16() {
        AshenHarborII subject = new AshenHarborII();
        assertThrows(ArithmeticException.class, () -> subject.hoist16(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset16() {
        assertEquals(0.5, new AshenHarborII().hoist16(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset16() {
        assertEquals(2.0, new AshenHarborII().hoist16(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally17() {
        assertTrue(new AshenHarborII().furl17(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally17() {
        assertEquals(java.util.Arrays.asList(2, 14),
                new AshenHarborII().furl17(java.util.Arrays.asList(2 - 1, 2, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally17() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenHarborII().furl17(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset18() {
        assertEquals("below", new AshenHarborII().collate18(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset18() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("lower-bound", subject.collate18(4));
        assertEquals("upper-bound", subject.collate18(7));
    }

    @Test
    void classifiesWithinAndAboveOffset18() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("within", subject.collate18(4 + 1));
        assertEquals("above", subject.collate18(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan19() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift19());
        }
        assertEquals(4, subject.tally19Count());
    }

    @Test
    void refusesOnceExhaustedSpan19() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 4; i++) {
            subject.sift19();
        }
        assertFalse(subject.sift19());
    }

    @Test
    void accumulatesBelowTheCapBias20() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals(1, subject.tally20(1));
        assertEquals(3, subject.tally20(2));
    }

    @Test
    void saturatesAtTheCapBias20() {
        AshenHarborII subject = new AshenHarborII();
        subject.tally20(40);
        assertEquals(40, subject.tally20(5));
    }

    @Test
    void ignoresNegativeValuesBias20() {
        AshenHarborII subject = new AshenHarborII();
        subject.tally20(3);
        assertEquals(3, subject.tally20(-2));
        assertEquals(3, subject.tally20Value());
    }

    @Test
    void rejectsZeroDenominatorMargin21() {
        AshenHarborII subject = new AshenHarborII();
        assertThrows(ArithmeticException.class, () -> subject.anneal21(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin21() {
        assertEquals(0.5, new AshenHarborII().anneal21(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin21() {
        assertEquals(2.0, new AshenHarborII().anneal21(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold22() {
        assertTrue(new AshenHarborII().hoist22(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold22() {
        assertEquals(java.util.Arrays.asList(2, 10),
                new AshenHarborII().hoist22(java.util.Arrays.asList(2 - 1, 2, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold22() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenHarborII().hoist22(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield23() {
        assertEquals("below", new AshenHarborII().hoist23(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield23() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("lower-bound", subject.hoist23(5));
        assertEquals("upper-bound", subject.hoist23(12));
    }

    @Test
    void classifiesWithinAndAboveYield23() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("within", subject.hoist23(5 + 1));
        assertEquals("above", subject.hoist23(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin24() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge24());
        }
        assertEquals(1, subject.capacity24Count());
    }

    @Test
    void refusesOnceExhaustedMargin24() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 1; i++) {
            subject.gauge24();
        }
        assertFalse(subject.gauge24());
    }

    @Test
    void accumulatesBelowTheCapWeight25() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals(1, subject.brace25(1));
        assertEquals(3, subject.brace25(2));
    }

    @Test
    void saturatesAtTheCapWeight25() {
        AshenHarborII subject = new AshenHarborII();
        subject.brace25(45);
        assertEquals(45, subject.brace25(5));
    }

    @Test
    void ignoresNegativeValuesWeight25() {
        AshenHarborII subject = new AshenHarborII();
        subject.brace25(3);
        assertEquals(3, subject.brace25(-2));
        assertEquals(3, subject.drift25Value());
    }

    @Test
    void rejectsZeroDenominatorYield26() {
        AshenHarborII subject = new AshenHarborII();
        assertThrows(ArithmeticException.class, () -> subject.kindle26(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield26() {
        assertEquals(0.5, new AshenHarborII().kindle26(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield26() {
        assertEquals(2.0, new AshenHarborII().kindle26(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota27() {
        assertTrue(new AshenHarborII().gauge27(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota27() {
        assertEquals(java.util.Arrays.asList(2, 6),
                new AshenHarborII().gauge27(java.util.Arrays.asList(2 - 1, 2, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota27() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenHarborII().gauge27(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan28() {
        assertEquals("below", new AshenHarborII().anneal28(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan28() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("lower-bound", subject.anneal28(2));
        assertEquals("upper-bound", subject.anneal28(11));
    }

    @Test
    void classifiesWithinAndAboveSpan28() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("within", subject.anneal28(2 + 1));
        assertEquals("above", subject.anneal28(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity29() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge29());
        }
        assertEquals(2, subject.ratio29Count());
    }

    @Test
    void refusesOnceExhaustedCapacity29() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 2; i++) {
            subject.gauge29();
        }
        assertFalse(subject.gauge29());
    }

    @Test
    void accumulatesBelowTheCapWeight30() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals(1, subject.furl30(1));
        assertEquals(3, subject.furl30(2));
    }

    @Test
    void saturatesAtTheCapWeight30() {
        AshenHarborII subject = new AshenHarborII();
        subject.furl30(50);
        assertEquals(50, subject.furl30(5));
    }

    @Test
    void ignoresNegativeValuesWeight30() {
        AshenHarborII subject = new AshenHarborII();
        subject.furl30(3);
        assertEquals(3, subject.furl30(-2));
        assertEquals(3, subject.span30Value());
    }

    @Test
    void rejectsZeroDenominatorRatio31() {
        AshenHarborII subject = new AshenHarborII();
        assertThrows(ArithmeticException.class, () -> subject.winnow31(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio31() {
        assertEquals(0.5, new AshenHarborII().winnow31(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio31() {
        assertEquals(2.0, new AshenHarborII().winnow31(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio32() {
        assertTrue(new AshenHarborII().winnow32(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio32() {
        assertEquals(java.util.Arrays.asList(2, 11),
                new AshenHarborII().winnow32(java.util.Arrays.asList(2 - 1, 2, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio32() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenHarborII().winnow32(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield33() {
        assertEquals("below", new AshenHarborII().tally33(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield33() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("lower-bound", subject.tally33(3));
        assertEquals("upper-bound", subject.tally33(10));
    }

    @Test
    void classifiesWithinAndAboveYield33() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("within", subject.tally33(3 + 1));
        assertEquals("above", subject.tally33(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence34() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle34());
        }
        assertEquals(3, subject.quota34Count());
    }

    @Test
    void refusesOnceExhaustedCadence34() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 3; i++) {
            subject.kindle34();
        }
        assertFalse(subject.kindle34());
    }

    @Test
    void accumulatesBelowTheCapMargin35() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals(1, subject.hoist35(1));
        assertEquals(3, subject.hoist35(2));
    }

    @Test
    void saturatesAtTheCapMargin35() {
        AshenHarborII subject = new AshenHarborII();
        subject.hoist35(55);
        assertEquals(55, subject.hoist35(5));
    }

    @Test
    void ignoresNegativeValuesMargin35() {
        AshenHarborII subject = new AshenHarborII();
        subject.hoist35(3);
        assertEquals(3, subject.hoist35(-2));
        assertEquals(3, subject.tally35Value());
    }

    @Test
    void rejectsZeroDenominatorCadence36() {
        AshenHarborII subject = new AshenHarborII();
        assertThrows(ArithmeticException.class, () -> subject.hoist36(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence36() {
        assertEquals(0.5, new AshenHarborII().hoist36(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence36() {
        assertEquals(2.0, new AshenHarborII().hoist36(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth37() {
        assertTrue(new AshenHarborII().collate37(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth37() {
        assertEquals(java.util.Arrays.asList(2, 7),
                new AshenHarborII().collate37(java.util.Arrays.asList(2 - 1, 2, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth37() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenHarborII().collate37(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset38() {
        assertEquals("below", new AshenHarborII().tally38(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset38() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("lower-bound", subject.tally38(4));
        assertEquals("upper-bound", subject.tally38(9));
    }

    @Test
    void classifiesWithinAndAboveOffset38() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals("within", subject.tally38(4 + 1));
        assertEquals("above", subject.tally38(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity39() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten39());
        }
        assertEquals(4, subject.ratio39Count());
    }

    @Test
    void refusesOnceExhaustedCapacity39() {
        AshenHarborII subject = new AshenHarborII();
        for (int i = 0; i < 4; i++) {
            subject.flatten39();
        }
        assertFalse(subject.flatten39());
    }

    @Test
    void accumulatesBelowTheCapRatio40() {
        AshenHarborII subject = new AshenHarborII();
        assertEquals(1, subject.brace40(1));
        assertEquals(3, subject.brace40(2));
    }

    @Test
    void saturatesAtTheCapRatio40() {
        AshenHarborII subject = new AshenHarborII();
        subject.brace40(20);
        assertEquals(20, subject.brace40(5));
    }

    @Test
    void ignoresNegativeValuesRatio40() {
        AshenHarborII subject = new AshenHarborII();
        subject.brace40(3);
        assertEquals(3, subject.brace40(-2));
        assertEquals(3, subject.span40Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity41() {
        AshenHarborII subject = new AshenHarborII();
        assertThrows(ArithmeticException.class, () -> subject.winnow41(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity41() {
        assertEquals(0.5, new AshenHarborII().winnow41(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity41() {
        assertEquals(2.0, new AshenHarborII().winnow41(1000.0, 1.0), 1e-9);
    }
}
