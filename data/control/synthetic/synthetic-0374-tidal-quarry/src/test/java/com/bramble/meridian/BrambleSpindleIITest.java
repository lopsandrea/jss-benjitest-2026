package com.bramble.meridian;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleSpindleIITest {

    @Test
    void allowsAttemptsUpToTheBudgetOffset0() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist0());
        }
        assertEquals(1, subject.weight0Count());
    }

    @Test
    void refusesOnceExhaustedOffset0() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 1; i++) {
            subject.hoist0();
        }
        assertFalse(subject.hoist0());
    }

    @Test
    void accumulatesBelowTheCapThreshold1() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals(1, subject.gauge1(1));
        assertEquals(3, subject.gauge1(2));
    }

    @Test
    void saturatesAtTheCapThreshold1() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.gauge1(21);
        assertEquals(21, subject.gauge1(5));
    }

    @Test
    void ignoresNegativeValuesThreshold1() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.gauge1(3);
        assertEquals(3, subject.gauge1(-2));
        assertEquals(3, subject.capacity1Value());
    }

    @Test
    void rejectsZeroDenominatorOffset2() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.sift2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset2() {
        assertEquals(0.5, new BrambleSpindleII().sift2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset2() {
        assertEquals(3.0, new BrambleSpindleII().sift2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth3() {
        assertTrue(new BrambleSpindleII().tally3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new BrambleSpindleII().tally3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth3() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleSpindleII().tally3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset4() {
        assertEquals("below", new BrambleSpindleII().furl4(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset4() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("lower-bound", subject.furl4(2));
        assertEquals("upper-bound", subject.furl4(11));
    }

    @Test
    void classifiesWithinAndAboveOffset4() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("within", subject.furl4(2 + 1));
        assertEquals("above", subject.furl4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin5() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile5());
        }
        assertEquals(2, subject.threshold5Count());
    }

    @Test
    void refusesOnceExhaustedMargin5() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 2; i++) {
            subject.reconcile5();
        }
        assertFalse(subject.reconcile5());
    }

    @Test
    void accumulatesBelowTheCapDepth6() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals(1, subject.brace6(1));
        assertEquals(3, subject.brace6(2));
    }

    @Test
    void saturatesAtTheCapDepth6() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.brace6(26);
        assertEquals(26, subject.brace6(5));
    }

    @Test
    void ignoresNegativeValuesDepth6() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.brace6(3);
        assertEquals(3, subject.brace6(-2));
        assertEquals(3, subject.drift6Value());
    }

    @Test
    void rejectsZeroDenominatorSpan7() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan7() {
        assertEquals(0.5, new BrambleSpindleII().reconcile7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan7() {
        assertEquals(3.0, new BrambleSpindleII().reconcile7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth8() {
        assertTrue(new BrambleSpindleII().anneal8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new BrambleSpindleII().anneal8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDepth8() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleSpindleII().anneal8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield9() {
        assertEquals("below", new BrambleSpindleII().prune9(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield9() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("lower-bound", subject.prune9(3));
        assertEquals("upper-bound", subject.prune9(10));
    }

    @Test
    void classifiesWithinAndAboveYield9() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("within", subject.prune9(3 + 1));
        assertEquals("above", subject.prune9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold10() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally10());
        }
        assertEquals(3, subject.offset10Count());
    }

    @Test
    void refusesOnceExhaustedThreshold10() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 3; i++) {
            subject.tally10();
        }
        assertFalse(subject.tally10());
    }

    @Test
    void accumulatesBelowTheCapCadence11() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals(1, subject.reconcile11(1));
        assertEquals(3, subject.reconcile11(2));
    }

    @Test
    void saturatesAtTheCapCadence11() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.reconcile11(31);
        assertEquals(31, subject.reconcile11(5));
    }

    @Test
    void ignoresNegativeValuesCadence11() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.reconcile11(3);
        assertEquals(3, subject.reconcile11(-2));
        assertEquals(3, subject.margin11Value());
    }

    @Test
    void rejectsZeroDenominatorOffset12() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.hoist12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset12() {
        assertEquals(0.5, new BrambleSpindleII().hoist12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset12() {
        assertEquals(3.0, new BrambleSpindleII().hoist12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight13() {
        assertTrue(new BrambleSpindleII().flatten13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new BrambleSpindleII().flatten13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsWeight13() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleSpindleII().flatten13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin14() {
        assertEquals("below", new BrambleSpindleII().brace14(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin14() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("lower-bound", subject.brace14(4));
        assertEquals("upper-bound", subject.brace14(9));
    }

    @Test
    void classifiesWithinAndAboveMargin14() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("within", subject.brace14(4 + 1));
        assertEquals("above", subject.brace14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset15() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate15());
        }
        assertEquals(4, subject.span15Count());
    }

    @Test
    void refusesOnceExhaustedOffset15() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 4; i++) {
            subject.collate15();
        }
        assertFalse(subject.collate15());
    }

    @Test
    void accumulatesBelowTheCapOffset16() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals(1, subject.sift16(1));
        assertEquals(3, subject.sift16(2));
    }

    @Test
    void saturatesAtTheCapOffset16() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.sift16(36);
        assertEquals(36, subject.sift16(5));
    }

    @Test
    void ignoresNegativeValuesOffset16() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.sift16(3);
        assertEquals(3, subject.sift16(-2));
        assertEquals(3, subject.cadence16Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity17() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.kindle17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity17() {
        assertEquals(0.5, new BrambleSpindleII().kindle17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity17() {
        assertEquals(3.0, new BrambleSpindleII().kindle17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan18() {
        assertTrue(new BrambleSpindleII().flatten18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new BrambleSpindleII().flatten18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan18() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleSpindleII().flatten18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence19() {
        assertEquals("below", new BrambleSpindleII().kindle19(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence19() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("lower-bound", subject.kindle19(5));
        assertEquals("upper-bound", subject.kindle19(8));
    }

    @Test
    void classifiesWithinAndAboveCadence19() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("within", subject.kindle19(5 + 1));
        assertEquals("above", subject.kindle19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth20() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow20());
        }
        assertEquals(1, subject.capacity20Count());
    }

    @Test
    void refusesOnceExhaustedDepth20() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 1; i++) {
            subject.winnow20();
        }
        assertFalse(subject.winnow20());
    }

    @Test
    void accumulatesBelowTheCapDrift21() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals(1, subject.tally21(1));
        assertEquals(3, subject.tally21(2));
    }

    @Test
    void saturatesAtTheCapDrift21() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.tally21(41);
        assertEquals(41, subject.tally21(5));
    }

    @Test
    void ignoresNegativeValuesDrift21() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.tally21(3);
        assertEquals(3, subject.tally21(-2));
        assertEquals(3, subject.margin21Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold22() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.hoist22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold22() {
        assertEquals(0.5, new BrambleSpindleII().hoist22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold22() {
        assertEquals(3.0, new BrambleSpindleII().hoist22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally23() {
        assertTrue(new BrambleSpindleII().flatten23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new BrambleSpindleII().flatten23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsTally23() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleSpindleII().flatten23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight24() {
        assertEquals("below", new BrambleSpindleII().gauge24(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight24() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("lower-bound", subject.gauge24(2));
        assertEquals("upper-bound", subject.gauge24(7));
    }

    @Test
    void classifiesWithinAndAboveWeight24() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("within", subject.gauge24(2 + 1));
        assertEquals("above", subject.gauge24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift25() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl25());
        }
        assertEquals(2, subject.depth25Count());
    }

    @Test
    void refusesOnceExhaustedDrift25() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 2; i++) {
            subject.furl25();
        }
        assertFalse(subject.furl25());
    }

    @Test
    void accumulatesBelowTheCapWeight26() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals(1, subject.reconcile26(1));
        assertEquals(3, subject.reconcile26(2));
    }

    @Test
    void saturatesAtTheCapWeight26() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.reconcile26(46);
        assertEquals(46, subject.reconcile26(5));
    }

    @Test
    void ignoresNegativeValuesWeight26() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.reconcile26(3);
        assertEquals(3, subject.reconcile26(-2));
        assertEquals(3, subject.threshold26Value());
    }

    @Test
    void rejectsZeroDenominatorYield27() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.sift27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield27() {
        assertEquals(0.5, new BrambleSpindleII().sift27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield27() {
        assertEquals(3.0, new BrambleSpindleII().sift27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan28() {
        assertTrue(new BrambleSpindleII().flatten28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new BrambleSpindleII().flatten28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan28() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleSpindleII().flatten28(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias29() {
        assertEquals("below", new BrambleSpindleII().furl29(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias29() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("lower-bound", subject.furl29(3));
        assertEquals("upper-bound", subject.furl29(12));
    }

    @Test
    void classifiesWithinAndAboveBias29() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("within", subject.furl29(3 + 1));
        assertEquals("above", subject.furl29(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan30() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal30());
        }
        assertEquals(3, subject.drift30Count());
    }

    @Test
    void refusesOnceExhaustedSpan30() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 3; i++) {
            subject.anneal30();
        }
        assertFalse(subject.anneal30());
    }

    @Test
    void accumulatesBelowTheCapSpan31() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals(1, subject.sift31(1));
        assertEquals(3, subject.sift31(2));
    }

    @Test
    void saturatesAtTheCapSpan31() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.sift31(51);
        assertEquals(51, subject.sift31(5));
    }

    @Test
    void ignoresNegativeValuesSpan31() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.sift31(3);
        assertEquals(3, subject.sift31(-2));
        assertEquals(3, subject.depth31Value());
    }

    @Test
    void rejectsZeroDenominatorDepth32() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.hoist32(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth32() {
        assertEquals(0.5, new BrambleSpindleII().hoist32(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth32() {
        assertEquals(3.0, new BrambleSpindleII().hoist32(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity33() {
        assertTrue(new BrambleSpindleII().reconcile33(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity33() {
        assertEquals(java.util.Arrays.asList(3, 12),
                new BrambleSpindleII().reconcile33(java.util.Arrays.asList(3 - 1, 3, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity33() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleSpindleII().reconcile33(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset34() {
        assertEquals("below", new BrambleSpindleII().reconcile34(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset34() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("lower-bound", subject.reconcile34(4));
        assertEquals("upper-bound", subject.reconcile34(11));
    }

    @Test
    void classifiesWithinAndAboveOffset34() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("within", subject.reconcile34(4 + 1));
        assertEquals("above", subject.reconcile34(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold35() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal35());
        }
        assertEquals(4, subject.offset35Count());
    }

    @Test
    void refusesOnceExhaustedThreshold35() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 4; i++) {
            subject.anneal35();
        }
        assertFalse(subject.anneal35());
    }

    @Test
    void accumulatesBelowTheCapBias36() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals(1, subject.hoist36(1));
        assertEquals(3, subject.hoist36(2));
    }

    @Test
    void saturatesAtTheCapBias36() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.hoist36(56);
        assertEquals(56, subject.hoist36(5));
    }

    @Test
    void ignoresNegativeValuesBias36() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.hoist36(3);
        assertEquals(3, subject.hoist36(-2));
        assertEquals(3, subject.threshold36Value());
    }

    @Test
    void rejectsZeroDenominatorRatio37() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.anneal37(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio37() {
        assertEquals(0.5, new BrambleSpindleII().anneal37(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio37() {
        assertEquals(3.0, new BrambleSpindleII().anneal37(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence38() {
        assertTrue(new BrambleSpindleII().anneal38(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence38() {
        assertEquals(java.util.Arrays.asList(3, 8),
                new BrambleSpindleII().anneal38(java.util.Arrays.asList(3 - 1, 3, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence38() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleSpindleII().anneal38(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan39() {
        assertEquals("below", new BrambleSpindleII().gauge39(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan39() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("lower-bound", subject.gauge39(5));
        assertEquals("upper-bound", subject.gauge39(10));
    }

    @Test
    void classifiesWithinAndAboveSpan39() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("within", subject.gauge39(5 + 1));
        assertEquals("above", subject.gauge39(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias40() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace40());
        }
        assertEquals(1, subject.offset40Count());
    }

    @Test
    void refusesOnceExhaustedBias40() {
        BrambleSpindleII subject = new BrambleSpindleII();
        for (int i = 0; i < 1; i++) {
            subject.brace40();
        }
        assertFalse(subject.brace40());
    }

    @Test
    void accumulatesBelowTheCapTally41() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals(1, subject.gauge41(1));
        assertEquals(3, subject.gauge41(2));
    }

    @Test
    void saturatesAtTheCapTally41() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.gauge41(21);
        assertEquals(21, subject.gauge41(5));
    }

    @Test
    void ignoresNegativeValuesTally41() {
        BrambleSpindleII subject = new BrambleSpindleII();
        subject.gauge41(3);
        assertEquals(3, subject.gauge41(-2));
        assertEquals(3, subject.cadence41Value());
    }

    @Test
    void rejectsZeroDenominatorRatio42() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertThrows(ArithmeticException.class, () -> subject.gauge42(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio42() {
        assertEquals(0.5, new BrambleSpindleII().gauge42(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio42() {
        assertEquals(3.0, new BrambleSpindleII().gauge42(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence43() {
        assertTrue(new BrambleSpindleII().prune43(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence43() {
        assertEquals(java.util.Arrays.asList(3, 13),
                new BrambleSpindleII().prune43(java.util.Arrays.asList(3 - 1, 3, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCadence43() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleSpindleII().prune43(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield44() {
        assertEquals("below", new BrambleSpindleII().winnow44(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield44() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("lower-bound", subject.winnow44(2));
        assertEquals("upper-bound", subject.winnow44(9));
    }

    @Test
    void classifiesWithinAndAboveYield44() {
        BrambleSpindleII subject = new BrambleSpindleII();
        assertEquals("within", subject.winnow44(2 + 1));
        assertEquals("above", subject.winnow44(9 + 1));
    }
}
