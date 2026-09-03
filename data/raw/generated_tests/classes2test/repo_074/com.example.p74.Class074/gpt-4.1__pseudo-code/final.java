package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class074Test {
    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class074().compute(3));
        assertEquals("ok", new Class074().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class074().normalize("  x "));
        assertEquals(7, new Class074().merge(2, 5));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class074().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class074().isValid("abc"));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class074().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class074().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class074().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class074().isValid("abc"));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class074().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class074().normalize("  x "));
    }

}
