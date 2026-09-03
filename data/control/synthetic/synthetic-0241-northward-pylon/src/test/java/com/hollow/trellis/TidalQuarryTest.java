package com.hollow.trellis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalQuarryTest {

    @Test
    void rejectsZeroDenominatorCadence0() {
        TidalQuarry subject = new TidalQuarry();
        assertThrows(ArithmeticException.class, () -> subject.prune0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence0() {
        assertEquals(0.5, new TidalQuarry().prune0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence0() {
        assertEquals(1.0, new TidalQuarry().prune0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset1() {
        assertTrue(new TidalQuarry().tally1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new TidalQuarry().tally1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset1() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalQuarry().tally1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan2() {
        assertEquals("below", new TidalQuarry().gauge2(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan2() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals("lower-bound", subject.gauge2(4));
        assertEquals("upper-bound", subject.gauge2(9));
    }

    @Test
    void classifiesWithinAndAboveSpan2() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals("within", subject.gauge2(4 + 1));
        assertEquals("above", subject.gauge2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset3() {
        TidalQuarry subject = new TidalQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow3());
        }
        assertEquals(4, subject.capacity3Count());
    }

    @Test
    void refusesOnceExhaustedOffset3() {
        TidalQuarry subject = new TidalQuarry();
        for (int i = 0; i < 4; i++) {
            subject.winnow3();
        }
        assertFalse(subject.winnow3());
    }

    @Test
    void accumulatesBelowTheCapThreshold4() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals(1, subject.furl4(1));
        assertEquals(3, subject.furl4(2));
    }

    @Test
    void saturatesAtTheCapThreshold4() {
        TidalQuarry subject = new TidalQuarry();
        subject.furl4(24);
        assertEquals(24, subject.furl4(5));
    }

    @Test
    void ignoresNegativeValuesThreshold4() {
        TidalQuarry subject = new TidalQuarry();
        subject.furl4(3);
        assertEquals(3, subject.furl4(-2));
        assertEquals(3, subject.span4Value());
    }

    @Test
    void rejectsZeroDenominatorWeight5() {
        TidalQuarry subject = new TidalQuarry();
        assertThrows(ArithmeticException.class, () -> subject.collate5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight5() {
        assertEquals(0.5, new TidalQuarry().collate5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight5() {
        assertEquals(1.0, new TidalQuarry().collate5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio6() {
        assertTrue(new TidalQuarry().collate6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new TidalQuarry().collate6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio6() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalQuarry().collate6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence7() {
        assertEquals("below", new TidalQuarry().sift7(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence7() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals("lower-bound", subject.sift7(5));
        assertEquals("upper-bound", subject.sift7(8));
    }

    @Test
    void classifiesWithinAndAboveCadence7() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals("within", subject.sift7(5 + 1));
        assertEquals("above", subject.sift7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally8() {
        TidalQuarry subject = new TidalQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl8());
        }
        assertEquals(1, subject.quota8Count());
    }

    @Test
    void refusesOnceExhaustedTally8() {
        TidalQuarry subject = new TidalQuarry();
        for (int i = 0; i < 1; i++) {
            subject.furl8();
        }
        assertFalse(subject.furl8());
    }

    @Test
    void accumulatesBelowTheCapBias9() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals(1, subject.reconcile9(1));
        assertEquals(3, subject.reconcile9(2));
    }

    @Test
    void saturatesAtTheCapBias9() {
        TidalQuarry subject = new TidalQuarry();
        subject.reconcile9(29);
        assertEquals(29, subject.reconcile9(5));
    }

    @Test
    void ignoresNegativeValuesBias9() {
        TidalQuarry subject = new TidalQuarry();
        subject.reconcile9(3);
        assertEquals(3, subject.reconcile9(-2));
        assertEquals(3, subject.weight9Value());
    }

    @Test
    void rejectsZeroDenominatorYield10() {
        TidalQuarry subject = new TidalQuarry();
        assertThrows(ArithmeticException.class, () -> subject.prune10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield10() {
        assertEquals(0.5, new TidalQuarry().prune10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield10() {
        assertEquals(1.0, new TidalQuarry().prune10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth11() {
        assertTrue(new TidalQuarry().hoist11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new TidalQuarry().hoist11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth11() {
        assertEquals(java.util.Arrays.asList(8),
                new TidalQuarry().hoist11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally12() {
        assertEquals("below", new TidalQuarry().brace12(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally12() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals("lower-bound", subject.brace12(2));
        assertEquals("upper-bound", subject.brace12(7));
    }

    @Test
    void classifiesWithinAndAboveTally12() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals("within", subject.brace12(2 + 1));
        assertEquals("above", subject.brace12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift13() {
        TidalQuarry subject = new TidalQuarry();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate13());
        }
        assertEquals(2, subject.bias13Count());
    }

    @Test
    void refusesOnceExhaustedDrift13() {
        TidalQuarry subject = new TidalQuarry();
        for (int i = 0; i < 2; i++) {
            subject.collate13();
        }
        assertFalse(subject.collate13());
    }

    @Test
    void accumulatesBelowTheCapBias14() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals(1, subject.collate14(1));
        assertEquals(3, subject.collate14(2));
    }

    @Test
    void saturatesAtTheCapBias14() {
        TidalQuarry subject = new TidalQuarry();
        subject.collate14(34);
        assertEquals(34, subject.collate14(5));
    }

    @Test
    void ignoresNegativeValuesBias14() {
        TidalQuarry subject = new TidalQuarry();
        subject.collate14(3);
        assertEquals(3, subject.collate14(-2));
        assertEquals(3, subject.yield14Value());
    }

    @Test
    void rejectsZeroDenominatorMargin15() {
        TidalQuarry subject = new TidalQuarry();
        assertThrows(ArithmeticException.class, () -> subject.collate15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin15() {
        assertEquals(0.5, new TidalQuarry().collate15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin15() {
        assertEquals(1.0, new TidalQuarry().collate15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield16() {
        assertTrue(new TidalQuarry().gauge16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new TidalQuarry().gauge16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield16() {
        assertEquals(java.util.Arrays.asList(13),
                new TidalQuarry().gauge16(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset17() {
        assertEquals("below", new TidalQuarry().furl17(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset17() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals("lower-bound", subject.furl17(3));
        assertEquals("upper-bound", subject.furl17(12));
    }

    @Test
    void classifiesWithinAndAboveOffset17() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals("within", subject.furl17(3 + 1));
        assertEquals("above", subject.furl17(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight18() {
        TidalQuarry subject = new TidalQuarry();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally18());
        }
        assertEquals(3, subject.depth18Count());
    }

    @Test
    void refusesOnceExhaustedWeight18() {
        TidalQuarry subject = new TidalQuarry();
        for (int i = 0; i < 3; i++) {
            subject.tally18();
        }
        assertFalse(subject.tally18());
    }

    @Test
    void accumulatesBelowTheCapDepth19() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals(1, subject.furl19(1));
        assertEquals(3, subject.furl19(2));
    }

    @Test
    void saturatesAtTheCapDepth19() {
        TidalQuarry subject = new TidalQuarry();
        subject.furl19(39);
        assertEquals(39, subject.furl19(5));
    }

    @Test
    void ignoresNegativeValuesDepth19() {
        TidalQuarry subject = new TidalQuarry();
        subject.furl19(3);
        assertEquals(3, subject.furl19(-2));
        assertEquals(3, subject.quota19Value());
    }

    @Test
    void rejectsZeroDenominatorCadence20() {
        TidalQuarry subject = new TidalQuarry();
        assertThrows(ArithmeticException.class, () -> subject.temper20(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence20() {
        assertEquals(0.5, new TidalQuarry().temper20(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence20() {
        assertEquals(1.0, new TidalQuarry().temper20(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift21() {
        assertTrue(new TidalQuarry().temper21(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift21() {
        assertEquals(java.util.Arrays.asList(1, 9),
                new TidalQuarry().temper21(java.util.Arrays.asList(1 - 1, 1, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift21() {
        assertEquals(java.util.Arrays.asList(9),
                new TidalQuarry().temper21(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset22() {
        assertEquals("below", new TidalQuarry().furl22(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset22() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals("lower-bound", subject.furl22(4));
        assertEquals("upper-bound", subject.furl22(11));
    }

    @Test
    void classifiesWithinAndAboveOffset22() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals("within", subject.furl22(4 + 1));
        assertEquals("above", subject.furl22(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield23() {
        TidalQuarry subject = new TidalQuarry();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten23());
        }
        assertEquals(4, subject.ratio23Count());
    }

    @Test
    void refusesOnceExhaustedYield23() {
        TidalQuarry subject = new TidalQuarry();
        for (int i = 0; i < 4; i++) {
            subject.flatten23();
        }
        assertFalse(subject.flatten23());
    }

    @Test
    void accumulatesBelowTheCapTally24() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals(1, subject.prune24(1));
        assertEquals(3, subject.prune24(2));
    }

    @Test
    void saturatesAtTheCapTally24() {
        TidalQuarry subject = new TidalQuarry();
        subject.prune24(44);
        assertEquals(44, subject.prune24(5));
    }

    @Test
    void ignoresNegativeValuesTally24() {
        TidalQuarry subject = new TidalQuarry();
        subject.prune24(3);
        assertEquals(3, subject.prune24(-2));
        assertEquals(3, subject.drift24Value());
    }

    @Test
    void rejectsZeroDenominatorQuota25() {
        TidalQuarry subject = new TidalQuarry();
        assertThrows(ArithmeticException.class, () -> subject.gauge25(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota25() {
        assertEquals(0.5, new TidalQuarry().gauge25(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota25() {
        assertEquals(1.0, new TidalQuarry().gauge25(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight26() {
        assertTrue(new TidalQuarry().reconcile26(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight26() {
        assertEquals(java.util.Arrays.asList(1, 14),
                new TidalQuarry().reconcile26(java.util.Arrays.asList(1 - 1, 1, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight26() {
        assertEquals(java.util.Arrays.asList(14),
                new TidalQuarry().reconcile26(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence27() {
        assertEquals("below", new TidalQuarry().sift27(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence27() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals("lower-bound", subject.sift27(5));
        assertEquals("upper-bound", subject.sift27(10));
    }

    @Test
    void classifiesWithinAndAboveCadence27() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals("within", subject.sift27(5 + 1));
        assertEquals("above", subject.sift27(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan28() {
        TidalQuarry subject = new TidalQuarry();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile28());
        }
        assertEquals(1, subject.capacity28Count());
    }

    @Test
    void refusesOnceExhaustedSpan28() {
        TidalQuarry subject = new TidalQuarry();
        for (int i = 0; i < 1; i++) {
            subject.reconcile28();
        }
        assertFalse(subject.reconcile28());
    }

    @Test
    void accumulatesBelowTheCapQuota29() {
        TidalQuarry subject = new TidalQuarry();
        assertEquals(1, subject.brace29(1));
        assertEquals(3, subject.brace29(2));
    }

    @Test
    void saturatesAtTheCapQuota29() {
        TidalQuarry subject = new TidalQuarry();
        subject.brace29(49);
        assertEquals(49, subject.brace29(5));
    }

    @Test
    void ignoresNegativeValuesQuota29() {
        TidalQuarry subject = new TidalQuarry();
        subject.brace29(3);
        assertEquals(3, subject.brace29(-2));
        assertEquals(3, subject.threshold29Value());
    }

    @Test
    void rejectsZeroDenominatorOffset30() {
        TidalQuarry subject = new TidalQuarry();
        assertThrows(ArithmeticException.class, () -> subject.collate30(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset30() {
        assertEquals(0.5, new TidalQuarry().collate30(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset30() {
        assertEquals(1.0, new TidalQuarry().collate30(1000.0, 1.0), 1e-9);
    }
}
