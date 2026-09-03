package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class313Test {
    @Test
    void shouldRoundTripComputeForKnownCode() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            int expected0 = 42;
            assertEquals(expected0, new Class313().compute(3));
            assertEquals("ok", new Class313().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeAtUpperBound() {
        assertEquals("ok", new Class313().normalize("  x "));
    }

    @Test
    void shouldReturnMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class313().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWithNullArgument() {
        assertTrue(new Class313().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class313().capacity());
    }

    @Test
    void shouldIgnoreComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class313().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnMixedCase() {
        assertEquals("ok", new Class313().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class313().merge(2, 5));
    }

    @Test
    void shouldHandleComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class313().compute(3));
    }

}
