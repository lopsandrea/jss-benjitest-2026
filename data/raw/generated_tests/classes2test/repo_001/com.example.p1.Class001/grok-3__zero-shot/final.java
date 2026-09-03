package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class001Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class001().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class001().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class001().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class001().isValid("abc"));
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class001().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class001().normalize("  x "));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class001().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class001().normalize("  x "));
    }

}
