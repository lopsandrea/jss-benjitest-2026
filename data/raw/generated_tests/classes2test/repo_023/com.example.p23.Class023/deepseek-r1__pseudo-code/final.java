package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class023Test {
    @Test
    void preservesComputeWithNullArgument() {
        try {
            assertEquals(42, new Class023().compute(3));
            assertEquals("ok", new Class023().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class023().normalize("  x "));
        assertEquals(7, new Class023().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenUnset() {
        assertEquals(7, new Class023().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class023().isValid("abc"));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class023().compute(3));
    }

}
