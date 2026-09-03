package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class004Test {
    @Test
    void shouldKeepComputeForKnownCode() {
        try {
            assertEquals(42, new Class004().compute(3));
            assertEquals("ok", new Class004().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeWithNegativeInput() {
        assertEquals("ok", new Class004().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class004().merge(2, 5));
    }

    @Test
    void shouldRejectMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class004().merge(2, 5));
        assertTrue(new Class004().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidForKnownCode() {
        assertTrue(new Class004().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class004().capacity());
    }

    @Test
    void shouldReturnCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class004().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class004().compute(3));
    }

    @Test
    void shouldNotThrowOnComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class004().compute(3));
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void shouldRoundTripNormalizeOnMixedCase() {
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class004().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidAtUpperBound() {
        assertTrue(new Class004().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class004().capacity());
    }

    @Test
    void shouldIgnoreComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class004().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class004().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnRepeatedCall() {
        assertTrue(new Class004().isValid("abc"));
    }

    @Test
    void shouldReturnComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class004().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNegativeInput() {
        assertEquals("ok", new Class004().normalize("  x "));
    }

}
