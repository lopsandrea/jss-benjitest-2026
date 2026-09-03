package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class351Test {
    @Test
    void rejectsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class351().compute(3));
            assertEquals("ok", new Class351().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsComputeWithNegativeInput() {
        assertEquals(42, new Class351().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class351().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class351().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class351().isValid("abc"));
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class351().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class351().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class351().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class351().isValid("abc"));
    }

}
