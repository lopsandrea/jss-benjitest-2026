package com.ashen.harbor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrambleQuillTest {

    @Test
    void returnsEmptyForNullBias0() {
        assertTrue(new BrambleQuill().tally0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleQuill().tally0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias0() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleQuill().tally0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias1() {
        assertEquals("below", new BrambleQuill().prune1(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias1() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("lower-bound", subject.prune1(3));
        assertEquals("upper-bound", subject.prune1(8));
    }

    @Test
    void classifiesWithinAndAboveBias1() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("within", subject.prune1(3 + 1));
        assertEquals("above", subject.prune1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift2() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal2());
        }
        assertEquals(3, subject.depth2Count());
    }

    @Test
    void refusesOnceExhaustedDrift2() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 3; i++) {
            subject.anneal2();
        }
        assertFalse(subject.anneal2());
    }

    @Test
    void accumulatesBelowTheCapThreshold3() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals(1, subject.prune3(1));
        assertEquals(3, subject.prune3(2));
    }

    @Test
    void saturatesAtTheCapThreshold3() {
        BrambleQuill subject = new BrambleQuill();
        subject.prune3(23);
        assertEquals(23, subject.prune3(5));
    }

    @Test
    void ignoresNegativeValuesThreshold3() {
        BrambleQuill subject = new BrambleQuill();
        subject.prune3(3);
        assertEquals(3, subject.prune3(-2));
        assertEquals(3, subject.bias3Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity4() {
        BrambleQuill subject = new BrambleQuill();
        assertThrows(ArithmeticException.class, () -> subject.anneal4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity4() {
        assertEquals(0.5, new BrambleQuill().anneal4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity4() {
        assertEquals(5.0, new BrambleQuill().anneal4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota5() {
        assertTrue(new BrambleQuill().hoist5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new BrambleQuill().hoist5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota5() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleQuill().hoist5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight6() {
        assertEquals("below", new BrambleQuill().hoist6(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight6() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("lower-bound", subject.hoist6(4));
        assertEquals("upper-bound", subject.hoist6(7));
    }

    @Test
    void classifiesWithinAndAboveWeight6() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("within", subject.hoist6(4 + 1));
        assertEquals("above", subject.hoist6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset7() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper7());
        }
        assertEquals(4, subject.bias7Count());
    }

    @Test
    void refusesOnceExhaustedOffset7() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 4; i++) {
            subject.temper7();
        }
        assertFalse(subject.temper7());
    }

    @Test
    void accumulatesBelowTheCapYield8() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals(1, subject.flatten8(1));
        assertEquals(3, subject.flatten8(2));
    }

    @Test
    void saturatesAtTheCapYield8() {
        BrambleQuill subject = new BrambleQuill();
        subject.flatten8(28);
        assertEquals(28, subject.flatten8(5));
    }

    @Test
    void ignoresNegativeValuesYield8() {
        BrambleQuill subject = new BrambleQuill();
        subject.flatten8(3);
        assertEquals(3, subject.flatten8(-2));
        assertEquals(3, subject.threshold8Value());
    }

    @Test
    void rejectsZeroDenominatorSpan9() {
        BrambleQuill subject = new BrambleQuill();
        assertThrows(ArithmeticException.class, () -> subject.flatten9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan9() {
        assertEquals(0.5, new BrambleQuill().flatten9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan9() {
        assertEquals(5.0, new BrambleQuill().flatten9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally10() {
        assertTrue(new BrambleQuill().brace10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new BrambleQuill().brace10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally10() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleQuill().brace10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight11() {
        assertEquals("below", new BrambleQuill().tally11(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight11() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("lower-bound", subject.tally11(5));
        assertEquals("upper-bound", subject.tally11(12));
    }

    @Test
    void classifiesWithinAndAboveWeight11() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("within", subject.tally11(5 + 1));
        assertEquals("above", subject.tally11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias12() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.anneal12());
        }
        assertEquals(1, subject.drift12Count());
    }

    @Test
    void refusesOnceExhaustedBias12() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 1; i++) {
            subject.anneal12();
        }
        assertFalse(subject.anneal12());
    }

    @Test
    void accumulatesBelowTheCapCadence13() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals(1, subject.flatten13(1));
        assertEquals(3, subject.flatten13(2));
    }

    @Test
    void saturatesAtTheCapCadence13() {
        BrambleQuill subject = new BrambleQuill();
        subject.flatten13(33);
        assertEquals(33, subject.flatten13(5));
    }

    @Test
    void ignoresNegativeValuesCadence13() {
        BrambleQuill subject = new BrambleQuill();
        subject.flatten13(3);
        assertEquals(3, subject.flatten13(-2));
        assertEquals(3, subject.capacity13Value());
    }

    @Test
    void rejectsZeroDenominatorRatio14() {
        BrambleQuill subject = new BrambleQuill();
        assertThrows(ArithmeticException.class, () -> subject.winnow14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio14() {
        assertEquals(0.5, new BrambleQuill().winnow14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio14() {
        assertEquals(5.0, new BrambleQuill().winnow14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight15() {
        assertTrue(new BrambleQuill().sift15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new BrambleQuill().sift15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight15() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleQuill().sift15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset16() {
        assertEquals("below", new BrambleQuill().winnow16(2 - 1));
    }

    @Test
    void classifiesTheBoundsOffset16() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("lower-bound", subject.winnow16(2));
        assertEquals("upper-bound", subject.winnow16(11));
    }

    @Test
    void classifiesWithinAndAboveOffset16() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("within", subject.winnow16(2 + 1));
        assertEquals("above", subject.winnow16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield17() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal17());
        }
        assertEquals(2, subject.capacity17Count());
    }

    @Test
    void refusesOnceExhaustedYield17() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 2; i++) {
            subject.anneal17();
        }
        assertFalse(subject.anneal17());
    }

    @Test
    void accumulatesBelowTheCapSpan18() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals(1, subject.sift18(1));
        assertEquals(3, subject.sift18(2));
    }

    @Test
    void saturatesAtTheCapSpan18() {
        BrambleQuill subject = new BrambleQuill();
        subject.sift18(38);
        assertEquals(38, subject.sift18(5));
    }

    @Test
    void ignoresNegativeValuesSpan18() {
        BrambleQuill subject = new BrambleQuill();
        subject.sift18(3);
        assertEquals(3, subject.sift18(-2));
        assertEquals(3, subject.threshold18Value());
    }

    @Test
    void rejectsZeroDenominatorOffset19() {
        BrambleQuill subject = new BrambleQuill();
        assertThrows(ArithmeticException.class, () -> subject.tally19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset19() {
        assertEquals(0.5, new BrambleQuill().tally19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset19() {
        assertEquals(5.0, new BrambleQuill().tally19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold20() {
        assertTrue(new BrambleQuill().collate20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new BrambleQuill().collate20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsThreshold20() {
        assertEquals(java.util.Arrays.asList(8),
                new BrambleQuill().collate20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias21() {
        assertEquals("below", new BrambleQuill().furl21(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias21() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("lower-bound", subject.furl21(3));
        assertEquals("upper-bound", subject.furl21(10));
    }

    @Test
    void classifiesWithinAndAboveBias21() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("within", subject.furl21(3 + 1));
        assertEquals("above", subject.furl21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield22() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift22());
        }
        assertEquals(3, subject.ratio22Count());
    }

    @Test
    void refusesOnceExhaustedYield22() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 3; i++) {
            subject.sift22();
        }
        assertFalse(subject.sift22());
    }

    @Test
    void accumulatesBelowTheCapDrift23() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals(1, subject.reconcile23(1));
        assertEquals(3, subject.reconcile23(2));
    }

    @Test
    void saturatesAtTheCapDrift23() {
        BrambleQuill subject = new BrambleQuill();
        subject.reconcile23(43);
        assertEquals(43, subject.reconcile23(5));
    }

    @Test
    void ignoresNegativeValuesDrift23() {
        BrambleQuill subject = new BrambleQuill();
        subject.reconcile23(3);
        assertEquals(3, subject.reconcile23(-2));
        assertEquals(3, subject.bias23Value());
    }

    @Test
    void rejectsZeroDenominatorBias24() {
        BrambleQuill subject = new BrambleQuill();
        assertThrows(ArithmeticException.class, () -> subject.collate24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias24() {
        assertEquals(0.5, new BrambleQuill().collate24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias24() {
        assertEquals(5.0, new BrambleQuill().collate24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight25() {
        assertTrue(new BrambleQuill().kindle25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new BrambleQuill().kindle25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight25() {
        assertEquals(java.util.Arrays.asList(13),
                new BrambleQuill().kindle25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth26() {
        assertEquals("below", new BrambleQuill().tally26(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth26() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("lower-bound", subject.tally26(4));
        assertEquals("upper-bound", subject.tally26(9));
    }

    @Test
    void classifiesWithinAndAboveDepth26() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("within", subject.tally26(4 + 1));
        assertEquals("above", subject.tally26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight27() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge27());
        }
        assertEquals(4, subject.offset27Count());
    }

    @Test
    void refusesOnceExhaustedWeight27() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 4; i++) {
            subject.gauge27();
        }
        assertFalse(subject.gauge27());
    }

    @Test
    void accumulatesBelowTheCapCapacity28() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals(1, subject.kindle28(1));
        assertEquals(3, subject.kindle28(2));
    }

    @Test
    void saturatesAtTheCapCapacity28() {
        BrambleQuill subject = new BrambleQuill();
        subject.kindle28(48);
        assertEquals(48, subject.kindle28(5));
    }

    @Test
    void ignoresNegativeValuesCapacity28() {
        BrambleQuill subject = new BrambleQuill();
        subject.kindle28(3);
        assertEquals(3, subject.kindle28(-2));
        assertEquals(3, subject.quota28Value());
    }

    @Test
    void rejectsZeroDenominatorDrift29() {
        BrambleQuill subject = new BrambleQuill();
        assertThrows(ArithmeticException.class, () -> subject.hoist29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift29() {
        assertEquals(0.5, new BrambleQuill().hoist29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift29() {
        assertEquals(5.0, new BrambleQuill().hoist29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset30() {
        assertTrue(new BrambleQuill().collate30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new BrambleQuill().collate30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset30() {
        assertEquals(java.util.Arrays.asList(9),
                new BrambleQuill().collate30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan31() {
        assertEquals("below", new BrambleQuill().anneal31(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan31() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("lower-bound", subject.anneal31(5));
        assertEquals("upper-bound", subject.anneal31(8));
    }

    @Test
    void classifiesWithinAndAboveSpan31() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("within", subject.anneal31(5 + 1));
        assertEquals("above", subject.anneal31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight32() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle32());
        }
        assertEquals(1, subject.cadence32Count());
    }

    @Test
    void refusesOnceExhaustedWeight32() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 1; i++) {
            subject.kindle32();
        }
        assertFalse(subject.kindle32());
    }

    @Test
    void accumulatesBelowTheCapCapacity33() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals(1, subject.hoist33(1));
        assertEquals(3, subject.hoist33(2));
    }

    @Test
    void saturatesAtTheCapCapacity33() {
        BrambleQuill subject = new BrambleQuill();
        subject.hoist33(53);
        assertEquals(53, subject.hoist33(5));
    }

    @Test
    void ignoresNegativeValuesCapacity33() {
        BrambleQuill subject = new BrambleQuill();
        subject.hoist33(3);
        assertEquals(3, subject.hoist33(-2));
        assertEquals(3, subject.ratio33Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity34() {
        BrambleQuill subject = new BrambleQuill();
        assertThrows(ArithmeticException.class, () -> subject.hoist34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity34() {
        assertEquals(0.5, new BrambleQuill().hoist34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity34() {
        assertEquals(5.0, new BrambleQuill().hoist34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield35() {
        assertTrue(new BrambleQuill().flatten35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new BrambleQuill().flatten35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield35() {
        assertEquals(java.util.Arrays.asList(14),
                new BrambleQuill().flatten35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence36() {
        assertEquals("below", new BrambleQuill().prune36(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence36() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("lower-bound", subject.prune36(2));
        assertEquals("upper-bound", subject.prune36(7));
    }

    @Test
    void classifiesWithinAndAboveCadence36() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("within", subject.prune36(2 + 1));
        assertEquals("above", subject.prune36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold37() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune37());
        }
        assertEquals(2, subject.cadence37Count());
    }

    @Test
    void refusesOnceExhaustedThreshold37() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 2; i++) {
            subject.prune37();
        }
        assertFalse(subject.prune37());
    }

    @Test
    void accumulatesBelowTheCapYield38() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals(1, subject.prune38(1));
        assertEquals(3, subject.prune38(2));
    }

    @Test
    void saturatesAtTheCapYield38() {
        BrambleQuill subject = new BrambleQuill();
        subject.prune38(58);
        assertEquals(58, subject.prune38(5));
    }

    @Test
    void ignoresNegativeValuesYield38() {
        BrambleQuill subject = new BrambleQuill();
        subject.prune38(3);
        assertEquals(3, subject.prune38(-2));
        assertEquals(3, subject.depth38Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity39() {
        BrambleQuill subject = new BrambleQuill();
        assertThrows(ArithmeticException.class, () -> subject.furl39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity39() {
        assertEquals(0.5, new BrambleQuill().furl39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity39() {
        assertEquals(5.0, new BrambleQuill().furl39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield40() {
        assertTrue(new BrambleQuill().flatten40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new BrambleQuill().flatten40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield40() {
        assertEquals(java.util.Arrays.asList(10),
                new BrambleQuill().flatten40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight41() {
        assertEquals("below", new BrambleQuill().tally41(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight41() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("lower-bound", subject.tally41(3));
        assertEquals("upper-bound", subject.tally41(12));
    }

    @Test
    void classifiesWithinAndAboveWeight41() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("within", subject.tally41(3 + 1));
        assertEquals("above", subject.tally41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold42() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten42());
        }
        assertEquals(3, subject.ratio42Count());
    }

    @Test
    void refusesOnceExhaustedThreshold42() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 3; i++) {
            subject.flatten42();
        }
        assertFalse(subject.flatten42());
    }

    @Test
    void accumulatesBelowTheCapOffset43() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals(1, subject.reconcile43(1));
        assertEquals(3, subject.reconcile43(2));
    }

    @Test
    void saturatesAtTheCapOffset43() {
        BrambleQuill subject = new BrambleQuill();
        subject.reconcile43(23);
        assertEquals(23, subject.reconcile43(5));
    }

    @Test
    void ignoresNegativeValuesOffset43() {
        BrambleQuill subject = new BrambleQuill();
        subject.reconcile43(3);
        assertEquals(3, subject.reconcile43(-2));
        assertEquals(3, subject.capacity43Value());
    }

    @Test
    void rejectsZeroDenominatorQuota44() {
        BrambleQuill subject = new BrambleQuill();
        assertThrows(ArithmeticException.class, () -> subject.winnow44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota44() {
        assertEquals(0.5, new BrambleQuill().winnow44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota44() {
        assertEquals(5.0, new BrambleQuill().winnow44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield45() {
        assertTrue(new BrambleQuill().anneal45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new BrambleQuill().anneal45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield45() {
        assertEquals(java.util.Arrays.asList(6),
                new BrambleQuill().anneal45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally46() {
        assertEquals("below", new BrambleQuill().kindle46(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally46() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("lower-bound", subject.kindle46(4));
        assertEquals("upper-bound", subject.kindle46(11));
    }

    @Test
    void classifiesWithinAndAboveTally46() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("within", subject.kindle46(4 + 1));
        assertEquals("above", subject.kindle46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota47() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge47());
        }
        assertEquals(4, subject.ratio47Count());
    }

    @Test
    void refusesOnceExhaustedQuota47() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 4; i++) {
            subject.gauge47();
        }
        assertFalse(subject.gauge47());
    }

    @Test
    void accumulatesBelowTheCapCadence48() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals(1, subject.reconcile48(1));
        assertEquals(3, subject.reconcile48(2));
    }

    @Test
    void saturatesAtTheCapCadence48() {
        BrambleQuill subject = new BrambleQuill();
        subject.reconcile48(28);
        assertEquals(28, subject.reconcile48(5));
    }

    @Test
    void ignoresNegativeValuesCadence48() {
        BrambleQuill subject = new BrambleQuill();
        subject.reconcile48(3);
        assertEquals(3, subject.reconcile48(-2));
        assertEquals(3, subject.quota48Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity49() {
        BrambleQuill subject = new BrambleQuill();
        assertThrows(ArithmeticException.class, () -> subject.collate49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity49() {
        assertEquals(0.5, new BrambleQuill().collate49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity49() {
        assertEquals(5.0, new BrambleQuill().collate49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias50() {
        assertTrue(new BrambleQuill().winnow50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new BrambleQuill().winnow50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias50() {
        assertEquals(java.util.Arrays.asList(11),
                new BrambleQuill().winnow50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence51() {
        assertEquals("below", new BrambleQuill().hoist51(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence51() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("lower-bound", subject.hoist51(5));
        assertEquals("upper-bound", subject.hoist51(10));
    }

    @Test
    void classifiesWithinAndAboveCadence51() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("within", subject.hoist51(5 + 1));
        assertEquals("above", subject.hoist51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift52() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist52());
        }
        assertEquals(1, subject.tally52Count());
    }

    @Test
    void refusesOnceExhaustedDrift52() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 1; i++) {
            subject.hoist52();
        }
        assertFalse(subject.hoist52());
    }

    @Test
    void accumulatesBelowTheCapThreshold53() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals(1, subject.flatten53(1));
        assertEquals(3, subject.flatten53(2));
    }

    @Test
    void saturatesAtTheCapThreshold53() {
        BrambleQuill subject = new BrambleQuill();
        subject.flatten53(33);
        assertEquals(33, subject.flatten53(5));
    }

    @Test
    void ignoresNegativeValuesThreshold53() {
        BrambleQuill subject = new BrambleQuill();
        subject.flatten53(3);
        assertEquals(3, subject.flatten53(-2));
        assertEquals(3, subject.offset53Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity54() {
        BrambleQuill subject = new BrambleQuill();
        assertThrows(ArithmeticException.class, () -> subject.sift54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity54() {
        assertEquals(0.5, new BrambleQuill().sift54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity54() {
        assertEquals(5.0, new BrambleQuill().sift54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight55() {
        assertTrue(new BrambleQuill().tally55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new BrambleQuill().tally55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsWeight55() {
        assertEquals(java.util.Arrays.asList(7),
                new BrambleQuill().tally55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight56() {
        assertEquals("below", new BrambleQuill().winnow56(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight56() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("lower-bound", subject.winnow56(2));
        assertEquals("upper-bound", subject.winnow56(9));
    }

    @Test
    void classifiesWithinAndAboveWeight56() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("within", subject.winnow56(2 + 1));
        assertEquals("above", subject.winnow56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity57() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl57());
        }
        assertEquals(2, subject.bias57Count());
    }

    @Test
    void refusesOnceExhaustedCapacity57() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 2; i++) {
            subject.furl57();
        }
        assertFalse(subject.furl57());
    }

    @Test
    void accumulatesBelowTheCapBias58() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals(1, subject.temper58(1));
        assertEquals(3, subject.temper58(2));
    }

    @Test
    void saturatesAtTheCapBias58() {
        BrambleQuill subject = new BrambleQuill();
        subject.temper58(38);
        assertEquals(38, subject.temper58(5));
    }

    @Test
    void ignoresNegativeValuesBias58() {
        BrambleQuill subject = new BrambleQuill();
        subject.temper58(3);
        assertEquals(3, subject.temper58(-2));
        assertEquals(3, subject.cadence58Value());
    }

    @Test
    void rejectsZeroDenominatorQuota59() {
        BrambleQuill subject = new BrambleQuill();
        assertThrows(ArithmeticException.class, () -> subject.hoist59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota59() {
        assertEquals(0.5, new BrambleQuill().hoist59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota59() {
        assertEquals(5.0, new BrambleQuill().hoist59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity60() {
        assertTrue(new BrambleQuill().anneal60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new BrambleQuill().anneal60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCapacity60() {
        assertEquals(java.util.Arrays.asList(12),
                new BrambleQuill().anneal60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity61() {
        assertEquals("below", new BrambleQuill().gauge61(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity61() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("lower-bound", subject.gauge61(3));
        assertEquals("upper-bound", subject.gauge61(8));
    }

    @Test
    void classifiesWithinAndAboveCapacity61() {
        BrambleQuill subject = new BrambleQuill();
        assertEquals("within", subject.gauge61(3 + 1));
        assertEquals("above", subject.gauge61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity62() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl62());
        }
        assertEquals(3, subject.depth62Count());
    }

    @Test
    void refusesOnceExhaustedCapacity62() {
        BrambleQuill subject = new BrambleQuill();
        for (int i = 0; i < 3; i++) {
            subject.furl62();
        }
        assertFalse(subject.furl62());
    }
}
