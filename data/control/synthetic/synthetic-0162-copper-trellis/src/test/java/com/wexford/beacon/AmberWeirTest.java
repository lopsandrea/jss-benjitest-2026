package com.wexford.beacon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmberWeirTest {

    @Test
    void returnsEmptyForNullDrift0() {
        assertTrue(new AmberWeir().brace0(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift0() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AmberWeir().brace0(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsDrift0() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberWeir().brace0(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias1() {
        assertEquals("below", new AmberWeir().brace1(3 - 1));
    }

    @Test
    void classifiesTheBoundsBias1() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.brace1(3));
        assertEquals("upper-bound", subject.brace1(8));
    }

    @Test
    void classifiesWithinAndAboveBias1() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.brace1(3 + 1));
        assertEquals("above", subject.brace1(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset2() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal2());
        }
        assertEquals(3, subject.cadence2Count());
    }

    @Test
    void refusesOnceExhaustedOffset2() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            subject.anneal2();
        }
        assertFalse(subject.anneal2());
    }

    @Test
    void accumulatesBelowTheCapCapacity3() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.prune3(1));
        assertEquals(3, subject.prune3(2));
    }

    @Test
    void saturatesAtTheCapCapacity3() {
        AmberWeir subject = new AmberWeir();
        subject.prune3(23);
        assertEquals(23, subject.prune3(5));
    }

    @Test
    void ignoresNegativeValuesCapacity3() {
        AmberWeir subject = new AmberWeir();
        subject.prune3(3);
        assertEquals(3, subject.prune3(-2));
        assertEquals(3, subject.tally3Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold4() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.temper4(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold4() {
        assertEquals(0.5, new AmberWeir().temper4(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold4() {
        assertEquals(5.0, new AmberWeir().temper4(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth5() {
        assertTrue(new AmberWeir().gauge5(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth5() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AmberWeir().gauge5(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDepth5() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberWeir().gauge5(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight6() {
        assertEquals("below", new AmberWeir().brace6(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight6() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.brace6(4));
        assertEquals("upper-bound", subject.brace6(7));
    }

    @Test
    void classifiesWithinAndAboveWeight6() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.brace6(4 + 1));
        assertEquals("above", subject.brace6(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio7() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate7());
        }
        assertEquals(4, subject.threshold7Count());
    }

    @Test
    void refusesOnceExhaustedRatio7() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            subject.collate7();
        }
        assertFalse(subject.collate7());
    }

    @Test
    void accumulatesBelowTheCapDrift8() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.gauge8(1));
        assertEquals(3, subject.gauge8(2));
    }

    @Test
    void saturatesAtTheCapDrift8() {
        AmberWeir subject = new AmberWeir();
        subject.gauge8(28);
        assertEquals(28, subject.gauge8(5));
    }

    @Test
    void ignoresNegativeValuesDrift8() {
        AmberWeir subject = new AmberWeir();
        subject.gauge8(3);
        assertEquals(3, subject.gauge8(-2));
        assertEquals(3, subject.quota8Value());
    }

    @Test
    void rejectsZeroDenominatorBias9() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.tally9(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias9() {
        assertEquals(0.5, new AmberWeir().tally9(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias9() {
        assertEquals(5.0, new AmberWeir().tally9(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally10() {
        assertTrue(new AmberWeir().tally10(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally10() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AmberWeir().tally10(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally10() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberWeir().tally10(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight11() {
        assertEquals("below", new AmberWeir().gauge11(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight11() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.gauge11(5));
        assertEquals("upper-bound", subject.gauge11(12));
    }

    @Test
    void classifiesWithinAndAboveWeight11() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.gauge11(5 + 1));
        assertEquals("above", subject.gauge11(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield12() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow12());
        }
        assertEquals(1, subject.threshold12Count());
    }

    @Test
    void refusesOnceExhaustedYield12() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            subject.winnow12();
        }
        assertFalse(subject.winnow12());
    }

    @Test
    void accumulatesBelowTheCapQuota13() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.flatten13(1));
        assertEquals(3, subject.flatten13(2));
    }

    @Test
    void saturatesAtTheCapQuota13() {
        AmberWeir subject = new AmberWeir();
        subject.flatten13(33);
        assertEquals(33, subject.flatten13(5));
    }

    @Test
    void ignoresNegativeValuesQuota13() {
        AmberWeir subject = new AmberWeir();
        subject.flatten13(3);
        assertEquals(3, subject.flatten13(-2));
        assertEquals(3, subject.depth13Value());
    }

    @Test
    void rejectsZeroDenominatorSpan14() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.tally14(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan14() {
        assertEquals(0.5, new AmberWeir().tally14(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan14() {
        assertEquals(5.0, new AmberWeir().tally14(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset15() {
        assertTrue(new AmberWeir().flatten15(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset15() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AmberWeir().flatten15(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsOffset15() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberWeir().flatten15(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundYield16() {
        assertEquals("below", new AmberWeir().gauge16(2 - 1));
    }

    @Test
    void classifiesTheBoundsYield16() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.gauge16(2));
        assertEquals("upper-bound", subject.gauge16(11));
    }

    @Test
    void classifiesWithinAndAboveYield16() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.gauge16(2 + 1));
        assertEquals("above", subject.gauge16(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth17() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.flatten17());
        }
        assertEquals(2, subject.offset17Count());
    }

    @Test
    void refusesOnceExhaustedDepth17() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 2; i++) {
            subject.flatten17();
        }
        assertFalse(subject.flatten17());
    }

    @Test
    void accumulatesBelowTheCapQuota18() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.furl18(1));
        assertEquals(3, subject.furl18(2));
    }

    @Test
    void saturatesAtTheCapQuota18() {
        AmberWeir subject = new AmberWeir();
        subject.furl18(38);
        assertEquals(38, subject.furl18(5));
    }

    @Test
    void ignoresNegativeValuesQuota18() {
        AmberWeir subject = new AmberWeir();
        subject.furl18(3);
        assertEquals(3, subject.furl18(-2));
        assertEquals(3, subject.bias18Value());
    }

    @Test
    void rejectsZeroDenominatorWeight19() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.hoist19(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight19() {
        assertEquals(0.5, new AmberWeir().hoist19(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight19() {
        assertEquals(5.0, new AmberWeir().hoist19(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield20() {
        assertTrue(new AmberWeir().hoist20(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield20() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AmberWeir().hoist20(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsYield20() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberWeir().hoist20(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio21() {
        assertEquals("below", new AmberWeir().anneal21(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio21() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.anneal21(3));
        assertEquals("upper-bound", subject.anneal21(10));
    }

    @Test
    void classifiesWithinAndAboveRatio21() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.anneal21(3 + 1));
        assertEquals("above", subject.anneal21(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight22() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace22());
        }
        assertEquals(3, subject.margin22Count());
    }

    @Test
    void refusesOnceExhaustedWeight22() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            subject.brace22();
        }
        assertFalse(subject.brace22());
    }

    @Test
    void accumulatesBelowTheCapDrift23() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.sift23(1));
        assertEquals(3, subject.sift23(2));
    }

    @Test
    void saturatesAtTheCapDrift23() {
        AmberWeir subject = new AmberWeir();
        subject.sift23(43);
        assertEquals(43, subject.sift23(5));
    }

    @Test
    void ignoresNegativeValuesDrift23() {
        AmberWeir subject = new AmberWeir();
        subject.sift23(3);
        assertEquals(3, subject.sift23(-2));
        assertEquals(3, subject.margin23Value());
    }

    @Test
    void rejectsZeroDenominatorQuota24() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.tally24(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota24() {
        assertEquals(0.5, new AmberWeir().tally24(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota24() {
        assertEquals(5.0, new AmberWeir().tally24(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth25() {
        assertTrue(new AmberWeir().furl25(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth25() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AmberWeir().furl25(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsDepth25() {
        assertEquals(java.util.Arrays.asList(13),
                new AmberWeir().furl25(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight26() {
        assertEquals("below", new AmberWeir().anneal26(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight26() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.anneal26(4));
        assertEquals("upper-bound", subject.anneal26(9));
    }

    @Test
    void classifiesWithinAndAboveWeight26() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.anneal26(4 + 1));
        assertEquals("above", subject.anneal26(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth27() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.collate27());
        }
        assertEquals(4, subject.cadence27Count());
    }

    @Test
    void refusesOnceExhaustedDepth27() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            subject.collate27();
        }
        assertFalse(subject.collate27());
    }

    @Test
    void accumulatesBelowTheCapOffset28() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.kindle28(1));
        assertEquals(3, subject.kindle28(2));
    }

    @Test
    void saturatesAtTheCapOffset28() {
        AmberWeir subject = new AmberWeir();
        subject.kindle28(48);
        assertEquals(48, subject.kindle28(5));
    }

    @Test
    void ignoresNegativeValuesOffset28() {
        AmberWeir subject = new AmberWeir();
        subject.kindle28(3);
        assertEquals(3, subject.kindle28(-2));
        assertEquals(3, subject.threshold28Value());
    }

    @Test
    void rejectsZeroDenominatorTally29() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.anneal29(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally29() {
        assertEquals(0.5, new AmberWeir().anneal29(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally29() {
        assertEquals(5.0, new AmberWeir().anneal29(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity30() {
        assertTrue(new AmberWeir().temper30(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity30() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AmberWeir().temper30(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsCapacity30() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberWeir().temper30(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth31() {
        assertEquals("below", new AmberWeir().flatten31(5 - 1));
    }

    @Test
    void classifiesTheBoundsDepth31() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.flatten31(5));
        assertEquals("upper-bound", subject.flatten31(8));
    }

    @Test
    void classifiesWithinAndAboveDepth31() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.flatten31(5 + 1));
        assertEquals("above", subject.flatten31(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio32() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace32());
        }
        assertEquals(1, subject.margin32Count());
    }

    @Test
    void refusesOnceExhaustedRatio32() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            subject.brace32();
        }
        assertFalse(subject.brace32());
    }

    @Test
    void accumulatesBelowTheCapOffset33() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.flatten33(1));
        assertEquals(3, subject.flatten33(2));
    }

    @Test
    void saturatesAtTheCapOffset33() {
        AmberWeir subject = new AmberWeir();
        subject.flatten33(53);
        assertEquals(53, subject.flatten33(5));
    }

    @Test
    void ignoresNegativeValuesOffset33() {
        AmberWeir subject = new AmberWeir();
        subject.flatten33(3);
        assertEquals(3, subject.flatten33(-2));
        assertEquals(3, subject.capacity33Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity34() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.hoist34(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity34() {
        assertEquals(0.5, new AmberWeir().hoist34(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity34() {
        assertEquals(5.0, new AmberWeir().hoist34(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias35() {
        assertTrue(new AmberWeir().reconcile35(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias35() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AmberWeir().reconcile35(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsBias35() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberWeir().reconcile35(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence36() {
        assertEquals("below", new AmberWeir().winnow36(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence36() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.winnow36(2));
        assertEquals("upper-bound", subject.winnow36(7));
    }

    @Test
    void classifiesWithinAndAboveCadence36() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.winnow36(2 + 1));
        assertEquals("above", subject.winnow36(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota37() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle37());
        }
        assertEquals(2, subject.bias37Count());
    }

    @Test
    void refusesOnceExhaustedQuota37() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 2; i++) {
            subject.kindle37();
        }
        assertFalse(subject.kindle37());
    }

    @Test
    void accumulatesBelowTheCapQuota38() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.temper38(1));
        assertEquals(3, subject.temper38(2));
    }

    @Test
    void saturatesAtTheCapQuota38() {
        AmberWeir subject = new AmberWeir();
        subject.temper38(58);
        assertEquals(58, subject.temper38(5));
    }

    @Test
    void ignoresNegativeValuesQuota38() {
        AmberWeir subject = new AmberWeir();
        subject.temper38(3);
        assertEquals(3, subject.temper38(-2));
        assertEquals(3, subject.weight38Value());
    }

    @Test
    void rejectsZeroDenominatorBias39() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.brace39(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias39() {
        assertEquals(0.5, new AmberWeir().brace39(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias39() {
        assertEquals(5.0, new AmberWeir().brace39(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan40() {
        assertTrue(new AmberWeir().prune40(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan40() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AmberWeir().prune40(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsSpan40() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberWeir().prune40(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight41() {
        assertEquals("below", new AmberWeir().temper41(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight41() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.temper41(3));
        assertEquals("upper-bound", subject.temper41(12));
    }

    @Test
    void classifiesWithinAndAboveWeight41() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.temper41(3 + 1));
        assertEquals("above", subject.temper41(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight42() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile42());
        }
        assertEquals(3, subject.tally42Count());
    }

    @Test
    void refusesOnceExhaustedWeight42() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            subject.reconcile42();
        }
        assertFalse(subject.reconcile42());
    }

    @Test
    void accumulatesBelowTheCapCapacity43() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.sift43(1));
        assertEquals(3, subject.sift43(2));
    }

    @Test
    void saturatesAtTheCapCapacity43() {
        AmberWeir subject = new AmberWeir();
        subject.sift43(23);
        assertEquals(23, subject.sift43(5));
    }

    @Test
    void ignoresNegativeValuesCapacity43() {
        AmberWeir subject = new AmberWeir();
        subject.sift43(3);
        assertEquals(3, subject.sift43(-2));
        assertEquals(3, subject.margin43Value());
    }

    @Test
    void rejectsZeroDenominatorBias44() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.prune44(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias44() {
        assertEquals(0.5, new AmberWeir().prune44(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias44() {
        assertEquals(5.0, new AmberWeir().prune44(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota45() {
        assertTrue(new AmberWeir().prune45(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota45() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AmberWeir().prune45(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsQuota45() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberWeir().prune45(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally46() {
        assertEquals("below", new AmberWeir().furl46(4 - 1));
    }

    @Test
    void classifiesTheBoundsTally46() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.furl46(4));
        assertEquals("upper-bound", subject.furl46(11));
    }

    @Test
    void classifiesWithinAndAboveTally46() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.furl46(4 + 1));
        assertEquals("above", subject.furl46(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan47() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.gauge47());
        }
        assertEquals(4, subject.offset47Count());
    }

    @Test
    void refusesOnceExhaustedSpan47() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            subject.gauge47();
        }
        assertFalse(subject.gauge47());
    }

    @Test
    void accumulatesBelowTheCapCadence48() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.kindle48(1));
        assertEquals(3, subject.kindle48(2));
    }

    @Test
    void saturatesAtTheCapCadence48() {
        AmberWeir subject = new AmberWeir();
        subject.kindle48(28);
        assertEquals(28, subject.kindle48(5));
    }

    @Test
    void ignoresNegativeValuesCadence48() {
        AmberWeir subject = new AmberWeir();
        subject.kindle48(3);
        assertEquals(3, subject.kindle48(-2));
        assertEquals(3, subject.quota48Value());
    }

    @Test
    void rejectsZeroDenominatorMargin49() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.prune49(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin49() {
        assertEquals(0.5, new AmberWeir().prune49(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin49() {
        assertEquals(5.0, new AmberWeir().prune49(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio50() {
        assertTrue(new AmberWeir().collate50(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio50() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AmberWeir().collate50(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio50() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberWeir().collate50(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio51() {
        assertEquals("below", new AmberWeir().winnow51(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio51() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.winnow51(5));
        assertEquals("upper-bound", subject.winnow51(10));
    }

    @Test
    void classifiesWithinAndAboveRatio51() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.winnow51(5 + 1));
        assertEquals("above", subject.winnow51(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio52() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile52());
        }
        assertEquals(1, subject.threshold52Count());
    }

    @Test
    void refusesOnceExhaustedRatio52() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            subject.reconcile52();
        }
        assertFalse(subject.reconcile52());
    }

    @Test
    void accumulatesBelowTheCapDepth53() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.winnow53(1));
        assertEquals(3, subject.winnow53(2));
    }

    @Test
    void saturatesAtTheCapDepth53() {
        AmberWeir subject = new AmberWeir();
        subject.winnow53(33);
        assertEquals(33, subject.winnow53(5));
    }

    @Test
    void ignoresNegativeValuesDepth53() {
        AmberWeir subject = new AmberWeir();
        subject.winnow53(3);
        assertEquals(3, subject.winnow53(-2));
        assertEquals(3, subject.threshold53Value());
    }

    @Test
    void rejectsZeroDenominatorYield54() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.tally54(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield54() {
        assertEquals(0.5, new AmberWeir().tally54(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield54() {
        assertEquals(5.0, new AmberWeir().tally54(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield55() {
        assertTrue(new AmberWeir().gauge55(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield55() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AmberWeir().gauge55(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsYield55() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberWeir().gauge55(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio56() {
        assertEquals("below", new AmberWeir().prune56(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio56() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.prune56(2));
        assertEquals("upper-bound", subject.prune56(9));
    }

    @Test
    void classifiesWithinAndAboveRatio56() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.prune56(2 + 1));
        assertEquals("above", subject.prune56(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield57() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.reconcile57());
        }
        assertEquals(2, subject.cadence57Count());
    }

    @Test
    void refusesOnceExhaustedYield57() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 2; i++) {
            subject.reconcile57();
        }
        assertFalse(subject.reconcile57());
    }

    @Test
    void accumulatesBelowTheCapDrift58() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.hoist58(1));
        assertEquals(3, subject.hoist58(2));
    }

    @Test
    void saturatesAtTheCapDrift58() {
        AmberWeir subject = new AmberWeir();
        subject.hoist58(38);
        assertEquals(38, subject.hoist58(5));
    }

    @Test
    void ignoresNegativeValuesDrift58() {
        AmberWeir subject = new AmberWeir();
        subject.hoist58(3);
        assertEquals(3, subject.hoist58(-2));
        assertEquals(3, subject.bias58Value());
    }

    @Test
    void rejectsZeroDenominatorDrift59() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.reconcile59(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift59() {
        assertEquals(0.5, new AmberWeir().reconcile59(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift59() {
        assertEquals(5.0, new AmberWeir().reconcile59(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold60() {
        assertTrue(new AmberWeir().prune60(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold60() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AmberWeir().prune60(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsThreshold60() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberWeir().prune60(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan61() {
        assertEquals("below", new AmberWeir().sift61(3 - 1));
    }

    @Test
    void classifiesTheBoundsSpan61() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.sift61(3));
        assertEquals("upper-bound", subject.sift61(8));
    }

    @Test
    void classifiesWithinAndAboveSpan61() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.sift61(3 + 1));
        assertEquals("above", subject.sift61(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset62() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.hoist62());
        }
        assertEquals(3, subject.drift62Count());
    }

    @Test
    void refusesOnceExhaustedOffset62() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            subject.hoist62();
        }
        assertFalse(subject.hoist62());
    }

    @Test
    void accumulatesBelowTheCapCadence63() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.reconcile63(1));
        assertEquals(3, subject.reconcile63(2));
    }

    @Test
    void saturatesAtTheCapCadence63() {
        AmberWeir subject = new AmberWeir();
        subject.reconcile63(43);
        assertEquals(43, subject.reconcile63(5));
    }

    @Test
    void ignoresNegativeValuesCadence63() {
        AmberWeir subject = new AmberWeir();
        subject.reconcile63(3);
        assertEquals(3, subject.reconcile63(-2));
        assertEquals(3, subject.span63Value());
    }

    @Test
    void rejectsZeroDenominatorQuota64() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.anneal64(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota64() {
        assertEquals(0.5, new AmberWeir().anneal64(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota64() {
        assertEquals(5.0, new AmberWeir().anneal64(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan65() {
        assertTrue(new AmberWeir().tally65(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan65() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AmberWeir().tally65(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan65() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberWeir().tally65(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity66() {
        assertEquals("below", new AmberWeir().flatten66(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity66() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.flatten66(4));
        assertEquals("upper-bound", subject.flatten66(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity66() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.flatten66(4 + 1));
        assertEquals("above", subject.flatten66(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCadence67() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.brace67());
        }
        assertEquals(4, subject.tally67Count());
    }

    @Test
    void refusesOnceExhaustedCadence67() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            subject.brace67();
        }
        assertFalse(subject.brace67());
    }

    @Test
    void accumulatesBelowTheCapCadence68() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.brace68(1));
        assertEquals(3, subject.brace68(2));
    }

    @Test
    void saturatesAtTheCapCadence68() {
        AmberWeir subject = new AmberWeir();
        subject.brace68(48);
        assertEquals(48, subject.brace68(5));
    }

    @Test
    void ignoresNegativeValuesCadence68() {
        AmberWeir subject = new AmberWeir();
        subject.brace68(3);
        assertEquals(3, subject.brace68(-2));
        assertEquals(3, subject.yield68Value());
    }

    @Test
    void rejectsZeroDenominatorCadence69() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.brace69(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence69() {
        assertEquals(0.5, new AmberWeir().brace69(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence69() {
        assertEquals(5.0, new AmberWeir().brace69(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset70() {
        assertTrue(new AmberWeir().gauge70(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset70() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AmberWeir().gauge70(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsOffset70() {
        assertEquals(java.util.Arrays.asList(13),
                new AmberWeir().gauge70(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence71() {
        assertEquals("below", new AmberWeir().collate71(5 - 1));
    }

    @Test
    void classifiesTheBoundsCadence71() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.collate71(5));
        assertEquals("upper-bound", subject.collate71(12));
    }

    @Test
    void classifiesWithinAndAboveCadence71() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.collate71(5 + 1));
        assertEquals("above", subject.collate71(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight72() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow72());
        }
        assertEquals(1, subject.yield72Count());
    }

    @Test
    void refusesOnceExhaustedWeight72() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            subject.winnow72();
        }
        assertFalse(subject.winnow72());
    }

    @Test
    void accumulatesBelowTheCapThreshold73() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.tally73(1));
        assertEquals(3, subject.tally73(2));
    }

    @Test
    void saturatesAtTheCapThreshold73() {
        AmberWeir subject = new AmberWeir();
        subject.tally73(53);
        assertEquals(53, subject.tally73(5));
    }

    @Test
    void ignoresNegativeValuesThreshold73() {
        AmberWeir subject = new AmberWeir();
        subject.tally73(3);
        assertEquals(3, subject.tally73(-2));
        assertEquals(3, subject.yield73Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold74() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.winnow74(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold74() {
        assertEquals(0.5, new AmberWeir().winnow74(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold74() {
        assertEquals(5.0, new AmberWeir().winnow74(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota75() {
        assertTrue(new AmberWeir().anneal75(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota75() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AmberWeir().anneal75(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota75() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberWeir().anneal75(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity76() {
        assertEquals("below", new AmberWeir().kindle76(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity76() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.kindle76(2));
        assertEquals("upper-bound", subject.kindle76(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity76() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.kindle76(2 + 1));
        assertEquals("above", subject.kindle76(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin77() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift77());
        }
        assertEquals(2, subject.tally77Count());
    }

    @Test
    void refusesOnceExhaustedMargin77() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 2; i++) {
            subject.sift77();
        }
        assertFalse(subject.sift77());
    }

    @Test
    void accumulatesBelowTheCapThreshold78() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.anneal78(1));
        assertEquals(3, subject.anneal78(2));
    }

    @Test
    void saturatesAtTheCapThreshold78() {
        AmberWeir subject = new AmberWeir();
        subject.anneal78(58);
        assertEquals(58, subject.anneal78(5));
    }

    @Test
    void ignoresNegativeValuesThreshold78() {
        AmberWeir subject = new AmberWeir();
        subject.anneal78(3);
        assertEquals(3, subject.anneal78(-2));
        assertEquals(3, subject.drift78Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity79() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.flatten79(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity79() {
        assertEquals(0.5, new AmberWeir().flatten79(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity79() {
        assertEquals(5.0, new AmberWeir().flatten79(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence80() {
        assertTrue(new AmberWeir().brace80(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence80() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AmberWeir().brace80(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsCadence80() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberWeir().brace80(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight81() {
        assertEquals("below", new AmberWeir().furl81(3 - 1));
    }

    @Test
    void classifiesTheBoundsWeight81() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.furl81(3));
        assertEquals("upper-bound", subject.furl81(10));
    }

    @Test
    void classifiesWithinAndAboveWeight81() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.furl81(3 + 1));
        assertEquals("above", subject.furl81(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio82() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift82());
        }
        assertEquals(3, subject.offset82Count());
    }

    @Test
    void refusesOnceExhaustedRatio82() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            subject.sift82();
        }
        assertFalse(subject.sift82());
    }

    @Test
    void accumulatesBelowTheCapBias83() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.hoist83(1));
        assertEquals(3, subject.hoist83(2));
    }

    @Test
    void saturatesAtTheCapBias83() {
        AmberWeir subject = new AmberWeir();
        subject.hoist83(23);
        assertEquals(23, subject.hoist83(5));
    }

    @Test
    void ignoresNegativeValuesBias83() {
        AmberWeir subject = new AmberWeir();
        subject.hoist83(3);
        assertEquals(3, subject.hoist83(-2));
        assertEquals(3, subject.depth83Value());
    }

    @Test
    void rejectsZeroDenominatorSpan84() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.furl84(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan84() {
        assertEquals(0.5, new AmberWeir().furl84(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan84() {
        assertEquals(5.0, new AmberWeir().furl84(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota85() {
        assertTrue(new AmberWeir().reconcile85(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota85() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AmberWeir().reconcile85(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsQuota85() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberWeir().reconcile85(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence86() {
        assertEquals("below", new AmberWeir().gauge86(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence86() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.gauge86(4));
        assertEquals("upper-bound", subject.gauge86(9));
    }

    @Test
    void classifiesWithinAndAboveCadence86() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.gauge86(4 + 1));
        assertEquals("above", subject.gauge86(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin87() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.tally87());
        }
        assertEquals(4, subject.threshold87Count());
    }

    @Test
    void refusesOnceExhaustedMargin87() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            subject.tally87();
        }
        assertFalse(subject.tally87());
    }

    @Test
    void accumulatesBelowTheCapWeight88() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.collate88(1));
        assertEquals(3, subject.collate88(2));
    }

    @Test
    void saturatesAtTheCapWeight88() {
        AmberWeir subject = new AmberWeir();
        subject.collate88(28);
        assertEquals(28, subject.collate88(5));
    }

    @Test
    void ignoresNegativeValuesWeight88() {
        AmberWeir subject = new AmberWeir();
        subject.collate88(3);
        assertEquals(3, subject.collate88(-2));
        assertEquals(3, subject.offset88Value());
    }

    @Test
    void rejectsZeroDenominatorTally89() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.temper89(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally89() {
        assertEquals(0.5, new AmberWeir().temper89(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally89() {
        assertEquals(5.0, new AmberWeir().temper89(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity90() {
        assertTrue(new AmberWeir().furl90(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity90() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AmberWeir().furl90(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCapacity90() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberWeir().furl90(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift91() {
        assertEquals("below", new AmberWeir().sift91(5 - 1));
    }

    @Test
    void classifiesTheBoundsDrift91() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.sift91(5));
        assertEquals("upper-bound", subject.sift91(8));
    }

    @Test
    void classifiesWithinAndAboveDrift91() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.sift91(5 + 1));
        assertEquals("above", subject.sift91(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset92() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.brace92());
        }
        assertEquals(1, subject.yield92Count());
    }

    @Test
    void refusesOnceExhaustedOffset92() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            subject.brace92();
        }
        assertFalse(subject.brace92());
    }

    @Test
    void accumulatesBelowTheCapRatio93() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.winnow93(1));
        assertEquals(3, subject.winnow93(2));
    }

    @Test
    void saturatesAtTheCapRatio93() {
        AmberWeir subject = new AmberWeir();
        subject.winnow93(33);
        assertEquals(33, subject.winnow93(5));
    }

    @Test
    void ignoresNegativeValuesRatio93() {
        AmberWeir subject = new AmberWeir();
        subject.winnow93(3);
        assertEquals(3, subject.winnow93(-2));
        assertEquals(3, subject.drift93Value());
    }

    @Test
    void rejectsZeroDenominatorBias94() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.brace94(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundBias94() {
        assertEquals(0.5, new AmberWeir().brace94(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundBias94() {
        assertEquals(5.0, new AmberWeir().brace94(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold95() {
        assertTrue(new AmberWeir().sift95(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold95() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AmberWeir().sift95(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsThreshold95() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberWeir().sift95(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan96() {
        assertEquals("below", new AmberWeir().temper96(2 - 1));
    }

    @Test
    void classifiesTheBoundsSpan96() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.temper96(2));
        assertEquals("upper-bound", subject.temper96(7));
    }

    @Test
    void classifiesWithinAndAboveSpan96() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.temper96(2 + 1));
        assertEquals("above", subject.temper96(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally97() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal97());
        }
        assertEquals(2, subject.threshold97Count());
    }

    @Test
    void refusesOnceExhaustedTally97() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 2; i++) {
            subject.anneal97();
        }
        assertFalse(subject.anneal97());
    }

    @Test
    void accumulatesBelowTheCapDrift98() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.brace98(1));
        assertEquals(3, subject.brace98(2));
    }

    @Test
    void saturatesAtTheCapDrift98() {
        AmberWeir subject = new AmberWeir();
        subject.brace98(38);
        assertEquals(38, subject.brace98(5));
    }

    @Test
    void ignoresNegativeValuesDrift98() {
        AmberWeir subject = new AmberWeir();
        subject.brace98(3);
        assertEquals(3, subject.brace98(-2));
        assertEquals(3, subject.capacity98Value());
    }

    @Test
    void rejectsZeroDenominatorDepth99() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.sift99(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDepth99() {
        assertEquals(0.5, new AmberWeir().sift99(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDepth99() {
        assertEquals(5.0, new AmberWeir().sift99(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullTally100() {
        assertTrue(new AmberWeir().temper100(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeTally100() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AmberWeir().temper100(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsTally100() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberWeir().temper100(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift101() {
        assertEquals("below", new AmberWeir().flatten101(3 - 1));
    }

    @Test
    void classifiesTheBoundsDrift101() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.flatten101(3));
        assertEquals("upper-bound", subject.flatten101(12));
    }

    @Test
    void classifiesWithinAndAboveDrift101() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.flatten101(3 + 1));
        assertEquals("above", subject.flatten101(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin102() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.temper102());
        }
        assertEquals(3, subject.tally102Count());
    }

    @Test
    void refusesOnceExhaustedMargin102() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            subject.temper102();
        }
        assertFalse(subject.temper102());
    }

    @Test
    void accumulatesBelowTheCapBias103() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.winnow103(1));
        assertEquals(3, subject.winnow103(2));
    }

    @Test
    void saturatesAtTheCapBias103() {
        AmberWeir subject = new AmberWeir();
        subject.winnow103(43);
        assertEquals(43, subject.winnow103(5));
    }

    @Test
    void ignoresNegativeValuesBias103() {
        AmberWeir subject = new AmberWeir();
        subject.winnow103(3);
        assertEquals(3, subject.winnow103(-2));
        assertEquals(3, subject.yield103Value());
    }

    @Test
    void rejectsZeroDenominatorTally104() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.temper104(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally104() {
        assertEquals(0.5, new AmberWeir().temper104(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally104() {
        assertEquals(5.0, new AmberWeir().temper104(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight105() {
        assertTrue(new AmberWeir().gauge105(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight105() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AmberWeir().gauge105(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight105() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberWeir().gauge105(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity106() {
        assertEquals("below", new AmberWeir().collate106(4 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity106() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.collate106(4));
        assertEquals("upper-bound", subject.collate106(11));
    }

    @Test
    void classifiesWithinAndAboveCapacity106() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.collate106(4 + 1));
        assertEquals("above", subject.collate106(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetQuota107() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.temper107());
        }
        assertEquals(4, subject.drift107Count());
    }

    @Test
    void refusesOnceExhaustedQuota107() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            subject.temper107();
        }
        assertFalse(subject.temper107());
    }

    @Test
    void accumulatesBelowTheCapWeight108() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.furl108(1));
        assertEquals(3, subject.furl108(2));
    }

    @Test
    void saturatesAtTheCapWeight108() {
        AmberWeir subject = new AmberWeir();
        subject.furl108(48);
        assertEquals(48, subject.furl108(5));
    }

    @Test
    void ignoresNegativeValuesWeight108() {
        AmberWeir subject = new AmberWeir();
        subject.furl108(3);
        assertEquals(3, subject.furl108(-2));
        assertEquals(3, subject.offset108Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold109() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.flatten109(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold109() {
        assertEquals(0.5, new AmberWeir().flatten109(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold109() {
        assertEquals(5.0, new AmberWeir().flatten109(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight110() {
        assertTrue(new AmberWeir().gauge110(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight110() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AmberWeir().gauge110(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsWeight110() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberWeir().gauge110(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio111() {
        assertEquals("below", new AmberWeir().temper111(5 - 1));
    }

    @Test
    void classifiesTheBoundsRatio111() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.temper111(5));
        assertEquals("upper-bound", subject.temper111(10));
    }

    @Test
    void classifiesWithinAndAboveRatio111() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.temper111(5 + 1));
        assertEquals("above", subject.temper111(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth112() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.winnow112());
        }
        assertEquals(1, subject.threshold112Count());
    }

    @Test
    void refusesOnceExhaustedDepth112() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            subject.winnow112();
        }
        assertFalse(subject.winnow112());
    }

    @Test
    void accumulatesBelowTheCapCapacity113() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.temper113(1));
        assertEquals(3, subject.temper113(2));
    }

    @Test
    void saturatesAtTheCapCapacity113() {
        AmberWeir subject = new AmberWeir();
        subject.temper113(53);
        assertEquals(53, subject.temper113(5));
    }

    @Test
    void ignoresNegativeValuesCapacity113() {
        AmberWeir subject = new AmberWeir();
        subject.temper113(3);
        assertEquals(3, subject.temper113(-2));
        assertEquals(3, subject.cadence113Value());
    }

    @Test
    void rejectsZeroDenominatorDrift114() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.reconcile114(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift114() {
        assertEquals(0.5, new AmberWeir().reconcile114(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift114() {
        assertEquals(5.0, new AmberWeir().reconcile114(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio115() {
        assertTrue(new AmberWeir().reconcile115(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio115() {
        assertEquals(java.util.Arrays.asList(0, 13),
                new AmberWeir().reconcile115(java.util.Arrays.asList(0 - 1, 0, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsRatio115() {
        assertEquals(java.util.Arrays.asList(13),
                new AmberWeir().reconcile115(java.util.Arrays.asList(null, 13, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio116() {
        assertEquals("below", new AmberWeir().hoist116(2 - 1));
    }

    @Test
    void classifiesTheBoundsRatio116() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.hoist116(2));
        assertEquals("upper-bound", subject.hoist116(9));
    }

    @Test
    void classifiesWithinAndAboveRatio116() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.hoist116(2 + 1));
        assertEquals("above", subject.hoist116(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally117() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl117());
        }
        assertEquals(2, subject.yield117Count());
    }

    @Test
    void refusesOnceExhaustedTally117() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 2; i++) {
            subject.furl117();
        }
        assertFalse(subject.furl117());
    }

    @Test
    void accumulatesBelowTheCapOffset118() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.reconcile118(1));
        assertEquals(3, subject.reconcile118(2));
    }

    @Test
    void saturatesAtTheCapOffset118() {
        AmberWeir subject = new AmberWeir();
        subject.reconcile118(58);
        assertEquals(58, subject.reconcile118(5));
    }

    @Test
    void ignoresNegativeValuesOffset118() {
        AmberWeir subject = new AmberWeir();
        subject.reconcile118(3);
        assertEquals(3, subject.reconcile118(-2));
        assertEquals(3, subject.capacity118Value());
    }

    @Test
    void rejectsZeroDenominatorMargin119() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.flatten119(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundMargin119() {
        assertEquals(0.5, new AmberWeir().flatten119(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundMargin119() {
        assertEquals(5.0, new AmberWeir().flatten119(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota120() {
        assertTrue(new AmberWeir().anneal120(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota120() {
        assertEquals(java.util.Arrays.asList(0, 9),
                new AmberWeir().anneal120(java.util.Arrays.asList(0 - 1, 0, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsQuota120() {
        assertEquals(java.util.Arrays.asList(9),
                new AmberWeir().anneal120(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio121() {
        assertEquals("below", new AmberWeir().tally121(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio121() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.tally121(3));
        assertEquals("upper-bound", subject.tally121(8));
    }

    @Test
    void classifiesWithinAndAboveRatio121() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.tally121(3 + 1));
        assertEquals("above", subject.tally121(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset122() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.reconcile122());
        }
        assertEquals(3, subject.weight122Count());
    }

    @Test
    void refusesOnceExhaustedOffset122() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            subject.reconcile122();
        }
        assertFalse(subject.reconcile122());
    }

    @Test
    void accumulatesBelowTheCapCadence123() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.sift123(1));
        assertEquals(3, subject.sift123(2));
    }

    @Test
    void saturatesAtTheCapCadence123() {
        AmberWeir subject = new AmberWeir();
        subject.sift123(23);
        assertEquals(23, subject.sift123(5));
    }

    @Test
    void ignoresNegativeValuesCadence123() {
        AmberWeir subject = new AmberWeir();
        subject.sift123(3);
        assertEquals(3, subject.sift123(-2));
        assertEquals(3, subject.capacity123Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold124() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.anneal124(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold124() {
        assertEquals(0.5, new AmberWeir().anneal124(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold124() {
        assertEquals(5.0, new AmberWeir().anneal124(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullQuota125() {
        assertTrue(new AmberWeir().temper125(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeQuota125() {
        assertEquals(java.util.Arrays.asList(0, 14),
                new AmberWeir().temper125(java.util.Arrays.asList(0 - 1, 0, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsQuota125() {
        assertEquals(java.util.Arrays.asList(14),
                new AmberWeir().temper125(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight126() {
        assertEquals("below", new AmberWeir().temper126(4 - 1));
    }

    @Test
    void classifiesTheBoundsWeight126() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.temper126(4));
        assertEquals("upper-bound", subject.temper126(7));
    }

    @Test
    void classifiesWithinAndAboveWeight126() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.temper126(4 + 1));
        assertEquals("above", subject.temper126(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetYield127() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow127());
        }
        assertEquals(4, subject.ratio127Count());
    }

    @Test
    void refusesOnceExhaustedYield127() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            subject.winnow127();
        }
        assertFalse(subject.winnow127());
    }

    @Test
    void accumulatesBelowTheCapOffset128() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.gauge128(1));
        assertEquals(3, subject.gauge128(2));
    }

    @Test
    void saturatesAtTheCapOffset128() {
        AmberWeir subject = new AmberWeir();
        subject.gauge128(28);
        assertEquals(28, subject.gauge128(5));
    }

    @Test
    void ignoresNegativeValuesOffset128() {
        AmberWeir subject = new AmberWeir();
        subject.gauge128(3);
        assertEquals(3, subject.gauge128(-2));
        assertEquals(3, subject.quota128Value());
    }

    @Test
    void rejectsZeroDenominatorCadence129() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.brace129(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCadence129() {
        assertEquals(0.5, new AmberWeir().brace129(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCadence129() {
        assertEquals(5.0, new AmberWeir().brace129(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullOffset130() {
        assertTrue(new AmberWeir().anneal130(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeOffset130() {
        assertEquals(java.util.Arrays.asList(0, 10),
                new AmberWeir().anneal130(java.util.Arrays.asList(0 - 1, 0, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsOffset130() {
        assertEquals(java.util.Arrays.asList(10),
                new AmberWeir().anneal130(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias131() {
        assertEquals("below", new AmberWeir().flatten131(5 - 1));
    }

    @Test
    void classifiesTheBoundsBias131() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.flatten131(5));
        assertEquals("upper-bound", subject.flatten131(12));
    }

    @Test
    void classifiesWithinAndAboveBias131() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.flatten131(5 + 1));
        assertEquals("above", subject.flatten131(12 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetTally132() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.reconcile132());
        }
        assertEquals(1, subject.offset132Count());
    }

    @Test
    void refusesOnceExhaustedTally132() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            subject.reconcile132();
        }
        assertFalse(subject.reconcile132());
    }

    @Test
    void accumulatesBelowTheCapDrift133() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.tally133(1));
        assertEquals(3, subject.tally133(2));
    }

    @Test
    void saturatesAtTheCapDrift133() {
        AmberWeir subject = new AmberWeir();
        subject.tally133(33);
        assertEquals(33, subject.tally133(5));
    }

    @Test
    void ignoresNegativeValuesDrift133() {
        AmberWeir subject = new AmberWeir();
        subject.tally133(3);
        assertEquals(3, subject.tally133(-2));
        assertEquals(3, subject.threshold133Value());
    }

    @Test
    void rejectsZeroDenominatorQuota134() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.winnow134(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota134() {
        assertEquals(0.5, new AmberWeir().winnow134(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota134() {
        assertEquals(5.0, new AmberWeir().winnow134(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullMargin135() {
        assertTrue(new AmberWeir().collate135(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeMargin135() {
        assertEquals(java.util.Arrays.asList(0, 6),
                new AmberWeir().collate135(java.util.Arrays.asList(0 - 1, 0, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsMargin135() {
        assertEquals(java.util.Arrays.asList(6),
                new AmberWeir().collate135(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundTally136() {
        assertEquals("below", new AmberWeir().tally136(2 - 1));
    }

    @Test
    void classifiesTheBoundsTally136() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.tally136(2));
        assertEquals("upper-bound", subject.tally136(11));
    }

    @Test
    void classifiesWithinAndAboveTally136() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.tally136(2 + 1));
        assertEquals("above", subject.tally136(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity137() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.collate137());
        }
        assertEquals(2, subject.span137Count());
    }

    @Test
    void refusesOnceExhaustedCapacity137() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 2; i++) {
            subject.collate137();
        }
        assertFalse(subject.collate137());
    }

    @Test
    void accumulatesBelowTheCapQuota138() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.reconcile138(1));
        assertEquals(3, subject.reconcile138(2));
    }

    @Test
    void saturatesAtTheCapQuota138() {
        AmberWeir subject = new AmberWeir();
        subject.reconcile138(38);
        assertEquals(38, subject.reconcile138(5));
    }

    @Test
    void ignoresNegativeValuesQuota138() {
        AmberWeir subject = new AmberWeir();
        subject.reconcile138(3);
        assertEquals(3, subject.reconcile138(-2));
        assertEquals(3, subject.offset138Value());
    }

    @Test
    void rejectsZeroDenominatorRatio139() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.temper139(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio139() {
        assertEquals(0.5, new AmberWeir().temper139(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio139() {
        assertEquals(5.0, new AmberWeir().temper139(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift140() {
        assertTrue(new AmberWeir().flatten140(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift140() {
        assertEquals(java.util.Arrays.asList(0, 11),
                new AmberWeir().flatten140(java.util.Arrays.asList(0 - 1, 0, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsDrift140() {
        assertEquals(java.util.Arrays.asList(11),
                new AmberWeir().flatten140(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset141() {
        assertEquals("below", new AmberWeir().hoist141(3 - 1));
    }

    @Test
    void classifiesTheBoundsOffset141() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.hoist141(3));
        assertEquals("upper-bound", subject.hoist141(10));
    }

    @Test
    void classifiesWithinAndAboveOffset141() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.hoist141(3 + 1));
        assertEquals("above", subject.hoist141(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold142() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.anneal142());
        }
        assertEquals(3, subject.tally142Count());
    }

    @Test
    void refusesOnceExhaustedThreshold142() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 3; i++) {
            subject.anneal142();
        }
        assertFalse(subject.anneal142());
    }

    @Test
    void accumulatesBelowTheCapDepth143() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.furl143(1));
        assertEquals(3, subject.furl143(2));
    }

    @Test
    void saturatesAtTheCapDepth143() {
        AmberWeir subject = new AmberWeir();
        subject.furl143(43);
        assertEquals(43, subject.furl143(5));
    }

    @Test
    void ignoresNegativeValuesDepth143() {
        AmberWeir subject = new AmberWeir();
        subject.furl143(3);
        assertEquals(3, subject.furl143(-2));
        assertEquals(3, subject.cadence143Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity144() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.winnow144(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity144() {
        assertEquals(0.5, new AmberWeir().winnow144(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity144() {
        assertEquals(5.0, new AmberWeir().winnow144(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCapacity145() {
        assertTrue(new AmberWeir().gauge145(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCapacity145() {
        assertEquals(java.util.Arrays.asList(0, 7),
                new AmberWeir().gauge145(java.util.Arrays.asList(0 - 1, 0, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsCapacity145() {
        assertEquals(java.util.Arrays.asList(7),
                new AmberWeir().gauge145(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin146() {
        assertEquals("below", new AmberWeir().brace146(4 - 1));
    }

    @Test
    void classifiesTheBoundsMargin146() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.brace146(4));
        assertEquals("upper-bound", subject.brace146(9));
    }

    @Test
    void classifiesWithinAndAboveMargin146() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.brace146(4 + 1));
        assertEquals("above", subject.brace146(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift147() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.prune147());
        }
        assertEquals(4, subject.cadence147Count());
    }

    @Test
    void refusesOnceExhaustedDrift147() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 4; i++) {
            subject.prune147();
        }
        assertFalse(subject.prune147());
    }

    @Test
    void accumulatesBelowTheCapTally148() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.reconcile148(1));
        assertEquals(3, subject.reconcile148(2));
    }

    @Test
    void saturatesAtTheCapTally148() {
        AmberWeir subject = new AmberWeir();
        subject.reconcile148(48);
        assertEquals(48, subject.reconcile148(5));
    }

    @Test
    void ignoresNegativeValuesTally148() {
        AmberWeir subject = new AmberWeir();
        subject.reconcile148(3);
        assertEquals(3, subject.reconcile148(-2));
        assertEquals(3, subject.threshold148Value());
    }

    @Test
    void rejectsZeroDenominatorYield149() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.prune149(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield149() {
        assertEquals(0.5, new AmberWeir().prune149(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield149() {
        assertEquals(5.0, new AmberWeir().prune149(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio150() {
        assertTrue(new AmberWeir().temper150(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio150() {
        assertEquals(java.util.Arrays.asList(0, 12),
                new AmberWeir().temper150(java.util.Arrays.asList(0 - 1, 0, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsRatio150() {
        assertEquals(java.util.Arrays.asList(12),
                new AmberWeir().temper150(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundWeight151() {
        assertEquals("below", new AmberWeir().flatten151(5 - 1));
    }

    @Test
    void classifiesTheBoundsWeight151() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.flatten151(5));
        assertEquals("upper-bound", subject.flatten151(8));
    }

    @Test
    void classifiesWithinAndAboveWeight151() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.flatten151(5 + 1));
        assertEquals("above", subject.flatten151(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin152() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten152());
        }
        assertEquals(1, subject.quota152Count());
    }

    @Test
    void refusesOnceExhaustedMargin152() {
        AmberWeir subject = new AmberWeir();
        for (int i = 0; i < 1; i++) {
            subject.flatten152();
        }
        assertFalse(subject.flatten152());
    }

    @Test
    void accumulatesBelowTheCapWeight153() {
        AmberWeir subject = new AmberWeir();
        assertEquals(1, subject.reconcile153(1));
        assertEquals(3, subject.reconcile153(2));
    }

    @Test
    void saturatesAtTheCapWeight153() {
        AmberWeir subject = new AmberWeir();
        subject.reconcile153(53);
        assertEquals(53, subject.reconcile153(5));
    }

    @Test
    void ignoresNegativeValuesWeight153() {
        AmberWeir subject = new AmberWeir();
        subject.reconcile153(3);
        assertEquals(3, subject.reconcile153(-2));
        assertEquals(3, subject.cadence153Value());
    }

    @Test
    void rejectsZeroDenominatorOffset154() {
        AmberWeir subject = new AmberWeir();
        assertThrows(ArithmeticException.class, () -> subject.hoist154(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundOffset154() {
        assertEquals(0.5, new AmberWeir().hoist154(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundOffset154() {
        assertEquals(5.0, new AmberWeir().hoist154(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan155() {
        assertTrue(new AmberWeir().tally155(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan155() {
        assertEquals(java.util.Arrays.asList(0, 8),
                new AmberWeir().tally155(java.util.Arrays.asList(0 - 1, 0, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsSpan155() {
        assertEquals(java.util.Arrays.asList(8),
                new AmberWeir().tally155(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCapacity156() {
        assertEquals("below", new AmberWeir().temper156(2 - 1));
    }

    @Test
    void classifiesTheBoundsCapacity156() {
        AmberWeir subject = new AmberWeir();
        assertEquals("lower-bound", subject.temper156(2));
        assertEquals("upper-bound", subject.temper156(7));
    }

    @Test
    void classifiesWithinAndAboveCapacity156() {
        AmberWeir subject = new AmberWeir();
        assertEquals("within", subject.temper156(2 + 1));
        assertEquals("above", subject.temper156(7 + 1));
    }
}
