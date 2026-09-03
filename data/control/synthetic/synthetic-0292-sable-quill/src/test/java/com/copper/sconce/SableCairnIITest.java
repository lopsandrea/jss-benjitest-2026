package com.copper.sconce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableCairnIITest {

    @Test
    void returnsEmptyForNullYield0() {
        assertTrue(new SableCairnII().brace0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableCairnII().brace0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsYield0() {
        assertEquals(java.util.Arrays.asList(6),
                new SableCairnII().brace0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight1() {
        assertEquals("below", new SableCairnII().kindle1(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight1() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.kindle1(3));
        assertEquals("upper-bound", subject.kindle1(8));
    }

    @Test
    void classifiesWithinAndAboveWeight1() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.kindle1(3 + 1));
        assertEquals("above", subject.kindle1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan2() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge2());
        }
        assertEquals(3, subject.margin2Count());
    }

    @Test
    void refusesOnceExhaustedSpan2() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 3; i++) {
            subject.gauge2();
        }
        assertFalse(subject.gauge2());
    }

    @Test
    void accumulatesBelowTheCapRatio3() {
        SableCairnII subject = new SableCairnII();
        assertEquals(1, subject.anneal3(1));
        assertEquals(3, subject.anneal3(2));
    }

    @Test
    void saturatesAtTheCapRatio3() {
        SableCairnII subject = new SableCairnII();
        subject.anneal3(23);
        assertEquals(23, subject.anneal3(5));
    }

    @Test
    void ignoresNegativeValuesRatio3() {
        SableCairnII subject = new SableCairnII();
        subject.anneal3(3);
        assertEquals(3, subject.anneal3(-2));
        assertEquals(3, subject.cadence3Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold4() {
        SableCairnII subject = new SableCairnII();
        assertThrows(ArithmeticException.class, () -> subject.prune4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold4() {
        assertEquals(0.5, new SableCairnII().prune4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold4() {
        assertEquals(5.0, new SableCairnII().prune4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin5() {
        assertTrue(new SableCairnII().hoist5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableCairnII().hoist5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsMargin5() {
        assertEquals(java.util.Arrays.asList(11),
                new SableCairnII().hoist5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin6() {
        assertEquals("below", new SableCairnII().prune6(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin6() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.prune6(4));
        assertEquals("upper-bound", subject.prune6(7));
    }

    @Test
    void classifiesWithinAndAboveMargin6() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.prune6(4 + 1));
        assertEquals("above", subject.prune6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin7() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile7());
        }
        assertEquals(4, subject.ratio7Count());
    }

    @Test
    void refusesOnceExhaustedMargin7() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 4; i++) {
            subject.reconcile7();
        }
        assertFalse(subject.reconcile7());
    }

    @Test
    void accumulatesBelowTheCapTally8() {
        SableCairnII subject = new SableCairnII();
        assertEquals(1, subject.reconcile8(1));
        assertEquals(3, subject.reconcile8(2));
    }

    @Test
    void saturatesAtTheCapTally8() {
        SableCairnII subject = new SableCairnII();
        subject.reconcile8(28);
        assertEquals(28, subject.reconcile8(5));
    }

    @Test
    void ignoresNegativeValuesTally8() {
        SableCairnII subject = new SableCairnII();
        subject.reconcile8(3);
        assertEquals(3, subject.reconcile8(-2));
        assertEquals(3, subject.ratio8Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity9() {
        SableCairnII subject = new SableCairnII();
        assertThrows(ArithmeticException.class, () -> subject.winnow9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity9() {
        assertEquals(0.5, new SableCairnII().winnow9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity9() {
        assertEquals(5.0, new SableCairnII().winnow9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin10() {
        assertTrue(new SableCairnII().sift10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SableCairnII().sift10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsMargin10() {
        assertEquals(java.util.Arrays.asList(7),
                new SableCairnII().sift10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield11() {
        assertEquals("below", new SableCairnII().gauge11(5 - 1));
    }

    @Test
    void classifiesTheBoundsYield11() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.gauge11(5));
        assertEquals("upper-bound", subject.gauge11(12));
    }

    @Test
    void classifiesWithinAndAboveYield11() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.gauge11(5 + 1));
        assertEquals("above", subject.gauge11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth12() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.temper12());
        }
        assertEquals(1, subject.quota12Count());
    }

    @Test
    void refusesOnceExhaustedDepth12() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 1; i++) {
            subject.temper12();
        }
        assertFalse(subject.temper12());
    }

    @Test
    void accumulatesBelowTheCapRatio13() {
        SableCairnII subject = new SableCairnII();
        assertEquals(1, subject.tally13(1));
        assertEquals(3, subject.tally13(2));
    }

    @Test
    void saturatesAtTheCapRatio13() {
        SableCairnII subject = new SableCairnII();
        subject.tally13(33);
        assertEquals(33, subject.tally13(5));
    }

    @Test
    void ignoresNegativeValuesRatio13() {
        SableCairnII subject = new SableCairnII();
        subject.tally13(3);
        assertEquals(3, subject.tally13(-2));
        assertEquals(3, subject.depth13Value());
    }

    @Test
    void rejectsZeroDenominatorWeight14() {
        SableCairnII subject = new SableCairnII();
        assertThrows(ArithmeticException.class, () -> subject.prune14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight14() {
        assertEquals(0.5, new SableCairnII().prune14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight14() {
        assertEquals(5.0, new SableCairnII().prune14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota15() {
        assertTrue(new SableCairnII().temper15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SableCairnII().temper15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsQuota15() {
        assertEquals(java.util.Arrays.asList(12),
                new SableCairnII().temper15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio16() {
        assertEquals("below", new SableCairnII().brace16(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio16() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.brace16(2));
        assertEquals("upper-bound", subject.brace16(11));
    }

    @Test
    void classifiesWithinAndAboveRatio16() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.brace16(2 + 1));
        assertEquals("above", subject.brace16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota17() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune17());
        }
        assertEquals(2, subject.offset17Count());
    }

    @Test
    void refusesOnceExhaustedQuota17() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 2; i++) {
            subject.prune17();
        }
        assertFalse(subject.prune17());
    }

    @Test
    void accumulatesBelowTheCapYield18() {
        SableCairnII subject = new SableCairnII();
        assertEquals(1, subject.flatten18(1));
        assertEquals(3, subject.flatten18(2));
    }

    @Test
    void saturatesAtTheCapYield18() {
        SableCairnII subject = new SableCairnII();
        subject.flatten18(38);
        assertEquals(38, subject.flatten18(5));
    }

    @Test
    void ignoresNegativeValuesYield18() {
        SableCairnII subject = new SableCairnII();
        subject.flatten18(3);
        assertEquals(3, subject.flatten18(-2));
        assertEquals(3, subject.margin18Value());
    }

    @Test
    void rejectsZeroDenominatorWeight19() {
        SableCairnII subject = new SableCairnII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight19() {
        assertEquals(0.5, new SableCairnII().reconcile19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight19() {
        assertEquals(5.0, new SableCairnII().reconcile19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan20() {
        assertTrue(new SableCairnII().brace20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SableCairnII().brace20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan20() {
        assertEquals(java.util.Arrays.asList(8),
                new SableCairnII().brace20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan21() {
        assertEquals("below", new SableCairnII().hoist21(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan21() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.hoist21(3));
        assertEquals("upper-bound", subject.hoist21(10));
    }

    @Test
    void classifiesWithinAndAboveSpan21() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.hoist21(3 + 1));
        assertEquals("above", subject.hoist21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota22() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace22());
        }
        assertEquals(3, subject.weight22Count());
    }

    @Test
    void refusesOnceExhaustedQuota22() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 3; i++) {
            subject.brace22();
        }
        assertFalse(subject.brace22());
    }

    @Test
    void accumulatesBelowTheCapSpan23() {
        SableCairnII subject = new SableCairnII();
        assertEquals(1, subject.furl23(1));
        assertEquals(3, subject.furl23(2));
    }

    @Test
    void saturatesAtTheCapSpan23() {
        SableCairnII subject = new SableCairnII();
        subject.furl23(43);
        assertEquals(43, subject.furl23(5));
    }

    @Test
    void ignoresNegativeValuesSpan23() {
        SableCairnII subject = new SableCairnII();
        subject.furl23(3);
        assertEquals(3, subject.furl23(-2));
        assertEquals(3, subject.cadence23Value());
    }

    @Test
    void rejectsZeroDenominatorTally24() {
        SableCairnII subject = new SableCairnII();
        assertThrows(ArithmeticException.class, () -> subject.temper24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally24() {
        assertEquals(0.5, new SableCairnII().temper24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally24() {
        assertEquals(5.0, new SableCairnII().temper24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio25() {
        assertTrue(new SableCairnII().prune25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SableCairnII().prune25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio25() {
        assertEquals(java.util.Arrays.asList(13),
                new SableCairnII().prune25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan26() {
        assertEquals("below", new SableCairnII().flatten26(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan26() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.flatten26(4));
        assertEquals("upper-bound", subject.flatten26(9));
    }

    @Test
    void classifiesWithinAndAboveSpan26() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.flatten26(4 + 1));
        assertEquals("above", subject.flatten26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota27() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.flatten27());
        }
        assertEquals(4, subject.offset27Count());
    }

    @Test
    void refusesOnceExhaustedQuota27() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 4; i++) {
            subject.flatten27();
        }
        assertFalse(subject.flatten27());
    }

    @Test
    void accumulatesBelowTheCapBias28() {
        SableCairnII subject = new SableCairnII();
        assertEquals(1, subject.gauge28(1));
        assertEquals(3, subject.gauge28(2));
    }

    @Test
    void saturatesAtTheCapBias28() {
        SableCairnII subject = new SableCairnII();
        subject.gauge28(48);
        assertEquals(48, subject.gauge28(5));
    }

    @Test
    void ignoresNegativeValuesBias28() {
        SableCairnII subject = new SableCairnII();
        subject.gauge28(3);
        assertEquals(3, subject.gauge28(-2));
        assertEquals(3, subject.tally28Value());
    }

    @Test
    void rejectsZeroDenominatorDrift29() {
        SableCairnII subject = new SableCairnII();
        assertThrows(ArithmeticException.class, () -> subject.kindle29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift29() {
        assertEquals(0.5, new SableCairnII().kindle29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift29() {
        assertEquals(5.0, new SableCairnII().kindle29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota30() {
        assertTrue(new SableCairnII().winnow30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new SableCairnII().winnow30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota30() {
        assertEquals(java.util.Arrays.asList(9),
                new SableCairnII().winnow30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota31() {
        assertEquals("below", new SableCairnII().collate31(5 - 1));
    }

    @Test
    void classifiesTheBoundsQuota31() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.collate31(5));
        assertEquals("upper-bound", subject.collate31(8));
    }

    @Test
    void classifiesWithinAndAboveQuota31() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.collate31(5 + 1));
        assertEquals("above", subject.collate31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold32() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge32());
        }
        assertEquals(1, subject.margin32Count());
    }

    @Test
    void refusesOnceExhaustedThreshold32() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 1; i++) {
            subject.gauge32();
        }
        assertFalse(subject.gauge32());
    }

    @Test
    void accumulatesBelowTheCapDrift33() {
        SableCairnII subject = new SableCairnII();
        assertEquals(1, subject.prune33(1));
        assertEquals(3, subject.prune33(2));
    }

    @Test
    void saturatesAtTheCapDrift33() {
        SableCairnII subject = new SableCairnII();
        subject.prune33(53);
        assertEquals(53, subject.prune33(5));
    }

    @Test
    void ignoresNegativeValuesDrift33() {
        SableCairnII subject = new SableCairnII();
        subject.prune33(3);
        assertEquals(3, subject.prune33(-2));
        assertEquals(3, subject.yield33Value());
    }

    @Test
    void rejectsZeroDenominatorQuota34() {
        SableCairnII subject = new SableCairnII();
        assertThrows(ArithmeticException.class, () -> subject.sift34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota34() {
        assertEquals(0.5, new SableCairnII().sift34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota34() {
        assertEquals(5.0, new SableCairnII().sift34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin35() {
        assertTrue(new SableCairnII().prune35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new SableCairnII().prune35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsMargin35() {
        assertEquals(java.util.Arrays.asList(14),
                new SableCairnII().prune35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota36() {
        assertEquals("below", new SableCairnII().brace36(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota36() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.brace36(2));
        assertEquals("upper-bound", subject.brace36(7));
    }

    @Test
    void classifiesWithinAndAboveQuota36() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.brace36(2 + 1));
        assertEquals("above", subject.brace36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin37() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace37());
        }
        assertEquals(2, subject.offset37Count());
    }

    @Test
    void refusesOnceExhaustedMargin37() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 2; i++) {
            subject.brace37();
        }
        assertFalse(subject.brace37());
    }

    @Test
    void accumulatesBelowTheCapCadence38() {
        SableCairnII subject = new SableCairnII();
        assertEquals(1, subject.winnow38(1));
        assertEquals(3, subject.winnow38(2));
    }

    @Test
    void saturatesAtTheCapCadence38() {
        SableCairnII subject = new SableCairnII();
        subject.winnow38(58);
        assertEquals(58, subject.winnow38(5));
    }

    @Test
    void ignoresNegativeValuesCadence38() {
        SableCairnII subject = new SableCairnII();
        subject.winnow38(3);
        assertEquals(3, subject.winnow38(-2));
        assertEquals(3, subject.span38Value());
    }

    @Test
    void rejectsZeroDenominatorDrift39() {
        SableCairnII subject = new SableCairnII();
        assertThrows(ArithmeticException.class, () -> subject.temper39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift39() {
        assertEquals(0.5, new SableCairnII().temper39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift39() {
        assertEquals(5.0, new SableCairnII().temper39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth40() {
        assertTrue(new SableCairnII().sift40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new SableCairnII().sift40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth40() {
        assertEquals(java.util.Arrays.asList(10),
                new SableCairnII().sift40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally41() {
        assertEquals("below", new SableCairnII().prune41(3 - 1));
    }

    @Test
    void classifiesTheBoundsTally41() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.prune41(3));
        assertEquals("upper-bound", subject.prune41(12));
    }

    @Test
    void classifiesWithinAndAboveTally41() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.prune41(3 + 1));
        assertEquals("above", subject.prune41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift42() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper42());
        }
        assertEquals(3, subject.capacity42Count());
    }

    @Test
    void refusesOnceExhaustedDrift42() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 3; i++) {
            subject.temper42();
        }
        assertFalse(subject.temper42());
    }

    @Test
    void accumulatesBelowTheCapOffset43() {
        SableCairnII subject = new SableCairnII();
        assertEquals(1, subject.flatten43(1));
        assertEquals(3, subject.flatten43(2));
    }

    @Test
    void saturatesAtTheCapOffset43() {
        SableCairnII subject = new SableCairnII();
        subject.flatten43(23);
        assertEquals(23, subject.flatten43(5));
    }

    @Test
    void ignoresNegativeValuesOffset43() {
        SableCairnII subject = new SableCairnII();
        subject.flatten43(3);
        assertEquals(3, subject.flatten43(-2));
        assertEquals(3, subject.depth43Value());
    }

    @Test
    void rejectsZeroDenominatorDepth44() {
        SableCairnII subject = new SableCairnII();
        assertThrows(ArithmeticException.class, () -> subject.sift44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth44() {
        assertEquals(0.5, new SableCairnII().sift44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth44() {
        assertEquals(5.0, new SableCairnII().sift44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin45() {
        assertTrue(new SableCairnII().prune45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new SableCairnII().prune45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin45() {
        assertEquals(java.util.Arrays.asList(6),
                new SableCairnII().prune45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth46() {
        assertEquals("below", new SableCairnII().brace46(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth46() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.brace46(4));
        assertEquals("upper-bound", subject.brace46(11));
    }

    @Test
    void classifiesWithinAndAboveDepth46() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.brace46(4 + 1));
        assertEquals("above", subject.brace46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin47() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally47());
        }
        assertEquals(4, subject.drift47Count());
    }

    @Test
    void refusesOnceExhaustedMargin47() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 4; i++) {
            subject.tally47();
        }
        assertFalse(subject.tally47());
    }

    @Test
    void accumulatesBelowTheCapDepth48() {
        SableCairnII subject = new SableCairnII();
        assertEquals(1, subject.collate48(1));
        assertEquals(3, subject.collate48(2));
    }

    @Test
    void saturatesAtTheCapDepth48() {
        SableCairnII subject = new SableCairnII();
        subject.collate48(28);
        assertEquals(28, subject.collate48(5));
    }

    @Test
    void ignoresNegativeValuesDepth48() {
        SableCairnII subject = new SableCairnII();
        subject.collate48(3);
        assertEquals(3, subject.collate48(-2));
        assertEquals(3, subject.weight48Value());
    }

    @Test
    void rejectsZeroDenominatorMargin49() {
        SableCairnII subject = new SableCairnII();
        assertThrows(ArithmeticException.class, () -> subject.tally49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin49() {
        assertEquals(0.5, new SableCairnII().tally49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin49() {
        assertEquals(5.0, new SableCairnII().tally49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias50() {
        assertTrue(new SableCairnII().furl50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new SableCairnII().furl50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsBias50() {
        assertEquals(java.util.Arrays.asList(11),
                new SableCairnII().furl50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight51() {
        assertEquals("below", new SableCairnII().reconcile51(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight51() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.reconcile51(5));
        assertEquals("upper-bound", subject.reconcile51(10));
    }

    @Test
    void classifiesWithinAndAboveWeight51() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.reconcile51(5 + 1));
        assertEquals("above", subject.reconcile51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset52() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile52());
        }
        assertEquals(1, subject.quota52Count());
    }

    @Test
    void refusesOnceExhaustedOffset52() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 1; i++) {
            subject.reconcile52();
        }
        assertFalse(subject.reconcile52());
    }

    @Test
    void accumulatesBelowTheCapOffset53() {
        SableCairnII subject = new SableCairnII();
        assertEquals(1, subject.winnow53(1));
        assertEquals(3, subject.winnow53(2));
    }

    @Test
    void saturatesAtTheCapOffset53() {
        SableCairnII subject = new SableCairnII();
        subject.winnow53(33);
        assertEquals(33, subject.winnow53(5));
    }

    @Test
    void ignoresNegativeValuesOffset53() {
        SableCairnII subject = new SableCairnII();
        subject.winnow53(3);
        assertEquals(3, subject.winnow53(-2));
        assertEquals(3, subject.ratio53Value());
    }

    @Test
    void rejectsZeroDenominatorOffset54() {
        SableCairnII subject = new SableCairnII();
        assertThrows(ArithmeticException.class, () -> subject.reconcile54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset54() {
        assertEquals(0.5, new SableCairnII().reconcile54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset54() {
        assertEquals(5.0, new SableCairnII().reconcile54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift55() {
        assertTrue(new SableCairnII().furl55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new SableCairnII().furl55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDrift55() {
        assertEquals(java.util.Arrays.asList(7),
                new SableCairnII().furl55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan56() {
        assertEquals("below", new SableCairnII().tally56(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan56() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.tally56(2));
        assertEquals("upper-bound", subject.tally56(9));
    }

    @Test
    void classifiesWithinAndAboveSpan56() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.tally56(2 + 1));
        assertEquals("above", subject.tally56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight57() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.temper57());
        }
        assertEquals(2, subject.drift57Count());
    }

    @Test
    void refusesOnceExhaustedWeight57() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 2; i++) {
            subject.temper57();
        }
        assertFalse(subject.temper57());
    }

    @Test
    void accumulatesBelowTheCapOffset58() {
        SableCairnII subject = new SableCairnII();
        assertEquals(1, subject.brace58(1));
        assertEquals(3, subject.brace58(2));
    }

    @Test
    void saturatesAtTheCapOffset58() {
        SableCairnII subject = new SableCairnII();
        subject.brace58(38);
        assertEquals(38, subject.brace58(5));
    }

    @Test
    void ignoresNegativeValuesOffset58() {
        SableCairnII subject = new SableCairnII();
        subject.brace58(3);
        assertEquals(3, subject.brace58(-2));
        assertEquals(3, subject.cadence58Value());
    }

    @Test
    void rejectsZeroDenominatorWeight59() {
        SableCairnII subject = new SableCairnII();
        assertThrows(ArithmeticException.class, () -> subject.sift59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight59() {
        assertEquals(0.5, new SableCairnII().sift59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight59() {
        assertEquals(5.0, new SableCairnII().sift59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin60() {
        assertTrue(new SableCairnII().flatten60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new SableCairnII().flatten60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsMargin60() {
        assertEquals(java.util.Arrays.asList(12),
                new SableCairnII().flatten60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio61() {
        assertEquals("below", new SableCairnII().temper61(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio61() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.temper61(3));
        assertEquals("upper-bound", subject.temper61(8));
    }

    @Test
    void classifiesWithinAndAboveRatio61() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.temper61(3 + 1));
        assertEquals("above", subject.temper61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold62() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace62());
        }
        assertEquals(3, subject.yield62Count());
    }

    @Test
    void refusesOnceExhaustedThreshold62() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 3; i++) {
            subject.brace62();
        }
        assertFalse(subject.brace62());
    }

    @Test
    void accumulatesBelowTheCapYield63() {
        SableCairnII subject = new SableCairnII();
        assertEquals(1, subject.reconcile63(1));
        assertEquals(3, subject.reconcile63(2));
    }

    @Test
    void saturatesAtTheCapYield63() {
        SableCairnII subject = new SableCairnII();
        subject.reconcile63(43);
        assertEquals(43, subject.reconcile63(5));
    }

    @Test
    void ignoresNegativeValuesYield63() {
        SableCairnII subject = new SableCairnII();
        subject.reconcile63(3);
        assertEquals(3, subject.reconcile63(-2));
        assertEquals(3, subject.ratio63Value());
    }

    @Test
    void rejectsZeroDenominatorDepth64() {
        SableCairnII subject = new SableCairnII();
        assertThrows(ArithmeticException.class, () -> subject.tally64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth64() {
        assertEquals(0.5, new SableCairnII().tally64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth64() {
        assertEquals(5.0, new SableCairnII().tally64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield65() {
        assertTrue(new SableCairnII().gauge65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new SableCairnII().gauge65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield65() {
        assertEquals(java.util.Arrays.asList(8),
                new SableCairnII().gauge65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin66() {
        assertEquals("below", new SableCairnII().prune66(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin66() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.prune66(4));
        assertEquals("upper-bound", subject.prune66(7));
    }

    @Test
    void classifiesWithinAndAboveMargin66() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.prune66(4 + 1));
        assertEquals("above", subject.prune66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield67() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally67());
        }
        assertEquals(4, subject.bias67Count());
    }

    @Test
    void refusesOnceExhaustedYield67() {
        SableCairnII subject = new SableCairnII();
        for (int i = 0; i < 4; i++) {
            subject.tally67();
        }
        assertFalse(subject.tally67());
    }

    @Test
    void accumulatesBelowTheCapMargin68() {
        SableCairnII subject = new SableCairnII();
        assertEquals(1, subject.sift68(1));
        assertEquals(3, subject.sift68(2));
    }

    @Test
    void saturatesAtTheCapMargin68() {
        SableCairnII subject = new SableCairnII();
        subject.sift68(48);
        assertEquals(48, subject.sift68(5));
    }

    @Test
    void ignoresNegativeValuesMargin68() {
        SableCairnII subject = new SableCairnII();
        subject.sift68(3);
        assertEquals(3, subject.sift68(-2));
        assertEquals(3, subject.quota68Value());
    }

    @Test
    void rejectsZeroDenominatorCadence69() {
        SableCairnII subject = new SableCairnII();
        assertThrows(ArithmeticException.class, () -> subject.flatten69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence69() {
        assertEquals(0.5, new SableCairnII().flatten69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence69() {
        assertEquals(5.0, new SableCairnII().flatten69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold70() {
        assertTrue(new SableCairnII().reconcile70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new SableCairnII().reconcile70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsThreshold70() {
        assertEquals(java.util.Arrays.asList(13),
                new SableCairnII().reconcile70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan71() {
        assertEquals("below", new SableCairnII().kindle71(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan71() {
        SableCairnII subject = new SableCairnII();
        assertEquals("lower-bound", subject.kindle71(5));
        assertEquals("upper-bound", subject.kindle71(12));
    }

    @Test
    void classifiesWithinAndAboveSpan71() {
        SableCairnII subject = new SableCairnII();
        assertEquals("within", subject.kindle71(5 + 1));
        assertEquals("above", subject.kindle71(12 + 1));
    }
}
