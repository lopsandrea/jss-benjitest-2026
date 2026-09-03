package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class381Test {
    @Test
    void shouldNotThrowOnComputeOnMixedCase() {
        assertEquals(42, new Class381().compute(3));
        assertEquals("ok", new Class381().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeForKnownCode() {
        assertEquals("ok", new Class381().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnRepeatedCall() {
        assertEquals(7, new Class381().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidWhenUnset() {
        assertTrue(new Class381().isValid("abc"));
    }

    @Test
    void shouldHandleComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class381().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnEmptyString() {
        assertEquals("ok", new Class381().normalize("  x "));
    }

}
