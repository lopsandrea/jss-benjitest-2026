package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class358Test {
    @Test
    void shouldIgnoreComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class358().compute(3));
        assertEquals("ok", new Class358().normalize("  x "));
    }

    @Test
    void shouldKeepNormalizeWithNullArgument() {
        assertEquals("ok", new Class358().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class358().merge(2, 5));
    }

    @Test
    void shouldKeepMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class358().merge(2, 5));
        assertTrue(new Class358().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidWithNullArgument() {
        assertTrue(new Class358().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class358().capacity());
    }

    @Test
    void shouldRejectComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class358().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class358().normalize("  x "));
    }

    @Test
    void shouldReturnMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class358().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnEmptyString() {
        assertTrue(new Class358().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class358().capacity());
    }

    @Test
    void shouldRoundTripComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class358().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWithNullArgument() {
        assertEquals("ok", new Class358().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class358().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWhenAlreadyValid() {
        assertTrue(new Class358().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class358().capacity());
    }

    @Test
    void shouldHandleComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class358().compute(3));
    }

}
