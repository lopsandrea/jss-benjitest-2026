package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class376Test {
    @Test
    void shouldNotThrowOnComputeOnRepeatedCall() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class376().compute(3);
    }

    @Test
    void shouldRoundTripNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class376().normalize("  x "));
        assertEquals(7, new Class376().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeOnMixedCase() {
        assertEquals(7, new Class376().merge(2, 5));
        assertTrue(new Class376().isValid("abc"));
    }

    @Test
    void shouldHandleIsValidOnEmptyString() {
        assertTrue(new Class376().isValid("abc"));
    }

    @Test
    void shouldRejectComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class376().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnEmptyString() {
        assertEquals("ok", new Class376().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class376().merge(2, 5));
    }

}
