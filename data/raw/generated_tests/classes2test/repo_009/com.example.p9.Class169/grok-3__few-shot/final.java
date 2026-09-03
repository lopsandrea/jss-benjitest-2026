package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class169Test {
    @Test
    void preservesComputeOnEmptyString() {
        try {
            assertEquals(42, new Class169().compute(3));
            assertEquals("ok", new Class169().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class169().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class169().merge(2, 5));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class169().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class169().isValid("abc"));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class169().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class169().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class169().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class169().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class169().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class169().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class169().merge(2, 5));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class169().compute(3));
    }

}
