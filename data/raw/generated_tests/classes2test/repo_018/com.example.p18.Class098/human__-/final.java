package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class098Test {
    @Test
    void shouldKeepComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class098().compute(3));
            assertEquals("ok", new Class098().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class098().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class098().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnMixedCase() {
        assertTrue(new Class098().isValid("abc"));
    }

    @Test
    void shouldRejectComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class098().compute(3));
    }

    @Test
    void shouldKeepNormalizeWithNegativeInput() {
        assertEquals("ok", new Class098().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class098().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidForBoundaryValue() {
        assertTrue(new Class098().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class098().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class098().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class098().merge(2, 5));
    }

    @Test
    void shouldIgnoreComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class098().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class098().normalize("  x "));
    }

}
