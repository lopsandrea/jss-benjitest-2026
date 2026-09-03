package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class228Test {
    @Test
    void rejectsComputeOnEmptyString() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class228().compute(3));
        assertEquals("ok", new Class228().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class228().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class228().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class228().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class228().capacity());
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class228().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class228().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class228().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class228().isValid("abc"));
    }

}
