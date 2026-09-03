package com.ashen.pylon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenThicketTest {

    @Test
    void classifiesBelowTheLowerBoundYield0() {
        assertEquals("below", new AshenThicket().hoist0(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield0() {
        AshenThicket subject = new AshenThicket();
        assertEquals("lower-bound", subject.hoist0(2));
        assertEquals("upper-bound", subject.hoist0(7));
    }

    @Test
    void classifiesWithinAndAboveYield0() {
        AshenThicket subject = new AshenThicket();
        assertEquals("within", subject.hoist0(2 + 1));
        assertEquals("above", subject.hoist0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth1() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist1());
        }
        assertEquals(2, subject.bias1Count());
    }

    @Test
    void refusesOnceExhaustedDepth1() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 2; i++) {
            subject.hoist1();
        }
        assertFalse(subject.hoist1());
    }

    @Test
    void accumulatesBelowTheCapSpan2() {
        AshenThicket subject = new AshenThicket();
        assertEquals(1, subject.reconcile2(1));
        assertEquals(3, subject.reconcile2(2));
    }

    @Test
    void saturatesAtTheCapSpan2() {
        AshenThicket subject = new AshenThicket();
        subject.reconcile2(22);
        assertEquals(22, subject.reconcile2(5));
    }

    @Test
    void ignoresNegativeValuesSpan2() {
        AshenThicket subject = new AshenThicket();
        subject.reconcile2(3);
        assertEquals(3, subject.reconcile2(-2));
        assertEquals(3, subject.margin2Value());
    }

    @Test
    void rejectsZeroDenominatorBias3() {
        AshenThicket subject = new AshenThicket();
        assertThrows(ArithmeticException.class, () -> subject.reconcile3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias3() {
        assertEquals(0.5, new AshenThicket().reconcile3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias3() {
        assertEquals(4.0, new AshenThicket().reconcile3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin4() {
        assertTrue(new AshenThicket().gauge4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AshenThicket().gauge4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin4() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenThicket().gauge4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset5() {
        assertEquals("below", new AshenThicket().collate5(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset5() {
        AshenThicket subject = new AshenThicket();
        assertEquals("lower-bound", subject.collate5(3));
        assertEquals("upper-bound", subject.collate5(12));
    }

    @Test
    void classifiesWithinAndAboveOffset5() {
        AshenThicket subject = new AshenThicket();
        assertEquals("within", subject.collate5(3 + 1));
        assertEquals("above", subject.collate5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio6() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow6());
        }
        assertEquals(3, subject.weight6Count());
    }

    @Test
    void refusesOnceExhaustedRatio6() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 3; i++) {
            subject.winnow6();
        }
        assertFalse(subject.winnow6());
    }

    @Test
    void accumulatesBelowTheCapCadence7() {
        AshenThicket subject = new AshenThicket();
        assertEquals(1, subject.kindle7(1));
        assertEquals(3, subject.kindle7(2));
    }

    @Test
    void saturatesAtTheCapCadence7() {
        AshenThicket subject = new AshenThicket();
        subject.kindle7(27);
        assertEquals(27, subject.kindle7(5));
    }

    @Test
    void ignoresNegativeValuesCadence7() {
        AshenThicket subject = new AshenThicket();
        subject.kindle7(3);
        assertEquals(3, subject.kindle7(-2));
        assertEquals(3, subject.margin7Value());
    }

    @Test
    void rejectsZeroDenominatorSpan8() {
        AshenThicket subject = new AshenThicket();
        assertThrows(ArithmeticException.class, () -> subject.kindle8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan8() {
        assertEquals(0.5, new AshenThicket().kindle8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan8() {
        assertEquals(4.0, new AshenThicket().kindle8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight9() {
        assertTrue(new AshenThicket().reconcile9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AshenThicket().reconcile9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsWeight9() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenThicket().reconcile9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset10() {
        assertEquals("below", new AshenThicket().tally10(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset10() {
        AshenThicket subject = new AshenThicket();
        assertEquals("lower-bound", subject.tally10(4));
        assertEquals("upper-bound", subject.tally10(11));
    }

    @Test
    void classifiesWithinAndAboveOffset10() {
        AshenThicket subject = new AshenThicket();
        assertEquals("within", subject.tally10(4 + 1));
        assertEquals("above", subject.tally10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield11() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl11());
        }
        assertEquals(4, subject.threshold11Count());
    }

    @Test
    void refusesOnceExhaustedYield11() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 4; i++) {
            subject.furl11();
        }
        assertFalse(subject.furl11());
    }

    @Test
    void accumulatesBelowTheCapBias12() {
        AshenThicket subject = new AshenThicket();
        assertEquals(1, subject.flatten12(1));
        assertEquals(3, subject.flatten12(2));
    }

    @Test
    void saturatesAtTheCapBias12() {
        AshenThicket subject = new AshenThicket();
        subject.flatten12(32);
        assertEquals(32, subject.flatten12(5));
    }

    @Test
    void ignoresNegativeValuesBias12() {
        AshenThicket subject = new AshenThicket();
        subject.flatten12(3);
        assertEquals(3, subject.flatten12(-2));
        assertEquals(3, subject.threshold12Value());
    }

    @Test
    void rejectsZeroDenominatorBias13() {
        AshenThicket subject = new AshenThicket();
        assertThrows(ArithmeticException.class, () -> subject.tally13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias13() {
        assertEquals(0.5, new AshenThicket().tally13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias13() {
        assertEquals(4.0, new AshenThicket().tally13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias14() {
        assertTrue(new AshenThicket().temper14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new AshenThicket().temper14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias14() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenThicket().temper14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence15() {
        assertEquals("below", new AshenThicket().temper15(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence15() {
        AshenThicket subject = new AshenThicket();
        assertEquals("lower-bound", subject.temper15(5));
        assertEquals("upper-bound", subject.temper15(10));
    }

    @Test
    void classifiesWithinAndAboveCadence15() {
        AshenThicket subject = new AshenThicket();
        assertEquals("within", subject.temper15(5 + 1));
        assertEquals("above", subject.temper15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight16() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle16());
        }
        assertEquals(1, subject.tally16Count());
    }

    @Test
    void refusesOnceExhaustedWeight16() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 1; i++) {
            subject.kindle16();
        }
        assertFalse(subject.kindle16());
    }

    @Test
    void accumulatesBelowTheCapRatio17() {
        AshenThicket subject = new AshenThicket();
        assertEquals(1, subject.winnow17(1));
        assertEquals(3, subject.winnow17(2));
    }

    @Test
    void saturatesAtTheCapRatio17() {
        AshenThicket subject = new AshenThicket();
        subject.winnow17(37);
        assertEquals(37, subject.winnow17(5));
    }

    @Test
    void ignoresNegativeValuesRatio17() {
        AshenThicket subject = new AshenThicket();
        subject.winnow17(3);
        assertEquals(3, subject.winnow17(-2));
        assertEquals(3, subject.offset17Value());
    }

    @Test
    void rejectsZeroDenominatorMargin18() {
        AshenThicket subject = new AshenThicket();
        assertThrows(ArithmeticException.class, () -> subject.reconcile18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin18() {
        assertEquals(0.5, new AshenThicket().reconcile18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin18() {
        assertEquals(4.0, new AshenThicket().reconcile18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota19() {
        assertTrue(new AshenThicket().gauge19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new AshenThicket().gauge19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota19() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenThicket().gauge19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset20() {
        assertEquals("below", new AshenThicket().tally20(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset20() {
        AshenThicket subject = new AshenThicket();
        assertEquals("lower-bound", subject.tally20(2));
        assertEquals("upper-bound", subject.tally20(9));
    }

    @Test
    void classifiesWithinAndAboveOffset20() {
        AshenThicket subject = new AshenThicket();
        assertEquals("within", subject.tally20(2 + 1));
        assertEquals("above", subject.tally20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold21() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate21());
        }
        assertEquals(2, subject.drift21Count());
    }

    @Test
    void refusesOnceExhaustedThreshold21() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 2; i++) {
            subject.collate21();
        }
        assertFalse(subject.collate21());
    }

    @Test
    void accumulatesBelowTheCapDrift22() {
        AshenThicket subject = new AshenThicket();
        assertEquals(1, subject.tally22(1));
        assertEquals(3, subject.tally22(2));
    }

    @Test
    void saturatesAtTheCapDrift22() {
        AshenThicket subject = new AshenThicket();
        subject.tally22(42);
        assertEquals(42, subject.tally22(5));
    }

    @Test
    void ignoresNegativeValuesDrift22() {
        AshenThicket subject = new AshenThicket();
        subject.tally22(3);
        assertEquals(3, subject.tally22(-2));
        assertEquals(3, subject.threshold22Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity23() {
        AshenThicket subject = new AshenThicket();
        assertThrows(ArithmeticException.class, () -> subject.brace23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity23() {
        assertEquals(0.5, new AshenThicket().brace23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity23() {
        assertEquals(4.0, new AshenThicket().brace23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota24() {
        assertTrue(new AshenThicket().reconcile24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new AshenThicket().reconcile24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota24() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenThicket().reconcile24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio25() {
        assertEquals("below", new AshenThicket().furl25(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio25() {
        AshenThicket subject = new AshenThicket();
        assertEquals("lower-bound", subject.furl25(3));
        assertEquals("upper-bound", subject.furl25(8));
    }

    @Test
    void classifiesWithinAndAboveRatio25() {
        AshenThicket subject = new AshenThicket();
        assertEquals("within", subject.furl25(3 + 1));
        assertEquals("above", subject.furl25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio26() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift26());
        }
        assertEquals(3, subject.quota26Count());
    }

    @Test
    void refusesOnceExhaustedRatio26() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 3; i++) {
            subject.sift26();
        }
        assertFalse(subject.sift26());
    }

    @Test
    void accumulatesBelowTheCapMargin27() {
        AshenThicket subject = new AshenThicket();
        assertEquals(1, subject.winnow27(1));
        assertEquals(3, subject.winnow27(2));
    }

    @Test
    void saturatesAtTheCapMargin27() {
        AshenThicket subject = new AshenThicket();
        subject.winnow27(47);
        assertEquals(47, subject.winnow27(5));
    }

    @Test
    void ignoresNegativeValuesMargin27() {
        AshenThicket subject = new AshenThicket();
        subject.winnow27(3);
        assertEquals(3, subject.winnow27(-2));
        assertEquals(3, subject.offset27Value());
    }

    @Test
    void rejectsZeroDenominatorSpan28() {
        AshenThicket subject = new AshenThicket();
        assertThrows(ArithmeticException.class, () -> subject.tally28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan28() {
        assertEquals(0.5, new AshenThicket().tally28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan28() {
        assertEquals(4.0, new AshenThicket().tally28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity29() {
        assertTrue(new AshenThicket().temper29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new AshenThicket().temper29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity29() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenThicket().temper29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity30() {
        assertEquals("below", new AshenThicket().kindle30(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity30() {
        AshenThicket subject = new AshenThicket();
        assertEquals("lower-bound", subject.kindle30(4));
        assertEquals("upper-bound", subject.kindle30(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity30() {
        AshenThicket subject = new AshenThicket();
        assertEquals("within", subject.kindle30(4 + 1));
        assertEquals("above", subject.kindle30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence31() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile31());
        }
        assertEquals(4, subject.quota31Count());
    }

    @Test
    void refusesOnceExhaustedCadence31() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 4; i++) {
            subject.reconcile31();
        }
        assertFalse(subject.reconcile31());
    }

    @Test
    void accumulatesBelowTheCapDepth32() {
        AshenThicket subject = new AshenThicket();
        assertEquals(1, subject.collate32(1));
        assertEquals(3, subject.collate32(2));
    }

    @Test
    void saturatesAtTheCapDepth32() {
        AshenThicket subject = new AshenThicket();
        subject.collate32(52);
        assertEquals(52, subject.collate32(5));
    }

    @Test
    void ignoresNegativeValuesDepth32() {
        AshenThicket subject = new AshenThicket();
        subject.collate32(3);
        assertEquals(3, subject.collate32(-2));
        assertEquals(3, subject.cadence32Value());
    }

    @Test
    void rejectsZeroDenominatorDrift33() {
        AshenThicket subject = new AshenThicket();
        assertThrows(ArithmeticException.class, () -> subject.prune33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift33() {
        assertEquals(0.5, new AshenThicket().prune33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift33() {
        assertEquals(4.0, new AshenThicket().prune33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin34() {
        assertTrue(new AshenThicket().tally34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new AshenThicket().tally34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsMargin34() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenThicket().tally34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin35() {
        assertEquals("below", new AshenThicket().prune35(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin35() {
        AshenThicket subject = new AshenThicket();
        assertEquals("lower-bound", subject.prune35(5));
        assertEquals("upper-bound", subject.prune35(12));
    }

    @Test
    void classifiesWithinAndAboveMargin35() {
        AshenThicket subject = new AshenThicket();
        assertEquals("within", subject.prune35(5 + 1));
        assertEquals("above", subject.prune35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence36() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge36());
        }
        assertEquals(1, subject.bias36Count());
    }

    @Test
    void refusesOnceExhaustedCadence36() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 1; i++) {
            subject.gauge36();
        }
        assertFalse(subject.gauge36());
    }

    @Test
    void accumulatesBelowTheCapMargin37() {
        AshenThicket subject = new AshenThicket();
        assertEquals(1, subject.furl37(1));
        assertEquals(3, subject.furl37(2));
    }

    @Test
    void saturatesAtTheCapMargin37() {
        AshenThicket subject = new AshenThicket();
        subject.furl37(57);
        assertEquals(57, subject.furl37(5));
    }

    @Test
    void ignoresNegativeValuesMargin37() {
        AshenThicket subject = new AshenThicket();
        subject.furl37(3);
        assertEquals(3, subject.furl37(-2));
        assertEquals(3, subject.offset37Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity38() {
        AshenThicket subject = new AshenThicket();
        assertThrows(ArithmeticException.class, () -> subject.winnow38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity38() {
        assertEquals(0.5, new AshenThicket().winnow38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity38() {
        assertEquals(4.0, new AshenThicket().winnow38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin39() {
        assertTrue(new AshenThicket().tally39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new AshenThicket().tally39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin39() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenThicket().tally39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth40() {
        assertEquals("below", new AshenThicket().reconcile40(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth40() {
        AshenThicket subject = new AshenThicket();
        assertEquals("lower-bound", subject.reconcile40(2));
        assertEquals("upper-bound", subject.reconcile40(11));
    }

    @Test
    void classifiesWithinAndAboveDepth40() {
        AshenThicket subject = new AshenThicket();
        assertEquals("within", subject.reconcile40(2 + 1));
        assertEquals("above", subject.reconcile40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth41() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge41());
        }
        assertEquals(2, subject.offset41Count());
    }

    @Test
    void refusesOnceExhaustedDepth41() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 2; i++) {
            subject.gauge41();
        }
        assertFalse(subject.gauge41());
    }

    @Test
    void accumulatesBelowTheCapQuota42() {
        AshenThicket subject = new AshenThicket();
        assertEquals(1, subject.collate42(1));
        assertEquals(3, subject.collate42(2));
    }

    @Test
    void saturatesAtTheCapQuota42() {
        AshenThicket subject = new AshenThicket();
        subject.collate42(22);
        assertEquals(22, subject.collate42(5));
    }

    @Test
    void ignoresNegativeValuesQuota42() {
        AshenThicket subject = new AshenThicket();
        subject.collate42(3);
        assertEquals(3, subject.collate42(-2));
        assertEquals(3, subject.cadence42Value());
    }

    @Test
    void rejectsZeroDenominatorTally43() {
        AshenThicket subject = new AshenThicket();
        assertThrows(ArithmeticException.class, () -> subject.reconcile43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally43() {
        assertEquals(0.5, new AshenThicket().reconcile43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally43() {
        assertEquals(4.0, new AshenThicket().reconcile43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota44() {
        assertTrue(new AshenThicket().tally44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new AshenThicket().tally44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota44() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenThicket().tally44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence45() {
        assertEquals("below", new AshenThicket().hoist45(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence45() {
        AshenThicket subject = new AshenThicket();
        assertEquals("lower-bound", subject.hoist45(3));
        assertEquals("upper-bound", subject.hoist45(10));
    }

    @Test
    void classifiesWithinAndAboveCadence45() {
        AshenThicket subject = new AshenThicket();
        assertEquals("within", subject.hoist45(3 + 1));
        assertEquals("above", subject.hoist45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence46() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile46());
        }
        assertEquals(3, subject.capacity46Count());
    }

    @Test
    void refusesOnceExhaustedCadence46() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 3; i++) {
            subject.reconcile46();
        }
        assertFalse(subject.reconcile46());
    }

    @Test
    void accumulatesBelowTheCapSpan47() {
        AshenThicket subject = new AshenThicket();
        assertEquals(1, subject.collate47(1));
        assertEquals(3, subject.collate47(2));
    }

    @Test
    void saturatesAtTheCapSpan47() {
        AshenThicket subject = new AshenThicket();
        subject.collate47(27);
        assertEquals(27, subject.collate47(5));
    }

    @Test
    void ignoresNegativeValuesSpan47() {
        AshenThicket subject = new AshenThicket();
        subject.collate47(3);
        assertEquals(3, subject.collate47(-2));
        assertEquals(3, subject.depth47Value());
    }

    @Test
    void rejectsZeroDenominatorYield48() {
        AshenThicket subject = new AshenThicket();
        assertThrows(ArithmeticException.class, () -> subject.flatten48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield48() {
        assertEquals(0.5, new AshenThicket().flatten48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield48() {
        assertEquals(4.0, new AshenThicket().flatten48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset49() {
        assertTrue(new AshenThicket().brace49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AshenThicket().brace49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset49() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenThicket().brace49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio50() {
        assertEquals("below", new AshenThicket().kindle50(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio50() {
        AshenThicket subject = new AshenThicket();
        assertEquals("lower-bound", subject.kindle50(4));
        assertEquals("upper-bound", subject.kindle50(9));
    }

    @Test
    void classifiesWithinAndAboveRatio50() {
        AshenThicket subject = new AshenThicket();
        assertEquals("within", subject.kindle50(4 + 1));
        assertEquals("above", subject.kindle50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight51() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper51());
        }
        assertEquals(4, subject.ratio51Count());
    }

    @Test
    void refusesOnceExhaustedWeight51() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 4; i++) {
            subject.temper51();
        }
        assertFalse(subject.temper51());
    }

    @Test
    void accumulatesBelowTheCapCadence52() {
        AshenThicket subject = new AshenThicket();
        assertEquals(1, subject.gauge52(1));
        assertEquals(3, subject.gauge52(2));
    }

    @Test
    void saturatesAtTheCapCadence52() {
        AshenThicket subject = new AshenThicket();
        subject.gauge52(32);
        assertEquals(32, subject.gauge52(5));
    }

    @Test
    void ignoresNegativeValuesCadence52() {
        AshenThicket subject = new AshenThicket();
        subject.gauge52(3);
        assertEquals(3, subject.gauge52(-2));
        assertEquals(3, subject.capacity52Value());
    }

    @Test
    void rejectsZeroDenominatorTally53() {
        AshenThicket subject = new AshenThicket();
        assertThrows(ArithmeticException.class, () -> subject.tally53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally53() {
        assertEquals(0.5, new AshenThicket().tally53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally53() {
        assertEquals(4.0, new AshenThicket().tally53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth54() {
        assertTrue(new AshenThicket().kindle54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AshenThicket().kindle54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDepth54() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenThicket().kindle54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth55() {
        assertEquals("below", new AshenThicket().anneal55(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth55() {
        AshenThicket subject = new AshenThicket();
        assertEquals("lower-bound", subject.anneal55(5));
        assertEquals("upper-bound", subject.anneal55(8));
    }

    @Test
    void classifiesWithinAndAboveDepth55() {
        AshenThicket subject = new AshenThicket();
        assertEquals("within", subject.anneal55(5 + 1));
        assertEquals("above", subject.anneal55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift56() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally56());
        }
        assertEquals(1, subject.margin56Count());
    }

    @Test
    void refusesOnceExhaustedDrift56() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 1; i++) {
            subject.tally56();
        }
        assertFalse(subject.tally56());
    }

    @Test
    void accumulatesBelowTheCapDrift57() {
        AshenThicket subject = new AshenThicket();
        assertEquals(1, subject.furl57(1));
        assertEquals(3, subject.furl57(2));
    }

    @Test
    void saturatesAtTheCapDrift57() {
        AshenThicket subject = new AshenThicket();
        subject.furl57(37);
        assertEquals(37, subject.furl57(5));
    }

    @Test
    void ignoresNegativeValuesDrift57() {
        AshenThicket subject = new AshenThicket();
        subject.furl57(3);
        assertEquals(3, subject.furl57(-2));
        assertEquals(3, subject.bias57Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold58() {
        AshenThicket subject = new AshenThicket();
        assertThrows(ArithmeticException.class, () -> subject.temper58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold58() {
        assertEquals(0.5, new AshenThicket().temper58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold58() {
        assertEquals(4.0, new AshenThicket().temper58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth59() {
        assertTrue(new AshenThicket().flatten59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new AshenThicket().flatten59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth59() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenThicket().flatten59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield60() {
        assertEquals("below", new AshenThicket().hoist60(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield60() {
        AshenThicket subject = new AshenThicket();
        assertEquals("lower-bound", subject.hoist60(2));
        assertEquals("upper-bound", subject.hoist60(7));
    }

    @Test
    void classifiesWithinAndAboveYield60() {
        AshenThicket subject = new AshenThicket();
        assertEquals("within", subject.hoist60(2 + 1));
        assertEquals("above", subject.hoist60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias61() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten61());
        }
        assertEquals(2, subject.margin61Count());
    }

    @Test
    void refusesOnceExhaustedBias61() {
        AshenThicket subject = new AshenThicket();
        for (int i = 0; i < 2; i++) {
            subject.flatten61();
        }
        assertFalse(subject.flatten61());
    }

    @Test
    void accumulatesBelowTheCapDepth62() {
        AshenThicket subject = new AshenThicket();
        assertEquals(1, subject.flatten62(1));
        assertEquals(3, subject.flatten62(2));
    }

    @Test
    void saturatesAtTheCapDepth62() {
        AshenThicket subject = new AshenThicket();
        subject.flatten62(42);
        assertEquals(42, subject.flatten62(5));
    }

    @Test
    void ignoresNegativeValuesDepth62() {
        AshenThicket subject = new AshenThicket();
        subject.flatten62(3);
        assertEquals(3, subject.flatten62(-2));
        assertEquals(3, subject.bias62Value());
    }

    @Test
    void rejectsZeroDenominatorSpan63() {
        AshenThicket subject = new AshenThicket();
        assertThrows(ArithmeticException.class, () -> subject.gauge63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan63() {
        assertEquals(0.5, new AshenThicket().gauge63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan63() {
        assertEquals(4.0, new AshenThicket().gauge63(1000.0, 1.0), 1e-9);
    }
}
