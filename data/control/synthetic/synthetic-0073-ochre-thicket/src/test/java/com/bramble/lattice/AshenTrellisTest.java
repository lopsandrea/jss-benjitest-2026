package com.bramble.lattice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenTrellisTest {

    @Test
    void classifiesBelowTheLowerBoundMargin0() {
        assertEquals("below", new AshenTrellis().flatten0(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin0() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.flatten0(2));
        assertEquals("upper-bound", subject.flatten0(7));
    }

    @Test
    void classifiesWithinAndAboveMargin0() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.flatten0(2 + 1));
        assertEquals("above", subject.flatten0(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally1() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal1());
        }
        assertEquals(2, subject.quota1Count());
    }

    @Test
    void refusesOnceExhaustedTally1() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 2; i++) {
            subject.anneal1();
        }
        assertFalse(subject.anneal1());
    }

    @Test
    void accumulatesBelowTheCapMargin2() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.temper2(1));
        assertEquals(3, subject.temper2(2));
    }

    @Test
    void saturatesAtTheCapMargin2() {
        AshenTrellis subject = new AshenTrellis();
        subject.temper2(22);
        assertEquals(22, subject.temper2(5));
    }

    @Test
    void ignoresNegativeValuesMargin2() {
        AshenTrellis subject = new AshenTrellis();
        subject.temper2(3);
        assertEquals(3, subject.temper2(-2));
        assertEquals(3, subject.cadence2Value());
    }

    @Test
    void rejectsZeroDenominatorYield3() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.kindle3(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield3() {
        assertEquals(0.5, new AshenTrellis().kindle3(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield3() {
        assertEquals(4.0, new AshenTrellis().kindle3(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield4() {
        assertTrue(new AshenTrellis().reconcile4(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield4() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AshenTrellis().reconcile4(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield4() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenTrellis().reconcile4(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift5() {
        assertEquals("below", new AshenTrellis().prune5(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift5() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.prune5(3));
        assertEquals("upper-bound", subject.prune5(12));
    }

    @Test
    void classifiesWithinAndAboveDrift5() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.prune5(3 + 1));
        assertEquals("above", subject.prune5(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset6() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge6());
        }
        assertEquals(3, subject.bias6Count());
    }

    @Test
    void refusesOnceExhaustedOffset6() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 3; i++) {
            subject.gauge6();
        }
        assertFalse(subject.gauge6());
    }

    @Test
    void accumulatesBelowTheCapCadence7() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.kindle7(1));
        assertEquals(3, subject.kindle7(2));
    }

    @Test
    void saturatesAtTheCapCadence7() {
        AshenTrellis subject = new AshenTrellis();
        subject.kindle7(27);
        assertEquals(27, subject.kindle7(5));
    }

    @Test
    void ignoresNegativeValuesCadence7() {
        AshenTrellis subject = new AshenTrellis();
        subject.kindle7(3);
        assertEquals(3, subject.kindle7(-2));
        assertEquals(3, subject.threshold7Value());
    }

    @Test
    void rejectsZeroDenominatorWeight8() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.gauge8(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight8() {
        assertEquals(0.5, new AshenTrellis().gauge8(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight8() {
        assertEquals(4.0, new AshenTrellis().gauge8(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold9() {
        assertTrue(new AshenTrellis().anneal9(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold9() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AshenTrellis().anneal9(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold9() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenTrellis().anneal9(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift10() {
        assertEquals("below", new AshenTrellis().brace10(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift10() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.brace10(4));
        assertEquals("upper-bound", subject.brace10(11));
    }

    @Test
    void classifiesWithinAndAboveDrift10() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.brace10(4 + 1));
        assertEquals("above", subject.brace10(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota11() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal11());
        }
        assertEquals(4, subject.capacity11Count());
    }

    @Test
    void refusesOnceExhaustedQuota11() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 4; i++) {
            subject.anneal11();
        }
        assertFalse(subject.anneal11());
    }

    @Test
    void accumulatesBelowTheCapCapacity12() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.hoist12(1));
        assertEquals(3, subject.hoist12(2));
    }

    @Test
    void saturatesAtTheCapCapacity12() {
        AshenTrellis subject = new AshenTrellis();
        subject.hoist12(32);
        assertEquals(32, subject.hoist12(5));
    }

    @Test
    void ignoresNegativeValuesCapacity12() {
        AshenTrellis subject = new AshenTrellis();
        subject.hoist12(3);
        assertEquals(3, subject.hoist12(-2));
        assertEquals(3, subject.quota12Value());
    }

    @Test
    void rejectsZeroDenominatorSpan13() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.kindle13(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan13() {
        assertEquals(0.5, new AshenTrellis().kindle13(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan13() {
        assertEquals(4.0, new AshenTrellis().kindle13(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin14() {
        assertTrue(new AshenTrellis().kindle14(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin14() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new AshenTrellis().kindle14(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin14() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenTrellis().kindle14(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin15() {
        assertEquals("below", new AshenTrellis().furl15(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin15() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.furl15(5));
        assertEquals("upper-bound", subject.furl15(10));
    }

    @Test
    void classifiesWithinAndAboveMargin15() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.furl15(5 + 1));
        assertEquals("above", subject.furl15(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold16() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle16());
        }
        assertEquals(1, subject.cadence16Count());
    }

    @Test
    void refusesOnceExhaustedThreshold16() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 1; i++) {
            subject.kindle16();
        }
        assertFalse(subject.kindle16());
    }

    @Test
    void accumulatesBelowTheCapMargin17() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.hoist17(1));
        assertEquals(3, subject.hoist17(2));
    }

    @Test
    void saturatesAtTheCapMargin17() {
        AshenTrellis subject = new AshenTrellis();
        subject.hoist17(37);
        assertEquals(37, subject.hoist17(5));
    }

    @Test
    void ignoresNegativeValuesMargin17() {
        AshenTrellis subject = new AshenTrellis();
        subject.hoist17(3);
        assertEquals(3, subject.hoist17(-2));
        assertEquals(3, subject.cadence17Value());
    }

    @Test
    void rejectsZeroDenominatorYield18() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.prune18(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield18() {
        assertEquals(0.5, new AshenTrellis().prune18(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield18() {
        assertEquals(4.0, new AshenTrellis().prune18(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota19() {
        assertTrue(new AshenTrellis().furl19(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota19() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new AshenTrellis().furl19(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsQuota19() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenTrellis().furl19(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan20() {
        assertEquals("below", new AshenTrellis().kindle20(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan20() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.kindle20(2));
        assertEquals("upper-bound", subject.kindle20(9));
    }

    @Test
    void classifiesWithinAndAboveSpan20() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.kindle20(2 + 1));
        assertEquals("above", subject.kindle20(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield21() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune21());
        }
        assertEquals(2, subject.span21Count());
    }

    @Test
    void refusesOnceExhaustedYield21() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 2; i++) {
            subject.prune21();
        }
        assertFalse(subject.prune21());
    }

    @Test
    void accumulatesBelowTheCapThreshold22() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.prune22(1));
        assertEquals(3, subject.prune22(2));
    }

    @Test
    void saturatesAtTheCapThreshold22() {
        AshenTrellis subject = new AshenTrellis();
        subject.prune22(42);
        assertEquals(42, subject.prune22(5));
    }

    @Test
    void ignoresNegativeValuesThreshold22() {
        AshenTrellis subject = new AshenTrellis();
        subject.prune22(3);
        assertEquals(3, subject.prune22(-2));
        assertEquals(3, subject.offset22Value());
    }

    @Test
    void rejectsZeroDenominatorOffset23() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.winnow23(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset23() {
        assertEquals(0.5, new AshenTrellis().winnow23(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset23() {
        assertEquals(4.0, new AshenTrellis().winnow23(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan24() {
        assertTrue(new AshenTrellis().collate24(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan24() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new AshenTrellis().collate24(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan24() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenTrellis().collate24(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight25() {
        assertEquals("below", new AshenTrellis().flatten25(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight25() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.flatten25(3));
        assertEquals("upper-bound", subject.flatten25(8));
    }

    @Test
    void classifiesWithinAndAboveWeight25() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.flatten25(3 + 1));
        assertEquals("above", subject.flatten25(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset26() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal26());
        }
        assertEquals(3, subject.span26Count());
    }

    @Test
    void refusesOnceExhaustedOffset26() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 3; i++) {
            subject.anneal26();
        }
        assertFalse(subject.anneal26());
    }

    @Test
    void accumulatesBelowTheCapDrift27() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.collate27(1));
        assertEquals(3, subject.collate27(2));
    }

    @Test
    void saturatesAtTheCapDrift27() {
        AshenTrellis subject = new AshenTrellis();
        subject.collate27(47);
        assertEquals(47, subject.collate27(5));
    }

    @Test
    void ignoresNegativeValuesDrift27() {
        AshenTrellis subject = new AshenTrellis();
        subject.collate27(3);
        assertEquals(3, subject.collate27(-2));
        assertEquals(3, subject.weight27Value());
    }

    @Test
    void rejectsZeroDenominatorSpan28() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.hoist28(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan28() {
        assertEquals(0.5, new AshenTrellis().hoist28(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan28() {
        assertEquals(4.0, new AshenTrellis().hoist28(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota29() {
        assertTrue(new AshenTrellis().kindle29(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota29() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new AshenTrellis().kindle29(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsQuota29() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenTrellis().kindle29(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias30() {
        assertEquals("below", new AshenTrellis().brace30(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias30() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.brace30(4));
        assertEquals("upper-bound", subject.brace30(7));
    }

    @Test
    void classifiesWithinAndAboveBias30() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.brace30(4 + 1));
        assertEquals("above", subject.brace30(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias31() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate31());
        }
        assertEquals(4, subject.quota31Count());
    }

    @Test
    void refusesOnceExhaustedBias31() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 4; i++) {
            subject.collate31();
        }
        assertFalse(subject.collate31());
    }

    @Test
    void accumulatesBelowTheCapRatio32() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.hoist32(1));
        assertEquals(3, subject.hoist32(2));
    }

    @Test
    void saturatesAtTheCapRatio32() {
        AshenTrellis subject = new AshenTrellis();
        subject.hoist32(52);
        assertEquals(52, subject.hoist32(5));
    }

    @Test
    void ignoresNegativeValuesRatio32() {
        AshenTrellis subject = new AshenTrellis();
        subject.hoist32(3);
        assertEquals(3, subject.hoist32(-2));
        assertEquals(3, subject.cadence32Value());
    }

    @Test
    void rejectsZeroDenominatorMargin33() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.kindle33(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin33() {
        assertEquals(0.5, new AshenTrellis().kindle33(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin33() {
        assertEquals(4.0, new AshenTrellis().kindle33(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally34() {
        assertTrue(new AshenTrellis().tally34(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally34() {
        assertEquals(java.util.Arrays.asList(4, 13),
                new AshenTrellis().tally34(java.util.Arrays.asList(4 - 1, 4, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally34() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenTrellis().tally34(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan35() {
        assertEquals("below", new AshenTrellis().tally35(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan35() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.tally35(5));
        assertEquals("upper-bound", subject.tally35(12));
    }

    @Test
    void classifiesWithinAndAboveSpan35() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.tally35(5 + 1));
        assertEquals("above", subject.tally35(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold36() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper36());
        }
        assertEquals(1, subject.weight36Count());
    }

    @Test
    void refusesOnceExhaustedThreshold36() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 1; i++) {
            subject.temper36();
        }
        assertFalse(subject.temper36());
    }

    @Test
    void accumulatesBelowTheCapCadence37() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.sift37(1));
        assertEquals(3, subject.sift37(2));
    }

    @Test
    void saturatesAtTheCapCadence37() {
        AshenTrellis subject = new AshenTrellis();
        subject.sift37(57);
        assertEquals(57, subject.sift37(5));
    }

    @Test
    void ignoresNegativeValuesCadence37() {
        AshenTrellis subject = new AshenTrellis();
        subject.sift37(3);
        assertEquals(3, subject.sift37(-2));
        assertEquals(3, subject.margin37Value());
    }

    @Test
    void rejectsZeroDenominatorSpan38() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.sift38(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan38() {
        assertEquals(0.5, new AshenTrellis().sift38(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan38() {
        assertEquals(4.0, new AshenTrellis().sift38(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold39() {
        assertTrue(new AshenTrellis().winnow39(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold39() {
        assertEquals(java.util.Arrays.asList(4, 9),
                new AshenTrellis().winnow39(java.util.Arrays.asList(4 - 1, 4, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsThreshold39() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenTrellis().winnow39(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield40() {
        assertEquals("below", new AshenTrellis().kindle40(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield40() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.kindle40(2));
        assertEquals("upper-bound", subject.kindle40(11));
    }

    @Test
    void classifiesWithinAndAboveYield40() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.kindle40(2 + 1));
        assertEquals("above", subject.kindle40(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset41() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl41());
        }
        assertEquals(2, subject.capacity41Count());
    }

    @Test
    void refusesOnceExhaustedOffset41() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 2; i++) {
            subject.furl41();
        }
        assertFalse(subject.furl41());
    }

    @Test
    void accumulatesBelowTheCapRatio42() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.brace42(1));
        assertEquals(3, subject.brace42(2));
    }

    @Test
    void saturatesAtTheCapRatio42() {
        AshenTrellis subject = new AshenTrellis();
        subject.brace42(22);
        assertEquals(22, subject.brace42(5));
    }

    @Test
    void ignoresNegativeValuesRatio42() {
        AshenTrellis subject = new AshenTrellis();
        subject.brace42(3);
        assertEquals(3, subject.brace42(-2));
        assertEquals(3, subject.offset42Value());
    }

    @Test
    void rejectsZeroDenominatorDepth43() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.tally43(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth43() {
        assertEquals(0.5, new AshenTrellis().tally43(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth43() {
        assertEquals(4.0, new AshenTrellis().tally43(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight44() {
        assertTrue(new AshenTrellis().kindle44(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight44() {
        assertEquals(java.util.Arrays.asList(4, 14),
                new AshenTrellis().kindle44(java.util.Arrays.asList(4 - 1, 4, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight44() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenTrellis().kindle44(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally45() {
        assertEquals("below", new AshenTrellis().winnow45(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally45() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.winnow45(3));
        assertEquals("upper-bound", subject.winnow45(10));
    }

    @Test
    void classifiesWithinAndAboveTally45() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.winnow45(3 + 1));
        assertEquals("above", subject.winnow45(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight46() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl46());
        }
        assertEquals(3, subject.margin46Count());
    }

    @Test
    void refusesOnceExhaustedWeight46() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 3; i++) {
            subject.furl46();
        }
        assertFalse(subject.furl46());
    }

    @Test
    void accumulatesBelowTheCapSpan47() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.furl47(1));
        assertEquals(3, subject.furl47(2));
    }

    @Test
    void saturatesAtTheCapSpan47() {
        AshenTrellis subject = new AshenTrellis();
        subject.furl47(27);
        assertEquals(27, subject.furl47(5));
    }

    @Test
    void ignoresNegativeValuesSpan47() {
        AshenTrellis subject = new AshenTrellis();
        subject.furl47(3);
        assertEquals(3, subject.furl47(-2));
        assertEquals(3, subject.weight47Value());
    }

    @Test
    void rejectsZeroDenominatorRatio48() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.furl48(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio48() {
        assertEquals(0.5, new AshenTrellis().furl48(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio48() {
        assertEquals(4.0, new AshenTrellis().furl48(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield49() {
        assertTrue(new AshenTrellis().winnow49(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield49() {
        assertEquals(java.util.Arrays.asList(4, 10),
                new AshenTrellis().winnow49(java.util.Arrays.asList(4 - 1, 4, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield49() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenTrellis().winnow49(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift50() {
        assertEquals("below", new AshenTrellis().sift50(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift50() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.sift50(4));
        assertEquals("upper-bound", subject.sift50(9));
    }

    @Test
    void classifiesWithinAndAboveDrift50() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.sift50(4 + 1));
        assertEquals("above", subject.sift50(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota51() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile51());
        }
        assertEquals(4, subject.tally51Count());
    }

    @Test
    void refusesOnceExhaustedQuota51() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 4; i++) {
            subject.reconcile51();
        }
        assertFalse(subject.reconcile51());
    }

    @Test
    void accumulatesBelowTheCapDrift52() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.tally52(1));
        assertEquals(3, subject.tally52(2));
    }

    @Test
    void saturatesAtTheCapDrift52() {
        AshenTrellis subject = new AshenTrellis();
        subject.tally52(32);
        assertEquals(32, subject.tally52(5));
    }

    @Test
    void ignoresNegativeValuesDrift52() {
        AshenTrellis subject = new AshenTrellis();
        subject.tally52(3);
        assertEquals(3, subject.tally52(-2));
        assertEquals(3, subject.tally52Value());
    }

    @Test
    void rejectsZeroDenominatorDrift53() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.flatten53(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift53() {
        assertEquals(0.5, new AshenTrellis().flatten53(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift53() {
        assertEquals(4.0, new AshenTrellis().flatten53(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence54() {
        assertTrue(new AshenTrellis().collate54(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence54() {
        assertEquals(java.util.Arrays.asList(4, 6),
                new AshenTrellis().collate54(java.util.Arrays.asList(4 - 1, 4, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence54() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenTrellis().collate54(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin55() {
        assertEquals("below", new AshenTrellis().brace55(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin55() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.brace55(5));
        assertEquals("upper-bound", subject.brace55(8));
    }

    @Test
    void classifiesWithinAndAboveMargin55() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.brace55(5 + 1));
        assertEquals("above", subject.brace55(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift56() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift56());
        }
        assertEquals(1, subject.quota56Count());
    }

    @Test
    void refusesOnceExhaustedDrift56() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 1; i++) {
            subject.sift56();
        }
        assertFalse(subject.sift56());
    }

    @Test
    void accumulatesBelowTheCapQuota57() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.brace57(1));
        assertEquals(3, subject.brace57(2));
    }

    @Test
    void saturatesAtTheCapQuota57() {
        AshenTrellis subject = new AshenTrellis();
        subject.brace57(37);
        assertEquals(37, subject.brace57(5));
    }

    @Test
    void ignoresNegativeValuesQuota57() {
        AshenTrellis subject = new AshenTrellis();
        subject.brace57(3);
        assertEquals(3, subject.brace57(-2));
        assertEquals(3, subject.capacity57Value());
    }

    @Test
    void rejectsZeroDenominatorDrift58() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.brace58(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift58() {
        assertEquals(0.5, new AshenTrellis().brace58(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift58() {
        assertEquals(4.0, new AshenTrellis().brace58(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio59() {
        assertTrue(new AshenTrellis().kindle59(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio59() {
        assertEquals(java.util.Arrays.asList(4, 11),
                new AshenTrellis().kindle59(java.util.Arrays.asList(4 - 1, 4, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio59() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenTrellis().kindle59(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota60() {
        assertEquals("below", new AshenTrellis().gauge60(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota60() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.gauge60(2));
        assertEquals("upper-bound", subject.gauge60(7));
    }

    @Test
    void classifiesWithinAndAboveQuota60() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.gauge60(2 + 1));
        assertEquals("above", subject.gauge60(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan61() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally61());
        }
        assertEquals(2, subject.capacity61Count());
    }

    @Test
    void refusesOnceExhaustedSpan61() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 2; i++) {
            subject.tally61();
        }
        assertFalse(subject.tally61());
    }

    @Test
    void accumulatesBelowTheCapWeight62() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.sift62(1));
        assertEquals(3, subject.sift62(2));
    }

    @Test
    void saturatesAtTheCapWeight62() {
        AshenTrellis subject = new AshenTrellis();
        subject.sift62(42);
        assertEquals(42, subject.sift62(5));
    }

    @Test
    void ignoresNegativeValuesWeight62() {
        AshenTrellis subject = new AshenTrellis();
        subject.sift62(3);
        assertEquals(3, subject.sift62(-2));
        assertEquals(3, subject.tally62Value());
    }

    @Test
    void rejectsZeroDenominatorYield63() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.flatten63(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield63() {
        assertEquals(0.5, new AshenTrellis().flatten63(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield63() {
        assertEquals(4.0, new AshenTrellis().flatten63(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield64() {
        assertTrue(new AshenTrellis().hoist64(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield64() {
        assertEquals(java.util.Arrays.asList(4, 7),
                new AshenTrellis().hoist64(java.util.Arrays.asList(4 - 1, 4, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield64() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenTrellis().hoist64(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota65() {
        assertEquals("below", new AshenTrellis().sift65(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota65() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.sift65(3));
        assertEquals("upper-bound", subject.sift65(12));
    }

    @Test
    void classifiesWithinAndAboveQuota65() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.sift65(3 + 1));
        assertEquals("above", subject.sift65(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin66() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift66());
        }
        assertEquals(3, subject.span66Count());
    }

    @Test
    void refusesOnceExhaustedMargin66() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 3; i++) {
            subject.sift66();
        }
        assertFalse(subject.sift66());
    }

    @Test
    void accumulatesBelowTheCapCapacity67() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.gauge67(1));
        assertEquals(3, subject.gauge67(2));
    }

    @Test
    void saturatesAtTheCapCapacity67() {
        AshenTrellis subject = new AshenTrellis();
        subject.gauge67(47);
        assertEquals(47, subject.gauge67(5));
    }

    @Test
    void ignoresNegativeValuesCapacity67() {
        AshenTrellis subject = new AshenTrellis();
        subject.gauge67(3);
        assertEquals(3, subject.gauge67(-2));
        assertEquals(3, subject.cadence67Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity68() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.collate68(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity68() {
        assertEquals(0.5, new AshenTrellis().collate68(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity68() {
        assertEquals(4.0, new AshenTrellis().collate68(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias69() {
        assertTrue(new AshenTrellis().temper69(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias69() {
        assertEquals(java.util.Arrays.asList(4, 12),
                new AshenTrellis().temper69(java.util.Arrays.asList(4 - 1, 4, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsBias69() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenTrellis().temper69(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan70() {
        assertEquals("below", new AshenTrellis().collate70(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan70() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.collate70(4));
        assertEquals("upper-bound", subject.collate70(11));
    }

    @Test
    void classifiesWithinAndAboveSpan70() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.collate70(4 + 1));
        assertEquals("above", subject.collate70(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence71() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal71());
        }
        assertEquals(4, subject.bias71Count());
    }

    @Test
    void refusesOnceExhaustedCadence71() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 4; i++) {
            subject.anneal71();
        }
        assertFalse(subject.anneal71());
    }

    @Test
    void accumulatesBelowTheCapQuota72() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals(1, subject.anneal72(1));
        assertEquals(3, subject.anneal72(2));
    }

    @Test
    void saturatesAtTheCapQuota72() {
        AshenTrellis subject = new AshenTrellis();
        subject.anneal72(52);
        assertEquals(52, subject.anneal72(5));
    }

    @Test
    void ignoresNegativeValuesQuota72() {
        AshenTrellis subject = new AshenTrellis();
        subject.anneal72(3);
        assertEquals(3, subject.anneal72(-2));
        assertEquals(3, subject.capacity72Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold73() {
        AshenTrellis subject = new AshenTrellis();
        assertThrows(ArithmeticException.class, () -> subject.collate73(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold73() {
        assertEquals(0.5, new AshenTrellis().collate73(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold73() {
        assertEquals(4.0, new AshenTrellis().collate73(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin74() {
        assertTrue(new AshenTrellis().brace74(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin74() {
        assertEquals(java.util.Arrays.asList(4, 8),
                new AshenTrellis().brace74(java.util.Arrays.asList(4 - 1, 4, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsMargin74() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenTrellis().brace74(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold75() {
        assertEquals("below", new AshenTrellis().reconcile75(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold75() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("lower-bound", subject.reconcile75(5));
        assertEquals("upper-bound", subject.reconcile75(10));
    }

    @Test
    void classifiesWithinAndAboveThreshold75() {
        AshenTrellis subject = new AshenTrellis();
        assertEquals("within", subject.reconcile75(5 + 1));
        assertEquals("above", subject.reconcile75(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth76() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist76());
        }
        assertEquals(1, subject.offset76Count());
    }

    @Test
    void refusesOnceExhaustedDepth76() {
        AshenTrellis subject = new AshenTrellis();
        for (int i = 0; i < 1; i++) {
            subject.hoist76();
        }
        assertFalse(subject.hoist76());
    }
}
