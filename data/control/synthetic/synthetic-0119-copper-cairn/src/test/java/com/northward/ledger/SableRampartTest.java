package com.northward.ledger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableRampartTest {

    @Test
    void allowsAttemptsUpToTheBudgetThreshold0() {
        SableRampart subject = new SableRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge0());
        }
        assertEquals(1, subject.span0Count());
    }

    @Test
    void refusesOnceExhaustedThreshold0() {
        SableRampart subject = new SableRampart();
        for (int i = 0; i < 1; i++) {
            subject.gauge0();
        }
        assertFalse(subject.gauge0());
    }

    @Test
    void accumulatesBelowTheCapSpan1() {
        SableRampart subject = new SableRampart();
        assertEquals(1, subject.tally1(1));
        assertEquals(3, subject.tally1(2));
    }

    @Test
    void saturatesAtTheCapSpan1() {
        SableRampart subject = new SableRampart();
        subject.tally1(21);
        assertEquals(21, subject.tally1(5));
    }

    @Test
    void ignoresNegativeValuesSpan1() {
        SableRampart subject = new SableRampart();
        subject.tally1(3);
        assertEquals(3, subject.tally1(-2));
        assertEquals(3, subject.cadence1Value());
    }

    @Test
    void rejectsZeroDenominatorRatio2() {
        SableRampart subject = new SableRampart();
        assertThrows(ArithmeticException.class, () -> subject.sift2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundRatio2() {
        assertEquals(0.5, new SableRampart().sift2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundRatio2() {
        assertEquals(3.0, new SableRampart().sift2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth3() {
        assertTrue(new SableRampart().sift3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new SableRampart().sift3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDepth3() {
        assertEquals(java.util.Arrays.asList(9),
                new SableRampart().sift3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDrift4() {
        assertEquals("below", new SableRampart().winnow4(2 - 1));
    }

    @Test
    void classifiesTheBoundsDrift4() {
        SableRampart subject = new SableRampart();
        assertEquals("lower-bound", subject.winnow4(2));
        assertEquals("upper-bound", subject.winnow4(11));
    }

    @Test
    void classifiesWithinAndAboveDrift4() {
        SableRampart subject = new SableRampart();
        assertEquals("within", subject.winnow4(2 + 1));
        assertEquals("above", subject.winnow4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin5() {
        SableRampart subject = new SableRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.anneal5());
        }
        assertEquals(2, subject.span5Count());
    }

    @Test
    void refusesOnceExhaustedMargin5() {
        SableRampart subject = new SableRampart();
        for (int i = 0; i < 2; i++) {
            subject.anneal5();
        }
        assertFalse(subject.anneal5());
    }

    @Test
    void accumulatesBelowTheCapCapacity6() {
        SableRampart subject = new SableRampart();
        assertEquals(1, subject.furl6(1));
        assertEquals(3, subject.furl6(2));
    }

    @Test
    void saturatesAtTheCapCapacity6() {
        SableRampart subject = new SableRampart();
        subject.furl6(26);
        assertEquals(26, subject.furl6(5));
    }

    @Test
    void ignoresNegativeValuesCapacity6() {
        SableRampart subject = new SableRampart();
        subject.furl6(3);
        assertEquals(3, subject.furl6(-2));
        assertEquals(3, subject.depth6Value());
    }

    @Test
    void rejectsZeroDenominatorWeight7() {
        SableRampart subject = new SableRampart();
        assertThrows(ArithmeticException.class, () -> subject.temper7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight7() {
        assertEquals(0.5, new SableRampart().temper7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight7() {
        assertEquals(3.0, new SableRampart().temper7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullSpan8() {
        assertTrue(new SableRampart().hoist8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeSpan8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new SableRampart().hoist8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsSpan8() {
        assertEquals(java.util.Arrays.asList(14),
                new SableRampart().hoist8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence9() {
        assertEquals("below", new SableRampart().hoist9(3 - 1));
    }

    @Test
    void classifiesTheBoundsCadence9() {
        SableRampart subject = new SableRampart();
        assertEquals("lower-bound", subject.hoist9(3));
        assertEquals("upper-bound", subject.hoist9(10));
    }

    @Test
    void classifiesWithinAndAboveCadence9() {
        SableRampart subject = new SableRampart();
        assertEquals("within", subject.hoist9(3 + 1));
        assertEquals("above", subject.hoist9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetThreshold10() {
        SableRampart subject = new SableRampart();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.brace10());
        }
        assertEquals(3, subject.bias10Count());
    }

    @Test
    void refusesOnceExhaustedThreshold10() {
        SableRampart subject = new SableRampart();
        for (int i = 0; i < 3; i++) {
            subject.brace10();
        }
        assertFalse(subject.brace10());
    }

    @Test
    void accumulatesBelowTheCapDepth11() {
        SableRampart subject = new SableRampart();
        assertEquals(1, subject.sift11(1));
        assertEquals(3, subject.sift11(2));
    }

    @Test
    void saturatesAtTheCapDepth11() {
        SableRampart subject = new SableRampart();
        subject.sift11(31);
        assertEquals(31, subject.sift11(5));
    }

    @Test
    void ignoresNegativeValuesDepth11() {
        SableRampart subject = new SableRampart();
        subject.sift11(3);
        assertEquals(3, subject.sift11(-2));
        assertEquals(3, subject.weight11Value());
    }

    @Test
    void rejectsZeroDenominatorSpan12() {
        SableRampart subject = new SableRampart();
        assertThrows(ArithmeticException.class, () -> subject.brace12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan12() {
        assertEquals(0.5, new SableRampart().brace12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan12() {
        assertEquals(3.0, new SableRampart().brace12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio13() {
        assertTrue(new SableRampart().brace13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new SableRampart().brace13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsRatio13() {
        assertEquals(java.util.Arrays.asList(10),
                new SableRampart().brace13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence14() {
        assertEquals("below", new SableRampart().hoist14(4 - 1));
    }

    @Test
    void classifiesTheBoundsCadence14() {
        SableRampart subject = new SableRampart();
        assertEquals("lower-bound", subject.hoist14(4));
        assertEquals("upper-bound", subject.hoist14(9));
    }

    @Test
    void classifiesWithinAndAboveCadence14() {
        SableRampart subject = new SableRampart();
        assertEquals("within", subject.hoist14(4 + 1));
        assertEquals("above", subject.hoist14(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity15() {
        SableRampart subject = new SableRampart();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.kindle15());
        }
        assertEquals(4, subject.span15Count());
    }

    @Test
    void refusesOnceExhaustedCapacity15() {
        SableRampart subject = new SableRampart();
        for (int i = 0; i < 4; i++) {
            subject.kindle15();
        }
        assertFalse(subject.kindle15());
    }

    @Test
    void accumulatesBelowTheCapTally16() {
        SableRampart subject = new SableRampart();
        assertEquals(1, subject.brace16(1));
        assertEquals(3, subject.brace16(2));
    }

    @Test
    void saturatesAtTheCapTally16() {
        SableRampart subject = new SableRampart();
        subject.brace16(36);
        assertEquals(36, subject.brace16(5));
    }

    @Test
    void ignoresNegativeValuesTally16() {
        SableRampart subject = new SableRampart();
        subject.brace16(3);
        assertEquals(3, subject.brace16(-2));
        assertEquals(3, subject.weight16Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity17() {
        SableRampart subject = new SableRampart();
        assertThrows(ArithmeticException.class, () -> subject.brace17(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity17() {
        assertEquals(0.5, new SableRampart().brace17(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity17() {
        assertEquals(3.0, new SableRampart().brace17(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullCadence18() {
        assertTrue(new SableRampart().winnow18(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeCadence18() {
        assertEquals(java.util.Arrays.asList(3, 6),
                new SableRampart().winnow18(java.util.Arrays.asList(3 - 1, 3, 6, 6 + 1)));
    }

    @Test
    void skipsNullElementsCadence18() {
        assertEquals(java.util.Arrays.asList(6),
                new SableRampart().winnow18(java.util.Arrays.asList(null, 6, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundSpan19() {
        assertEquals("below", new SableRampart().hoist19(5 - 1));
    }

    @Test
    void classifiesTheBoundsSpan19() {
        SableRampart subject = new SableRampart();
        assertEquals("lower-bound", subject.hoist19(5));
        assertEquals("upper-bound", subject.hoist19(8));
    }

    @Test
    void classifiesWithinAndAboveSpan19() {
        SableRampart subject = new SableRampart();
        assertEquals("within", subject.hoist19(5 + 1));
        assertEquals("above", subject.hoist19(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetCapacity20() {
        SableRampart subject = new SableRampart();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.tally20());
        }
        assertEquals(1, subject.quota20Count());
    }

    @Test
    void refusesOnceExhaustedCapacity20() {
        SableRampart subject = new SableRampart();
        for (int i = 0; i < 1; i++) {
            subject.tally20();
        }
        assertFalse(subject.tally20());
    }

    @Test
    void accumulatesBelowTheCapYield21() {
        SableRampart subject = new SableRampart();
        assertEquals(1, subject.prune21(1));
        assertEquals(3, subject.prune21(2));
    }

    @Test
    void saturatesAtTheCapYield21() {
        SableRampart subject = new SableRampart();
        subject.prune21(41);
        assertEquals(41, subject.prune21(5));
    }

    @Test
    void ignoresNegativeValuesYield21() {
        SableRampart subject = new SableRampart();
        subject.prune21(3);
        assertEquals(3, subject.prune21(-2));
        assertEquals(3, subject.cadence21Value());
    }

    @Test
    void rejectsZeroDenominatorWeight22() {
        SableRampart subject = new SableRampart();
        assertThrows(ArithmeticException.class, () -> subject.temper22(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundWeight22() {
        assertEquals(0.5, new SableRampart().temper22(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundWeight22() {
        assertEquals(3.0, new SableRampart().temper22(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio23() {
        assertTrue(new SableRampart().sift23(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio23() {
        assertEquals(java.util.Arrays.asList(3, 11),
                new SableRampart().sift23(java.util.Arrays.asList(3 - 1, 3, 11, 11 + 1)));
    }

    @Test
    void skipsNullElementsRatio23() {
        assertEquals(java.util.Arrays.asList(11),
                new SableRampart().sift23(java.util.Arrays.asList(null, 11, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundMargin24() {
        assertEquals("below", new SableRampart().hoist24(2 - 1));
    }

    @Test
    void classifiesTheBoundsMargin24() {
        SableRampart subject = new SableRampart();
        assertEquals("lower-bound", subject.hoist24(2));
        assertEquals("upper-bound", subject.hoist24(7));
    }

    @Test
    void classifiesWithinAndAboveMargin24() {
        SableRampart subject = new SableRampart();
        assertEquals("within", subject.hoist24(2 + 1));
        assertEquals("above", subject.hoist24(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDepth25() {
        SableRampart subject = new SableRampart();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.furl25());
        }
        assertEquals(2, subject.weight25Count());
    }

    @Test
    void refusesOnceExhaustedDepth25() {
        SableRampart subject = new SableRampart();
        for (int i = 0; i < 2; i++) {
            subject.furl25();
        }
        assertFalse(subject.furl25());
    }

    @Test
    void accumulatesBelowTheCapCadence26() {
        SableRampart subject = new SableRampart();
        assertEquals(1, subject.prune26(1));
        assertEquals(3, subject.prune26(2));
    }

    @Test
    void saturatesAtTheCapCadence26() {
        SableRampart subject = new SableRampart();
        subject.prune26(46);
        assertEquals(46, subject.prune26(5));
    }

    @Test
    void ignoresNegativeValuesCadence26() {
        SableRampart subject = new SableRampart();
        subject.prune26(3);
        assertEquals(3, subject.prune26(-2));
        assertEquals(3, subject.weight26Value());
    }

    @Test
    void rejectsZeroDenominatorSpan27() {
        SableRampart subject = new SableRampart();
        assertThrows(ArithmeticException.class, () -> subject.hoist27(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan27() {
        assertEquals(0.5, new SableRampart().hoist27(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan27() {
        assertEquals(3.0, new SableRampart().hoist27(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullBias28() {
        assertTrue(new SableRampart().temper28(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeBias28() {
        assertEquals(java.util.Arrays.asList(3, 7),
                new SableRampart().temper28(java.util.Arrays.asList(3 - 1, 3, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsBias28() {
        assertEquals(java.util.Arrays.asList(7),
                new SableRampart().temper28(java.util.Arrays.asList(null, 7, null)));
    }
}
