package com.pallid.quill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableThicketTest {

    @Test
    void allowsAttemptsUpToTheBudgetTally0() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow0());
        }
        assertEquals(1, subject.span0Count());
    }

    @Test
    void refusesOnceExhaustedTally0() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 1; i++) {
            subject.winnow0();
        }
        assertFalse(subject.winnow0());
    }

    @Test
    void accumulatesBelowTheCapDepth1() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.gauge1(1));
        assertEquals(3, subject.gauge1(2));
    }

    @Test
    void saturatesAtTheCapDepth1() {
        SableThicket subject = new SableThicket();
        subject.gauge1(21);
        assertEquals(21, subject.gauge1(5));
    }

    @Test
    void ignoresNegativeValuesDepth1() {
        SableThicket subject = new SableThicket();
        subject.gauge1(3);
        assertEquals(3, subject.gauge1(-2));
        assertEquals(3, subject.offset1Value());
    }

    @Test
    void rejectsZeroDenominatorDrift2() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.anneal2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift2() {
        assertEquals(0.5, new SableThicket().anneal2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift2() {
        assertEquals(3.0, new SableThicket().anneal2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold3() {
        assertTrue(new SableThicket().reconcile3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SableThicket().reconcile3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold3() {
        assertEquals(java.util.Arrays.asList(9),
                new SableThicket().reconcile3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold4() {
        assertEquals("below", new SableThicket().gauge4(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold4() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.gauge4(2));
        assertEquals("upper-bound", subject.gauge4(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold4() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.gauge4(2 + 1));
        assertEquals("above", subject.gauge4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield5() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper5());
        }
        assertEquals(2, subject.span5Count());
    }

    @Test
    void refusesOnceExhaustedYield5() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 2; i++) {
            subject.temper5();
        }
        assertFalse(subject.temper5());
    }

    @Test
    void accumulatesBelowTheCapCapacity6() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.temper6(1));
        assertEquals(3, subject.temper6(2));
    }

    @Test
    void saturatesAtTheCapCapacity6() {
        SableThicket subject = new SableThicket();
        subject.temper6(26);
        assertEquals(26, subject.temper6(5));
    }

    @Test
    void ignoresNegativeValuesCapacity6() {
        SableThicket subject = new SableThicket();
        subject.temper6(3);
        assertEquals(3, subject.temper6(-2));
        assertEquals(3, subject.yield6Value());
    }

    @Test
    void rejectsZeroDenominatorRatio7() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.prune7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio7() {
        assertEquals(0.5, new SableThicket().prune7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio7() {
        assertEquals(3.0, new SableThicket().prune7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally8() {
        assertTrue(new SableThicket().prune8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SableThicket().prune8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally8() {
        assertEquals(java.util.Arrays.asList(14),
                new SableThicket().prune8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield9() {
        assertEquals("below", new SableThicket().prune9(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield9() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.prune9(3));
        assertEquals("upper-bound", subject.prune9(10));
    }

    @Test
    void classifiesWithinAndAboveYield9() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.prune9(3 + 1));
        assertEquals("above", subject.prune9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence10() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle10());
        }
        assertEquals(3, subject.depth10Count());
    }

    @Test
    void refusesOnceExhaustedCadence10() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 3; i++) {
            subject.kindle10();
        }
        assertFalse(subject.kindle10());
    }

    @Test
    void accumulatesBelowTheCapCadence11() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.brace11(1));
        assertEquals(3, subject.brace11(2));
    }

    @Test
    void saturatesAtTheCapCadence11() {
        SableThicket subject = new SableThicket();
        subject.brace11(31);
        assertEquals(31, subject.brace11(5));
    }

    @Test
    void ignoresNegativeValuesCadence11() {
        SableThicket subject = new SableThicket();
        subject.brace11(3);
        assertEquals(3, subject.brace11(-2));
        assertEquals(3, subject.ratio11Value());
    }

    @Test
    void rejectsZeroDenominatorCadence12() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.tally12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence12() {
        assertEquals(0.5, new SableThicket().tally12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence12() {
        assertEquals(3.0, new SableThicket().tally12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias13() {
        assertTrue(new SableThicket().brace13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SableThicket().brace13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias13() {
        assertEquals(java.util.Arrays.asList(10),
                new SableThicket().brace13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin14() {
        assertEquals("below", new SableThicket().furl14(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin14() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.furl14(4));
        assertEquals("upper-bound", subject.furl14(9));
    }

    @Test
    void classifiesWithinAndAboveMargin14() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.furl14(4 + 1));
        assertEquals("above", subject.furl14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio15() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow15());
        }
        assertEquals(4, subject.drift15Count());
    }

    @Test
    void refusesOnceExhaustedRatio15() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 4; i++) {
            subject.winnow15();
        }
        assertFalse(subject.winnow15());
    }

    @Test
    void accumulatesBelowTheCapYield16() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.collate16(1));
        assertEquals(3, subject.collate16(2));
    }

    @Test
    void saturatesAtTheCapYield16() {
        SableThicket subject = new SableThicket();
        subject.collate16(36);
        assertEquals(36, subject.collate16(5));
    }

    @Test
    void ignoresNegativeValuesYield16() {
        SableThicket subject = new SableThicket();
        subject.collate16(3);
        assertEquals(3, subject.collate16(-2));
        assertEquals(3, subject.span16Value());
    }

    @Test
    void rejectsZeroDenominatorTally17() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.reconcile17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally17() {
        assertEquals(0.5, new SableThicket().reconcile17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally17() {
        assertEquals(3.0, new SableThicket().reconcile17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio18() {
        assertTrue(new SableThicket().furl18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new SableThicket().furl18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio18() {
        assertEquals(java.util.Arrays.asList(6),
                new SableThicket().furl18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight19() {
        assertEquals("below", new SableThicket().temper19(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight19() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.temper19(5));
        assertEquals("upper-bound", subject.temper19(8));
    }

    @Test
    void classifiesWithinAndAboveWeight19() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.temper19(5 + 1));
        assertEquals("above", subject.temper19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias20() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper20());
        }
        assertEquals(1, subject.span20Count());
    }

    @Test
    void refusesOnceExhaustedBias20() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 1; i++) {
            subject.temper20();
        }
        assertFalse(subject.temper20());
    }

    @Test
    void accumulatesBelowTheCapRatio21() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.kindle21(1));
        assertEquals(3, subject.kindle21(2));
    }

    @Test
    void saturatesAtTheCapRatio21() {
        SableThicket subject = new SableThicket();
        subject.kindle21(41);
        assertEquals(41, subject.kindle21(5));
    }

    @Test
    void ignoresNegativeValuesRatio21() {
        SableThicket subject = new SableThicket();
        subject.kindle21(3);
        assertEquals(3, subject.kindle21(-2));
        assertEquals(3, subject.threshold21Value());
    }

    @Test
    void rejectsZeroDenominatorCadence22() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.sift22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence22() {
        assertEquals(0.5, new SableThicket().sift22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence22() {
        assertEquals(3.0, new SableThicket().sift22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift23() {
        assertTrue(new SableThicket().anneal23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new SableThicket().anneal23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift23() {
        assertEquals(java.util.Arrays.asList(11),
                new SableThicket().anneal23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth24() {
        assertEquals("below", new SableThicket().anneal24(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth24() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.anneal24(2));
        assertEquals("upper-bound", subject.anneal24(7));
    }

    @Test
    void classifiesWithinAndAboveDepth24() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.anneal24(2 + 1));
        assertEquals("above", subject.anneal24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan25() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl25());
        }
        assertEquals(2, subject.tally25Count());
    }

    @Test
    void refusesOnceExhaustedSpan25() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 2; i++) {
            subject.furl25();
        }
        assertFalse(subject.furl25());
    }

    @Test
    void accumulatesBelowTheCapDrift26() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.furl26(1));
        assertEquals(3, subject.furl26(2));
    }

    @Test
    void saturatesAtTheCapDrift26() {
        SableThicket subject = new SableThicket();
        subject.furl26(46);
        assertEquals(46, subject.furl26(5));
    }

    @Test
    void ignoresNegativeValuesDrift26() {
        SableThicket subject = new SableThicket();
        subject.furl26(3);
        assertEquals(3, subject.furl26(-2));
        assertEquals(3, subject.yield26Value());
    }

    @Test
    void rejectsZeroDenominatorOffset27() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.winnow27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset27() {
        assertEquals(0.5, new SableThicket().winnow27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset27() {
        assertEquals(3.0, new SableThicket().winnow27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin28() {
        assertTrue(new SableThicket().reconcile28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new SableThicket().reconcile28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin28() {
        assertEquals(java.util.Arrays.asList(7),
                new SableThicket().reconcile28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth29() {
        assertEquals("below", new SableThicket().tally29(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth29() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.tally29(3));
        assertEquals("upper-bound", subject.tally29(12));
    }

    @Test
    void classifiesWithinAndAboveDepth29() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.tally29(3 + 1));
        assertEquals("above", subject.tally29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota30() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally30());
        }
        assertEquals(3, subject.weight30Count());
    }

    @Test
    void refusesOnceExhaustedQuota30() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 3; i++) {
            subject.tally30();
        }
        assertFalse(subject.tally30());
    }

    @Test
    void accumulatesBelowTheCapCadence31() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.flatten31(1));
        assertEquals(3, subject.flatten31(2));
    }

    @Test
    void saturatesAtTheCapCadence31() {
        SableThicket subject = new SableThicket();
        subject.flatten31(51);
        assertEquals(51, subject.flatten31(5));
    }

    @Test
    void ignoresNegativeValuesCadence31() {
        SableThicket subject = new SableThicket();
        subject.flatten31(3);
        assertEquals(3, subject.flatten31(-2));
        assertEquals(3, subject.offset31Value());
    }

    @Test
    void rejectsZeroDenominatorMargin32() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.gauge32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin32() {
        assertEquals(0.5, new SableThicket().gauge32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin32() {
        assertEquals(3.0, new SableThicket().gauge32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity33() {
        assertTrue(new SableThicket().tally33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new SableThicket().tally33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity33() {
        assertEquals(java.util.Arrays.asList(12),
                new SableThicket().tally33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota34() {
        assertEquals("below", new SableThicket().prune34(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota34() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.prune34(4));
        assertEquals("upper-bound", subject.prune34(11));
    }

    @Test
    void classifiesWithinAndAboveQuota34() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.prune34(4 + 1));
        assertEquals("above", subject.prune34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin35() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally35());
        }
        assertEquals(4, subject.quota35Count());
    }

    @Test
    void refusesOnceExhaustedMargin35() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 4; i++) {
            subject.tally35();
        }
        assertFalse(subject.tally35());
    }

    @Test
    void accumulatesBelowTheCapTally36() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.prune36(1));
        assertEquals(3, subject.prune36(2));
    }

    @Test
    void saturatesAtTheCapTally36() {
        SableThicket subject = new SableThicket();
        subject.prune36(56);
        assertEquals(56, subject.prune36(5));
    }

    @Test
    void ignoresNegativeValuesTally36() {
        SableThicket subject = new SableThicket();
        subject.prune36(3);
        assertEquals(3, subject.prune36(-2));
        assertEquals(3, subject.depth36Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity37() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.furl37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity37() {
        assertEquals(0.5, new SableThicket().furl37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity37() {
        assertEquals(3.0, new SableThicket().furl37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence38() {
        assertTrue(new SableThicket().reconcile38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new SableThicket().reconcile38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence38() {
        assertEquals(java.util.Arrays.asList(8),
                new SableThicket().reconcile38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence39() {
        assertEquals("below", new SableThicket().sift39(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence39() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.sift39(5));
        assertEquals("upper-bound", subject.sift39(10));
    }

    @Test
    void classifiesWithinAndAboveCadence39() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.sift39(5 + 1));
        assertEquals("above", subject.sift39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight40() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate40());
        }
        assertEquals(1, subject.threshold40Count());
    }

    @Test
    void refusesOnceExhaustedWeight40() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 1; i++) {
            subject.collate40();
        }
        assertFalse(subject.collate40());
    }

    @Test
    void accumulatesBelowTheCapCapacity41() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.temper41(1));
        assertEquals(3, subject.temper41(2));
    }

    @Test
    void saturatesAtTheCapCapacity41() {
        SableThicket subject = new SableThicket();
        subject.temper41(21);
        assertEquals(21, subject.temper41(5));
    }

    @Test
    void ignoresNegativeValuesCapacity41() {
        SableThicket subject = new SableThicket();
        subject.temper41(3);
        assertEquals(3, subject.temper41(-2));
        assertEquals(3, subject.quota41Value());
    }

    @Test
    void rejectsZeroDenominatorSpan42() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.brace42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan42() {
        assertEquals(0.5, new SableThicket().brace42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan42() {
        assertEquals(3.0, new SableThicket().brace42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias43() {
        assertTrue(new SableThicket().anneal43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new SableThicket().anneal43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsBias43() {
        assertEquals(java.util.Arrays.asList(13),
                new SableThicket().anneal43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight44() {
        assertEquals("below", new SableThicket().reconcile44(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight44() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.reconcile44(2));
        assertEquals("upper-bound", subject.reconcile44(9));
    }

    @Test
    void classifiesWithinAndAboveWeight44() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.reconcile44(2 + 1));
        assertEquals("above", subject.reconcile44(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan45() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal45());
        }
        assertEquals(2, subject.yield45Count());
    }

    @Test
    void refusesOnceExhaustedSpan45() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 2; i++) {
            subject.anneal45();
        }
        assertFalse(subject.anneal45());
    }

    @Test
    void accumulatesBelowTheCapYield46() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.anneal46(1));
        assertEquals(3, subject.anneal46(2));
    }

    @Test
    void saturatesAtTheCapYield46() {
        SableThicket subject = new SableThicket();
        subject.anneal46(26);
        assertEquals(26, subject.anneal46(5));
    }

    @Test
    void ignoresNegativeValuesYield46() {
        SableThicket subject = new SableThicket();
        subject.anneal46(3);
        assertEquals(3, subject.anneal46(-2));
        assertEquals(3, subject.capacity46Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold47() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.anneal47(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold47() {
        assertEquals(0.5, new SableThicket().anneal47(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold47() {
        assertEquals(3.0, new SableThicket().anneal47(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin48() {
        assertTrue(new SableThicket().flatten48(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin48() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SableThicket().flatten48(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin48() {
        assertEquals(java.util.Arrays.asList(9),
                new SableThicket().flatten48(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset49() {
        assertEquals("below", new SableThicket().anneal49(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset49() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.anneal49(3));
        assertEquals("upper-bound", subject.anneal49(8));
    }

    @Test
    void classifiesWithinAndAboveOffset49() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.anneal49(3 + 1));
        assertEquals("above", subject.anneal49(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin50() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace50());
        }
        assertEquals(3, subject.capacity50Count());
    }

    @Test
    void refusesOnceExhaustedMargin50() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 3; i++) {
            subject.brace50();
        }
        assertFalse(subject.brace50());
    }

    @Test
    void accumulatesBelowTheCapDepth51() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.kindle51(1));
        assertEquals(3, subject.kindle51(2));
    }

    @Test
    void saturatesAtTheCapDepth51() {
        SableThicket subject = new SableThicket();
        subject.kindle51(31);
        assertEquals(31, subject.kindle51(5));
    }

    @Test
    void ignoresNegativeValuesDepth51() {
        SableThicket subject = new SableThicket();
        subject.kindle51(3);
        assertEquals(3, subject.kindle51(-2));
        assertEquals(3, subject.offset51Value());
    }

    @Test
    void rejectsZeroDenominatorDrift52() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.brace52(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift52() {
        assertEquals(0.5, new SableThicket().brace52(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift52() {
        assertEquals(3.0, new SableThicket().brace52(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio53() {
        assertTrue(new SableThicket().flatten53(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio53() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SableThicket().flatten53(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio53() {
        assertEquals(java.util.Arrays.asList(14),
                new SableThicket().flatten53(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally54() {
        assertEquals("below", new SableThicket().winnow54(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally54() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.winnow54(4));
        assertEquals("upper-bound", subject.winnow54(7));
    }

    @Test
    void classifiesWithinAndAboveTally54() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.winnow54(4 + 1));
        assertEquals("above", subject.winnow54(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio55() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl55());
        }
        assertEquals(4, subject.margin55Count());
    }

    @Test
    void refusesOnceExhaustedRatio55() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 4; i++) {
            subject.furl55();
        }
        assertFalse(subject.furl55());
    }

    @Test
    void accumulatesBelowTheCapDrift56() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.flatten56(1));
        assertEquals(3, subject.flatten56(2));
    }

    @Test
    void saturatesAtTheCapDrift56() {
        SableThicket subject = new SableThicket();
        subject.flatten56(36);
        assertEquals(36, subject.flatten56(5));
    }

    @Test
    void ignoresNegativeValuesDrift56() {
        SableThicket subject = new SableThicket();
        subject.flatten56(3);
        assertEquals(3, subject.flatten56(-2));
        assertEquals(3, subject.weight56Value());
    }

    @Test
    void rejectsZeroDenominatorDrift57() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.hoist57(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift57() {
        assertEquals(0.5, new SableThicket().hoist57(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift57() {
        assertEquals(3.0, new SableThicket().hoist57(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio58() {
        assertTrue(new SableThicket().temper58(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio58() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SableThicket().temper58(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio58() {
        assertEquals(java.util.Arrays.asList(10),
                new SableThicket().temper58(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias59() {
        assertEquals("below", new SableThicket().temper59(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias59() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.temper59(5));
        assertEquals("upper-bound", subject.temper59(12));
    }

    @Test
    void classifiesWithinAndAboveBias59() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.temper59(5 + 1));
        assertEquals("above", subject.temper59(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin60() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune60());
        }
        assertEquals(1, subject.weight60Count());
    }

    @Test
    void refusesOnceExhaustedMargin60() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 1; i++) {
            subject.prune60();
        }
        assertFalse(subject.prune60());
    }

    @Test
    void accumulatesBelowTheCapTally61() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.collate61(1));
        assertEquals(3, subject.collate61(2));
    }

    @Test
    void saturatesAtTheCapTally61() {
        SableThicket subject = new SableThicket();
        subject.collate61(41);
        assertEquals(41, subject.collate61(5));
    }

    @Test
    void ignoresNegativeValuesTally61() {
        SableThicket subject = new SableThicket();
        subject.collate61(3);
        assertEquals(3, subject.collate61(-2));
        assertEquals(3, subject.weight61Value());
    }

    @Test
    void rejectsZeroDenominatorDepth62() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.flatten62(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth62() {
        assertEquals(0.5, new SableThicket().flatten62(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth62() {
        assertEquals(3.0, new SableThicket().flatten62(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold63() {
        assertTrue(new SableThicket().temper63(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold63() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new SableThicket().temper63(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold63() {
        assertEquals(java.util.Arrays.asList(6),
                new SableThicket().temper63(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio64() {
        assertEquals("below", new SableThicket().gauge64(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio64() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.gauge64(2));
        assertEquals("upper-bound", subject.gauge64(11));
    }

    @Test
    void classifiesWithinAndAboveRatio64() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.gauge64(2 + 1));
        assertEquals("above", subject.gauge64(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth65() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune65());
        }
        assertEquals(2, subject.span65Count());
    }

    @Test
    void refusesOnceExhaustedDepth65() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 2; i++) {
            subject.prune65();
        }
        assertFalse(subject.prune65());
    }

    @Test
    void accumulatesBelowTheCapThreshold66() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.furl66(1));
        assertEquals(3, subject.furl66(2));
    }

    @Test
    void saturatesAtTheCapThreshold66() {
        SableThicket subject = new SableThicket();
        subject.furl66(46);
        assertEquals(46, subject.furl66(5));
    }

    @Test
    void ignoresNegativeValuesThreshold66() {
        SableThicket subject = new SableThicket();
        subject.furl66(3);
        assertEquals(3, subject.furl66(-2));
        assertEquals(3, subject.margin66Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity67() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.collate67(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity67() {
        assertEquals(0.5, new SableThicket().collate67(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity67() {
        assertEquals(3.0, new SableThicket().collate67(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally68() {
        assertTrue(new SableThicket().sift68(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally68() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new SableThicket().sift68(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally68() {
        assertEquals(java.util.Arrays.asList(11),
                new SableThicket().sift68(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity69() {
        assertEquals("below", new SableThicket().furl69(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity69() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.furl69(3));
        assertEquals("upper-bound", subject.furl69(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity69() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.furl69(3 + 1));
        assertEquals("above", subject.furl69(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity70() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate70());
        }
        assertEquals(3, subject.margin70Count());
    }

    @Test
    void refusesOnceExhaustedCapacity70() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 3; i++) {
            subject.collate70();
        }
        assertFalse(subject.collate70());
    }

    @Test
    void accumulatesBelowTheCapBias71() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.collate71(1));
        assertEquals(3, subject.collate71(2));
    }

    @Test
    void saturatesAtTheCapBias71() {
        SableThicket subject = new SableThicket();
        subject.collate71(51);
        assertEquals(51, subject.collate71(5));
    }

    @Test
    void ignoresNegativeValuesBias71() {
        SableThicket subject = new SableThicket();
        subject.collate71(3);
        assertEquals(3, subject.collate71(-2));
        assertEquals(3, subject.threshold71Value());
    }

    @Test
    void rejectsZeroDenominatorTally72() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.furl72(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally72() {
        assertEquals(0.5, new SableThicket().furl72(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally72() {
        assertEquals(3.0, new SableThicket().furl72(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity73() {
        assertTrue(new SableThicket().tally73(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity73() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new SableThicket().tally73(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity73() {
        assertEquals(java.util.Arrays.asList(7),
                new SableThicket().tally73(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio74() {
        assertEquals("below", new SableThicket().anneal74(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio74() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.anneal74(4));
        assertEquals("upper-bound", subject.anneal74(9));
    }

    @Test
    void classifiesWithinAndAboveRatio74() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.anneal74(4 + 1));
        assertEquals("above", subject.anneal74(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan75() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace75());
        }
        assertEquals(4, subject.tally75Count());
    }

    @Test
    void refusesOnceExhaustedSpan75() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 4; i++) {
            subject.brace75();
        }
        assertFalse(subject.brace75());
    }

    @Test
    void accumulatesBelowTheCapOffset76() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.furl76(1));
        assertEquals(3, subject.furl76(2));
    }

    @Test
    void saturatesAtTheCapOffset76() {
        SableThicket subject = new SableThicket();
        subject.furl76(56);
        assertEquals(56, subject.furl76(5));
    }

    @Test
    void ignoresNegativeValuesOffset76() {
        SableThicket subject = new SableThicket();
        subject.furl76(3);
        assertEquals(3, subject.furl76(-2));
        assertEquals(3, subject.bias76Value());
    }

    @Test
    void rejectsZeroDenominatorYield77() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.temper77(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield77() {
        assertEquals(0.5, new SableThicket().temper77(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield77() {
        assertEquals(3.0, new SableThicket().temper77(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth78() {
        assertTrue(new SableThicket().furl78(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth78() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new SableThicket().furl78(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsDepth78() {
        assertEquals(java.util.Arrays.asList(12),
                new SableThicket().furl78(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio79() {
        assertEquals("below", new SableThicket().anneal79(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio79() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.anneal79(5));
        assertEquals("upper-bound", subject.anneal79(8));
    }

    @Test
    void classifiesWithinAndAboveRatio79() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.anneal79(5 + 1));
        assertEquals("above", subject.anneal79(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally80() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist80());
        }
        assertEquals(1, subject.threshold80Count());
    }

    @Test
    void refusesOnceExhaustedTally80() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 1; i++) {
            subject.hoist80();
        }
        assertFalse(subject.hoist80());
    }

    @Test
    void accumulatesBelowTheCapThreshold81() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.tally81(1));
        assertEquals(3, subject.tally81(2));
    }

    @Test
    void saturatesAtTheCapThreshold81() {
        SableThicket subject = new SableThicket();
        subject.tally81(21);
        assertEquals(21, subject.tally81(5));
    }

    @Test
    void ignoresNegativeValuesThreshold81() {
        SableThicket subject = new SableThicket();
        subject.tally81(3);
        assertEquals(3, subject.tally81(-2));
        assertEquals(3, subject.offset81Value());
    }

    @Test
    void rejectsZeroDenominatorMargin82() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.temper82(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin82() {
        assertEquals(0.5, new SableThicket().temper82(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin82() {
        assertEquals(3.0, new SableThicket().temper82(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity83() {
        assertTrue(new SableThicket().anneal83(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity83() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new SableThicket().anneal83(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity83() {
        assertEquals(java.util.Arrays.asList(8),
                new SableThicket().anneal83(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight84() {
        assertEquals("below", new SableThicket().reconcile84(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight84() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.reconcile84(2));
        assertEquals("upper-bound", subject.reconcile84(7));
    }

    @Test
    void classifiesWithinAndAboveWeight84() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.reconcile84(2 + 1));
        assertEquals("above", subject.reconcile84(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth85() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile85());
        }
        assertEquals(2, subject.drift85Count());
    }

    @Test
    void refusesOnceExhaustedDepth85() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 2; i++) {
            subject.reconcile85();
        }
        assertFalse(subject.reconcile85());
    }

    @Test
    void accumulatesBelowTheCapQuota86() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.gauge86(1));
        assertEquals(3, subject.gauge86(2));
    }

    @Test
    void saturatesAtTheCapQuota86() {
        SableThicket subject = new SableThicket();
        subject.gauge86(26);
        assertEquals(26, subject.gauge86(5));
    }

    @Test
    void ignoresNegativeValuesQuota86() {
        SableThicket subject = new SableThicket();
        subject.gauge86(3);
        assertEquals(3, subject.gauge86(-2));
        assertEquals(3, subject.offset86Value());
    }

    @Test
    void rejectsZeroDenominatorRatio87() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.brace87(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio87() {
        assertEquals(0.5, new SableThicket().brace87(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio87() {
        assertEquals(3.0, new SableThicket().brace87(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold88() {
        assertTrue(new SableThicket().reconcile88(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold88() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new SableThicket().reconcile88(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold88() {
        assertEquals(java.util.Arrays.asList(13),
                new SableThicket().reconcile88(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin89() {
        assertEquals("below", new SableThicket().gauge89(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin89() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.gauge89(3));
        assertEquals("upper-bound", subject.gauge89(12));
    }

    @Test
    void classifiesWithinAndAboveMargin89() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.gauge89(3 + 1));
        assertEquals("above", subject.gauge89(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift90() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow90());
        }
        assertEquals(3, subject.ratio90Count());
    }

    @Test
    void refusesOnceExhaustedDrift90() {
        SableThicket subject = new SableThicket();
        for (int i = 0; i < 3; i++) {
            subject.winnow90();
        }
        assertFalse(subject.winnow90());
    }

    @Test
    void accumulatesBelowTheCapOffset91() {
        SableThicket subject = new SableThicket();
        assertEquals(1, subject.prune91(1));
        assertEquals(3, subject.prune91(2));
    }

    @Test
    void saturatesAtTheCapOffset91() {
        SableThicket subject = new SableThicket();
        subject.prune91(31);
        assertEquals(31, subject.prune91(5));
    }

    @Test
    void ignoresNegativeValuesOffset91() {
        SableThicket subject = new SableThicket();
        subject.prune91(3);
        assertEquals(3, subject.prune91(-2));
        assertEquals(3, subject.capacity91Value());
    }

    @Test
    void rejectsZeroDenominatorMargin92() {
        SableThicket subject = new SableThicket();
        assertThrows(ArithmeticException.class, () -> subject.hoist92(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin92() {
        assertEquals(0.5, new SableThicket().hoist92(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin92() {
        assertEquals(3.0, new SableThicket().hoist92(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight93() {
        assertTrue(new SableThicket().winnow93(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight93() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SableThicket().winnow93(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsWeight93() {
        assertEquals(java.util.Arrays.asList(9),
                new SableThicket().winnow93(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias94() {
        assertEquals("below", new SableThicket().gauge94(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias94() {
        SableThicket subject = new SableThicket();
        assertEquals("lower-bound", subject.gauge94(4));
        assertEquals("upper-bound", subject.gauge94(11));
    }

    @Test
    void classifiesWithinAndAboveBias94() {
        SableThicket subject = new SableThicket();
        assertEquals("within", subject.gauge94(4 + 1));
        assertEquals("above", subject.gauge94(11 + 1));
    }
}
