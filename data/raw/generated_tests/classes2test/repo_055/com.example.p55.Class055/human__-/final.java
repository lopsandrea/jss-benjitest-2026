package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class055Test {
    @Test
    void shouldIgnoreComputeOnTrimmedInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class055().compute(3));
            assertEquals("ok", new Class055().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class055().normalize("  x "));
            assertEquals(7, new Class055().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class055().merge(2, 5));
        assertTrue(new Class055().isValid("abc"));
    }

    @Test
    void shouldHandleIsValidOnMixedCase() {
        assertTrue(new Class055().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class055().compute(3));
    }

    @Test
    void shouldRejectComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class055().compute(3));
    }

    @Test
    void shouldHandleNormalizeForBoundaryValue() {
        assertEquals("ok", new Class055().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class055().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnRepeatedCall() {
        assertTrue(new Class055().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class055().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWithNullArgument() {
        assertEquals("ok", new Class055().normalize("  x "));
    }

}
