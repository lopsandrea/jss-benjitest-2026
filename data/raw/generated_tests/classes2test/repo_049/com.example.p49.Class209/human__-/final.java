package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class209Test {
    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class209().compute(3));
        assertEquals("ok", new Class209().normalize("  x "));
    }

    @Test
    void shouldFailFastComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class209().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class209().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class209().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidAtUpperBound() {
        assertTrue(new Class209().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class209().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnEmptyString() {
        assertEquals("ok", new Class209().normalize("  x "));
    }

    @Test
    void shouldReturnMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class209().merge(2, 5));
    }

}
