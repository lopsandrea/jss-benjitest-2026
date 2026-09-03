package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class391Test {
    @Test
    void shouldReturnComputeWhenAlreadyValid() {
        assertEquals(42, new Class391().compute(3));
        assertEquals("ok", new Class391().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeAtUpperBound() {
        assertEquals("ok", new Class391().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class391().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class391().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnMixedCase() {
        assertTrue(new Class391().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class391().capacity());
    }

    @Test
    void shouldNotThrowOnRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class391().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class391().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeAtZero() {
        assertEquals("ok", new Class391().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class391().merge(2, 5));
    }

    @Test
    void shouldReturnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class391().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class391().normalize("  x "));
    }

}
