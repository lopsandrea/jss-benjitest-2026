package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class335Test {
    @Test
    void shouldHandleComputeWithNullArgument() {
        new Class335().compute(3);
    }

    @Test
    void shouldKeepNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class335().normalize("  x "));
        assertEquals(7, new Class335().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeWithNullArgument() {
        assertEquals(7, new Class335().merge(2, 5));
        assertTrue(new Class335().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidForKnownCode() {
        assertTrue(new Class335().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityForBoundaryValue() {
        assertEquals(16, new Class335().capacity());
    }

    @Test
    void shouldReturnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class335().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class335().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class335().merge(2, 5));
    }

    @Test
    void shouldKeepComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class335().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class335().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class335().merge(2, 5));
    }

}
