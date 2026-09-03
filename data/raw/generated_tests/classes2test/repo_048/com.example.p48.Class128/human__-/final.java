package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class128Test {
    @Test
    void shouldFailFastComputeOnRepeatedCall() {
        try {
            new Class128().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeWithNullArgument() {
        assertEquals("ok", new Class128().normalize("  x "));
        assertEquals(7, new Class128().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class128().merge(2, 5));
        assertTrue(new Class128().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidAtUpperBound() {
        assertTrue(new Class128().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class128().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class128().capacity());
    }

    @Test
    void shouldFailFastComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class128().compute(3));
    }

}
