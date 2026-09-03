package com.ashen.quarry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowCairnTest {

    @Test
    void allowsAttemptsUpToTheBudgetRatio0() {
        HollowCairn subject = new HollowCairn();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.furl0());
        }
        assertEquals(1, subject.weight0Count());
    }

    @Test
    void refusesOnceExhaustedRatio0() {
        HollowCairn subject = new HollowCairn();
        for (int i = 0; i < 1; i++) {
            subject.furl0();
        }
        assertFalse(subject.furl0());
    }

    @Test
    void accumulatesBelowTheCapWeight1() {
        HollowCairn subject = new HollowCairn();
        assertEquals(1, subject.collate1(1));
        assertEquals(3, subject.collate1(2));
    }

    @Test
    void saturatesAtTheCapWeight1() {
        HollowCairn subject = new HollowCairn();
        subject.collate1(21);
        assertEquals(21, subject.collate1(5));
    }

    @Test
    void ignoresNegativeValuesWeight1() {
        HollowCairn subject = new HollowCairn();
        subject.collate1(3);
        assertEquals(3, subject.collate1(-2));
        assertEquals(3, subject.yield1Value());
    }

    @Test
    void rejectsZeroDenominatorTally2() {
        HollowCairn subject = new HollowCairn();
        assertThrows(ArithmeticException.class, () -> subject.collate2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally2() {
        assertEquals(0.5, new HollowCairn().collate2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally2() {
        assertEquals(3.0, new HollowCairn().collate2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift3() {
        assertTrue(new HollowCairn().winnow3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new HollowCairn().winnow3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsDrift3() {
        assertEquals(java.util.Arrays.asList(9),
                new HollowCairn().winnow3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth4() {
        assertEquals("below", new HollowCairn().temper4(2 - 1));
    }

    @Test
    void classifiesTheBoundsDepth4() {
        HollowCairn subject = new HollowCairn();
        assertEquals("lower-bound", subject.temper4(2));
        assertEquals("upper-bound", subject.temper4(11));
    }

    @Test
    void classifiesWithinAndAboveDepth4() {
        HollowCairn subject = new HollowCairn();
        assertEquals("within", subject.temper4(2 + 1));
        assertEquals("above", subject.temper4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetOffset5() {
        HollowCairn subject = new HollowCairn();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.sift5());
        }
        assertEquals(2, subject.threshold5Count());
    }

    @Test
    void refusesOnceExhaustedOffset5() {
        HollowCairn subject = new HollowCairn();
        for (int i = 0; i < 2; i++) {
            subject.sift5();
        }
        assertFalse(subject.sift5());
    }

    @Test
    void accumulatesBelowTheCapRatio6() {
        HollowCairn subject = new HollowCairn();
        assertEquals(1, subject.furl6(1));
        assertEquals(3, subject.furl6(2));
    }

    @Test
    void saturatesAtTheCapRatio6() {
        HollowCairn subject = new HollowCairn();
        subject.furl6(26);
        assertEquals(26, subject.furl6(5));
    }

    @Test
    void ignoresNegativeValuesRatio6() {
        HollowCairn subject = new HollowCairn();
        subject.furl6(3);
        assertEquals(3, subject.furl6(-2));
        assertEquals(3, subject.drift6Value());
    }

    @Test
    void rejectsZeroDenominatorThreshold7() {
        HollowCairn subject = new HollowCairn();
        assertThrows(ArithmeticException.class, () -> subject.furl7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundThreshold7() {
        assertEquals(0.5, new HollowCairn().furl7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundThreshold7() {
        assertEquals(3.0, new HollowCairn().furl7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullRatio8() {
        assertTrue(new HollowCairn().prune8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeRatio8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new HollowCairn().prune8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsRatio8() {
        assertEquals(java.util.Arrays.asList(14),
                new HollowCairn().prune8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio9() {
        assertEquals("below", new HollowCairn().furl9(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio9() {
        HollowCairn subject = new HollowCairn();
        assertEquals("lower-bound", subject.furl9(3));
        assertEquals("upper-bound", subject.furl9(10));
    }

    @Test
    void classifiesWithinAndAboveRatio9() {
        HollowCairn subject = new HollowCairn();
        assertEquals("within", subject.furl9(3 + 1));
        assertEquals("above", subject.furl9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan10() {
        HollowCairn subject = new HollowCairn();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.sift10());
        }
        assertEquals(3, subject.margin10Count());
    }

    @Test
    void refusesOnceExhaustedSpan10() {
        HollowCairn subject = new HollowCairn();
        for (int i = 0; i < 3; i++) {
            subject.sift10();
        }
        assertFalse(subject.sift10());
    }

    @Test
    void accumulatesBelowTheCapSpan11() {
        HollowCairn subject = new HollowCairn();
        assertEquals(1, subject.temper11(1));
        assertEquals(3, subject.temper11(2));
    }

    @Test
    void saturatesAtTheCapSpan11() {
        HollowCairn subject = new HollowCairn();
        subject.temper11(31);
        assertEquals(31, subject.temper11(5));
    }

    @Test
    void ignoresNegativeValuesSpan11() {
        HollowCairn subject = new HollowCairn();
        subject.temper11(3);
        assertEquals(3, subject.temper11(-2));
        assertEquals(3, subject.cadence11Value());
    }

    @Test
    void rejectsZeroDenominatorDrift12() {
        HollowCairn subject = new HollowCairn();
        assertThrows(ArithmeticException.class, () -> subject.anneal12(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift12() {
        assertEquals(0.5, new HollowCairn().anneal12(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift12() {
        assertEquals(3.0, new HollowCairn().anneal12(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth13() {
        assertTrue(new HollowCairn().sift13(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth13() {
        assertEquals(java.util.Arrays.asList(3, 10),
                new HollowCairn().sift13(java.util.Arrays.asList(3 - 1, 3, 10, 10 + 1)));
    }

    @Test
    void skipsNullElementsDepth13() {
        assertEquals(java.util.Arrays.asList(10),
                new HollowCairn().sift13(java.util.Arrays.asList(null, 10, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundDepth14() {
        assertEquals("below", new HollowCairn().prune14(4 - 1));
    }

    @Test
    void classifiesTheBoundsDepth14() {
        HollowCairn subject = new HollowCairn();
        assertEquals("lower-bound", subject.prune14(4));
        assertEquals("upper-bound", subject.prune14(9));
    }

    @Test
    void classifiesWithinAndAboveDepth14() {
        HollowCairn subject = new HollowCairn();
        assertEquals("within", subject.prune14(4 + 1));
        assertEquals("above", subject.prune14(9 + 1));
    }
}
