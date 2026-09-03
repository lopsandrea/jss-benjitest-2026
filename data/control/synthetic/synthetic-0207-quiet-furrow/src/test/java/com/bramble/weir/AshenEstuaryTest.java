package com.bramble.weir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AshenEstuaryTest {

    @Test
    void returnsEmptyForNullThreshold0() {
        assertTrue(new AshenEstuary().tally0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenEstuary().tally0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsThreshold0() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenEstuary().tally0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio1() {
        assertEquals("below", new AshenEstuary().kindle1(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio1() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.kindle1(3));
        assertEquals("upper-bound", subject.kindle1(8));
    }

    @Test
    void classifiesWithinAndAboveRatio1() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.kindle1(3 + 1));
        assertEquals("above", subject.kindle1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence2() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow2());
        }
        assertEquals(3, subject.quota2Count());
    }

    @Test
    void refusesOnceExhaustedCadence2() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.winnow2();
        }
        assertFalse(subject.winnow2());
    }

    @Test
    void accumulatesBelowTheCapTally3() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.anneal3(1));
        assertEquals(3, subject.anneal3(2));
    }

    @Test
    void saturatesAtTheCapTally3() {
        AshenEstuary subject = new AshenEstuary();
        subject.anneal3(23);
        assertEquals(23, subject.anneal3(5));
    }

    @Test
    void ignoresNegativeValuesTally3() {
        AshenEstuary subject = new AshenEstuary();
        subject.anneal3(3);
        assertEquals(3, subject.anneal3(-2));
        assertEquals(3, subject.yield3Value());
    }

    @Test
    void rejectsZeroDenominatorYield4() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.flatten4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield4() {
        assertEquals(0.5, new AshenEstuary().flatten4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield4() {
        assertEquals(5.0, new AshenEstuary().flatten4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift5() {
        assertTrue(new AshenEstuary().furl5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenEstuary().furl5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift5() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenEstuary().furl5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota6() {
        assertEquals("below", new AshenEstuary().prune6(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota6() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.prune6(4));
        assertEquals("upper-bound", subject.prune6(7));
    }

    @Test
    void classifiesWithinAndAboveQuota6() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.prune6(4 + 1));
        assertEquals("above", subject.prune6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth7() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow7());
        }
        assertEquals(4, subject.yield7Count());
    }

    @Test
    void refusesOnceExhaustedDepth7() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.winnow7();
        }
        assertFalse(subject.winnow7());
    }

    @Test
    void accumulatesBelowTheCapOffset8() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.prune8(1));
        assertEquals(3, subject.prune8(2));
    }

    @Test
    void saturatesAtTheCapOffset8() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune8(28);
        assertEquals(28, subject.prune8(5));
    }

    @Test
    void ignoresNegativeValuesOffset8() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune8(3);
        assertEquals(3, subject.prune8(-2));
        assertEquals(3, subject.quota8Value());
    }

    @Test
    void rejectsZeroDenominatorTally9() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.flatten9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally9() {
        assertEquals(0.5, new AshenEstuary().flatten9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally9() {
        assertEquals(5.0, new AshenEstuary().flatten9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth10() {
        assertTrue(new AshenEstuary().brace10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenEstuary().brace10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth10() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenEstuary().brace10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias11() {
        assertEquals("below", new AshenEstuary().brace11(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias11() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.brace11(5));
        assertEquals("upper-bound", subject.brace11(12));
    }

    @Test
    void classifiesWithinAndAboveBias11() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.brace11(5 + 1));
        assertEquals("above", subject.brace11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield12() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist12());
        }
        assertEquals(1, subject.cadence12Count());
    }

    @Test
    void refusesOnceExhaustedYield12() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.hoist12();
        }
        assertFalse(subject.hoist12());
    }

    @Test
    void accumulatesBelowTheCapSpan13() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.prune13(1));
        assertEquals(3, subject.prune13(2));
    }

    @Test
    void saturatesAtTheCapSpan13() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune13(33);
        assertEquals(33, subject.prune13(5));
    }

    @Test
    void ignoresNegativeValuesSpan13() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune13(3);
        assertEquals(3, subject.prune13(-2));
        assertEquals(3, subject.drift13Value());
    }

    @Test
    void rejectsZeroDenominatorRatio14() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.kindle14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio14() {
        assertEquals(0.5, new AshenEstuary().kindle14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio14() {
        assertEquals(5.0, new AshenEstuary().kindle14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset15() {
        assertTrue(new AshenEstuary().gauge15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenEstuary().gauge15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset15() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenEstuary().gauge15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan16() {
        assertEquals("below", new AshenEstuary().prune16(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan16() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.prune16(2));
        assertEquals("upper-bound", subject.prune16(11));
    }

    @Test
    void classifiesWithinAndAboveSpan16() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.prune16(2 + 1));
        assertEquals("above", subject.prune16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio17() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune17());
        }
        assertEquals(2, subject.tally17Count());
    }

    @Test
    void refusesOnceExhaustedRatio17() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.prune17();
        }
        assertFalse(subject.prune17());
    }

    @Test
    void accumulatesBelowTheCapCapacity18() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.tally18(1));
        assertEquals(3, subject.tally18(2));
    }

    @Test
    void saturatesAtTheCapCapacity18() {
        AshenEstuary subject = new AshenEstuary();
        subject.tally18(38);
        assertEquals(38, subject.tally18(5));
    }

    @Test
    void ignoresNegativeValuesCapacity18() {
        AshenEstuary subject = new AshenEstuary();
        subject.tally18(3);
        assertEquals(3, subject.tally18(-2));
        assertEquals(3, subject.bias18Value());
    }

    @Test
    void rejectsZeroDenominatorSpan19() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.sift19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan19() {
        assertEquals(0.5, new AshenEstuary().sift19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan19() {
        assertEquals(5.0, new AshenEstuary().sift19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield20() {
        assertTrue(new AshenEstuary().brace20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenEstuary().brace20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield20() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenEstuary().brace20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence21() {
        assertEquals("below", new AshenEstuary().tally21(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence21() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.tally21(3));
        assertEquals("upper-bound", subject.tally21(10));
    }

    @Test
    void classifiesWithinAndAboveCadence21() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.tally21(3 + 1));
        assertEquals("above", subject.tally21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence22() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle22());
        }
        assertEquals(3, subject.depth22Count());
    }

    @Test
    void refusesOnceExhaustedCadence22() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.kindle22();
        }
        assertFalse(subject.kindle22());
    }

    @Test
    void accumulatesBelowTheCapSpan23() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.temper23(1));
        assertEquals(3, subject.temper23(2));
    }

    @Test
    void saturatesAtTheCapSpan23() {
        AshenEstuary subject = new AshenEstuary();
        subject.temper23(43);
        assertEquals(43, subject.temper23(5));
    }

    @Test
    void ignoresNegativeValuesSpan23() {
        AshenEstuary subject = new AshenEstuary();
        subject.temper23(3);
        assertEquals(3, subject.temper23(-2));
        assertEquals(3, subject.ratio23Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold24() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.winnow24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold24() {
        assertEquals(0.5, new AshenEstuary().winnow24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold24() {
        assertEquals(5.0, new AshenEstuary().winnow24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio25() {
        assertTrue(new AshenEstuary().temper25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenEstuary().temper25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio25() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenEstuary().temper25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan26() {
        assertEquals("below", new AshenEstuary().flatten26(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan26() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.flatten26(4));
        assertEquals("upper-bound", subject.flatten26(9));
    }

    @Test
    void classifiesWithinAndAboveSpan26() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.flatten26(4 + 1));
        assertEquals("above", subject.flatten26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan27() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle27());
        }
        assertEquals(4, subject.yield27Count());
    }

    @Test
    void refusesOnceExhaustedSpan27() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.kindle27();
        }
        assertFalse(subject.kindle27());
    }

    @Test
    void accumulatesBelowTheCapYield28() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.hoist28(1));
        assertEquals(3, subject.hoist28(2));
    }

    @Test
    void saturatesAtTheCapYield28() {
        AshenEstuary subject = new AshenEstuary();
        subject.hoist28(48);
        assertEquals(48, subject.hoist28(5));
    }

    @Test
    void ignoresNegativeValuesYield28() {
        AshenEstuary subject = new AshenEstuary();
        subject.hoist28(3);
        assertEquals(3, subject.hoist28(-2));
        assertEquals(3, subject.span28Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold29() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.reconcile29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold29() {
        assertEquals(0.5, new AshenEstuary().reconcile29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold29() {
        assertEquals(5.0, new AshenEstuary().reconcile29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally30() {
        assertTrue(new AshenEstuary().anneal30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenEstuary().anneal30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsTally30() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenEstuary().anneal30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield31() {
        assertEquals("below", new AshenEstuary().gauge31(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield31() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.gauge31(5));
        assertEquals("upper-bound", subject.gauge31(8));
    }

    @Test
    void classifiesWithinAndAboveYield31() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.gauge31(5 + 1));
        assertEquals("above", subject.gauge31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight32() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge32());
        }
        assertEquals(1, subject.span32Count());
    }

    @Test
    void refusesOnceExhaustedWeight32() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.gauge32();
        }
        assertFalse(subject.gauge32());
    }

    @Test
    void accumulatesBelowTheCapQuota33() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.furl33(1));
        assertEquals(3, subject.furl33(2));
    }

    @Test
    void saturatesAtTheCapQuota33() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl33(53);
        assertEquals(53, subject.furl33(5));
    }

    @Test
    void ignoresNegativeValuesQuota33() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl33(3);
        assertEquals(3, subject.furl33(-2));
        assertEquals(3, subject.margin33Value());
    }

    @Test
    void rejectsZeroDenominatorYield34() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.kindle34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield34() {
        assertEquals(0.5, new AshenEstuary().kindle34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield34() {
        assertEquals(5.0, new AshenEstuary().kindle34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence35() {
        assertTrue(new AshenEstuary().gauge35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenEstuary().gauge35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence35() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenEstuary().gauge35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio36() {
        assertEquals("below", new AshenEstuary().prune36(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio36() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.prune36(2));
        assertEquals("upper-bound", subject.prune36(7));
    }

    @Test
    void classifiesWithinAndAboveRatio36() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.prune36(2 + 1));
        assertEquals("above", subject.prune36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset37() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge37());
        }
        assertEquals(2, subject.cadence37Count());
    }

    @Test
    void refusesOnceExhaustedOffset37() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.gauge37();
        }
        assertFalse(subject.gauge37());
    }

    @Test
    void accumulatesBelowTheCapBias38() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.prune38(1));
        assertEquals(3, subject.prune38(2));
    }

    @Test
    void saturatesAtTheCapBias38() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune38(58);
        assertEquals(58, subject.prune38(5));
    }

    @Test
    void ignoresNegativeValuesBias38() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune38(3);
        assertEquals(3, subject.prune38(-2));
        assertEquals(3, subject.quota38Value());
    }

    @Test
    void rejectsZeroDenominatorCadence39() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.kindle39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence39() {
        assertEquals(0.5, new AshenEstuary().kindle39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence39() {
        assertEquals(5.0, new AshenEstuary().kindle39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth40() {
        assertTrue(new AshenEstuary().flatten40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenEstuary().flatten40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth40() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenEstuary().flatten40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota41() {
        assertEquals("below", new AshenEstuary().hoist41(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota41() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.hoist41(3));
        assertEquals("upper-bound", subject.hoist41(12));
    }

    @Test
    void classifiesWithinAndAboveQuota41() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.hoist41(3 + 1));
        assertEquals("above", subject.hoist41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias42() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle42());
        }
        assertEquals(3, subject.ratio42Count());
    }

    @Test
    void refusesOnceExhaustedBias42() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.kindle42();
        }
        assertFalse(subject.kindle42());
    }

    @Test
    void accumulatesBelowTheCapTally43() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.brace43(1));
        assertEquals(3, subject.brace43(2));
    }

    @Test
    void saturatesAtTheCapTally43() {
        AshenEstuary subject = new AshenEstuary();
        subject.brace43(23);
        assertEquals(23, subject.brace43(5));
    }

    @Test
    void ignoresNegativeValuesTally43() {
        AshenEstuary subject = new AshenEstuary();
        subject.brace43(3);
        assertEquals(3, subject.brace43(-2));
        assertEquals(3, subject.cadence43Value());
    }

    @Test
    void rejectsZeroDenominatorQuota44() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.anneal44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota44() {
        assertEquals(0.5, new AshenEstuary().anneal44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota44() {
        assertEquals(5.0, new AshenEstuary().anneal44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield45() {
        assertTrue(new AshenEstuary().tally45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenEstuary().tally45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield45() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenEstuary().tally45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias46() {
        assertEquals("below", new AshenEstuary().flatten46(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias46() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.flatten46(4));
        assertEquals("upper-bound", subject.flatten46(11));
    }

    @Test
    void classifiesWithinAndAboveBias46() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.flatten46(4 + 1));
        assertEquals("above", subject.flatten46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth47() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge47());
        }
        assertEquals(4, subject.span47Count());
    }

    @Test
    void refusesOnceExhaustedDepth47() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.gauge47();
        }
        assertFalse(subject.gauge47());
    }

    @Test
    void accumulatesBelowTheCapTally48() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.sift48(1));
        assertEquals(3, subject.sift48(2));
    }

    @Test
    void saturatesAtTheCapTally48() {
        AshenEstuary subject = new AshenEstuary();
        subject.sift48(28);
        assertEquals(28, subject.sift48(5));
    }

    @Test
    void ignoresNegativeValuesTally48() {
        AshenEstuary subject = new AshenEstuary();
        subject.sift48(3);
        assertEquals(3, subject.sift48(-2));
        assertEquals(3, subject.offset48Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity49() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.kindle49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity49() {
        assertEquals(0.5, new AshenEstuary().kindle49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity49() {
        assertEquals(5.0, new AshenEstuary().kindle49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity50() {
        assertTrue(new AshenEstuary().collate50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenEstuary().collate50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity50() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenEstuary().collate50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio51() {
        assertEquals("below", new AshenEstuary().sift51(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio51() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.sift51(5));
        assertEquals("upper-bound", subject.sift51(10));
    }

    @Test
    void classifiesWithinAndAboveRatio51() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.sift51(5 + 1));
        assertEquals("above", subject.sift51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence52() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist52());
        }
        assertEquals(1, subject.drift52Count());
    }

    @Test
    void refusesOnceExhaustedCadence52() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.hoist52();
        }
        assertFalse(subject.hoist52());
    }

    @Test
    void accumulatesBelowTheCapDepth53() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.reconcile53(1));
        assertEquals(3, subject.reconcile53(2));
    }

    @Test
    void saturatesAtTheCapDepth53() {
        AshenEstuary subject = new AshenEstuary();
        subject.reconcile53(33);
        assertEquals(33, subject.reconcile53(5));
    }

    @Test
    void ignoresNegativeValuesDepth53() {
        AshenEstuary subject = new AshenEstuary();
        subject.reconcile53(3);
        assertEquals(3, subject.reconcile53(-2));
        assertEquals(3, subject.bias53Value());
    }

    @Test
    void rejectsZeroDenominatorOffset54() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.collate54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset54() {
        assertEquals(0.5, new AshenEstuary().collate54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset54() {
        assertEquals(5.0, new AshenEstuary().collate54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan55() {
        assertTrue(new AshenEstuary().temper55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenEstuary().temper55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsSpan55() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenEstuary().temper55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota56() {
        assertEquals("below", new AshenEstuary().flatten56(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota56() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.flatten56(2));
        assertEquals("upper-bound", subject.flatten56(9));
    }

    @Test
    void classifiesWithinAndAboveQuota56() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.flatten56(2 + 1));
        assertEquals("above", subject.flatten56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift57() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle57());
        }
        assertEquals(2, subject.quota57Count());
    }

    @Test
    void refusesOnceExhaustedDrift57() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.kindle57();
        }
        assertFalse(subject.kindle57());
    }

    @Test
    void accumulatesBelowTheCapDepth58() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.flatten58(1));
        assertEquals(3, subject.flatten58(2));
    }

    @Test
    void saturatesAtTheCapDepth58() {
        AshenEstuary subject = new AshenEstuary();
        subject.flatten58(38);
        assertEquals(38, subject.flatten58(5));
    }

    @Test
    void ignoresNegativeValuesDepth58() {
        AshenEstuary subject = new AshenEstuary();
        subject.flatten58(3);
        assertEquals(3, subject.flatten58(-2));
        assertEquals(3, subject.yield58Value());
    }

    @Test
    void rejectsZeroDenominatorSpan59() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.reconcile59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan59() {
        assertEquals(0.5, new AshenEstuary().reconcile59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan59() {
        assertEquals(5.0, new AshenEstuary().reconcile59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset60() {
        assertTrue(new AshenEstuary().furl60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenEstuary().furl60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset60() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenEstuary().furl60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset61() {
        assertEquals("below", new AshenEstuary().flatten61(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset61() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.flatten61(3));
        assertEquals("upper-bound", subject.flatten61(8));
    }

    @Test
    void classifiesWithinAndAboveOffset61() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.flatten61(3 + 1));
        assertEquals("above", subject.flatten61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity62() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow62());
        }
        assertEquals(3, subject.yield62Count());
    }

    @Test
    void refusesOnceExhaustedCapacity62() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.winnow62();
        }
        assertFalse(subject.winnow62());
    }

    @Test
    void accumulatesBelowTheCapRatio63() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.kindle63(1));
        assertEquals(3, subject.kindle63(2));
    }

    @Test
    void saturatesAtTheCapRatio63() {
        AshenEstuary subject = new AshenEstuary();
        subject.kindle63(43);
        assertEquals(43, subject.kindle63(5));
    }

    @Test
    void ignoresNegativeValuesRatio63() {
        AshenEstuary subject = new AshenEstuary();
        subject.kindle63(3);
        assertEquals(3, subject.kindle63(-2));
        assertEquals(3, subject.span63Value());
    }

    @Test
    void rejectsZeroDenominatorDrift64() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.anneal64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift64() {
        assertEquals(0.5, new AshenEstuary().anneal64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift64() {
        assertEquals(5.0, new AshenEstuary().anneal64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight65() {
        assertTrue(new AshenEstuary().hoist65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenEstuary().hoist65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight65() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenEstuary().hoist65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth66() {
        assertEquals("below", new AshenEstuary().tally66(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth66() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.tally66(4));
        assertEquals("upper-bound", subject.tally66(7));
    }

    @Test
    void classifiesWithinAndAboveDepth66() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.tally66(4 + 1));
        assertEquals("above", subject.tally66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin67() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace67());
        }
        assertEquals(4, subject.ratio67Count());
    }

    @Test
    void refusesOnceExhaustedMargin67() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.brace67();
        }
        assertFalse(subject.brace67());
    }

    @Test
    void accumulatesBelowTheCapSpan68() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.furl68(1));
        assertEquals(3, subject.furl68(2));
    }

    @Test
    void saturatesAtTheCapSpan68() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl68(48);
        assertEquals(48, subject.furl68(5));
    }

    @Test
    void ignoresNegativeValuesSpan68() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl68(3);
        assertEquals(3, subject.furl68(-2));
        assertEquals(3, subject.margin68Value());
    }

    @Test
    void rejectsZeroDenominatorWeight69() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.furl69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight69() {
        assertEquals(0.5, new AshenEstuary().furl69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight69() {
        assertEquals(5.0, new AshenEstuary().furl69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield70() {
        assertTrue(new AshenEstuary().gauge70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenEstuary().gauge70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield70() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenEstuary().gauge70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth71() {
        assertEquals("below", new AshenEstuary().brace71(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth71() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.brace71(5));
        assertEquals("upper-bound", subject.brace71(12));
    }

    @Test
    void classifiesWithinAndAboveDepth71() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.brace71(5 + 1));
        assertEquals("above", subject.brace71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio72() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune72());
        }
        assertEquals(1, subject.drift72Count());
    }

    @Test
    void refusesOnceExhaustedRatio72() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.prune72();
        }
        assertFalse(subject.prune72());
    }

    @Test
    void accumulatesBelowTheCapWeight73() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.winnow73(1));
        assertEquals(3, subject.winnow73(2));
    }

    @Test
    void saturatesAtTheCapWeight73() {
        AshenEstuary subject = new AshenEstuary();
        subject.winnow73(53);
        assertEquals(53, subject.winnow73(5));
    }

    @Test
    void ignoresNegativeValuesWeight73() {
        AshenEstuary subject = new AshenEstuary();
        subject.winnow73(3);
        assertEquals(3, subject.winnow73(-2));
        assertEquals(3, subject.threshold73Value());
    }

    @Test
    void rejectsZeroDenominatorSpan74() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.kindle74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan74() {
        assertEquals(0.5, new AshenEstuary().kindle74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan74() {
        assertEquals(5.0, new AshenEstuary().kindle74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth75() {
        assertTrue(new AshenEstuary().kindle75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenEstuary().kindle75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth75() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenEstuary().kindle75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally76() {
        assertEquals("below", new AshenEstuary().kindle76(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally76() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.kindle76(2));
        assertEquals("upper-bound", subject.kindle76(11));
    }

    @Test
    void classifiesWithinAndAboveTally76() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.kindle76(2 + 1));
        assertEquals("above", subject.kindle76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence77() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle77());
        }
        assertEquals(2, subject.weight77Count());
    }

    @Test
    void refusesOnceExhaustedCadence77() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.kindle77();
        }
        assertFalse(subject.kindle77());
    }

    @Test
    void accumulatesBelowTheCapCadence78() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.temper78(1));
        assertEquals(3, subject.temper78(2));
    }

    @Test
    void saturatesAtTheCapCadence78() {
        AshenEstuary subject = new AshenEstuary();
        subject.temper78(58);
        assertEquals(58, subject.temper78(5));
    }

    @Test
    void ignoresNegativeValuesCadence78() {
        AshenEstuary subject = new AshenEstuary();
        subject.temper78(3);
        assertEquals(3, subject.temper78(-2));
        assertEquals(3, subject.offset78Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity79() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.hoist79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity79() {
        assertEquals(0.5, new AshenEstuary().hoist79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity79() {
        assertEquals(5.0, new AshenEstuary().hoist79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias80() {
        assertTrue(new AshenEstuary().reconcile80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenEstuary().reconcile80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias80() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenEstuary().reconcile80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth81() {
        assertEquals("below", new AshenEstuary().anneal81(3 - 1));
    }

    @Test
    void classifiesTheBoundsDepth81() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.anneal81(3));
        assertEquals("upper-bound", subject.anneal81(10));
    }

    @Test
    void classifiesWithinAndAboveDepth81() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.anneal81(3 + 1));
        assertEquals("above", subject.anneal81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth82() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate82());
        }
        assertEquals(3, subject.weight82Count());
    }

    @Test
    void refusesOnceExhaustedDepth82() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.collate82();
        }
        assertFalse(subject.collate82());
    }

    @Test
    void accumulatesBelowTheCapWeight83() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.gauge83(1));
        assertEquals(3, subject.gauge83(2));
    }

    @Test
    void saturatesAtTheCapWeight83() {
        AshenEstuary subject = new AshenEstuary();
        subject.gauge83(23);
        assertEquals(23, subject.gauge83(5));
    }

    @Test
    void ignoresNegativeValuesWeight83() {
        AshenEstuary subject = new AshenEstuary();
        subject.gauge83(3);
        assertEquals(3, subject.gauge83(-2));
        assertEquals(3, subject.yield83Value());
    }

    @Test
    void rejectsZeroDenominatorOffset84() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.winnow84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset84() {
        assertEquals(0.5, new AshenEstuary().winnow84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset84() {
        assertEquals(5.0, new AshenEstuary().winnow84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold85() {
        assertTrue(new AshenEstuary().reconcile85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenEstuary().reconcile85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsThreshold85() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenEstuary().reconcile85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth86() {
        assertEquals("below", new AshenEstuary().collate86(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth86() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.collate86(4));
        assertEquals("upper-bound", subject.collate86(9));
    }

    @Test
    void classifiesWithinAndAboveDepth86() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.collate86(4 + 1));
        assertEquals("above", subject.collate86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally87() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten87());
        }
        assertEquals(4, subject.threshold87Count());
    }

    @Test
    void refusesOnceExhaustedTally87() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.flatten87();
        }
        assertFalse(subject.flatten87());
    }

    @Test
    void accumulatesBelowTheCapBias88() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.gauge88(1));
        assertEquals(3, subject.gauge88(2));
    }

    @Test
    void saturatesAtTheCapBias88() {
        AshenEstuary subject = new AshenEstuary();
        subject.gauge88(28);
        assertEquals(28, subject.gauge88(5));
    }

    @Test
    void ignoresNegativeValuesBias88() {
        AshenEstuary subject = new AshenEstuary();
        subject.gauge88(3);
        assertEquals(3, subject.gauge88(-2));
        assertEquals(3, subject.threshold88Value());
    }

    @Test
    void rejectsZeroDenominatorTally89() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.reconcile89(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally89() {
        assertEquals(0.5, new AshenEstuary().reconcile89(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally89() {
        assertEquals(5.0, new AshenEstuary().reconcile89(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias90() {
        assertTrue(new AshenEstuary().kindle90(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias90() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenEstuary().kindle90(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsBias90() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenEstuary().kindle90(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan91() {
        assertEquals("below", new AshenEstuary().gauge91(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan91() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.gauge91(5));
        assertEquals("upper-bound", subject.gauge91(8));
    }

    @Test
    void classifiesWithinAndAboveSpan91() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.gauge91(5 + 1));
        assertEquals("above", subject.gauge91(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift92() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace92());
        }
        assertEquals(1, subject.ratio92Count());
    }

    @Test
    void refusesOnceExhaustedDrift92() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.brace92();
        }
        assertFalse(subject.brace92());
    }

    @Test
    void accumulatesBelowTheCapTally93() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.prune93(1));
        assertEquals(3, subject.prune93(2));
    }

    @Test
    void saturatesAtTheCapTally93() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune93(33);
        assertEquals(33, subject.prune93(5));
    }

    @Test
    void ignoresNegativeValuesTally93() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune93(3);
        assertEquals(3, subject.prune93(-2));
        assertEquals(3, subject.yield93Value());
    }

    @Test
    void rejectsZeroDenominatorSpan94() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.collate94(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan94() {
        assertEquals(0.5, new AshenEstuary().collate94(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan94() {
        assertEquals(5.0, new AshenEstuary().collate94(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan95() {
        assertTrue(new AshenEstuary().reconcile95(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan95() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenEstuary().reconcile95(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan95() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenEstuary().reconcile95(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan96() {
        assertEquals("below", new AshenEstuary().tally96(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan96() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.tally96(2));
        assertEquals("upper-bound", subject.tally96(7));
    }

    @Test
    void classifiesWithinAndAboveSpan96() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.tally96(2 + 1));
        assertEquals("above", subject.tally96(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity97() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.hoist97());
        }
        assertEquals(2, subject.tally97Count());
    }

    @Test
    void refusesOnceExhaustedCapacity97() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.hoist97();
        }
        assertFalse(subject.hoist97());
    }

    @Test
    void accumulatesBelowTheCapOffset98() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.collate98(1));
        assertEquals(3, subject.collate98(2));
    }

    @Test
    void saturatesAtTheCapOffset98() {
        AshenEstuary subject = new AshenEstuary();
        subject.collate98(38);
        assertEquals(38, subject.collate98(5));
    }

    @Test
    void ignoresNegativeValuesOffset98() {
        AshenEstuary subject = new AshenEstuary();
        subject.collate98(3);
        assertEquals(3, subject.collate98(-2));
        assertEquals(3, subject.drift98Value());
    }

    @Test
    void rejectsZeroDenominatorRatio99() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.flatten99(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio99() {
        assertEquals(0.5, new AshenEstuary().flatten99(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio99() {
        assertEquals(5.0, new AshenEstuary().flatten99(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth100() {
        assertTrue(new AshenEstuary().hoist100(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth100() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenEstuary().hoist100(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth100() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenEstuary().hoist100(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence101() {
        assertEquals("below", new AshenEstuary().tally101(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence101() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.tally101(3));
        assertEquals("upper-bound", subject.tally101(12));
    }

    @Test
    void classifiesWithinAndAboveCadence101() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.tally101(3 + 1));
        assertEquals("above", subject.tally101(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity102() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper102());
        }
        assertEquals(3, subject.ratio102Count());
    }

    @Test
    void refusesOnceExhaustedCapacity102() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.temper102();
        }
        assertFalse(subject.temper102());
    }

    @Test
    void accumulatesBelowTheCapRatio103() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.collate103(1));
        assertEquals(3, subject.collate103(2));
    }

    @Test
    void saturatesAtTheCapRatio103() {
        AshenEstuary subject = new AshenEstuary();
        subject.collate103(43);
        assertEquals(43, subject.collate103(5));
    }

    @Test
    void ignoresNegativeValuesRatio103() {
        AshenEstuary subject = new AshenEstuary();
        subject.collate103(3);
        assertEquals(3, subject.collate103(-2));
        assertEquals(3, subject.depth103Value());
    }

    @Test
    void rejectsZeroDenominatorQuota104() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.sift104(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota104() {
        assertEquals(0.5, new AshenEstuary().sift104(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota104() {
        assertEquals(5.0, new AshenEstuary().sift104(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset105() {
        assertTrue(new AshenEstuary().collate105(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset105() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenEstuary().collate105(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset105() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenEstuary().collate105(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight106() {
        assertEquals("below", new AshenEstuary().temper106(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight106() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.temper106(4));
        assertEquals("upper-bound", subject.temper106(11));
    }

    @Test
    void classifiesWithinAndAboveWeight106() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.temper106(4 + 1));
        assertEquals("above", subject.temper106(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity107() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate107());
        }
        assertEquals(4, subject.yield107Count());
    }

    @Test
    void refusesOnceExhaustedCapacity107() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.collate107();
        }
        assertFalse(subject.collate107());
    }

    @Test
    void accumulatesBelowTheCapCapacity108() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.kindle108(1));
        assertEquals(3, subject.kindle108(2));
    }

    @Test
    void saturatesAtTheCapCapacity108() {
        AshenEstuary subject = new AshenEstuary();
        subject.kindle108(48);
        assertEquals(48, subject.kindle108(5));
    }

    @Test
    void ignoresNegativeValuesCapacity108() {
        AshenEstuary subject = new AshenEstuary();
        subject.kindle108(3);
        assertEquals(3, subject.kindle108(-2));
        assertEquals(3, subject.depth108Value());
    }

    @Test
    void rejectsZeroDenominatorDepth109() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.temper109(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth109() {
        assertEquals(0.5, new AshenEstuary().temper109(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth109() {
        assertEquals(5.0, new AshenEstuary().temper109(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias110() {
        assertTrue(new AshenEstuary().hoist110(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias110() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenEstuary().hoist110(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsBias110() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenEstuary().hoist110(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin111() {
        assertEquals("below", new AshenEstuary().collate111(5 - 1));
    }

    @Test
    void classifiesTheBoundsMargin111() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.collate111(5));
        assertEquals("upper-bound", subject.collate111(10));
    }

    @Test
    void classifiesWithinAndAboveMargin111() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.collate111(5 + 1));
        assertEquals("above", subject.collate111(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield112() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace112());
        }
        assertEquals(1, subject.offset112Count());
    }

    @Test
    void refusesOnceExhaustedYield112() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.brace112();
        }
        assertFalse(subject.brace112());
    }

    @Test
    void accumulatesBelowTheCapTally113() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.flatten113(1));
        assertEquals(3, subject.flatten113(2));
    }

    @Test
    void saturatesAtTheCapTally113() {
        AshenEstuary subject = new AshenEstuary();
        subject.flatten113(53);
        assertEquals(53, subject.flatten113(5));
    }

    @Test
    void ignoresNegativeValuesTally113() {
        AshenEstuary subject = new AshenEstuary();
        subject.flatten113(3);
        assertEquals(3, subject.flatten113(-2));
        assertEquals(3, subject.weight113Value());
    }

    @Test
    void rejectsZeroDenominatorBias114() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.kindle114(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias114() {
        assertEquals(0.5, new AshenEstuary().kindle114(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias114() {
        assertEquals(5.0, new AshenEstuary().kindle114(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield115() {
        assertTrue(new AshenEstuary().flatten115(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield115() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenEstuary().flatten115(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield115() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenEstuary().flatten115(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift116() {
        assertEquals("below", new AshenEstuary().sift116(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift116() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.sift116(2));
        assertEquals("upper-bound", subject.sift116(9));
    }

    @Test
    void classifiesWithinAndAboveDrift116() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.sift116(2 + 1));
        assertEquals("above", subject.sift116(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift117() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace117());
        }
        assertEquals(2, subject.span117Count());
    }

    @Test
    void refusesOnceExhaustedDrift117() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.brace117();
        }
        assertFalse(subject.brace117());
    }

    @Test
    void accumulatesBelowTheCapCadence118() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.prune118(1));
        assertEquals(3, subject.prune118(2));
    }

    @Test
    void saturatesAtTheCapCadence118() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune118(58);
        assertEquals(58, subject.prune118(5));
    }

    @Test
    void ignoresNegativeValuesCadence118() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune118(3);
        assertEquals(3, subject.prune118(-2));
        assertEquals(3, subject.drift118Value());
    }

    @Test
    void rejectsZeroDenominatorDepth119() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.gauge119(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth119() {
        assertEquals(0.5, new AshenEstuary().gauge119(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth119() {
        assertEquals(5.0, new AshenEstuary().gauge119(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin120() {
        assertTrue(new AshenEstuary().kindle120(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin120() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenEstuary().kindle120(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsMargin120() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenEstuary().kindle120(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence121() {
        assertEquals("below", new AshenEstuary().gauge121(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence121() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.gauge121(3));
        assertEquals("upper-bound", subject.gauge121(8));
    }

    @Test
    void classifiesWithinAndAboveCadence121() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.gauge121(3 + 1));
        assertEquals("above", subject.gauge121(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity122() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle122());
        }
        assertEquals(3, subject.quota122Count());
    }

    @Test
    void refusesOnceExhaustedCapacity122() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.kindle122();
        }
        assertFalse(subject.kindle122());
    }

    @Test
    void accumulatesBelowTheCapOffset123() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.reconcile123(1));
        assertEquals(3, subject.reconcile123(2));
    }

    @Test
    void saturatesAtTheCapOffset123() {
        AshenEstuary subject = new AshenEstuary();
        subject.reconcile123(23);
        assertEquals(23, subject.reconcile123(5));
    }

    @Test
    void ignoresNegativeValuesOffset123() {
        AshenEstuary subject = new AshenEstuary();
        subject.reconcile123(3);
        assertEquals(3, subject.reconcile123(-2));
        assertEquals(3, subject.capacity123Value());
    }

    @Test
    void rejectsZeroDenominatorDrift124() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.furl124(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift124() {
        assertEquals(0.5, new AshenEstuary().furl124(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift124() {
        assertEquals(5.0, new AshenEstuary().furl124(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift125() {
        assertTrue(new AshenEstuary().hoist125(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift125() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenEstuary().hoist125(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift125() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenEstuary().hoist125(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth126() {
        assertEquals("below", new AshenEstuary().winnow126(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth126() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.winnow126(4));
        assertEquals("upper-bound", subject.winnow126(7));
    }

    @Test
    void classifiesWithinAndAboveDepth126() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.winnow126(4 + 1));
        assertEquals("above", subject.winnow126(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota127() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace127());
        }
        assertEquals(4, subject.tally127Count());
    }

    @Test
    void refusesOnceExhaustedQuota127() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.brace127();
        }
        assertFalse(subject.brace127());
    }

    @Test
    void accumulatesBelowTheCapBias128() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.flatten128(1));
        assertEquals(3, subject.flatten128(2));
    }

    @Test
    void saturatesAtTheCapBias128() {
        AshenEstuary subject = new AshenEstuary();
        subject.flatten128(28);
        assertEquals(28, subject.flatten128(5));
    }

    @Test
    void ignoresNegativeValuesBias128() {
        AshenEstuary subject = new AshenEstuary();
        subject.flatten128(3);
        assertEquals(3, subject.flatten128(-2));
        assertEquals(3, subject.drift128Value());
    }

    @Test
    void rejectsZeroDenominatorOffset129() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.gauge129(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset129() {
        assertEquals(0.5, new AshenEstuary().gauge129(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset129() {
        assertEquals(5.0, new AshenEstuary().gauge129(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias130() {
        assertTrue(new AshenEstuary().gauge130(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias130() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenEstuary().gauge130(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias130() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenEstuary().gauge130(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally131() {
        assertEquals("below", new AshenEstuary().tally131(5 - 1));
    }

    @Test
    void classifiesTheBoundsTally131() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.tally131(5));
        assertEquals("upper-bound", subject.tally131(12));
    }

    @Test
    void classifiesWithinAndAboveTally131() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.tally131(5 + 1));
        assertEquals("above", subject.tally131(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift132() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow132());
        }
        assertEquals(1, subject.cadence132Count());
    }

    @Test
    void refusesOnceExhaustedDrift132() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.winnow132();
        }
        assertFalse(subject.winnow132());
    }

    @Test
    void accumulatesBelowTheCapOffset133() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.kindle133(1));
        assertEquals(3, subject.kindle133(2));
    }

    @Test
    void saturatesAtTheCapOffset133() {
        AshenEstuary subject = new AshenEstuary();
        subject.kindle133(33);
        assertEquals(33, subject.kindle133(5));
    }

    @Test
    void ignoresNegativeValuesOffset133() {
        AshenEstuary subject = new AshenEstuary();
        subject.kindle133(3);
        assertEquals(3, subject.kindle133(-2));
        assertEquals(3, subject.threshold133Value());
    }

    @Test
    void rejectsZeroDenominatorCadence134() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.furl134(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence134() {
        assertEquals(0.5, new AshenEstuary().furl134(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence134() {
        assertEquals(5.0, new AshenEstuary().furl134(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio135() {
        assertTrue(new AshenEstuary().sift135(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio135() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenEstuary().sift135(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsRatio135() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenEstuary().sift135(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield136() {
        assertEquals("below", new AshenEstuary().temper136(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield136() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.temper136(2));
        assertEquals("upper-bound", subject.temper136(11));
    }

    @Test
    void classifiesWithinAndAboveYield136() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.temper136(2 + 1));
        assertEquals("above", subject.temper136(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset137() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl137());
        }
        assertEquals(2, subject.margin137Count());
    }

    @Test
    void refusesOnceExhaustedOffset137() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.furl137();
        }
        assertFalse(subject.furl137());
    }

    @Test
    void accumulatesBelowTheCapBias138() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.reconcile138(1));
        assertEquals(3, subject.reconcile138(2));
    }

    @Test
    void saturatesAtTheCapBias138() {
        AshenEstuary subject = new AshenEstuary();
        subject.reconcile138(38);
        assertEquals(38, subject.reconcile138(5));
    }

    @Test
    void ignoresNegativeValuesBias138() {
        AshenEstuary subject = new AshenEstuary();
        subject.reconcile138(3);
        assertEquals(3, subject.reconcile138(-2));
        assertEquals(3, subject.margin138Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity139() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.flatten139(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity139() {
        assertEquals(0.5, new AshenEstuary().flatten139(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity139() {
        assertEquals(5.0, new AshenEstuary().flatten139(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity140() {
        assertTrue(new AshenEstuary().collate140(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity140() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenEstuary().collate140(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsCapacity140() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenEstuary().collate140(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight141() {
        assertEquals("below", new AshenEstuary().kindle141(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight141() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.kindle141(3));
        assertEquals("upper-bound", subject.kindle141(10));
    }

    @Test
    void classifiesWithinAndAboveWeight141() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.kindle141(3 + 1));
        assertEquals("above", subject.kindle141(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold142() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper142());
        }
        assertEquals(3, subject.offset142Count());
    }

    @Test
    void refusesOnceExhaustedThreshold142() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.temper142();
        }
        assertFalse(subject.temper142());
    }

    @Test
    void accumulatesBelowTheCapOffset143() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.furl143(1));
        assertEquals(3, subject.furl143(2));
    }

    @Test
    void saturatesAtTheCapOffset143() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl143(43);
        assertEquals(43, subject.furl143(5));
    }

    @Test
    void ignoresNegativeValuesOffset143() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl143(3);
        assertEquals(3, subject.furl143(-2));
        assertEquals(3, subject.margin143Value());
    }

    @Test
    void rejectsZeroDenominatorDepth144() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.collate144(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth144() {
        assertEquals(0.5, new AshenEstuary().collate144(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth144() {
        assertEquals(5.0, new AshenEstuary().collate144(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset145() {
        assertTrue(new AshenEstuary().tally145(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset145() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenEstuary().tally145(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsOffset145() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenEstuary().tally145(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan146() {
        assertEquals("below", new AshenEstuary().furl146(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan146() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.furl146(4));
        assertEquals("upper-bound", subject.furl146(9));
    }

    @Test
    void classifiesWithinAndAboveSpan146() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.furl146(4 + 1));
        assertEquals("above", subject.furl146(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin147() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle147());
        }
        assertEquals(4, subject.tally147Count());
    }

    @Test
    void refusesOnceExhaustedMargin147() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.kindle147();
        }
        assertFalse(subject.kindle147());
    }

    @Test
    void accumulatesBelowTheCapBias148() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.furl148(1));
        assertEquals(3, subject.furl148(2));
    }

    @Test
    void saturatesAtTheCapBias148() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl148(48);
        assertEquals(48, subject.furl148(5));
    }

    @Test
    void ignoresNegativeValuesBias148() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl148(3);
        assertEquals(3, subject.furl148(-2));
        assertEquals(3, subject.tally148Value());
    }

    @Test
    void rejectsZeroDenominatorSpan149() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.hoist149(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan149() {
        assertEquals(0.5, new AshenEstuary().hoist149(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan149() {
        assertEquals(5.0, new AshenEstuary().hoist149(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin150() {
        assertTrue(new AshenEstuary().temper150(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin150() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenEstuary().temper150(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin150() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenEstuary().temper150(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift151() {
        assertEquals("below", new AshenEstuary().prune151(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift151() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.prune151(5));
        assertEquals("upper-bound", subject.prune151(8));
    }

    @Test
    void classifiesWithinAndAboveDrift151() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.prune151(5 + 1));
        assertEquals("above", subject.prune151(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias152() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune152());
        }
        assertEquals(1, subject.cadence152Count());
    }

    @Test
    void refusesOnceExhaustedBias152() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.prune152();
        }
        assertFalse(subject.prune152());
    }

    @Test
    void accumulatesBelowTheCapSpan153() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.flatten153(1));
        assertEquals(3, subject.flatten153(2));
    }

    @Test
    void saturatesAtTheCapSpan153() {
        AshenEstuary subject = new AshenEstuary();
        subject.flatten153(53);
        assertEquals(53, subject.flatten153(5));
    }

    @Test
    void ignoresNegativeValuesSpan153() {
        AshenEstuary subject = new AshenEstuary();
        subject.flatten153(3);
        assertEquals(3, subject.flatten153(-2));
        assertEquals(3, subject.ratio153Value());
    }

    @Test
    void rejectsZeroDenominatorQuota154() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.gauge154(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota154() {
        assertEquals(0.5, new AshenEstuary().gauge154(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota154() {
        assertEquals(5.0, new AshenEstuary().gauge154(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence155() {
        assertTrue(new AshenEstuary().flatten155(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence155() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenEstuary().flatten155(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence155() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenEstuary().flatten155(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold156() {
        assertEquals("below", new AshenEstuary().temper156(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold156() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.temper156(2));
        assertEquals("upper-bound", subject.temper156(7));
    }

    @Test
    void classifiesWithinAndAboveThreshold156() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.temper156(2 + 1));
        assertEquals("above", subject.temper156(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin157() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal157());
        }
        assertEquals(2, subject.bias157Count());
    }

    @Test
    void refusesOnceExhaustedMargin157() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.anneal157();
        }
        assertFalse(subject.anneal157());
    }

    @Test
    void accumulatesBelowTheCapSpan158() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.reconcile158(1));
        assertEquals(3, subject.reconcile158(2));
    }

    @Test
    void saturatesAtTheCapSpan158() {
        AshenEstuary subject = new AshenEstuary();
        subject.reconcile158(58);
        assertEquals(58, subject.reconcile158(5));
    }

    @Test
    void ignoresNegativeValuesSpan158() {
        AshenEstuary subject = new AshenEstuary();
        subject.reconcile158(3);
        assertEquals(3, subject.reconcile158(-2));
        assertEquals(3, subject.margin158Value());
    }

    @Test
    void rejectsZeroDenominatorMargin159() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.gauge159(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin159() {
        assertEquals(0.5, new AshenEstuary().gauge159(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin159() {
        assertEquals(5.0, new AshenEstuary().gauge159(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset160() {
        assertTrue(new AshenEstuary().flatten160(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset160() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenEstuary().flatten160(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset160() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenEstuary().flatten160(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight161() {
        assertEquals("below", new AshenEstuary().reconcile161(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight161() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.reconcile161(3));
        assertEquals("upper-bound", subject.reconcile161(12));
    }

    @Test
    void classifiesWithinAndAboveWeight161() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.reconcile161(3 + 1));
        assertEquals("above", subject.reconcile161(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan162() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace162());
        }
        assertEquals(3, subject.yield162Count());
    }

    @Test
    void refusesOnceExhaustedSpan162() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.brace162();
        }
        assertFalse(subject.brace162());
    }

    @Test
    void accumulatesBelowTheCapBias163() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.prune163(1));
        assertEquals(3, subject.prune163(2));
    }

    @Test
    void saturatesAtTheCapBias163() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune163(23);
        assertEquals(23, subject.prune163(5));
    }

    @Test
    void ignoresNegativeValuesBias163() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune163(3);
        assertEquals(3, subject.prune163(-2));
        assertEquals(3, subject.margin163Value());
    }

    @Test
    void rejectsZeroDenominatorDepth164() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.furl164(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth164() {
        assertEquals(0.5, new AshenEstuary().furl164(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth164() {
        assertEquals(5.0, new AshenEstuary().furl164(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity165() {
        assertTrue(new AshenEstuary().tally165(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity165() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenEstuary().tally165(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity165() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenEstuary().tally165(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield166() {
        assertEquals("below", new AshenEstuary().sift166(4 - 1));
    }

    @Test
    void classifiesTheBoundsYield166() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.sift166(4));
        assertEquals("upper-bound", subject.sift166(11));
    }

    @Test
    void classifiesWithinAndAboveYield166() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.sift166(4 + 1));
        assertEquals("above", subject.sift166(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight167() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace167());
        }
        assertEquals(4, subject.yield167Count());
    }

    @Test
    void refusesOnceExhaustedWeight167() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.brace167();
        }
        assertFalse(subject.brace167());
    }

    @Test
    void accumulatesBelowTheCapCadence168() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.anneal168(1));
        assertEquals(3, subject.anneal168(2));
    }

    @Test
    void saturatesAtTheCapCadence168() {
        AshenEstuary subject = new AshenEstuary();
        subject.anneal168(28);
        assertEquals(28, subject.anneal168(5));
    }

    @Test
    void ignoresNegativeValuesCadence168() {
        AshenEstuary subject = new AshenEstuary();
        subject.anneal168(3);
        assertEquals(3, subject.anneal168(-2));
        assertEquals(3, subject.margin168Value());
    }

    @Test
    void rejectsZeroDenominatorTally169() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.brace169(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally169() {
        assertEquals(0.5, new AshenEstuary().brace169(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally169() {
        assertEquals(5.0, new AshenEstuary().brace169(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias170() {
        assertTrue(new AshenEstuary().tally170(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias170() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenEstuary().tally170(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias170() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenEstuary().tally170(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota171() {
        assertEquals("below", new AshenEstuary().furl171(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota171() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.furl171(5));
        assertEquals("upper-bound", subject.furl171(10));
    }

    @Test
    void classifiesWithinAndAboveQuota171() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.furl171(5 + 1));
        assertEquals("above", subject.furl171(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio172() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist172());
        }
        assertEquals(1, subject.depth172Count());
    }

    @Test
    void refusesOnceExhaustedRatio172() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.hoist172();
        }
        assertFalse(subject.hoist172());
    }

    @Test
    void accumulatesBelowTheCapThreshold173() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.kindle173(1));
        assertEquals(3, subject.kindle173(2));
    }

    @Test
    void saturatesAtTheCapThreshold173() {
        AshenEstuary subject = new AshenEstuary();
        subject.kindle173(33);
        assertEquals(33, subject.kindle173(5));
    }

    @Test
    void ignoresNegativeValuesThreshold173() {
        AshenEstuary subject = new AshenEstuary();
        subject.kindle173(3);
        assertEquals(3, subject.kindle173(-2));
        assertEquals(3, subject.offset173Value());
    }

    @Test
    void rejectsZeroDenominatorMargin174() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.reconcile174(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin174() {
        assertEquals(0.5, new AshenEstuary().reconcile174(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin174() {
        assertEquals(5.0, new AshenEstuary().reconcile174(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield175() {
        assertTrue(new AshenEstuary().kindle175(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield175() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenEstuary().kindle175(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield175() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenEstuary().kindle175(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan176() {
        assertEquals("below", new AshenEstuary().temper176(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan176() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.temper176(2));
        assertEquals("upper-bound", subject.temper176(9));
    }

    @Test
    void classifiesWithinAndAboveSpan176() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.temper176(2 + 1));
        assertEquals("above", subject.temper176(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin177() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.winnow177());
        }
        assertEquals(2, subject.span177Count());
    }

    @Test
    void refusesOnceExhaustedMargin177() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.winnow177();
        }
        assertFalse(subject.winnow177());
    }

    @Test
    void accumulatesBelowTheCapThreshold178() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.tally178(1));
        assertEquals(3, subject.tally178(2));
    }

    @Test
    void saturatesAtTheCapThreshold178() {
        AshenEstuary subject = new AshenEstuary();
        subject.tally178(38);
        assertEquals(38, subject.tally178(5));
    }

    @Test
    void ignoresNegativeValuesThreshold178() {
        AshenEstuary subject = new AshenEstuary();
        subject.tally178(3);
        assertEquals(3, subject.tally178(-2));
        assertEquals(3, subject.capacity178Value());
    }

    @Test
    void rejectsZeroDenominatorTally179() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.furl179(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally179() {
        assertEquals(0.5, new AshenEstuary().furl179(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally179() {
        assertEquals(5.0, new AshenEstuary().furl179(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence180() {
        assertTrue(new AshenEstuary().winnow180(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence180() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenEstuary().winnow180(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence180() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenEstuary().winnow180(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift181() {
        assertEquals("below", new AshenEstuary().collate181(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift181() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.collate181(3));
        assertEquals("upper-bound", subject.collate181(8));
    }

    @Test
    void classifiesWithinAndAboveDrift181() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.collate181(3 + 1));
        assertEquals("above", subject.collate181(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio182() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally182());
        }
        assertEquals(3, subject.threshold182Count());
    }

    @Test
    void refusesOnceExhaustedRatio182() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.tally182();
        }
        assertFalse(subject.tally182());
    }

    @Test
    void accumulatesBelowTheCapOffset183() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.furl183(1));
        assertEquals(3, subject.furl183(2));
    }

    @Test
    void saturatesAtTheCapOffset183() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl183(43);
        assertEquals(43, subject.furl183(5));
    }

    @Test
    void ignoresNegativeValuesOffset183() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl183(3);
        assertEquals(3, subject.furl183(-2));
        assertEquals(3, subject.span183Value());
    }

    @Test
    void rejectsZeroDenominatorRatio184() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.gauge184(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio184() {
        assertEquals(0.5, new AshenEstuary().gauge184(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio184() {
        assertEquals(5.0, new AshenEstuary().gauge184(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias185() {
        assertTrue(new AshenEstuary().collate185(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias185() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenEstuary().collate185(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias185() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenEstuary().collate185(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift186() {
        assertEquals("below", new AshenEstuary().collate186(4 - 1));
    }

    @Test
    void classifiesTheBoundsDrift186() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.collate186(4));
        assertEquals("upper-bound", subject.collate186(7));
    }

    @Test
    void classifiesWithinAndAboveDrift186() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.collate186(4 + 1));
        assertEquals("above", subject.collate186(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias187() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten187());
        }
        assertEquals(4, subject.depth187Count());
    }

    @Test
    void refusesOnceExhaustedBias187() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.flatten187();
        }
        assertFalse(subject.flatten187());
    }

    @Test
    void accumulatesBelowTheCapTally188() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.furl188(1));
        assertEquals(3, subject.furl188(2));
    }

    @Test
    void saturatesAtTheCapTally188() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl188(48);
        assertEquals(48, subject.furl188(5));
    }

    @Test
    void ignoresNegativeValuesTally188() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl188(3);
        assertEquals(3, subject.furl188(-2));
        assertEquals(3, subject.margin188Value());
    }

    @Test
    void rejectsZeroDenominatorBias189() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.prune189(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias189() {
        assertEquals(0.5, new AshenEstuary().prune189(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias189() {
        assertEquals(5.0, new AshenEstuary().prune189(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold190() {
        assertTrue(new AshenEstuary().hoist190(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold190() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenEstuary().hoist190(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsThreshold190() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenEstuary().hoist190(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth191() {
        assertEquals("below", new AshenEstuary().tally191(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth191() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.tally191(5));
        assertEquals("upper-bound", subject.tally191(12));
    }

    @Test
    void classifiesWithinAndAboveDepth191() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.tally191(5 + 1));
        assertEquals("above", subject.tally191(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin192() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle192());
        }
        assertEquals(1, subject.depth192Count());
    }

    @Test
    void refusesOnceExhaustedMargin192() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.kindle192();
        }
        assertFalse(subject.kindle192());
    }

    @Test
    void accumulatesBelowTheCapDrift193() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.furl193(1));
        assertEquals(3, subject.furl193(2));
    }

    @Test
    void saturatesAtTheCapDrift193() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl193(53);
        assertEquals(53, subject.furl193(5));
    }

    @Test
    void ignoresNegativeValuesDrift193() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl193(3);
        assertEquals(3, subject.furl193(-2));
        assertEquals(3, subject.threshold193Value());
    }

    @Test
    void rejectsZeroDenominatorBias194() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.gauge194(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias194() {
        assertEquals(0.5, new AshenEstuary().gauge194(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias194() {
        assertEquals(5.0, new AshenEstuary().gauge194(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold195() {
        assertTrue(new AshenEstuary().temper195(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold195() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenEstuary().temper195(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold195() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenEstuary().temper195(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio196() {
        assertEquals("below", new AshenEstuary().reconcile196(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio196() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.reconcile196(2));
        assertEquals("upper-bound", subject.reconcile196(11));
    }

    @Test
    void classifiesWithinAndAboveRatio196() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.reconcile196(2 + 1));
        assertEquals("above", subject.reconcile196(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio197() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile197());
        }
        assertEquals(2, subject.yield197Count());
    }

    @Test
    void refusesOnceExhaustedRatio197() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.reconcile197();
        }
        assertFalse(subject.reconcile197());
    }

    @Test
    void accumulatesBelowTheCapThreshold198() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.temper198(1));
        assertEquals(3, subject.temper198(2));
    }

    @Test
    void saturatesAtTheCapThreshold198() {
        AshenEstuary subject = new AshenEstuary();
        subject.temper198(58);
        assertEquals(58, subject.temper198(5));
    }

    @Test
    void ignoresNegativeValuesThreshold198() {
        AshenEstuary subject = new AshenEstuary();
        subject.temper198(3);
        assertEquals(3, subject.temper198(-2));
        assertEquals(3, subject.capacity198Value());
    }

    @Test
    void rejectsZeroDenominatorOffset199() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.gauge199(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset199() {
        assertEquals(0.5, new AshenEstuary().gauge199(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset199() {
        assertEquals(5.0, new AshenEstuary().gauge199(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield200() {
        assertTrue(new AshenEstuary().sift200(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield200() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenEstuary().sift200(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield200() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenEstuary().sift200(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight201() {
        assertEquals("below", new AshenEstuary().flatten201(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight201() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.flatten201(3));
        assertEquals("upper-bound", subject.flatten201(10));
    }

    @Test
    void classifiesWithinAndAboveWeight201() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.flatten201(3 + 1));
        assertEquals("above", subject.flatten201(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift202() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle202());
        }
        assertEquals(3, subject.tally202Count());
    }

    @Test
    void refusesOnceExhaustedDrift202() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.kindle202();
        }
        assertFalse(subject.kindle202());
    }

    @Test
    void accumulatesBelowTheCapQuota203() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.hoist203(1));
        assertEquals(3, subject.hoist203(2));
    }

    @Test
    void saturatesAtTheCapQuota203() {
        AshenEstuary subject = new AshenEstuary();
        subject.hoist203(23);
        assertEquals(23, subject.hoist203(5));
    }

    @Test
    void ignoresNegativeValuesQuota203() {
        AshenEstuary subject = new AshenEstuary();
        subject.hoist203(3);
        assertEquals(3, subject.hoist203(-2));
        assertEquals(3, subject.threshold203Value());
    }

    @Test
    void rejectsZeroDenominatorMargin204() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.collate204(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin204() {
        assertEquals(0.5, new AshenEstuary().collate204(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin204() {
        assertEquals(5.0, new AshenEstuary().collate204(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan205() {
        assertTrue(new AshenEstuary().temper205(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan205() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenEstuary().temper205(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan205() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenEstuary().temper205(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota206() {
        assertEquals("below", new AshenEstuary().sift206(4 - 1));
    }

    @Test
    void classifiesTheBoundsQuota206() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.sift206(4));
        assertEquals("upper-bound", subject.sift206(9));
    }

    @Test
    void classifiesWithinAndAboveQuota206() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.sift206(4 + 1));
        assertEquals("above", subject.sift206(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold207() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.anneal207());
        }
        assertEquals(4, subject.span207Count());
    }

    @Test
    void refusesOnceExhaustedThreshold207() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.anneal207();
        }
        assertFalse(subject.anneal207());
    }

    @Test
    void accumulatesBelowTheCapTally208() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.winnow208(1));
        assertEquals(3, subject.winnow208(2));
    }

    @Test
    void saturatesAtTheCapTally208() {
        AshenEstuary subject = new AshenEstuary();
        subject.winnow208(28);
        assertEquals(28, subject.winnow208(5));
    }

    @Test
    void ignoresNegativeValuesTally208() {
        AshenEstuary subject = new AshenEstuary();
        subject.winnow208(3);
        assertEquals(3, subject.winnow208(-2));
        assertEquals(3, subject.cadence208Value());
    }

    @Test
    void rejectsZeroDenominatorTally209() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.collate209(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally209() {
        assertEquals(0.5, new AshenEstuary().collate209(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally209() {
        assertEquals(5.0, new AshenEstuary().collate209(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan210() {
        assertTrue(new AshenEstuary().winnow210(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan210() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenEstuary().winnow210(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan210() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenEstuary().winnow210(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset211() {
        assertEquals("below", new AshenEstuary().kindle211(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset211() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.kindle211(5));
        assertEquals("upper-bound", subject.kindle211(8));
    }

    @Test
    void classifiesWithinAndAboveOffset211() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.kindle211(5 + 1));
        assertEquals("above", subject.kindle211(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan212() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper212());
        }
        assertEquals(1, subject.yield212Count());
    }

    @Test
    void refusesOnceExhaustedSpan212() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.temper212();
        }
        assertFalse(subject.temper212());
    }

    @Test
    void accumulatesBelowTheCapDepth213() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.hoist213(1));
        assertEquals(3, subject.hoist213(2));
    }

    @Test
    void saturatesAtTheCapDepth213() {
        AshenEstuary subject = new AshenEstuary();
        subject.hoist213(33);
        assertEquals(33, subject.hoist213(5));
    }

    @Test
    void ignoresNegativeValuesDepth213() {
        AshenEstuary subject = new AshenEstuary();
        subject.hoist213(3);
        assertEquals(3, subject.hoist213(-2));
        assertEquals(3, subject.cadence213Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity214() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.reconcile214(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity214() {
        assertEquals(0.5, new AshenEstuary().reconcile214(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity214() {
        assertEquals(5.0, new AshenEstuary().reconcile214(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield215() {
        assertTrue(new AshenEstuary().flatten215(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield215() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenEstuary().flatten215(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsYield215() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenEstuary().flatten215(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence216() {
        assertEquals("below", new AshenEstuary().brace216(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence216() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.brace216(2));
        assertEquals("upper-bound", subject.brace216(7));
    }

    @Test
    void classifiesWithinAndAboveCadence216() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.brace216(2 + 1));
        assertEquals("above", subject.brace216(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield217() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift217());
        }
        assertEquals(2, subject.bias217Count());
    }

    @Test
    void refusesOnceExhaustedYield217() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.sift217();
        }
        assertFalse(subject.sift217());
    }

    @Test
    void accumulatesBelowTheCapCapacity218() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.kindle218(1));
        assertEquals(3, subject.kindle218(2));
    }

    @Test
    void saturatesAtTheCapCapacity218() {
        AshenEstuary subject = new AshenEstuary();
        subject.kindle218(38);
        assertEquals(38, subject.kindle218(5));
    }

    @Test
    void ignoresNegativeValuesCapacity218() {
        AshenEstuary subject = new AshenEstuary();
        subject.kindle218(3);
        assertEquals(3, subject.kindle218(-2));
        assertEquals(3, subject.span218Value());
    }

    @Test
    void rejectsZeroDenominatorOffset219() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.gauge219(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset219() {
        assertEquals(0.5, new AshenEstuary().gauge219(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset219() {
        assertEquals(5.0, new AshenEstuary().gauge219(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin220() {
        assertTrue(new AshenEstuary().furl220(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin220() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenEstuary().furl220(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsMargin220() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenEstuary().furl220(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin221() {
        assertEquals("below", new AshenEstuary().furl221(3 - 1));
    }

    @Test
    void classifiesTheBoundsMargin221() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.furl221(3));
        assertEquals("upper-bound", subject.furl221(12));
    }

    @Test
    void classifiesWithinAndAboveMargin221() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.furl221(3 + 1));
        assertEquals("above", subject.furl221(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold222() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace222());
        }
        assertEquals(3, subject.tally222Count());
    }

    @Test
    void refusesOnceExhaustedThreshold222() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.brace222();
        }
        assertFalse(subject.brace222());
    }

    @Test
    void accumulatesBelowTheCapYield223() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.prune223(1));
        assertEquals(3, subject.prune223(2));
    }

    @Test
    void saturatesAtTheCapYield223() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune223(43);
        assertEquals(43, subject.prune223(5));
    }

    @Test
    void ignoresNegativeValuesYield223() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune223(3);
        assertEquals(3, subject.prune223(-2));
        assertEquals(3, subject.cadence223Value());
    }

    @Test
    void rejectsZeroDenominatorQuota224() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.anneal224(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota224() {
        assertEquals(0.5, new AshenEstuary().anneal224(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota224() {
        assertEquals(5.0, new AshenEstuary().anneal224(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan225() {
        assertTrue(new AshenEstuary().anneal225(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan225() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenEstuary().anneal225(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan225() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenEstuary().anneal225(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio226() {
        assertEquals("below", new AshenEstuary().anneal226(4 - 1));
    }

    @Test
    void classifiesTheBoundsRatio226() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.anneal226(4));
        assertEquals("upper-bound", subject.anneal226(11));
    }

    @Test
    void classifiesWithinAndAboveRatio226() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.anneal226(4 + 1));
        assertEquals("above", subject.anneal226(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence227() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile227());
        }
        assertEquals(4, subject.tally227Count());
    }

    @Test
    void refusesOnceExhaustedCadence227() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.reconcile227();
        }
        assertFalse(subject.reconcile227());
    }

    @Test
    void accumulatesBelowTheCapThreshold228() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.anneal228(1));
        assertEquals(3, subject.anneal228(2));
    }

    @Test
    void saturatesAtTheCapThreshold228() {
        AshenEstuary subject = new AshenEstuary();
        subject.anneal228(48);
        assertEquals(48, subject.anneal228(5));
    }

    @Test
    void ignoresNegativeValuesThreshold228() {
        AshenEstuary subject = new AshenEstuary();
        subject.anneal228(3);
        assertEquals(3, subject.anneal228(-2));
        assertEquals(3, subject.offset228Value());
    }

    @Test
    void rejectsZeroDenominatorRatio229() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.collate229(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio229() {
        assertEquals(0.5, new AshenEstuary().collate229(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio229() {
        assertEquals(5.0, new AshenEstuary().collate229(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan230() {
        assertTrue(new AshenEstuary().prune230(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan230() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenEstuary().prune230(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan230() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenEstuary().prune230(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift231() {
        assertEquals("below", new AshenEstuary().prune231(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift231() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.prune231(5));
        assertEquals("upper-bound", subject.prune231(10));
    }

    @Test
    void classifiesWithinAndAboveDrift231() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.prune231(5 + 1));
        assertEquals("above", subject.prune231(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias232() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow232());
        }
        assertEquals(1, subject.quota232Count());
    }

    @Test
    void refusesOnceExhaustedBias232() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.winnow232();
        }
        assertFalse(subject.winnow232());
    }

    @Test
    void accumulatesBelowTheCapMargin233() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.hoist233(1));
        assertEquals(3, subject.hoist233(2));
    }

    @Test
    void saturatesAtTheCapMargin233() {
        AshenEstuary subject = new AshenEstuary();
        subject.hoist233(53);
        assertEquals(53, subject.hoist233(5));
    }

    @Test
    void ignoresNegativeValuesMargin233() {
        AshenEstuary subject = new AshenEstuary();
        subject.hoist233(3);
        assertEquals(3, subject.hoist233(-2));
        assertEquals(3, subject.ratio233Value());
    }

    @Test
    void rejectsZeroDenominatorDrift234() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.reconcile234(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift234() {
        assertEquals(0.5, new AshenEstuary().reconcile234(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift234() {
        assertEquals(5.0, new AshenEstuary().reconcile234(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio235() {
        assertTrue(new AshenEstuary().hoist235(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio235() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenEstuary().hoist235(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsRatio235() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenEstuary().hoist235(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity236() {
        assertEquals("below", new AshenEstuary().temper236(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity236() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.temper236(2));
        assertEquals("upper-bound", subject.temper236(9));
    }

    @Test
    void classifiesWithinAndAboveCapacity236() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.temper236(2 + 1));
        assertEquals("above", subject.temper236(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota237() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile237());
        }
        assertEquals(2, subject.yield237Count());
    }

    @Test
    void refusesOnceExhaustedQuota237() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.reconcile237();
        }
        assertFalse(subject.reconcile237());
    }

    @Test
    void accumulatesBelowTheCapMargin238() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.brace238(1));
        assertEquals(3, subject.brace238(2));
    }

    @Test
    void saturatesAtTheCapMargin238() {
        AshenEstuary subject = new AshenEstuary();
        subject.brace238(58);
        assertEquals(58, subject.brace238(5));
    }

    @Test
    void ignoresNegativeValuesMargin238() {
        AshenEstuary subject = new AshenEstuary();
        subject.brace238(3);
        assertEquals(3, subject.brace238(-2));
        assertEquals(3, subject.offset238Value());
    }

    @Test
    void rejectsZeroDenominatorOffset239() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.tally239(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset239() {
        assertEquals(0.5, new AshenEstuary().tally239(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset239() {
        assertEquals(5.0, new AshenEstuary().tally239(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin240() {
        assertTrue(new AshenEstuary().winnow240(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin240() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenEstuary().winnow240(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin240() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenEstuary().winnow240(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift241() {
        assertEquals("below", new AshenEstuary().hoist241(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift241() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.hoist241(3));
        assertEquals("upper-bound", subject.hoist241(8));
    }

    @Test
    void classifiesWithinAndAboveDrift241() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.hoist241(3 + 1));
        assertEquals("above", subject.hoist241(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence242() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle242());
        }
        assertEquals(3, subject.span242Count());
    }

    @Test
    void refusesOnceExhaustedCadence242() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.kindle242();
        }
        assertFalse(subject.kindle242());
    }

    @Test
    void accumulatesBelowTheCapOffset243() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.kindle243(1));
        assertEquals(3, subject.kindle243(2));
    }

    @Test
    void saturatesAtTheCapOffset243() {
        AshenEstuary subject = new AshenEstuary();
        subject.kindle243(23);
        assertEquals(23, subject.kindle243(5));
    }

    @Test
    void ignoresNegativeValuesOffset243() {
        AshenEstuary subject = new AshenEstuary();
        subject.kindle243(3);
        assertEquals(3, subject.kindle243(-2));
        assertEquals(3, subject.bias243Value());
    }

    @Test
    void rejectsZeroDenominatorRatio244() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.prune244(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio244() {
        assertEquals(0.5, new AshenEstuary().prune244(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio244() {
        assertEquals(5.0, new AshenEstuary().prune244(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan245() {
        assertTrue(new AshenEstuary().tally245(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan245() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenEstuary().tally245(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan245() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenEstuary().tally245(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset246() {
        assertEquals("below", new AshenEstuary().gauge246(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset246() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.gauge246(4));
        assertEquals("upper-bound", subject.gauge246(7));
    }

    @Test
    void classifiesWithinAndAboveOffset246() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.gauge246(4 + 1));
        assertEquals("above", subject.gauge246(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally247() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally247());
        }
        assertEquals(4, subject.ratio247Count());
    }

    @Test
    void refusesOnceExhaustedTally247() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.tally247();
        }
        assertFalse(subject.tally247());
    }

    @Test
    void accumulatesBelowTheCapSpan248() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.prune248(1));
        assertEquals(3, subject.prune248(2));
    }

    @Test
    void saturatesAtTheCapSpan248() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune248(28);
        assertEquals(28, subject.prune248(5));
    }

    @Test
    void ignoresNegativeValuesSpan248() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune248(3);
        assertEquals(3, subject.prune248(-2));
        assertEquals(3, subject.weight248Value());
    }

    @Test
    void rejectsZeroDenominatorBias249() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.furl249(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias249() {
        assertEquals(0.5, new AshenEstuary().furl249(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias249() {
        assertEquals(5.0, new AshenEstuary().furl249(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity250() {
        assertTrue(new AshenEstuary().kindle250(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity250() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenEstuary().kindle250(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsCapacity250() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenEstuary().kindle250(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth251() {
        assertEquals("below", new AshenEstuary().collate251(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth251() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.collate251(5));
        assertEquals("upper-bound", subject.collate251(12));
    }

    @Test
    void classifiesWithinAndAboveDepth251() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.collate251(5 + 1));
        assertEquals("above", subject.collate251(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset252() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune252());
        }
        assertEquals(1, subject.cadence252Count());
    }

    @Test
    void refusesOnceExhaustedOffset252() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.prune252();
        }
        assertFalse(subject.prune252());
    }

    @Test
    void accumulatesBelowTheCapSpan253() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.brace253(1));
        assertEquals(3, subject.brace253(2));
    }

    @Test
    void saturatesAtTheCapSpan253() {
        AshenEstuary subject = new AshenEstuary();
        subject.brace253(33);
        assertEquals(33, subject.brace253(5));
    }

    @Test
    void ignoresNegativeValuesSpan253() {
        AshenEstuary subject = new AshenEstuary();
        subject.brace253(3);
        assertEquals(3, subject.brace253(-2));
        assertEquals(3, subject.tally253Value());
    }

    @Test
    void rejectsZeroDenominatorDrift254() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.hoist254(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift254() {
        assertEquals(0.5, new AshenEstuary().hoist254(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift254() {
        assertEquals(5.0, new AshenEstuary().hoist254(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota255() {
        assertTrue(new AshenEstuary().furl255(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota255() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenEstuary().furl255(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota255() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenEstuary().furl255(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold256() {
        assertEquals("below", new AshenEstuary().furl256(2 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold256() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.furl256(2));
        assertEquals("upper-bound", subject.furl256(11));
    }

    @Test
    void classifiesWithinAndAboveThreshold256() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.furl256(2 + 1));
        assertEquals("above", subject.furl256(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth257() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift257());
        }
        assertEquals(2, subject.offset257Count());
    }

    @Test
    void refusesOnceExhaustedDepth257() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.sift257();
        }
        assertFalse(subject.sift257());
    }

    @Test
    void accumulatesBelowTheCapCapacity258() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.gauge258(1));
        assertEquals(3, subject.gauge258(2));
    }

    @Test
    void saturatesAtTheCapCapacity258() {
        AshenEstuary subject = new AshenEstuary();
        subject.gauge258(38);
        assertEquals(38, subject.gauge258(5));
    }

    @Test
    void ignoresNegativeValuesCapacity258() {
        AshenEstuary subject = new AshenEstuary();
        subject.gauge258(3);
        assertEquals(3, subject.gauge258(-2));
        assertEquals(3, subject.offset258Value());
    }

    @Test
    void rejectsZeroDenominatorWeight259() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.prune259(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight259() {
        assertEquals(0.5, new AshenEstuary().prune259(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight259() {
        assertEquals(5.0, new AshenEstuary().prune259(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift260() {
        assertTrue(new AshenEstuary().reconcile260(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift260() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenEstuary().reconcile260(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsDrift260() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenEstuary().reconcile260(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally261() {
        assertEquals("below", new AshenEstuary().tally261(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally261() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.tally261(3));
        assertEquals("upper-bound", subject.tally261(10));
    }

    @Test
    void classifiesWithinAndAboveTally261() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.tally261(3 + 1));
        assertEquals("above", subject.tally261(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight262() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten262());
        }
        assertEquals(3, subject.ratio262Count());
    }

    @Test
    void refusesOnceExhaustedWeight262() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.flatten262();
        }
        assertFalse(subject.flatten262());
    }

    @Test
    void accumulatesBelowTheCapCadence263() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.anneal263(1));
        assertEquals(3, subject.anneal263(2));
    }

    @Test
    void saturatesAtTheCapCadence263() {
        AshenEstuary subject = new AshenEstuary();
        subject.anneal263(43);
        assertEquals(43, subject.anneal263(5));
    }

    @Test
    void ignoresNegativeValuesCadence263() {
        AshenEstuary subject = new AshenEstuary();
        subject.anneal263(3);
        assertEquals(3, subject.anneal263(-2));
        assertEquals(3, subject.quota263Value());
    }

    @Test
    void rejectsZeroDenominatorSpan264() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.hoist264(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan264() {
        assertEquals(0.5, new AshenEstuary().hoist264(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan264() {
        assertEquals(5.0, new AshenEstuary().hoist264(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset265() {
        assertTrue(new AshenEstuary().kindle265(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset265() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenEstuary().kindle265(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset265() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenEstuary().kindle265(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin266() {
        assertEquals("below", new AshenEstuary().furl266(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin266() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.furl266(4));
        assertEquals("upper-bound", subject.furl266(9));
    }

    @Test
    void classifiesWithinAndAboveMargin266() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.furl266(4 + 1));
        assertEquals("above", subject.furl266(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota267() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune267());
        }
        assertEquals(4, subject.bias267Count());
    }

    @Test
    void refusesOnceExhaustedQuota267() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.prune267();
        }
        assertFalse(subject.prune267());
    }

    @Test
    void accumulatesBelowTheCapDrift268() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.brace268(1));
        assertEquals(3, subject.brace268(2));
    }

    @Test
    void saturatesAtTheCapDrift268() {
        AshenEstuary subject = new AshenEstuary();
        subject.brace268(48);
        assertEquals(48, subject.brace268(5));
    }

    @Test
    void ignoresNegativeValuesDrift268() {
        AshenEstuary subject = new AshenEstuary();
        subject.brace268(3);
        assertEquals(3, subject.brace268(-2));
        assertEquals(3, subject.span268Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity269() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.temper269(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity269() {
        assertEquals(0.5, new AshenEstuary().temper269(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity269() {
        assertEquals(5.0, new AshenEstuary().temper269(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity270() {
        assertTrue(new AshenEstuary().hoist270(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity270() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenEstuary().hoist270(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity270() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenEstuary().hoist270(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold271() {
        assertEquals("below", new AshenEstuary().anneal271(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold271() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.anneal271(5));
        assertEquals("upper-bound", subject.anneal271(8));
    }

    @Test
    void classifiesWithinAndAboveThreshold271() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.anneal271(5 + 1));
        assertEquals("above", subject.anneal271(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset272() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper272());
        }
        assertEquals(1, subject.threshold272Count());
    }

    @Test
    void refusesOnceExhaustedOffset272() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.temper272();
        }
        assertFalse(subject.temper272());
    }

    @Test
    void accumulatesBelowTheCapWeight273() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.sift273(1));
        assertEquals(3, subject.sift273(2));
    }

    @Test
    void saturatesAtTheCapWeight273() {
        AshenEstuary subject = new AshenEstuary();
        subject.sift273(53);
        assertEquals(53, subject.sift273(5));
    }

    @Test
    void ignoresNegativeValuesWeight273() {
        AshenEstuary subject = new AshenEstuary();
        subject.sift273(3);
        assertEquals(3, subject.sift273(-2));
        assertEquals(3, subject.margin273Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity274() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.tally274(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity274() {
        assertEquals(0.5, new AshenEstuary().tally274(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity274() {
        assertEquals(5.0, new AshenEstuary().tally274(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin275() {
        assertTrue(new AshenEstuary().furl275(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin275() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenEstuary().furl275(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin275() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenEstuary().furl275(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias276() {
        assertEquals("below", new AshenEstuary().gauge276(2 - 1));
    }

    @Test
    void classifiesTheBoundsBias276() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.gauge276(2));
        assertEquals("upper-bound", subject.gauge276(7));
    }

    @Test
    void classifiesWithinAndAboveBias276() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.gauge276(2 + 1));
        assertEquals("above", subject.gauge276(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift277() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal277());
        }
        assertEquals(2, subject.yield277Count());
    }

    @Test
    void refusesOnceExhaustedDrift277() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.anneal277();
        }
        assertFalse(subject.anneal277());
    }

    @Test
    void accumulatesBelowTheCapOffset278() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.winnow278(1));
        assertEquals(3, subject.winnow278(2));
    }

    @Test
    void saturatesAtTheCapOffset278() {
        AshenEstuary subject = new AshenEstuary();
        subject.winnow278(58);
        assertEquals(58, subject.winnow278(5));
    }

    @Test
    void ignoresNegativeValuesOffset278() {
        AshenEstuary subject = new AshenEstuary();
        subject.winnow278(3);
        assertEquals(3, subject.winnow278(-2));
        assertEquals(3, subject.span278Value());
    }

    @Test
    void rejectsZeroDenominatorSpan279() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.gauge279(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan279() {
        assertEquals(0.5, new AshenEstuary().gauge279(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan279() {
        assertEquals(5.0, new AshenEstuary().gauge279(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias280() {
        assertTrue(new AshenEstuary().reconcile280(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias280() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenEstuary().reconcile280(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias280() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenEstuary().reconcile280(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold281() {
        assertEquals("below", new AshenEstuary().flatten281(3 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold281() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.flatten281(3));
        assertEquals("upper-bound", subject.flatten281(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold281() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.flatten281(3 + 1));
        assertEquals("above", subject.flatten281(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift282() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.collate282());
        }
        assertEquals(3, subject.quota282Count());
    }

    @Test
    void refusesOnceExhaustedDrift282() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.collate282();
        }
        assertFalse(subject.collate282());
    }

    @Test
    void accumulatesBelowTheCapBias283() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.collate283(1));
        assertEquals(3, subject.collate283(2));
    }

    @Test
    void saturatesAtTheCapBias283() {
        AshenEstuary subject = new AshenEstuary();
        subject.collate283(23);
        assertEquals(23, subject.collate283(5));
    }

    @Test
    void ignoresNegativeValuesBias283() {
        AshenEstuary subject = new AshenEstuary();
        subject.collate283(3);
        assertEquals(3, subject.collate283(-2));
        assertEquals(3, subject.depth283Value());
    }

    @Test
    void rejectsZeroDenominatorBias284() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.furl284(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias284() {
        assertEquals(0.5, new AshenEstuary().furl284(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias284() {
        assertEquals(5.0, new AshenEstuary().furl284(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence285() {
        assertTrue(new AshenEstuary().winnow285(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence285() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenEstuary().winnow285(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence285() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenEstuary().winnow285(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset286() {
        assertEquals("below", new AshenEstuary().prune286(4 - 1));
    }

    @Test
    void classifiesTheBoundsOffset286() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.prune286(4));
        assertEquals("upper-bound", subject.prune286(11));
    }

    @Test
    void classifiesWithinAndAboveOffset286() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.prune286(4 + 1));
        assertEquals("above", subject.prune286(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio287() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow287());
        }
        assertEquals(4, subject.weight287Count());
    }

    @Test
    void refusesOnceExhaustedRatio287() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.winnow287();
        }
        assertFalse(subject.winnow287());
    }

    @Test
    void accumulatesBelowTheCapCadence288() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.furl288(1));
        assertEquals(3, subject.furl288(2));
    }

    @Test
    void saturatesAtTheCapCadence288() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl288(28);
        assertEquals(28, subject.furl288(5));
    }

    @Test
    void ignoresNegativeValuesCadence288() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl288(3);
        assertEquals(3, subject.furl288(-2));
        assertEquals(3, subject.margin288Value());
    }

    @Test
    void rejectsZeroDenominatorBias289() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.kindle289(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias289() {
        assertEquals(0.5, new AshenEstuary().kindle289(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias289() {
        assertEquals(5.0, new AshenEstuary().kindle289(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity290() {
        assertTrue(new AshenEstuary().hoist290(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity290() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenEstuary().hoist290(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCapacity290() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenEstuary().hoist290(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity291() {
        assertEquals("below", new AshenEstuary().reconcile291(5 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity291() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.reconcile291(5));
        assertEquals("upper-bound", subject.reconcile291(10));
    }

    @Test
    void classifiesWithinAndAboveCapacity291() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.reconcile291(5 + 1));
        assertEquals("above", subject.reconcile291(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold292() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle292());
        }
        assertEquals(1, subject.margin292Count());
    }

    @Test
    void refusesOnceExhaustedThreshold292() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.kindle292();
        }
        assertFalse(subject.kindle292());
    }

    @Test
    void accumulatesBelowTheCapBias293() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.hoist293(1));
        assertEquals(3, subject.hoist293(2));
    }

    @Test
    void saturatesAtTheCapBias293() {
        AshenEstuary subject = new AshenEstuary();
        subject.hoist293(33);
        assertEquals(33, subject.hoist293(5));
    }

    @Test
    void ignoresNegativeValuesBias293() {
        AshenEstuary subject = new AshenEstuary();
        subject.hoist293(3);
        assertEquals(3, subject.hoist293(-2));
        assertEquals(3, subject.margin293Value());
    }

    @Test
    void rejectsZeroDenominatorTally294() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.hoist294(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally294() {
        assertEquals(0.5, new AshenEstuary().hoist294(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally294() {
        assertEquals(5.0, new AshenEstuary().hoist294(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight295() {
        assertTrue(new AshenEstuary().kindle295(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight295() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenEstuary().kindle295(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsWeight295() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenEstuary().kindle295(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift296() {
        assertEquals("below", new AshenEstuary().flatten296(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift296() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.flatten296(2));
        assertEquals("upper-bound", subject.flatten296(9));
    }

    @Test
    void classifiesWithinAndAboveDrift296() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.flatten296(2 + 1));
        assertEquals("above", subject.flatten296(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally297() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.tally297());
        }
        assertEquals(2, subject.capacity297Count());
    }

    @Test
    void refusesOnceExhaustedTally297() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.tally297();
        }
        assertFalse(subject.tally297());
    }

    @Test
    void accumulatesBelowTheCapYield298() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.anneal298(1));
        assertEquals(3, subject.anneal298(2));
    }

    @Test
    void saturatesAtTheCapYield298() {
        AshenEstuary subject = new AshenEstuary();
        subject.anneal298(38);
        assertEquals(38, subject.anneal298(5));
    }

    @Test
    void ignoresNegativeValuesYield298() {
        AshenEstuary subject = new AshenEstuary();
        subject.anneal298(3);
        assertEquals(3, subject.anneal298(-2));
        assertEquals(3, subject.ratio298Value());
    }

    @Test
    void rejectsZeroDenominatorSpan299() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.prune299(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan299() {
        assertEquals(0.5, new AshenEstuary().prune299(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan299() {
        assertEquals(5.0, new AshenEstuary().prune299(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset300() {
        assertTrue(new AshenEstuary().temper300(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset300() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenEstuary().temper300(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsOffset300() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenEstuary().temper300(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota301() {
        assertEquals("below", new AshenEstuary().sift301(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota301() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.sift301(3));
        assertEquals("upper-bound", subject.sift301(8));
    }

    @Test
    void classifiesWithinAndAboveQuota301() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.sift301(3 + 1));
        assertEquals("above", subject.sift301(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth302() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.tally302());
        }
        assertEquals(3, subject.threshold302Count());
    }

    @Test
    void refusesOnceExhaustedDepth302() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.tally302();
        }
        assertFalse(subject.tally302());
    }

    @Test
    void accumulatesBelowTheCapQuota303() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.brace303(1));
        assertEquals(3, subject.brace303(2));
    }

    @Test
    void saturatesAtTheCapQuota303() {
        AshenEstuary subject = new AshenEstuary();
        subject.brace303(43);
        assertEquals(43, subject.brace303(5));
    }

    @Test
    void ignoresNegativeValuesQuota303() {
        AshenEstuary subject = new AshenEstuary();
        subject.brace303(3);
        assertEquals(3, subject.brace303(-2));
        assertEquals(3, subject.threshold303Value());
    }

    @Test
    void rejectsZeroDenominatorMargin304() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.kindle304(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin304() {
        assertEquals(0.5, new AshenEstuary().kindle304(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin304() {
        assertEquals(5.0, new AshenEstuary().kindle304(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight305() {
        assertTrue(new AshenEstuary().sift305(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight305() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenEstuary().sift305(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight305() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenEstuary().sift305(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity306() {
        assertEquals("below", new AshenEstuary().tally306(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity306() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.tally306(4));
        assertEquals("upper-bound", subject.tally306(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity306() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.tally306(4 + 1));
        assertEquals("above", subject.tally306(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias307() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile307());
        }
        assertEquals(4, subject.yield307Count());
    }

    @Test
    void refusesOnceExhaustedBias307() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.reconcile307();
        }
        assertFalse(subject.reconcile307());
    }

    @Test
    void accumulatesBelowTheCapYield308() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.winnow308(1));
        assertEquals(3, subject.winnow308(2));
    }

    @Test
    void saturatesAtTheCapYield308() {
        AshenEstuary subject = new AshenEstuary();
        subject.winnow308(48);
        assertEquals(48, subject.winnow308(5));
    }

    @Test
    void ignoresNegativeValuesYield308() {
        AshenEstuary subject = new AshenEstuary();
        subject.winnow308(3);
        assertEquals(3, subject.winnow308(-2));
        assertEquals(3, subject.offset308Value());
    }

    @Test
    void rejectsZeroDenominatorSpan309() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.kindle309(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan309() {
        assertEquals(0.5, new AshenEstuary().kindle309(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan309() {
        assertEquals(5.0, new AshenEstuary().kindle309(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield310() {
        assertTrue(new AshenEstuary().sift310(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield310() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenEstuary().sift310(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsYield310() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenEstuary().sift310(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias311() {
        assertEquals("below", new AshenEstuary().collate311(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias311() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.collate311(5));
        assertEquals("upper-bound", subject.collate311(12));
    }

    @Test
    void classifiesWithinAndAboveBias311() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.collate311(5 + 1));
        assertEquals("above", subject.collate311(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias312() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl312());
        }
        assertEquals(1, subject.capacity312Count());
    }

    @Test
    void refusesOnceExhaustedBias312() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.furl312();
        }
        assertFalse(subject.furl312());
    }

    @Test
    void accumulatesBelowTheCapYield313() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.sift313(1));
        assertEquals(3, subject.sift313(2));
    }

    @Test
    void saturatesAtTheCapYield313() {
        AshenEstuary subject = new AshenEstuary();
        subject.sift313(53);
        assertEquals(53, subject.sift313(5));
    }

    @Test
    void ignoresNegativeValuesYield313() {
        AshenEstuary subject = new AshenEstuary();
        subject.sift313(3);
        assertEquals(3, subject.sift313(-2));
        assertEquals(3, subject.span313Value());
    }

    @Test
    void rejectsZeroDenominatorTally314() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.sift314(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally314() {
        assertEquals(0.5, new AshenEstuary().sift314(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally314() {
        assertEquals(5.0, new AshenEstuary().sift314(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan315() {
        assertTrue(new AshenEstuary().kindle315(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan315() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenEstuary().kindle315(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsSpan315() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenEstuary().kindle315(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity316() {
        assertEquals("below", new AshenEstuary().hoist316(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity316() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.hoist316(2));
        assertEquals("upper-bound", subject.hoist316(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity316() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.hoist316(2 + 1));
        assertEquals("above", subject.hoist316(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight317() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift317());
        }
        assertEquals(2, subject.span317Count());
    }

    @Test
    void refusesOnceExhaustedWeight317() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.sift317();
        }
        assertFalse(subject.sift317());
    }

    @Test
    void accumulatesBelowTheCapTally318() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.prune318(1));
        assertEquals(3, subject.prune318(2));
    }

    @Test
    void saturatesAtTheCapTally318() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune318(58);
        assertEquals(58, subject.prune318(5));
    }

    @Test
    void ignoresNegativeValuesTally318() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune318(3);
        assertEquals(3, subject.prune318(-2));
        assertEquals(3, subject.threshold318Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity319() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.sift319(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity319() {
        assertEquals(0.5, new AshenEstuary().sift319(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity319() {
        assertEquals(5.0, new AshenEstuary().sift319(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota320() {
        assertTrue(new AshenEstuary().tally320(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota320() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenEstuary().tally320(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsQuota320() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenEstuary().tally320(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield321() {
        assertEquals("below", new AshenEstuary().brace321(3 - 1));
    }

    @Test
    void classifiesTheBoundsYield321() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.brace321(3));
        assertEquals("upper-bound", subject.brace321(10));
    }

    @Test
    void classifiesWithinAndAboveYield321() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.brace321(3 + 1));
        assertEquals("above", subject.brace321(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan322() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.kindle322());
        }
        assertEquals(3, subject.cadence322Count());
    }

    @Test
    void refusesOnceExhaustedSpan322() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.kindle322();
        }
        assertFalse(subject.kindle322());
    }

    @Test
    void accumulatesBelowTheCapMargin323() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.reconcile323(1));
        assertEquals(3, subject.reconcile323(2));
    }

    @Test
    void saturatesAtTheCapMargin323() {
        AshenEstuary subject = new AshenEstuary();
        subject.reconcile323(23);
        assertEquals(23, subject.reconcile323(5));
    }

    @Test
    void ignoresNegativeValuesMargin323() {
        AshenEstuary subject = new AshenEstuary();
        subject.reconcile323(3);
        assertEquals(3, subject.reconcile323(-2));
        assertEquals(3, subject.span323Value());
    }

    @Test
    void rejectsZeroDenominatorDepth324() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.winnow324(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth324() {
        assertEquals(0.5, new AshenEstuary().winnow324(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth324() {
        assertEquals(5.0, new AshenEstuary().winnow324(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin325() {
        assertTrue(new AshenEstuary().hoist325(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin325() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenEstuary().hoist325(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin325() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenEstuary().hoist325(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias326() {
        assertEquals("below", new AshenEstuary().tally326(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias326() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.tally326(4));
        assertEquals("upper-bound", subject.tally326(9));
    }

    @Test
    void classifiesWithinAndAboveBias326() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.tally326(4 + 1));
        assertEquals("above", subject.tally326(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio327() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow327());
        }
        assertEquals(4, subject.margin327Count());
    }

    @Test
    void refusesOnceExhaustedRatio327() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.winnow327();
        }
        assertFalse(subject.winnow327());
    }

    @Test
    void accumulatesBelowTheCapRatio328() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.prune328(1));
        assertEquals(3, subject.prune328(2));
    }

    @Test
    void saturatesAtTheCapRatio328() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune328(28);
        assertEquals(28, subject.prune328(5));
    }

    @Test
    void ignoresNegativeValuesRatio328() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune328(3);
        assertEquals(3, subject.prune328(-2));
        assertEquals(3, subject.offset328Value());
    }

    @Test
    void rejectsZeroDenominatorBias329() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.tally329(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias329() {
        assertEquals(0.5, new AshenEstuary().tally329(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias329() {
        assertEquals(5.0, new AshenEstuary().tally329(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight330() {
        assertTrue(new AshenEstuary().reconcile330(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight330() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenEstuary().reconcile330(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight330() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenEstuary().reconcile330(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift331() {
        assertEquals("below", new AshenEstuary().collate331(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift331() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.collate331(5));
        assertEquals("upper-bound", subject.collate331(8));
    }

    @Test
    void classifiesWithinAndAboveDrift331() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.collate331(5 + 1));
        assertEquals("above", subject.collate331(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift332() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.kindle332());
        }
        assertEquals(1, subject.offset332Count());
    }

    @Test
    void refusesOnceExhaustedDrift332() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.kindle332();
        }
        assertFalse(subject.kindle332());
    }

    @Test
    void accumulatesBelowTheCapDrift333() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.anneal333(1));
        assertEquals(3, subject.anneal333(2));
    }

    @Test
    void saturatesAtTheCapDrift333() {
        AshenEstuary subject = new AshenEstuary();
        subject.anneal333(33);
        assertEquals(33, subject.anneal333(5));
    }

    @Test
    void ignoresNegativeValuesDrift333() {
        AshenEstuary subject = new AshenEstuary();
        subject.anneal333(3);
        assertEquals(3, subject.anneal333(-2));
        assertEquals(3, subject.offset333Value());
    }

    @Test
    void rejectsZeroDenominatorBias334() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.brace334(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias334() {
        assertEquals(0.5, new AshenEstuary().brace334(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias334() {
        assertEquals(5.0, new AshenEstuary().brace334(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan335() {
        assertTrue(new AshenEstuary().kindle335(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan335() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenEstuary().kindle335(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan335() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenEstuary().kindle335(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence336() {
        assertEquals("below", new AshenEstuary().kindle336(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence336() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.kindle336(2));
        assertEquals("upper-bound", subject.kindle336(7));
    }

    @Test
    void classifiesWithinAndAboveCadence336() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.kindle336(2 + 1));
        assertEquals("above", subject.kindle336(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth337() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace337());
        }
        assertEquals(2, subject.quota337Count());
    }

    @Test
    void refusesOnceExhaustedDepth337() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.brace337();
        }
        assertFalse(subject.brace337());
    }

    @Test
    void accumulatesBelowTheCapDepth338() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.hoist338(1));
        assertEquals(3, subject.hoist338(2));
    }

    @Test
    void saturatesAtTheCapDepth338() {
        AshenEstuary subject = new AshenEstuary();
        subject.hoist338(38);
        assertEquals(38, subject.hoist338(5));
    }

    @Test
    void ignoresNegativeValuesDepth338() {
        AshenEstuary subject = new AshenEstuary();
        subject.hoist338(3);
        assertEquals(3, subject.hoist338(-2));
        assertEquals(3, subject.bias338Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold339() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.brace339(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold339() {
        assertEquals(0.5, new AshenEstuary().brace339(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold339() {
        assertEquals(5.0, new AshenEstuary().brace339(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan340() {
        assertTrue(new AshenEstuary().flatten340(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan340() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenEstuary().flatten340(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsSpan340() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenEstuary().flatten340(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity341() {
        assertEquals("below", new AshenEstuary().collate341(3 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity341() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.collate341(3));
        assertEquals("upper-bound", subject.collate341(12));
    }

    @Test
    void classifiesWithinAndAboveCapacity341() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.collate341(3 + 1));
        assertEquals("above", subject.collate341(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin342() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.furl342());
        }
        assertEquals(3, subject.cadence342Count());
    }

    @Test
    void refusesOnceExhaustedMargin342() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.furl342();
        }
        assertFalse(subject.furl342());
    }

    @Test
    void accumulatesBelowTheCapDepth343() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.gauge343(1));
        assertEquals(3, subject.gauge343(2));
    }

    @Test
    void saturatesAtTheCapDepth343() {
        AshenEstuary subject = new AshenEstuary();
        subject.gauge343(43);
        assertEquals(43, subject.gauge343(5));
    }

    @Test
    void ignoresNegativeValuesDepth343() {
        AshenEstuary subject = new AshenEstuary();
        subject.gauge343(3);
        assertEquals(3, subject.gauge343(-2));
        assertEquals(3, subject.bias343Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold344() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.furl344(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold344() {
        assertEquals(0.5, new AshenEstuary().furl344(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold344() {
        assertEquals(5.0, new AshenEstuary().furl344(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence345() {
        assertTrue(new AshenEstuary().temper345(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence345() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenEstuary().temper345(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCadence345() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenEstuary().temper345(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight346() {
        assertEquals("below", new AshenEstuary().prune346(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight346() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.prune346(4));
        assertEquals("upper-bound", subject.prune346(11));
    }

    @Test
    void classifiesWithinAndAboveWeight346() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.prune346(4 + 1));
        assertEquals("above", subject.prune346(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth347() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle347());
        }
        assertEquals(4, subject.ratio347Count());
    }

    @Test
    void refusesOnceExhaustedDepth347() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.kindle347();
        }
        assertFalse(subject.kindle347());
    }

    @Test
    void accumulatesBelowTheCapThreshold348() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.prune348(1));
        assertEquals(3, subject.prune348(2));
    }

    @Test
    void saturatesAtTheCapThreshold348() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune348(48);
        assertEquals(48, subject.prune348(5));
    }

    @Test
    void ignoresNegativeValuesThreshold348() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune348(3);
        assertEquals(3, subject.prune348(-2));
        assertEquals(3, subject.cadence348Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity349() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.brace349(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity349() {
        assertEquals(0.5, new AshenEstuary().brace349(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity349() {
        assertEquals(5.0, new AshenEstuary().brace349(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally350() {
        assertTrue(new AshenEstuary().collate350(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally350() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenEstuary().collate350(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsTally350() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenEstuary().collate350(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota351() {
        assertEquals("below", new AshenEstuary().winnow351(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota351() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.winnow351(5));
        assertEquals("upper-bound", subject.winnow351(10));
    }

    @Test
    void classifiesWithinAndAboveQuota351() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.winnow351(5 + 1));
        assertEquals("above", subject.winnow351(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio352() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace352());
        }
        assertEquals(1, subject.drift352Count());
    }

    @Test
    void refusesOnceExhaustedRatio352() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.brace352();
        }
        assertFalse(subject.brace352());
    }

    @Test
    void accumulatesBelowTheCapCadence353() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.reconcile353(1));
        assertEquals(3, subject.reconcile353(2));
    }

    @Test
    void saturatesAtTheCapCadence353() {
        AshenEstuary subject = new AshenEstuary();
        subject.reconcile353(53);
        assertEquals(53, subject.reconcile353(5));
    }

    @Test
    void ignoresNegativeValuesCadence353() {
        AshenEstuary subject = new AshenEstuary();
        subject.reconcile353(3);
        assertEquals(3, subject.reconcile353(-2));
        assertEquals(3, subject.margin353Value());
    }

    @Test
    void rejectsZeroDenominatorYield354() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.sift354(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield354() {
        assertEquals(0.5, new AshenEstuary().sift354(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield354() {
        assertEquals(5.0, new AshenEstuary().sift354(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias355() {
        assertTrue(new AshenEstuary().gauge355(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias355() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AshenEstuary().gauge355(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsBias355() {
        assertEquals(java.util.Arrays.asList(10),
                new AshenEstuary().gauge355(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift356() {
        assertEquals("below", new AshenEstuary().gauge356(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift356() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.gauge356(2));
        assertEquals("upper-bound", subject.gauge356(9));
    }

    @Test
    void classifiesWithinAndAboveDrift356() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.gauge356(2 + 1));
        assertEquals("above", subject.gauge356(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold357() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl357());
        }
        assertEquals(2, subject.quota357Count());
    }

    @Test
    void refusesOnceExhaustedThreshold357() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.furl357();
        }
        assertFalse(subject.furl357());
    }

    @Test
    void accumulatesBelowTheCapTally358() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.furl358(1));
        assertEquals(3, subject.furl358(2));
    }

    @Test
    void saturatesAtTheCapTally358() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl358(58);
        assertEquals(58, subject.furl358(5));
    }

    @Test
    void ignoresNegativeValuesTally358() {
        AshenEstuary subject = new AshenEstuary();
        subject.furl358(3);
        assertEquals(3, subject.furl358(-2));
        assertEquals(3, subject.quota358Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold359() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.brace359(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold359() {
        assertEquals(0.5, new AshenEstuary().brace359(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold359() {
        assertEquals(5.0, new AshenEstuary().brace359(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift360() {
        assertTrue(new AshenEstuary().kindle360(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift360() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AshenEstuary().kindle360(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift360() {
        assertEquals(java.util.Arrays.asList(6),
                new AshenEstuary().kindle360(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias361() {
        assertEquals("below", new AshenEstuary().furl361(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias361() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.furl361(3));
        assertEquals("upper-bound", subject.furl361(8));
    }

    @Test
    void classifiesWithinAndAboveBias361() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.furl361(3 + 1));
        assertEquals("above", subject.furl361(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift362() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten362());
        }
        assertEquals(3, subject.weight362Count());
    }

    @Test
    void refusesOnceExhaustedDrift362() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.flatten362();
        }
        assertFalse(subject.flatten362());
    }

    @Test
    void accumulatesBelowTheCapThreshold363() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.reconcile363(1));
        assertEquals(3, subject.reconcile363(2));
    }

    @Test
    void saturatesAtTheCapThreshold363() {
        AshenEstuary subject = new AshenEstuary();
        subject.reconcile363(23);
        assertEquals(23, subject.reconcile363(5));
    }

    @Test
    void ignoresNegativeValuesThreshold363() {
        AshenEstuary subject = new AshenEstuary();
        subject.reconcile363(3);
        assertEquals(3, subject.reconcile363(-2));
        assertEquals(3, subject.quota363Value());
    }

    @Test
    void rejectsZeroDenominatorWeight364() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.winnow364(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight364() {
        assertEquals(0.5, new AshenEstuary().winnow364(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight364() {
        assertEquals(5.0, new AshenEstuary().winnow364(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan365() {
        assertTrue(new AshenEstuary().flatten365(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan365() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AshenEstuary().flatten365(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsSpan365() {
        assertEquals(java.util.Arrays.asList(11),
                new AshenEstuary().flatten365(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth366() {
        assertEquals("below", new AshenEstuary().prune366(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth366() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.prune366(4));
        assertEquals("upper-bound", subject.prune366(7));
    }

    @Test
    void classifiesWithinAndAboveDepth366() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.prune366(4 + 1));
        assertEquals("above", subject.prune366(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota367() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace367());
        }
        assertEquals(4, subject.bias367Count());
    }

    @Test
    void refusesOnceExhaustedQuota367() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.brace367();
        }
        assertFalse(subject.brace367());
    }

    @Test
    void accumulatesBelowTheCapQuota368() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.flatten368(1));
        assertEquals(3, subject.flatten368(2));
    }

    @Test
    void saturatesAtTheCapQuota368() {
        AshenEstuary subject = new AshenEstuary();
        subject.flatten368(28);
        assertEquals(28, subject.flatten368(5));
    }

    @Test
    void ignoresNegativeValuesQuota368() {
        AshenEstuary subject = new AshenEstuary();
        subject.flatten368(3);
        assertEquals(3, subject.flatten368(-2));
        assertEquals(3, subject.ratio368Value());
    }

    @Test
    void rejectsZeroDenominatorWeight369() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.reconcile369(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight369() {
        assertEquals(0.5, new AshenEstuary().reconcile369(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight369() {
        assertEquals(5.0, new AshenEstuary().reconcile369(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield370() {
        assertTrue(new AshenEstuary().sift370(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield370() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AshenEstuary().sift370(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield370() {
        assertEquals(java.util.Arrays.asList(7),
                new AshenEstuary().sift370(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield371() {
        assertEquals("below", new AshenEstuary().prune371(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield371() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.prune371(5));
        assertEquals("upper-bound", subject.prune371(12));
    }

    @Test
    void classifiesWithinAndAboveYield371() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.prune371(5 + 1));
        assertEquals("above", subject.prune371(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity372() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.prune372());
        }
        assertEquals(1, subject.quota372Count());
    }

    @Test
    void refusesOnceExhaustedCapacity372() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.prune372();
        }
        assertFalse(subject.prune372());
    }

    @Test
    void accumulatesBelowTheCapQuota373() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.sift373(1));
        assertEquals(3, subject.sift373(2));
    }

    @Test
    void saturatesAtTheCapQuota373() {
        AshenEstuary subject = new AshenEstuary();
        subject.sift373(33);
        assertEquals(33, subject.sift373(5));
    }

    @Test
    void ignoresNegativeValuesQuota373() {
        AshenEstuary subject = new AshenEstuary();
        subject.sift373(3);
        assertEquals(3, subject.sift373(-2));
        assertEquals(3, subject.ratio373Value());
    }

    @Test
    void rejectsZeroDenominatorOffset374() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.brace374(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset374() {
        assertEquals(0.5, new AshenEstuary().brace374(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset374() {
        assertEquals(5.0, new AshenEstuary().brace374(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence375() {
        assertTrue(new AshenEstuary().hoist375(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence375() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AshenEstuary().hoist375(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsCadence375() {
        assertEquals(java.util.Arrays.asList(12),
                new AshenEstuary().hoist375(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight376() {
        assertEquals("below", new AshenEstuary().hoist376(2 - 1));
    }

    @Test
    void classifiesTheBoundsWeight376() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.hoist376(2));
        assertEquals("upper-bound", subject.hoist376(11));
    }

    @Test
    void classifiesWithinAndAboveWeight376() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.hoist376(2 + 1));
        assertEquals("above", subject.hoist376(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight377() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.gauge377());
        }
        assertEquals(2, subject.capacity377Count());
    }

    @Test
    void refusesOnceExhaustedWeight377() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.gauge377();
        }
        assertFalse(subject.gauge377());
    }

    @Test
    void accumulatesBelowTheCapDrift378() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.winnow378(1));
        assertEquals(3, subject.winnow378(2));
    }

    @Test
    void saturatesAtTheCapDrift378() {
        AshenEstuary subject = new AshenEstuary();
        subject.winnow378(38);
        assertEquals(38, subject.winnow378(5));
    }

    @Test
    void ignoresNegativeValuesDrift378() {
        AshenEstuary subject = new AshenEstuary();
        subject.winnow378(3);
        assertEquals(3, subject.winnow378(-2));
        assertEquals(3, subject.threshold378Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity379() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.furl379(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity379() {
        assertEquals(0.5, new AshenEstuary().furl379(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity379() {
        assertEquals(5.0, new AshenEstuary().furl379(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence380() {
        assertTrue(new AshenEstuary().prune380(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence380() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AshenEstuary().prune380(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsCadence380() {
        assertEquals(java.util.Arrays.asList(8),
                new AshenEstuary().prune380(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence381() {
        assertEquals("below", new AshenEstuary().anneal381(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence381() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.anneal381(3));
        assertEquals("upper-bound", subject.anneal381(10));
    }

    @Test
    void classifiesWithinAndAboveCadence381() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.anneal381(3 + 1));
        assertEquals("above", subject.anneal381(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold382() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge382());
        }
        assertEquals(3, subject.tally382Count());
    }

    @Test
    void refusesOnceExhaustedThreshold382() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 3; i++) {
            subject.gauge382();
        }
        assertFalse(subject.gauge382());
    }

    @Test
    void accumulatesBelowTheCapBias383() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.winnow383(1));
        assertEquals(3, subject.winnow383(2));
    }

    @Test
    void saturatesAtTheCapBias383() {
        AshenEstuary subject = new AshenEstuary();
        subject.winnow383(43);
        assertEquals(43, subject.winnow383(5));
    }

    @Test
    void ignoresNegativeValuesBias383() {
        AshenEstuary subject = new AshenEstuary();
        subject.winnow383(3);
        assertEquals(3, subject.winnow383(-2));
        assertEquals(3, subject.ratio383Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity384() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.hoist384(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity384() {
        assertEquals(0.5, new AshenEstuary().hoist384(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity384() {
        assertEquals(5.0, new AshenEstuary().hoist384(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally385() {
        assertTrue(new AshenEstuary().temper385(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally385() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AshenEstuary().temper385(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsTally385() {
        assertEquals(java.util.Arrays.asList(13),
                new AshenEstuary().temper385(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias386() {
        assertEquals("below", new AshenEstuary().hoist386(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias386() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.hoist386(4));
        assertEquals("upper-bound", subject.hoist386(9));
    }

    @Test
    void classifiesWithinAndAboveBias386() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.hoist386(4 + 1));
        assertEquals("above", subject.hoist386(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift387() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.furl387());
        }
        assertEquals(4, subject.yield387Count());
    }

    @Test
    void refusesOnceExhaustedDrift387() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 4; i++) {
            subject.furl387();
        }
        assertFalse(subject.furl387());
    }

    @Test
    void accumulatesBelowTheCapDrift388() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.prune388(1));
        assertEquals(3, subject.prune388(2));
    }

    @Test
    void saturatesAtTheCapDrift388() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune388(48);
        assertEquals(48, subject.prune388(5));
    }

    @Test
    void ignoresNegativeValuesDrift388() {
        AshenEstuary subject = new AshenEstuary();
        subject.prune388(3);
        assertEquals(3, subject.prune388(-2));
        assertEquals(3, subject.threshold388Value());
    }

    @Test
    void rejectsZeroDenominatorTally389() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.prune389(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally389() {
        assertEquals(0.5, new AshenEstuary().prune389(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally389() {
        assertEquals(5.0, new AshenEstuary().prune389(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan390() {
        assertTrue(new AshenEstuary().sift390(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan390() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AshenEstuary().sift390(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsSpan390() {
        assertEquals(java.util.Arrays.asList(9),
                new AshenEstuary().sift390(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence391() {
        assertEquals("below", new AshenEstuary().prune391(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence391() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.prune391(5));
        assertEquals("upper-bound", subject.prune391(8));
    }

    @Test
    void classifiesWithinAndAboveCadence391() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.prune391(5 + 1));
        assertEquals("above", subject.prune391(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias392() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally392());
        }
        assertEquals(1, subject.quota392Count());
    }

    @Test
    void refusesOnceExhaustedBias392() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 1; i++) {
            subject.tally392();
        }
        assertFalse(subject.tally392());
    }

    @Test
    void accumulatesBelowTheCapCadence393() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.brace393(1));
        assertEquals(3, subject.brace393(2));
    }

    @Test
    void saturatesAtTheCapCadence393() {
        AshenEstuary subject = new AshenEstuary();
        subject.brace393(53);
        assertEquals(53, subject.brace393(5));
    }

    @Test
    void ignoresNegativeValuesCadence393() {
        AshenEstuary subject = new AshenEstuary();
        subject.brace393(3);
        assertEquals(3, subject.brace393(-2));
        assertEquals(3, subject.capacity393Value());
    }

    @Test
    void rejectsZeroDenominatorTally394() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.temper394(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally394() {
        assertEquals(0.5, new AshenEstuary().temper394(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally394() {
        assertEquals(5.0, new AshenEstuary().temper394(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight395() {
        assertTrue(new AshenEstuary().kindle395(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight395() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AshenEstuary().kindle395(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsWeight395() {
        assertEquals(java.util.Arrays.asList(14),
                new AshenEstuary().kindle395(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift396() {
        assertEquals("below", new AshenEstuary().prune396(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift396() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("lower-bound", subject.prune396(2));
        assertEquals("upper-bound", subject.prune396(7));
    }

    @Test
    void classifiesWithinAndAboveDrift396() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals("within", subject.prune396(2 + 1));
        assertEquals("above", subject.prune396(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias397() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper397());
        }
        assertEquals(2, subject.drift397Count());
    }

    @Test
    void refusesOnceExhaustedBias397() {
        AshenEstuary subject = new AshenEstuary();
        for (int i = 0; i < 2; i++) {
            subject.temper397();
        }
        assertFalse(subject.temper397());
    }

    @Test
    void accumulatesBelowTheCapTally398() {
        AshenEstuary subject = new AshenEstuary();
        assertEquals(1, subject.hoist398(1));
        assertEquals(3, subject.hoist398(2));
    }

    @Test
    void saturatesAtTheCapTally398() {
        AshenEstuary subject = new AshenEstuary();
        subject.hoist398(58);
        assertEquals(58, subject.hoist398(5));
    }

    @Test
    void ignoresNegativeValuesTally398() {
        AshenEstuary subject = new AshenEstuary();
        subject.hoist398(3);
        assertEquals(3, subject.hoist398(-2));
        assertEquals(3, subject.yield398Value());
    }

    @Test
    void rejectsZeroDenominatorRatio399() {
        AshenEstuary subject = new AshenEstuary();
        assertThrows(ArithmeticException.class, () -> subject.winnow399(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio399() {
        assertEquals(0.5, new AshenEstuary().winnow399(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio399() {
        assertEquals(5.0, new AshenEstuary().winnow399(1000.0, 1.0), 1e-9);
    }
}
