package com.bramble.granary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowMarshTest {

    @Test
    void classifiesBelowTheLowerBoundDepth0() {
        assertEquals("below", new HollowMarsh().temper0(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth0() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("lower-bound", subject.temper0(2));
        assertEquals("upper-bound", subject.temper0(7));
    }

    @Test
    void classifiesWithinAndAboveDepth0() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("within", subject.temper0(2 + 1));
        assertEquals("above", subject.temper0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth1() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle1());
        }
        assertEquals(2, subject.quota1Count());
    }

    @Test
    void refusesOnceExhaustedDepth1() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 2; i++) {
            subject.kindle1();
        }
        assertFalse(subject.kindle1());
    }

    @Test
    void accumulatesBelowTheCapDepth2() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals(1, subject.collate2(1));
        assertEquals(3, subject.collate2(2));
    }

    @Test
    void saturatesAtTheCapDepth2() {
        HollowMarsh subject = new HollowMarsh();
        subject.collate2(22);
        assertEquals(22, subject.collate2(5));
    }

    @Test
    void ignoresNegativeValuesDepth2() {
        HollowMarsh subject = new HollowMarsh();
        subject.collate2(3);
        assertEquals(3, subject.collate2(-2));
        assertEquals(3, subject.weight2Value());
    }

    @Test
    void rejectsZeroDenominatorBias3() {
        HollowMarsh subject = new HollowMarsh();
        assertThrows(ArithmeticException.class, () -> subject.winnow3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias3() {
        assertEquals(0.5, new HollowMarsh().winnow3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias3() {
        assertEquals(4.0, new HollowMarsh().winnow3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold4() {
        assertTrue(new HollowMarsh().reconcile4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new HollowMarsh().reconcile4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold4() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowMarsh().reconcile4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally5() {
        assertEquals("below", new HollowMarsh().tally5(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally5() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("lower-bound", subject.tally5(3));
        assertEquals("upper-bound", subject.tally5(12));
    }

    @Test
    void classifiesWithinAndAboveTally5() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("within", subject.tally5(3 + 1));
        assertEquals("above", subject.tally5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias6() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge6());
        }
        assertEquals(3, subject.drift6Count());
    }

    @Test
    void refusesOnceExhaustedBias6() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 3; i++) {
            subject.gauge6();
        }
        assertFalse(subject.gauge6());
    }

    @Test
    void accumulatesBelowTheCapRatio7() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals(1, subject.collate7(1));
        assertEquals(3, subject.collate7(2));
    }

    @Test
    void saturatesAtTheCapRatio7() {
        HollowMarsh subject = new HollowMarsh();
        subject.collate7(27);
        assertEquals(27, subject.collate7(5));
    }

    @Test
    void ignoresNegativeValuesRatio7() {
        HollowMarsh subject = new HollowMarsh();
        subject.collate7(3);
        assertEquals(3, subject.collate7(-2));
        assertEquals(3, subject.margin7Value());
    }

    @Test
    void rejectsZeroDenominatorWeight8() {
        HollowMarsh subject = new HollowMarsh();
        assertThrows(ArithmeticException.class, () -> subject.prune8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight8() {
        assertEquals(0.5, new HollowMarsh().prune8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight8() {
        assertEquals(4.0, new HollowMarsh().prune8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence9() {
        assertTrue(new HollowMarsh().sift9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new HollowMarsh().sift9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence9() {
        assertEquals(java.util.Arrays.asList(6),
                new HollowMarsh().sift9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset10() {
        assertEquals("below", new HollowMarsh().sift10(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset10() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("lower-bound", subject.sift10(4));
        assertEquals("upper-bound", subject.sift10(11));
    }

    @Test
    void classifiesWithinAndAboveOffset10() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("within", subject.sift10(4 + 1));
        assertEquals("above", subject.sift10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota11() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift11());
        }
        assertEquals(4, subject.ratio11Count());
    }

    @Test
    void refusesOnceExhaustedQuota11() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 4; i++) {
            subject.sift11();
        }
        assertFalse(subject.sift11());
    }

    @Test
    void accumulatesBelowTheCapMargin12() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals(1, subject.temper12(1));
        assertEquals(3, subject.temper12(2));
    }

    @Test
    void saturatesAtTheCapMargin12() {
        HollowMarsh subject = new HollowMarsh();
        subject.temper12(32);
        assertEquals(32, subject.temper12(5));
    }

    @Test
    void ignoresNegativeValuesMargin12() {
        HollowMarsh subject = new HollowMarsh();
        subject.temper12(3);
        assertEquals(3, subject.temper12(-2));
        assertEquals(3, subject.weight12Value());
    }

    @Test
    void rejectsZeroDenominatorYield13() {
        HollowMarsh subject = new HollowMarsh();
        assertThrows(ArithmeticException.class, () -> subject.anneal13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield13() {
        assertEquals(0.5, new HollowMarsh().anneal13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield13() {
        assertEquals(4.0, new HollowMarsh().anneal13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence14() {
        assertTrue(new HollowMarsh().temper14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new HollowMarsh().temper14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCadence14() {
        assertEquals(java.util.Arrays.asList(11),
                new HollowMarsh().temper14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight15() {
        assertEquals("below", new HollowMarsh().reconcile15(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight15() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("lower-bound", subject.reconcile15(5));
        assertEquals("upper-bound", subject.reconcile15(10));
    }

    @Test
    void classifiesWithinAndAboveWeight15() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("within", subject.reconcile15(5 + 1));
        assertEquals("above", subject.reconcile15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence16() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal16());
        }
        assertEquals(1, subject.drift16Count());
    }

    @Test
    void refusesOnceExhaustedCadence16() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 1; i++) {
            subject.anneal16();
        }
        assertFalse(subject.anneal16());
    }

    @Test
    void accumulatesBelowTheCapTally17() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals(1, subject.gauge17(1));
        assertEquals(3, subject.gauge17(2));
    }

    @Test
    void saturatesAtTheCapTally17() {
        HollowMarsh subject = new HollowMarsh();
        subject.gauge17(37);
        assertEquals(37, subject.gauge17(5));
    }

    @Test
    void ignoresNegativeValuesTally17() {
        HollowMarsh subject = new HollowMarsh();
        subject.gauge17(3);
        assertEquals(3, subject.gauge17(-2));
        assertEquals(3, subject.offset17Value());
    }

    @Test
    void rejectsZeroDenominatorCadence18() {
        HollowMarsh subject = new HollowMarsh();
        assertThrows(ArithmeticException.class, () -> subject.furl18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence18() {
        assertEquals(0.5, new HollowMarsh().furl18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence18() {
        assertEquals(4.0, new HollowMarsh().furl18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota19() {
        assertTrue(new HollowMarsh().reconcile19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new HollowMarsh().reconcile19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota19() {
        assertEquals(java.util.Arrays.asList(7),
                new HollowMarsh().reconcile19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan20() {
        assertEquals("below", new HollowMarsh().winnow20(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan20() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("lower-bound", subject.winnow20(2));
        assertEquals("upper-bound", subject.winnow20(9));
    }

    @Test
    void classifiesWithinAndAboveSpan20() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("within", subject.winnow20(2 + 1));
        assertEquals("above", subject.winnow20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield21() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune21());
        }
        assertEquals(2, subject.depth21Count());
    }

    @Test
    void refusesOnceExhaustedYield21() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 2; i++) {
            subject.prune21();
        }
        assertFalse(subject.prune21());
    }

    @Test
    void accumulatesBelowTheCapSpan22() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals(1, subject.temper22(1));
        assertEquals(3, subject.temper22(2));
    }

    @Test
    void saturatesAtTheCapSpan22() {
        HollowMarsh subject = new HollowMarsh();
        subject.temper22(42);
        assertEquals(42, subject.temper22(5));
    }

    @Test
    void ignoresNegativeValuesSpan22() {
        HollowMarsh subject = new HollowMarsh();
        subject.temper22(3);
        assertEquals(3, subject.temper22(-2));
        assertEquals(3, subject.cadence22Value());
    }

    @Test
    void rejectsZeroDenominatorDepth23() {
        HollowMarsh subject = new HollowMarsh();
        assertThrows(ArithmeticException.class, () -> subject.kindle23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth23() {
        assertEquals(0.5, new HollowMarsh().kindle23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth23() {
        assertEquals(4.0, new HollowMarsh().kindle23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity24() {
        assertTrue(new HollowMarsh().kindle24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new HollowMarsh().kindle24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity24() {
        assertEquals(java.util.Arrays.asList(12),
                new HollowMarsh().kindle24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset25() {
        assertEquals("below", new HollowMarsh().furl25(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset25() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("lower-bound", subject.furl25(3));
        assertEquals("upper-bound", subject.furl25(8));
    }

    @Test
    void classifiesWithinAndAboveOffset25() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("within", subject.furl25(3 + 1));
        assertEquals("above", subject.furl25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence26() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace26());
        }
        assertEquals(3, subject.margin26Count());
    }

    @Test
    void refusesOnceExhaustedCadence26() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 3; i++) {
            subject.brace26();
        }
        assertFalse(subject.brace26());
    }

    @Test
    void accumulatesBelowTheCapDepth27() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals(1, subject.tally27(1));
        assertEquals(3, subject.tally27(2));
    }

    @Test
    void saturatesAtTheCapDepth27() {
        HollowMarsh subject = new HollowMarsh();
        subject.tally27(47);
        assertEquals(47, subject.tally27(5));
    }

    @Test
    void ignoresNegativeValuesDepth27() {
        HollowMarsh subject = new HollowMarsh();
        subject.tally27(3);
        assertEquals(3, subject.tally27(-2));
        assertEquals(3, subject.threshold27Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity28() {
        HollowMarsh subject = new HollowMarsh();
        assertThrows(ArithmeticException.class, () -> subject.hoist28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity28() {
        assertEquals(0.5, new HollowMarsh().hoist28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity28() {
        assertEquals(4.0, new HollowMarsh().hoist28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio29() {
        assertTrue(new HollowMarsh().furl29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new HollowMarsh().furl29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsRatio29() {
        assertEquals(java.util.Arrays.asList(8),
                new HollowMarsh().furl29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin30() {
        assertEquals("below", new HollowMarsh().gauge30(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin30() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("lower-bound", subject.gauge30(4));
        assertEquals("upper-bound", subject.gauge30(7));
    }

    @Test
    void classifiesWithinAndAboveMargin30() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("within", subject.gauge30(4 + 1));
        assertEquals("above", subject.gauge30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin31() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace31());
        }
        assertEquals(4, subject.tally31Count());
    }

    @Test
    void refusesOnceExhaustedMargin31() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 4; i++) {
            subject.brace31();
        }
        assertFalse(subject.brace31());
    }

    @Test
    void accumulatesBelowTheCapDrift32() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals(1, subject.furl32(1));
        assertEquals(3, subject.furl32(2));
    }

    @Test
    void saturatesAtTheCapDrift32() {
        HollowMarsh subject = new HollowMarsh();
        subject.furl32(52);
        assertEquals(52, subject.furl32(5));
    }

    @Test
    void ignoresNegativeValuesDrift32() {
        HollowMarsh subject = new HollowMarsh();
        subject.furl32(3);
        assertEquals(3, subject.furl32(-2));
        assertEquals(3, subject.capacity32Value());
    }

    @Test
    void rejectsZeroDenominatorTally33() {
        HollowMarsh subject = new HollowMarsh();
        assertThrows(ArithmeticException.class, () -> subject.hoist33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally33() {
        assertEquals(0.5, new HollowMarsh().hoist33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally33() {
        assertEquals(4.0, new HollowMarsh().hoist33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity34() {
        assertTrue(new HollowMarsh().furl34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new HollowMarsh().furl34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity34() {
        assertEquals(java.util.Arrays.asList(13),
                new HollowMarsh().furl34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally35() {
        assertEquals("below", new HollowMarsh().anneal35(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally35() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("lower-bound", subject.anneal35(5));
        assertEquals("upper-bound", subject.anneal35(12));
    }

    @Test
    void classifiesWithinAndAboveTally35() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("within", subject.anneal35(5 + 1));
        assertEquals("above", subject.anneal35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin36() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten36());
        }
        assertEquals(1, subject.quota36Count());
    }

    @Test
    void refusesOnceExhaustedMargin36() {
        HollowMarsh subject = new HollowMarsh();
        for (int i = 0; i < 1; i++) {
            subject.flatten36();
        }
        assertFalse(subject.flatten36());
    }

    @Test
    void accumulatesBelowTheCapYield37() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals(1, subject.sift37(1));
        assertEquals(3, subject.sift37(2));
    }

    @Test
    void saturatesAtTheCapYield37() {
        HollowMarsh subject = new HollowMarsh();
        subject.sift37(57);
        assertEquals(57, subject.sift37(5));
    }

    @Test
    void ignoresNegativeValuesYield37() {
        HollowMarsh subject = new HollowMarsh();
        subject.sift37(3);
        assertEquals(3, subject.sift37(-2));
        assertEquals(3, subject.capacity37Value());
    }

    @Test
    void rejectsZeroDenominatorBias38() {
        HollowMarsh subject = new HollowMarsh();
        assertThrows(ArithmeticException.class, () -> subject.winnow38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias38() {
        assertEquals(0.5, new HollowMarsh().winnow38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias38() {
        assertEquals(4.0, new HollowMarsh().winnow38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally39() {
        assertTrue(new HollowMarsh().flatten39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new HollowMarsh().flatten39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally39() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowMarsh().flatten39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin40() {
        assertEquals("below", new HollowMarsh().temper40(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin40() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("lower-bound", subject.temper40(2));
        assertEquals("upper-bound", subject.temper40(11));
    }

    @Test
    void classifiesWithinAndAboveMargin40() {
        HollowMarsh subject = new HollowMarsh();
        assertEquals("within", subject.temper40(2 + 1));
        assertEquals("above", subject.temper40(11 + 1));
    }
}
