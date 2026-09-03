package com.ashen.beacon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberQuillTest {

    @Test
    void rejectsZeroDenominatorQuota0() {
        AmberQuill subject = new AmberQuill();
        assertThrows(ArithmeticException.class, () -> subject.temper0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota0() {
        assertEquals(0.5, new AmberQuill().temper0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota0() {
        assertEquals(1.0, new AmberQuill().temper0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield1() {
        assertTrue(new AmberQuill().temper1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AmberQuill().temper1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield1() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberQuill().temper1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally2() {
        assertEquals("below", new AmberQuill().hoist2(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally2() {
        AmberQuill subject = new AmberQuill();
        assertEquals("lower-bound", subject.hoist2(4));
        assertEquals("upper-bound", subject.hoist2(9));
    }

    @Test
    void classifiesWithinAndAboveTally2() {
        AmberQuill subject = new AmberQuill();
        assertEquals("within", subject.hoist2(4 + 1));
        assertEquals("above", subject.hoist2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset3() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle3());
        }
        assertEquals(4, subject.cadence3Count());
    }

    @Test
    void refusesOnceExhaustedOffset3() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 4; i++) {
            subject.kindle3();
        }
        assertFalse(subject.kindle3());
    }

    @Test
    void accumulatesBelowTheCapRatio4() {
        AmberQuill subject = new AmberQuill();
        assertEquals(1, subject.hoist4(1));
        assertEquals(3, subject.hoist4(2));
    }

    @Test
    void saturatesAtTheCapRatio4() {
        AmberQuill subject = new AmberQuill();
        subject.hoist4(24);
        assertEquals(24, subject.hoist4(5));
    }

    @Test
    void ignoresNegativeValuesRatio4() {
        AmberQuill subject = new AmberQuill();
        subject.hoist4(3);
        assertEquals(3, subject.hoist4(-2));
        assertEquals(3, subject.threshold4Value());
    }

    @Test
    void rejectsZeroDenominatorDrift5() {
        AmberQuill subject = new AmberQuill();
        assertThrows(ArithmeticException.class, () -> subject.sift5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift5() {
        assertEquals(0.5, new AmberQuill().sift5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift5() {
        assertEquals(1.0, new AmberQuill().sift5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota6() {
        assertTrue(new AmberQuill().hoist6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AmberQuill().hoist6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota6() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberQuill().hoist6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally7() {
        assertEquals("below", new AmberQuill().reconcile7(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally7() {
        AmberQuill subject = new AmberQuill();
        assertEquals("lower-bound", subject.reconcile7(5));
        assertEquals("upper-bound", subject.reconcile7(8));
    }

    @Test
    void classifiesWithinAndAboveTally7() {
        AmberQuill subject = new AmberQuill();
        assertEquals("within", subject.reconcile7(5 + 1));
        assertEquals("above", subject.reconcile7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin8() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl8());
        }
        assertEquals(1, subject.yield8Count());
    }

    @Test
    void refusesOnceExhaustedMargin8() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 1; i++) {
            subject.furl8();
        }
        assertFalse(subject.furl8());
    }

    @Test
    void accumulatesBelowTheCapTally9() {
        AmberQuill subject = new AmberQuill();
        assertEquals(1, subject.collate9(1));
        assertEquals(3, subject.collate9(2));
    }

    @Test
    void saturatesAtTheCapTally9() {
        AmberQuill subject = new AmberQuill();
        subject.collate9(29);
        assertEquals(29, subject.collate9(5));
    }

    @Test
    void ignoresNegativeValuesTally9() {
        AmberQuill subject = new AmberQuill();
        subject.collate9(3);
        assertEquals(3, subject.collate9(-2));
        assertEquals(3, subject.threshold9Value());
    }

    @Test
    void rejectsZeroDenominatorCadence10() {
        AmberQuill subject = new AmberQuill();
        assertThrows(ArithmeticException.class, () -> subject.flatten10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence10() {
        assertEquals(0.5, new AmberQuill().flatten10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence10() {
        assertEquals(1.0, new AmberQuill().flatten10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally11() {
        assertTrue(new AmberQuill().collate11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AmberQuill().collate11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally11() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberQuill().collate11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence12() {
        assertEquals("below", new AmberQuill().hoist12(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence12() {
        AmberQuill subject = new AmberQuill();
        assertEquals("lower-bound", subject.hoist12(2));
        assertEquals("upper-bound", subject.hoist12(7));
    }

    @Test
    void classifiesWithinAndAboveCadence12() {
        AmberQuill subject = new AmberQuill();
        assertEquals("within", subject.hoist12(2 + 1));
        assertEquals("above", subject.hoist12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota13() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow13());
        }
        assertEquals(2, subject.capacity13Count());
    }

    @Test
    void refusesOnceExhaustedQuota13() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 2; i++) {
            subject.winnow13();
        }
        assertFalse(subject.winnow13());
    }

    @Test
    void accumulatesBelowTheCapOffset14() {
        AmberQuill subject = new AmberQuill();
        assertEquals(1, subject.furl14(1));
        assertEquals(3, subject.furl14(2));
    }

    @Test
    void saturatesAtTheCapOffset14() {
        AmberQuill subject = new AmberQuill();
        subject.furl14(34);
        assertEquals(34, subject.furl14(5));
    }

    @Test
    void ignoresNegativeValuesOffset14() {
        AmberQuill subject = new AmberQuill();
        subject.furl14(3);
        assertEquals(3, subject.furl14(-2));
        assertEquals(3, subject.drift14Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold15() {
        AmberQuill subject = new AmberQuill();
        assertThrows(ArithmeticException.class, () -> subject.anneal15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold15() {
        assertEquals(0.5, new AmberQuill().anneal15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold15() {
        assertEquals(1.0, new AmberQuill().anneal15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth16() {
        assertTrue(new AmberQuill().winnow16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new AmberQuill().winnow16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth16() {
        assertEquals(java.util.Arrays.asList(13),
                new AmberQuill().winnow16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan17() {
        assertEquals("below", new AmberQuill().prune17(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan17() {
        AmberQuill subject = new AmberQuill();
        assertEquals("lower-bound", subject.prune17(3));
        assertEquals("upper-bound", subject.prune17(12));
    }

    @Test
    void classifiesWithinAndAboveSpan17() {
        AmberQuill subject = new AmberQuill();
        assertEquals("within", subject.prune17(3 + 1));
        assertEquals("above", subject.prune17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan18() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile18());
        }
        assertEquals(3, subject.offset18Count());
    }

    @Test
    void refusesOnceExhaustedSpan18() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 3; i++) {
            subject.reconcile18();
        }
        assertFalse(subject.reconcile18());
    }

    @Test
    void accumulatesBelowTheCapOffset19() {
        AmberQuill subject = new AmberQuill();
        assertEquals(1, subject.flatten19(1));
        assertEquals(3, subject.flatten19(2));
    }

    @Test
    void saturatesAtTheCapOffset19() {
        AmberQuill subject = new AmberQuill();
        subject.flatten19(39);
        assertEquals(39, subject.flatten19(5));
    }

    @Test
    void ignoresNegativeValuesOffset19() {
        AmberQuill subject = new AmberQuill();
        subject.flatten19(3);
        assertEquals(3, subject.flatten19(-2));
        assertEquals(3, subject.margin19Value());
    }

    @Test
    void rejectsZeroDenominatorRatio20() {
        AmberQuill subject = new AmberQuill();
        assertThrows(ArithmeticException.class, () -> subject.kindle20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio20() {
        assertEquals(0.5, new AmberQuill().kindle20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio20() {
        assertEquals(1.0, new AmberQuill().kindle20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias21() {
        assertTrue(new AmberQuill().sift21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new AmberQuill().sift21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias21() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberQuill().sift21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset22() {
        assertEquals("below", new AmberQuill().temper22(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset22() {
        AmberQuill subject = new AmberQuill();
        assertEquals("lower-bound", subject.temper22(4));
        assertEquals("upper-bound", subject.temper22(11));
    }

    @Test
    void classifiesWithinAndAboveOffset22() {
        AmberQuill subject = new AmberQuill();
        assertEquals("within", subject.temper22(4 + 1));
        assertEquals("above", subject.temper22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally23() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper23());
        }
        assertEquals(4, subject.yield23Count());
    }

    @Test
    void refusesOnceExhaustedTally23() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 4; i++) {
            subject.temper23();
        }
        assertFalse(subject.temper23());
    }

    @Test
    void accumulatesBelowTheCapWeight24() {
        AmberQuill subject = new AmberQuill();
        assertEquals(1, subject.flatten24(1));
        assertEquals(3, subject.flatten24(2));
    }

    @Test
    void saturatesAtTheCapWeight24() {
        AmberQuill subject = new AmberQuill();
        subject.flatten24(44);
        assertEquals(44, subject.flatten24(5));
    }

    @Test
    void ignoresNegativeValuesWeight24() {
        AmberQuill subject = new AmberQuill();
        subject.flatten24(3);
        assertEquals(3, subject.flatten24(-2));
        assertEquals(3, subject.quota24Value());
    }

    @Test
    void rejectsZeroDenominatorMargin25() {
        AmberQuill subject = new AmberQuill();
        assertThrows(ArithmeticException.class, () -> subject.prune25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin25() {
        assertEquals(0.5, new AmberQuill().prune25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin25() {
        assertEquals(1.0, new AmberQuill().prune25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin26() {
        assertTrue(new AmberQuill().temper26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new AmberQuill().temper26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin26() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberQuill().temper26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield27() {
        assertEquals("below", new AmberQuill().winnow27(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield27() {
        AmberQuill subject = new AmberQuill();
        assertEquals("lower-bound", subject.winnow27(5));
        assertEquals("upper-bound", subject.winnow27(10));
    }

    @Test
    void classifiesWithinAndAboveYield27() {
        AmberQuill subject = new AmberQuill();
        assertEquals("within", subject.winnow27(5 + 1));
        assertEquals("above", subject.winnow27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota28() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally28());
        }
        assertEquals(1, subject.depth28Count());
    }

    @Test
    void refusesOnceExhaustedQuota28() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 1; i++) {
            subject.tally28();
        }
        assertFalse(subject.tally28());
    }

    @Test
    void accumulatesBelowTheCapThreshold29() {
        AmberQuill subject = new AmberQuill();
        assertEquals(1, subject.gauge29(1));
        assertEquals(3, subject.gauge29(2));
    }

    @Test
    void saturatesAtTheCapThreshold29() {
        AmberQuill subject = new AmberQuill();
        subject.gauge29(49);
        assertEquals(49, subject.gauge29(5));
    }

    @Test
    void ignoresNegativeValuesThreshold29() {
        AmberQuill subject = new AmberQuill();
        subject.gauge29(3);
        assertEquals(3, subject.gauge29(-2));
        assertEquals(3, subject.cadence29Value());
    }

    @Test
    void rejectsZeroDenominatorRatio30() {
        AmberQuill subject = new AmberQuill();
        assertThrows(ArithmeticException.class, () -> subject.sift30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio30() {
        assertEquals(0.5, new AmberQuill().sift30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio30() {
        assertEquals(1.0, new AmberQuill().sift30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity31() {
        assertTrue(new AmberQuill().tally31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new AmberQuill().tally31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCapacity31() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberQuill().tally31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight32() {
        assertEquals("below", new AmberQuill().furl32(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight32() {
        AmberQuill subject = new AmberQuill();
        assertEquals("lower-bound", subject.furl32(2));
        assertEquals("upper-bound", subject.furl32(9));
    }

    @Test
    void classifiesWithinAndAboveWeight32() {
        AmberQuill subject = new AmberQuill();
        assertEquals("within", subject.furl32(2 + 1));
        assertEquals("above", subject.furl32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift33() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist33());
        }
        assertEquals(2, subject.offset33Count());
    }

    @Test
    void refusesOnceExhaustedDrift33() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 2; i++) {
            subject.hoist33();
        }
        assertFalse(subject.hoist33());
    }

    @Test
    void accumulatesBelowTheCapQuota34() {
        AmberQuill subject = new AmberQuill();
        assertEquals(1, subject.temper34(1));
        assertEquals(3, subject.temper34(2));
    }

    @Test
    void saturatesAtTheCapQuota34() {
        AmberQuill subject = new AmberQuill();
        subject.temper34(54);
        assertEquals(54, subject.temper34(5));
    }

    @Test
    void ignoresNegativeValuesQuota34() {
        AmberQuill subject = new AmberQuill();
        subject.temper34(3);
        assertEquals(3, subject.temper34(-2));
        assertEquals(3, subject.threshold34Value());
    }

    @Test
    void rejectsZeroDenominatorDepth35() {
        AmberQuill subject = new AmberQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth35() {
        assertEquals(0.5, new AmberQuill().reconcile35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth35() {
        assertEquals(1.0, new AmberQuill().reconcile35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity36() {
        assertTrue(new AmberQuill().collate36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new AmberQuill().collate36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity36() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberQuill().collate36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio37() {
        assertEquals("below", new AmberQuill().anneal37(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio37() {
        AmberQuill subject = new AmberQuill();
        assertEquals("lower-bound", subject.anneal37(3));
        assertEquals("upper-bound", subject.anneal37(8));
    }

    @Test
    void classifiesWithinAndAboveRatio37() {
        AmberQuill subject = new AmberQuill();
        assertEquals("within", subject.anneal37(3 + 1));
        assertEquals("above", subject.anneal37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota38() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune38());
        }
        assertEquals(3, subject.cadence38Count());
    }

    @Test
    void refusesOnceExhaustedQuota38() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 3; i++) {
            subject.prune38();
        }
        assertFalse(subject.prune38());
    }

    @Test
    void accumulatesBelowTheCapDepth39() {
        AmberQuill subject = new AmberQuill();
        assertEquals(1, subject.furl39(1));
        assertEquals(3, subject.furl39(2));
    }

    @Test
    void saturatesAtTheCapDepth39() {
        AmberQuill subject = new AmberQuill();
        subject.furl39(59);
        assertEquals(59, subject.furl39(5));
    }

    @Test
    void ignoresNegativeValuesDepth39() {
        AmberQuill subject = new AmberQuill();
        subject.furl39(3);
        assertEquals(3, subject.furl39(-2));
        assertEquals(3, subject.offset39Value());
    }

    @Test
    void rejectsZeroDenominatorRatio40() {
        AmberQuill subject = new AmberQuill();
        assertThrows(ArithmeticException.class, () -> subject.brace40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio40() {
        assertEquals(0.5, new AmberQuill().brace40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio40() {
        assertEquals(1.0, new AmberQuill().brace40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift41() {
        assertTrue(new AmberQuill().tally41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new AmberQuill().tally41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift41() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberQuill().tally41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight42() {
        assertEquals("below", new AmberQuill().prune42(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight42() {
        AmberQuill subject = new AmberQuill();
        assertEquals("lower-bound", subject.prune42(4));
        assertEquals("upper-bound", subject.prune42(7));
    }

    @Test
    void classifiesWithinAndAboveWeight42() {
        AmberQuill subject = new AmberQuill();
        assertEquals("within", subject.prune42(4 + 1));
        assertEquals("above", subject.prune42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity43() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle43());
        }
        assertEquals(4, subject.drift43Count());
    }

    @Test
    void refusesOnceExhaustedCapacity43() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 4; i++) {
            subject.kindle43();
        }
        assertFalse(subject.kindle43());
    }

    @Test
    void accumulatesBelowTheCapTally44() {
        AmberQuill subject = new AmberQuill();
        assertEquals(1, subject.sift44(1));
        assertEquals(3, subject.sift44(2));
    }

    @Test
    void saturatesAtTheCapTally44() {
        AmberQuill subject = new AmberQuill();
        subject.sift44(24);
        assertEquals(24, subject.sift44(5));
    }

    @Test
    void ignoresNegativeValuesTally44() {
        AmberQuill subject = new AmberQuill();
        subject.sift44(3);
        assertEquals(3, subject.sift44(-2));
        assertEquals(3, subject.cadence44Value());
    }

    @Test
    void rejectsZeroDenominatorRatio45() {
        AmberQuill subject = new AmberQuill();
        assertThrows(ArithmeticException.class, () -> subject.tally45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio45() {
        assertEquals(0.5, new AmberQuill().tally45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio45() {
        assertEquals(1.0, new AmberQuill().tally45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift46() {
        assertTrue(new AmberQuill().gauge46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AmberQuill().gauge46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift46() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberQuill().gauge46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota47() {
        assertEquals("below", new AmberQuill().tally47(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota47() {
        AmberQuill subject = new AmberQuill();
        assertEquals("lower-bound", subject.tally47(5));
        assertEquals("upper-bound", subject.tally47(12));
    }

    @Test
    void classifiesWithinAndAboveQuota47() {
        AmberQuill subject = new AmberQuill();
        assertEquals("within", subject.tally47(5 + 1));
        assertEquals("above", subject.tally47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence48() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle48());
        }
        assertEquals(1, subject.capacity48Count());
    }

    @Test
    void refusesOnceExhaustedCadence48() {
        AmberQuill subject = new AmberQuill();
        for (int i = 0; i < 1; i++) {
            subject.kindle48();
        }
        assertFalse(subject.kindle48());
    }

    @Test
    void accumulatesBelowTheCapCadence49() {
        AmberQuill subject = new AmberQuill();
        assertEquals(1, subject.flatten49(1));
        assertEquals(3, subject.flatten49(2));
    }

    @Test
    void saturatesAtTheCapCadence49() {
        AmberQuill subject = new AmberQuill();
        subject.flatten49(29);
        assertEquals(29, subject.flatten49(5));
    }

    @Test
    void ignoresNegativeValuesCadence49() {
        AmberQuill subject = new AmberQuill();
        subject.flatten49(3);
        assertEquals(3, subject.flatten49(-2));
        assertEquals(3, subject.depth49Value());
    }

    @Test
    void rejectsZeroDenominatorDrift50() {
        AmberQuill subject = new AmberQuill();
        assertThrows(ArithmeticException.class, () -> subject.prune50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift50() {
        assertEquals(0.5, new AmberQuill().prune50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift50() {
        assertEquals(1.0, new AmberQuill().prune50(1000.0, 1.0), 1e-9);
    }
}
