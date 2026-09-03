package com.quiet.thicket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TidalLedgerIITest {

    @Test
    void classifiesBelowTheLowerBoundCadence0() {
        assertEquals("below", new TidalLedgerII().reconcile0(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence0() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals("lower-bound", subject.reconcile0(2));
        assertEquals("upper-bound", subject.reconcile0(7));
    }

    @Test
    void classifiesWithinAndAboveCadence0() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals("within", subject.reconcile0(2 + 1));
        assertEquals("above", subject.reconcile0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield1() {
        TidalLedgerII subject = new TidalLedgerII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge1());
        }
        assertEquals(2, subject.drift1Count());
    }

    @Test
    void refusesOnceExhaustedYield1() {
        TidalLedgerII subject = new TidalLedgerII();
        for (int i = 0; i < 2; i++) {
            subject.gauge1();
        }
        assertFalse(subject.gauge1());
    }

    @Test
    void accumulatesBelowTheCapCadence2() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals(1, subject.collate2(1));
        assertEquals(3, subject.collate2(2));
    }

    @Test
    void saturatesAtTheCapCadence2() {
        TidalLedgerII subject = new TidalLedgerII();
        subject.collate2(22);
        assertEquals(22, subject.collate2(5));
    }

    @Test
    void ignoresNegativeValuesCadence2() {
        TidalLedgerII subject = new TidalLedgerII();
        subject.collate2(3);
        assertEquals(3, subject.collate2(-2));
        assertEquals(3, subject.span2Value());
    }

    @Test
    void rejectsZeroDenominatorOffset3() {
        TidalLedgerII subject = new TidalLedgerII();
        assertThrows(ArithmeticException.class, () -> subject.temper3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset3() {
        assertEquals(0.5, new TidalLedgerII().temper3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset3() {
        assertEquals(4.0, new TidalLedgerII().temper3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight4() {
        assertTrue(new TidalLedgerII().hoist4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new TidalLedgerII().hoist4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight4() {
        assertEquals(java.util.Arrays.asList(10),
                new TidalLedgerII().hoist4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence5() {
        assertEquals("below", new TidalLedgerII().tally5(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence5() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals("lower-bound", subject.tally5(3));
        assertEquals("upper-bound", subject.tally5(12));
    }

    @Test
    void classifiesWithinAndAboveCadence5() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals("within", subject.tally5(3 + 1));
        assertEquals("above", subject.tally5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth6() {
        TidalLedgerII subject = new TidalLedgerII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace6());
        }
        assertEquals(3, subject.capacity6Count());
    }

    @Test
    void refusesOnceExhaustedDepth6() {
        TidalLedgerII subject = new TidalLedgerII();
        for (int i = 0; i < 3; i++) {
            subject.brace6();
        }
        assertFalse(subject.brace6());
    }

    @Test
    void accumulatesBelowTheCapMargin7() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals(1, subject.prune7(1));
        assertEquals(3, subject.prune7(2));
    }

    @Test
    void saturatesAtTheCapMargin7() {
        TidalLedgerII subject = new TidalLedgerII();
        subject.prune7(27);
        assertEquals(27, subject.prune7(5));
    }

    @Test
    void ignoresNegativeValuesMargin7() {
        TidalLedgerII subject = new TidalLedgerII();
        subject.prune7(3);
        assertEquals(3, subject.prune7(-2));
        assertEquals(3, subject.threshold7Value());
    }

    @Test
    void rejectsZeroDenominatorRatio8() {
        TidalLedgerII subject = new TidalLedgerII();
        assertThrows(ArithmeticException.class, () -> subject.winnow8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio8() {
        assertEquals(0.5, new TidalLedgerII().winnow8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio8() {
        assertEquals(4.0, new TidalLedgerII().winnow8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth9() {
        assertTrue(new TidalLedgerII().kindle9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new TidalLedgerII().kindle9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth9() {
        assertEquals(java.util.Arrays.asList(6),
                new TidalLedgerII().kindle9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight10() {
        assertEquals("below", new TidalLedgerII().hoist10(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight10() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals("lower-bound", subject.hoist10(4));
        assertEquals("upper-bound", subject.hoist10(11));
    }

    @Test
    void classifiesWithinAndAboveWeight10() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals("within", subject.hoist10(4 + 1));
        assertEquals("above", subject.hoist10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight11() {
        TidalLedgerII subject = new TidalLedgerII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate11());
        }
        assertEquals(4, subject.threshold11Count());
    }

    @Test
    void refusesOnceExhaustedWeight11() {
        TidalLedgerII subject = new TidalLedgerII();
        for (int i = 0; i < 4; i++) {
            subject.collate11();
        }
        assertFalse(subject.collate11());
    }

    @Test
    void accumulatesBelowTheCapOffset12() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals(1, subject.gauge12(1));
        assertEquals(3, subject.gauge12(2));
    }

    @Test
    void saturatesAtTheCapOffset12() {
        TidalLedgerII subject = new TidalLedgerII();
        subject.gauge12(32);
        assertEquals(32, subject.gauge12(5));
    }

    @Test
    void ignoresNegativeValuesOffset12() {
        TidalLedgerII subject = new TidalLedgerII();
        subject.gauge12(3);
        assertEquals(3, subject.gauge12(-2));
        assertEquals(3, subject.depth12Value());
    }

    @Test
    void rejectsZeroDenominatorYield13() {
        TidalLedgerII subject = new TidalLedgerII();
        assertThrows(ArithmeticException.class, () -> subject.flatten13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield13() {
        assertEquals(0.5, new TidalLedgerII().flatten13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield13() {
        assertEquals(4.0, new TidalLedgerII().flatten13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias14() {
        assertTrue(new TidalLedgerII().flatten14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new TidalLedgerII().flatten14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias14() {
        assertEquals(java.util.Arrays.asList(11),
                new TidalLedgerII().flatten14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally15() {
        assertEquals("below", new TidalLedgerII().gauge15(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally15() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals("lower-bound", subject.gauge15(5));
        assertEquals("upper-bound", subject.gauge15(10));
    }

    @Test
    void classifiesWithinAndAboveTally15() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals("within", subject.gauge15(5 + 1));
        assertEquals("above", subject.gauge15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan16() {
        TidalLedgerII subject = new TidalLedgerII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace16());
        }
        assertEquals(1, subject.offset16Count());
    }

    @Test
    void refusesOnceExhaustedSpan16() {
        TidalLedgerII subject = new TidalLedgerII();
        for (int i = 0; i < 1; i++) {
            subject.brace16();
        }
        assertFalse(subject.brace16());
    }

    @Test
    void accumulatesBelowTheCapQuota17() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals(1, subject.sift17(1));
        assertEquals(3, subject.sift17(2));
    }

    @Test
    void saturatesAtTheCapQuota17() {
        TidalLedgerII subject = new TidalLedgerII();
        subject.sift17(37);
        assertEquals(37, subject.sift17(5));
    }

    @Test
    void ignoresNegativeValuesQuota17() {
        TidalLedgerII subject = new TidalLedgerII();
        subject.sift17(3);
        assertEquals(3, subject.sift17(-2));
        assertEquals(3, subject.ratio17Value());
    }

    @Test
    void rejectsZeroDenominatorMargin18() {
        TidalLedgerII subject = new TidalLedgerII();
        assertThrows(ArithmeticException.class, () -> subject.furl18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin18() {
        assertEquals(0.5, new TidalLedgerII().furl18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin18() {
        assertEquals(4.0, new TidalLedgerII().furl18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio19() {
        assertTrue(new TidalLedgerII().kindle19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new TidalLedgerII().kindle19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio19() {
        assertEquals(java.util.Arrays.asList(7),
                new TidalLedgerII().kindle19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset20() {
        assertEquals("below", new TidalLedgerII().tally20(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset20() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals("lower-bound", subject.tally20(2));
        assertEquals("upper-bound", subject.tally20(9));
    }

    @Test
    void classifiesWithinAndAboveOffset20() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals("within", subject.tally20(2 + 1));
        assertEquals("above", subject.tally20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence21() {
        TidalLedgerII subject = new TidalLedgerII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper21());
        }
        assertEquals(2, subject.tally21Count());
    }

    @Test
    void refusesOnceExhaustedCadence21() {
        TidalLedgerII subject = new TidalLedgerII();
        for (int i = 0; i < 2; i++) {
            subject.temper21();
        }
        assertFalse(subject.temper21());
    }

    @Test
    void accumulatesBelowTheCapRatio22() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals(1, subject.temper22(1));
        assertEquals(3, subject.temper22(2));
    }

    @Test
    void saturatesAtTheCapRatio22() {
        TidalLedgerII subject = new TidalLedgerII();
        subject.temper22(42);
        assertEquals(42, subject.temper22(5));
    }

    @Test
    void ignoresNegativeValuesRatio22() {
        TidalLedgerII subject = new TidalLedgerII();
        subject.temper22(3);
        assertEquals(3, subject.temper22(-2));
        assertEquals(3, subject.threshold22Value());
    }

    @Test
    void rejectsZeroDenominatorDepth23() {
        TidalLedgerII subject = new TidalLedgerII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth23() {
        assertEquals(0.5, new TidalLedgerII().reconcile23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth23() {
        assertEquals(4.0, new TidalLedgerII().reconcile23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias24() {
        assertTrue(new TidalLedgerII().hoist24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new TidalLedgerII().hoist24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias24() {
        assertEquals(java.util.Arrays.asList(12),
                new TidalLedgerII().hoist24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence25() {
        assertEquals("below", new TidalLedgerII().flatten25(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence25() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals("lower-bound", subject.flatten25(3));
        assertEquals("upper-bound", subject.flatten25(8));
    }

    @Test
    void classifiesWithinAndAboveCadence25() {
        TidalLedgerII subject = new TidalLedgerII();
        assertEquals("within", subject.flatten25(3 + 1));
        assertEquals("above", subject.flatten25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio26() {
        TidalLedgerII subject = new TidalLedgerII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl26());
        }
        assertEquals(3, subject.offset26Count());
    }

    @Test
    void refusesOnceExhaustedRatio26() {
        TidalLedgerII subject = new TidalLedgerII();
        for (int i = 0; i < 3; i++) {
            subject.furl26();
        }
        assertFalse(subject.furl26());
    }
}
