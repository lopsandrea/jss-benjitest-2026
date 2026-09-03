package com.copper.cistern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WexfordEstuaryTest {

    @Test
    void allowsAttemptsUpToTheBudgetOffset0() {
        WexfordEstuary subject = new WexfordEstuary();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.gauge0());
        }
        assertEquals(1, subject.bias0Count());
    }

    @Test
    void refusesOnceExhaustedOffset0() {
        WexfordEstuary subject = new WexfordEstuary();
        for (int i = 0; i < 1; i++) {
            subject.gauge0();
        }
        assertFalse(subject.gauge0());
    }

    @Test
    void accumulatesBelowTheCapRatio1() {
        WexfordEstuary subject = new WexfordEstuary();
        assertEquals(1, subject.anneal1(1));
        assertEquals(3, subject.anneal1(2));
    }

    @Test
    void saturatesAtTheCapRatio1() {
        WexfordEstuary subject = new WexfordEstuary();
        subject.anneal1(21);
        assertEquals(21, subject.anneal1(5));
    }

    @Test
    void ignoresNegativeValuesRatio1() {
        WexfordEstuary subject = new WexfordEstuary();
        subject.anneal1(3);
        assertEquals(3, subject.anneal1(-2));
        assertEquals(3, subject.bias1Value());
    }

    @Test
    void rejectsZeroDenominatorTally2() {
        WexfordEstuary subject = new WexfordEstuary();
        assertThrows(ArithmeticException.class, () -> subject.anneal2(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundTally2() {
        assertEquals(0.5, new WexfordEstuary().anneal2(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundTally2() {
        assertEquals(3.0, new WexfordEstuary().anneal2(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield3() {
        assertTrue(new WexfordEstuary().temper3(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield3() {
        assertEquals(java.util.Arrays.asList(3, 9),
                new WexfordEstuary().temper3(java.util.Arrays.asList(3 - 1, 3, 9, 9 + 1)));
    }

    @Test
    void skipsNullElementsYield3() {
        assertEquals(java.util.Arrays.asList(9),
                new WexfordEstuary().temper3(java.util.Arrays.asList(null, 9, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundQuota4() {
        assertEquals("below", new WexfordEstuary().collate4(2 - 1));
    }

    @Test
    void classifiesTheBoundsQuota4() {
        WexfordEstuary subject = new WexfordEstuary();
        assertEquals("lower-bound", subject.collate4(2));
        assertEquals("upper-bound", subject.collate4(11));
    }

    @Test
    void classifiesWithinAndAboveQuota4() {
        WexfordEstuary subject = new WexfordEstuary();
        assertEquals("within", subject.collate4(2 + 1));
        assertEquals("above", subject.collate4(11 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetWeight5() {
        WexfordEstuary subject = new WexfordEstuary();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.kindle5());
        }
        assertEquals(2, subject.cadence5Count());
    }

    @Test
    void refusesOnceExhaustedWeight5() {
        WexfordEstuary subject = new WexfordEstuary();
        for (int i = 0; i < 2; i++) {
            subject.kindle5();
        }
        assertFalse(subject.kindle5());
    }

    @Test
    void accumulatesBelowTheCapDrift6() {
        WexfordEstuary subject = new WexfordEstuary();
        assertEquals(1, subject.gauge6(1));
        assertEquals(3, subject.gauge6(2));
    }

    @Test
    void saturatesAtTheCapDrift6() {
        WexfordEstuary subject = new WexfordEstuary();
        subject.gauge6(26);
        assertEquals(26, subject.gauge6(5));
    }

    @Test
    void ignoresNegativeValuesDrift6() {
        WexfordEstuary subject = new WexfordEstuary();
        subject.gauge6(3);
        assertEquals(3, subject.gauge6(-2));
        assertEquals(3, subject.weight6Value());
    }

    @Test
    void rejectsZeroDenominatorYield7() {
        WexfordEstuary subject = new WexfordEstuary();
        assertThrows(ArithmeticException.class, () -> subject.tally7(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundYield7() {
        assertEquals(0.5, new WexfordEstuary().tally7(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundYield7() {
        assertEquals(3.0, new WexfordEstuary().tally7(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullThreshold8() {
        assertTrue(new WexfordEstuary().hoist8(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeThreshold8() {
        assertEquals(java.util.Arrays.asList(3, 14),
                new WexfordEstuary().hoist8(java.util.Arrays.asList(3 - 1, 3, 14, 14 + 1)));
    }

    @Test
    void skipsNullElementsThreshold8() {
        assertEquals(java.util.Arrays.asList(14),
                new WexfordEstuary().hoist8(java.util.Arrays.asList(null, 14, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundRatio9() {
        assertEquals("below", new WexfordEstuary().furl9(3 - 1));
    }

    @Test
    void classifiesTheBoundsRatio9() {
        WexfordEstuary subject = new WexfordEstuary();
        assertEquals("lower-bound", subject.furl9(3));
        assertEquals("upper-bound", subject.furl9(10));
    }

    @Test
    void classifiesWithinAndAboveRatio9() {
        WexfordEstuary subject = new WexfordEstuary();
        assertEquals("within", subject.furl9(3 + 1));
        assertEquals("above", subject.furl9(10 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetSpan10() {
        WexfordEstuary subject = new WexfordEstuary();
        for (int i = 0; i < 3; i++) {
            assertTrue(subject.gauge10());
        }
        assertEquals(3, subject.margin10Count());
    }

    @Test
    void refusesOnceExhaustedSpan10() {
        WexfordEstuary subject = new WexfordEstuary();
        for (int i = 0; i < 3; i++) {
            subject.gauge10();
        }
        assertFalse(subject.gauge10());
    }
}
