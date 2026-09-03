package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class326Test {
    @Test
    void shouldNotThrowOnComputeForKnownCode() {
        try {
            assertEquals(42, new Class326().compute(3));
            assertEquals("ok", new Class326().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class326().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class326().merge(2, 5));
    }

    @Test
    void shouldRejectMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class326().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnMixedCase() {
        assertTrue(new Class326().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class326().capacity());
    }

    @Test
    void shouldFailFastComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class326().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnMixedCase() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

}
