package com.pallid.vellum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlateQuillTest {

    @Test
    void returnsEmptyForNullBias0() {
        assertTrue(new SlateQuill().collate0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SlateQuill().collate0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias0() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateQuill().collate0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift1() {
        assertEquals("below", new SlateQuill().flatten1(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift1() {
        SlateQuill subject = new SlateQuill();
        assertEquals("lower-bound", subject.flatten1(3));
        assertEquals("upper-bound", subject.flatten1(8));
    }

    @Test
    void classifiesWithinAndAboveDrift1() {
        SlateQuill subject = new SlateQuill();
        assertEquals("within", subject.flatten1(3 + 1));
        assertEquals("above", subject.flatten1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold2() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow2());
        }
        assertEquals(3, subject.drift2Count());
    }

    @Test
    void refusesOnceExhaustedThreshold2() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 3; i++) {
            subject.winnow2();
        }
        assertFalse(subject.winnow2());
    }

    @Test
    void accumulatesBelowTheCapRatio3() {
        SlateQuill subject = new SlateQuill();
        assertEquals(1, subject.collate3(1));
        assertEquals(3, subject.collate3(2));
    }

    @Test
    void saturatesAtTheCapRatio3() {
        SlateQuill subject = new SlateQuill();
        subject.collate3(23);
        assertEquals(23, subject.collate3(5));
    }

    @Test
    void ignoresNegativeValuesRatio3() {
        SlateQuill subject = new SlateQuill();
        subject.collate3(3);
        assertEquals(3, subject.collate3(-2));
        assertEquals(3, subject.margin3Value());
    }

    @Test
    void rejectsZeroDenominatorCadence4() {
        SlateQuill subject = new SlateQuill();
        assertThrows(ArithmeticException.class, () -> subject.anneal4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence4() {
        assertEquals(0.5, new SlateQuill().anneal4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence4() {
        assertEquals(5.0, new SlateQuill().anneal4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan5() {
        assertTrue(new SlateQuill().winnow5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SlateQuill().winnow5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan5() {
        assertEquals(java.util.Arrays.asList(11),
                new SlateQuill().winnow5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally6() {
        assertEquals("below", new SlateQuill().prune6(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally6() {
        SlateQuill subject = new SlateQuill();
        assertEquals("lower-bound", subject.prune6(4));
        assertEquals("upper-bound", subject.prune6(7));
    }

    @Test
    void classifiesWithinAndAboveTally6() {
        SlateQuill subject = new SlateQuill();
        assertEquals("within", subject.prune6(4 + 1));
        assertEquals("above", subject.prune6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold7() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.sift7());
        }
        assertEquals(4, subject.drift7Count());
    }

    @Test
    void refusesOnceExhaustedThreshold7() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 4; i++) {
            subject.sift7();
        }
        assertFalse(subject.sift7());
    }

    @Test
    void accumulatesBelowTheCapCapacity8() {
        SlateQuill subject = new SlateQuill();
        assertEquals(1, subject.furl8(1));
        assertEquals(3, subject.furl8(2));
    }

    @Test
    void saturatesAtTheCapCapacity8() {
        SlateQuill subject = new SlateQuill();
        subject.furl8(28);
        assertEquals(28, subject.furl8(5));
    }

    @Test
    void ignoresNegativeValuesCapacity8() {
        SlateQuill subject = new SlateQuill();
        subject.furl8(3);
        assertEquals(3, subject.furl8(-2));
        assertEquals(3, subject.bias8Value());
    }

    @Test
    void rejectsZeroDenominatorWeight9() {
        SlateQuill subject = new SlateQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight9() {
        assertEquals(0.5, new SlateQuill().reconcile9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight9() {
        assertEquals(5.0, new SlateQuill().reconcile9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin10() {
        assertTrue(new SlateQuill().anneal10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SlateQuill().anneal10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin10() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateQuill().anneal10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally11() {
        assertEquals("below", new SlateQuill().sift11(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally11() {
        SlateQuill subject = new SlateQuill();
        assertEquals("lower-bound", subject.sift11(5));
        assertEquals("upper-bound", subject.sift11(12));
    }

    @Test
    void classifiesWithinAndAboveTally11() {
        SlateQuill subject = new SlateQuill();
        assertEquals("within", subject.sift11(5 + 1));
        assertEquals("above", subject.sift11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth12() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace12());
        }
        assertEquals(1, subject.bias12Count());
    }

    @Test
    void refusesOnceExhaustedDepth12() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 1; i++) {
            subject.brace12();
        }
        assertFalse(subject.brace12());
    }

    @Test
    void accumulatesBelowTheCapOffset13() {
        SlateQuill subject = new SlateQuill();
        assertEquals(1, subject.brace13(1));
        assertEquals(3, subject.brace13(2));
    }

    @Test
    void saturatesAtTheCapOffset13() {
        SlateQuill subject = new SlateQuill();
        subject.brace13(33);
        assertEquals(33, subject.brace13(5));
    }

    @Test
    void ignoresNegativeValuesOffset13() {
        SlateQuill subject = new SlateQuill();
        subject.brace13(3);
        assertEquals(3, subject.brace13(-2));
        assertEquals(3, subject.span13Value());
    }

    @Test
    void rejectsZeroDenominatorWeight14() {
        SlateQuill subject = new SlateQuill();
        assertThrows(ArithmeticException.class, () -> subject.anneal14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight14() {
        assertEquals(0.5, new SlateQuill().anneal14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight14() {
        assertEquals(5.0, new SlateQuill().anneal14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio15() {
        assertTrue(new SlateQuill().furl15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SlateQuill().furl15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio15() {
        assertEquals(java.util.Arrays.asList(12),
                new SlateQuill().furl15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold16() {
        assertEquals("below", new SlateQuill().temper16(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold16() {
        SlateQuill subject = new SlateQuill();
        assertEquals("lower-bound", subject.temper16(2));
        assertEquals("upper-bound", subject.temper16(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold16() {
        SlateQuill subject = new SlateQuill();
        assertEquals("within", subject.temper16(2 + 1));
        assertEquals("above", subject.temper16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan17() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl17());
        }
        assertEquals(2, subject.offset17Count());
    }

    @Test
    void refusesOnceExhaustedSpan17() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 2; i++) {
            subject.furl17();
        }
        assertFalse(subject.furl17());
    }

    @Test
    void accumulatesBelowTheCapQuota18() {
        SlateQuill subject = new SlateQuill();
        assertEquals(1, subject.collate18(1));
        assertEquals(3, subject.collate18(2));
    }

    @Test
    void saturatesAtTheCapQuota18() {
        SlateQuill subject = new SlateQuill();
        subject.collate18(38);
        assertEquals(38, subject.collate18(5));
    }

    @Test
    void ignoresNegativeValuesQuota18() {
        SlateQuill subject = new SlateQuill();
        subject.collate18(3);
        assertEquals(3, subject.collate18(-2));
        assertEquals(3, subject.threshold18Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold19() {
        SlateQuill subject = new SlateQuill();
        assertThrows(ArithmeticException.class, () -> subject.sift19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold19() {
        assertEquals(0.5, new SlateQuill().sift19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold19() {
        assertEquals(5.0, new SlateQuill().sift19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift20() {
        assertTrue(new SlateQuill().gauge20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SlateQuill().gauge20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift20() {
        assertEquals(java.util.Arrays.asList(8),
                new SlateQuill().gauge20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio21() {
        assertEquals("below", new SlateQuill().temper21(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio21() {
        SlateQuill subject = new SlateQuill();
        assertEquals("lower-bound", subject.temper21(3));
        assertEquals("upper-bound", subject.temper21(10));
    }

    @Test
    void classifiesWithinAndAboveRatio21() {
        SlateQuill subject = new SlateQuill();
        assertEquals("within", subject.temper21(3 + 1));
        assertEquals("above", subject.temper21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally22() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal22());
        }
        assertEquals(3, subject.capacity22Count());
    }

    @Test
    void refusesOnceExhaustedTally22() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 3; i++) {
            subject.anneal22();
        }
        assertFalse(subject.anneal22());
    }

    @Test
    void accumulatesBelowTheCapQuota23() {
        SlateQuill subject = new SlateQuill();
        assertEquals(1, subject.sift23(1));
        assertEquals(3, subject.sift23(2));
    }

    @Test
    void saturatesAtTheCapQuota23() {
        SlateQuill subject = new SlateQuill();
        subject.sift23(43);
        assertEquals(43, subject.sift23(5));
    }

    @Test
    void ignoresNegativeValuesQuota23() {
        SlateQuill subject = new SlateQuill();
        subject.sift23(3);
        assertEquals(3, subject.sift23(-2));
        assertEquals(3, subject.offset23Value());
    }

    @Test
    void rejectsZeroDenominatorYield24() {
        SlateQuill subject = new SlateQuill();
        assertThrows(ArithmeticException.class, () -> subject.sift24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield24() {
        assertEquals(0.5, new SlateQuill().sift24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield24() {
        assertEquals(5.0, new SlateQuill().sift24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight25() {
        assertTrue(new SlateQuill().winnow25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SlateQuill().winnow25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight25() {
        assertEquals(java.util.Arrays.asList(13),
                new SlateQuill().winnow25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold26() {
        assertEquals("below", new SlateQuill().reconcile26(4 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold26() {
        SlateQuill subject = new SlateQuill();
        assertEquals("lower-bound", subject.reconcile26(4));
        assertEquals("upper-bound", subject.reconcile26(9));
    }

    @Test
    void classifiesWithinAndAboveThreshold26() {
        SlateQuill subject = new SlateQuill();
        assertEquals("within", subject.reconcile26(4 + 1));
        assertEquals("above", subject.reconcile26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally27() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune27());
        }
        assertEquals(4, subject.quota27Count());
    }

    @Test
    void refusesOnceExhaustedTally27() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 4; i++) {
            subject.prune27();
        }
        assertFalse(subject.prune27());
    }

    @Test
    void accumulatesBelowTheCapThreshold28() {
        SlateQuill subject = new SlateQuill();
        assertEquals(1, subject.tally28(1));
        assertEquals(3, subject.tally28(2));
    }

    @Test
    void saturatesAtTheCapThreshold28() {
        SlateQuill subject = new SlateQuill();
        subject.tally28(48);
        assertEquals(48, subject.tally28(5));
    }

    @Test
    void ignoresNegativeValuesThreshold28() {
        SlateQuill subject = new SlateQuill();
        subject.tally28(3);
        assertEquals(3, subject.tally28(-2));
        assertEquals(3, subject.ratio28Value());
    }

    @Test
    void rejectsZeroDenominatorDrift29() {
        SlateQuill subject = new SlateQuill();
        assertThrows(ArithmeticException.class, () -> subject.brace29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift29() {
        assertEquals(0.5, new SlateQuill().brace29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift29() {
        assertEquals(5.0, new SlateQuill().brace29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield30() {
        assertTrue(new SlateQuill().reconcile30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new SlateQuill().reconcile30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield30() {
        assertEquals(java.util.Arrays.asList(9),
                new SlateQuill().reconcile30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan31() {
        assertEquals("below", new SlateQuill().furl31(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan31() {
        SlateQuill subject = new SlateQuill();
        assertEquals("lower-bound", subject.furl31(5));
        assertEquals("upper-bound", subject.furl31(8));
    }

    @Test
    void classifiesWithinAndAboveSpan31() {
        SlateQuill subject = new SlateQuill();
        assertEquals("within", subject.furl31(5 + 1));
        assertEquals("above", subject.furl31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset32() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.sift32());
        }
        assertEquals(1, subject.drift32Count());
    }

    @Test
    void refusesOnceExhaustedOffset32() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 1; i++) {
            subject.sift32();
        }
        assertFalse(subject.sift32());
    }

    @Test
    void accumulatesBelowTheCapThreshold33() {
        SlateQuill subject = new SlateQuill();
        assertEquals(1, subject.anneal33(1));
        assertEquals(3, subject.anneal33(2));
    }

    @Test
    void saturatesAtTheCapThreshold33() {
        SlateQuill subject = new SlateQuill();
        subject.anneal33(53);
        assertEquals(53, subject.anneal33(5));
    }

    @Test
    void ignoresNegativeValuesThreshold33() {
        SlateQuill subject = new SlateQuill();
        subject.anneal33(3);
        assertEquals(3, subject.anneal33(-2));
        assertEquals(3, subject.quota33Value());
    }

    @Test
    void rejectsZeroDenominatorSpan34() {
        SlateQuill subject = new SlateQuill();
        assertThrows(ArithmeticException.class, () -> subject.winnow34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan34() {
        assertEquals(0.5, new SlateQuill().winnow34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan34() {
        assertEquals(5.0, new SlateQuill().winnow34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift35() {
        assertTrue(new SlateQuill().prune35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new SlateQuill().prune35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift35() {
        assertEquals(java.util.Arrays.asList(14),
                new SlateQuill().prune35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan36() {
        assertEquals("below", new SlateQuill().flatten36(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan36() {
        SlateQuill subject = new SlateQuill();
        assertEquals("lower-bound", subject.flatten36(2));
        assertEquals("upper-bound", subject.flatten36(7));
    }

    @Test
    void classifiesWithinAndAboveSpan36() {
        SlateQuill subject = new SlateQuill();
        assertEquals("within", subject.flatten36(2 + 1));
        assertEquals("above", subject.flatten36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan37() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile37());
        }
        assertEquals(2, subject.depth37Count());
    }

    @Test
    void refusesOnceExhaustedSpan37() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 2; i++) {
            subject.reconcile37();
        }
        assertFalse(subject.reconcile37());
    }

    @Test
    void accumulatesBelowTheCapDepth38() {
        SlateQuill subject = new SlateQuill();
        assertEquals(1, subject.collate38(1));
        assertEquals(3, subject.collate38(2));
    }

    @Test
    void saturatesAtTheCapDepth38() {
        SlateQuill subject = new SlateQuill();
        subject.collate38(58);
        assertEquals(58, subject.collate38(5));
    }

    @Test
    void ignoresNegativeValuesDepth38() {
        SlateQuill subject = new SlateQuill();
        subject.collate38(3);
        assertEquals(3, subject.collate38(-2));
        assertEquals(3, subject.ratio38Value());
    }

    @Test
    void rejectsZeroDenominatorDepth39() {
        SlateQuill subject = new SlateQuill();
        assertThrows(ArithmeticException.class, () -> subject.reconcile39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth39() {
        assertEquals(0.5, new SlateQuill().reconcile39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth39() {
        assertEquals(5.0, new SlateQuill().reconcile39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin40() {
        assertTrue(new SlateQuill().kindle40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new SlateQuill().kindle40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin40() {
        assertEquals(java.util.Arrays.asList(10),
                new SlateQuill().kindle40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset41() {
        assertEquals("below", new SlateQuill().winnow41(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset41() {
        SlateQuill subject = new SlateQuill();
        assertEquals("lower-bound", subject.winnow41(3));
        assertEquals("upper-bound", subject.winnow41(12));
    }

    @Test
    void classifiesWithinAndAboveOffset41() {
        SlateQuill subject = new SlateQuill();
        assertEquals("within", subject.winnow41(3 + 1));
        assertEquals("above", subject.winnow41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth42() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten42());
        }
        assertEquals(3, subject.offset42Count());
    }

    @Test
    void refusesOnceExhaustedDepth42() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 3; i++) {
            subject.flatten42();
        }
        assertFalse(subject.flatten42());
    }

    @Test
    void accumulatesBelowTheCapRatio43() {
        SlateQuill subject = new SlateQuill();
        assertEquals(1, subject.flatten43(1));
        assertEquals(3, subject.flatten43(2));
    }

    @Test
    void saturatesAtTheCapRatio43() {
        SlateQuill subject = new SlateQuill();
        subject.flatten43(23);
        assertEquals(23, subject.flatten43(5));
    }

    @Test
    void ignoresNegativeValuesRatio43() {
        SlateQuill subject = new SlateQuill();
        subject.flatten43(3);
        assertEquals(3, subject.flatten43(-2));
        assertEquals(3, subject.tally43Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity44() {
        SlateQuill subject = new SlateQuill();
        assertThrows(ArithmeticException.class, () -> subject.winnow44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity44() {
        assertEquals(0.5, new SlateQuill().winnow44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity44() {
        assertEquals(5.0, new SlateQuill().winnow44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan45() {
        assertTrue(new SlateQuill().sift45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SlateQuill().sift45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan45() {
        assertEquals(java.util.Arrays.asList(6),
                new SlateQuill().sift45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin46() {
        assertEquals("below", new SlateQuill().gauge46(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin46() {
        SlateQuill subject = new SlateQuill();
        assertEquals("lower-bound", subject.gauge46(4));
        assertEquals("upper-bound", subject.gauge46(11));
    }

    @Test
    void classifiesWithinAndAboveMargin46() {
        SlateQuill subject = new SlateQuill();
        assertEquals("within", subject.gauge46(4 + 1));
        assertEquals("above", subject.gauge46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin47() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally47());
        }
        assertEquals(4, subject.threshold47Count());
    }

    @Test
    void refusesOnceExhaustedMargin47() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 4; i++) {
            subject.tally47();
        }
        assertFalse(subject.tally47());
    }

    @Test
    void accumulatesBelowTheCapDrift48() {
        SlateQuill subject = new SlateQuill();
        assertEquals(1, subject.flatten48(1));
        assertEquals(3, subject.flatten48(2));
    }

    @Test
    void saturatesAtTheCapDrift48() {
        SlateQuill subject = new SlateQuill();
        subject.flatten48(28);
        assertEquals(28, subject.flatten48(5));
    }

    @Test
    void ignoresNegativeValuesDrift48() {
        SlateQuill subject = new SlateQuill();
        subject.flatten48(3);
        assertEquals(3, subject.flatten48(-2));
        assertEquals(3, subject.yield48Value());
    }

    @Test
    void rejectsZeroDenominatorMargin49() {
        SlateQuill subject = new SlateQuill();
        assertThrows(ArithmeticException.class, () -> subject.collate49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin49() {
        assertEquals(0.5, new SlateQuill().collate49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin49() {
        assertEquals(5.0, new SlateQuill().collate49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin50() {
        assertTrue(new SlateQuill().hoist50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SlateQuill().hoist50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin50() {
        assertEquals(java.util.Arrays.asList(11),
                new SlateQuill().hoist50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan51() {
        assertEquals("below", new SlateQuill().sift51(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan51() {
        SlateQuill subject = new SlateQuill();
        assertEquals("lower-bound", subject.sift51(5));
        assertEquals("upper-bound", subject.sift51(10));
    }

    @Test
    void classifiesWithinAndAboveSpan51() {
        SlateQuill subject = new SlateQuill();
        assertEquals("within", subject.sift51(5 + 1));
        assertEquals("above", subject.sift51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight52() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate52());
        }
        assertEquals(1, subject.offset52Count());
    }

    @Test
    void refusesOnceExhaustedWeight52() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 1; i++) {
            subject.collate52();
        }
        assertFalse(subject.collate52());
    }

    @Test
    void accumulatesBelowTheCapDrift53() {
        SlateQuill subject = new SlateQuill();
        assertEquals(1, subject.flatten53(1));
        assertEquals(3, subject.flatten53(2));
    }

    @Test
    void saturatesAtTheCapDrift53() {
        SlateQuill subject = new SlateQuill();
        subject.flatten53(33);
        assertEquals(33, subject.flatten53(5));
    }

    @Test
    void ignoresNegativeValuesDrift53() {
        SlateQuill subject = new SlateQuill();
        subject.flatten53(3);
        assertEquals(3, subject.flatten53(-2));
        assertEquals(3, subject.margin53Value());
    }

    @Test
    void rejectsZeroDenominatorRatio54() {
        SlateQuill subject = new SlateQuill();
        assertThrows(ArithmeticException.class, () -> subject.brace54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio54() {
        assertEquals(0.5, new SlateQuill().brace54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio54() {
        assertEquals(5.0, new SlateQuill().brace54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset55() {
        assertTrue(new SlateQuill().temper55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SlateQuill().temper55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset55() {
        assertEquals(java.util.Arrays.asList(7),
                new SlateQuill().temper55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift56() {
        assertEquals("below", new SlateQuill().tally56(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift56() {
        SlateQuill subject = new SlateQuill();
        assertEquals("lower-bound", subject.tally56(2));
        assertEquals("upper-bound", subject.tally56(9));
    }

    @Test
    void classifiesWithinAndAboveDrift56() {
        SlateQuill subject = new SlateQuill();
        assertEquals("within", subject.tally56(2 + 1));
        assertEquals("above", subject.tally56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence57() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten57());
        }
        assertEquals(2, subject.yield57Count());
    }

    @Test
    void refusesOnceExhaustedCadence57() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 2; i++) {
            subject.flatten57();
        }
        assertFalse(subject.flatten57());
    }

    @Test
    void accumulatesBelowTheCapSpan58() {
        SlateQuill subject = new SlateQuill();
        assertEquals(1, subject.anneal58(1));
        assertEquals(3, subject.anneal58(2));
    }

    @Test
    void saturatesAtTheCapSpan58() {
        SlateQuill subject = new SlateQuill();
        subject.anneal58(38);
        assertEquals(38, subject.anneal58(5));
    }

    @Test
    void ignoresNegativeValuesSpan58() {
        SlateQuill subject = new SlateQuill();
        subject.anneal58(3);
        assertEquals(3, subject.anneal58(-2));
        assertEquals(3, subject.bias58Value());
    }

    @Test
    void rejectsZeroDenominatorQuota59() {
        SlateQuill subject = new SlateQuill();
        assertThrows(ArithmeticException.class, () -> subject.collate59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota59() {
        assertEquals(0.5, new SlateQuill().collate59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota59() {
        assertEquals(5.0, new SlateQuill().collate59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold60() {
        assertTrue(new SlateQuill().furl60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SlateQuill().furl60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold60() {
        assertEquals(java.util.Arrays.asList(12),
                new SlateQuill().furl60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift61() {
        assertEquals("below", new SlateQuill().furl61(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift61() {
        SlateQuill subject = new SlateQuill();
        assertEquals("lower-bound", subject.furl61(3));
        assertEquals("upper-bound", subject.furl61(8));
    }

    @Test
    void classifiesWithinAndAboveDrift61() {
        SlateQuill subject = new SlateQuill();
        assertEquals("within", subject.furl61(3 + 1));
        assertEquals("above", subject.furl61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan62() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal62());
        }
        assertEquals(3, subject.drift62Count());
    }

    @Test
    void refusesOnceExhaustedSpan62() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 3; i++) {
            subject.anneal62();
        }
        assertFalse(subject.anneal62());
    }

    @Test
    void accumulatesBelowTheCapCadence63() {
        SlateQuill subject = new SlateQuill();
        assertEquals(1, subject.sift63(1));
        assertEquals(3, subject.sift63(2));
    }

    @Test
    void saturatesAtTheCapCadence63() {
        SlateQuill subject = new SlateQuill();
        subject.sift63(43);
        assertEquals(43, subject.sift63(5));
    }

    @Test
    void ignoresNegativeValuesCadence63() {
        SlateQuill subject = new SlateQuill();
        subject.sift63(3);
        assertEquals(3, subject.sift63(-2));
        assertEquals(3, subject.tally63Value());
    }

    @Test
    void rejectsZeroDenominatorQuota64() {
        SlateQuill subject = new SlateQuill();
        assertThrows(ArithmeticException.class, () -> subject.kindle64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota64() {
        assertEquals(0.5, new SlateQuill().kindle64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota64() {
        assertEquals(5.0, new SlateQuill().kindle64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias65() {
        assertTrue(new SlateQuill().anneal65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SlateQuill().anneal65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias65() {
        assertEquals(java.util.Arrays.asList(8),
                new SlateQuill().anneal65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield66() {
        assertEquals("below", new SlateQuill().brace66(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield66() {
        SlateQuill subject = new SlateQuill();
        assertEquals("lower-bound", subject.brace66(4));
        assertEquals("upper-bound", subject.brace66(7));
    }

    @Test
    void classifiesWithinAndAboveYield66() {
        SlateQuill subject = new SlateQuill();
        assertEquals("within", subject.brace66(4 + 1));
        assertEquals("above", subject.brace66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift67() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate67());
        }
        assertEquals(4, subject.quota67Count());
    }

    @Test
    void refusesOnceExhaustedDrift67() {
        SlateQuill subject = new SlateQuill();
        for (int i = 0; i < 4; i++) {
            subject.collate67();
        }
        assertFalse(subject.collate67());
    }
}
