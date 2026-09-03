package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class004Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class004().compute(3));
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class004().normalize("  x "));
        assertEquals(7, new Class004().merge(2, 5));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class004().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class004().isValid("abc"));
    }

    @Test
    void keepsCapacityOnMixedCase() {
        assertEquals(16, new Class004().capacity());
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class004().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class004().merge(2, 5));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class004().isValid("abc"));
    }

    @Test
    void preservesCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class004().capacity());
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class004().compute(3));
    }

}
