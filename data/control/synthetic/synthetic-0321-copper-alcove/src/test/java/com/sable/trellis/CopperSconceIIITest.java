package com.sable.trellis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CopperSconceIIITest {

    @Test
    void rejectsZeroDenominatorSpan0() {
        CopperSconceIII subject = new CopperSconceIII();
        assertThrows(ArithmeticException.class, () -> subject.sift0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan0() {
        assertEquals(0.5, new CopperSconceIII().sift0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan0() {
        assertEquals(1.0, new CopperSconceIII().sift0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity1() {
        assertTrue(new CopperSconceIII().tally1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new CopperSconceIII().tally1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity1() {
        assertEquals(java.util.Arrays.asList(7),
                new CopperSconceIII().tally1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield2() {
        assertEquals("below", new CopperSconceIII().furl2(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield2() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("lower-bound", subject.furl2(4));
        assertEquals("upper-bound", subject.furl2(9));
    }

    @Test
    void classifiesWithinAndAboveYield2() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("within", subject.furl2(4 + 1));
        assertEquals("above", subject.furl2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota3() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace3());
        }
        assertEquals(4, subject.ratio3Count());
    }

    @Test
    void refusesOnceExhaustedQuota3() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 4; i++) {
            subject.brace3();
        }
        assertFalse(subject.brace3());
    }

    @Test
    void accumulatesBelowTheCapCapacity4() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals(1, subject.kindle4(1));
        assertEquals(3, subject.kindle4(2));
    }

    @Test
    void saturatesAtTheCapCapacity4() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.kindle4(24);
        assertEquals(24, subject.kindle4(5));
    }

    @Test
    void ignoresNegativeValuesCapacity4() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.kindle4(3);
        assertEquals(3, subject.kindle4(-2));
        assertEquals(3, subject.span4Value());
    }

    @Test
    void rejectsZeroDenominatorDrift5() {
        CopperSconceIII subject = new CopperSconceIII();
        assertThrows(ArithmeticException.class, () -> subject.flatten5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift5() {
        assertEquals(0.5, new CopperSconceIII().flatten5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift5() {
        assertEquals(1.0, new CopperSconceIII().flatten5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence6() {
        assertTrue(new CopperSconceIII().sift6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new CopperSconceIII().sift6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence6() {
        assertEquals(java.util.Arrays.asList(12),
                new CopperSconceIII().sift6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias7() {
        assertEquals("below", new CopperSconceIII().hoist7(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias7() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("lower-bound", subject.hoist7(5));
        assertEquals("upper-bound", subject.hoist7(8));
    }

    @Test
    void classifiesWithinAndAboveBias7() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("within", subject.hoist7(5 + 1));
        assertEquals("above", subject.hoist7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias8() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune8());
        }
        assertEquals(1, subject.ratio8Count());
    }

    @Test
    void refusesOnceExhaustedBias8() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 1; i++) {
            subject.prune8();
        }
        assertFalse(subject.prune8());
    }

    @Test
    void accumulatesBelowTheCapRatio9() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals(1, subject.hoist9(1));
        assertEquals(3, subject.hoist9(2));
    }

    @Test
    void saturatesAtTheCapRatio9() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.hoist9(29);
        assertEquals(29, subject.hoist9(5));
    }

    @Test
    void ignoresNegativeValuesRatio9() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.hoist9(3);
        assertEquals(3, subject.hoist9(-2));
        assertEquals(3, subject.cadence9Value());
    }

    @Test
    void rejectsZeroDenominatorMargin10() {
        CopperSconceIII subject = new CopperSconceIII();
        assertThrows(ArithmeticException.class, () -> subject.furl10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin10() {
        assertEquals(0.5, new CopperSconceIII().furl10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin10() {
        assertEquals(1.0, new CopperSconceIII().furl10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin11() {
        assertTrue(new CopperSconceIII().collate11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new CopperSconceIII().collate11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin11() {
        assertEquals(java.util.Arrays.asList(8),
                new CopperSconceIII().collate11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield12() {
        assertEquals("below", new CopperSconceIII().collate12(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield12() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("lower-bound", subject.collate12(2));
        assertEquals("upper-bound", subject.collate12(7));
    }

    @Test
    void classifiesWithinAndAboveYield12() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("within", subject.collate12(2 + 1));
        assertEquals("above", subject.collate12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight13() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate13());
        }
        assertEquals(2, subject.drift13Count());
    }

    @Test
    void refusesOnceExhaustedWeight13() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 2; i++) {
            subject.collate13();
        }
        assertFalse(subject.collate13());
    }

    @Test
    void accumulatesBelowTheCapTally14() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals(1, subject.collate14(1));
        assertEquals(3, subject.collate14(2));
    }

    @Test
    void saturatesAtTheCapTally14() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.collate14(34);
        assertEquals(34, subject.collate14(5));
    }

    @Test
    void ignoresNegativeValuesTally14() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.collate14(3);
        assertEquals(3, subject.collate14(-2));
        assertEquals(3, subject.weight14Value());
    }

    @Test
    void rejectsZeroDenominatorDrift15() {
        CopperSconceIII subject = new CopperSconceIII();
        assertThrows(ArithmeticException.class, () -> subject.sift15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift15() {
        assertEquals(0.5, new CopperSconceIII().sift15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift15() {
        assertEquals(1.0, new CopperSconceIII().sift15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight16() {
        assertTrue(new CopperSconceIII().collate16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new CopperSconceIII().collate16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight16() {
        assertEquals(java.util.Arrays.asList(13),
                new CopperSconceIII().collate16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan17() {
        assertEquals("below", new CopperSconceIII().flatten17(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan17() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("lower-bound", subject.flatten17(3));
        assertEquals("upper-bound", subject.flatten17(12));
    }

    @Test
    void classifiesWithinAndAboveSpan17() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("within", subject.flatten17(3 + 1));
        assertEquals("above", subject.flatten17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight18() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune18());
        }
        assertEquals(3, subject.offset18Count());
    }

    @Test
    void refusesOnceExhaustedWeight18() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 3; i++) {
            subject.prune18();
        }
        assertFalse(subject.prune18());
    }

    @Test
    void accumulatesBelowTheCapTally19() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals(1, subject.temper19(1));
        assertEquals(3, subject.temper19(2));
    }

    @Test
    void saturatesAtTheCapTally19() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.temper19(39);
        assertEquals(39, subject.temper19(5));
    }

    @Test
    void ignoresNegativeValuesTally19() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.temper19(3);
        assertEquals(3, subject.temper19(-2));
        assertEquals(3, subject.drift19Value());
    }

    @Test
    void rejectsZeroDenominatorWeight20() {
        CopperSconceIII subject = new CopperSconceIII();
        assertThrows(ArithmeticException.class, () -> subject.kindle20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight20() {
        assertEquals(0.5, new CopperSconceIII().kindle20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight20() {
        assertEquals(1.0, new CopperSconceIII().kindle20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence21() {
        assertTrue(new CopperSconceIII().collate21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new CopperSconceIII().collate21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence21() {
        assertEquals(java.util.Arrays.asList(9),
                new CopperSconceIII().collate21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias22() {
        assertEquals("below", new CopperSconceIII().tally22(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias22() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("lower-bound", subject.tally22(4));
        assertEquals("upper-bound", subject.tally22(11));
    }

    @Test
    void classifiesWithinAndAboveBias22() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("within", subject.tally22(4 + 1));
        assertEquals("above", subject.tally22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota23() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle23());
        }
        assertEquals(4, subject.weight23Count());
    }

    @Test
    void refusesOnceExhaustedQuota23() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 4; i++) {
            subject.kindle23();
        }
        assertFalse(subject.kindle23());
    }

    @Test
    void accumulatesBelowTheCapYield24() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals(1, subject.winnow24(1));
        assertEquals(3, subject.winnow24(2));
    }

    @Test
    void saturatesAtTheCapYield24() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.winnow24(44);
        assertEquals(44, subject.winnow24(5));
    }

    @Test
    void ignoresNegativeValuesYield24() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.winnow24(3);
        assertEquals(3, subject.winnow24(-2));
        assertEquals(3, subject.drift24Value());
    }

    @Test
    void rejectsZeroDenominatorTally25() {
        CopperSconceIII subject = new CopperSconceIII();
        assertThrows(ArithmeticException.class, () -> subject.temper25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally25() {
        assertEquals(0.5, new CopperSconceIII().temper25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally25() {
        assertEquals(1.0, new CopperSconceIII().temper25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias26() {
        assertTrue(new CopperSconceIII().flatten26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new CopperSconceIII().flatten26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias26() {
        assertEquals(java.util.Arrays.asList(14),
                new CopperSconceIII().flatten26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin27() {
        assertEquals("below", new CopperSconceIII().winnow27(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin27() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("lower-bound", subject.winnow27(5));
        assertEquals("upper-bound", subject.winnow27(10));
    }

    @Test
    void classifiesWithinAndAboveMargin27() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("within", subject.winnow27(5 + 1));
        assertEquals("above", subject.winnow27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias28() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune28());
        }
        assertEquals(1, subject.threshold28Count());
    }

    @Test
    void refusesOnceExhaustedBias28() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 1; i++) {
            subject.prune28();
        }
        assertFalse(subject.prune28());
    }

    @Test
    void accumulatesBelowTheCapQuota29() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals(1, subject.winnow29(1));
        assertEquals(3, subject.winnow29(2));
    }

    @Test
    void saturatesAtTheCapQuota29() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.winnow29(49);
        assertEquals(49, subject.winnow29(5));
    }

    @Test
    void ignoresNegativeValuesQuota29() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.winnow29(3);
        assertEquals(3, subject.winnow29(-2));
        assertEquals(3, subject.ratio29Value());
    }

    @Test
    void rejectsZeroDenominatorCadence30() {
        CopperSconceIII subject = new CopperSconceIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence30() {
        assertEquals(0.5, new CopperSconceIII().hoist30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence30() {
        assertEquals(1.0, new CopperSconceIII().hoist30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset31() {
        assertTrue(new CopperSconceIII().reconcile31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new CopperSconceIII().reconcile31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset31() {
        assertEquals(java.util.Arrays.asList(10),
                new CopperSconceIII().reconcile31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift32() {
        assertEquals("below", new CopperSconceIII().kindle32(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift32() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("lower-bound", subject.kindle32(2));
        assertEquals("upper-bound", subject.kindle32(9));
    }

    @Test
    void classifiesWithinAndAboveDrift32() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("within", subject.kindle32(2 + 1));
        assertEquals("above", subject.kindle32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth33() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift33());
        }
        assertEquals(2, subject.bias33Count());
    }

    @Test
    void refusesOnceExhaustedDepth33() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 2; i++) {
            subject.sift33();
        }
        assertFalse(subject.sift33());
    }

    @Test
    void accumulatesBelowTheCapBias34() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals(1, subject.anneal34(1));
        assertEquals(3, subject.anneal34(2));
    }

    @Test
    void saturatesAtTheCapBias34() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.anneal34(54);
        assertEquals(54, subject.anneal34(5));
    }

    @Test
    void ignoresNegativeValuesBias34() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.anneal34(3);
        assertEquals(3, subject.anneal34(-2));
        assertEquals(3, subject.quota34Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity35() {
        CopperSconceIII subject = new CopperSconceIII();
        assertThrows(ArithmeticException.class, () -> subject.prune35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity35() {
        assertEquals(0.5, new CopperSconceIII().prune35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity35() {
        assertEquals(1.0, new CopperSconceIII().prune35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio36() {
        assertTrue(new CopperSconceIII().reconcile36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new CopperSconceIII().reconcile36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio36() {
        assertEquals(java.util.Arrays.asList(6),
                new CopperSconceIII().reconcile36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota37() {
        assertEquals("below", new CopperSconceIII().hoist37(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota37() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("lower-bound", subject.hoist37(3));
        assertEquals("upper-bound", subject.hoist37(8));
    }

    @Test
    void classifiesWithinAndAboveQuota37() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals("within", subject.hoist37(3 + 1));
        assertEquals("above", subject.hoist37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight38() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist38());
        }
        assertEquals(3, subject.drift38Count());
    }

    @Test
    void refusesOnceExhaustedWeight38() {
        CopperSconceIII subject = new CopperSconceIII();
        for (int i = 0; i < 3; i++) {
            subject.hoist38();
        }
        assertFalse(subject.hoist38());
    }

    @Test
    void accumulatesBelowTheCapCapacity39() {
        CopperSconceIII subject = new CopperSconceIII();
        assertEquals(1, subject.sift39(1));
        assertEquals(3, subject.sift39(2));
    }

    @Test
    void saturatesAtTheCapCapacity39() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.sift39(59);
        assertEquals(59, subject.sift39(5));
    }

    @Test
    void ignoresNegativeValuesCapacity39() {
        CopperSconceIII subject = new CopperSconceIII();
        subject.sift39(3);
        assertEquals(3, subject.sift39(-2));
        assertEquals(3, subject.margin39Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold40() {
        CopperSconceIII subject = new CopperSconceIII();
        assertThrows(ArithmeticException.class, () -> subject.prune40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold40() {
        assertEquals(0.5, new CopperSconceIII().prune40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold40() {
        assertEquals(1.0, new CopperSconceIII().prune40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias41() {
        assertTrue(new CopperSconceIII().furl41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new CopperSconceIII().furl41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias41() {
        assertEquals(java.util.Arrays.asList(11),
                new CopperSconceIII().furl41(java.util.Arrays.asList(null, 11, null)));
    }
}
