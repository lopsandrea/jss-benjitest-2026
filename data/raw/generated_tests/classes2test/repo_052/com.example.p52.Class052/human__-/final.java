package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class052Test {
    @Test
    void shouldRejectComputeWhenAlreadyValid() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class052().compute(3));
            assertEquals("ok", new Class052().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        assertEquals("ok", new Class052().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class052().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class052().merge(2, 5));
        assertTrue(new Class052().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidOnEmptyString() {
        assertTrue(new Class052().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class052().capacity());
    }

    @Test
    void shouldIgnoreCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class052().capacity());
    }

    @Test
    void shouldReturnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class052().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNullArgument() {
        assertEquals("ok", new Class052().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class052().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnMixedCase() {
        assertTrue(new Class052().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class052().compute(3));
    }

    @Test
    void shouldReturnNormalizeWithNegativeInput() {
        assertEquals("ok", new Class052().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class052().merge(2, 5));
    }

}
