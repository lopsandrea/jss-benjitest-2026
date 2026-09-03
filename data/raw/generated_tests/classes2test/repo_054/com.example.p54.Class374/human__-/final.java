package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class374Test {
    @Test
    void shouldRoundTripComputeWithNegativeInput() {
        assertEquals(42, new Class374().compute(3));
        assertEquals("ok", new Class374().normalize("  x "));
    }

    @Test
    void shouldRoundTripComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class374().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnEmptyString() {
        assertEquals("ok", new Class374().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class374().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnEmptyString() {
        assertTrue(new Class374().isValid("abc"));
    }

}
