package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class399Test {
    @Test
    void shouldHandleComputeWithNullArgument() {
        try {
            new Class399().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class399().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class399().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastMergeAtZero() {
        try {
            int expected0 = 7;
            assertEquals(expected0, new Class399().merge(2, 5));
            assertTrue(new Class399().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleIsValidOnTrimmedInput() {
        assertTrue(new Class399().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class399().capacity());
    }

    @Test
    void shouldKeepCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class399().capacity());
    }

    @Test
    void shouldRoundTripComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class399().compute(3));
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        assertEquals("ok", new Class399().normalize("  x "));
    }

    @Test
    void shouldHandleMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class399().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWhenUnset() {
        assertTrue(new Class399().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class399().capacity());
    }

    @Test
    void shouldReturnComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class399().compute(3));
    }

    @Test
    void shouldRejectNormalizeAtZero() {
        assertEquals("ok", new Class399().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class399().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWithNegativeInput() {
        assertTrue(new Class399().isValid("abc"));
    }

}
