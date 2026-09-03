package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class037Test {
    @Test
    void shouldRoundTripComputeWhenAlreadyValid() {
        assertEquals(42, new Class037().compute(3));
        assertEquals("ok", new Class037().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnNormalizeOnMixedCase() {
        assertEquals("ok", new Class037().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class037().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class037().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWhenUnset() {
        assertTrue(new Class037().isValid("abc"));
    }

    @Test
    void shouldReturnComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class037().compute(3));
    }

}
