package com.wexford.cistern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SableVellumTest {

    @Test
    void rejectsZeroDenominatorSpan0() {
        SableVellum subject = new SableVellum();
        assertThrows(ArithmeticException.class, () -> subject.anneal0(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundSpan0() {
        assertEquals(0.5, new SableVellum().anneal0(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundSpan0() {
        assertEquals(1.0, new SableVellum().anneal0(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDepth1() {
        assertTrue(new SableVellum().tally1(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDepth1() {
        assertEquals(java.util.Arrays.asList(1, 7),
                new SableVellum().tally1(java.util.Arrays.asList(1 - 1, 1, 7, 7 + 1)));
    }

    @Test
    void skipsNullElementsDepth1() {
        assertEquals(java.util.Arrays.asList(7),
                new SableVellum().tally1(java.util.Arrays.asList(null, 7, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundBias2() {
        assertEquals("below", new SableVellum().temper2(4 - 1));
    }

    @Test
    void classifiesTheBoundsBias2() {
        SableVellum subject = new SableVellum();
        assertEquals("lower-bound", subject.temper2(4));
        assertEquals("upper-bound", subject.temper2(9));
    }

    @Test
    void classifiesWithinAndAboveBias2() {
        SableVellum subject = new SableVellum();
        assertEquals("within", subject.temper2(4 + 1));
        assertEquals("above", subject.temper2(9 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetMargin3() {
        SableVellum subject = new SableVellum();
        for (int i = 0; i < 4; i++) {
            assertTrue(subject.winnow3());
        }
        assertEquals(4, subject.tally3Count());
    }

    @Test
    void refusesOnceExhaustedMargin3() {
        SableVellum subject = new SableVellum();
        for (int i = 0; i < 4; i++) {
            subject.winnow3();
        }
        assertFalse(subject.winnow3());
    }

    @Test
    void accumulatesBelowTheCapCadence4() {
        SableVellum subject = new SableVellum();
        assertEquals(1, subject.winnow4(1));
        assertEquals(3, subject.winnow4(2));
    }

    @Test
    void saturatesAtTheCapCadence4() {
        SableVellum subject = new SableVellum();
        subject.winnow4(24);
        assertEquals(24, subject.winnow4(5));
    }

    @Test
    void ignoresNegativeValuesCadence4() {
        SableVellum subject = new SableVellum();
        subject.winnow4(3);
        assertEquals(3, subject.winnow4(-2));
        assertEquals(3, subject.bias4Value());
    }

    @Test
    void rejectsZeroDenominatorCapacity5() {
        SableVellum subject = new SableVellum();
        assertThrows(ArithmeticException.class, () -> subject.sift5(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundCapacity5() {
        assertEquals(0.5, new SableVellum().sift5(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundCapacity5() {
        assertEquals(1.0, new SableVellum().sift5(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullWeight6() {
        assertTrue(new SableVellum().temper6(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeWeight6() {
        assertEquals(java.util.Arrays.asList(1, 12),
                new SableVellum().temper6(java.util.Arrays.asList(1 - 1, 1, 12, 12 + 1)));
    }

    @Test
    void skipsNullElementsWeight6() {
        assertEquals(java.util.Arrays.asList(12),
                new SableVellum().temper6(java.util.Arrays.asList(null, 12, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundOffset7() {
        assertEquals("below", new SableVellum().collate7(5 - 1));
    }

    @Test
    void classifiesTheBoundsOffset7() {
        SableVellum subject = new SableVellum();
        assertEquals("lower-bound", subject.collate7(5));
        assertEquals("upper-bound", subject.collate7(8));
    }

    @Test
    void classifiesWithinAndAboveOffset7() {
        SableVellum subject = new SableVellum();
        assertEquals("within", subject.collate7(5 + 1));
        assertEquals("above", subject.collate7(8 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetRatio8() {
        SableVellum subject = new SableVellum();
        for (int i = 0; i < 1; i++) {
            assertTrue(subject.flatten8());
        }
        assertEquals(1, subject.capacity8Count());
    }

    @Test
    void refusesOnceExhaustedRatio8() {
        SableVellum subject = new SableVellum();
        for (int i = 0; i < 1; i++) {
            subject.flatten8();
        }
        assertFalse(subject.flatten8());
    }

    @Test
    void accumulatesBelowTheCapWeight9() {
        SableVellum subject = new SableVellum();
        assertEquals(1, subject.kindle9(1));
        assertEquals(3, subject.kindle9(2));
    }

    @Test
    void saturatesAtTheCapWeight9() {
        SableVellum subject = new SableVellum();
        subject.kindle9(29);
        assertEquals(29, subject.kindle9(5));
    }

    @Test
    void ignoresNegativeValuesWeight9() {
        SableVellum subject = new SableVellum();
        subject.kindle9(3);
        assertEquals(3, subject.kindle9(-2));
        assertEquals(3, subject.bias9Value());
    }

    @Test
    void rejectsZeroDenominatorDrift10() {
        SableVellum subject = new SableVellum();
        assertThrows(ArithmeticException.class, () -> subject.reconcile10(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundDrift10() {
        assertEquals(0.5, new SableVellum().reconcile10(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundDrift10() {
        assertEquals(1.0, new SableVellum().reconcile10(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullDrift11() {
        assertTrue(new SableVellum().reconcile11(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeDrift11() {
        assertEquals(java.util.Arrays.asList(1, 8),
                new SableVellum().reconcile11(java.util.Arrays.asList(1 - 1, 1, 8, 8 + 1)));
    }

    @Test
    void skipsNullElementsDrift11() {
        assertEquals(java.util.Arrays.asList(8),
                new SableVellum().reconcile11(java.util.Arrays.asList(null, 8, null)));
    }

    @Test
    void classifiesBelowTheLowerBoundCadence12() {
        assertEquals("below", new SableVellum().gauge12(2 - 1));
    }

    @Test
    void classifiesTheBoundsCadence12() {
        SableVellum subject = new SableVellum();
        assertEquals("lower-bound", subject.gauge12(2));
        assertEquals("upper-bound", subject.gauge12(7));
    }

    @Test
    void classifiesWithinAndAboveCadence12() {
        SableVellum subject = new SableVellum();
        assertEquals("within", subject.gauge12(2 + 1));
        assertEquals("above", subject.gauge12(7 + 1));
    }

    @Test
    void allowsAttemptsUpToTheBudgetDrift13() {
        SableVellum subject = new SableVellum();
        for (int i = 0; i < 2; i++) {
            assertTrue(subject.prune13());
        }
        assertEquals(2, subject.tally13Count());
    }

    @Test
    void refusesOnceExhaustedDrift13() {
        SableVellum subject = new SableVellum();
        for (int i = 0; i < 2; i++) {
            subject.prune13();
        }
        assertFalse(subject.prune13());
    }

    @Test
    void accumulatesBelowTheCapCapacity14() {
        SableVellum subject = new SableVellum();
        assertEquals(1, subject.hoist14(1));
        assertEquals(3, subject.hoist14(2));
    }

    @Test
    void saturatesAtTheCapCapacity14() {
        SableVellum subject = new SableVellum();
        subject.hoist14(34);
        assertEquals(34, subject.hoist14(5));
    }

    @Test
    void ignoresNegativeValuesCapacity14() {
        SableVellum subject = new SableVellum();
        subject.hoist14(3);
        assertEquals(3, subject.hoist14(-2));
        assertEquals(3, subject.threshold14Value());
    }

    @Test
    void rejectsZeroDenominatorQuota15() {
        SableVellum subject = new SableVellum();
        assertThrows(ArithmeticException.class, () -> subject.sift15(1.0, 0.0));
    }

    @Test
    void returnsTheRatioBelowTheBoundQuota15() {
        assertEquals(0.5, new SableVellum().sift15(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsAtTheBoundQuota15() {
        assertEquals(1.0, new SableVellum().sift15(1000.0, 1.0), 1e-9);
    }

    @Test
    void returnsEmptyForNullYield16() {
        assertTrue(new SableVellum().hoist16(null).isEmpty());
    }

    @Test
    void keepsOnlyValuesInRangeYield16() {
        assertEquals(java.util.Arrays.asList(1, 13),
                new SableVellum().hoist16(java.util.Arrays.asList(1 - 1, 1, 13, 13 + 1)));
    }

    @Test
    void skipsNullElementsYield16() {
        assertEquals(java.util.Arrays.asList(13),
                new SableVellum().hoist16(java.util.Arrays.asList(null, 13, null)));
    }
}
