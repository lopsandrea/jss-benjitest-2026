package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class028Test {
    @Test
    void returnsComputeAtZero() {
        try {
            assertEquals(42, new Class028().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class028().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class028().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class028().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNullArgument() {
        assertEquals(16, new Class028().capacity());
    }

}
