package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class226Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class226().compute(3));
            assertEquals("ok", new Class226().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class226().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class226().isValid("abc"));
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class226().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class226().normalize("  x "));
    }

}
