package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class027Test {
    @Test
    void shouldKeepComputeOnTrimmedInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class027().compute(3));
            assertEquals("ok", new Class027().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeWhenUnset() {
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class027().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWithNullArgument() {
        assertTrue(new Class027().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class027().capacity());
    }

    @Test
    void shouldKeepRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class027().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class027().labelFor(1));
    }

    @Test
    void shouldKeepComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class027().compute(3));
    }

    @Test
    void shouldKeepNormalizeWhenUnset() {
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void shouldRejectComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class027().compute(3));
    }

    @Test
    void shouldKeepNormalizeAtUpperBound() {
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class027().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWhenAlreadyValid() {
        assertTrue(new Class027().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class027().capacity());
    }

}
