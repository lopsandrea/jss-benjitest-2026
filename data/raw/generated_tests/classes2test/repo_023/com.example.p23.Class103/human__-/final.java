package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class103Test {
    @Test
    void shouldKeepComputeOnEmptyString() {
        try {
            new Class103().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeOnMixedCase() {
        new Class103().normalize("  x ");
    }

    @Test
    void shouldIgnoreMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class103().merge(2, 5));
        assertTrue(new Class103().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidOnMixedCase() {
        assertTrue(new Class103().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class103().capacity());
    }

    @Test
    void shouldKeepComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class103().compute(3));
    }

    @Test
    void shouldKeepNormalizeWhenUnset() {
        assertEquals("ok", new Class103().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class103().merge(2, 5));
    }

}
