package com.slate.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenKilnTest {

    @Test
    void returnsEmptyForNullCapacity0() {
        assertTrue(new AshenKiln().reconcile0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenKiln().reconcile0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity0() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenKiln().reconcile0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth1() {
        assertEquals("below", new AshenKiln().anneal1(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth1() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.anneal1(3));
        assertEquals("upper-bound", subject.anneal1(8));
    }

    @Test
    void classifiesWithinAndAboveDepth1() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.anneal1(3 + 1));
        assertEquals("above", subject.anneal1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth2() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally2());
        }
        assertEquals(3, subject.offset2Count());
    }

    @Test
    void refusesOnceExhaustedDepth2() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.tally2();
        }
        assertFalse(subject.tally2());
    }

    @Test
    void accumulatesBelowTheCapBias3() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.tally3(1));
        assertEquals(3, subject.tally3(2));
    }

    @Test
    void saturatesAtTheCapBias3() {
        AshenKiln subject = new AshenKiln();
        subject.tally3(23);
        assertEquals(23, subject.tally3(5));
    }

    @Test
    void ignoresNegativeValuesBias3() {
        AshenKiln subject = new AshenKiln();
        subject.tally3(3);
        assertEquals(3, subject.tally3(-2));
        assertEquals(3, subject.margin3Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity4() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.brace4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity4() {
        assertEquals(0.5, new AshenKiln().brace4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity4() {
        assertEquals(5.0, new AshenKiln().brace4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity5() {
        assertTrue(new AshenKiln().sift5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenKiln().sift5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity5() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenKiln().sift5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield6() {
        assertEquals("below", new AshenKiln().brace6(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield6() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.brace6(4));
        assertEquals("upper-bound", subject.brace6(7));
    }

    @Test
    void classifiesWithinAndAboveYield6() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.brace6(4 + 1));
        assertEquals("above", subject.brace6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio7() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle7());
        }
        assertEquals(4, subject.offset7Count());
    }

    @Test
    void refusesOnceExhaustedRatio7() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.kindle7();
        }
        assertFalse(subject.kindle7());
    }

    @Test
    void accumulatesBelowTheCapQuota8() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.collate8(1));
        assertEquals(3, subject.collate8(2));
    }

    @Test
    void saturatesAtTheCapQuota8() {
        AshenKiln subject = new AshenKiln();
        subject.collate8(28);
        assertEquals(28, subject.collate8(5));
    }

    @Test
    void ignoresNegativeValuesQuota8() {
        AshenKiln subject = new AshenKiln();
        subject.collate8(3);
        assertEquals(3, subject.collate8(-2));
        assertEquals(3, subject.weight8Value());
    }

    @Test
    void rejectsZeroDenominatorRatio9() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.collate9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio9() {
        assertEquals(0.5, new AshenKiln().collate9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio9() {
        assertEquals(5.0, new AshenKiln().collate9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight10() {
        assertTrue(new AshenKiln().tally10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenKiln().tally10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight10() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenKiln().tally10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias11() {
        assertEquals("below", new AshenKiln().collate11(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias11() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.collate11(5));
        assertEquals("upper-bound", subject.collate11(12));
    }

    @Test
    void classifiesWithinAndAboveBias11() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.collate11(5 + 1));
        assertEquals("above", subject.collate11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota12() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate12());
        }
        assertEquals(1, subject.span12Count());
    }

    @Test
    void refusesOnceExhaustedQuota12() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.collate12();
        }
        assertFalse(subject.collate12());
    }

    @Test
    void accumulatesBelowTheCapCadence13() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.collate13(1));
        assertEquals(3, subject.collate13(2));
    }

    @Test
    void saturatesAtTheCapCadence13() {
        AshenKiln subject = new AshenKiln();
        subject.collate13(33);
        assertEquals(33, subject.collate13(5));
    }

    @Test
    void ignoresNegativeValuesCadence13() {
        AshenKiln subject = new AshenKiln();
        subject.collate13(3);
        assertEquals(3, subject.collate13(-2));
        assertEquals(3, subject.weight13Value());
    }

    @Test
    void rejectsZeroDenominatorRatio14() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio14() {
        assertEquals(0.5, new AshenKiln().sift14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio14() {
        assertEquals(5.0, new AshenKiln().sift14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield15() {
        assertTrue(new AshenKiln().gauge15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenKiln().gauge15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsYield15() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenKiln().gauge15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield16() {
        assertEquals("below", new AshenKiln().winnow16(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield16() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.winnow16(2));
        assertEquals("upper-bound", subject.winnow16(11));
    }

    @Test
    void classifiesWithinAndAboveYield16() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.winnow16(2 + 1));
        assertEquals("above", subject.winnow16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset17() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper17());
        }
        assertEquals(2, subject.threshold17Count());
    }

    @Test
    void refusesOnceExhaustedOffset17() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.temper17();
        }
        assertFalse(subject.temper17());
    }

    @Test
    void accumulatesBelowTheCapRatio18() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.temper18(1));
        assertEquals(3, subject.temper18(2));
    }

    @Test
    void saturatesAtTheCapRatio18() {
        AshenKiln subject = new AshenKiln();
        subject.temper18(38);
        assertEquals(38, subject.temper18(5));
    }

    @Test
    void ignoresNegativeValuesRatio18() {
        AshenKiln subject = new AshenKiln();
        subject.temper18(3);
        assertEquals(3, subject.temper18(-2));
        assertEquals(3, subject.drift18Value());
    }

    @Test
    void rejectsZeroDenominatorBias19() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias19() {
        assertEquals(0.5, new AshenKiln().gauge19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias19() {
        assertEquals(5.0, new AshenKiln().gauge19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight20() {
        assertTrue(new AshenKiln().collate20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenKiln().collate20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight20() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenKiln().collate20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset21() {
        assertEquals("below", new AshenKiln().furl21(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset21() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.furl21(3));
        assertEquals("upper-bound", subject.furl21(10));
    }

    @Test
    void classifiesWithinAndAboveOffset21() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.furl21(3 + 1));
        assertEquals("above", subject.furl21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan22() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal22());
        }
        assertEquals(3, subject.quota22Count());
    }

    @Test
    void refusesOnceExhaustedSpan22() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.anneal22();
        }
        assertFalse(subject.anneal22());
    }

    @Test
    void accumulatesBelowTheCapCapacity23() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.sift23(1));
        assertEquals(3, subject.sift23(2));
    }

    @Test
    void saturatesAtTheCapCapacity23() {
        AshenKiln subject = new AshenKiln();
        subject.sift23(43);
        assertEquals(43, subject.sift23(5));
    }

    @Test
    void ignoresNegativeValuesCapacity23() {
        AshenKiln subject = new AshenKiln();
        subject.sift23(3);
        assertEquals(3, subject.sift23(-2));
        assertEquals(3, subject.drift23Value());
    }

    @Test
    void rejectsZeroDenominatorYield24() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.furl24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield24() {
        assertEquals(0.5, new AshenKiln().furl24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield24() {
        assertEquals(5.0, new AshenKiln().furl24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset25() {
        assertTrue(new AshenKiln().brace25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenKiln().brace25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset25() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenKiln().brace25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity26() {
        assertEquals("below", new AshenKiln().prune26(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity26() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.prune26(4));
        assertEquals("upper-bound", subject.prune26(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity26() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.prune26(4 + 1));
        assertEquals("above", subject.prune26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset27() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist27());
        }
        assertEquals(4, subject.weight27Count());
    }

    @Test
    void refusesOnceExhaustedOffset27() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.hoist27();
        }
        assertFalse(subject.hoist27());
    }

    @Test
    void accumulatesBelowTheCapDepth28() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.flatten28(1));
        assertEquals(3, subject.flatten28(2));
    }

    @Test
    void saturatesAtTheCapDepth28() {
        AshenKiln subject = new AshenKiln();
        subject.flatten28(48);
        assertEquals(48, subject.flatten28(5));
    }

    @Test
    void ignoresNegativeValuesDepth28() {
        AshenKiln subject = new AshenKiln();
        subject.flatten28(3);
        assertEquals(3, subject.flatten28(-2));
        assertEquals(3, subject.drift28Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold29() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.brace29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold29() {
        assertEquals(0.5, new AshenKiln().brace29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold29() {
        assertEquals(5.0, new AshenKiln().brace29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield30() {
        assertTrue(new AshenKiln().hoist30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenKiln().hoist30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield30() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenKiln().hoist30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally31() {
        assertEquals("below", new AshenKiln().hoist31(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally31() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.hoist31(5));
        assertEquals("upper-bound", subject.hoist31(8));
    }

    @Test
    void classifiesWithinAndAboveTally31() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.hoist31(5 + 1));
        assertEquals("above", subject.hoist31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset32() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl32());
        }
        assertEquals(1, subject.depth32Count());
    }

    @Test
    void refusesOnceExhaustedOffset32() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.furl32();
        }
        assertFalse(subject.furl32());
    }

    @Test
    void accumulatesBelowTheCapWeight33() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.temper33(1));
        assertEquals(3, subject.temper33(2));
    }

    @Test
    void saturatesAtTheCapWeight33() {
        AshenKiln subject = new AshenKiln();
        subject.temper33(53);
        assertEquals(53, subject.temper33(5));
    }

    @Test
    void ignoresNegativeValuesWeight33() {
        AshenKiln subject = new AshenKiln();
        subject.temper33(3);
        assertEquals(3, subject.temper33(-2));
        assertEquals(3, subject.drift33Value());
    }

    @Test
    void rejectsZeroDenominatorBias34() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.brace34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias34() {
        assertEquals(0.5, new AshenKiln().brace34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias34() {
        assertEquals(5.0, new AshenKiln().brace34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally35() {
        assertTrue(new AshenKiln().flatten35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenKiln().flatten35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally35() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenKiln().flatten35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally36() {
        assertEquals("below", new AshenKiln().sift36(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally36() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.sift36(2));
        assertEquals("upper-bound", subject.sift36(7));
    }

    @Test
    void classifiesWithinAndAboveTally36() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.sift36(2 + 1));
        assertEquals("above", subject.sift36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift37() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune37());
        }
        assertEquals(2, subject.offset37Count());
    }

    @Test
    void refusesOnceExhaustedDrift37() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.prune37();
        }
        assertFalse(subject.prune37());
    }

    @Test
    void accumulatesBelowTheCapCapacity38() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.anneal38(1));
        assertEquals(3, subject.anneal38(2));
    }

    @Test
    void saturatesAtTheCapCapacity38() {
        AshenKiln subject = new AshenKiln();
        subject.anneal38(58);
        assertEquals(58, subject.anneal38(5));
    }

    @Test
    void ignoresNegativeValuesCapacity38() {
        AshenKiln subject = new AshenKiln();
        subject.anneal38(3);
        assertEquals(3, subject.anneal38(-2));
        assertEquals(3, subject.margin38Value());
    }

    @Test
    void rejectsZeroDenominatorYield39() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield39() {
        assertEquals(0.5, new AshenKiln().gauge39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield39() {
        assertEquals(5.0, new AshenKiln().gauge39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset40() {
        assertTrue(new AshenKiln().winnow40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenKiln().winnow40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset40() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenKiln().winnow40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth41() {
        assertEquals("below", new AshenKiln().prune41(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth41() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.prune41(3));
        assertEquals("upper-bound", subject.prune41(12));
    }

    @Test
    void classifiesWithinAndAboveDepth41() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.prune41(3 + 1));
        assertEquals("above", subject.prune41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally42() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal42());
        }
        assertEquals(3, subject.margin42Count());
    }

    @Test
    void refusesOnceExhaustedTally42() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.anneal42();
        }
        assertFalse(subject.anneal42());
    }

    @Test
    void accumulatesBelowTheCapThreshold43() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.hoist43(1));
        assertEquals(3, subject.hoist43(2));
    }

    @Test
    void saturatesAtTheCapThreshold43() {
        AshenKiln subject = new AshenKiln();
        subject.hoist43(23);
        assertEquals(23, subject.hoist43(5));
    }

    @Test
    void ignoresNegativeValuesThreshold43() {
        AshenKiln subject = new AshenKiln();
        subject.hoist43(3);
        assertEquals(3, subject.hoist43(-2));
        assertEquals(3, subject.tally43Value());
    }

    @Test
    void rejectsZeroDenominatorQuota44() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota44() {
        assertEquals(0.5, new AshenKiln().prune44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota44() {
        assertEquals(5.0, new AshenKiln().prune44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth45() {
        assertTrue(new AshenKiln().flatten45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenKiln().flatten45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth45() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenKiln().flatten45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset46() {
        assertEquals("below", new AshenKiln().winnow46(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset46() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.winnow46(4));
        assertEquals("upper-bound", subject.winnow46(11));
    }

    @Test
    void classifiesWithinAndAboveOffset46() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.winnow46(4 + 1));
        assertEquals("above", subject.winnow46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift47() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift47());
        }
        assertEquals(4, subject.yield47Count());
    }

    @Test
    void refusesOnceExhaustedDrift47() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.sift47();
        }
        assertFalse(subject.sift47());
    }

    @Test
    void accumulatesBelowTheCapSpan48() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.gauge48(1));
        assertEquals(3, subject.gauge48(2));
    }

    @Test
    void saturatesAtTheCapSpan48() {
        AshenKiln subject = new AshenKiln();
        subject.gauge48(28);
        assertEquals(28, subject.gauge48(5));
    }

    @Test
    void ignoresNegativeValuesSpan48() {
        AshenKiln subject = new AshenKiln();
        subject.gauge48(3);
        assertEquals(3, subject.gauge48(-2));
        assertEquals(3, subject.cadence48Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold49() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.furl49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold49() {
        assertEquals(0.5, new AshenKiln().furl49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold49() {
        assertEquals(5.0, new AshenKiln().furl49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold50() {
        assertTrue(new AshenKiln().collate50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenKiln().collate50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold50() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenKiln().collate50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight51() {
        assertEquals("below", new AshenKiln().prune51(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight51() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.prune51(5));
        assertEquals("upper-bound", subject.prune51(10));
    }

    @Test
    void classifiesWithinAndAboveWeight51() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.prune51(5 + 1));
        assertEquals("above", subject.prune51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity52() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally52());
        }
        assertEquals(1, subject.depth52Count());
    }

    @Test
    void refusesOnceExhaustedCapacity52() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.tally52();
        }
        assertFalse(subject.tally52());
    }

    @Test
    void accumulatesBelowTheCapRatio53() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.anneal53(1));
        assertEquals(3, subject.anneal53(2));
    }

    @Test
    void saturatesAtTheCapRatio53() {
        AshenKiln subject = new AshenKiln();
        subject.anneal53(33);
        assertEquals(33, subject.anneal53(5));
    }

    @Test
    void ignoresNegativeValuesRatio53() {
        AshenKiln subject = new AshenKiln();
        subject.anneal53(3);
        assertEquals(3, subject.anneal53(-2));
        assertEquals(3, subject.bias53Value());
    }

    @Test
    void rejectsZeroDenominatorMargin54() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.brace54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin54() {
        assertEquals(0.5, new AshenKiln().brace54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin54() {
        assertEquals(5.0, new AshenKiln().brace54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin55() {
        assertTrue(new AshenKiln().gauge55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenKiln().gauge55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin55() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenKiln().gauge55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight56() {
        assertEquals("below", new AshenKiln().winnow56(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight56() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.winnow56(2));
        assertEquals("upper-bound", subject.winnow56(9));
    }

    @Test
    void classifiesWithinAndAboveWeight56() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.winnow56(2 + 1));
        assertEquals("above", subject.winnow56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota57() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper57());
        }
        assertEquals(2, subject.margin57Count());
    }

    @Test
    void refusesOnceExhaustedQuota57() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.temper57();
        }
        assertFalse(subject.temper57());
    }

    @Test
    void accumulatesBelowTheCapMargin58() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.collate58(1));
        assertEquals(3, subject.collate58(2));
    }

    @Test
    void saturatesAtTheCapMargin58() {
        AshenKiln subject = new AshenKiln();
        subject.collate58(38);
        assertEquals(38, subject.collate58(5));
    }

    @Test
    void ignoresNegativeValuesMargin58() {
        AshenKiln subject = new AshenKiln();
        subject.collate58(3);
        assertEquals(3, subject.collate58(-2));
        assertEquals(3, subject.drift58Value());
    }

    @Test
    void rejectsZeroDenominatorYield59() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield59() {
        assertEquals(0.5, new AshenKiln().prune59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield59() {
        assertEquals(5.0, new AshenKiln().prune59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift60() {
        assertTrue(new AshenKiln().anneal60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenKiln().anneal60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDrift60() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenKiln().anneal60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio61() {
        assertEquals("below", new AshenKiln().tally61(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio61() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.tally61(3));
        assertEquals("upper-bound", subject.tally61(8));
    }

    @Test
    void classifiesWithinAndAboveRatio61() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.tally61(3 + 1));
        assertEquals("above", subject.tally61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence62() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist62());
        }
        assertEquals(3, subject.tally62Count());
    }

    @Test
    void refusesOnceExhaustedCadence62() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.hoist62();
        }
        assertFalse(subject.hoist62());
    }

    @Test
    void accumulatesBelowTheCapRatio63() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.reconcile63(1));
        assertEquals(3, subject.reconcile63(2));
    }

    @Test
    void saturatesAtTheCapRatio63() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile63(43);
        assertEquals(43, subject.reconcile63(5));
    }

    @Test
    void ignoresNegativeValuesRatio63() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile63(3);
        assertEquals(3, subject.reconcile63(-2));
        assertEquals(3, subject.offset63Value());
    }

    @Test
    void rejectsZeroDenominatorQuota64() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.kindle64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota64() {
        assertEquals(0.5, new AshenKiln().kindle64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota64() {
        assertEquals(5.0, new AshenKiln().kindle64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin65() {
        assertTrue(new AshenKiln().prune65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenKiln().prune65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin65() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenKiln().prune65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota66() {
        assertEquals("below", new AshenKiln().winnow66(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota66() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.winnow66(4));
        assertEquals("upper-bound", subject.winnow66(7));
    }

    @Test
    void classifiesWithinAndAboveQuota66() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.winnow66(4 + 1));
        assertEquals("above", subject.winnow66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift67() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist67());
        }
        assertEquals(4, subject.cadence67Count());
    }

    @Test
    void refusesOnceExhaustedDrift67() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.hoist67();
        }
        assertFalse(subject.hoist67());
    }

    @Test
    void accumulatesBelowTheCapBias68() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.reconcile68(1));
        assertEquals(3, subject.reconcile68(2));
    }

    @Test
    void saturatesAtTheCapBias68() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile68(48);
        assertEquals(48, subject.reconcile68(5));
    }

    @Test
    void ignoresNegativeValuesBias68() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile68(3);
        assertEquals(3, subject.reconcile68(-2));
        assertEquals(3, subject.capacity68Value());
    }

    @Test
    void rejectsZeroDenominatorDepth69() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth69() {
        assertEquals(0.5, new AshenKiln().gauge69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth69() {
        assertEquals(5.0, new AshenKiln().gauge69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias70() {
        assertTrue(new AshenKiln().kindle70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenKiln().kindle70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias70() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenKiln().kindle70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift71() {
        assertEquals("below", new AshenKiln().winnow71(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift71() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.winnow71(5));
        assertEquals("upper-bound", subject.winnow71(12));
    }

    @Test
    void classifiesWithinAndAboveDrift71() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.winnow71(5 + 1));
        assertEquals("above", subject.winnow71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan72() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift72());
        }
        assertEquals(1, subject.ratio72Count());
    }

    @Test
    void refusesOnceExhaustedSpan72() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.sift72();
        }
        assertFalse(subject.sift72());
    }

    @Test
    void accumulatesBelowTheCapBias73() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.tally73(1));
        assertEquals(3, subject.tally73(2));
    }

    @Test
    void saturatesAtTheCapBias73() {
        AshenKiln subject = new AshenKiln();
        subject.tally73(53);
        assertEquals(53, subject.tally73(5));
    }

    @Test
    void ignoresNegativeValuesBias73() {
        AshenKiln subject = new AshenKiln();
        subject.tally73(3);
        assertEquals(3, subject.tally73(-2));
        assertEquals(3, subject.capacity73Value());
    }

    @Test
    void rejectsZeroDenominatorSpan74() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan74() {
        assertEquals(0.5, new AshenKiln().prune74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan74() {
        assertEquals(5.0, new AshenKiln().prune74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold75() {
        assertTrue(new AshenKiln().winnow75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenKiln().winnow75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold75() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenKiln().winnow75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin76() {
        assertEquals("below", new AshenKiln().winnow76(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin76() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.winnow76(2));
        assertEquals("upper-bound", subject.winnow76(11));
    }

    @Test
    void classifiesWithinAndAboveMargin76() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.winnow76(2 + 1));
        assertEquals("above", subject.winnow76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally77() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift77());
        }
        assertEquals(2, subject.cadence77Count());
    }

    @Test
    void refusesOnceExhaustedTally77() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.sift77();
        }
        assertFalse(subject.sift77());
    }

    @Test
    void accumulatesBelowTheCapCapacity78() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.prune78(1));
        assertEquals(3, subject.prune78(2));
    }

    @Test
    void saturatesAtTheCapCapacity78() {
        AshenKiln subject = new AshenKiln();
        subject.prune78(58);
        assertEquals(58, subject.prune78(5));
    }

    @Test
    void ignoresNegativeValuesCapacity78() {
        AshenKiln subject = new AshenKiln();
        subject.prune78(3);
        assertEquals(3, subject.prune78(-2));
        assertEquals(3, subject.drift78Value());
    }

    @Test
    void rejectsZeroDenominatorDrift79() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift79() {
        assertEquals(0.5, new AshenKiln().gauge79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift79() {
        assertEquals(5.0, new AshenKiln().gauge79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin80() {
        assertTrue(new AshenKiln().hoist80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenKiln().hoist80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin80() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenKiln().hoist80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias81() {
        assertEquals("below", new AshenKiln().kindle81(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias81() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.kindle81(3));
        assertEquals("upper-bound", subject.kindle81(10));
    }

    @Test
    void classifiesWithinAndAboveBias81() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.kindle81(3 + 1));
        assertEquals("above", subject.kindle81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio82() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle82());
        }
        assertEquals(3, subject.margin82Count());
    }

    @Test
    void refusesOnceExhaustedRatio82() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.kindle82();
        }
        assertFalse(subject.kindle82());
    }

    @Test
    void accumulatesBelowTheCapOffset83() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.collate83(1));
        assertEquals(3, subject.collate83(2));
    }

    @Test
    void saturatesAtTheCapOffset83() {
        AshenKiln subject = new AshenKiln();
        subject.collate83(23);
        assertEquals(23, subject.collate83(5));
    }

    @Test
    void ignoresNegativeValuesOffset83() {
        AshenKiln subject = new AshenKiln();
        subject.collate83(3);
        assertEquals(3, subject.collate83(-2));
        assertEquals(3, subject.span83Value());
    }

    @Test
    void rejectsZeroDenominatorRatio84() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio84() {
        assertEquals(0.5, new AshenKiln().gauge84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio84() {
        assertEquals(5.0, new AshenKiln().gauge84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan85() {
        assertTrue(new AshenKiln().hoist85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenKiln().hoist85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan85() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenKiln().hoist85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias86() {
        assertEquals("below", new AshenKiln().sift86(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias86() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.sift86(4));
        assertEquals("upper-bound", subject.sift86(9));
    }

    @Test
    void classifiesWithinAndAboveBias86() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.sift86(4 + 1));
        assertEquals("above", subject.sift86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth87() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist87());
        }
        assertEquals(4, subject.cadence87Count());
    }

    @Test
    void refusesOnceExhaustedDepth87() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.hoist87();
        }
        assertFalse(subject.hoist87());
    }

    @Test
    void accumulatesBelowTheCapDrift88() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.reconcile88(1));
        assertEquals(3, subject.reconcile88(2));
    }

    @Test
    void saturatesAtTheCapDrift88() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile88(28);
        assertEquals(28, subject.reconcile88(5));
    }

    @Test
    void ignoresNegativeValuesDrift88() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile88(3);
        assertEquals(3, subject.reconcile88(-2));
        assertEquals(3, subject.depth88Value());
    }

    @Test
    void rejectsZeroDenominatorRatio89() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow89(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio89() {
        assertEquals(0.5, new AshenKiln().winnow89(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio89() {
        assertEquals(5.0, new AshenKiln().winnow89(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity90() {
        assertTrue(new AshenKiln().tally90(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity90() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenKiln().tally90(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity90() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenKiln().tally90(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence91() {
        assertEquals("below", new AshenKiln().kindle91(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence91() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.kindle91(5));
        assertEquals("upper-bound", subject.kindle91(8));
    }

    @Test
    void classifiesWithinAndAboveCadence91() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.kindle91(5 + 1));
        assertEquals("above", subject.kindle91(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift92() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge92());
        }
        assertEquals(1, subject.depth92Count());
    }

    @Test
    void refusesOnceExhaustedDrift92() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.gauge92();
        }
        assertFalse(subject.gauge92());
    }

    @Test
    void accumulatesBelowTheCapWeight93() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.furl93(1));
        assertEquals(3, subject.furl93(2));
    }

    @Test
    void saturatesAtTheCapWeight93() {
        AshenKiln subject = new AshenKiln();
        subject.furl93(33);
        assertEquals(33, subject.furl93(5));
    }

    @Test
    void ignoresNegativeValuesWeight93() {
        AshenKiln subject = new AshenKiln();
        subject.furl93(3);
        assertEquals(3, subject.furl93(-2));
        assertEquals(3, subject.depth93Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity94() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge94(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity94() {
        assertEquals(0.5, new AshenKiln().gauge94(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity94() {
        assertEquals(5.0, new AshenKiln().gauge94(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias95() {
        assertTrue(new AshenKiln().flatten95(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias95() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenKiln().flatten95(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias95() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenKiln().flatten95(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth96() {
        assertEquals("below", new AshenKiln().furl96(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth96() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.furl96(2));
        assertEquals("upper-bound", subject.furl96(7));
    }

    @Test
    void classifiesWithinAndAboveDepth96() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.furl96(2 + 1));
        assertEquals("above", subject.furl96(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset97() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune97());
        }
        assertEquals(2, subject.tally97Count());
    }

    @Test
    void refusesOnceExhaustedOffset97() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.prune97();
        }
        assertFalse(subject.prune97());
    }

    @Test
    void accumulatesBelowTheCapCapacity98() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.prune98(1));
        assertEquals(3, subject.prune98(2));
    }

    @Test
    void saturatesAtTheCapCapacity98() {
        AshenKiln subject = new AshenKiln();
        subject.prune98(38);
        assertEquals(38, subject.prune98(5));
    }

    @Test
    void ignoresNegativeValuesCapacity98() {
        AshenKiln subject = new AshenKiln();
        subject.prune98(3);
        assertEquals(3, subject.prune98(-2));
        assertEquals(3, subject.cadence98Value());
    }

    @Test
    void rejectsZeroDenominatorYield99() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.reconcile99(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield99() {
        assertEquals(0.5, new AshenKiln().reconcile99(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield99() {
        assertEquals(5.0, new AshenKiln().reconcile99(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold100() {
        assertTrue(new AshenKiln().temper100(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold100() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenKiln().temper100(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold100() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenKiln().temper100(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth101() {
        assertEquals("below", new AshenKiln().hoist101(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth101() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.hoist101(3));
        assertEquals("upper-bound", subject.hoist101(12));
    }

    @Test
    void classifiesWithinAndAboveDepth101() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.hoist101(3 + 1));
        assertEquals("above", subject.hoist101(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally102() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge102());
        }
        assertEquals(3, subject.offset102Count());
    }

    @Test
    void refusesOnceExhaustedTally102() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.gauge102();
        }
        assertFalse(subject.gauge102());
    }

    @Test
    void accumulatesBelowTheCapCadence103() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.temper103(1));
        assertEquals(3, subject.temper103(2));
    }

    @Test
    void saturatesAtTheCapCadence103() {
        AshenKiln subject = new AshenKiln();
        subject.temper103(43);
        assertEquals(43, subject.temper103(5));
    }

    @Test
    void ignoresNegativeValuesCadence103() {
        AshenKiln subject = new AshenKiln();
        subject.temper103(3);
        assertEquals(3, subject.temper103(-2));
        assertEquals(3, subject.threshold103Value());
    }

    @Test
    void rejectsZeroDenominatorRatio104() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.flatten104(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio104() {
        assertEquals(0.5, new AshenKiln().flatten104(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio104() {
        assertEquals(5.0, new AshenKiln().flatten104(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin105() {
        assertTrue(new AshenKiln().temper105(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin105() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenKiln().temper105(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin105() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenKiln().temper105(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin106() {
        assertEquals("below", new AshenKiln().brace106(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin106() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.brace106(4));
        assertEquals("upper-bound", subject.brace106(11));
    }

    @Test
    void classifiesWithinAndAboveMargin106() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.brace106(4 + 1));
        assertEquals("above", subject.brace106(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio107() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge107());
        }
        assertEquals(4, subject.drift107Count());
    }

    @Test
    void refusesOnceExhaustedRatio107() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.gauge107();
        }
        assertFalse(subject.gauge107());
    }

    @Test
    void accumulatesBelowTheCapDepth108() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.anneal108(1));
        assertEquals(3, subject.anneal108(2));
    }

    @Test
    void saturatesAtTheCapDepth108() {
        AshenKiln subject = new AshenKiln();
        subject.anneal108(48);
        assertEquals(48, subject.anneal108(5));
    }

    @Test
    void ignoresNegativeValuesDepth108() {
        AshenKiln subject = new AshenKiln();
        subject.anneal108(3);
        assertEquals(3, subject.anneal108(-2));
        assertEquals(3, subject.quota108Value());
    }

    @Test
    void rejectsZeroDenominatorBias109() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge109(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias109() {
        assertEquals(0.5, new AshenKiln().gauge109(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias109() {
        assertEquals(5.0, new AshenKiln().gauge109(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield110() {
        assertTrue(new AshenKiln().winnow110(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield110() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenKiln().winnow110(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield110() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenKiln().winnow110(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias111() {
        assertEquals("below", new AshenKiln().flatten111(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias111() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.flatten111(5));
        assertEquals("upper-bound", subject.flatten111(10));
    }

    @Test
    void classifiesWithinAndAboveBias111() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.flatten111(5 + 1));
        assertEquals("above", subject.flatten111(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio112() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal112());
        }
        assertEquals(1, subject.tally112Count());
    }

    @Test
    void refusesOnceExhaustedRatio112() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.anneal112();
        }
        assertFalse(subject.anneal112());
    }

    @Test
    void accumulatesBelowTheCapYield113() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.sift113(1));
        assertEquals(3, subject.sift113(2));
    }

    @Test
    void saturatesAtTheCapYield113() {
        AshenKiln subject = new AshenKiln();
        subject.sift113(53);
        assertEquals(53, subject.sift113(5));
    }

    @Test
    void ignoresNegativeValuesYield113() {
        AshenKiln subject = new AshenKiln();
        subject.sift113(3);
        assertEquals(3, subject.sift113(-2));
        assertEquals(3, subject.offset113Value());
    }

    @Test
    void rejectsZeroDenominatorTally114() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune114(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally114() {
        assertEquals(0.5, new AshenKiln().prune114(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally114() {
        assertEquals(5.0, new AshenKiln().prune114(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift115() {
        assertTrue(new AshenKiln().winnow115(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift115() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenKiln().winnow115(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift115() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenKiln().winnow115(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset116() {
        assertEquals("below", new AshenKiln().hoist116(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset116() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.hoist116(2));
        assertEquals("upper-bound", subject.hoist116(9));
    }

    @Test
    void classifiesWithinAndAboveOffset116() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.hoist116(2 + 1));
        assertEquals("above", subject.hoist116(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally117() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift117());
        }
        assertEquals(2, subject.capacity117Count());
    }

    @Test
    void refusesOnceExhaustedTally117() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.sift117();
        }
        assertFalse(subject.sift117());
    }

    @Test
    void accumulatesBelowTheCapDepth118() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.reconcile118(1));
        assertEquals(3, subject.reconcile118(2));
    }

    @Test
    void saturatesAtTheCapDepth118() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile118(58);
        assertEquals(58, subject.reconcile118(5));
    }

    @Test
    void ignoresNegativeValuesDepth118() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile118(3);
        assertEquals(3, subject.reconcile118(-2));
        assertEquals(3, subject.quota118Value());
    }

    @Test
    void rejectsZeroDenominatorQuota119() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.kindle119(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota119() {
        assertEquals(0.5, new AshenKiln().kindle119(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota119() {
        assertEquals(5.0, new AshenKiln().kindle119(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio120() {
        assertTrue(new AshenKiln().kindle120(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio120() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenKiln().kindle120(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsRatio120() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenKiln().kindle120(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio121() {
        assertEquals("below", new AshenKiln().kindle121(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio121() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.kindle121(3));
        assertEquals("upper-bound", subject.kindle121(8));
    }

    @Test
    void classifiesWithinAndAboveRatio121() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.kindle121(3 + 1));
        assertEquals("above", subject.kindle121(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight122() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally122());
        }
        assertEquals(3, subject.offset122Count());
    }

    @Test
    void refusesOnceExhaustedWeight122() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.tally122();
        }
        assertFalse(subject.tally122());
    }

    @Test
    void accumulatesBelowTheCapSpan123() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.collate123(1));
        assertEquals(3, subject.collate123(2));
    }

    @Test
    void saturatesAtTheCapSpan123() {
        AshenKiln subject = new AshenKiln();
        subject.collate123(23);
        assertEquals(23, subject.collate123(5));
    }

    @Test
    void ignoresNegativeValuesSpan123() {
        AshenKiln subject = new AshenKiln();
        subject.collate123(3);
        assertEquals(3, subject.collate123(-2));
        assertEquals(3, subject.threshold123Value());
    }

    @Test
    void rejectsZeroDenominatorTally124() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.temper124(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally124() {
        assertEquals(0.5, new AshenKiln().temper124(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally124() {
        assertEquals(5.0, new AshenKiln().temper124(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth125() {
        assertTrue(new AshenKiln().kindle125(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth125() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenKiln().kindle125(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth125() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenKiln().kindle125(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias126() {
        assertEquals("below", new AshenKiln().reconcile126(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias126() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.reconcile126(4));
        assertEquals("upper-bound", subject.reconcile126(7));
    }

    @Test
    void classifiesWithinAndAboveBias126() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.reconcile126(4 + 1));
        assertEquals("above", subject.reconcile126(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset127() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune127());
        }
        assertEquals(4, subject.span127Count());
    }

    @Test
    void refusesOnceExhaustedOffset127() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.prune127();
        }
        assertFalse(subject.prune127());
    }

    @Test
    void accumulatesBelowTheCapOffset128() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.collate128(1));
        assertEquals(3, subject.collate128(2));
    }

    @Test
    void saturatesAtTheCapOffset128() {
        AshenKiln subject = new AshenKiln();
        subject.collate128(28);
        assertEquals(28, subject.collate128(5));
    }

    @Test
    void ignoresNegativeValuesOffset128() {
        AshenKiln subject = new AshenKiln();
        subject.collate128(3);
        assertEquals(3, subject.collate128(-2));
        assertEquals(3, subject.ratio128Value());
    }

    @Test
    void rejectsZeroDenominatorCadence129() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.temper129(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence129() {
        assertEquals(0.5, new AshenKiln().temper129(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence129() {
        assertEquals(5.0, new AshenKiln().temper129(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence130() {
        assertTrue(new AshenKiln().brace130(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence130() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenKiln().brace130(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsCadence130() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenKiln().brace130(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota131() {
        assertEquals("below", new AshenKiln().flatten131(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota131() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.flatten131(5));
        assertEquals("upper-bound", subject.flatten131(12));
    }

    @Test
    void classifiesWithinAndAboveQuota131() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.flatten131(5 + 1));
        assertEquals("above", subject.flatten131(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin132() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace132());
        }
        assertEquals(1, subject.capacity132Count());
    }

    @Test
    void refusesOnceExhaustedMargin132() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.brace132();
        }
        assertFalse(subject.brace132());
    }

    @Test
    void accumulatesBelowTheCapRatio133() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.tally133(1));
        assertEquals(3, subject.tally133(2));
    }

    @Test
    void saturatesAtTheCapRatio133() {
        AshenKiln subject = new AshenKiln();
        subject.tally133(33);
        assertEquals(33, subject.tally133(5));
    }

    @Test
    void ignoresNegativeValuesRatio133() {
        AshenKiln subject = new AshenKiln();
        subject.tally133(3);
        assertEquals(3, subject.tally133(-2));
        assertEquals(3, subject.cadence133Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity134() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist134(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity134() {
        assertEquals(0.5, new AshenKiln().hoist134(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity134() {
        assertEquals(5.0, new AshenKiln().hoist134(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield135() {
        assertTrue(new AshenKiln().collate135(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield135() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenKiln().collate135(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield135() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenKiln().collate135(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio136() {
        assertEquals("below", new AshenKiln().temper136(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio136() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.temper136(2));
        assertEquals("upper-bound", subject.temper136(11));
    }

    @Test
    void classifiesWithinAndAboveRatio136() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.temper136(2 + 1));
        assertEquals("above", subject.temper136(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield137() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace137());
        }
        assertEquals(2, subject.drift137Count());
    }

    @Test
    void refusesOnceExhaustedYield137() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.brace137();
        }
        assertFalse(subject.brace137());
    }

    @Test
    void accumulatesBelowTheCapCapacity138() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.collate138(1));
        assertEquals(3, subject.collate138(2));
    }

    @Test
    void saturatesAtTheCapCapacity138() {
        AshenKiln subject = new AshenKiln();
        subject.collate138(38);
        assertEquals(38, subject.collate138(5));
    }

    @Test
    void ignoresNegativeValuesCapacity138() {
        AshenKiln subject = new AshenKiln();
        subject.collate138(3);
        assertEquals(3, subject.collate138(-2));
        assertEquals(3, subject.ratio138Value());
    }

    @Test
    void rejectsZeroDenominatorBias139() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.brace139(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias139() {
        assertEquals(0.5, new AshenKiln().brace139(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias139() {
        assertEquals(5.0, new AshenKiln().brace139(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield140() {
        assertTrue(new AshenKiln().furl140(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield140() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenKiln().furl140(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsYield140() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenKiln().furl140(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota141() {
        assertEquals("below", new AshenKiln().flatten141(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota141() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.flatten141(3));
        assertEquals("upper-bound", subject.flatten141(10));
    }

    @Test
    void classifiesWithinAndAboveQuota141() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.flatten141(3 + 1));
        assertEquals("above", subject.flatten141(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold142() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile142());
        }
        assertEquals(3, subject.tally142Count());
    }

    @Test
    void refusesOnceExhaustedThreshold142() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.reconcile142();
        }
        assertFalse(subject.reconcile142());
    }

    @Test
    void accumulatesBelowTheCapQuota143() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.kindle143(1));
        assertEquals(3, subject.kindle143(2));
    }

    @Test
    void saturatesAtTheCapQuota143() {
        AshenKiln subject = new AshenKiln();
        subject.kindle143(43);
        assertEquals(43, subject.kindle143(5));
    }

    @Test
    void ignoresNegativeValuesQuota143() {
        AshenKiln subject = new AshenKiln();
        subject.kindle143(3);
        assertEquals(3, subject.kindle143(-2));
        assertEquals(3, subject.offset143Value());
    }

    @Test
    void rejectsZeroDenominatorQuota144() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist144(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota144() {
        assertEquals(0.5, new AshenKiln().hoist144(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota144() {
        assertEquals(5.0, new AshenKiln().hoist144(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold145() {
        assertTrue(new AshenKiln().kindle145(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold145() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenKiln().kindle145(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold145() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenKiln().kindle145(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan146() {
        assertEquals("below", new AshenKiln().hoist146(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan146() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.hoist146(4));
        assertEquals("upper-bound", subject.hoist146(9));
    }

    @Test
    void classifiesWithinAndAboveSpan146() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.hoist146(4 + 1));
        assertEquals("above", subject.hoist146(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin147() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally147());
        }
        assertEquals(4, subject.bias147Count());
    }

    @Test
    void refusesOnceExhaustedMargin147() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.tally147();
        }
        assertFalse(subject.tally147());
    }

    @Test
    void accumulatesBelowTheCapCapacity148() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.gauge148(1));
        assertEquals(3, subject.gauge148(2));
    }

    @Test
    void saturatesAtTheCapCapacity148() {
        AshenKiln subject = new AshenKiln();
        subject.gauge148(48);
        assertEquals(48, subject.gauge148(5));
    }

    @Test
    void ignoresNegativeValuesCapacity148() {
        AshenKiln subject = new AshenKiln();
        subject.gauge148(3);
        assertEquals(3, subject.gauge148(-2));
        assertEquals(3, subject.margin148Value());
    }

    @Test
    void rejectsZeroDenominatorOffset149() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.kindle149(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset149() {
        assertEquals(0.5, new AshenKiln().kindle149(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset149() {
        assertEquals(5.0, new AshenKiln().kindle149(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan150() {
        assertTrue(new AshenKiln().sift150(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan150() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenKiln().sift150(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan150() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenKiln().sift150(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight151() {
        assertEquals("below", new AshenKiln().reconcile151(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight151() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.reconcile151(5));
        assertEquals("upper-bound", subject.reconcile151(8));
    }

    @Test
    void classifiesWithinAndAboveWeight151() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.reconcile151(5 + 1));
        assertEquals("above", subject.reconcile151(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan152() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten152());
        }
        assertEquals(1, subject.drift152Count());
    }

    @Test
    void refusesOnceExhaustedSpan152() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.flatten152();
        }
        assertFalse(subject.flatten152());
    }

    @Test
    void accumulatesBelowTheCapRatio153() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.furl153(1));
        assertEquals(3, subject.furl153(2));
    }

    @Test
    void saturatesAtTheCapRatio153() {
        AshenKiln subject = new AshenKiln();
        subject.furl153(53);
        assertEquals(53, subject.furl153(5));
    }

    @Test
    void ignoresNegativeValuesRatio153() {
        AshenKiln subject = new AshenKiln();
        subject.furl153(3);
        assertEquals(3, subject.furl153(-2));
        assertEquals(3, subject.margin153Value());
    }

    @Test
    void rejectsZeroDenominatorQuota154() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.collate154(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota154() {
        assertEquals(0.5, new AshenKiln().collate154(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota154() {
        assertEquals(5.0, new AshenKiln().collate154(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold155() {
        assertTrue(new AshenKiln().sift155(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold155() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenKiln().sift155(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold155() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenKiln().sift155(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin156() {
        assertEquals("below", new AshenKiln().temper156(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin156() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.temper156(2));
        assertEquals("upper-bound", subject.temper156(7));
    }

    @Test
    void classifiesWithinAndAboveMargin156() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.temper156(2 + 1));
        assertEquals("above", subject.temper156(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin157() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile157());
        }
        assertEquals(2, subject.capacity157Count());
    }

    @Test
    void refusesOnceExhaustedMargin157() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.reconcile157();
        }
        assertFalse(subject.reconcile157());
    }

    @Test
    void accumulatesBelowTheCapMargin158() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.sift158(1));
        assertEquals(3, subject.sift158(2));
    }

    @Test
    void saturatesAtTheCapMargin158() {
        AshenKiln subject = new AshenKiln();
        subject.sift158(58);
        assertEquals(58, subject.sift158(5));
    }

    @Test
    void ignoresNegativeValuesMargin158() {
        AshenKiln subject = new AshenKiln();
        subject.sift158(3);
        assertEquals(3, subject.sift158(-2));
        assertEquals(3, subject.quota158Value());
    }

    @Test
    void rejectsZeroDenominatorQuota159() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow159(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota159() {
        assertEquals(0.5, new AshenKiln().winnow159(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota159() {
        assertEquals(5.0, new AshenKiln().winnow159(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight160() {
        assertTrue(new AshenKiln().collate160(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight160() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenKiln().collate160(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight160() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenKiln().collate160(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold161() {
        assertEquals("below", new AshenKiln().hoist161(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold161() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.hoist161(3));
        assertEquals("upper-bound", subject.hoist161(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold161() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.hoist161(3 + 1));
        assertEquals("above", subject.hoist161(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity162() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl162());
        }
        assertEquals(3, subject.bias162Count());
    }

    @Test
    void refusesOnceExhaustedCapacity162() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.furl162();
        }
        assertFalse(subject.furl162());
    }

    @Test
    void accumulatesBelowTheCapWeight163() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.gauge163(1));
        assertEquals(3, subject.gauge163(2));
    }

    @Test
    void saturatesAtTheCapWeight163() {
        AshenKiln subject = new AshenKiln();
        subject.gauge163(23);
        assertEquals(23, subject.gauge163(5));
    }

    @Test
    void ignoresNegativeValuesWeight163() {
        AshenKiln subject = new AshenKiln();
        subject.gauge163(3);
        assertEquals(3, subject.gauge163(-2));
        assertEquals(3, subject.cadence163Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold164() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow164(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold164() {
        assertEquals(0.5, new AshenKiln().winnow164(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold164() {
        assertEquals(5.0, new AshenKiln().winnow164(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity165() {
        assertTrue(new AshenKiln().kindle165(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity165() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenKiln().kindle165(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity165() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenKiln().kindle165(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin166() {
        assertEquals("below", new AshenKiln().prune166(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin166() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.prune166(4));
        assertEquals("upper-bound", subject.prune166(11));
    }

    @Test
    void classifiesWithinAndAboveMargin166() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.prune166(4 + 1));
        assertEquals("above", subject.prune166(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin167() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten167());
        }
        assertEquals(4, subject.ratio167Count());
    }

    @Test
    void refusesOnceExhaustedMargin167() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.flatten167();
        }
        assertFalse(subject.flatten167());
    }

    @Test
    void accumulatesBelowTheCapTally168() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.tally168(1));
        assertEquals(3, subject.tally168(2));
    }

    @Test
    void saturatesAtTheCapTally168() {
        AshenKiln subject = new AshenKiln();
        subject.tally168(28);
        assertEquals(28, subject.tally168(5));
    }

    @Test
    void ignoresNegativeValuesTally168() {
        AshenKiln subject = new AshenKiln();
        subject.tally168(3);
        assertEquals(3, subject.tally168(-2));
        assertEquals(3, subject.drift168Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold169() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune169(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold169() {
        assertEquals(0.5, new AshenKiln().prune169(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold169() {
        assertEquals(5.0, new AshenKiln().prune169(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift170() {
        assertTrue(new AshenKiln().sift170(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift170() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenKiln().sift170(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift170() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenKiln().sift170(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift171() {
        assertEquals("below", new AshenKiln().tally171(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift171() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.tally171(5));
        assertEquals("upper-bound", subject.tally171(10));
    }

    @Test
    void classifiesWithinAndAboveDrift171() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.tally171(5 + 1));
        assertEquals("above", subject.tally171(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset172() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle172());
        }
        assertEquals(1, subject.quota172Count());
    }

    @Test
    void refusesOnceExhaustedOffset172() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.kindle172();
        }
        assertFalse(subject.kindle172());
    }

    @Test
    void accumulatesBelowTheCapDrift173() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.temper173(1));
        assertEquals(3, subject.temper173(2));
    }

    @Test
    void saturatesAtTheCapDrift173() {
        AshenKiln subject = new AshenKiln();
        subject.temper173(33);
        assertEquals(33, subject.temper173(5));
    }

    @Test
    void ignoresNegativeValuesDrift173() {
        AshenKiln subject = new AshenKiln();
        subject.temper173(3);
        assertEquals(3, subject.temper173(-2));
        assertEquals(3, subject.offset173Value());
    }

    @Test
    void rejectsZeroDenominatorCadence174() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally174(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence174() {
        assertEquals(0.5, new AshenKiln().tally174(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence174() {
        assertEquals(5.0, new AshenKiln().tally174(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield175() {
        assertTrue(new AshenKiln().anneal175(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield175() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenKiln().anneal175(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield175() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenKiln().anneal175(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota176() {
        assertEquals("below", new AshenKiln().hoist176(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota176() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.hoist176(2));
        assertEquals("upper-bound", subject.hoist176(9));
    }

    @Test
    void classifiesWithinAndAboveQuota176() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.hoist176(2 + 1));
        assertEquals("above", subject.hoist176(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset177() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune177());
        }
        assertEquals(2, subject.weight177Count());
    }

    @Test
    void refusesOnceExhaustedOffset177() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.prune177();
        }
        assertFalse(subject.prune177());
    }

    @Test
    void accumulatesBelowTheCapMargin178() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.furl178(1));
        assertEquals(3, subject.furl178(2));
    }

    @Test
    void saturatesAtTheCapMargin178() {
        AshenKiln subject = new AshenKiln();
        subject.furl178(38);
        assertEquals(38, subject.furl178(5));
    }

    @Test
    void ignoresNegativeValuesMargin178() {
        AshenKiln subject = new AshenKiln();
        subject.furl178(3);
        assertEquals(3, subject.furl178(-2));
        assertEquals(3, subject.drift178Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity179() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune179(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity179() {
        assertEquals(0.5, new AshenKiln().prune179(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity179() {
        assertEquals(5.0, new AshenKiln().prune179(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth180() {
        assertTrue(new AshenKiln().reconcile180(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth180() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenKiln().reconcile180(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth180() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenKiln().reconcile180(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan181() {
        assertEquals("below", new AshenKiln().sift181(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan181() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.sift181(3));
        assertEquals("upper-bound", subject.sift181(8));
    }

    @Test
    void classifiesWithinAndAboveSpan181() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.sift181(3 + 1));
        assertEquals("above", subject.sift181(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally182() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle182());
        }
        assertEquals(3, subject.depth182Count());
    }

    @Test
    void refusesOnceExhaustedTally182() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.kindle182();
        }
        assertFalse(subject.kindle182());
    }

    @Test
    void accumulatesBelowTheCapCadence183() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.sift183(1));
        assertEquals(3, subject.sift183(2));
    }

    @Test
    void saturatesAtTheCapCadence183() {
        AshenKiln subject = new AshenKiln();
        subject.sift183(43);
        assertEquals(43, subject.sift183(5));
    }

    @Test
    void ignoresNegativeValuesCadence183() {
        AshenKiln subject = new AshenKiln();
        subject.sift183(3);
        assertEquals(3, subject.sift183(-2));
        assertEquals(3, subject.quota183Value());
    }

    @Test
    void rejectsZeroDenominatorDepth184() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow184(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth184() {
        assertEquals(0.5, new AshenKiln().winnow184(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth184() {
        assertEquals(5.0, new AshenKiln().winnow184(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota185() {
        assertTrue(new AshenKiln().furl185(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota185() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenKiln().furl185(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota185() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenKiln().furl185(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota186() {
        assertEquals("below", new AshenKiln().flatten186(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota186() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.flatten186(4));
        assertEquals("upper-bound", subject.flatten186(7));
    }

    @Test
    void classifiesWithinAndAboveQuota186() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.flatten186(4 + 1));
        assertEquals("above", subject.flatten186(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth187() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace187());
        }
        assertEquals(4, subject.offset187Count());
    }

    @Test
    void refusesOnceExhaustedDepth187() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.brace187();
        }
        assertFalse(subject.brace187());
    }

    @Test
    void accumulatesBelowTheCapRatio188() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.reconcile188(1));
        assertEquals(3, subject.reconcile188(2));
    }

    @Test
    void saturatesAtTheCapRatio188() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile188(48);
        assertEquals(48, subject.reconcile188(5));
    }

    @Test
    void ignoresNegativeValuesRatio188() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile188(3);
        assertEquals(3, subject.reconcile188(-2));
        assertEquals(3, subject.offset188Value());
    }

    @Test
    void rejectsZeroDenominatorSpan189() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.brace189(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan189() {
        assertEquals(0.5, new AshenKiln().brace189(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan189() {
        assertEquals(5.0, new AshenKiln().brace189(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin190() {
        assertTrue(new AshenKiln().prune190(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin190() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenKiln().prune190(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin190() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenKiln().prune190(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin191() {
        assertEquals("below", new AshenKiln().kindle191(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin191() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.kindle191(5));
        assertEquals("upper-bound", subject.kindle191(12));
    }

    @Test
    void classifiesWithinAndAboveMargin191() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.kindle191(5 + 1));
        assertEquals("above", subject.kindle191(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight192() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow192());
        }
        assertEquals(1, subject.offset192Count());
    }

    @Test
    void refusesOnceExhaustedWeight192() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.winnow192();
        }
        assertFalse(subject.winnow192());
    }

    @Test
    void accumulatesBelowTheCapWeight193() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.reconcile193(1));
        assertEquals(3, subject.reconcile193(2));
    }

    @Test
    void saturatesAtTheCapWeight193() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile193(53);
        assertEquals(53, subject.reconcile193(5));
    }

    @Test
    void ignoresNegativeValuesWeight193() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile193(3);
        assertEquals(3, subject.reconcile193(-2));
        assertEquals(3, subject.margin193Value());
    }

    @Test
    void rejectsZeroDenominatorMargin194() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist194(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin194() {
        assertEquals(0.5, new AshenKiln().hoist194(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin194() {
        assertEquals(5.0, new AshenKiln().hoist194(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence195() {
        assertTrue(new AshenKiln().gauge195(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence195() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenKiln().gauge195(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence195() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenKiln().gauge195(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio196() {
        assertEquals("below", new AshenKiln().prune196(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio196() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.prune196(2));
        assertEquals("upper-bound", subject.prune196(11));
    }

    @Test
    void classifiesWithinAndAboveRatio196() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.prune196(2 + 1));
        assertEquals("above", subject.prune196(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias197() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper197());
        }
        assertEquals(2, subject.offset197Count());
    }

    @Test
    void refusesOnceExhaustedBias197() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.temper197();
        }
        assertFalse(subject.temper197());
    }

    @Test
    void accumulatesBelowTheCapBias198() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.hoist198(1));
        assertEquals(3, subject.hoist198(2));
    }

    @Test
    void saturatesAtTheCapBias198() {
        AshenKiln subject = new AshenKiln();
        subject.hoist198(58);
        assertEquals(58, subject.hoist198(5));
    }

    @Test
    void ignoresNegativeValuesBias198() {
        AshenKiln subject = new AshenKiln();
        subject.hoist198(3);
        assertEquals(3, subject.hoist198(-2));
        assertEquals(3, subject.quota198Value());
    }

    @Test
    void rejectsZeroDenominatorWeight199() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.collate199(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight199() {
        assertEquals(0.5, new AshenKiln().collate199(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight199() {
        assertEquals(5.0, new AshenKiln().collate199(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield200() {
        assertTrue(new AshenKiln().anneal200(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield200() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenKiln().anneal200(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield200() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenKiln().anneal200(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence201() {
        assertEquals("below", new AshenKiln().temper201(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence201() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.temper201(3));
        assertEquals("upper-bound", subject.temper201(10));
    }

    @Test
    void classifiesWithinAndAboveCadence201() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.temper201(3 + 1));
        assertEquals("above", subject.temper201(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset202() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.prune202());
        }
        assertEquals(3, subject.depth202Count());
    }

    @Test
    void refusesOnceExhaustedOffset202() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.prune202();
        }
        assertFalse(subject.prune202());
    }

    @Test
    void accumulatesBelowTheCapSpan203() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.prune203(1));
        assertEquals(3, subject.prune203(2));
    }

    @Test
    void saturatesAtTheCapSpan203() {
        AshenKiln subject = new AshenKiln();
        subject.prune203(23);
        assertEquals(23, subject.prune203(5));
    }

    @Test
    void ignoresNegativeValuesSpan203() {
        AshenKiln subject = new AshenKiln();
        subject.prune203(3);
        assertEquals(3, subject.prune203(-2));
        assertEquals(3, subject.threshold203Value());
    }

    @Test
    void rejectsZeroDenominatorMargin204() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift204(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin204() {
        assertEquals(0.5, new AshenKiln().sift204(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin204() {
        assertEquals(5.0, new AshenKiln().sift204(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota205() {
        assertTrue(new AshenKiln().prune205(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota205() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenKiln().prune205(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsQuota205() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenKiln().prune205(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield206() {
        assertEquals("below", new AshenKiln().temper206(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield206() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.temper206(4));
        assertEquals("upper-bound", subject.temper206(9));
    }

    @Test
    void classifiesWithinAndAboveYield206() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.temper206(4 + 1));
        assertEquals("above", subject.temper206(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias207() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper207());
        }
        assertEquals(4, subject.quota207Count());
    }

    @Test
    void refusesOnceExhaustedBias207() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.temper207();
        }
        assertFalse(subject.temper207());
    }

    @Test
    void accumulatesBelowTheCapYield208() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.kindle208(1));
        assertEquals(3, subject.kindle208(2));
    }

    @Test
    void saturatesAtTheCapYield208() {
        AshenKiln subject = new AshenKiln();
        subject.kindle208(28);
        assertEquals(28, subject.kindle208(5));
    }

    @Test
    void ignoresNegativeValuesYield208() {
        AshenKiln subject = new AshenKiln();
        subject.kindle208(3);
        assertEquals(3, subject.kindle208(-2));
        assertEquals(3, subject.weight208Value());
    }

    @Test
    void rejectsZeroDenominatorDepth209() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune209(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth209() {
        assertEquals(0.5, new AshenKiln().prune209(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth209() {
        assertEquals(5.0, new AshenKiln().prune209(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift210() {
        assertTrue(new AshenKiln().flatten210(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift210() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenKiln().flatten210(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift210() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenKiln().flatten210(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence211() {
        assertEquals("below", new AshenKiln().tally211(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence211() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.tally211(5));
        assertEquals("upper-bound", subject.tally211(8));
    }

    @Test
    void classifiesWithinAndAboveCadence211() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.tally211(5 + 1));
        assertEquals("above", subject.tally211(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield212() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal212());
        }
        assertEquals(1, subject.threshold212Count());
    }

    @Test
    void refusesOnceExhaustedYield212() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.anneal212();
        }
        assertFalse(subject.anneal212());
    }

    @Test
    void accumulatesBelowTheCapYield213() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.hoist213(1));
        assertEquals(3, subject.hoist213(2));
    }

    @Test
    void saturatesAtTheCapYield213() {
        AshenKiln subject = new AshenKiln();
        subject.hoist213(33);
        assertEquals(33, subject.hoist213(5));
    }

    @Test
    void ignoresNegativeValuesYield213() {
        AshenKiln subject = new AshenKiln();
        subject.hoist213(3);
        assertEquals(3, subject.hoist213(-2));
        assertEquals(3, subject.threshold213Value());
    }

    @Test
    void rejectsZeroDenominatorDepth214() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.anneal214(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth214() {
        assertEquals(0.5, new AshenKiln().anneal214(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth214() {
        assertEquals(5.0, new AshenKiln().anneal214(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio215() {
        assertTrue(new AshenKiln().anneal215(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio215() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenKiln().anneal215(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio215() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenKiln().anneal215(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin216() {
        assertEquals("below", new AshenKiln().flatten216(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin216() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.flatten216(2));
        assertEquals("upper-bound", subject.flatten216(7));
    }

    @Test
    void classifiesWithinAndAboveMargin216() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.flatten216(2 + 1));
        assertEquals("above", subject.flatten216(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota217() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally217());
        }
        assertEquals(2, subject.ratio217Count());
    }

    @Test
    void refusesOnceExhaustedQuota217() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.tally217();
        }
        assertFalse(subject.tally217());
    }

    @Test
    void accumulatesBelowTheCapCadence218() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.kindle218(1));
        assertEquals(3, subject.kindle218(2));
    }

    @Test
    void saturatesAtTheCapCadence218() {
        AshenKiln subject = new AshenKiln();
        subject.kindle218(38);
        assertEquals(38, subject.kindle218(5));
    }

    @Test
    void ignoresNegativeValuesCadence218() {
        AshenKiln subject = new AshenKiln();
        subject.kindle218(3);
        assertEquals(3, subject.kindle218(-2));
        assertEquals(3, subject.yield218Value());
    }

    @Test
    void rejectsZeroDenominatorQuota219() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.reconcile219(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota219() {
        assertEquals(0.5, new AshenKiln().reconcile219(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota219() {
        assertEquals(5.0, new AshenKiln().reconcile219(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield220() {
        assertTrue(new AshenKiln().anneal220(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield220() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenKiln().anneal220(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield220() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenKiln().anneal220(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally221() {
        assertEquals("below", new AshenKiln().gauge221(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally221() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.gauge221(3));
        assertEquals("upper-bound", subject.gauge221(12));
    }

    @Test
    void classifiesWithinAndAboveTally221() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.gauge221(3 + 1));
        assertEquals("above", subject.gauge221(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield222() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate222());
        }
        assertEquals(3, subject.ratio222Count());
    }

    @Test
    void refusesOnceExhaustedYield222() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.collate222();
        }
        assertFalse(subject.collate222());
    }

    @Test
    void accumulatesBelowTheCapThreshold223() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.gauge223(1));
        assertEquals(3, subject.gauge223(2));
    }

    @Test
    void saturatesAtTheCapThreshold223() {
        AshenKiln subject = new AshenKiln();
        subject.gauge223(43);
        assertEquals(43, subject.gauge223(5));
    }

    @Test
    void ignoresNegativeValuesThreshold223() {
        AshenKiln subject = new AshenKiln();
        subject.gauge223(3);
        assertEquals(3, subject.gauge223(-2));
        assertEquals(3, subject.margin223Value());
    }

    @Test
    void rejectsZeroDenominatorBias224() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.gauge224(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias224() {
        assertEquals(0.5, new AshenKiln().gauge224(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias224() {
        assertEquals(5.0, new AshenKiln().gauge224(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota225() {
        assertTrue(new AshenKiln().temper225(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota225() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenKiln().temper225(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota225() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenKiln().temper225(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias226() {
        assertEquals("below", new AshenKiln().reconcile226(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias226() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.reconcile226(4));
        assertEquals("upper-bound", subject.reconcile226(11));
    }

    @Test
    void classifiesWithinAndAboveBias226() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.reconcile226(4 + 1));
        assertEquals("above", subject.reconcile226(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota227() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace227());
        }
        assertEquals(4, subject.ratio227Count());
    }

    @Test
    void refusesOnceExhaustedQuota227() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.brace227();
        }
        assertFalse(subject.brace227());
    }

    @Test
    void accumulatesBelowTheCapWeight228() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.sift228(1));
        assertEquals(3, subject.sift228(2));
    }

    @Test
    void saturatesAtTheCapWeight228() {
        AshenKiln subject = new AshenKiln();
        subject.sift228(48);
        assertEquals(48, subject.sift228(5));
    }

    @Test
    void ignoresNegativeValuesWeight228() {
        AshenKiln subject = new AshenKiln();
        subject.sift228(3);
        assertEquals(3, subject.sift228(-2));
        assertEquals(3, subject.bias228Value());
    }

    @Test
    void rejectsZeroDenominatorYield229() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.kindle229(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield229() {
        assertEquals(0.5, new AshenKiln().kindle229(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield229() {
        assertEquals(5.0, new AshenKiln().kindle229(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold230() {
        assertTrue(new AshenKiln().prune230(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold230() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenKiln().prune230(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold230() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenKiln().prune230(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight231() {
        assertEquals("below", new AshenKiln().tally231(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight231() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.tally231(5));
        assertEquals("upper-bound", subject.tally231(10));
    }

    @Test
    void classifiesWithinAndAboveWeight231() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.tally231(5 + 1));
        assertEquals("above", subject.tally231(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset232() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist232());
        }
        assertEquals(1, subject.depth232Count());
    }

    @Test
    void refusesOnceExhaustedOffset232() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.hoist232();
        }
        assertFalse(subject.hoist232());
    }

    @Test
    void accumulatesBelowTheCapMargin233() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.sift233(1));
        assertEquals(3, subject.sift233(2));
    }

    @Test
    void saturatesAtTheCapMargin233() {
        AshenKiln subject = new AshenKiln();
        subject.sift233(53);
        assertEquals(53, subject.sift233(5));
    }

    @Test
    void ignoresNegativeValuesMargin233() {
        AshenKiln subject = new AshenKiln();
        subject.sift233(3);
        assertEquals(3, subject.sift233(-2));
        assertEquals(3, subject.quota233Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity234() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune234(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity234() {
        assertEquals(0.5, new AshenKiln().prune234(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity234() {
        assertEquals(5.0, new AshenKiln().prune234(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold235() {
        assertTrue(new AshenKiln().kindle235(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold235() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenKiln().kindle235(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold235() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenKiln().kindle235(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally236() {
        assertEquals("below", new AshenKiln().hoist236(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally236() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.hoist236(2));
        assertEquals("upper-bound", subject.hoist236(9));
    }

    @Test
    void classifiesWithinAndAboveTally236() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.hoist236(2 + 1));
        assertEquals("above", subject.hoist236(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally237() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper237());
        }
        assertEquals(2, subject.span237Count());
    }

    @Test
    void refusesOnceExhaustedTally237() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.temper237();
        }
        assertFalse(subject.temper237());
    }

    @Test
    void accumulatesBelowTheCapDepth238() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.gauge238(1));
        assertEquals(3, subject.gauge238(2));
    }

    @Test
    void saturatesAtTheCapDepth238() {
        AshenKiln subject = new AshenKiln();
        subject.gauge238(58);
        assertEquals(58, subject.gauge238(5));
    }

    @Test
    void ignoresNegativeValuesDepth238() {
        AshenKiln subject = new AshenKiln();
        subject.gauge238(3);
        assertEquals(3, subject.gauge238(-2));
        assertEquals(3, subject.capacity238Value());
    }

    @Test
    void rejectsZeroDenominatorYield239() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist239(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield239() {
        assertEquals(0.5, new AshenKiln().hoist239(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield239() {
        assertEquals(5.0, new AshenKiln().hoist239(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence240() {
        assertTrue(new AshenKiln().kindle240(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence240() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenKiln().kindle240(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence240() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenKiln().kindle240(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio241() {
        assertEquals("below", new AshenKiln().sift241(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio241() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.sift241(3));
        assertEquals("upper-bound", subject.sift241(8));
    }

    @Test
    void classifiesWithinAndAboveRatio241() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.sift241(3 + 1));
        assertEquals("above", subject.sift241(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias242() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl242());
        }
        assertEquals(3, subject.capacity242Count());
    }

    @Test
    void refusesOnceExhaustedBias242() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.furl242();
        }
        assertFalse(subject.furl242());
    }

    @Test
    void accumulatesBelowTheCapYield243() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.anneal243(1));
        assertEquals(3, subject.anneal243(2));
    }

    @Test
    void saturatesAtTheCapYield243() {
        AshenKiln subject = new AshenKiln();
        subject.anneal243(23);
        assertEquals(23, subject.anneal243(5));
    }

    @Test
    void ignoresNegativeValuesYield243() {
        AshenKiln subject = new AshenKiln();
        subject.anneal243(3);
        assertEquals(3, subject.anneal243(-2));
        assertEquals(3, subject.cadence243Value());
    }

    @Test
    void rejectsZeroDenominatorOffset244() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally244(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset244() {
        assertEquals(0.5, new AshenKiln().tally244(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset244() {
        assertEquals(5.0, new AshenKiln().tally244(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth245() {
        assertTrue(new AshenKiln().flatten245(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth245() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenKiln().flatten245(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth245() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenKiln().flatten245(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally246() {
        assertEquals("below", new AshenKiln().hoist246(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally246() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.hoist246(4));
        assertEquals("upper-bound", subject.hoist246(7));
    }

    @Test
    void classifiesWithinAndAboveTally246() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.hoist246(4 + 1));
        assertEquals("above", subject.hoist246(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin247() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.hoist247());
        }
        assertEquals(4, subject.drift247Count());
    }

    @Test
    void refusesOnceExhaustedMargin247() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.hoist247();
        }
        assertFalse(subject.hoist247());
    }

    @Test
    void accumulatesBelowTheCapOffset248() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.brace248(1));
        assertEquals(3, subject.brace248(2));
    }

    @Test
    void saturatesAtTheCapOffset248() {
        AshenKiln subject = new AshenKiln();
        subject.brace248(28);
        assertEquals(28, subject.brace248(5));
    }

    @Test
    void ignoresNegativeValuesOffset248() {
        AshenKiln subject = new AshenKiln();
        subject.brace248(3);
        assertEquals(3, subject.brace248(-2));
        assertEquals(3, subject.tally248Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold249() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow249(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold249() {
        assertEquals(0.5, new AshenKiln().winnow249(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold249() {
        assertEquals(5.0, new AshenKiln().winnow249(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity250() {
        assertTrue(new AshenKiln().flatten250(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity250() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenKiln().flatten250(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity250() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenKiln().flatten250(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield251() {
        assertEquals("below", new AshenKiln().furl251(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield251() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.furl251(5));
        assertEquals("upper-bound", subject.furl251(12));
    }

    @Test
    void classifiesWithinAndAboveYield251() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.furl251(5 + 1));
        assertEquals("above", subject.furl251(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin252() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally252());
        }
        assertEquals(1, subject.capacity252Count());
    }

    @Test
    void refusesOnceExhaustedMargin252() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.tally252();
        }
        assertFalse(subject.tally252());
    }

    @Test
    void accumulatesBelowTheCapWeight253() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.brace253(1));
        assertEquals(3, subject.brace253(2));
    }

    @Test
    void saturatesAtTheCapWeight253() {
        AshenKiln subject = new AshenKiln();
        subject.brace253(33);
        assertEquals(33, subject.brace253(5));
    }

    @Test
    void ignoresNegativeValuesWeight253() {
        AshenKiln subject = new AshenKiln();
        subject.brace253(3);
        assertEquals(3, subject.brace253(-2));
        assertEquals(3, subject.tally253Value());
    }

    @Test
    void rejectsZeroDenominatorTally254() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.collate254(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally254() {
        assertEquals(0.5, new AshenKiln().collate254(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally254() {
        assertEquals(5.0, new AshenKiln().collate254(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift255() {
        assertTrue(new AshenKiln().furl255(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift255() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenKiln().furl255(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift255() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenKiln().furl255(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan256() {
        assertEquals("below", new AshenKiln().gauge256(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan256() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.gauge256(2));
        assertEquals("upper-bound", subject.gauge256(11));
    }

    @Test
    void classifiesWithinAndAboveSpan256() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.gauge256(2 + 1));
        assertEquals("above", subject.gauge256(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias257() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift257());
        }
        assertEquals(2, subject.span257Count());
    }

    @Test
    void refusesOnceExhaustedBias257() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.sift257();
        }
        assertFalse(subject.sift257());
    }

    @Test
    void accumulatesBelowTheCapMargin258() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.hoist258(1));
        assertEquals(3, subject.hoist258(2));
    }

    @Test
    void saturatesAtTheCapMargin258() {
        AshenKiln subject = new AshenKiln();
        subject.hoist258(38);
        assertEquals(38, subject.hoist258(5));
    }

    @Test
    void ignoresNegativeValuesMargin258() {
        AshenKiln subject = new AshenKiln();
        subject.hoist258(3);
        assertEquals(3, subject.hoist258(-2));
        assertEquals(3, subject.bias258Value());
    }

    @Test
    void rejectsZeroDenominatorDrift259() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally259(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift259() {
        assertEquals(0.5, new AshenKiln().tally259(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift259() {
        assertEquals(5.0, new AshenKiln().tally259(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift260() {
        assertTrue(new AshenKiln().furl260(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift260() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenKiln().furl260(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift260() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenKiln().furl260(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield261() {
        assertEquals("below", new AshenKiln().reconcile261(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield261() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.reconcile261(3));
        assertEquals("upper-bound", subject.reconcile261(10));
    }

    @Test
    void classifiesWithinAndAboveYield261() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.reconcile261(3 + 1));
        assertEquals("above", subject.reconcile261(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan262() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift262());
        }
        assertEquals(3, subject.margin262Count());
    }

    @Test
    void refusesOnceExhaustedSpan262() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.sift262();
        }
        assertFalse(subject.sift262());
    }

    @Test
    void accumulatesBelowTheCapMargin263() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.flatten263(1));
        assertEquals(3, subject.flatten263(2));
    }

    @Test
    void saturatesAtTheCapMargin263() {
        AshenKiln subject = new AshenKiln();
        subject.flatten263(43);
        assertEquals(43, subject.flatten263(5));
    }

    @Test
    void ignoresNegativeValuesMargin263() {
        AshenKiln subject = new AshenKiln();
        subject.flatten263(3);
        assertEquals(3, subject.flatten263(-2));
        assertEquals(3, subject.tally263Value());
    }

    @Test
    void rejectsZeroDenominatorBias264() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist264(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias264() {
        assertEquals(0.5, new AshenKiln().hoist264(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias264() {
        assertEquals(5.0, new AshenKiln().hoist264(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift265() {
        assertTrue(new AshenKiln().kindle265(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift265() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenKiln().kindle265(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDrift265() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenKiln().kindle265(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield266() {
        assertEquals("below", new AshenKiln().sift266(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield266() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.sift266(4));
        assertEquals("upper-bound", subject.sift266(9));
    }

    @Test
    void classifiesWithinAndAboveYield266() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.sift266(4 + 1));
        assertEquals("above", subject.sift266(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity267() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally267());
        }
        assertEquals(4, subject.yield267Count());
    }

    @Test
    void refusesOnceExhaustedCapacity267() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.tally267();
        }
        assertFalse(subject.tally267());
    }

    @Test
    void accumulatesBelowTheCapYield268() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.prune268(1));
        assertEquals(3, subject.prune268(2));
    }

    @Test
    void saturatesAtTheCapYield268() {
        AshenKiln subject = new AshenKiln();
        subject.prune268(48);
        assertEquals(48, subject.prune268(5));
    }

    @Test
    void ignoresNegativeValuesYield268() {
        AshenKiln subject = new AshenKiln();
        subject.prune268(3);
        assertEquals(3, subject.prune268(-2));
        assertEquals(3, subject.tally268Value());
    }

    @Test
    void rejectsZeroDenominatorDrift269() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.anneal269(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift269() {
        assertEquals(0.5, new AshenKiln().anneal269(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift269() {
        assertEquals(5.0, new AshenKiln().anneal269(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield270() {
        assertTrue(new AshenKiln().collate270(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield270() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenKiln().collate270(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield270() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenKiln().collate270(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset271() {
        assertEquals("below", new AshenKiln().tally271(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset271() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.tally271(5));
        assertEquals("upper-bound", subject.tally271(8));
    }

    @Test
    void classifiesWithinAndAboveOffset271() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.tally271(5 + 1));
        assertEquals("above", subject.tally271(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset272() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl272());
        }
        assertEquals(1, subject.capacity272Count());
    }

    @Test
    void refusesOnceExhaustedOffset272() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.furl272();
        }
        assertFalse(subject.furl272());
    }

    @Test
    void accumulatesBelowTheCapRatio273() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.sift273(1));
        assertEquals(3, subject.sift273(2));
    }

    @Test
    void saturatesAtTheCapRatio273() {
        AshenKiln subject = new AshenKiln();
        subject.sift273(53);
        assertEquals(53, subject.sift273(5));
    }

    @Test
    void ignoresNegativeValuesRatio273() {
        AshenKiln subject = new AshenKiln();
        subject.sift273(3);
        assertEquals(3, subject.sift273(-2));
        assertEquals(3, subject.capacity273Value());
    }

    @Test
    void rejectsZeroDenominatorTally274() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune274(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally274() {
        assertEquals(0.5, new AshenKiln().prune274(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally274() {
        assertEquals(5.0, new AshenKiln().prune274(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift275() {
        assertTrue(new AshenKiln().furl275(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift275() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenKiln().furl275(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift275() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenKiln().furl275(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio276() {
        assertEquals("below", new AshenKiln().hoist276(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio276() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.hoist276(2));
        assertEquals("upper-bound", subject.hoist276(7));
    }

    @Test
    void classifiesWithinAndAboveRatio276() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.hoist276(2 + 1));
        assertEquals("above", subject.hoist276(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield277() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate277());
        }
        assertEquals(2, subject.span277Count());
    }

    @Test
    void refusesOnceExhaustedYield277() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.collate277();
        }
        assertFalse(subject.collate277());
    }

    @Test
    void accumulatesBelowTheCapThreshold278() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.furl278(1));
        assertEquals(3, subject.furl278(2));
    }

    @Test
    void saturatesAtTheCapThreshold278() {
        AshenKiln subject = new AshenKiln();
        subject.furl278(58);
        assertEquals(58, subject.furl278(5));
    }

    @Test
    void ignoresNegativeValuesThreshold278() {
        AshenKiln subject = new AshenKiln();
        subject.furl278(3);
        assertEquals(3, subject.furl278(-2));
        assertEquals(3, subject.quota278Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold279() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally279(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold279() {
        assertEquals(0.5, new AshenKiln().tally279(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold279() {
        assertEquals(5.0, new AshenKiln().tally279(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin280() {
        assertTrue(new AshenKiln().prune280(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin280() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenKiln().prune280(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin280() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenKiln().prune280(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift281() {
        assertEquals("below", new AshenKiln().reconcile281(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift281() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.reconcile281(3));
        assertEquals("upper-bound", subject.reconcile281(12));
    }

    @Test
    void classifiesWithinAndAboveDrift281() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.reconcile281(3 + 1));
        assertEquals("above", subject.reconcile281(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio282() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift282());
        }
        assertEquals(3, subject.drift282Count());
    }

    @Test
    void refusesOnceExhaustedRatio282() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.sift282();
        }
        assertFalse(subject.sift282());
    }

    @Test
    void accumulatesBelowTheCapDepth283() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.reconcile283(1));
        assertEquals(3, subject.reconcile283(2));
    }

    @Test
    void saturatesAtTheCapDepth283() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile283(23);
        assertEquals(23, subject.reconcile283(5));
    }

    @Test
    void ignoresNegativeValuesDepth283() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile283(3);
        assertEquals(3, subject.reconcile283(-2));
        assertEquals(3, subject.cadence283Value());
    }

    @Test
    void rejectsZeroDenominatorDepth284() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.brace284(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth284() {
        assertEquals(0.5, new AshenKiln().brace284(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth284() {
        assertEquals(5.0, new AshenKiln().brace284(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset285() {
        assertTrue(new AshenKiln().sift285(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset285() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenKiln().sift285(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset285() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenKiln().sift285(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias286() {
        assertEquals("below", new AshenKiln().kindle286(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias286() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.kindle286(4));
        assertEquals("upper-bound", subject.kindle286(11));
    }

    @Test
    void classifiesWithinAndAboveBias286() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.kindle286(4 + 1));
        assertEquals("above", subject.kindle286(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias287() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile287());
        }
        assertEquals(4, subject.capacity287Count());
    }

    @Test
    void refusesOnceExhaustedBias287() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.reconcile287();
        }
        assertFalse(subject.reconcile287());
    }

    @Test
    void accumulatesBelowTheCapYield288() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.temper288(1));
        assertEquals(3, subject.temper288(2));
    }

    @Test
    void saturatesAtTheCapYield288() {
        AshenKiln subject = new AshenKiln();
        subject.temper288(28);
        assertEquals(28, subject.temper288(5));
    }

    @Test
    void ignoresNegativeValuesYield288() {
        AshenKiln subject = new AshenKiln();
        subject.temper288(3);
        assertEquals(3, subject.temper288(-2));
        assertEquals(3, subject.offset288Value());
    }

    @Test
    void rejectsZeroDenominatorCadence289() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist289(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence289() {
        assertEquals(0.5, new AshenKiln().hoist289(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence289() {
        assertEquals(5.0, new AshenKiln().hoist289(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth290() {
        assertTrue(new AshenKiln().temper290(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth290() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenKiln().temper290(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDepth290() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenKiln().temper290(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift291() {
        assertEquals("below", new AshenKiln().hoist291(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift291() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.hoist291(5));
        assertEquals("upper-bound", subject.hoist291(10));
    }

    @Test
    void classifiesWithinAndAboveDrift291() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.hoist291(5 + 1));
        assertEquals("above", subject.hoist291(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias292() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune292());
        }
        assertEquals(1, subject.capacity292Count());
    }

    @Test
    void refusesOnceExhaustedBias292() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.prune292();
        }
        assertFalse(subject.prune292());
    }

    @Test
    void accumulatesBelowTheCapDrift293() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.tally293(1));
        assertEquals(3, subject.tally293(2));
    }

    @Test
    void saturatesAtTheCapDrift293() {
        AshenKiln subject = new AshenKiln();
        subject.tally293(33);
        assertEquals(33, subject.tally293(5));
    }

    @Test
    void ignoresNegativeValuesDrift293() {
        AshenKiln subject = new AshenKiln();
        subject.tally293(3);
        assertEquals(3, subject.tally293(-2));
        assertEquals(3, subject.tally293Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold294() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune294(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold294() {
        assertEquals(0.5, new AshenKiln().prune294(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold294() {
        assertEquals(5.0, new AshenKiln().prune294(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias295() {
        assertTrue(new AshenKiln().flatten295(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias295() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenKiln().flatten295(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias295() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenKiln().flatten295(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan296() {
        assertEquals("below", new AshenKiln().anneal296(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan296() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.anneal296(2));
        assertEquals("upper-bound", subject.anneal296(9));
    }

    @Test
    void classifiesWithinAndAboveSpan296() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.anneal296(2 + 1));
        assertEquals("above", subject.anneal296(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin297() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow297());
        }
        assertEquals(2, subject.span297Count());
    }

    @Test
    void refusesOnceExhaustedMargin297() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.winnow297();
        }
        assertFalse(subject.winnow297());
    }

    @Test
    void accumulatesBelowTheCapSpan298() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.flatten298(1));
        assertEquals(3, subject.flatten298(2));
    }

    @Test
    void saturatesAtTheCapSpan298() {
        AshenKiln subject = new AshenKiln();
        subject.flatten298(38);
        assertEquals(38, subject.flatten298(5));
    }

    @Test
    void ignoresNegativeValuesSpan298() {
        AshenKiln subject = new AshenKiln();
        subject.flatten298(3);
        assertEquals(3, subject.flatten298(-2));
        assertEquals(3, subject.capacity298Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold299() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.temper299(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold299() {
        assertEquals(0.5, new AshenKiln().temper299(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold299() {
        assertEquals(5.0, new AshenKiln().temper299(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset300() {
        assertTrue(new AshenKiln().kindle300(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset300() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenKiln().kindle300(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset300() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenKiln().kindle300(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio301() {
        assertEquals("below", new AshenKiln().kindle301(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio301() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.kindle301(3));
        assertEquals("upper-bound", subject.kindle301(8));
    }

    @Test
    void classifiesWithinAndAboveRatio301() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.kindle301(3 + 1));
        assertEquals("above", subject.kindle301(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold302() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift302());
        }
        assertEquals(3, subject.capacity302Count());
    }

    @Test
    void refusesOnceExhaustedThreshold302() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.sift302();
        }
        assertFalse(subject.sift302());
    }

    @Test
    void accumulatesBelowTheCapSpan303() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.reconcile303(1));
        assertEquals(3, subject.reconcile303(2));
    }

    @Test
    void saturatesAtTheCapSpan303() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile303(43);
        assertEquals(43, subject.reconcile303(5));
    }

    @Test
    void ignoresNegativeValuesSpan303() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile303(3);
        assertEquals(3, subject.reconcile303(-2));
        assertEquals(3, subject.capacity303Value());
    }

    @Test
    void rejectsZeroDenominatorDrift304() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist304(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift304() {
        assertEquals(0.5, new AshenKiln().hoist304(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift304() {
        assertEquals(5.0, new AshenKiln().hoist304(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset305() {
        assertTrue(new AshenKiln().reconcile305(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset305() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenKiln().reconcile305(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsOffset305() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenKiln().reconcile305(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota306() {
        assertEquals("below", new AshenKiln().furl306(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota306() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.furl306(4));
        assertEquals("upper-bound", subject.furl306(7));
    }

    @Test
    void classifiesWithinAndAboveQuota306() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.furl306(4 + 1));
        assertEquals("above", subject.furl306(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias307() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle307());
        }
        assertEquals(4, subject.weight307Count());
    }

    @Test
    void refusesOnceExhaustedBias307() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.kindle307();
        }
        assertFalse(subject.kindle307());
    }

    @Test
    void accumulatesBelowTheCapDepth308() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.gauge308(1));
        assertEquals(3, subject.gauge308(2));
    }

    @Test
    void saturatesAtTheCapDepth308() {
        AshenKiln subject = new AshenKiln();
        subject.gauge308(48);
        assertEquals(48, subject.gauge308(5));
    }

    @Test
    void ignoresNegativeValuesDepth308() {
        AshenKiln subject = new AshenKiln();
        subject.gauge308(3);
        assertEquals(3, subject.gauge308(-2));
        assertEquals(3, subject.yield308Value());
    }

    @Test
    void rejectsZeroDenominatorWeight309() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow309(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight309() {
        assertEquals(0.5, new AshenKiln().winnow309(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight309() {
        assertEquals(5.0, new AshenKiln().winnow309(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset310() {
        assertTrue(new AshenKiln().temper310(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset310() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenKiln().temper310(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset310() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenKiln().temper310(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth311() {
        assertEquals("below", new AshenKiln().prune311(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth311() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.prune311(5));
        assertEquals("upper-bound", subject.prune311(12));
    }

    @Test
    void classifiesWithinAndAboveDepth311() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.prune311(5 + 1));
        assertEquals("above", subject.prune311(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan312() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally312());
        }
        assertEquals(1, subject.bias312Count());
    }

    @Test
    void refusesOnceExhaustedSpan312() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.tally312();
        }
        assertFalse(subject.tally312());
    }

    @Test
    void accumulatesBelowTheCapCapacity313() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.anneal313(1));
        assertEquals(3, subject.anneal313(2));
    }

    @Test
    void saturatesAtTheCapCapacity313() {
        AshenKiln subject = new AshenKiln();
        subject.anneal313(53);
        assertEquals(53, subject.anneal313(5));
    }

    @Test
    void ignoresNegativeValuesCapacity313() {
        AshenKiln subject = new AshenKiln();
        subject.anneal313(3);
        assertEquals(3, subject.anneal313(-2));
        assertEquals(3, subject.span313Value());
    }

    @Test
    void rejectsZeroDenominatorYield314() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist314(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield314() {
        assertEquals(0.5, new AshenKiln().hoist314(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield314() {
        assertEquals(5.0, new AshenKiln().hoist314(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin315() {
        assertTrue(new AshenKiln().prune315(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin315() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenKiln().prune315(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin315() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenKiln().prune315(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield316() {
        assertEquals("below", new AshenKiln().tally316(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield316() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.tally316(2));
        assertEquals("upper-bound", subject.tally316(11));
    }

    @Test
    void classifiesWithinAndAboveYield316() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.tally316(2 + 1));
        assertEquals("above", subject.tally316(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold317() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist317());
        }
        assertEquals(2, subject.ratio317Count());
    }

    @Test
    void refusesOnceExhaustedThreshold317() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.hoist317();
        }
        assertFalse(subject.hoist317());
    }

    @Test
    void accumulatesBelowTheCapTally318() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.collate318(1));
        assertEquals(3, subject.collate318(2));
    }

    @Test
    void saturatesAtTheCapTally318() {
        AshenKiln subject = new AshenKiln();
        subject.collate318(58);
        assertEquals(58, subject.collate318(5));
    }

    @Test
    void ignoresNegativeValuesTally318() {
        AshenKiln subject = new AshenKiln();
        subject.collate318(3);
        assertEquals(3, subject.collate318(-2));
        assertEquals(3, subject.quota318Value());
    }

    @Test
    void rejectsZeroDenominatorDepth319() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.temper319(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth319() {
        assertEquals(0.5, new AshenKiln().temper319(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth319() {
        assertEquals(5.0, new AshenKiln().temper319(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan320() {
        assertTrue(new AshenKiln().gauge320(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan320() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenKiln().gauge320(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan320() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenKiln().gauge320(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset321() {
        assertEquals("below", new AshenKiln().sift321(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset321() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.sift321(3));
        assertEquals("upper-bound", subject.sift321(10));
    }

    @Test
    void classifiesWithinAndAboveOffset321() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.sift321(3 + 1));
        assertEquals("above", subject.sift321(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio322() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist322());
        }
        assertEquals(3, subject.quota322Count());
    }

    @Test
    void refusesOnceExhaustedRatio322() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.hoist322();
        }
        assertFalse(subject.hoist322());
    }

    @Test
    void accumulatesBelowTheCapBias323() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.flatten323(1));
        assertEquals(3, subject.flatten323(2));
    }

    @Test
    void saturatesAtTheCapBias323() {
        AshenKiln subject = new AshenKiln();
        subject.flatten323(23);
        assertEquals(23, subject.flatten323(5));
    }

    @Test
    void ignoresNegativeValuesBias323() {
        AshenKiln subject = new AshenKiln();
        subject.flatten323(3);
        assertEquals(3, subject.flatten323(-2));
        assertEquals(3, subject.ratio323Value());
    }

    @Test
    void rejectsZeroDenominatorSpan324() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.kindle324(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan324() {
        assertEquals(0.5, new AshenKiln().kindle324(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan324() {
        assertEquals(5.0, new AshenKiln().kindle324(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota325() {
        assertTrue(new AshenKiln().brace325(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota325() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenKiln().brace325(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota325() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenKiln().brace325(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield326() {
        assertEquals("below", new AshenKiln().kindle326(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield326() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.kindle326(4));
        assertEquals("upper-bound", subject.kindle326(9));
    }

    @Test
    void classifiesWithinAndAboveYield326() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.kindle326(4 + 1));
        assertEquals("above", subject.kindle326(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally327() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile327());
        }
        assertEquals(4, subject.quota327Count());
    }

    @Test
    void refusesOnceExhaustedTally327() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.reconcile327();
        }
        assertFalse(subject.reconcile327());
    }

    @Test
    void accumulatesBelowTheCapBias328() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.collate328(1));
        assertEquals(3, subject.collate328(2));
    }

    @Test
    void saturatesAtTheCapBias328() {
        AshenKiln subject = new AshenKiln();
        subject.collate328(28);
        assertEquals(28, subject.collate328(5));
    }

    @Test
    void ignoresNegativeValuesBias328() {
        AshenKiln subject = new AshenKiln();
        subject.collate328(3);
        assertEquals(3, subject.collate328(-2));
        assertEquals(3, subject.cadence328Value());
    }

    @Test
    void rejectsZeroDenominatorMargin329() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally329(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin329() {
        assertEquals(0.5, new AshenKiln().tally329(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin329() {
        assertEquals(5.0, new AshenKiln().tally329(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin330() {
        assertTrue(new AshenKiln().winnow330(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin330() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenKiln().winnow330(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin330() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenKiln().winnow330(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold331() {
        assertEquals("below", new AshenKiln().tally331(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold331() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.tally331(5));
        assertEquals("upper-bound", subject.tally331(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold331() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.tally331(5 + 1));
        assertEquals("above", subject.tally331(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity332() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow332());
        }
        assertEquals(1, subject.offset332Count());
    }

    @Test
    void refusesOnceExhaustedCapacity332() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.winnow332();
        }
        assertFalse(subject.winnow332());
    }

    @Test
    void accumulatesBelowTheCapOffset333() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.furl333(1));
        assertEquals(3, subject.furl333(2));
    }

    @Test
    void saturatesAtTheCapOffset333() {
        AshenKiln subject = new AshenKiln();
        subject.furl333(33);
        assertEquals(33, subject.furl333(5));
    }

    @Test
    void ignoresNegativeValuesOffset333() {
        AshenKiln subject = new AshenKiln();
        subject.furl333(3);
        assertEquals(3, subject.furl333(-2));
        assertEquals(3, subject.quota333Value());
    }

    @Test
    void rejectsZeroDenominatorCadence334() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune334(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence334() {
        assertEquals(0.5, new AshenKiln().prune334(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence334() {
        assertEquals(5.0, new AshenKiln().prune334(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold335() {
        assertTrue(new AshenKiln().anneal335(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold335() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenKiln().anneal335(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold335() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenKiln().anneal335(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence336() {
        assertEquals("below", new AshenKiln().reconcile336(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence336() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.reconcile336(2));
        assertEquals("upper-bound", subject.reconcile336(7));
    }

    @Test
    void classifiesWithinAndAboveCadence336() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.reconcile336(2 + 1));
        assertEquals("above", subject.reconcile336(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin337() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally337());
        }
        assertEquals(2, subject.span337Count());
    }

    @Test
    void refusesOnceExhaustedMargin337() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.tally337();
        }
        assertFalse(subject.tally337());
    }

    @Test
    void accumulatesBelowTheCapYield338() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.hoist338(1));
        assertEquals(3, subject.hoist338(2));
    }

    @Test
    void saturatesAtTheCapYield338() {
        AshenKiln subject = new AshenKiln();
        subject.hoist338(38);
        assertEquals(38, subject.hoist338(5));
    }

    @Test
    void ignoresNegativeValuesYield338() {
        AshenKiln subject = new AshenKiln();
        subject.hoist338(3);
        assertEquals(3, subject.hoist338(-2));
        assertEquals(3, subject.threshold338Value());
    }

    @Test
    void rejectsZeroDenominatorWeight339() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.hoist339(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight339() {
        assertEquals(0.5, new AshenKiln().hoist339(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight339() {
        assertEquals(5.0, new AshenKiln().hoist339(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity340() {
        assertTrue(new AshenKiln().hoist340(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity340() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenKiln().hoist340(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity340() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenKiln().hoist340(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield341() {
        assertEquals("below", new AshenKiln().flatten341(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield341() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.flatten341(3));
        assertEquals("upper-bound", subject.flatten341(12));
    }

    @Test
    void classifiesWithinAndAboveYield341() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.flatten341(3 + 1));
        assertEquals("above", subject.flatten341(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift342() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift342());
        }
        assertEquals(3, subject.cadence342Count());
    }

    @Test
    void refusesOnceExhaustedDrift342() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.sift342();
        }
        assertFalse(subject.sift342());
    }

    @Test
    void accumulatesBelowTheCapQuota343() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.sift343(1));
        assertEquals(3, subject.sift343(2));
    }

    @Test
    void saturatesAtTheCapQuota343() {
        AshenKiln subject = new AshenKiln();
        subject.sift343(43);
        assertEquals(43, subject.sift343(5));
    }

    @Test
    void ignoresNegativeValuesQuota343() {
        AshenKiln subject = new AshenKiln();
        subject.sift343(3);
        assertEquals(3, subject.sift343(-2));
        assertEquals(3, subject.drift343Value());
    }

    @Test
    void rejectsZeroDenominatorQuota344() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.collate344(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota344() {
        assertEquals(0.5, new AshenKiln().collate344(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota344() {
        assertEquals(5.0, new AshenKiln().collate344(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin345() {
        assertTrue(new AshenKiln().sift345(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin345() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenKiln().sift345(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin345() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenKiln().sift345(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight346() {
        assertEquals("below", new AshenKiln().anneal346(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight346() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.anneal346(4));
        assertEquals("upper-bound", subject.anneal346(11));
    }

    @Test
    void classifiesWithinAndAboveWeight346() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.anneal346(4 + 1));
        assertEquals("above", subject.anneal346(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio347() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile347());
        }
        assertEquals(4, subject.capacity347Count());
    }

    @Test
    void refusesOnceExhaustedRatio347() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.reconcile347();
        }
        assertFalse(subject.reconcile347());
    }

    @Test
    void accumulatesBelowTheCapDepth348() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.winnow348(1));
        assertEquals(3, subject.winnow348(2));
    }

    @Test
    void saturatesAtTheCapDepth348() {
        AshenKiln subject = new AshenKiln();
        subject.winnow348(48);
        assertEquals(48, subject.winnow348(5));
    }

    @Test
    void ignoresNegativeValuesDepth348() {
        AshenKiln subject = new AshenKiln();
        subject.winnow348(3);
        assertEquals(3, subject.winnow348(-2));
        assertEquals(3, subject.quota348Value());
    }

    @Test
    void rejectsZeroDenominatorDepth349() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.kindle349(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth349() {
        assertEquals(0.5, new AshenKiln().kindle349(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth349() {
        assertEquals(5.0, new AshenKiln().kindle349(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold350() {
        assertTrue(new AshenKiln().furl350(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold350() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenKiln().furl350(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold350() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenKiln().furl350(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift351() {
        assertEquals("below", new AshenKiln().brace351(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift351() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.brace351(5));
        assertEquals("upper-bound", subject.brace351(10));
    }

    @Test
    void classifiesWithinAndAboveDrift351() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.brace351(5 + 1));
        assertEquals("above", subject.brace351(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth352() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace352());
        }
        assertEquals(1, subject.margin352Count());
    }

    @Test
    void refusesOnceExhaustedDepth352() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.brace352();
        }
        assertFalse(subject.brace352());
    }

    @Test
    void accumulatesBelowTheCapMargin353() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.brace353(1));
        assertEquals(3, subject.brace353(2));
    }

    @Test
    void saturatesAtTheCapMargin353() {
        AshenKiln subject = new AshenKiln();
        subject.brace353(53);
        assertEquals(53, subject.brace353(5));
    }

    @Test
    void ignoresNegativeValuesMargin353() {
        AshenKiln subject = new AshenKiln();
        subject.brace353(3);
        assertEquals(3, subject.brace353(-2));
        assertEquals(3, subject.tally353Value());
    }

    @Test
    void rejectsZeroDenominatorWeight354() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.temper354(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight354() {
        assertEquals(0.5, new AshenKiln().temper354(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight354() {
        assertEquals(5.0, new AshenKiln().temper354(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan355() {
        assertTrue(new AshenKiln().brace355(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan355() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenKiln().brace355(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan355() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenKiln().brace355(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold356() {
        assertEquals("below", new AshenKiln().brace356(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold356() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.brace356(2));
        assertEquals("upper-bound", subject.brace356(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold356() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.brace356(2 + 1));
        assertEquals("above", subject.brace356(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence357() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl357());
        }
        assertEquals(2, subject.threshold357Count());
    }

    @Test
    void refusesOnceExhaustedCadence357() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.furl357();
        }
        assertFalse(subject.furl357());
    }

    @Test
    void accumulatesBelowTheCapTally358() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.gauge358(1));
        assertEquals(3, subject.gauge358(2));
    }

    @Test
    void saturatesAtTheCapTally358() {
        AshenKiln subject = new AshenKiln();
        subject.gauge358(58);
        assertEquals(58, subject.gauge358(5));
    }

    @Test
    void ignoresNegativeValuesTally358() {
        AshenKiln subject = new AshenKiln();
        subject.gauge358(3);
        assertEquals(3, subject.gauge358(-2));
        assertEquals(3, subject.yield358Value());
    }

    @Test
    void rejectsZeroDenominatorWeight359() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.furl359(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight359() {
        assertEquals(0.5, new AshenKiln().furl359(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight359() {
        assertEquals(5.0, new AshenKiln().furl359(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan360() {
        assertTrue(new AshenKiln().prune360(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan360() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenKiln().prune360(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan360() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenKiln().prune360(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight361() {
        assertEquals("below", new AshenKiln().gauge361(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight361() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.gauge361(3));
        assertEquals("upper-bound", subject.gauge361(8));
    }

    @Test
    void classifiesWithinAndAboveWeight361() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.gauge361(3 + 1));
        assertEquals("above", subject.gauge361(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold362() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten362());
        }
        assertEquals(3, subject.capacity362Count());
    }

    @Test
    void refusesOnceExhaustedThreshold362() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.flatten362();
        }
        assertFalse(subject.flatten362());
    }

    @Test
    void accumulatesBelowTheCapRatio363() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.collate363(1));
        assertEquals(3, subject.collate363(2));
    }

    @Test
    void saturatesAtTheCapRatio363() {
        AshenKiln subject = new AshenKiln();
        subject.collate363(23);
        assertEquals(23, subject.collate363(5));
    }

    @Test
    void ignoresNegativeValuesRatio363() {
        AshenKiln subject = new AshenKiln();
        subject.collate363(3);
        assertEquals(3, subject.collate363(-2));
        assertEquals(3, subject.threshold363Value());
    }

    @Test
    void rejectsZeroDenominatorRatio364() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.tally364(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio364() {
        assertEquals(0.5, new AshenKiln().tally364(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio364() {
        assertEquals(5.0, new AshenKiln().tally364(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin365() {
        assertTrue(new AshenKiln().winnow365(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin365() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenKiln().winnow365(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin365() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenKiln().winnow365(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence366() {
        assertEquals("below", new AshenKiln().furl366(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence366() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.furl366(4));
        assertEquals("upper-bound", subject.furl366(7));
    }

    @Test
    void classifiesWithinAndAboveCadence366() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.furl366(4 + 1));
        assertEquals("above", subject.furl366(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin367() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune367());
        }
        assertEquals(4, subject.cadence367Count());
    }

    @Test
    void refusesOnceExhaustedMargin367() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.prune367();
        }
        assertFalse(subject.prune367());
    }

    @Test
    void accumulatesBelowTheCapDepth368() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.temper368(1));
        assertEquals(3, subject.temper368(2));
    }

    @Test
    void saturatesAtTheCapDepth368() {
        AshenKiln subject = new AshenKiln();
        subject.temper368(28);
        assertEquals(28, subject.temper368(5));
    }

    @Test
    void ignoresNegativeValuesDepth368() {
        AshenKiln subject = new AshenKiln();
        subject.temper368(3);
        assertEquals(3, subject.temper368(-2));
        assertEquals(3, subject.cadence368Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity369() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.kindle369(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity369() {
        assertEquals(0.5, new AshenKiln().kindle369(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity369() {
        assertEquals(5.0, new AshenKiln().kindle369(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold370() {
        assertTrue(new AshenKiln().tally370(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold370() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenKiln().tally370(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold370() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenKiln().tally370(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity371() {
        assertEquals("below", new AshenKiln().collate371(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity371() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.collate371(5));
        assertEquals("upper-bound", subject.collate371(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity371() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.collate371(5 + 1));
        assertEquals("above", subject.collate371(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset372() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile372());
        }
        assertEquals(1, subject.ratio372Count());
    }

    @Test
    void refusesOnceExhaustedOffset372() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.reconcile372();
        }
        assertFalse(subject.reconcile372());
    }

    @Test
    void accumulatesBelowTheCapTally373() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.temper373(1));
        assertEquals(3, subject.temper373(2));
    }

    @Test
    void saturatesAtTheCapTally373() {
        AshenKiln subject = new AshenKiln();
        subject.temper373(33);
        assertEquals(33, subject.temper373(5));
    }

    @Test
    void ignoresNegativeValuesTally373() {
        AshenKiln subject = new AshenKiln();
        subject.temper373(3);
        assertEquals(3, subject.temper373(-2));
        assertEquals(3, subject.yield373Value());
    }

    @Test
    void rejectsZeroDenominatorTally374() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.furl374(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally374() {
        assertEquals(0.5, new AshenKiln().furl374(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally374() {
        assertEquals(5.0, new AshenKiln().furl374(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan375() {
        assertTrue(new AshenKiln().winnow375(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan375() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenKiln().winnow375(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan375() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenKiln().winnow375(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold376() {
        assertEquals("below", new AshenKiln().brace376(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold376() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.brace376(2));
        assertEquals("upper-bound", subject.brace376(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold376() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.brace376(2 + 1));
        assertEquals("above", subject.brace376(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio377() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile377());
        }
        assertEquals(2, subject.margin377Count());
    }

    @Test
    void refusesOnceExhaustedRatio377() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.reconcile377();
        }
        assertFalse(subject.reconcile377());
    }

    @Test
    void accumulatesBelowTheCapRatio378() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.reconcile378(1));
        assertEquals(3, subject.reconcile378(2));
    }

    @Test
    void saturatesAtTheCapRatio378() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile378(38);
        assertEquals(38, subject.reconcile378(5));
    }

    @Test
    void ignoresNegativeValuesRatio378() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile378(3);
        assertEquals(3, subject.reconcile378(-2));
        assertEquals(3, subject.depth378Value());
    }

    @Test
    void rejectsZeroDenominatorOffset379() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.sift379(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset379() {
        assertEquals(0.5, new AshenKiln().sift379(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset379() {
        assertEquals(5.0, new AshenKiln().sift379(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin380() {
        assertTrue(new AshenKiln().sift380(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin380() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenKiln().sift380(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin380() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenKiln().sift380(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift381() {
        assertEquals("below", new AshenKiln().temper381(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift381() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.temper381(3));
        assertEquals("upper-bound", subject.temper381(10));
    }

    @Test
    void classifiesWithinAndAboveDrift381() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.temper381(3 + 1));
        assertEquals("above", subject.temper381(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio382() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge382());
        }
        assertEquals(3, subject.quota382Count());
    }

    @Test
    void refusesOnceExhaustedRatio382() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 3; i++) {
            subject.gauge382();
        }
        assertFalse(subject.gauge382());
    }

    @Test
    void accumulatesBelowTheCapDepth383() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.furl383(1));
        assertEquals(3, subject.furl383(2));
    }

    @Test
    void saturatesAtTheCapDepth383() {
        AshenKiln subject = new AshenKiln();
        subject.furl383(43);
        assertEquals(43, subject.furl383(5));
    }

    @Test
    void ignoresNegativeValuesDepth383() {
        AshenKiln subject = new AshenKiln();
        subject.furl383(3);
        assertEquals(3, subject.furl383(-2));
        assertEquals(3, subject.span383Value());
    }

    @Test
    void rejectsZeroDenominatorCadence384() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.flatten384(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence384() {
        assertEquals(0.5, new AshenKiln().flatten384(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence384() {
        assertEquals(5.0, new AshenKiln().flatten384(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift385() {
        assertTrue(new AshenKiln().prune385(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift385() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenKiln().prune385(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift385() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenKiln().prune385(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan386() {
        assertEquals("below", new AshenKiln().reconcile386(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan386() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.reconcile386(4));
        assertEquals("upper-bound", subject.reconcile386(9));
    }

    @Test
    void classifiesWithinAndAboveSpan386() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.reconcile386(4 + 1));
        assertEquals("above", subject.reconcile386(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield387() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow387());
        }
        assertEquals(4, subject.quota387Count());
    }

    @Test
    void refusesOnceExhaustedYield387() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 4; i++) {
            subject.winnow387();
        }
        assertFalse(subject.winnow387());
    }

    @Test
    void accumulatesBelowTheCapDepth388() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.reconcile388(1));
        assertEquals(3, subject.reconcile388(2));
    }

    @Test
    void saturatesAtTheCapDepth388() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile388(48);
        assertEquals(48, subject.reconcile388(5));
    }

    @Test
    void ignoresNegativeValuesDepth388() {
        AshenKiln subject = new AshenKiln();
        subject.reconcile388(3);
        assertEquals(3, subject.reconcile388(-2));
        assertEquals(3, subject.cadence388Value());
    }

    @Test
    void rejectsZeroDenominatorQuota389() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.winnow389(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota389() {
        assertEquals(0.5, new AshenKiln().winnow389(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota389() {
        assertEquals(5.0, new AshenKiln().winnow389(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield390() {
        assertTrue(new AshenKiln().collate390(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield390() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenKiln().collate390(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield390() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenKiln().collate390(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield391() {
        assertEquals("below", new AshenKiln().temper391(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield391() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.temper391(5));
        assertEquals("upper-bound", subject.temper391(8));
    }

    @Test
    void classifiesWithinAndAboveYield391() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.temper391(5 + 1));
        assertEquals("above", subject.temper391(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield392() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile392());
        }
        assertEquals(1, subject.span392Count());
    }

    @Test
    void refusesOnceExhaustedYield392() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 1; i++) {
            subject.reconcile392();
        }
        assertFalse(subject.reconcile392());
    }

    @Test
    void accumulatesBelowTheCapCadence393() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.temper393(1));
        assertEquals(3, subject.temper393(2));
    }

    @Test
    void saturatesAtTheCapCadence393() {
        AshenKiln subject = new AshenKiln();
        subject.temper393(53);
        assertEquals(53, subject.temper393(5));
    }

    @Test
    void ignoresNegativeValuesCadence393() {
        AshenKiln subject = new AshenKiln();
        subject.temper393(3);
        assertEquals(3, subject.temper393(-2));
        assertEquals(3, subject.bias393Value());
    }

    @Test
    void rejectsZeroDenominatorMargin394() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.prune394(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin394() {
        assertEquals(0.5, new AshenKiln().prune394(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin394() {
        assertEquals(5.0, new AshenKiln().prune394(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias395() {
        assertTrue(new AshenKiln().kindle395(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias395() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenKiln().kindle395(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias395() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenKiln().kindle395(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan396() {
        assertEquals("below", new AshenKiln().anneal396(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan396() {
        AshenKiln subject = new AshenKiln();
        assertEquals("lower-bound", subject.anneal396(2));
        assertEquals("upper-bound", subject.anneal396(7));
    }

    @Test
    void classifiesWithinAndAboveSpan396() {
        AshenKiln subject = new AshenKiln();
        assertEquals("within", subject.anneal396(2 + 1));
        assertEquals("above", subject.anneal396(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight397() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift397());
        }
        assertEquals(2, subject.span397Count());
    }

    @Test
    void refusesOnceExhaustedWeight397() {
        AshenKiln subject = new AshenKiln();
        for (int i = 0; i < 2; i++) {
            subject.sift397();
        }
        assertFalse(subject.sift397());
    }

    @Test
    void accumulatesBelowTheCapCapacity398() {
        AshenKiln subject = new AshenKiln();
        assertEquals(1, subject.furl398(1));
        assertEquals(3, subject.furl398(2));
    }

    @Test
    void saturatesAtTheCapCapacity398() {
        AshenKiln subject = new AshenKiln();
        subject.furl398(58);
        assertEquals(58, subject.furl398(5));
    }

    @Test
    void ignoresNegativeValuesCapacity398() {
        AshenKiln subject = new AshenKiln();
        subject.furl398(3);
        assertEquals(3, subject.furl398(-2));
        assertEquals(3, subject.depth398Value());
    }

    @Test
    void rejectsZeroDenominatorBias399() {
        AshenKiln subject = new AshenKiln();
        assertThrows(ArithmeticException.class, () -> subject.anneal399(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias399() {
        assertEquals(0.5, new AshenKiln().anneal399(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias399() {
        assertEquals(5.0, new AshenKiln().anneal399(1000.0, 1.0), 1e-9);
    }
}
