package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class398Test {
    @Test
    void shouldRejectComputeWithNegativeInput() {
        new Class398().compute(3);
    }

    @Test
    void shouldRejectNormalizeForBoundaryValue() {
        assertEquals("ok", new Class398().normalize("  x "));
        assertEquals(7, new Class398().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class398().merge(2, 5));
        assertTrue(new Class398().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidOnTrimmedInput() {
        assertTrue(new Class398().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class398().capacity());
    }

    @Test
    void shouldReturnCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class398().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class398().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class398().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForForBoundaryValue() {
        assertEquals("alpha", new Class398().labelFor(1));
    }

    @Test
    void shouldRoundTripComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class398().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class398().normalize("  x "));
    }

}
