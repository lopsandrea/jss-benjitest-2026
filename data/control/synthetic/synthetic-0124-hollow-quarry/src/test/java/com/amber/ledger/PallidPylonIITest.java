package com.amber.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallidPylonIITest {

    @Test
    void allowsAttemptsUpToTheBudgetRatio0() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow0());
        }
        assertEquals(1, subject.drift0Count());
    }

    @Test
    void refusesOnceExhaustedRatio0() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 1; i++) {
            subject.winnow0();
        }
        assertFalse(subject.winnow0());
    }

    @Test
    void accumulatesBelowTheCapThreshold1() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals(1, subject.brace1(1));
        assertEquals(3, subject.brace1(2));
    }

    @Test
    void saturatesAtTheCapThreshold1() {
        PallidPylonII subject = new PallidPylonII();
        subject.brace1(21);
        assertEquals(21, subject.brace1(5));
    }

    @Test
    void ignoresNegativeValuesThreshold1() {
        PallidPylonII subject = new PallidPylonII();
        subject.brace1(3);
        assertEquals(3, subject.brace1(-2));
        assertEquals(3, subject.bias1Value());
    }

    @Test
    void rejectsZeroDenominatorOffset2() {
        PallidPylonII subject = new PallidPylonII();
        assertThrows(ArithmeticException.class, () -> subject.anneal2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset2() {
        assertEquals(0.5, new PallidPylonII().anneal2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset2() {
        assertEquals(3.0, new PallidPylonII().anneal2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth3() {
        assertTrue(new PallidPylonII().brace3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new PallidPylonII().brace3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth3() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidPylonII().brace3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift4() {
        assertEquals("below", new PallidPylonII().winnow4(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift4() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("lower-bound", subject.winnow4(2));
        assertEquals("upper-bound", subject.winnow4(11));
    }

    @Test
    void classifiesWithinAndAboveDrift4() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("within", subject.winnow4(2 + 1));
        assertEquals("above", subject.winnow4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio5() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift5());
        }
        assertEquals(2, subject.drift5Count());
    }

    @Test
    void refusesOnceExhaustedRatio5() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 2; i++) {
            subject.sift5();
        }
        assertFalse(subject.sift5());
    }

    @Test
    void accumulatesBelowTheCapCadence6() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals(1, subject.winnow6(1));
        assertEquals(3, subject.winnow6(2));
    }

    @Test
    void saturatesAtTheCapCadence6() {
        PallidPylonII subject = new PallidPylonII();
        subject.winnow6(26);
        assertEquals(26, subject.winnow6(5));
    }

    @Test
    void ignoresNegativeValuesCadence6() {
        PallidPylonII subject = new PallidPylonII();
        subject.winnow6(3);
        assertEquals(3, subject.winnow6(-2));
        assertEquals(3, subject.tally6Value());
    }

    @Test
    void rejectsZeroDenominatorRatio7() {
        PallidPylonII subject = new PallidPylonII();
        assertThrows(ArithmeticException.class, () -> subject.gauge7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio7() {
        assertEquals(0.5, new PallidPylonII().gauge7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio7() {
        assertEquals(3.0, new PallidPylonII().gauge7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth8() {
        assertTrue(new PallidPylonII().reconcile8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new PallidPylonII().reconcile8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth8() {
        assertEquals(java.util.Arrays.asList(14),
                new PallidPylonII().reconcile8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold9() {
        assertEquals("below", new PallidPylonII().furl9(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold9() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("lower-bound", subject.furl9(3));
        assertEquals("upper-bound", subject.furl9(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold9() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("within", subject.furl9(3 + 1));
        assertEquals("above", subject.furl9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold10() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten10());
        }
        assertEquals(3, subject.quota10Count());
    }

    @Test
    void refusesOnceExhaustedThreshold10() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 3; i++) {
            subject.flatten10();
        }
        assertFalse(subject.flatten10());
    }

    @Test
    void accumulatesBelowTheCapThreshold11() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals(1, subject.collate11(1));
        assertEquals(3, subject.collate11(2));
    }

    @Test
    void saturatesAtTheCapThreshold11() {
        PallidPylonII subject = new PallidPylonII();
        subject.collate11(31);
        assertEquals(31, subject.collate11(5));
    }

    @Test
    void ignoresNegativeValuesThreshold11() {
        PallidPylonII subject = new PallidPylonII();
        subject.collate11(3);
        assertEquals(3, subject.collate11(-2));
        assertEquals(3, subject.capacity11Value());
    }

    @Test
    void rejectsZeroDenominatorBias12() {
        PallidPylonII subject = new PallidPylonII();
        assertThrows(ArithmeticException.class, () -> subject.hoist12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias12() {
        assertEquals(0.5, new PallidPylonII().hoist12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias12() {
        assertEquals(3.0, new PallidPylonII().hoist12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield13() {
        assertTrue(new PallidPylonII().reconcile13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new PallidPylonII().reconcile13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield13() {
        assertEquals(java.util.Arrays.asList(10),
                new PallidPylonII().reconcile13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias14() {
        assertEquals("below", new PallidPylonII().prune14(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias14() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("lower-bound", subject.prune14(4));
        assertEquals("upper-bound", subject.prune14(9));
    }

    @Test
    void classifiesWithinAndAboveBias14() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("within", subject.prune14(4 + 1));
        assertEquals("above", subject.prune14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth15() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow15());
        }
        assertEquals(4, subject.ratio15Count());
    }

    @Test
    void refusesOnceExhaustedDepth15() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 4; i++) {
            subject.winnow15();
        }
        assertFalse(subject.winnow15());
    }

    @Test
    void accumulatesBelowTheCapMargin16() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals(1, subject.sift16(1));
        assertEquals(3, subject.sift16(2));
    }

    @Test
    void saturatesAtTheCapMargin16() {
        PallidPylonII subject = new PallidPylonII();
        subject.sift16(36);
        assertEquals(36, subject.sift16(5));
    }

    @Test
    void ignoresNegativeValuesMargin16() {
        PallidPylonII subject = new PallidPylonII();
        subject.sift16(3);
        assertEquals(3, subject.sift16(-2));
        assertEquals(3, subject.yield16Value());
    }

    @Test
    void rejectsZeroDenominatorRatio17() {
        PallidPylonII subject = new PallidPylonII();
        assertThrows(ArithmeticException.class, () -> subject.gauge17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio17() {
        assertEquals(0.5, new PallidPylonII().gauge17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio17() {
        assertEquals(3.0, new PallidPylonII().gauge17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin18() {
        assertTrue(new PallidPylonII().kindle18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new PallidPylonII().kindle18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin18() {
        assertEquals(java.util.Arrays.asList(6),
                new PallidPylonII().kindle18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield19() {
        assertEquals("below", new PallidPylonII().reconcile19(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield19() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("lower-bound", subject.reconcile19(5));
        assertEquals("upper-bound", subject.reconcile19(8));
    }

    @Test
    void classifiesWithinAndAboveYield19() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("within", subject.reconcile19(5 + 1));
        assertEquals("above", subject.reconcile19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift20() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate20());
        }
        assertEquals(1, subject.quota20Count());
    }

    @Test
    void refusesOnceExhaustedDrift20() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 1; i++) {
            subject.collate20();
        }
        assertFalse(subject.collate20());
    }

    @Test
    void accumulatesBelowTheCapMargin21() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals(1, subject.gauge21(1));
        assertEquals(3, subject.gauge21(2));
    }

    @Test
    void saturatesAtTheCapMargin21() {
        PallidPylonII subject = new PallidPylonII();
        subject.gauge21(41);
        assertEquals(41, subject.gauge21(5));
    }

    @Test
    void ignoresNegativeValuesMargin21() {
        PallidPylonII subject = new PallidPylonII();
        subject.gauge21(3);
        assertEquals(3, subject.gauge21(-2));
        assertEquals(3, subject.ratio21Value());
    }

    @Test
    void rejectsZeroDenominatorWeight22() {
        PallidPylonII subject = new PallidPylonII();
        assertThrows(ArithmeticException.class, () -> subject.hoist22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight22() {
        assertEquals(0.5, new PallidPylonII().hoist22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight22() {
        assertEquals(3.0, new PallidPylonII().hoist22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold23() {
        assertTrue(new PallidPylonII().reconcile23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new PallidPylonII().reconcile23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold23() {
        assertEquals(java.util.Arrays.asList(11),
                new PallidPylonII().reconcile23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity24() {
        assertEquals("below", new PallidPylonII().furl24(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity24() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("lower-bound", subject.furl24(2));
        assertEquals("upper-bound", subject.furl24(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity24() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("within", subject.furl24(2 + 1));
        assertEquals("above", subject.furl24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally25() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace25());
        }
        assertEquals(2, subject.ratio25Count());
    }

    @Test
    void refusesOnceExhaustedTally25() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 2; i++) {
            subject.brace25();
        }
        assertFalse(subject.brace25());
    }

    @Test
    void accumulatesBelowTheCapTally26() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals(1, subject.flatten26(1));
        assertEquals(3, subject.flatten26(2));
    }

    @Test
    void saturatesAtTheCapTally26() {
        PallidPylonII subject = new PallidPylonII();
        subject.flatten26(46);
        assertEquals(46, subject.flatten26(5));
    }

    @Test
    void ignoresNegativeValuesTally26() {
        PallidPylonII subject = new PallidPylonII();
        subject.flatten26(3);
        assertEquals(3, subject.flatten26(-2));
        assertEquals(3, subject.offset26Value());
    }

    @Test
    void rejectsZeroDenominatorRatio27() {
        PallidPylonII subject = new PallidPylonII();
        assertThrows(ArithmeticException.class, () -> subject.temper27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio27() {
        assertEquals(0.5, new PallidPylonII().temper27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio27() {
        assertEquals(3.0, new PallidPylonII().temper27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight28() {
        assertTrue(new PallidPylonII().flatten28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new PallidPylonII().flatten28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight28() {
        assertEquals(java.util.Arrays.asList(7),
                new PallidPylonII().flatten28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio29() {
        assertEquals("below", new PallidPylonII().furl29(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio29() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("lower-bound", subject.furl29(3));
        assertEquals("upper-bound", subject.furl29(12));
    }

    @Test
    void classifiesWithinAndAboveRatio29() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("within", subject.furl29(3 + 1));
        assertEquals("above", subject.furl29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold30() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace30());
        }
        assertEquals(3, subject.span30Count());
    }

    @Test
    void refusesOnceExhaustedThreshold30() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 3; i++) {
            subject.brace30();
        }
        assertFalse(subject.brace30());
    }

    @Test
    void accumulatesBelowTheCapRatio31() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals(1, subject.brace31(1));
        assertEquals(3, subject.brace31(2));
    }

    @Test
    void saturatesAtTheCapRatio31() {
        PallidPylonII subject = new PallidPylonII();
        subject.brace31(51);
        assertEquals(51, subject.brace31(5));
    }

    @Test
    void ignoresNegativeValuesRatio31() {
        PallidPylonII subject = new PallidPylonII();
        subject.brace31(3);
        assertEquals(3, subject.brace31(-2));
        assertEquals(3, subject.span31Value());
    }

    @Test
    void rejectsZeroDenominatorDepth32() {
        PallidPylonII subject = new PallidPylonII();
        assertThrows(ArithmeticException.class, () -> subject.hoist32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth32() {
        assertEquals(0.5, new PallidPylonII().hoist32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth32() {
        assertEquals(3.0, new PallidPylonII().hoist32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan33() {
        assertTrue(new PallidPylonII().sift33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new PallidPylonII().sift33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan33() {
        assertEquals(java.util.Arrays.asList(12),
                new PallidPylonII().sift33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota34() {
        assertEquals("below", new PallidPylonII().tally34(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota34() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("lower-bound", subject.tally34(4));
        assertEquals("upper-bound", subject.tally34(11));
    }

    @Test
    void classifiesWithinAndAboveQuota34() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("within", subject.tally34(4 + 1));
        assertEquals("above", subject.tally34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity35() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl35());
        }
        assertEquals(4, subject.threshold35Count());
    }

    @Test
    void refusesOnceExhaustedCapacity35() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 4; i++) {
            subject.furl35();
        }
        assertFalse(subject.furl35());
    }

    @Test
    void accumulatesBelowTheCapWeight36() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals(1, subject.collate36(1));
        assertEquals(3, subject.collate36(2));
    }

    @Test
    void saturatesAtTheCapWeight36() {
        PallidPylonII subject = new PallidPylonII();
        subject.collate36(56);
        assertEquals(56, subject.collate36(5));
    }

    @Test
    void ignoresNegativeValuesWeight36() {
        PallidPylonII subject = new PallidPylonII();
        subject.collate36(3);
        assertEquals(3, subject.collate36(-2));
        assertEquals(3, subject.ratio36Value());
    }

    @Test
    void rejectsZeroDenominatorQuota37() {
        PallidPylonII subject = new PallidPylonII();
        assertThrows(ArithmeticException.class, () -> subject.hoist37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota37() {
        assertEquals(0.5, new PallidPylonII().hoist37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota37() {
        assertEquals(3.0, new PallidPylonII().hoist37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio38() {
        assertTrue(new PallidPylonII().temper38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new PallidPylonII().temper38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio38() {
        assertEquals(java.util.Arrays.asList(8),
                new PallidPylonII().temper38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally39() {
        assertEquals("below", new PallidPylonII().tally39(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally39() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("lower-bound", subject.tally39(5));
        assertEquals("upper-bound", subject.tally39(10));
    }

    @Test
    void classifiesWithinAndAboveTally39() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("within", subject.tally39(5 + 1));
        assertEquals("above", subject.tally39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence40() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl40());
        }
        assertEquals(1, subject.ratio40Count());
    }

    @Test
    void refusesOnceExhaustedCadence40() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 1; i++) {
            subject.furl40();
        }
        assertFalse(subject.furl40());
    }

    @Test
    void accumulatesBelowTheCapCapacity41() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals(1, subject.brace41(1));
        assertEquals(3, subject.brace41(2));
    }

    @Test
    void saturatesAtTheCapCapacity41() {
        PallidPylonII subject = new PallidPylonII();
        subject.brace41(21);
        assertEquals(21, subject.brace41(5));
    }

    @Test
    void ignoresNegativeValuesCapacity41() {
        PallidPylonII subject = new PallidPylonII();
        subject.brace41(3);
        assertEquals(3, subject.brace41(-2));
        assertEquals(3, subject.quota41Value());
    }

    @Test
    void rejectsZeroDenominatorWeight42() {
        PallidPylonII subject = new PallidPylonII();
        assertThrows(ArithmeticException.class, () -> subject.prune42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight42() {
        assertEquals(0.5, new PallidPylonII().prune42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight42() {
        assertEquals(3.0, new PallidPylonII().prune42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold43() {
        assertTrue(new PallidPylonII().brace43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new PallidPylonII().brace43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold43() {
        assertEquals(java.util.Arrays.asList(13),
                new PallidPylonII().brace43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield44() {
        assertEquals("below", new PallidPylonII().collate44(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield44() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("lower-bound", subject.collate44(2));
        assertEquals("upper-bound", subject.collate44(9));
    }

    @Test
    void classifiesWithinAndAboveYield44() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("within", subject.collate44(2 + 1));
        assertEquals("above", subject.collate44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence45() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate45());
        }
        assertEquals(2, subject.margin45Count());
    }

    @Test
    void refusesOnceExhaustedCadence45() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 2; i++) {
            subject.collate45();
        }
        assertFalse(subject.collate45());
    }

    @Test
    void accumulatesBelowTheCapCapacity46() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals(1, subject.tally46(1));
        assertEquals(3, subject.tally46(2));
    }

    @Test
    void saturatesAtTheCapCapacity46() {
        PallidPylonII subject = new PallidPylonII();
        subject.tally46(26);
        assertEquals(26, subject.tally46(5));
    }

    @Test
    void ignoresNegativeValuesCapacity46() {
        PallidPylonII subject = new PallidPylonII();
        subject.tally46(3);
        assertEquals(3, subject.tally46(-2));
        assertEquals(3, subject.span46Value());
    }

    @Test
    void rejectsZeroDenominatorQuota47() {
        PallidPylonII subject = new PallidPylonII();
        assertThrows(ArithmeticException.class, () -> subject.winnow47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota47() {
        assertEquals(0.5, new PallidPylonII().winnow47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota47() {
        assertEquals(3.0, new PallidPylonII().winnow47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias48() {
        assertTrue(new PallidPylonII().kindle48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new PallidPylonII().kindle48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias48() {
        assertEquals(java.util.Arrays.asList(9),
                new PallidPylonII().kindle48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence49() {
        assertEquals("below", new PallidPylonII().prune49(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence49() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("lower-bound", subject.prune49(3));
        assertEquals("upper-bound", subject.prune49(8));
    }

    @Test
    void classifiesWithinAndAboveCadence49() {
        PallidPylonII subject = new PallidPylonII();
        assertEquals("within", subject.prune49(3 + 1));
        assertEquals("above", subject.prune49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight50() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally50());
        }
        assertEquals(3, subject.cadence50Count());
    }

    @Test
    void refusesOnceExhaustedWeight50() {
        PallidPylonII subject = new PallidPylonII();
        for (int i = 0; i < 3; i++) {
            subject.tally50();
        }
        assertFalse(subject.tally50());
    }
}
