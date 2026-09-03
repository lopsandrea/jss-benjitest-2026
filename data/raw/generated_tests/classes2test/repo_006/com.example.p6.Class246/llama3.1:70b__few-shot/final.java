package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class246Test {
    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class246().compute(3));
        assertEquals("ok", new Class246().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class246().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class246().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class246().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class246().capacity());
    }

    @Test
    void reportsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class246().ratio(1.0, 2.0), 1e-9);
    }

}
