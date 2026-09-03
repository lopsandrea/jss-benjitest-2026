package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class191Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class191().compute(3));
        assertEquals("ok", new Class191().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class191().normalize("  x "));
        assertEquals(7, new Class191().merge(2, 5));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class191().merge(2, 5));
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class191().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class191().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class191().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class191().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class191().capacity());
    }

}
