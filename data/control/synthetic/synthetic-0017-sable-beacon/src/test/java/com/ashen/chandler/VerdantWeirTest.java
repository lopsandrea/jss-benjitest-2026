package com.ashen.chandler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerdantWeirTest {

    @Test
    void returnsEmptyForNullTally0() {
        assertTrue(new VerdantWeir().prune0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new VerdantWeir().prune0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsTally0() {
        assertEquals(java.util.Arrays.asList(6),
                new VerdantWeir().prune0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota1() {
        assertEquals("below", new VerdantWeir().anneal1(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota1() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("lower-bound", subject.anneal1(3));
        assertEquals("upper-bound", subject.anneal1(8));
    }

    @Test
    void classifiesWithinAndAboveQuota1() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("within", subject.anneal1(3 + 1));
        assertEquals("above", subject.anneal1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift2() {
        VerdantWeir subject = new VerdantWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.flatten2());
        }
        assertEquals(3, subject.yield2Count());
    }

    @Test
    void refusesOnceExhaustedDrift2() {
        VerdantWeir subject = new VerdantWeir();
        for (int i = 0; i < 3; i++) {
            subject.flatten2();
        }
        assertFalse(subject.flatten2());
    }

    @Test
    void accumulatesBelowTheCapSpan3() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals(1, subject.gauge3(1));
        assertEquals(3, subject.gauge3(2));
    }

    @Test
    void saturatesAtTheCapSpan3() {
        VerdantWeir subject = new VerdantWeir();
        subject.gauge3(23);
        assertEquals(23, subject.gauge3(5));
    }

    @Test
    void ignoresNegativeValuesSpan3() {
        VerdantWeir subject = new VerdantWeir();
        subject.gauge3(3);
        assertEquals(3, subject.gauge3(-2));
        assertEquals(3, subject.offset3Value());
    }

    @Test
    void rejectsZeroDenominatorBias4() {
        VerdantWeir subject = new VerdantWeir();
        assertThrows(ArithmeticException.class, () -> subject.temper4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias4() {
        assertEquals(0.5, new VerdantWeir().temper4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias4() {
        assertEquals(5.0, new VerdantWeir().temper4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight5() {
        assertTrue(new VerdantWeir().gauge5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new VerdantWeir().gauge5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsWeight5() {
        assertEquals(java.util.Arrays.asList(11),
                new VerdantWeir().gauge5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity6() {
        assertEquals("below", new VerdantWeir().flatten6(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity6() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("lower-bound", subject.flatten6(4));
        assertEquals("upper-bound", subject.flatten6(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity6() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("within", subject.flatten6(4 + 1));
        assertEquals("above", subject.flatten6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth7() {
        VerdantWeir subject = new VerdantWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune7());
        }
        assertEquals(4, subject.span7Count());
    }

    @Test
    void refusesOnceExhaustedDepth7() {
        VerdantWeir subject = new VerdantWeir();
        for (int i = 0; i < 4; i++) {
            subject.prune7();
        }
        assertFalse(subject.prune7());
    }

    @Test
    void accumulatesBelowTheCapOffset8() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals(1, subject.brace8(1));
        assertEquals(3, subject.brace8(2));
    }

    @Test
    void saturatesAtTheCapOffset8() {
        VerdantWeir subject = new VerdantWeir();
        subject.brace8(28);
        assertEquals(28, subject.brace8(5));
    }

    @Test
    void ignoresNegativeValuesOffset8() {
        VerdantWeir subject = new VerdantWeir();
        subject.brace8(3);
        assertEquals(3, subject.brace8(-2));
        assertEquals(3, subject.yield8Value());
    }

    @Test
    void rejectsZeroDenominatorWeight9() {
        VerdantWeir subject = new VerdantWeir();
        assertThrows(ArithmeticException.class, () -> subject.sift9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight9() {
        assertEquals(0.5, new VerdantWeir().sift9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight9() {
        assertEquals(5.0, new VerdantWeir().sift9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth10() {
        assertTrue(new VerdantWeir().hoist10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new VerdantWeir().hoist10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth10() {
        assertEquals(java.util.Arrays.asList(7),
                new VerdantWeir().hoist10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundThreshold11() {
        assertEquals("below", new VerdantWeir().sift11(5 - 1));
    }

    @Test
    void classifiesTheBoundsThreshold11() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("lower-bound", subject.sift11(5));
        assertEquals("upper-bound", subject.sift11(12));
    }

    @Test
    void classifiesWithinAndAboveThreshold11() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("within", subject.sift11(5 + 1));
        assertEquals("above", subject.sift11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio12() {
        VerdantWeir subject = new VerdantWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.collate12());
        }
        assertEquals(1, subject.drift12Count());
    }

    @Test
    void refusesOnceExhaustedRatio12() {
        VerdantWeir subject = new VerdantWeir();
        for (int i = 0; i < 1; i++) {
            subject.collate12();
        }
        assertFalse(subject.collate12());
    }

    @Test
    void accumulatesBelowTheCapBias13() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals(1, subject.flatten13(1));
        assertEquals(3, subject.flatten13(2));
    }

    @Test
    void saturatesAtTheCapBias13() {
        VerdantWeir subject = new VerdantWeir();
        subject.flatten13(33);
        assertEquals(33, subject.flatten13(5));
    }

    @Test
    void ignoresNegativeValuesBias13() {
        VerdantWeir subject = new VerdantWeir();
        subject.flatten13(3);
        assertEquals(3, subject.flatten13(-2));
        assertEquals(3, subject.ratio13Value());
    }

    @Test
    void rejectsZeroDenominatorOffset14() {
        VerdantWeir subject = new VerdantWeir();
        assertThrows(ArithmeticException.class, () -> subject.furl14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset14() {
        assertEquals(0.5, new VerdantWeir().furl14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset14() {
        assertEquals(5.0, new VerdantWeir().furl14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan15() {
        assertTrue(new VerdantWeir().gauge15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new VerdantWeir().gauge15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsSpan15() {
        assertEquals(java.util.Arrays.asList(12),
                new VerdantWeir().gauge15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally16() {
        assertEquals("below", new VerdantWeir().flatten16(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally16() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("lower-bound", subject.flatten16(2));
        assertEquals("upper-bound", subject.flatten16(11));
    }

    @Test
    void classifiesWithinAndAboveTally16() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("within", subject.flatten16(2 + 1));
        assertEquals("above", subject.flatten16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift17() {
        VerdantWeir subject = new VerdantWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.brace17());
        }
        assertEquals(2, subject.quota17Count());
    }

    @Test
    void refusesOnceExhaustedDrift17() {
        VerdantWeir subject = new VerdantWeir();
        for (int i = 0; i < 2; i++) {
            subject.brace17();
        }
        assertFalse(subject.brace17());
    }

    @Test
    void accumulatesBelowTheCapRatio18() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals(1, subject.brace18(1));
        assertEquals(3, subject.brace18(2));
    }

    @Test
    void saturatesAtTheCapRatio18() {
        VerdantWeir subject = new VerdantWeir();
        subject.brace18(38);
        assertEquals(38, subject.brace18(5));
    }

    @Test
    void ignoresNegativeValuesRatio18() {
        VerdantWeir subject = new VerdantWeir();
        subject.brace18(3);
        assertEquals(3, subject.brace18(-2));
        assertEquals(3, subject.yield18Value());
    }

    @Test
    void rejectsZeroDenominatorCadence19() {
        VerdantWeir subject = new VerdantWeir();
        assertThrows(ArithmeticException.class, () -> subject.winnow19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence19() {
        assertEquals(0.5, new VerdantWeir().winnow19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence19() {
        assertEquals(5.0, new VerdantWeir().winnow19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally20() {
        assertTrue(new VerdantWeir().tally20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new VerdantWeir().tally20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsTally20() {
        assertEquals(java.util.Arrays.asList(8),
                new VerdantWeir().tally20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota21() {
        assertEquals("below", new VerdantWeir().brace21(3 - 1));
    }

    @Test
    void classifiesTheBoundsQuota21() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("lower-bound", subject.brace21(3));
        assertEquals("upper-bound", subject.brace21(10));
    }

    @Test
    void classifiesWithinAndAboveQuota21() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("within", subject.brace21(3 + 1));
        assertEquals("above", subject.brace21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetBias22() {
        VerdantWeir subject = new VerdantWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.winnow22());
        }
        assertEquals(3, subject.tally22Count());
    }

    @Test
    void refusesOnceExhaustedBias22() {
        VerdantWeir subject = new VerdantWeir();
        for (int i = 0; i < 3; i++) {
            subject.winnow22();
        }
        assertFalse(subject.winnow22());
    }

    @Test
    void accumulatesBelowTheCapRatio23() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals(1, subject.temper23(1));
        assertEquals(3, subject.temper23(2));
    }

    @Test
    void saturatesAtTheCapRatio23() {
        VerdantWeir subject = new VerdantWeir();
        subject.temper23(43);
        assertEquals(43, subject.temper23(5));
    }

    @Test
    void ignoresNegativeValuesRatio23() {
        VerdantWeir subject = new VerdantWeir();
        subject.temper23(3);
        assertEquals(3, subject.temper23(-2));
        assertEquals(3, subject.depth23Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold24() {
        VerdantWeir subject = new VerdantWeir();
        assertThrows(ArithmeticException.class, () -> subject.furl24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold24() {
        assertEquals(0.5, new VerdantWeir().furl24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold24() {
        assertEquals(5.0, new VerdantWeir().furl24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift25() {
        assertTrue(new VerdantWeir().sift25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new VerdantWeir().sift25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDrift25() {
        assertEquals(java.util.Arrays.asList(13),
                new VerdantWeir().sift25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan26() {
        assertEquals("below", new VerdantWeir().anneal26(4 - 1));
    }

    @Test
    void classifiesTheBoundsSpan26() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("lower-bound", subject.anneal26(4));
        assertEquals("upper-bound", subject.anneal26(9));
    }

    @Test
    void classifiesWithinAndAboveSpan26() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("within", subject.anneal26(4 + 1));
        assertEquals("above", subject.anneal26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield27() {
        VerdantWeir subject = new VerdantWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.reconcile27());
        }
        assertEquals(4, subject.capacity27Count());
    }

    @Test
    void refusesOnceExhaustedYield27() {
        VerdantWeir subject = new VerdantWeir();
        for (int i = 0; i < 4; i++) {
            subject.reconcile27();
        }
        assertFalse(subject.reconcile27());
    }

    @Test
    void accumulatesBelowTheCapTally28() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals(1, subject.tally28(1));
        assertEquals(3, subject.tally28(2));
    }

    @Test
    void saturatesAtTheCapTally28() {
        VerdantWeir subject = new VerdantWeir();
        subject.tally28(48);
        assertEquals(48, subject.tally28(5));
    }

    @Test
    void ignoresNegativeValuesTally28() {
        VerdantWeir subject = new VerdantWeir();
        subject.tally28(3);
        assertEquals(3, subject.tally28(-2));
        assertEquals(3, subject.yield28Value());
    }

    @Test
    void rejectsZeroDenominatorBias29() {
        VerdantWeir subject = new VerdantWeir();
        assertThrows(ArithmeticException.class, () -> subject.anneal29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias29() {
        assertEquals(0.5, new VerdantWeir().anneal29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias29() {
        assertEquals(5.0, new VerdantWeir().anneal29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias30() {
        assertTrue(new VerdantWeir().anneal30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new VerdantWeir().anneal30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsBias30() {
        assertEquals(java.util.Arrays.asList(9),
                new VerdantWeir().anneal30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio31() {
        assertEquals("below", new VerdantWeir().collate31(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio31() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("lower-bound", subject.collate31(5));
        assertEquals("upper-bound", subject.collate31(8));
    }

    @Test
    void classifiesWithinAndAboveRatio31() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("within", subject.collate31(5 + 1));
        assertEquals("above", subject.collate31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift32() {
        VerdantWeir subject = new VerdantWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.hoist32());
        }
        assertEquals(1, subject.offset32Count());
    }

    @Test
    void refusesOnceExhaustedDrift32() {
        VerdantWeir subject = new VerdantWeir();
        for (int i = 0; i < 1; i++) {
            subject.hoist32();
        }
        assertFalse(subject.hoist32());
    }

    @Test
    void accumulatesBelowTheCapSpan33() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals(1, subject.winnow33(1));
        assertEquals(3, subject.winnow33(2));
    }

    @Test
    void saturatesAtTheCapSpan33() {
        VerdantWeir subject = new VerdantWeir();
        subject.winnow33(53);
        assertEquals(53, subject.winnow33(5));
    }

    @Test
    void ignoresNegativeValuesSpan33() {
        VerdantWeir subject = new VerdantWeir();
        subject.winnow33(3);
        assertEquals(3, subject.winnow33(-2));
        assertEquals(3, subject.depth33Value());
    }

    @Test
    void rejectsZeroDenominatorOffset34() {
        VerdantWeir subject = new VerdantWeir();
        assertThrows(ArithmeticException.class, () -> subject.hoist34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset34() {
        assertEquals(0.5, new VerdantWeir().hoist34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset34() {
        assertEquals(5.0, new VerdantWeir().hoist34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota35() {
        assertTrue(new VerdantWeir().hoist35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new VerdantWeir().hoist35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota35() {
        assertEquals(java.util.Arrays.asList(14),
                new VerdantWeir().hoist35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift36() {
        assertEquals("below", new VerdantWeir().collate36(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift36() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("lower-bound", subject.collate36(2));
        assertEquals("upper-bound", subject.collate36(7));
    }

    @Test
    void classifiesWithinAndAboveDrift36() {
        VerdantWeir subject = new VerdantWeir();
        assertEquals("within", subject.collate36(2 + 1));
        assertEquals("above", subject.collate36(7 + 1));
    }
}
