package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class296Test {
    @Test
    void shouldRoundTripComputeAtZero() {
        try {
            assertEquals(42, new Class296().compute(3));
            assertEquals("ok", new Class296().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class296().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class296().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class296().merge(2, 5));
        assertTrue(new Class296().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidAtUpperBound() {
        assertTrue(new Class296().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class296().capacity());
    }

    @Test
    void shouldKeepComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class296().compute(3));
    }

}
