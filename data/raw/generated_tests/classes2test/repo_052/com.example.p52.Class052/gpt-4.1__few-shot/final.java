package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class052Test {
    @Test
    void keepsComputeWithNullArgument() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class052().compute(3));
            assertEquals("ok", new Class052().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class052().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class052().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class052().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class052().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class052().capacity());
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class052().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class052().normalize("  x "));
    }

}
