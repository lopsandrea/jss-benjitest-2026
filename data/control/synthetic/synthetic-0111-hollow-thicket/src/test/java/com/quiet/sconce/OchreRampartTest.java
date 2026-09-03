package com.quiet.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OchreRampartTest {

    @Test
    void rejectsZeroDenominatorWeight0() {
        OchreRampart subject = new OchreRampart();
        assertThrows(ArithmeticException.class, () -> subject.kindle0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight0() {
        assertEquals(0.5, new OchreRampart().kindle0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight0() {
        assertEquals(1.0, new OchreRampart().kindle0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias1() {
        assertTrue(new OchreRampart().furl1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new OchreRampart().furl1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias1() {
        assertEquals(java.util.Arrays.asList(7),
                new OchreRampart().furl1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield2() {
        assertEquals("below", new OchreRampart().brace2(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield2() {
        OchreRampart subject = new OchreRampart();
        assertEquals("lower-bound", subject.brace2(4));
        assertEquals("upper-bound", subject.brace2(9));
    }

    @Test
    void classifiesWithinAndAboveYield2() {
        OchreRampart subject = new OchreRampart();
        assertEquals("within", subject.brace2(4 + 1));
        assertEquals("above", subject.brace2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset3() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl3());
        }
        assertEquals(4, subject.cadence3Count());
    }

    @Test
    void refusesOnceExhaustedOffset3() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 4; i++) {
            subject.furl3();
        }
        assertFalse(subject.furl3());
    }

    @Test
    void accumulatesBelowTheCapCapacity4() {
        OchreRampart subject = new OchreRampart();
        assertEquals(1, subject.sift4(1));
        assertEquals(3, subject.sift4(2));
    }

    @Test
    void saturatesAtTheCapCapacity4() {
        OchreRampart subject = new OchreRampart();
        subject.sift4(24);
        assertEquals(24, subject.sift4(5));
    }

    @Test
    void ignoresNegativeValuesCapacity4() {
        OchreRampart subject = new OchreRampart();
        subject.sift4(3);
        assertEquals(3, subject.sift4(-2));
        assertEquals(3, subject.weight4Value());
    }

    @Test
    void rejectsZeroDenominatorWeight5() {
        OchreRampart subject = new OchreRampart();
        assertThrows(ArithmeticException.class, () -> subject.collate5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight5() {
        assertEquals(0.5, new OchreRampart().collate5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight5() {
        assertEquals(1.0, new OchreRampart().collate5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight6() {
        assertTrue(new OchreRampart().reconcile6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new OchreRampart().reconcile6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight6() {
        assertEquals(java.util.Arrays.asList(12),
                new OchreRampart().reconcile6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift7() {
        assertEquals("below", new OchreRampart().temper7(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift7() {
        OchreRampart subject = new OchreRampart();
        assertEquals("lower-bound", subject.temper7(5));
        assertEquals("upper-bound", subject.temper7(8));
    }

    @Test
    void classifiesWithinAndAboveDrift7() {
        OchreRampart subject = new OchreRampart();
        assertEquals("within", subject.temper7(5 + 1));
        assertEquals("above", subject.temper7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight8() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten8());
        }
        assertEquals(1, subject.drift8Count());
    }

    @Test
    void refusesOnceExhaustedWeight8() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 1; i++) {
            subject.flatten8();
        }
        assertFalse(subject.flatten8());
    }

    @Test
    void accumulatesBelowTheCapTally9() {
        OchreRampart subject = new OchreRampart();
        assertEquals(1, subject.gauge9(1));
        assertEquals(3, subject.gauge9(2));
    }

    @Test
    void saturatesAtTheCapTally9() {
        OchreRampart subject = new OchreRampart();
        subject.gauge9(29);
        assertEquals(29, subject.gauge9(5));
    }

    @Test
    void ignoresNegativeValuesTally9() {
        OchreRampart subject = new OchreRampart();
        subject.gauge9(3);
        assertEquals(3, subject.gauge9(-2));
        assertEquals(3, subject.margin9Value());
    }

    @Test
    void rejectsZeroDenominatorDrift10() {
        OchreRampart subject = new OchreRampart();
        assertThrows(ArithmeticException.class, () -> subject.winnow10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift10() {
        assertEquals(0.5, new OchreRampart().winnow10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift10() {
        assertEquals(1.0, new OchreRampart().winnow10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift11() {
        assertTrue(new OchreRampart().prune11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new OchreRampart().prune11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift11() {
        assertEquals(java.util.Arrays.asList(8),
                new OchreRampart().prune11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight12() {
        assertEquals("below", new OchreRampart().prune12(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight12() {
        OchreRampart subject = new OchreRampart();
        assertEquals("lower-bound", subject.prune12(2));
        assertEquals("upper-bound", subject.prune12(7));
    }

    @Test
    void classifiesWithinAndAboveWeight12() {
        OchreRampart subject = new OchreRampart();
        assertEquals("within", subject.prune12(2 + 1));
        assertEquals("above", subject.prune12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight13() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace13());
        }
        assertEquals(2, subject.bias13Count());
    }

    @Test
    void refusesOnceExhaustedWeight13() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 2; i++) {
            subject.brace13();
        }
        assertFalse(subject.brace13());
    }

    @Test
    void accumulatesBelowTheCapQuota14() {
        OchreRampart subject = new OchreRampart();
        assertEquals(1, subject.sift14(1));
        assertEquals(3, subject.sift14(2));
    }

    @Test
    void saturatesAtTheCapQuota14() {
        OchreRampart subject = new OchreRampart();
        subject.sift14(34);
        assertEquals(34, subject.sift14(5));
    }

    @Test
    void ignoresNegativeValuesQuota14() {
        OchreRampart subject = new OchreRampart();
        subject.sift14(3);
        assertEquals(3, subject.sift14(-2));
        assertEquals(3, subject.cadence14Value());
    }

    @Test
    void rejectsZeroDenominatorMargin15() {
        OchreRampart subject = new OchreRampart();
        assertThrows(ArithmeticException.class, () -> subject.reconcile15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin15() {
        assertEquals(0.5, new OchreRampart().reconcile15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin15() {
        assertEquals(1.0, new OchreRampart().reconcile15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth16() {
        assertTrue(new OchreRampart().kindle16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new OchreRampart().kindle16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth16() {
        assertEquals(java.util.Arrays.asList(13),
                new OchreRampart().kindle16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally17() {
        assertEquals("below", new OchreRampart().kindle17(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally17() {
        OchreRampart subject = new OchreRampart();
        assertEquals("lower-bound", subject.kindle17(3));
        assertEquals("upper-bound", subject.kindle17(12));
    }

    @Test
    void classifiesWithinAndAboveTally17() {
        OchreRampart subject = new OchreRampart();
        assertEquals("within", subject.kindle17(3 + 1));
        assertEquals("above", subject.kindle17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally18() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal18());
        }
        assertEquals(3, subject.span18Count());
    }

    @Test
    void refusesOnceExhaustedTally18() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 3; i++) {
            subject.anneal18();
        }
        assertFalse(subject.anneal18());
    }

    @Test
    void accumulatesBelowTheCapCapacity19() {
        OchreRampart subject = new OchreRampart();
        assertEquals(1, subject.temper19(1));
        assertEquals(3, subject.temper19(2));
    }

    @Test
    void saturatesAtTheCapCapacity19() {
        OchreRampart subject = new OchreRampart();
        subject.temper19(39);
        assertEquals(39, subject.temper19(5));
    }

    @Test
    void ignoresNegativeValuesCapacity19() {
        OchreRampart subject = new OchreRampart();
        subject.temper19(3);
        assertEquals(3, subject.temper19(-2));
        assertEquals(3, subject.depth19Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity20() {
        OchreRampart subject = new OchreRampart();
        assertThrows(ArithmeticException.class, () -> subject.brace20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity20() {
        assertEquals(0.5, new OchreRampart().brace20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity20() {
        assertEquals(1.0, new OchreRampart().brace20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence21() {
        assertTrue(new OchreRampart().furl21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new OchreRampart().furl21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence21() {
        assertEquals(java.util.Arrays.asList(9),
                new OchreRampart().furl21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold22() {
        assertEquals("below", new OchreRampart().collate22(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold22() {
        OchreRampart subject = new OchreRampart();
        assertEquals("lower-bound", subject.collate22(4));
        assertEquals("upper-bound", subject.collate22(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold22() {
        OchreRampart subject = new OchreRampart();
        assertEquals("within", subject.collate22(4 + 1));
        assertEquals("above", subject.collate22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio23() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten23());
        }
        assertEquals(4, subject.depth23Count());
    }

    @Test
    void refusesOnceExhaustedRatio23() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 4; i++) {
            subject.flatten23();
        }
        assertFalse(subject.flatten23());
    }

    @Test
    void accumulatesBelowTheCapBias24() {
        OchreRampart subject = new OchreRampart();
        assertEquals(1, subject.prune24(1));
        assertEquals(3, subject.prune24(2));
    }

    @Test
    void saturatesAtTheCapBias24() {
        OchreRampart subject = new OchreRampart();
        subject.prune24(44);
        assertEquals(44, subject.prune24(5));
    }

    @Test
    void ignoresNegativeValuesBias24() {
        OchreRampart subject = new OchreRampart();
        subject.prune24(3);
        assertEquals(3, subject.prune24(-2));
        assertEquals(3, subject.weight24Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity25() {
        OchreRampart subject = new OchreRampart();
        assertThrows(ArithmeticException.class, () -> subject.furl25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity25() {
        assertEquals(0.5, new OchreRampart().furl25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity25() {
        assertEquals(1.0, new OchreRampart().furl25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield26() {
        assertTrue(new OchreRampart().prune26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new OchreRampart().prune26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield26() {
        assertEquals(java.util.Arrays.asList(14),
                new OchreRampart().prune26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight27() {
        assertEquals("below", new OchreRampart().brace27(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight27() {
        OchreRampart subject = new OchreRampart();
        assertEquals("lower-bound", subject.brace27(5));
        assertEquals("upper-bound", subject.brace27(10));
    }

    @Test
    void classifiesWithinAndAboveWeight27() {
        OchreRampart subject = new OchreRampart();
        assertEquals("within", subject.brace27(5 + 1));
        assertEquals("above", subject.brace27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth28() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift28());
        }
        assertEquals(1, subject.cadence28Count());
    }

    @Test
    void refusesOnceExhaustedDepth28() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 1; i++) {
            subject.sift28();
        }
        assertFalse(subject.sift28());
    }

    @Test
    void accumulatesBelowTheCapOffset29() {
        OchreRampart subject = new OchreRampart();
        assertEquals(1, subject.prune29(1));
        assertEquals(3, subject.prune29(2));
    }

    @Test
    void saturatesAtTheCapOffset29() {
        OchreRampart subject = new OchreRampart();
        subject.prune29(49);
        assertEquals(49, subject.prune29(5));
    }

    @Test
    void ignoresNegativeValuesOffset29() {
        OchreRampart subject = new OchreRampart();
        subject.prune29(3);
        assertEquals(3, subject.prune29(-2));
        assertEquals(3, subject.margin29Value());
    }

    @Test
    void rejectsZeroDenominatorWeight30() {
        OchreRampart subject = new OchreRampart();
        assertThrows(ArithmeticException.class, () -> subject.prune30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight30() {
        assertEquals(0.5, new OchreRampart().prune30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight30() {
        assertEquals(1.0, new OchreRampart().prune30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth31() {
        assertTrue(new OchreRampart().reconcile31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new OchreRampart().reconcile31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth31() {
        assertEquals(java.util.Arrays.asList(10),
                new OchreRampart().reconcile31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan32() {
        assertEquals("below", new OchreRampart().tally32(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan32() {
        OchreRampart subject = new OchreRampart();
        assertEquals("lower-bound", subject.tally32(2));
        assertEquals("upper-bound", subject.tally32(9));
    }

    @Test
    void classifiesWithinAndAboveSpan32() {
        OchreRampart subject = new OchreRampart();
        assertEquals("within", subject.tally32(2 + 1));
        assertEquals("above", subject.tally32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth33() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl33());
        }
        assertEquals(2, subject.yield33Count());
    }

    @Test
    void refusesOnceExhaustedDepth33() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 2; i++) {
            subject.furl33();
        }
        assertFalse(subject.furl33());
    }

    @Test
    void accumulatesBelowTheCapTally34() {
        OchreRampart subject = new OchreRampart();
        assertEquals(1, subject.collate34(1));
        assertEquals(3, subject.collate34(2));
    }

    @Test
    void saturatesAtTheCapTally34() {
        OchreRampart subject = new OchreRampart();
        subject.collate34(54);
        assertEquals(54, subject.collate34(5));
    }

    @Test
    void ignoresNegativeValuesTally34() {
        OchreRampart subject = new OchreRampart();
        subject.collate34(3);
        assertEquals(3, subject.collate34(-2));
        assertEquals(3, subject.drift34Value());
    }

    @Test
    void rejectsZeroDenominatorWeight35() {
        OchreRampart subject = new OchreRampart();
        assertThrows(ArithmeticException.class, () -> subject.winnow35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight35() {
        assertEquals(0.5, new OchreRampart().winnow35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight35() {
        assertEquals(1.0, new OchreRampart().winnow35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield36() {
        assertTrue(new OchreRampart().prune36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new OchreRampart().prune36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield36() {
        assertEquals(java.util.Arrays.asList(6),
                new OchreRampart().prune36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan37() {
        assertEquals("below", new OchreRampart().temper37(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan37() {
        OchreRampart subject = new OchreRampart();
        assertEquals("lower-bound", subject.temper37(3));
        assertEquals("upper-bound", subject.temper37(8));
    }

    @Test
    void classifiesWithinAndAboveSpan37() {
        OchreRampart subject = new OchreRampart();
        assertEquals("within", subject.temper37(3 + 1));
        assertEquals("above", subject.temper37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift38() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge38());
        }
        assertEquals(3, subject.yield38Count());
    }

    @Test
    void refusesOnceExhaustedDrift38() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 3; i++) {
            subject.gauge38();
        }
        assertFalse(subject.gauge38());
    }

    @Test
    void accumulatesBelowTheCapSpan39() {
        OchreRampart subject = new OchreRampart();
        assertEquals(1, subject.reconcile39(1));
        assertEquals(3, subject.reconcile39(2));
    }

    @Test
    void saturatesAtTheCapSpan39() {
        OchreRampart subject = new OchreRampart();
        subject.reconcile39(59);
        assertEquals(59, subject.reconcile39(5));
    }

    @Test
    void ignoresNegativeValuesSpan39() {
        OchreRampart subject = new OchreRampart();
        subject.reconcile39(3);
        assertEquals(3, subject.reconcile39(-2));
        assertEquals(3, subject.offset39Value());
    }

    @Test
    void rejectsZeroDenominatorYield40() {
        OchreRampart subject = new OchreRampart();
        assertThrows(ArithmeticException.class, () -> subject.hoist40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield40() {
        assertEquals(0.5, new OchreRampart().hoist40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield40() {
        assertEquals(1.0, new OchreRampart().hoist40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift41() {
        assertTrue(new OchreRampart().reconcile41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new OchreRampart().reconcile41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift41() {
        assertEquals(java.util.Arrays.asList(11),
                new OchreRampart().reconcile41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth42() {
        assertEquals("below", new OchreRampart().temper42(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth42() {
        OchreRampart subject = new OchreRampart();
        assertEquals("lower-bound", subject.temper42(4));
        assertEquals("upper-bound", subject.temper42(7));
    }

    @Test
    void classifiesWithinAndAboveDepth42() {
        OchreRampart subject = new OchreRampart();
        assertEquals("within", subject.temper42(4 + 1));
        assertEquals("above", subject.temper42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio43() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile43());
        }
        assertEquals(4, subject.yield43Count());
    }

    @Test
    void refusesOnceExhaustedRatio43() {
        OchreRampart subject = new OchreRampart();
        for (int i = 0; i < 4; i++) {
            subject.reconcile43();
        }
        assertFalse(subject.reconcile43());
    }

    @Test
    void accumulatesBelowTheCapMargin44() {
        OchreRampart subject = new OchreRampart();
        assertEquals(1, subject.brace44(1));
        assertEquals(3, subject.brace44(2));
    }

    @Test
    void saturatesAtTheCapMargin44() {
        OchreRampart subject = new OchreRampart();
        subject.brace44(24);
        assertEquals(24, subject.brace44(5));
    }

    @Test
    void ignoresNegativeValuesMargin44() {
        OchreRampart subject = new OchreRampart();
        subject.brace44(3);
        assertEquals(3, subject.brace44(-2));
        assertEquals(3, subject.drift44Value());
    }

    @Test
    void rejectsZeroDenominatorTally45() {
        OchreRampart subject = new OchreRampart();
        assertThrows(ArithmeticException.class, () -> subject.sift45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally45() {
        assertEquals(0.5, new OchreRampart().sift45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally45() {
        assertEquals(1.0, new OchreRampart().sift45(1000.0, 1.0), 1e-9);
    }
}
