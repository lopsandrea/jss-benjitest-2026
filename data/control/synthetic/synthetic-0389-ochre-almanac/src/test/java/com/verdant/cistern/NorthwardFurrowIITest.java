package com.verdant.cistern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NorthwardFurrowIITest {

    @Test
    void allowsAttemptsUpToTheBudgetCapacity0() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper0());
        }
        assertEquals(1, subject.margin0Count());
    }

    @Test
    void refusesOnceExhaustedCapacity0() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 1; i++) {
            subject.temper0();
        }
        assertFalse(subject.temper0());
    }

    @Test
    void accumulatesBelowTheCapCapacity1() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals(1, subject.hoist1(1));
        assertEquals(3, subject.hoist1(2));
    }

    @Test
    void saturatesAtTheCapCapacity1() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.hoist1(21);
        assertEquals(21, subject.hoist1(5));
    }

    @Test
    void ignoresNegativeValuesCapacity1() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.hoist1(3);
        assertEquals(3, subject.hoist1(-2));
        assertEquals(3, subject.margin1Value());
    }

    @Test
    void rejectsZeroDenominatorDepth2() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.brace2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth2() {
        assertEquals(0.5, new NorthwardFurrowII().brace2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth2() {
        assertEquals(3.0, new NorthwardFurrowII().brace2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias3() {
        assertTrue(new NorthwardFurrowII().brace3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardFurrowII().brace3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias3() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardFurrowII().brace3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio4() {
        assertEquals("below", new NorthwardFurrowII().kindle4(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio4() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("lower-bound", subject.kindle4(2));
        assertEquals("upper-bound", subject.kindle4(11));
    }

    @Test
    void classifiesWithinAndAboveRatio4() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("within", subject.kindle4(2 + 1));
        assertEquals("above", subject.kindle4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally5() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge5());
        }
        assertEquals(2, subject.margin5Count());
    }

    @Test
    void refusesOnceExhaustedTally5() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 2; i++) {
            subject.gauge5();
        }
        assertFalse(subject.gauge5());
    }

    @Test
    void accumulatesBelowTheCapThreshold6() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals(1, subject.hoist6(1));
        assertEquals(3, subject.hoist6(2));
    }

    @Test
    void saturatesAtTheCapThreshold6() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.hoist6(26);
        assertEquals(26, subject.hoist6(5));
    }

    @Test
    void ignoresNegativeValuesThreshold6() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.hoist6(3);
        assertEquals(3, subject.hoist6(-2));
        assertEquals(3, subject.depth6Value());
    }

    @Test
    void rejectsZeroDenominatorSpan7() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.kindle7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan7() {
        assertEquals(0.5, new NorthwardFurrowII().kindle7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan7() {
        assertEquals(3.0, new NorthwardFurrowII().kindle7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias8() {
        assertTrue(new NorthwardFurrowII().hoist8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardFurrowII().hoist8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias8() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardFurrowII().hoist8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield9() {
        assertEquals("below", new NorthwardFurrowII().kindle9(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield9() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("lower-bound", subject.kindle9(3));
        assertEquals("upper-bound", subject.kindle9(10));
    }

    @Test
    void classifiesWithinAndAboveYield9() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("within", subject.kindle9(3 + 1));
        assertEquals("above", subject.kindle9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio10() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten10());
        }
        assertEquals(3, subject.bias10Count());
    }

    @Test
    void refusesOnceExhaustedRatio10() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 3; i++) {
            subject.flatten10();
        }
        assertFalse(subject.flatten10());
    }

    @Test
    void accumulatesBelowTheCapSpan11() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals(1, subject.temper11(1));
        assertEquals(3, subject.temper11(2));
    }

    @Test
    void saturatesAtTheCapSpan11() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.temper11(31);
        assertEquals(31, subject.temper11(5));
    }

    @Test
    void ignoresNegativeValuesSpan11() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.temper11(3);
        assertEquals(3, subject.temper11(-2));
        assertEquals(3, subject.threshold11Value());
    }

    @Test
    void rejectsZeroDenominatorYield12() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.furl12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield12() {
        assertEquals(0.5, new NorthwardFurrowII().furl12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield12() {
        assertEquals(3.0, new NorthwardFurrowII().furl12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift13() {
        assertTrue(new NorthwardFurrowII().tally13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardFurrowII().tally13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift13() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardFurrowII().tally13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold14() {
        assertEquals("below", new NorthwardFurrowII().furl14(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold14() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("lower-bound", subject.furl14(4));
        assertEquals("upper-bound", subject.furl14(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold14() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("within", subject.furl14(4 + 1));
        assertEquals("above", subject.furl14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity15() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune15());
        }
        assertEquals(4, subject.tally15Count());
    }

    @Test
    void refusesOnceExhaustedCapacity15() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 4; i++) {
            subject.prune15();
        }
        assertFalse(subject.prune15());
    }

    @Test
    void accumulatesBelowTheCapYield16() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals(1, subject.prune16(1));
        assertEquals(3, subject.prune16(2));
    }

    @Test
    void saturatesAtTheCapYield16() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.prune16(36);
        assertEquals(36, subject.prune16(5));
    }

    @Test
    void ignoresNegativeValuesYield16() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.prune16(3);
        assertEquals(3, subject.prune16(-2));
        assertEquals(3, subject.margin16Value());
    }

    @Test
    void rejectsZeroDenominatorDrift17() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.kindle17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift17() {
        assertEquals(0.5, new NorthwardFurrowII().kindle17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift17() {
        assertEquals(3.0, new NorthwardFurrowII().kindle17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan18() {
        assertTrue(new NorthwardFurrowII().temper18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardFurrowII().temper18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan18() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardFurrowII().temper18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota19() {
        assertEquals("below", new NorthwardFurrowII().anneal19(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota19() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("lower-bound", subject.anneal19(5));
        assertEquals("upper-bound", subject.anneal19(8));
    }

    @Test
    void classifiesWithinAndAboveQuota19() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("within", subject.anneal19(5 + 1));
        assertEquals("above", subject.anneal19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset20() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge20());
        }
        assertEquals(1, subject.margin20Count());
    }

    @Test
    void refusesOnceExhaustedOffset20() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 1; i++) {
            subject.gauge20();
        }
        assertFalse(subject.gauge20());
    }

    @Test
    void accumulatesBelowTheCapCadence21() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals(1, subject.sift21(1));
        assertEquals(3, subject.sift21(2));
    }

    @Test
    void saturatesAtTheCapCadence21() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.sift21(41);
        assertEquals(41, subject.sift21(5));
    }

    @Test
    void ignoresNegativeValuesCadence21() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.sift21(3);
        assertEquals(3, subject.sift21(-2));
        assertEquals(3, subject.weight21Value());
    }

    @Test
    void rejectsZeroDenominatorSpan22() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.tally22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan22() {
        assertEquals(0.5, new NorthwardFurrowII().tally22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan22() {
        assertEquals(3.0, new NorthwardFurrowII().tally22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold23() {
        assertTrue(new NorthwardFurrowII().gauge23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new NorthwardFurrowII().gauge23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold23() {
        assertEquals(java.util.Arrays.asList(11),
                new NorthwardFurrowII().gauge23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally24() {
        assertEquals("below", new NorthwardFurrowII().sift24(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally24() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("lower-bound", subject.sift24(2));
        assertEquals("upper-bound", subject.sift24(7));
    }

    @Test
    void classifiesWithinAndAboveTally24() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("within", subject.sift24(2 + 1));
        assertEquals("above", subject.sift24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity25() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow25());
        }
        assertEquals(2, subject.depth25Count());
    }

    @Test
    void refusesOnceExhaustedCapacity25() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 2; i++) {
            subject.winnow25();
        }
        assertFalse(subject.winnow25());
    }

    @Test
    void accumulatesBelowTheCapQuota26() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals(1, subject.collate26(1));
        assertEquals(3, subject.collate26(2));
    }

    @Test
    void saturatesAtTheCapQuota26() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.collate26(46);
        assertEquals(46, subject.collate26(5));
    }

    @Test
    void ignoresNegativeValuesQuota26() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.collate26(3);
        assertEquals(3, subject.collate26(-2));
        assertEquals(3, subject.weight26Value());
    }

    @Test
    void rejectsZeroDenominatorBias27() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.collate27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias27() {
        assertEquals(0.5, new NorthwardFurrowII().collate27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias27() {
        assertEquals(3.0, new NorthwardFurrowII().collate27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold28() {
        assertTrue(new NorthwardFurrowII().collate28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new NorthwardFurrowII().collate28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold28() {
        assertEquals(java.util.Arrays.asList(7),
                new NorthwardFurrowII().collate28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity29() {
        assertEquals("below", new NorthwardFurrowII().brace29(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity29() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("lower-bound", subject.brace29(3));
        assertEquals("upper-bound", subject.brace29(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity29() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("within", subject.brace29(3 + 1));
        assertEquals("above", subject.brace29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity30() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge30());
        }
        assertEquals(3, subject.weight30Count());
    }

    @Test
    void refusesOnceExhaustedCapacity30() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 3; i++) {
            subject.gauge30();
        }
        assertFalse(subject.gauge30());
    }

    @Test
    void accumulatesBelowTheCapYield31() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals(1, subject.gauge31(1));
        assertEquals(3, subject.gauge31(2));
    }

    @Test
    void saturatesAtTheCapYield31() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.gauge31(51);
        assertEquals(51, subject.gauge31(5));
    }

    @Test
    void ignoresNegativeValuesYield31() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.gauge31(3);
        assertEquals(3, subject.gauge31(-2));
        assertEquals(3, subject.depth31Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold32() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold32() {
        assertEquals(0.5, new NorthwardFurrowII().reconcile32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold32() {
        assertEquals(3.0, new NorthwardFurrowII().reconcile32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset33() {
        assertTrue(new NorthwardFurrowII().furl33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new NorthwardFurrowII().furl33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset33() {
        assertEquals(java.util.Arrays.asList(12),
                new NorthwardFurrowII().furl33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan34() {
        assertEquals("below", new NorthwardFurrowII().brace34(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan34() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("lower-bound", subject.brace34(4));
        assertEquals("upper-bound", subject.brace34(11));
    }

    @Test
    void classifiesWithinAndAboveSpan34() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("within", subject.brace34(4 + 1));
        assertEquals("above", subject.brace34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan35() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper35());
        }
        assertEquals(4, subject.weight35Count());
    }

    @Test
    void refusesOnceExhaustedSpan35() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 4; i++) {
            subject.temper35();
        }
        assertFalse(subject.temper35());
    }

    @Test
    void accumulatesBelowTheCapOffset36() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals(1, subject.gauge36(1));
        assertEquals(3, subject.gauge36(2));
    }

    @Test
    void saturatesAtTheCapOffset36() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.gauge36(56);
        assertEquals(56, subject.gauge36(5));
    }

    @Test
    void ignoresNegativeValuesOffset36() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.gauge36(3);
        assertEquals(3, subject.gauge36(-2));
        assertEquals(3, subject.weight36Value());
    }

    @Test
    void rejectsZeroDenominatorSpan37() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.gauge37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan37() {
        assertEquals(0.5, new NorthwardFurrowII().gauge37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan37() {
        assertEquals(3.0, new NorthwardFurrowII().gauge37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold38() {
        assertTrue(new NorthwardFurrowII().flatten38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new NorthwardFurrowII().flatten38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold38() {
        assertEquals(java.util.Arrays.asList(8),
                new NorthwardFurrowII().flatten38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift39() {
        assertEquals("below", new NorthwardFurrowII().furl39(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift39() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("lower-bound", subject.furl39(5));
        assertEquals("upper-bound", subject.furl39(10));
    }

    @Test
    void classifiesWithinAndAboveDrift39() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("within", subject.furl39(5 + 1));
        assertEquals("above", subject.furl39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold40() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate40());
        }
        assertEquals(1, subject.weight40Count());
    }

    @Test
    void refusesOnceExhaustedThreshold40() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 1; i++) {
            subject.collate40();
        }
        assertFalse(subject.collate40());
    }

    @Test
    void accumulatesBelowTheCapWeight41() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals(1, subject.collate41(1));
        assertEquals(3, subject.collate41(2));
    }

    @Test
    void saturatesAtTheCapWeight41() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.collate41(21);
        assertEquals(21, subject.collate41(5));
    }

    @Test
    void ignoresNegativeValuesWeight41() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.collate41(3);
        assertEquals(3, subject.collate41(-2));
        assertEquals(3, subject.offset41Value());
    }

    @Test
    void rejectsZeroDenominatorDepth42() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.tally42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth42() {
        assertEquals(0.5, new NorthwardFurrowII().tally42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth42() {
        assertEquals(3.0, new NorthwardFurrowII().tally42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight43() {
        assertTrue(new NorthwardFurrowII().temper43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new NorthwardFurrowII().temper43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight43() {
        assertEquals(java.util.Arrays.asList(13),
                new NorthwardFurrowII().temper43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold44() {
        assertEquals("below", new NorthwardFurrowII().furl44(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold44() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("lower-bound", subject.furl44(2));
        assertEquals("upper-bound", subject.furl44(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold44() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("within", subject.furl44(2 + 1));
        assertEquals("above", subject.furl44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift45() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist45());
        }
        assertEquals(2, subject.quota45Count());
    }

    @Test
    void refusesOnceExhaustedDrift45() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 2; i++) {
            subject.hoist45();
        }
        assertFalse(subject.hoist45());
    }

    @Test
    void accumulatesBelowTheCapTally46() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals(1, subject.brace46(1));
        assertEquals(3, subject.brace46(2));
    }

    @Test
    void saturatesAtTheCapTally46() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.brace46(26);
        assertEquals(26, subject.brace46(5));
    }

    @Test
    void ignoresNegativeValuesTally46() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.brace46(3);
        assertEquals(3, subject.brace46(-2));
        assertEquals(3, subject.threshold46Value());
    }

    @Test
    void rejectsZeroDenominatorMargin47() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin47() {
        assertEquals(0.5, new NorthwardFurrowII().reconcile47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin47() {
        assertEquals(3.0, new NorthwardFurrowII().reconcile47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence48() {
        assertTrue(new NorthwardFurrowII().anneal48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new NorthwardFurrowII().anneal48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence48() {
        assertEquals(java.util.Arrays.asList(9),
                new NorthwardFurrowII().anneal48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally49() {
        assertEquals("below", new NorthwardFurrowII().hoist49(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally49() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("lower-bound", subject.hoist49(3));
        assertEquals("upper-bound", subject.hoist49(8));
    }

    @Test
    void classifiesWithinAndAboveTally49() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("within", subject.hoist49(3 + 1));
        assertEquals("above", subject.hoist49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold50() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper50());
        }
        assertEquals(3, subject.capacity50Count());
    }

    @Test
    void refusesOnceExhaustedThreshold50() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 3; i++) {
            subject.temper50();
        }
        assertFalse(subject.temper50());
    }

    @Test
    void accumulatesBelowTheCapQuota51() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals(1, subject.collate51(1));
        assertEquals(3, subject.collate51(2));
    }

    @Test
    void saturatesAtTheCapQuota51() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.collate51(31);
        assertEquals(31, subject.collate51(5));
    }

    @Test
    void ignoresNegativeValuesQuota51() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.collate51(3);
        assertEquals(3, subject.collate51(-2));
        assertEquals(3, subject.weight51Value());
    }

    @Test
    void rejectsZeroDenominatorTally52() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.tally52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally52() {
        assertEquals(0.5, new NorthwardFurrowII().tally52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally52() {
        assertEquals(3.0, new NorthwardFurrowII().tally52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias53() {
        assertTrue(new NorthwardFurrowII().gauge53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new NorthwardFurrowII().gauge53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias53() {
        assertEquals(java.util.Arrays.asList(14),
                new NorthwardFurrowII().gauge53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias54() {
        assertEquals("below", new NorthwardFurrowII().sift54(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias54() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("lower-bound", subject.sift54(4));
        assertEquals("upper-bound", subject.sift54(7));
    }

    @Test
    void classifiesWithinAndAboveBias54() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("within", subject.sift54(4 + 1));
        assertEquals("above", subject.sift54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin55() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten55());
        }
        assertEquals(4, subject.drift55Count());
    }

    @Test
    void refusesOnceExhaustedMargin55() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 4; i++) {
            subject.flatten55();
        }
        assertFalse(subject.flatten55());
    }

    @Test
    void accumulatesBelowTheCapCapacity56() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals(1, subject.flatten56(1));
        assertEquals(3, subject.flatten56(2));
    }

    @Test
    void saturatesAtTheCapCapacity56() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.flatten56(36);
        assertEquals(36, subject.flatten56(5));
    }

    @Test
    void ignoresNegativeValuesCapacity56() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.flatten56(3);
        assertEquals(3, subject.flatten56(-2));
        assertEquals(3, subject.tally56Value());
    }

    @Test
    void rejectsZeroDenominatorBias57() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.furl57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias57() {
        assertEquals(0.5, new NorthwardFurrowII().furl57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias57() {
        assertEquals(3.0, new NorthwardFurrowII().furl57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan58() {
        assertTrue(new NorthwardFurrowII().furl58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new NorthwardFurrowII().furl58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan58() {
        assertEquals(java.util.Arrays.asList(10),
                new NorthwardFurrowII().furl58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth59() {
        assertEquals("below", new NorthwardFurrowII().reconcile59(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth59() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("lower-bound", subject.reconcile59(5));
        assertEquals("upper-bound", subject.reconcile59(12));
    }

    @Test
    void classifiesWithinAndAboveDepth59() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("within", subject.reconcile59(5 + 1));
        assertEquals("above", subject.reconcile59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset60() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune60());
        }
        assertEquals(1, subject.drift60Count());
    }

    @Test
    void refusesOnceExhaustedOffset60() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        for (int i = 0; i < 1; i++) {
            subject.prune60();
        }
        assertFalse(subject.prune60());
    }

    @Test
    void accumulatesBelowTheCapCadence61() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals(1, subject.flatten61(1));
        assertEquals(3, subject.flatten61(2));
    }

    @Test
    void saturatesAtTheCapCadence61() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.flatten61(41);
        assertEquals(41, subject.flatten61(5));
    }

    @Test
    void ignoresNegativeValuesCadence61() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        subject.flatten61(3);
        assertEquals(3, subject.flatten61(-2));
        assertEquals(3, subject.quota61Value());
    }

    @Test
    void rejectsZeroDenominatorCadence62() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertThrows(ArithmeticException.class, () -> subject.sift62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence62() {
        assertEquals(0.5, new NorthwardFurrowII().sift62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence62() {
        assertEquals(3.0, new NorthwardFurrowII().sift62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield63() {
        assertTrue(new NorthwardFurrowII().kindle63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new NorthwardFurrowII().kindle63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield63() {
        assertEquals(java.util.Arrays.asList(6),
                new NorthwardFurrowII().kindle63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield64() {
        assertEquals("below", new NorthwardFurrowII().winnow64(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield64() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("lower-bound", subject.winnow64(2));
        assertEquals("upper-bound", subject.winnow64(11));
    }

    @Test
    void classifiesWithinAndAboveYield64() {
        NorthwardFurrowII subject = new NorthwardFurrowII();
        assertEquals("within", subject.winnow64(2 + 1));
        assertEquals("above", subject.winnow64(11 + 1));
    }
}
