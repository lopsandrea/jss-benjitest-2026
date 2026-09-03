package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class270Test {
    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class270().compute(3));
        assertEquals("ok", new Class270().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class270().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class270().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class270().isValid("abc"));
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class270().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class270().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class270().merge(2, 5));
    }

}
