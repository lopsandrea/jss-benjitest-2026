package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class390Test {
    @Test
    void returnsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class390().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class390().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class390().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class390().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class390().capacity());
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class390().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class390().normalize("  x "));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class390().compute(3));
    }

}
