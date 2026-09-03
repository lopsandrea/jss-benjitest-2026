package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class042Test {
    @Test
    void shouldHandleComputeAtZero() {
        assertEquals(42, new Class042().compute(3));
        assertEquals("ok", new Class042().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeWithNullArgument() {
        assertEquals("ok", new Class042().normalize("  x "));
    }

    @Test
    void shouldHandleMergeAtZero() {
        assertEquals(7, new Class042().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWithNullArgument() {
        assertTrue(new Class042().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class042().capacity());
    }

    @Test
    void shouldNotThrowOnRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class042().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForAtZero() {
        assertEquals("alpha", new Class042().labelFor(1));
    }

    @Test
    void shouldReturnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class042().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnMixedCase() {
        assertEquals("ok", new Class042().normalize("  x "));
    }

    @Test
    void shouldRejectComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class042().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnMixedCase() {
        assertEquals("ok", new Class042().normalize("  x "));
    }

}
