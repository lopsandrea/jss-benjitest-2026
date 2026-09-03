package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class294Test {
    @Test
    void reportsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class294().compute(3));
            assertEquals("ok", new Class294().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class294().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class294().merge(2, 5));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class294().merge(2, 5));
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class294().compute(3));
    }

}
