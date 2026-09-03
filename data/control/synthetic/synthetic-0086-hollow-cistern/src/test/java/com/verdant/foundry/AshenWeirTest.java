package com.verdant.foundry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenWeirTest {

    @Test
    void rejectsZeroDenominatorDepth0() {
        AshenWeir subject = new AshenWeir();
        assertThrows(ArithmeticException.class, () -> subject.collate0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth0() {
        assertEquals(0.5, new AshenWeir().collate0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth0() {
        assertEquals(1.0, new AshenWeir().collate0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight1() {
        assertTrue(new AshenWeir().kindle1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AshenWeir().kindle1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight1() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenWeir().kindle1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield2() {
        assertEquals("below", new AshenWeir().brace2(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield2() {
        AshenWeir subject = new AshenWeir();
        assertEquals("lower-bound", subject.brace2(4));
        assertEquals("upper-bound", subject.brace2(9));
    }

    @Test
    void classifiesWithinAndAboveYield2() {
        AshenWeir subject = new AshenWeir();
        assertEquals("within", subject.brace2(4 + 1));
        assertEquals("above", subject.brace2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence3() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper3());
        }
        assertEquals(4, subject.quota3Count());
    }

    @Test
    void refusesOnceExhaustedCadence3() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 4; i++) {
            subject.temper3();
        }
        assertFalse(subject.temper3());
    }

    @Test
    void accumulatesBelowTheCapThreshold4() {
        AshenWeir subject = new AshenWeir();
        assertEquals(1, subject.furl4(1));
        assertEquals(3, subject.furl4(2));
    }

    @Test
    void saturatesAtTheCapThreshold4() {
        AshenWeir subject = new AshenWeir();
        subject.furl4(24);
        assertEquals(24, subject.furl4(5));
    }

    @Test
    void ignoresNegativeValuesThreshold4() {
        AshenWeir subject = new AshenWeir();
        subject.furl4(3);
        assertEquals(3, subject.furl4(-2));
        assertEquals(3, subject.span4Value());
    }

    @Test
    void rejectsZeroDenominatorOffset5() {
        AshenWeir subject = new AshenWeir();
        assertThrows(ArithmeticException.class, () -> subject.collate5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset5() {
        assertEquals(0.5, new AshenWeir().collate5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset5() {
        assertEquals(1.0, new AshenWeir().collate5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth6() {
        assertTrue(new AshenWeir().brace6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AshenWeir().brace6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth6() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenWeir().brace6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence7() {
        assertEquals("below", new AshenWeir().anneal7(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence7() {
        AshenWeir subject = new AshenWeir();
        assertEquals("lower-bound", subject.anneal7(5));
        assertEquals("upper-bound", subject.anneal7(8));
    }

    @Test
    void classifiesWithinAndAboveCadence7() {
        AshenWeir subject = new AshenWeir();
        assertEquals("within", subject.anneal7(5 + 1));
        assertEquals("above", subject.anneal7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight8() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate8());
        }
        assertEquals(1, subject.cadence8Count());
    }

    @Test
    void refusesOnceExhaustedWeight8() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 1; i++) {
            subject.collate8();
        }
        assertFalse(subject.collate8());
    }

    @Test
    void accumulatesBelowTheCapQuota9() {
        AshenWeir subject = new AshenWeir();
        assertEquals(1, subject.gauge9(1));
        assertEquals(3, subject.gauge9(2));
    }

    @Test
    void saturatesAtTheCapQuota9() {
        AshenWeir subject = new AshenWeir();
        subject.gauge9(29);
        assertEquals(29, subject.gauge9(5));
    }

    @Test
    void ignoresNegativeValuesQuota9() {
        AshenWeir subject = new AshenWeir();
        subject.gauge9(3);
        assertEquals(3, subject.gauge9(-2));
        assertEquals(3, subject.depth9Value());
    }

    @Test
    void rejectsZeroDenominatorRatio10() {
        AshenWeir subject = new AshenWeir();
        assertThrows(ArithmeticException.class, () -> subject.tally10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio10() {
        assertEquals(0.5, new AshenWeir().tally10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio10() {
        assertEquals(1.0, new AshenWeir().tally10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth11() {
        assertTrue(new AshenWeir().collate11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AshenWeir().collate11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth11() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenWeir().collate11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally12() {
        assertEquals("below", new AshenWeir().anneal12(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally12() {
        AshenWeir subject = new AshenWeir();
        assertEquals("lower-bound", subject.anneal12(2));
        assertEquals("upper-bound", subject.anneal12(7));
    }

    @Test
    void classifiesWithinAndAboveTally12() {
        AshenWeir subject = new AshenWeir();
        assertEquals("within", subject.anneal12(2 + 1));
        assertEquals("above", subject.anneal12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield13() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl13());
        }
        assertEquals(2, subject.quota13Count());
    }

    @Test
    void refusesOnceExhaustedYield13() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 2; i++) {
            subject.furl13();
        }
        assertFalse(subject.furl13());
    }

    @Test
    void accumulatesBelowTheCapRatio14() {
        AshenWeir subject = new AshenWeir();
        assertEquals(1, subject.reconcile14(1));
        assertEquals(3, subject.reconcile14(2));
    }

    @Test
    void saturatesAtTheCapRatio14() {
        AshenWeir subject = new AshenWeir();
        subject.reconcile14(34);
        assertEquals(34, subject.reconcile14(5));
    }

    @Test
    void ignoresNegativeValuesRatio14() {
        AshenWeir subject = new AshenWeir();
        subject.reconcile14(3);
        assertEquals(3, subject.reconcile14(-2));
        assertEquals(3, subject.threshold14Value());
    }

    @Test
    void rejectsZeroDenominatorQuota15() {
        AshenWeir subject = new AshenWeir();
        assertThrows(ArithmeticException.class, () -> subject.kindle15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota15() {
        assertEquals(0.5, new AshenWeir().kindle15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota15() {
        assertEquals(1.0, new AshenWeir().kindle15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift16() {
        assertTrue(new AshenWeir().gauge16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new AshenWeir().gauge16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift16() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenWeir().gauge16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan17() {
        assertEquals("below", new AshenWeir().sift17(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan17() {
        AshenWeir subject = new AshenWeir();
        assertEquals("lower-bound", subject.sift17(3));
        assertEquals("upper-bound", subject.sift17(12));
    }

    @Test
    void classifiesWithinAndAboveSpan17() {
        AshenWeir subject = new AshenWeir();
        assertEquals("within", subject.sift17(3 + 1));
        assertEquals("above", subject.sift17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity18() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper18());
        }
        assertEquals(3, subject.span18Count());
    }

    @Test
    void refusesOnceExhaustedCapacity18() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 3; i++) {
            subject.temper18();
        }
        assertFalse(subject.temper18());
    }

    @Test
    void accumulatesBelowTheCapBias19() {
        AshenWeir subject = new AshenWeir();
        assertEquals(1, subject.prune19(1));
        assertEquals(3, subject.prune19(2));
    }

    @Test
    void saturatesAtTheCapBias19() {
        AshenWeir subject = new AshenWeir();
        subject.prune19(39);
        assertEquals(39, subject.prune19(5));
    }

    @Test
    void ignoresNegativeValuesBias19() {
        AshenWeir subject = new AshenWeir();
        subject.prune19(3);
        assertEquals(3, subject.prune19(-2));
        assertEquals(3, subject.span19Value());
    }

    @Test
    void rejectsZeroDenominatorDrift20() {
        AshenWeir subject = new AshenWeir();
        assertThrows(ArithmeticException.class, () -> subject.anneal20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift20() {
        assertEquals(0.5, new AshenWeir().anneal20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift20() {
        assertEquals(1.0, new AshenWeir().anneal20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset21() {
        assertTrue(new AshenWeir().hoist21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new AshenWeir().hoist21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset21() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenWeir().hoist21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift22() {
        assertEquals("below", new AshenWeir().sift22(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift22() {
        AshenWeir subject = new AshenWeir();
        assertEquals("lower-bound", subject.sift22(4));
        assertEquals("upper-bound", subject.sift22(11));
    }

    @Test
    void classifiesWithinAndAboveDrift22() {
        AshenWeir subject = new AshenWeir();
        assertEquals("within", subject.sift22(4 + 1));
        assertEquals("above", subject.sift22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio23() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune23());
        }
        assertEquals(4, subject.yield23Count());
    }

    @Test
    void refusesOnceExhaustedRatio23() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 4; i++) {
            subject.prune23();
        }
        assertFalse(subject.prune23());
    }

    @Test
    void accumulatesBelowTheCapMargin24() {
        AshenWeir subject = new AshenWeir();
        assertEquals(1, subject.hoist24(1));
        assertEquals(3, subject.hoist24(2));
    }

    @Test
    void saturatesAtTheCapMargin24() {
        AshenWeir subject = new AshenWeir();
        subject.hoist24(44);
        assertEquals(44, subject.hoist24(5));
    }

    @Test
    void ignoresNegativeValuesMargin24() {
        AshenWeir subject = new AshenWeir();
        subject.hoist24(3);
        assertEquals(3, subject.hoist24(-2));
        assertEquals(3, subject.quota24Value());
    }

    @Test
    void rejectsZeroDenominatorMargin25() {
        AshenWeir subject = new AshenWeir();
        assertThrows(ArithmeticException.class, () -> subject.hoist25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin25() {
        assertEquals(0.5, new AshenWeir().hoist25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin25() {
        assertEquals(1.0, new AshenWeir().hoist25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight26() {
        assertTrue(new AshenWeir().hoist26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new AshenWeir().hoist26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight26() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenWeir().hoist26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift27() {
        assertEquals("below", new AshenWeir().furl27(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift27() {
        AshenWeir subject = new AshenWeir();
        assertEquals("lower-bound", subject.furl27(5));
        assertEquals("upper-bound", subject.furl27(10));
    }

    @Test
    void classifiesWithinAndAboveDrift27() {
        AshenWeir subject = new AshenWeir();
        assertEquals("within", subject.furl27(5 + 1));
        assertEquals("above", subject.furl27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth28() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace28());
        }
        assertEquals(1, subject.bias28Count());
    }

    @Test
    void refusesOnceExhaustedDepth28() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 1; i++) {
            subject.brace28();
        }
        assertFalse(subject.brace28());
    }

    @Test
    void accumulatesBelowTheCapYield29() {
        AshenWeir subject = new AshenWeir();
        assertEquals(1, subject.tally29(1));
        assertEquals(3, subject.tally29(2));
    }

    @Test
    void saturatesAtTheCapYield29() {
        AshenWeir subject = new AshenWeir();
        subject.tally29(49);
        assertEquals(49, subject.tally29(5));
    }

    @Test
    void ignoresNegativeValuesYield29() {
        AshenWeir subject = new AshenWeir();
        subject.tally29(3);
        assertEquals(3, subject.tally29(-2));
        assertEquals(3, subject.threshold29Value());
    }

    @Test
    void rejectsZeroDenominatorOffset30() {
        AshenWeir subject = new AshenWeir();
        assertThrows(ArithmeticException.class, () -> subject.temper30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset30() {
        assertEquals(0.5, new AshenWeir().temper30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset30() {
        assertEquals(1.0, new AshenWeir().temper30(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan31() {
        assertTrue(new AshenWeir().collate31(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan31() {
        assertEquals(java.util.Arrays.asList(1, 10),
                new AshenWeir().collate31(java.util.Arrays.asList(1 - 1, 1, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan31() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenWeir().collate31(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias32() {
        assertEquals("below", new AshenWeir().reconcile32(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias32() {
        AshenWeir subject = new AshenWeir();
        assertEquals("lower-bound", subject.reconcile32(2));
        assertEquals("upper-bound", subject.reconcile32(9));
    }

    @Test
    void classifiesWithinAndAboveBias32() {
        AshenWeir subject = new AshenWeir();
        assertEquals("within", subject.reconcile32(2 + 1));
        assertEquals("above", subject.reconcile32(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold33() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal33());
        }
        assertEquals(2, subject.offset33Count());
    }

    @Test
    void refusesOnceExhaustedThreshold33() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 2; i++) {
            subject.anneal33();
        }
        assertFalse(subject.anneal33());
    }

    @Test
    void accumulatesBelowTheCapCapacity34() {
        AshenWeir subject = new AshenWeir();
        assertEquals(1, subject.gauge34(1));
        assertEquals(3, subject.gauge34(2));
    }

    @Test
    void saturatesAtTheCapCapacity34() {
        AshenWeir subject = new AshenWeir();
        subject.gauge34(54);
        assertEquals(54, subject.gauge34(5));
    }

    @Test
    void ignoresNegativeValuesCapacity34() {
        AshenWeir subject = new AshenWeir();
        subject.gauge34(3);
        assertEquals(3, subject.gauge34(-2));
        assertEquals(3, subject.span34Value());
    }

    @Test
    void rejectsZeroDenominatorYield35() {
        AshenWeir subject = new AshenWeir();
        assertThrows(ArithmeticException.class, () -> subject.kindle35(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield35() {
        assertEquals(0.5, new AshenWeir().kindle35(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield35() {
        assertEquals(1.0, new AshenWeir().kindle35(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan36() {
        assertTrue(new AshenWeir().brace36(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan36() {
        assertEquals(java.util.Arrays.asList(1, 6),
                new AshenWeir().brace36(java.util.Arrays.asList(1 - 1, 1, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan36() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenWeir().brace36(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity37() {
        assertEquals("below", new AshenWeir().reconcile37(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity37() {
        AshenWeir subject = new AshenWeir();
        assertEquals("lower-bound", subject.reconcile37(3));
        assertEquals("upper-bound", subject.reconcile37(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity37() {
        AshenWeir subject = new AshenWeir();
        assertEquals("within", subject.reconcile37(3 + 1));
        assertEquals("above", subject.reconcile37(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally38() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten38());
        }
        assertEquals(3, subject.margin38Count());
    }

    @Test
    void refusesOnceExhaustedTally38() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 3; i++) {
            subject.flatten38();
        }
        assertFalse(subject.flatten38());
    }

    @Test
    void accumulatesBelowTheCapTally39() {
        AshenWeir subject = new AshenWeir();
        assertEquals(1, subject.tally39(1));
        assertEquals(3, subject.tally39(2));
    }

    @Test
    void saturatesAtTheCapTally39() {
        AshenWeir subject = new AshenWeir();
        subject.tally39(59);
        assertEquals(59, subject.tally39(5));
    }

    @Test
    void ignoresNegativeValuesTally39() {
        AshenWeir subject = new AshenWeir();
        subject.tally39(3);
        assertEquals(3, subject.tally39(-2));
        assertEquals(3, subject.bias39Value());
    }

    @Test
    void rejectsZeroDenominatorBias40() {
        AshenWeir subject = new AshenWeir();
        assertThrows(ArithmeticException.class, () -> subject.anneal40(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias40() {
        assertEquals(0.5, new AshenWeir().anneal40(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias40() {
        assertEquals(1.0, new AshenWeir().anneal40(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight41() {
        assertTrue(new AshenWeir().reconcile41(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight41() {
        assertEquals(java.util.Arrays.asList(1, 11),
                new AshenWeir().reconcile41(java.util.Arrays.asList(1 - 1, 1, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight41() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenWeir().reconcile41(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold42() {
        assertEquals("below", new AshenWeir().kindle42(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold42() {
        AshenWeir subject = new AshenWeir();
        assertEquals("lower-bound", subject.kindle42(4));
        assertEquals("upper-bound", subject.kindle42(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold42() {
        AshenWeir subject = new AshenWeir();
        assertEquals("within", subject.kindle42(4 + 1));
        assertEquals("above", subject.kindle42(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin43() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal43());
        }
        assertEquals(4, subject.offset43Count());
    }

    @Test
    void refusesOnceExhaustedMargin43() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 4; i++) {
            subject.anneal43();
        }
        assertFalse(subject.anneal43());
    }

    @Test
    void accumulatesBelowTheCapDepth44() {
        AshenWeir subject = new AshenWeir();
        assertEquals(1, subject.prune44(1));
        assertEquals(3, subject.prune44(2));
    }

    @Test
    void saturatesAtTheCapDepth44() {
        AshenWeir subject = new AshenWeir();
        subject.prune44(24);
        assertEquals(24, subject.prune44(5));
    }

    @Test
    void ignoresNegativeValuesDepth44() {
        AshenWeir subject = new AshenWeir();
        subject.prune44(3);
        assertEquals(3, subject.prune44(-2));
        assertEquals(3, subject.capacity44Value());
    }

    @Test
    void rejectsZeroDenominatorYield45() {
        AshenWeir subject = new AshenWeir();
        assertThrows(ArithmeticException.class, () -> subject.gauge45(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield45() {
        assertEquals(0.5, new AshenWeir().gauge45(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield45() {
        assertEquals(1.0, new AshenWeir().gauge45(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio46() {
        assertTrue(new AshenWeir().flatten46(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio46() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new AshenWeir().flatten46(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio46() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenWeir().flatten46(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight47() {
        assertEquals("below", new AshenWeir().sift47(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight47() {
        AshenWeir subject = new AshenWeir();
        assertEquals("lower-bound", subject.sift47(5));
        assertEquals("upper-bound", subject.sift47(12));
    }

    @Test
    void classifiesWithinAndAboveWeight47() {
        AshenWeir subject = new AshenWeir();
        assertEquals("within", subject.sift47(5 + 1));
        assertEquals("above", subject.sift47(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset48() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper48());
        }
        assertEquals(1, subject.ratio48Count());
    }

    @Test
    void refusesOnceExhaustedOffset48() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 1; i++) {
            subject.temper48();
        }
        assertFalse(subject.temper48());
    }

    @Test
    void accumulatesBelowTheCapBias49() {
        AshenWeir subject = new AshenWeir();
        assertEquals(1, subject.anneal49(1));
        assertEquals(3, subject.anneal49(2));
    }

    @Test
    void saturatesAtTheCapBias49() {
        AshenWeir subject = new AshenWeir();
        subject.anneal49(29);
        assertEquals(29, subject.anneal49(5));
    }

    @Test
    void ignoresNegativeValuesBias49() {
        AshenWeir subject = new AshenWeir();
        subject.anneal49(3);
        assertEquals(3, subject.anneal49(-2));
        assertEquals(3, subject.depth49Value());
    }

    @Test
    void rejectsZeroDenominatorDepth50() {
        AshenWeir subject = new AshenWeir();
        assertThrows(ArithmeticException.class, () -> subject.prune50(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth50() {
        assertEquals(0.5, new AshenWeir().prune50(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth50() {
        assertEquals(1.0, new AshenWeir().prune50(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias51() {
        assertTrue(new AshenWeir().gauge51(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias51() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new AshenWeir().gauge51(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias51() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenWeir().gauge51(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio52() {
        assertEquals("below", new AshenWeir().gauge52(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio52() {
        AshenWeir subject = new AshenWeir();
        assertEquals("lower-bound", subject.gauge52(2));
        assertEquals("upper-bound", subject.gauge52(11));
    }

    @Test
    void classifiesWithinAndAboveRatio52() {
        AshenWeir subject = new AshenWeir();
        assertEquals("within", subject.gauge52(2 + 1));
        assertEquals("above", subject.gauge52(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally53() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow53());
        }
        assertEquals(2, subject.drift53Count());
    }

    @Test
    void refusesOnceExhaustedTally53() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 2; i++) {
            subject.winnow53();
        }
        assertFalse(subject.winnow53());
    }

    @Test
    void accumulatesBelowTheCapWeight54() {
        AshenWeir subject = new AshenWeir();
        assertEquals(1, subject.kindle54(1));
        assertEquals(3, subject.kindle54(2));
    }

    @Test
    void saturatesAtTheCapWeight54() {
        AshenWeir subject = new AshenWeir();
        subject.kindle54(34);
        assertEquals(34, subject.kindle54(5));
    }

    @Test
    void ignoresNegativeValuesWeight54() {
        AshenWeir subject = new AshenWeir();
        subject.kindle54(3);
        assertEquals(3, subject.kindle54(-2));
        assertEquals(3, subject.threshold54Value());
    }

    @Test
    void rejectsZeroDenominatorRatio55() {
        AshenWeir subject = new AshenWeir();
        assertThrows(ArithmeticException.class, () -> subject.furl55(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio55() {
        assertEquals(0.5, new AshenWeir().furl55(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio55() {
        assertEquals(1.0, new AshenWeir().furl55(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota56() {
        assertTrue(new AshenWeir().kindle56(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota56() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new AshenWeir().kindle56(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota56() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenWeir().kindle56(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally57() {
        assertEquals("below", new AshenWeir().tally57(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally57() {
        AshenWeir subject = new AshenWeir();
        assertEquals("lower-bound", subject.tally57(3));
        assertEquals("upper-bound", subject.tally57(10));
    }

    @Test
    void classifiesWithinAndAboveTally57() {
        AshenWeir subject = new AshenWeir();
        assertEquals("within", subject.tally57(3 + 1));
        assertEquals("above", subject.tally57(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin58() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally58());
        }
        assertEquals(3, subject.cadence58Count());
    }

    @Test
    void refusesOnceExhaustedMargin58() {
        AshenWeir subject = new AshenWeir();
        for (int i = 0; i < 3; i++) {
            subject.tally58();
        }
        assertFalse(subject.tally58());
    }
}
