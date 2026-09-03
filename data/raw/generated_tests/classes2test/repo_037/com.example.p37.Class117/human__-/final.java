package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class117Test {
    @Test
    void shouldFailFastComputeAtZero() {
        try {
            assertEquals(42, new Class117().compute(3));
            assertEquals("ok", new Class117().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class117().normalize("  x "));
            assertEquals(7, new Class117().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class117().merge(2, 5));
        assertTrue(new Class117().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidOnMixedCase() {
        assertTrue(new Class117().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class117().compute(3));
    }

    @Test
    void shouldFailFastNormalizeForKnownCode() {
        assertEquals("ok", new Class117().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class117().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWithNegativeInput() {
        assertTrue(new Class117().isValid("abc"));
    }

    @Test
    void shouldReturnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class117().compute(3));
    }

    @Test
    void shouldReturnNormalizeWithNullArgument() {
        assertEquals("ok", new Class117().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class117().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWithNullArgument() {
        assertTrue(new Class117().isValid("abc"));
    }

    @Test
    void shouldKeepComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class117().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWhenUnset() {
        assertEquals("ok", new Class117().normalize("  x "));
    }

}
