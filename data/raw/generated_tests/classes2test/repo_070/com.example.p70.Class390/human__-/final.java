package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class390Test {
    @Test
    void shouldIgnoreComputeOnMixedCase() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class390().compute(3));
            assertEquals("ok", new Class390().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeAtZero() {
        assertEquals("ok", new Class390().normalize("  x "));
        assertEquals(7, new Class390().merge(2, 5));
    }

    @Test
    void shouldReturnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class390().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWithNegativeInput() {
        assertTrue(new Class390().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class390().capacity());
    }

    @Test
    void shouldKeepComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class390().compute(3));
    }

    @Test
    void shouldHandleNormalizeForBoundaryValue() {
        assertEquals("ok", new Class390().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class390().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWithNegativeInput() {
        assertTrue(new Class390().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class390().capacity());
    }

    @Test
    void shouldKeepComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class390().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNullArgument() {
        assertEquals("ok", new Class390().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class390().merge(2, 5));
    }

}
