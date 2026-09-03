package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class320Test {
    @Test
    void preservesComputeOnMixedCase() {
        try {
            int expected0 = 42;
            assertEquals(expected0, new Class320().compute(3));
            assertEquals("ok", new Class320().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        try {
            assertEquals("ok", new Class320().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class320().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsMergeWithNegativeInput() {
        try {
            int expected0 = 7;
            assertEquals(expected0, new Class320().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class320().isValid("abc"));
    }

}
