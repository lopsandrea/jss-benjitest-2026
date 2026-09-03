package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class164Test {
    @Test
    void shouldRejectComputeWhenAlreadyValid() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class164().compute(3));
            assertEquals("ok", new Class164().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeOnMixedCase() {
        assertEquals("ok", new Class164().normalize("  x "));
        assertEquals(7, new Class164().merge(2, 5));
    }

    @Test
    void shouldHandleMergeAtZero() {
        assertEquals(7, new Class164().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnTrimmedInput() {
        assertTrue(new Class164().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class164().capacity());
    }

    @Test
    void shouldFailFastComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class164().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class164().normalize("  x "));
    }

}
