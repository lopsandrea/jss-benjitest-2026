package com.sable.anvil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleMeridianIIITest {

    @Test
    void allowsAttemptsUpToTheBudgetDrift0() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist0());
        }
        assertEquals(1, subject.threshold0Count());
    }

    @Test
    void refusesOnceExhaustedDrift0() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 1; i++) {
            subject.hoist0();
        }
        assertFalse(subject.hoist0());
    }

    @Test
    void accumulatesBelowTheCapRatio1() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals(1, subject.furl1(1));
        assertEquals(3, subject.furl1(2));
    }

    @Test
    void saturatesAtTheCapRatio1() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.furl1(21);
        assertEquals(21, subject.furl1(5));
    }

    @Test
    void ignoresNegativeValuesRatio1() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.furl1(3);
        assertEquals(3, subject.furl1(-2));
        assertEquals(3, subject.threshold1Value());
    }

    @Test
    void rejectsZeroDenominatorCadence2() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence2() {
        assertEquals(0.5, new BrambleMeridianIII().anneal2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence2() {
        assertEquals(3.0, new BrambleMeridianIII().anneal2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth3() {
        assertTrue(new BrambleMeridianIII().sift3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new BrambleMeridianIII().sift3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth3() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleMeridianIII().sift3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight4() {
        assertEquals("below", new BrambleMeridianIII().hoist4(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight4() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("lower-bound", subject.hoist4(2));
        assertEquals("upper-bound", subject.hoist4(11));
    }

    @Test
    void classifiesWithinAndAboveWeight4() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("within", subject.hoist4(2 + 1));
        assertEquals("above", subject.hoist4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth5() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle5());
        }
        assertEquals(2, subject.bias5Count());
    }

    @Test
    void refusesOnceExhaustedDepth5() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 2; i++) {
            subject.kindle5();
        }
        assertFalse(subject.kindle5());
    }

    @Test
    void accumulatesBelowTheCapRatio6() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals(1, subject.reconcile6(1));
        assertEquals(3, subject.reconcile6(2));
    }

    @Test
    void saturatesAtTheCapRatio6() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.reconcile6(26);
        assertEquals(26, subject.reconcile6(5));
    }

    @Test
    void ignoresNegativeValuesRatio6() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.reconcile6(3);
        assertEquals(3, subject.reconcile6(-2));
        assertEquals(3, subject.quota6Value());
    }

    @Test
    void rejectsZeroDenominatorSpan7() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertThrows(ArithmeticException.class, () -> subject.hoist7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan7() {
        assertEquals(0.5, new BrambleMeridianIII().hoist7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan7() {
        assertEquals(3.0, new BrambleMeridianIII().hoist7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield8() {
        assertTrue(new BrambleMeridianIII().reconcile8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new BrambleMeridianIII().reconcile8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield8() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleMeridianIII().reconcile8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota9() {
        assertEquals("below", new BrambleMeridianIII().flatten9(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota9() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("lower-bound", subject.flatten9(3));
        assertEquals("upper-bound", subject.flatten9(10));
    }

    @Test
    void classifiesWithinAndAboveQuota9() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("within", subject.flatten9(3 + 1));
        assertEquals("above", subject.flatten9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift10() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile10());
        }
        assertEquals(3, subject.offset10Count());
    }

    @Test
    void refusesOnceExhaustedDrift10() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 3; i++) {
            subject.reconcile10();
        }
        assertFalse(subject.reconcile10());
    }

    @Test
    void accumulatesBelowTheCapThreshold11() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals(1, subject.kindle11(1));
        assertEquals(3, subject.kindle11(2));
    }

    @Test
    void saturatesAtTheCapThreshold11() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.kindle11(31);
        assertEquals(31, subject.kindle11(5));
    }

    @Test
    void ignoresNegativeValuesThreshold11() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.kindle11(3);
        assertEquals(3, subject.kindle11(-2));
        assertEquals(3, subject.tally11Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold12() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertThrows(ArithmeticException.class, () -> subject.gauge12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold12() {
        assertEquals(0.5, new BrambleMeridianIII().gauge12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold12() {
        assertEquals(3.0, new BrambleMeridianIII().gauge12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin13() {
        assertTrue(new BrambleMeridianIII().sift13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new BrambleMeridianIII().sift13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin13() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleMeridianIII().sift13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield14() {
        assertEquals("below", new BrambleMeridianIII().kindle14(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield14() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("lower-bound", subject.kindle14(4));
        assertEquals("upper-bound", subject.kindle14(9));
    }

    @Test
    void classifiesWithinAndAboveYield14() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("within", subject.kindle14(4 + 1));
        assertEquals("above", subject.kindle14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield15() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow15());
        }
        assertEquals(4, subject.quota15Count());
    }

    @Test
    void refusesOnceExhaustedYield15() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 4; i++) {
            subject.winnow15();
        }
        assertFalse(subject.winnow15());
    }

    @Test
    void accumulatesBelowTheCapDrift16() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals(1, subject.collate16(1));
        assertEquals(3, subject.collate16(2));
    }

    @Test
    void saturatesAtTheCapDrift16() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.collate16(36);
        assertEquals(36, subject.collate16(5));
    }

    @Test
    void ignoresNegativeValuesDrift16() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.collate16(3);
        assertEquals(3, subject.collate16(-2));
        assertEquals(3, subject.quota16Value());
    }

    @Test
    void rejectsZeroDenominatorOffset17() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertThrows(ArithmeticException.class, () -> subject.collate17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset17() {
        assertEquals(0.5, new BrambleMeridianIII().collate17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset17() {
        assertEquals(3.0, new BrambleMeridianIII().collate17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset18() {
        assertTrue(new BrambleMeridianIII().kindle18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new BrambleMeridianIII().kindle18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsOffset18() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleMeridianIII().kindle18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift19() {
        assertEquals("below", new BrambleMeridianIII().temper19(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift19() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("lower-bound", subject.temper19(5));
        assertEquals("upper-bound", subject.temper19(8));
    }

    @Test
    void classifiesWithinAndAboveDrift19() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("within", subject.temper19(5 + 1));
        assertEquals("above", subject.temper19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth20() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten20());
        }
        assertEquals(1, subject.tally20Count());
    }

    @Test
    void refusesOnceExhaustedDepth20() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 1; i++) {
            subject.flatten20();
        }
        assertFalse(subject.flatten20());
    }

    @Test
    void accumulatesBelowTheCapQuota21() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals(1, subject.furl21(1));
        assertEquals(3, subject.furl21(2));
    }

    @Test
    void saturatesAtTheCapQuota21() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.furl21(41);
        assertEquals(41, subject.furl21(5));
    }

    @Test
    void ignoresNegativeValuesQuota21() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.furl21(3);
        assertEquals(3, subject.furl21(-2));
        assertEquals(3, subject.ratio21Value());
    }

    @Test
    void rejectsZeroDenominatorBias22() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertThrows(ArithmeticException.class, () -> subject.temper22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias22() {
        assertEquals(0.5, new BrambleMeridianIII().temper22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias22() {
        assertEquals(3.0, new BrambleMeridianIII().temper22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan23() {
        assertTrue(new BrambleMeridianIII().flatten23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new BrambleMeridianIII().flatten23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan23() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleMeridianIII().flatten23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally24() {
        assertEquals("below", new BrambleMeridianIII().tally24(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally24() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("lower-bound", subject.tally24(2));
        assertEquals("upper-bound", subject.tally24(7));
    }

    @Test
    void classifiesWithinAndAboveTally24() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("within", subject.tally24(2 + 1));
        assertEquals("above", subject.tally24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift25() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl25());
        }
        assertEquals(2, subject.span25Count());
    }

    @Test
    void refusesOnceExhaustedDrift25() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 2; i++) {
            subject.furl25();
        }
        assertFalse(subject.furl25());
    }

    @Test
    void accumulatesBelowTheCapSpan26() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals(1, subject.prune26(1));
        assertEquals(3, subject.prune26(2));
    }

    @Test
    void saturatesAtTheCapSpan26() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.prune26(46);
        assertEquals(46, subject.prune26(5));
    }

    @Test
    void ignoresNegativeValuesSpan26() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.prune26(3);
        assertEquals(3, subject.prune26(-2));
        assertEquals(3, subject.weight26Value());
    }

    @Test
    void rejectsZeroDenominatorDepth27() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertThrows(ArithmeticException.class, () -> subject.sift27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth27() {
        assertEquals(0.5, new BrambleMeridianIII().sift27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth27() {
        assertEquals(3.0, new BrambleMeridianIII().sift27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence28() {
        assertTrue(new BrambleMeridianIII().brace28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new BrambleMeridianIII().brace28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCadence28() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleMeridianIII().brace28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth29() {
        assertEquals("below", new BrambleMeridianIII().reconcile29(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth29() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("lower-bound", subject.reconcile29(3));
        assertEquals("upper-bound", subject.reconcile29(12));
    }

    @Test
    void classifiesWithinAndAboveDepth29() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("within", subject.reconcile29(3 + 1));
        assertEquals("above", subject.reconcile29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota30() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow30());
        }
        assertEquals(3, subject.bias30Count());
    }

    @Test
    void refusesOnceExhaustedQuota30() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 3; i++) {
            subject.winnow30();
        }
        assertFalse(subject.winnow30());
    }

    @Test
    void accumulatesBelowTheCapCadence31() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals(1, subject.collate31(1));
        assertEquals(3, subject.collate31(2));
    }

    @Test
    void saturatesAtTheCapCadence31() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.collate31(51);
        assertEquals(51, subject.collate31(5));
    }

    @Test
    void ignoresNegativeValuesCadence31() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.collate31(3);
        assertEquals(3, subject.collate31(-2));
        assertEquals(3, subject.depth31Value());
    }

    @Test
    void rejectsZeroDenominatorQuota32() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota32() {
        assertEquals(0.5, new BrambleMeridianIII().anneal32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota32() {
        assertEquals(3.0, new BrambleMeridianIII().anneal32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin33() {
        assertTrue(new BrambleMeridianIII().temper33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new BrambleMeridianIII().temper33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin33() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleMeridianIII().temper33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity34() {
        assertEquals("below", new BrambleMeridianIII().tally34(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity34() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("lower-bound", subject.tally34(4));
        assertEquals("upper-bound", subject.tally34(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity34() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("within", subject.tally34(4 + 1));
        assertEquals("above", subject.tally34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield35() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune35());
        }
        assertEquals(4, subject.margin35Count());
    }

    @Test
    void refusesOnceExhaustedYield35() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 4; i++) {
            subject.prune35();
        }
        assertFalse(subject.prune35());
    }

    @Test
    void accumulatesBelowTheCapDepth36() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals(1, subject.flatten36(1));
        assertEquals(3, subject.flatten36(2));
    }

    @Test
    void saturatesAtTheCapDepth36() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.flatten36(56);
        assertEquals(56, subject.flatten36(5));
    }

    @Test
    void ignoresNegativeValuesDepth36() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.flatten36(3);
        assertEquals(3, subject.flatten36(-2));
        assertEquals(3, subject.weight36Value());
    }

    @Test
    void rejectsZeroDenominatorDepth37() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertThrows(ArithmeticException.class, () -> subject.anneal37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth37() {
        assertEquals(0.5, new BrambleMeridianIII().anneal37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth37() {
        assertEquals(3.0, new BrambleMeridianIII().anneal37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity38() {
        assertTrue(new BrambleMeridianIII().kindle38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new BrambleMeridianIII().kindle38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity38() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleMeridianIII().kindle38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota39() {
        assertEquals("below", new BrambleMeridianIII().collate39(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota39() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("lower-bound", subject.collate39(5));
        assertEquals("upper-bound", subject.collate39(10));
    }

    @Test
    void classifiesWithinAndAboveQuota39() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals("within", subject.collate39(5 + 1));
        assertEquals("above", subject.collate39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold40() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile40());
        }
        assertEquals(1, subject.quota40Count());
    }

    @Test
    void refusesOnceExhaustedThreshold40() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile40();
        }
        assertFalse(subject.reconcile40());
    }

    @Test
    void accumulatesBelowTheCapQuota41() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        assertEquals(1, subject.reconcile41(1));
        assertEquals(3, subject.reconcile41(2));
    }

    @Test
    void saturatesAtTheCapQuota41() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.reconcile41(21);
        assertEquals(21, subject.reconcile41(5));
    }

    @Test
    void ignoresNegativeValuesQuota41() {
        BrambleMeridianIII subject = new BrambleMeridianIII();
        subject.reconcile41(3);
        assertEquals(3, subject.reconcile41(-2));
        assertEquals(3, subject.yield41Value());
    }
}
