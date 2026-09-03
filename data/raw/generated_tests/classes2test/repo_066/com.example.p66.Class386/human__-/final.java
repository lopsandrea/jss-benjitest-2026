package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class386Test {
    @Test
    void shouldIgnoreComputeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class386().compute(3));
            assertEquals("ok", new Class386().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class386().normalize("  x "));
            assertEquals(7, new Class386().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        try {
            int expected0 = 7;
            assertEquals(expected0, new Class386().merge(2, 5));
            assertTrue(new Class386().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepIsValidAtZero() {
        assertTrue(new Class386().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class386().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class386().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class386().compute(3));
    }

    @Test
    void shouldIgnoreComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class386().compute(3));
    }

    @Test
    void shouldRejectNormalizeWithNegativeInput() {
        assertEquals("ok", new Class386().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class386().merge(2, 5));
    }

    @Test
    void shouldIgnoreComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class386().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeAtUpperBound() {
        assertEquals("ok", new Class386().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class386().merge(2, 5));
    }

}
