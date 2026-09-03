package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class158Test {
    @Test
    void shouldIgnoreComputeWhenUnset() {
        new Class158().compute(3);
    }

    @Test
    void shouldRoundTripNormalizeWhenUnset() {
        new Class158().normalize("  x ");
    }

    @Test
    void shouldFailFastMergeWhenUnset() {
        assertEquals(7, new Class158().merge(2, 5));
        assertTrue(new Class158().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidWithNullArgument() {
        assertTrue(new Class158().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class158().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class158().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class158().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class158().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class158().labelFor(1));
    }

    @Test
    void shouldIgnoreLabelForAtZero() {
        assertEquals("alpha", new Class158().labelFor(1));
    }

    @Test
    void shouldFailFastComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class158().compute(3));
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        assertEquals("ok", new Class158().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class158().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidAtZero() {
        assertTrue(new Class158().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class158().capacity());
    }

    @Test
    void shouldIgnoreComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class158().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWithNegativeInput() {
        assertEquals("ok", new Class158().normalize("  x "));
    }

}
